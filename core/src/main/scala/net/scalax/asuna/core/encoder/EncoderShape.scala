package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.encoder.impl.ListEncoderShapeImplicit

trait EncoderShape[-E, U, C, RepCol, DataCol] {
  self =>
  def packed: EncoderShape[C, U, C, RepCol, DataCol] = {
    new EncoderShape[C, U, C, RepCol, DataCol] {
      subSelf =>
      override def packed: EncoderShape[C, U, C, RepCol, DataCol] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def buildData(data: U, rep: C, oldData: DataCol): DataCol = self.buildData(data, rep, oldData)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C, oldRep: RepCol): RepCol
  def buildData(data: U, rep: C, oldData: DataCol): DataCol
}

object EncoderShape extends ListEncoderShapeImplicit