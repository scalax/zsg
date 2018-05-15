package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataShapeValue[E, U, T] {
  val rep: E
  val shape: DataShape[E, U, E, T]
}

object DataShapeValue {

  implicit def dataShapeValueShape[E, U, T, R <: DataShapeValue[E, U, T]]: DataShape[R, U, R, T] = {

    new DataShape[R, U, R, T] {
      self =>

      override def packed: DataShape[R, U, R, T] = self

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))

      override def takeData(oldData: DataGroup, rep: R): SplitData[U] = rep.shape.takeData(oldData, rep.rep)

    }

  }

}