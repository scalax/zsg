package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }

trait DecoderShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: DecoderShape[RepType, U, RepType, T]

  def dmap[F](cv: U => F): DecoderShapeValue[F, T] = new DecoderShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DecoderShape[self.RepType, F, self.RepType, T] {
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

object DecoderShapeValue {

  implicit def dataShapeValueShape[U, T]: DecoderShape[DecoderShapeValue[U, T], U, DecoderShapeValue[U, T], T] = {
    new DecoderShape[DecoderShapeValue[U, T], U, DecoderShapeValue[U, T], T] {
      self =>
      override def wrapRep(base: DecoderShapeValue[U, T]): DecoderShapeValue[U, T] = base
      override def toLawRep(base: DecoderShapeValue[U, T]): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))
      override def takeData(oldData: DataGroup, rep: DecoderShapeValue[U, T]): SplitData[U] = rep.shape.takeData(oldData, rep.rep)
    }
  }

}