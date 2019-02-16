package org.scalax.asuna.core.decoder

import org.scalax.asuna.core.common.CommonShape
import org.scalax.asuna.core.decoder.impl.ListDecoderShapeImplicit

trait DecoderShape[-E, RepCol, DataCol] extends CommonShape[E, RepCol] {
  self =>

  override type Target
  type Data

  override def packed: DecoderShape.Aux[Target, Data, Target, RepCol, DataCol] = {
    new DecoderShape[Target, RepCol, DataCol] {
      subSelf =>
      override type Data   = self.Data
      override type Target = self.Target
      override def packed: DecoderShape.Aux[self.Target, subSelf.Data, Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: => self.Target): self.Target                                   = base
      override def buildRep(base: Target, oldRep: RepCol): RepCol                               = self.buildRep(base, oldRep)
      override def takeData(rep: Target, oldData: DataCol): SplitData[self.Data, DataCol]       = self.takeData(rep, oldData)
    }
  }
  override def wrapRep(base: => E): Target
  override def buildRep(base: Target, oldRep: RepCol): RepCol
  def takeData(rep: Target, oldData: DataCol): SplitData[Data, DataCol]
  def dmap[T](f: (Target, Data) => T): DecoderShape.Aux[E, T, self.Target, RepCol, DataCol] = new DecoderShape[E, RepCol, DataCol] {
    subSelf =>
    override type Target = self.Target
    override type Data   = T
    override def wrapRep(base: => E): Target                    = self.wrapRep(base)
    override def buildRep(base: Target, oldRep: RepCol): RepCol = self.buildRep(base, oldRep)
    override def takeData(rep: Target, oldData: DataCol): SplitData[T, DataCol] = {
      val sd = self.takeData(rep, oldData)
      sd.copy(current = f(rep, sd.current))
    }
  }

}

object DecoderShape extends ListDecoderShapeImplicit {
  type Aux[-E, D, T, RepCol, DataCol] = DecoderShape[E, RepCol, DataCol] { type Target = T; type Data = D }
}
