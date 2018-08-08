package net.scalax.asuna.core.encoder

trait EncoderShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: EncoderShape[RepType, U, RepType, T]

  def emap[F](cv: F => U): EncoderShapeValue[F, T] = new EncoderShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new EncoderShape[self.RepType, F, self.RepType, T] {
      innerSelf =>

      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType, oldRep: List[T]): List[T] = self.shape.toLawRep(self.rep, oldRep)
      override def buildData(data: F, rep: self.RepType, oldData: List[Any]): List[Any] = self.shape.buildData(cv(data), rep, oldData)

    }
  }

}

object EncoderShapeValue {

  implicit def dataShapeValueShape[U, T]: EncoderShape[EncoderShapeValue[U, T], U, EncoderShapeValue[U, T], T] = {
    new EncoderShape[EncoderShapeValue[U, T], U, EncoderShapeValue[U, T], T] {
      self =>
      override def wrapRep(base: EncoderShapeValue[U, T]): EncoderShapeValue[U, T] = base
      override def toLawRep(base: EncoderShapeValue[U, T], oldRep: List[T]): List[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep), oldRep)
      override def buildData(data: U, rep: EncoderShapeValue[U, T], oldData: List[Any]): List[Any] = rep.shape.buildData(data, rep.rep, oldData)
    }
  }

}