package net.scalax.asuna.core

import io.circe.Decoder
import cats.data._
import io.circe.generic.JsonCodec

@JsonCodec
case class ValidateField(field: String, message: String)

trait CirceReaderAbs {

  type DataType
  type ResultType

  def keyName: String
  def circeReader: Decoder[DataType]
  def validate(common: DataType): ValidatedNel[ValidateField, ResultType]

}

trait CirceReaderImpl[T, R] extends CirceReaderAbs {
  self =>

  override type DataType = T
  override type ResultType = R

  def map[H](c: R => H): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).map(c)
      }
    }
  }

  def mapValidated[H](
    c: R => ValidatedNel[String, H]): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        lazy val r = { x: R =>
          c(x).leftMap { s =>
            s.map(msg =>
              ValidateField(field = keyName, message = msg))
          }
        }
        self.validate(common).andThen(r)
      }
    }
  }

}

object CirceReaderImpl {

  implicit def readerShape[T, R]: DataShape[CirceReaderImpl[T, R], R, CirceReaderImpl[T, R], CirceReaderAbs] = {
    new DataShape[CirceReaderImpl[T, R], R, CirceReaderImpl[T, R], CirceReaderAbs] { self =>
      override def packed: DataShape[CirceReaderImpl[T, R], R, CirceReaderImpl[T, R], CirceReaderAbs] = self
      override def wrapRep(base: CirceReaderImpl[T, R]): CirceReaderImpl[T, R] = base
      override def toLawRep(base: CirceReaderImpl[T, R]): DataRepGroup[CirceReaderAbs] = DataRepGroup(reps = List(base), subs = List.empty)
      override def takeData(oldData: DataGroup, rep: CirceReaderImpl[T, R]): SplitData[R] = {
        oldData.items match {
          case head :: tail =>
            SplitData(current = Right(head.asInstanceOf[R]), left = DataGroup(items = tail, subs = oldData.subs))
        }
      }
    }
  }

}

object CirceReader {

  def column[T](keyName: String)(
    implicit
    encoder: Decoder[T]): CirceReaderImpl[T, T] = {
    val keyName1 = keyName
    new CirceReaderImpl[T, T] {
      override val keyName = keyName1
      override val circeReader = encoder
      override def validate(common: T): ValidatedNel[ValidateField, T] = {
        Validated.validNel(common)
      }
    }
  }

}