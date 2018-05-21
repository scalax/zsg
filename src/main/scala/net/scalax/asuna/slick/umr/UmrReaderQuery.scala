package net.scalax.asuna.slick.umr

import net.scalax.asuna.core._
import slick.lifted.ShapedValue

import scala.language.implicitConversions
import scala.language.higherKinds
import scala.reflect.ClassTag

trait UmrReaderQuery[U] {
  self =>

  def umrSv: DataShapeValue[U, SlickShapeValueWrap[Any]]

}

object UmrReaderQuery {

  def apply[E, U, R, C[_]](cv: UmrReaderQuery[R])(implicit profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val impl = implicitly[DataShape[DataShapeValue[R, SlickShapeValueWrap[Any]], R, DataShapeValue[R, SlickShapeValueWrap[Any]], SlickShapeValueWrap[Any]]]
    val reps = impl.toLawRep(impl.wrapRep(cv.umrSv)).reps
    SlickShapeValueListWrap[Any, R](s => impl.takeData(DataGroup(items = s, subs = List.empty), cv.umrSv).right.get.current, r => Option.empty, classTag, reps: _*)
  }

}