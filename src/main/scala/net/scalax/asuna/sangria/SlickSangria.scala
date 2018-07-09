package net.scalax.asuna.sangria

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.slick.umr.{ SlickShapeValueListWrap, SlickShapeValueWrap }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

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

  trait InnerWithTable[Out, Data] extends SlickSangriaHelper.WithTable[E, Data] with AbsWrapper[Out, Data]

  object sangria extends AllHelper[SlickRepAbs[E]] with WrapperHelper[SlickRepAbs[E], InnerWithTable] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DataShape[Rep, D, Out, SlickRepAbs[E]]): InnerWithTable[Out, D] = {
      val func = { (table: E, names: List[String], ct: ClassTag[D]) =>
        implicit val ct1 = ct

        val wrapRep = shape.wrapRep(rep)
        val reps = shape.toLawRep(wrapRep).reps
        val filterReps = reps.filter { _.sangraiKey.map(k => names.contains(k)).getOrElse(true) }
        val slickReps = filterReps.map(t => t.slickCv(table).map(s => s: Any))

        SlickShapeValueListWrap(slickReps)((t: List[Any]) => shape.takeData(DataGroup(items = t), wrapRep).current).shapedValue
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
        val rep1 = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
          override val shape = shape1
          override val dataToList = { (data: D) => data }
          override val rep = baseRep(rep1)
        }
      }
    }
    w
  }

  def repWithKey[R, D, T, L <: FlatShapeLevel](baseRep: E => R, key: String)(implicit shape: Shape[L, R, D, T], completedId: CompletedId[String]): SlickSangriaRepWrap[E, D] = {
    new SlickSangriaRepWrap[E, D] {
      override val objectKey = completedId.id
      override val sangraiKey = Option(key)
      override def slickCv(rep: E): SlickShapeValueWrap[(String, D)] = {
        val rep1 = rep
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
          override val shape = shape1
          override val dataToList = { (data: D) => data }
          override val rep = baseRep(rep1)
        }.map(s => (completedId.id, s))
      }
    }
  }

  case class GroupStart(key: String)
  case class GroupEnd(key: String)

  def seqRep(w: SlickSangriaRepWrap[E, _]*)(implicit completedId: CompletedId[String]): DataShapeValue[SlickValueGen[E], SlickRepAbs[E]] = {

    val dShape: DataShape[List[SlickSangriaRepWrap[E, Any]], List[(String, Any)], List[SlickSangriaRepWrap[E, Any]], SlickRepAbs[E]] = {

      new DataShape[List[SlickSangriaRepWrap[E, Any]], List[(String, Any)], List[SlickSangriaRepWrap[E, Any]], SlickRepAbs[E]] {

        override def wrapRep(base: List[SlickSangriaRepWrap[E, Any]]): List[SlickSangriaRepWrap[E, Any]] = base

        override def toLawRep(base: List[SlickSangriaRepWrap[E, Any]]): DataRepGroup[SlickRepAbs[E]] = {
          val unitWrap = new SlickRepWrap[E, Unit] {
            override val sangraiKey = Option.empty
            override def slickCv(rep: E): SlickShapeValueWrap[Unit] = {
              new SlickShapeValueWrap[Unit] {
                override type TargetRep = Unit
                override type Data = Unit
                override type Rep = Unit
                override type Level = FlatShapeLevel
                override val shape = implicitly[Shape[FlatShapeLevel, Unit, Unit, Unit]]
                override val dataToList = { (data: Unit) => data }
                override val rep = (())
              }
            }
          }
          val start: SlickRepWrap[E, Any] = unitWrap.map((_: Unit) => GroupStart(completedId.id): Any)
          val end: SlickRepWrap[E, Any] = unitWrap.map((_: Unit) => GroupEnd(completedId.id): Any)
          DataRepGroup(reps = start :: base ::: end :: List.empty)
        }

        override def takeData(oldData: DataGroup, rep: List[SlickSangriaRepWrap[E, Any]]): SplitData[List[(String, Any)]] = {
          val GroupStart(startKey) :: tail = oldData.items
          val (currData, GroupEnd(_) :: leftData) = tail.span(t => t match {
            case GroupEnd(endKey) if (endKey == startKey) =>
              false
            case _ =>
              true
          })
          SplitData(current = currData.map(_.asInstanceOf[(String, Any)]), left = DataGroup(items = leftData))
        }

      }

    }

    val dShapeValue = sangria.shaped(w.toList.map(_.valueMap { a => a: Any }))(dShape)

    val listCv: List[(String, Any)] => SlickValueGen[E] = { s =>
      val map = s.toMap
      val svg = new SlickValueGen[E] {
        override def getData[DataType](r: SlickSangriaRepWrap[E, DataType]): DataType = {
          map.getOrElse(r.objectKey, throw new Exception("没有该列匹配的项")).asInstanceOf[DataType]
        }
      }
      svg
    }

    dShapeValue.map(listCv)

  }

}