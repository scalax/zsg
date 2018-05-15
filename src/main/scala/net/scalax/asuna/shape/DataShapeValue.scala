package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataShapeValue[E, U, C, T] {
  val rep: E
  val shape: DataShape[E, U, C, T]
}

object DataShapeValue {

  implicit def dataShapeValueShape[E, U, C, T]: DataShape[DataShapeValue[E, U, C, T], U, DataShapeValue[C, U, C, T], T] = {

    new DataShape[DataShapeValue[E, U, C, T], U, DataShapeValue[C, U, C, T], T] {
      self =>

      override def packed: DataShape[DataShapeValue[C, U, C, T], U, DataShapeValue[C, U, C, T], T] = new DataShape[DataShapeValue[C, U, C, T], U, DataShapeValue[C, U, C, T], T] {
        subSelf =>

        override def packed: DataShape[DataShapeValue[C, U, C, T], U, DataShapeValue[C, U, C, T], T] = subSelf

        override def wrapRep(base: DataShapeValue[C, U, C, T]): DataShapeValue[C, U, C, T] = base

        override def toLawRep(base: DataShapeValue[C, U, C, T]): DataRepGroup[T] = self.toLawRep(base)

        override def takeData(oldData: DataGroup, rep: DataShapeValue[C, U, C, T]): SplitData[U] = self.takeData(oldData, rep)
      }

      override def wrapRep(base: DataShapeValue[E, U, C, T]): DataShapeValue[C, U, C, T] = new DataShapeValue[C, U, C, T] {
        override val rep = base.shape.wrapRep(base.rep)
        override val shape = base.shape.packed
      }

      override def toLawRep(base: DataShapeValue[C, U, C, T]): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))

      override def takeData(oldData: DataGroup, rep: DataShapeValue[C, U, C, T]): SplitData[U] = rep.shape.takeData(oldData, rep.rep)

    }

  }

}