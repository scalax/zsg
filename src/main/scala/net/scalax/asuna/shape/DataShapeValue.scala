package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: DataShape[RepType, U, RepType, T]

  def <>[F](cv: U => F): DataShapeValue[F, T] = new DataShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DataShape[self.RepType, F, self.RepType, T] {
      innerSelf =>

      override def packed: DataShape[self.RepType, F, self.RepType, T] = innerSelf
      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType): DataRepGroup[T] = self.shape.toLawRep(self.rep)
      override def takeData(oldData: DataGroup, rep: self.RepType): SplitData[F] = {
        val data = self.shape.takeData(oldData, rep)
        SplitData(
          current = data.current.right.map(cv),
          left = data.left)
      }

    }
  }
}

object DataShapeValue {

  implicit def dataShapeValueShape[U, T, R <: DataShapeValue[U, T]]: DataShape[R, U, R, T] = {

    new DataShape[R, U, R, T] {
      self =>

      override def packed: DataShape[R, U, R, T] = self
      override def wrapRep(base: R): R = base
      override def toLawRep(base: R): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))
      override def takeData(oldData: DataGroup, rep: R): SplitData[U] = rep.shape.takeData(oldData, rep.rep)

    }

  }

}