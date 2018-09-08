package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.CommonShape
import net.scalax.asuna.core.decoder.impl.ListDecoderShapeImplicit

trait DecoderShape[-E,  RepCol, DataCol] extends CommonShape[E, RepCol, DataCol] {
  self =>

  override type Target
  type Data

  override def packed: DecoderShape.Aux[Target, Data, Target, RepCol, DataCol] = {
    new DecoderShape[Target,  RepCol, DataCol] {
      subSelf =>
      override type Data = self.Data
      override type Target = self.Target
      override def packed: DecoderShape.Aux[self.Target, self.Data, Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target = base
      override def toLawRep(base: Target, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def takeData(rep: Target, oldData: DataCol): SplitData[D, DataCol] = self.takeData(rep, oldData)
    }
  }
  override def wrapRep(base: E): Target
  override def toLawRep(base: Target, oldRep: RepCol): RepCol
  def takeData(rep: Target, oldData: DataCol): SplitData[D, DataCol]
  def dmap[T](f: (Target, D) => T): DecoderShape.Aux[E, T, self.Target, RepCol, DataCol] = new DecoderShape[E, T, RepCol, DataCol] {
    subSelf =>
    override type Target = self.Target
    override def wrapRep(base: E): Target = self.wrapRep(base)
    override def toLawRep(base: Target, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
    override def takeData(rep: Target, oldData: DataCol): SplitData[T, DataCol] = {
      val sd = self.takeData(rep, oldData)
      sd.copy(current = f(rep, sd.current))
    }
  }

}

object DecoderShape extends ListDecoderShapeImplicit {
  type Aux[-E, D, T, RepCol, DataCol] = DecoderShape[E, D, RepCol, DataCol] { type Target = T }
}