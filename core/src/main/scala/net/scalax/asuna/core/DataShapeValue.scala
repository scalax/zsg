package net.scalax.asuna.core

trait DataShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: DataShape[RepType, U, RepType, T]

  def map[F](cv: U => F): DataShapeValue[F, T] = new DataShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DataShape[self.RepType, F, self.RepType, T] {
      innerSelf =>

      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType): DataRepGroup[T] = self.shape.toLawRep(self.rep)
      override def takeData(oldData: DataGroup, rep: self.RepType): SplitData[F] = {
        val data = self.shape.takeData(oldData, rep)
        val current = cv(data.current)
        SplitData(
          current = current,
          left = data.left)
      }
    }
  }
}

object DataShapeValue {

  implicit def dataShapeValueShape[U, T]: DataShape[DataShapeValue[U, T], U, DataShapeValue[U, T], T] = {
    new DataShape[DataShapeValue[U, T], U, DataShapeValue[U, T], T] {
      self =>
      override def wrapRep(base: DataShapeValue[U, T]): DataShapeValue[U, T] = base
      override def toLawRep(base: DataShapeValue[U, T]): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))
      override def takeData(oldData: DataGroup, rep: DataShapeValue[U, T]): SplitData[U] = rep.shape.takeData(oldData, rep.rep)
    }
  }

}