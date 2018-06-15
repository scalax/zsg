package net.scalax.asuna.slick.umr

import net.scalax.asuna.core.DelayTag.DelayTagGen
import net.scalax.asuna.core._
import slick.lifted.ShapedValue

import scala.language.higherKinds
import scala.reflect.ClassTag

trait UmrReaderQuery[U] {
  self =>

  def umrSv: DataShapeValue[U, SlickShapeValueWrapAbs]
  val umrDelay: DelayTagGen[SlickShapeValueWrapAbs] = DelayTag.createDelayTagGeneration[SlickShapeValueWrapAbs]

}

object UmrReaderQuery {

  def apply[E, U, R, C[_]](cv: UmrReaderQuery[R])(implicit profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val impl = implicitly[DataShape[DataShapeValue[R, SlickShapeValueWrapAbs], R, DataShapeValue[R, SlickShapeValueWrapAbs], SlickShapeValueWrapAbs]]
    val reps = impl.toLawRep(impl.wrapRep(cv.umrSv)).reps
    val convertedWrap = reps.map(each =>
      new SlickShapeValueWrap[Any] {
        override type Data = each.Data
        override type Rep = each.Rep
        override type TargetRep = each.TargetRep
        override type Level = each.Level
        override val rep = each.rep
        override val shape = each.shape
        override val dataToList: each.Data => Any = { d: each.Data =>
          each.dataToList(d): Any
        }
        override val dataFromList: Any => Option[each.Data] = { d: Any =>
          each.dataFromList(d.asInstanceOf[each.OutPut])
        }
      })
    SlickShapeValueListWrap[Any, R](s => impl.takeData(DataGroup(items = s), cv.umrSv).current, r => Option.empty, classTag, convertedWrap: _*).shapedValue
  }

}