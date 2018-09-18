package net.scalax.asuna.core

import cats.Traverse
import io.circe.{Decoder, Encoder}
import cats.data._
import cats.implicits._
import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue, SplitData}
import net.scalax.asuna.helper.decoder.{DecoderContent, DecoderHelper, DecoderWrapperHelper}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

case class ValidateField(field: String, message: String)

object ValidateField {
  import io.circe.generic.auto._
  implicit val aa = implicitly[Encoder[ValidateField]]
  implicit val bb = implicitly[Decoder[ValidateField]]
}

case class ValidateModel(whole: List[String] = List.empty, fields: List[ValidateField] = List.empty)

object ValidateModel {
  import io.circe.generic.auto._
  implicit val cc = implicitly[Encoder[ValidateModel]]
  implicit val dd = implicitly[Decoder[ValidateModel]]
}

trait CirceReaderAbs {

  type DataType
  type ResultType

  def keyName: String
  def circeReader: Decoder[DataType]
  def validate(common: DataType): Future[Validated[ValidateModel, ResultType]]

}

trait CirceReaderImpl[T, R] extends CirceReaderAbs {
  self =>

  override type DataType   = T
  override type ResultType = R

  def map[H](c: R => H): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName     = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c))
      }
    }
    r
  }

  def validate[H](c: R => ValidatedNel[String, H]): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName     = self.keyName
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
      override def keyName     = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c)).flatMap(r => Traverse[({ type X[V] = Validated[ValidateModel, V] })#X].sequence(r))
      }
    }
    r
  }

  def validateM[H](c: R => Future[ValidatedNel[String, H]]): CirceReaderImpl[T, H] = {
    val r = new CirceReaderImpl[T, H] {
      override def keyName     = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        lazy val r = { x: R =>
          c(x).map(_.leftMap { s =>
            ValidateModel(fields = s.map(msg => ValidateField(field = keyName, message = msg)).toList)
          })
        }
        self.validate(common).flatMap(s => Traverse[({ type X[V] = Validated[ValidateModel, V] })#X].sequence(s.map(r)).map(_.andThen(identity)))
      }
    }
    r
  }

}

trait CirceReaderHelper {

  trait CirceWrapper[RepOut, DataType] extends DecoderContent[RepOut, DataType] with CirceReaderQuery[DataType]

  object circe extends DecoderHelper[List[CirceReaderAbs], List[Any]] with DecoderWrapperHelper[List[CirceReaderAbs], List[Any], CirceWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, List[CirceReaderAbs], List[Any]]): CirceWrapper[Out, D] = {
      val shape1 = shape
      val rep1   = rep
      new CirceWrapper[Out, D] {
        override def playCirceSv: DecoderShapeValue[D, List[CirceReaderAbs], List[Any]] = new DecoderShapeValue[D, List[CirceReaderAbs], List[Any]] {
          override type RepType = Out
          override val rep                                                                   = shape1.wrapRep(rep1)
          override val shape: DecoderShape.Aux[Out, D, Out, List[CirceReaderAbs], List[Any]] = shape1.packed
        }
      }
    }
  }

  def column[T](keyName: String)(implicit encoder: Decoder[T]): CirceReaderImpl[T, T] = {
    val keyName1 = keyName
    val r = new CirceReaderImpl[T, T] {
      override val keyName     = keyName1
      override val circeReader = encoder
      override def validate(common: T): Future[Validated[ValidateModel, T]] = {
        Future.successful(Validated.valid(common))
      }
    }
    r
  }

  implicit def circeReaderImplicit[T]: DecoderShape.Aux[CirceReaderImpl[T, T], T, CirceReaderImpl[T, T], List[CirceReaderAbs], List[Any]] = {
    new DecoderShape[CirceReaderImpl[T, T], List[CirceReaderAbs], List[Any]] {
      override type Target = CirceReaderImpl[T, T]
      override type Data   = T
      override def wrapRep(base: CirceReaderImpl[T, T]): CirceReaderImpl[T, T]                               = base
      override def toLawRep(base: CirceReaderImpl[T, T], oldRep: List[CirceReaderAbs]): List[CirceReaderAbs] = base :: oldRep
      override def takeData(rep: CirceReaderImpl[T, T], oldData: List[Any]): SplitData[T, List[Any]] =
        SplitData(current = oldData.head.asInstanceOf[T], left = oldData.tail)
    }
  }

}
