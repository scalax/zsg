package net.scalax.umr

import net.scalax.asuna.core.{ DataGroup, DataShape }
import net.scalax.asuna.shape.DataShapeValue
import slick.lifted.{ Query, ShapedValue }

import scala.language.existentials
import scala.language.implicitConversions
import scala.language.higherKinds
import scala.reflect.ClassTag

trait UmrReaderQuery[U] {
  self =>

  def shapeValue: DataShapeValue[U, ShapeValueWrap[Any]]

}

trait SlickWriterQuery {

  def tranQuery[E, U, R, C[_]](cv: UmrReaderQuery[R])(implicit profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val impl = implicitly[DataShape[DataShapeValue[R, ShapeValueWrap[Any]], R, DataShapeValue[R, ShapeValueWrap[Any]], ShapeValueWrap[Any]]]
    val reps = impl.toLawRep(impl.wrapRep(cv.shapeValue)).reps
    ListShape.apply[Any, R](s => impl.takeData(DataGroup(items = s, subs = List.empty), cv.shapeValue).right.get.current, r => Option.empty, classTag, reps: _*)
  }

}