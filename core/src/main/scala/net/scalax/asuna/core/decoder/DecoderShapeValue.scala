package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.CommonShapeValue
import net.scalax.asuna.core.decoder.impl.ZipDecoderShapeHelper

trait DecoderShapeValue[U, RepCol, DataCol] extends CommonShapeValue[U, RepCol] {
  self =>

  override type RepType
  override val rep: RepType
  override val shape: DecoderShape.Aux[RepType, U, RepType, RepCol, DataCol]

  def dmap[F](cv: U => F): DecoderShapeValue[F, RepCol, DataCol] = new DecoderShapeValue[F, RepCol, DataCol] {
    override type RepType = self.RepType
    override val rep   = self.rep
    override val shape = self.shape.dmap((_, u) => cv(u))
  }

  def dzip[R](other: DecoderShapeValue[R, RepCol, DataCol]): DecoderShapeValue[(U, R), RepCol, DataCol] = new DecoderShapeValue[(U, R), RepCol, DataCol] {
    override type RepType = (self.RepType, other.RepType)
    override val rep   = (self.rep, other.rep)
    override val shape = ZipDecoderShapeHelper.zipDecoder(self.shape, other.shape)
  }

}

object DecoderShapeValue {

  implicit def dataShapeValueShape[U, RepCol, DataCol]
    : DecoderShape.Aux[DecoderShapeValue[U, RepCol, DataCol], U, DecoderShapeValue[U, RepCol, DataCol], RepCol, DataCol] = {
    new DecoderShape[DecoderShapeValue[U, RepCol, DataCol], RepCol, DataCol] {
      self =>
      override type Target = DecoderShapeValue[U, RepCol, DataCol]
      override type Data   = U
      override def wrapRep(base: DecoderShapeValue[U, RepCol, DataCol]): DecoderShapeValue[U, RepCol, DataCol]   = base
      override def buildRep(base: DecoderShapeValue[U, RepCol, DataCol], oldRep: RepCol): RepCol                 = base.shape.buildRep(base.shape.wrapRep(base.rep), oldRep)
      override def takeData(rep: DecoderShapeValue[U, RepCol, DataCol], oldData: DataCol): SplitData[U, DataCol] = rep.shape.takeData(rep.rep, oldData)
    }
  }

}
