package net.scalax.asuna.core

import io.circe.Encoder
import cats.data.Validated

trait CirceReaderAbs {

  type DataType
  type ResultType

  def keyName: String
  def circeReader: Encoder[DataType]
  def validate(common: DataType): Validated[List[String], ResultType]

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
    c: R => Validated[List[String], H]): CirceReaderImpl[T, H] = {
    new CirceReaderImpl[T, H] {
      override def keyName = self.keyName
      override def circeReader = self.circeReader
      override def validate(common: T) = {
        self.validate(common).andThen(c)
      }
    }
  }

}

object CirceReader {

  def column[T](keyName: String)(
    implicit
    encoder: Encoder[T]): CirceReaderImpl[T, T] = {
    val keyName1 = keyName
    new CirceReaderImpl[T, T] {
      override val keyName = keyName1
      override val circeReader = encoder
      override def validate(common: T): Validated[List[String], T] = {
        Validated.Valid(common)
      }
    }
  }

}