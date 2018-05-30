package net.scalax.asuna.sangria

import net.scalax.asuna.core._
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.umr.{ SlickShapeValueListWrap, SlickShapeValueWrap }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import scala.reflect.ClassTag

trait SlickSangria[E, Data] extends ShapeHelper {

  val sangriaUnwrap: DataShapeValueInitWrap[SlickRepAbsAbs[E]] = DataShapeValue.toShapeValue[SlickRepAbsAbs[E]]

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

  def seqRep(w: SlickSangriaRepWrapAbs[E]*)(implicit completedId: CompletedId[String]): DataShapeValue[SlickValueGen[E], SlickRepAbsAbs[E]] = {
    implicit val dShape: DataShape[List[SlickSangriaRepWrapAbs[E]], List[(String, Any)], List[SlickSangriaRepWrapAbs[E]], SlickRepAbsAbs[E]] = {
      new DataShape[List[SlickSangriaRepWrapAbs[E]], List[(String, Any)], List[SlickSangriaRepWrapAbs[E]], SlickRepAbsAbs[E]] {
        override def wrapRep(base: List[SlickSangriaRepWrapAbs[E]]): List[SlickSangriaRepWrapAbs[E]] = base
        override def toLawRep(base: List[SlickSangriaRepWrapAbs[E]]): DataRepGroup[SlickRepAbsAbs[E]] = {
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
          DataRepGroup(reps = start :: base ::: end :: List.empty, subs = List.empty)
        }
        override def takeData(oldData: DataGroup, rep: List[SlickSangriaRepWrapAbs[E]]): Either[NotConvert, SplitData[List[(String, Any)]]] = {
          oldData.items match {
            case GroupStart(startKey) :: tail =>
              val (currData, endGroup :: leftData) = tail.span(t => t match {
                case GroupEnd(endKey) if (endKey == startKey) =>
                  false
                case _ =>
                  true
              })
              Right(SplitData(current = currData.map(_.asInstanceOf[(String, Any)]), left = DataGroup(items = leftData, subs = List.empty)))
          }
        }
        override def buildData(splitData: List[(String, Any)], rep: List[SlickSangriaRepWrapAbs[E]]): Either[NotConvert, DataGroup] = {
          Right(DataGroup(items = GroupStart(completedId.id) :: splitData ::: GroupEnd(completedId.id) :: List.empty, subs = List.empty))
        }
      }
    }

    val dShapeValue = w.toList.shaped

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

  implicit def slickRepWrapShapeImplicit[T]: DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepAbsAbs[E]] = {
    new DataShape[SlickRepWrap[E, T], T, SlickRepWrap[E, T], SlickRepAbsAbs[E]] {
      self =>
      override def wrapRep(base: SlickRepWrap[E, T]): SlickRepWrap[E, T] = base

      override def toLawRep(base: SlickRepWrap[E, T]): DataRepGroup[SlickRepAbsAbs[E]] = {
        DataRepGroup(reps = List(base), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: SlickRepWrap[E, T]): Either[NotConvert, SplitData[T]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[T], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: T, rep: SlickRepWrap[E, T]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

  def sangriaSv: DataShapeValue[Data, SlickRepAbsAbs[E]]

  def bindQuery(rep: E, keys: List[String])(implicit ct: ClassTag[Data]): ShapedValue[Any, Data] = {
    val sv = sangriaSv
    val reps = sv.shape.toLawRep(sv.rep).reps
    val filterReps = reps.filter {
      case v: SlickSangriaRepWrapAbs[E] if !keys.contains(v.sangraiKey) => false
      case _ => true
    }
    val slickReps = filterReps.map(t => t.slickCv(rep).map(s => s: Any))

    SlickShapeValueListWrap(
      convert = { (t: List[Any]) =>
        sv.shape.takeData(DataGroup(items = t, subs = List.empty), sv.rep).right.get.current
      },
      reConvert = { (_: Data) => Option.empty[List[Any]] },
      ct = implicitly[ClassTag[Data]],
      v = slickReps: _*)
  }

}