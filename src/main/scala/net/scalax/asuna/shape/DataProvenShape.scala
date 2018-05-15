package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataProvenShape[E, U, C, T] {
  val dataShapeValue: DataShapeValue[E, U, C, T]
}

object DataProvenShape {

  implicit def dataProvenShapeShape[E, U, C, T]: DataShape[DataProvenShape[E, U, C, T], U, DataProvenShape[C, U, C, T], T] = {

    new DataShape[DataProvenShape[E, U, C, T], U, DataProvenShape[C, U, C, T], T] {
      self =>

      override def packed: DataShape[DataProvenShape[C, U, C, T], U, DataProvenShape[C, U, C, T], T] =
        new DataShape[DataProvenShape[C, U, C, T], U, DataProvenShape[C, U, C, T], T] {
          subSelf =>

          override def packed: DataShape[DataProvenShape[C, U, C, T], U, DataProvenShape[C, U, C, T], T] = subSelf

          override def wrapRep(base: DataProvenShape[C, U, C, T]): DataProvenShape[C, U, C, T] = base

          override def toLawRep(base: DataProvenShape[C, U, C, T]): DataRepGroup[T] = self.toLawRep(base)

          override def takeData(oldData: DataGroup, rep: DataProvenShape[C, U, C, T]): SplitData[U] = self.takeData(oldData, rep)
        }

      override def wrapRep(base: DataProvenShape[E, U, C, T]): DataProvenShape[C, U, C, T] =
        new DataProvenShape[C, U, C, T] {
          override val dataShapeValue = implicitly[DataShape[DataShapeValue[E, U, C, T], U, DataShapeValue[C, U, C, T], T]].wrapRep(base.dataShapeValue)
        }

      override def toLawRep(base: DataProvenShape[C, U, C, T]): DataRepGroup[T] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep))

      override def takeData(oldData: DataGroup, rep: DataProvenShape[C, U, C, T]): SplitData[U] =
        rep.dataShapeValue.shape.takeData(oldData, rep.dataShapeValue.rep)

    }

  }

}