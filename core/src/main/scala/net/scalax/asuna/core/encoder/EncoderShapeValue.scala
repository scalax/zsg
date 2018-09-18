package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.common.CommonShapeValue

trait EncoderShapeValue[U, RepCol, DataCol] extends CommonShapeValue[U, RepCol, DataCol] {
  self =>

  override type RepType
  override val rep: RepType
  override val shape: EncoderShape.Aux[RepType, U, RepType, RepCol, DataCol]

  def emap[F](cv: F => U): EncoderShapeValue[F, RepCol, DataCol] = new EncoderShapeValue[F, RepCol, DataCol] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new EncoderShape[self.RepType, RepCol, DataCol] {
      innerSelf =>

      override type Data   = F
      override type Target = self.RepType
      override def wrapRep(base: self.RepType): self.RepType                        = base
      override def toLawRep(base: self.RepType, oldRep: RepCol): RepCol             = self.shape.toLawRep(self.rep, oldRep)
      override def buildData(data: F, rep: self.RepType, oldData: DataCol): DataCol = self.shape.buildData(cv(data), rep, oldData)

    }
  }

}

object EncoderShapeValue {

  implicit def dataShapeValueShape[U, RepCol, DataCol]: EncoderShape.Aux[EncoderShapeValue[U, RepCol, DataCol], U, EncoderShapeValue[U, RepCol, DataCol], RepCol, DataCol] = {
    new EncoderShape[EncoderShapeValue[U, RepCol, DataCol], RepCol, DataCol] {
      self =>
      override type Target = EncoderShapeValue[U, RepCol, DataCol]
      override type Data   = U
      override def wrapRep(base: EncoderShapeValue[U, RepCol, DataCol]): EncoderShapeValue[U, RepCol, DataCol] = base
      override def toLawRep(base: EncoderShapeValue[U, RepCol, DataCol], oldRep: RepCol): RepCol               = base.shape.toLawRep(base.shape.wrapRep(base.rep), oldRep)
      override def buildData(data: U, rep: EncoderShapeValue[U, RepCol, DataCol], oldData: DataCol): DataCol   = rep.shape.buildData(data, rep.rep, oldData)
    }
  }

}
