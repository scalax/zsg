package net.scalax.asuna.sangria

import net.scalax.asuna.core._
import net.scalax.asuna.shape.ShapeHelper
import net.scalax.asuna.slick.umr.{ SlickShapeValueListWrap, SlickShapeValueWrap }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import shapeless._
import tag._

import scala.reflect.ClassTag

trait SlickSangria[E, Data] extends ShapeHelper {

  val sangriaUnwrap: DataShapeValueInitWrap[SlickRepAbsAbs[E]] = DataShapeValue.toShapeValue[SlickRepAbsAbs[E]]

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: E => R)(implicit shape: Shape[L, R, D, T]): SlickRepWrap[E, D] = {
    val w = new SlickRepWrap[E, D] {
      override def slickCv(rep: E): SlickShapeValueWrap[D] = {
        val rep1 = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
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
    w
  }

  def repWithKey[R, D, T, L <: FlatShapeLevel](baseRep: E => R, key: String)(implicit shape: Shape[L, R, D, T], completedId: CompletedId[String]): SlickSangriaRepWrap[E, D] = {
    new SlickSangriaRepWrap[E, D] {
      override val sangraiKey = key
      override val objectKey = completedId.id
      override def slickCv(rep: E): SlickShapeValueWrap[(String, D)] = {
        val rep1 = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
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
                override type Level = FlatShapeLevel
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
          DataRepGroup(reps = start :: base ::: end :: List.empty)
        }
        override def takeData(oldData: DataGroup, rep: List[SlickSangriaRepWrapAbs[E]]): Either[NotConvert, SplitData[List[(String, Any)]]] = {
          oldData.items match {
            case scala.::(GroupStart(startKey), tail) =>
              val (currData, scala.::(endGroup, leftData)) = tail.span(t => t match {
                case GroupEnd(endKey) if (endKey == startKey) =>
                  false
                case _ =>
                  true
              })
              Right(SplitData(current = currData.map(_.asInstanceOf[(String, Any)]), left = DataGroup(items = leftData)))
          }
        }
        /*override def buildData(splitData: List[(String, Any)], rep: List[SlickSangriaRepWrapAbs[E]]): Either[NotConvert, DataGroup] = {
          Right(DataGroup(items = GroupStart(completedId.id) :: splitData ::: GroupEnd(completedId.id) :: List.empty))
        }*/
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
    dShapeValue.map(listCv)
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
        sv.shape.takeData(DataGroup(items = t), sv.rep).right.get.current
      },
      reConvert = { (_: Data) => Option.empty[List[Any]] },
      ct = implicitly[ClassTag[Data]],
      v = slickReps: _*).shapedValue
  }

}