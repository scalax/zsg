package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.encoder.impl.ListEncoderShapeImplicit

trait EncoderShape[-E, U, RepCol, DataCol] {
  self =>

  type Target

  def packed: EncoderShape.Aux[Target, U, Target, RepCol, DataCol] = {
    new EncoderShape[Target, U, RepCol, DataCol] {
      subSelf =>
      override type Target = self.Target
      override def packed: EncoderShape.Aux[self.Target, U, self.Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target = base
      override def toLawRep(base: self.Target, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def buildData(data: U, rep: self.Target, oldData: DataCol): DataCol = self.buildData(data, rep, oldData)
    }
  }
  def wrapRep(base: E): Target
  def toLawRep(base: Target, oldRep: RepCol): RepCol
  def buildData(data: U, rep: Target, oldData: DataCol): DataCol
}

object EncoderShape extends ListEncoderShapeImplicit {
  type Aux[-E, U, C, RepCol, DataCol] = EncoderShape[E, U, RepCol, DataCol] { type Target = C }
}