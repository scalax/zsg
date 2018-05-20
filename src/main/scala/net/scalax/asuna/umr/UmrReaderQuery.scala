package net.scalax.umr

import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core._
import net.scalax.asuna.shape.{ DataShapeValue, DataShapeValueInitWrap }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import scala.language.existentials
import scala.language.implicitConversions
import scala.language.higherKinds
import scala.reflect.ClassTag

trait UmrReaderQuery[U] {
  self =>

  def shapeValue: DataShapeValue[U, ShapeValueWrap[Any]]

}

trait UmrReaderQueryHelper extends ShapeValueWrapHelper {

  def tranRep[E, U, R, C[_]](cv: UmrReaderQuery[R])(implicit profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val impl = implicitly[DataShape[DataShapeValue[R, ShapeValueWrap[Any]], R, DataShapeValue[R, ShapeValueWrap[Any]], ShapeValueWrap[Any]]]
    val reps = impl.toLawRep(impl.wrapRep(cv.shapeValue)).reps
    ListShape[Any, R](s => impl.takeData(DataGroup(items = s, subs = List.empty), cv.shapeValue).right.get.current, r => Option.empty, classTag, reps: _*)
  }

  val umrToDv: DataShapeValueInitWrap[ShapeValueWrap[Any]] = DataShapeValue.toShapeValue[ShapeValueWrap[Any]]

}