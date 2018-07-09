package net.scalax.asuna.core

import cats.Traverse
import io.circe.Decoder
import cats.data._
import cats.implicits._
import io.circe.generic.JsonCodec
import net.scalax.asuna.core.common.TagAbs

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

trait CirceReaderImpl[T, R] extends CirceReaderAbs with TagAbs[R, CirceReaderAbs] {
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

  trait CirceWrapper[RepOut, DataType] extends AbsWrapper[RepOut, DataType] with CirceReaderQuery[DataType]

  object circe extends AllHelper[CirceReaderAbs] with WrapperHelper[CirceReaderAbs, CirceWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DataShape[Rep, D, Out, CirceReaderAbs]): CirceWrapper[Out, D] = {
      val shape1 = shape
      val rep1 = rep
      new CirceWrapper[Out, D] {
        override def playCirceSv: DataShapeValue[D, CirceReaderAbs] = new DataShapeValue[D, CirceReaderAbs] {
          override type RepType = Out
          override val rep = shape1.wrapRep(rep1)
          override val shape: DataShape[Out, D, Out, CirceReaderAbs] = shape1.packed
        }
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