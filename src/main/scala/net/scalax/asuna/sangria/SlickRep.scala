package net.scalax.asuna.sangria

import net.scalax.asuna.core._
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.umr.{ SlickShapeValueListWrap, SlickShapeValueWrap }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import scala.reflect.ClassTag
import scala.language.higherKinds

sealed abstract trait SlickRepAbs[Rep, DataType] {
  self =>

  def slickCv(rep: Rep): SlickShapeValueWrap[DataType]

}

trait SlickRepWrap[Rep, DataType] extends SlickRepAbs[Rep, DataType] {
  self =>

  def map[R](cv: DataType => R): SlickRepWrap[Rep, R] = {
    new SlickRepWrap[Rep, R] {
      override def slickCv(rep: Rep): SlickShapeValueWrap[R] = {
        self.slickCv(rep).map(cv)
      }
    }
  }

}

trait SlickSangriaRepWrap[Rep, DataType] extends SlickRepAbs[Rep, (String, DataType)] {
  self =>

  val sangraiKey: String
  val objectKey: String

  def map[R](cv: DataType => R): SlickSangriaRepWrap[Rep, R] = {
    new SlickSangriaRepWrap[Rep, R] {
      override val sangraiKey = self.sangraiKey
      override val objectKey = self.objectKey
      override def slickCv(rep: Rep): SlickShapeValueWrap[(String, R)] = {
        self.slickCv(rep).map(t => (t._1, cv(t._2)))
      }
    }
  }
}

trait SlickValueGen[Rep] {
  def getData[DataType](r: SlickSangriaRepWrap[Rep, DataType]): DataType
}

trait SlickSangria[E, Data] extends ShapeHelper {

  val sangriaUnwrap: DataShapeValueInitWrap[SlickRepAbs[E, Any]] = DataShapeValue.toShapeValue[SlickRepAbs[E, Any]]

  def rep[R, D, T](baseRep: E => R)(implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): SlickRepWrap[E, D] = {
    new SlickRepWrap[E, D] {
      override def slickCv(rep: E): SlickShapeValueWrap[D] = {
        val rep1 = rep
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val dataFromList = { (data: D) =>
            Option(data)
          }
          override val rep = baseRep(rep1)
        }
      }
    }
  }

  def repWithKey[R, D, T](baseRep: E => R, key: String)(implicit shape: Shape[_ <: FlatShapeLevel, R, D, T], completedId: CompletedId[String]): SlickSangriaRepWrap[E, D] = {
    new SlickSangriaRepWrap[E, D] {
      override val sangraiKey = key
      override val objectKey = completedId.id
      override def slickCv(rep: E): SlickShapeValueWrap[(String, D)] = {
        val rep1 = rep
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val dataFromList = { (data: D) =>
            Option(data)
          }
          override val rep = baseRep(rep1)
        }.map(s => (completedId.id, s))
      }
    }
  }

  case class GroupStart(key: String)
  case class GroupEnd(key: String)

  def seqRep(w: SlickSangriaRepWrap[E, _]*)(implicit completedId: CompletedId[String]): DataShapeValue[SlickValueGen[E], SlickRepAbs[E, Any]] = {
    implicit val dShape: DataShape[List[SlickSangriaRepWrap[E, Any]], List[(String, Any)], List[SlickSangriaRepWrap[E, Any]], SlickRepAbs[E, Any]] = {
      new DataShape[List[SlickSangriaRepWrap[E, Any]], List[(String, Any)], List[SlickSangriaRepWrap[E, Any]], SlickRepAbs[E, Any]] {
        override def wrapRep(base: List[SlickSangriaRepWrap[E, Any]]): List[SlickSangriaRepWrap[E, Any]] = base
        override def toLawRep(base: List[SlickSangriaRepWrap[E, Any]]): DataRepGroup[SlickRepAbs[E, Any]] = {
          val unitWrap = new SlickRepWrap[E, Unit] {
            override def slickCv(rep: E): SlickShapeValueWrap[Unit] = {
              new SlickShapeValueWrap[Unit] {
                override type TargetRep = Unit
                override type Data = Unit
                override type Rep = Unit
                override val shape = implicitly[Shape[FlatShapeLevel, Unit, Unit, Unit]]
                override val dataToList = { (data: Unit) =>
                  data
                }
                override val dataFromList = { (data: Unit) =>
                  Option(data)
                }
                override val rep = (())
              }
            }
          }
          val start: SlickRepAbs[E, Any] = unitWrap.map((_: Unit) => GroupStart(completedId.id): Any)
          val end: SlickRepAbs[E, Any] = unitWrap.map((_: Unit) => GroupEnd(completedId.id): Any)
          DataRepGroup(reps = start :: base.map(_.asInstanceOf[SlickRepAbs[E, Any]]) ::: end :: List.empty, subs = List.empty)
        }
        override def takeData(oldData: DataGroup, rep: List[SlickSangriaRepWrap[E, Any]]): Either[NotConvert, SplitData[List[(String, Any)]]] = {
          oldData.items match {
            case GroupStart(startKey) :: tail =>
              val (currData, leftData) = tail.span(t => t match {
                case GroupEnd(endKey) if (endKey == startKey) =>
                  false
                case _ =>
                  true
              })
              Right(SplitData(current = currData.map(_.asInstanceOf[(String, Any)]), left = DataGroup(items = leftData, subs = List.empty)))
          }
        }
        override def buildData(splitData: List[(String, Any)], rep: List[SlickSangriaRepWrap[E, Any]]): Either[NotConvert, DataGroup] = {
          Right(DataGroup(items = splitData, subs = List.empty))
        }
      }
    }

    val dShapeValue = w.toList.map(_.map(t => t: Any)).shaped

    val listCv: List[(String, Any)] => SlickValueGen[E] = { s =>
      val map = s.toMap
      new SlickValueGen[E] {
        override def getData[DataType](r: SlickSangriaRepWrap[E, DataType]): DataType = {
          map.getOrElse(r.objectKey, throw new Exception("没有该列匹配的项")).asInstanceOf[DataType]
        }
      }
    }
    dShapeValue.mapReader(listCv)
  }

  implicit def slickRepWrapShapeImplicit[T]: DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepAbs[E, Any]] = {
    new DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepAbs[E, Any]] {
      self =>
      override def wrapRep(base: SlickRepWrap[E, T]): SlickRepWrap[E, T] = base

      override def toLawRep(base: SlickRepWrap[E, T]): DataRepGroup[SlickRepAbs[E, Any]] = {
        DataRepGroup(reps = List(base.map(s => s: Any)), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: SlickRepWrap[E, T]): Either[NotConvert, SplitData[T]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[T], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: T, rep: SlickRepWrap[E, T]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

  def sangriaSv: DataShapeValue[Data, SlickRepAbs[E, Any]]

  def bindQuery(rep: E, keys: List[String])(implicit ct: ClassTag[Data]): ShapedValue[Any, Data] = {
    val sv = sangriaSv
    val reps = sv.shape.toLawRep(sv.rep).reps
    val filterReps = reps.filter { s =>
      if (s.isInstanceOf[SlickSangriaRepWrap[_, _]] && !keys.contains(s.asInstanceOf[SlickSangriaRepWrap[_, _]].sangraiKey)) {
        false
      } else {
        true
      }
    }
    val slickReps = filterReps.map(t => t.slickCv(rep))
    SlickShapeValueListWrap.apply(convert = { (t: List[Any]) =>
      sv.shape.takeData(DataGroup(items = t, subs = List.empty), sv.rep).right.get.current
    }, reConvert = { (t: Data) => Option.empty[List[Any]] }, ct = implicitly[ClassTag[Data]], slickReps: _*)
  }

}