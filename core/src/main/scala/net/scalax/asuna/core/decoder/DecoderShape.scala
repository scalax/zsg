package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.decoder.impl.ListDecoderShapeImplicit

trait DecoderShape[-E, D, RepCol, DataCol] {
  self =>
  type Target
  def packed: DecoderShape.Aux[Target, D, Target, RepCol, DataCol] = {
    new DecoderShape[Target, D, RepCol, DataCol] {
      subSelf =>
      override type Target = self.Target
      override def packed: DecoderShape.Aux[self.Target, D, Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target = base
      override def toLawRep(base: Target, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def takeData(rep: Target, oldData: DataCol): SplitData[D, DataCol] = self.takeData(rep, oldData)
    }
  }
  def wrapRep(base: E): Target
  def toLawRep(base: Target, oldRep: RepCol): RepCol
  def takeData(rep: Target, oldData: DataCol): SplitData[D, DataCol]
}

object DecoderShape extends ListDecoderShapeImplicit {
  type Aux[-E, D, T, RepCol, DataCol] = DecoderShape[E, D, RepCol, DataCol] { type Target = T }
}