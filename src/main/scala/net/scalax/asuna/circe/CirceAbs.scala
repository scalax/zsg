package net.scalax.asuna.core

import cats.Traverse
import io.circe.Decoder
import cats.data._
import cats.implicits._
import cats.kernel.CommutativeSemigroup
import io.circe.generic.JsonCodec

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@JsonCodec
case class ValidateField(field: String, message: String)

@JsonCodec
case class ValidateModel(whole: List[String] = List.empty, fields: List[ValidateField] = List.empty)

trait CirceReaderAbs {

  type DataType
  type ResultType

  def keyName: String
  def circeReader: Decoder[DataType]
  def validate(common: DataType): Future[Validated[ValidateModel, ResultType]]

}

trait CirceReaderImpl[T, R] extends CirceReaderAbs with OutputTag[R, CirceReaderAbs] {
  self =>

  override type DataType = T
  override type ResultType = R
  override def common: CirceReaderAbs = self

  def map[H](c: R => H): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c))
      }
    }
    r
  }

  def validate[H](c: R => ValidatedNel[String, H]): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        lazy val r = { x: R =>
          c(x).leftMap { s =>
            ValidateModel(fields = s.map(msg => ValidateField(field = keyName, message = msg)).toList)
          }
        }
        self.validate(common).map(_.andThen(r))
      }
    }
    r
  }

  def mapM[H](c: R => Future[H]): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c)).flatMap(r => Traverse[Validated[ValidateModel, ?]].sequence(r))
      }
    }
    r
  }

  def validateM[H](c: R => Future[ValidatedNel[String, H]]): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        lazy val r = { x: R =>
          c(x).map(_.leftMap { s =>
            ValidateModel(fields = s.map(msg => ValidateField(field = keyName, message = msg)).toList)
          })
        }
        self.validate(common).flatMap(s => Traverse[Validated[ValidateModel, ?]].sequence(s.map(r)).map(_.andThen(identity)))
      }
    }
    r
  }

}

trait CirceReaderHelper {

  val circeShape: DataShapeValueInitWrap[CirceReaderAbs] = DataShapeValue.toShapeValue[CirceReaderAbs]
  def toCirceReader[T, R, U](col: T)(implicit shape: DataShape[T, R, U, CirceReaderAbs]): CirceReaderQuery[R] = {
    val shape1 = shape
    new CirceReaderQuery[R] {
      override def playCirceSv: DataShapeValue[R, CirceReaderAbs] = new DataShapeValue[R, CirceReaderAbs] {
        override type RepType = U
        override val rep = shape1.wrapRep(col)
        override val shape: DataShape[U, R, U, CirceReaderAbs] = shape1.packed
      }
    }
  }

  def column[T](keyName: String)(implicit encoder: Decoder[T]): CirceReaderImpl[T, T] = {
    val keyName1 = keyName
    val r = new CirceReaderImpl[T, T] {
      override val keyName = keyName1
      override val circeReader = encoder
      override def validate(common: T): Future[Validated[ValidateModel, T]] = {
        Future.successful(Validated.valid(common))
      }
    }
    r
  }

}