package net.scalax.asuna.core

import cats.Traverse
import io.circe.Decoder
import cats.data._
import cats.implicits._
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

trait CirceReaderImpl[T, R] extends CirceReaderAbs with AtomicColumn[R, CirceReaderAbs] {
  self =>

  override type DataType = T
  override type ResultType = R
  override def common: CirceReaderAbs = self

  def map[H](c: R => H): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c))
      }
    }
  }

  def validate[H](c: R => ValidatedNel[String, H]): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
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
  }

  def mapM[H](c: R => Future[H]): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(_.map(c)).flatMap(r => Traverse[Validated[ValidateModel, ?]].sequence(r))
      }
    }
  }

  def validateM[H](c: R => Future[ValidatedNel[String, H]]): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
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
  }

}

object CirceReaderImpl {

  /*implicit def readerShape[T, R]: DataShape[CirceReaderImpl[T, R], R, CirceReaderImpl[T, R], CirceReaderAbs] = {
    new DataShape[CirceReaderImpl[T, R], R, CirceReaderImpl[T, R], CirceReaderAbs] { self =>
      override def wrapRep(base: CirceReaderImpl[T, R]): CirceReaderImpl[T, R] = base
      override def toLawRep(base: CirceReaderImpl[T, R]): DataRepGroup[CirceReaderAbs] = DataRepGroup(reps = List(base))
      override def takeData(oldData: DataGroup, rep: CirceReaderImpl[T, R]): Either[NotConvert, SplitData[R]] = {
        oldData.items match {
          case head :: tail =>
            Right(SplitData(current = head.asInstanceOf[R], left = DataGroup(items = tail)))
        }
      }

      override def buildData(splitData: R, rep: CirceReaderImpl[T, R]): Either[NotConvert, DataGroup] = Right(DataGroup(items = List(splitData)))
    }
  }*/

}

object CirceReader {

  val circeShape: DataShapeValueInitWrap[CirceReaderAbs] = DataShapeValue.toShapeValue[CirceReaderAbs]

  def column[T](keyName: String)(
    implicit
    encoder: Decoder[T]): CirceReaderImpl[T, T] = {
    val keyName1 = keyName
    new CirceReaderImpl[T, T] {
      override val keyName = keyName1
      override val circeReader = encoder
      override def validate(common: T): Future[Validated[ValidateModel, T]] = {
        Future.successful(Validated.valid(common))
      }
    }
  }

}