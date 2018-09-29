package net.scalax.asuna.sangria

import net.scalax.asuna.core.decoder._
import net.scalax.asuna.mapper.decoder.{DecoderContent, DecoderHelper, DecoderWrapperHelper}
import net.scalax.asuna.slick.umr.{SlickShapeValueListWrap, SlickShapeValueWrap}
import slick.lifted.{FlatShapeLevel, Shape, ShapedValue}

import scala.reflect.ClassTag

object SlickSangriaHelper {
  trait WithTable[Table, Data] {
    def inputTable(table: Table): NameFilterApply[Data]
  }
  trait NameFilterApply[Data] {
    def filterNames(names: List[String])(implicit ct: ClassTag[Data]): ShapedValue[Any, Data]
  }
}

trait SlickSangriaHelper[E] {

  trait InnerWithTable[Out, Data] extends SlickSangriaHelper.WithTable[E, Data] with DecoderContent[Out, Data]

  object sangria extends DecoderHelper[List[SlickRepAbs[E]], List[Any]] with DecoderWrapperHelper[List[SlickRepAbs[E]], List[Any], InnerWithTable] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, List[SlickRepAbs[E]], List[Any]]): InnerWithTable[Out, D] = {
      val func = { (table: E, names: List[String], ct: ClassTag[D]) =>
        implicit val ct1 = ct

        val wrapRep    = shape.wrapRep(rep)
        val reps       = shape.toLawRep(wrapRep, List.empty)
        val filterReps = reps.filter { _.sangraiKey.map(k => names.contains(k)).getOrElse(true) }
        val slickReps  = filterReps.map(t => t.slickCv(table).map(s => s: Any))

        SlickShapeValueListWrap(slickReps)((t: List[Any]) => shape.takeData(wrapRep, t).current).shapedValue
      }

      new InnerWithTable[Out, D] {
        override def inputTable(table: E): SlickSangriaHelper.NameFilterApply[D] = new SlickSangriaHelper.NameFilterApply[D] {
          override def filterNames(names: List[String])(implicit ct: ClassTag[D]): ShapedValue[Any, D] = {
            func(table, names, ct)
          }
        }
      }
    }
  }

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: E => R)(implicit shape: Shape[L, R, D, T]): SlickRepWrap[E, D] = {
    val w = new SlickRepWrap[E, D] {
      override val sangraiKey = Option.empty
      override def slickCv(rep: E): SlickShapeValueWrap[D] = {
        val rep1   = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data      = D
          override type Rep       = R
          override type Level     = L
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val rep = baseRep(rep1)
        }
      }
    }
    w
  }

  implicit def slickSangriaImplicit[E, D]: DecoderShape.Aux[SlickRepWrap[E, D], D, SlickRepWrap[E, D], List[SlickRepAbs[E]], List[Any]] = {
    new DecoderShape[SlickRepWrap[E, D], List[SlickRepAbs[E]], List[Any]] {
      override type Target = SlickRepWrap[E, D]
      override type Data   = D
      override def wrapRep(base: SlickRepWrap[E, D]): SlickRepWrap[E, D]                                  = base
      override def toLawRep(base: SlickRepWrap[E, D], oldRep: List[SlickRepAbs[E]]): List[SlickRepAbs[E]] = base :: oldRep
      override def takeData(rep: SlickRepWrap[E, D], oldData: List[Any]): SplitData[D, List[Any]] =
        SplitData(current = oldData.head.asInstanceOf[D], left = oldData.tail)
    }
  }

  def repWithKey[R, D, T, L <: FlatShapeLevel](
      baseRep: E => R
    , key: String
  )(implicit shape: Shape[L, R, D, T], completedId: CompletedId[String]): SlickSangriaRepWrap[E, D] = {
    new SlickSangriaRepWrap[E, D] {
      override val objectKey  = completedId.id
      override val sangraiKey = Option(key)
      override def slickCv(rep: E): SlickShapeValueWrap[(String, D)] = {
        val rep1   = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data      = D
          override type Rep       = R
          override type Level     = L
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val rep = baseRep(rep1)
        }.map(s => (completedId.id, s))
      }
    }
  }

  case class GroupStart(key: String)
  case class GroupEnd(key: String)

  def seqRep(w: SlickSangriaRepWrap[E, _]*)(implicit completedId: CompletedId[String]): DecoderShapeValue[SlickValueGen[E], List[SlickRepAbs[E]], List[Any]] = {

    val dShape: DecoderShape.Aux[List[SlickSangriaRepWrap[E, Any]], List[(String, Any)], List[SlickSangriaRepWrap[E, Any]], List[SlickRepAbs[E]], List[Any]] = {

      new DecoderShape[List[SlickSangriaRepWrap[E, Any]], List[SlickRepAbs[E]], List[Any]] {
        override type Target = List[SlickSangriaRepWrap[E, Any]]
        override type Data   = List[(String, Any)]
        override def wrapRep(base: List[SlickSangriaRepWrap[E, Any]]): List[SlickSangriaRepWrap[E, Any]] = base

        override def toLawRep(base: List[SlickSangriaRepWrap[E, Any]], oldRep: List[SlickRepAbs[E]]): List[SlickRepAbs[E]] = {
          val unitWrap = new SlickRepWrap[E, Unit] {
            override val sangraiKey = Option.empty
            override def slickCv(rep: E): SlickShapeValueWrap[Unit] = {
              new SlickShapeValueWrap[Unit] {
                override type TargetRep = Unit
                override type Data      = Unit
                override type Rep       = Unit
                override type Level     = FlatShapeLevel
                override val shape = implicitly[Shape[FlatShapeLevel, Unit, Unit, Unit]]
                override val dataToList = { (data: Unit) =>
                  data
                }
                override val rep = (())
              }
            }
          }
          val start: SlickRepWrap[E, Any] = unitWrap.map((_: Unit) => GroupStart(completedId.id): Any)
          val end: SlickRepWrap[E, Any]   = unitWrap.map((_: Unit) => GroupEnd(completedId.id): Any)
          start :: base ::: end :: oldRep
        }

        override def takeData(rep: List[SlickSangriaRepWrap[E, Any]], oldData: List[Any]): SplitData[List[(String, Any)], List[Any]] = {
          val GroupStart(startKey) :: tail = oldData
          val (currData, GroupEnd(_) :: leftData) = tail.span(
              t =>
              t match {
                case GroupEnd(endKey) if (endKey == startKey) =>
                  false
                case _ =>
                  true
              }
          )
          SplitData(current = currData.map(_.asInstanceOf[(String, Any)]), left = leftData)
        }

      }

    }

    val dShapeValue = sangria.shaped(w.toList.map(_.valueMap { a =>
      a: Any
    }))(dShape)

    val listCv: List[(String, Any)] => SlickValueGen[E] = { s =>
      val map = s.toMap
      val svg = new SlickValueGen[E] {
        override def getData[DataType](r: SlickSangriaRepWrap[E, DataType]): DataType = {
          map.getOrElse(r.objectKey, throw new Exception("没有该列匹配的项")).asInstanceOf[DataType]
        }
      }
      svg
    }

    dShapeValue.dmap(listCv)

  }

}
