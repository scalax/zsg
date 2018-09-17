package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.common.CommonShape
import net.scalax.asuna.core.encoder.impl.ListEncoderShapeImplicit

trait EncoderShape[-E, RepCol, DataCol] extends CommonShape[E, RepCol, DataCol] {
  self =>

  override type Target
  type Data

  override def packed: EncoderShape.Aux[Target, Data, Target, RepCol, DataCol] = {
    new EncoderShape[Target, RepCol, DataCol] {
      subSelf =>
      override type Target = self.Target
      override type Data   = self.Data
      override def packed: EncoderShape.Aux[self.Target, Data, self.Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target                                   = base
      override def toLawRep(base: self.Target, oldRep: RepCol): RepCol                       = self.toLawRep(base, oldRep)
      override def buildData(data: Data, rep: self.Target, oldData: DataCol): DataCol        = self.buildData(data, rep, oldData)
    }
  }
  override def wrapRep(base: E): Target
  override def toLawRep(base: Target, oldRep: RepCol): RepCol
  def buildData(data: Data, rep: Target, oldData: DataCol): DataCol
  def emap[T](f: (Target, T) => Data): EncoderShape.Aux[E, T, self.Target, RepCol, DataCol] = new EncoderShape[E, RepCol, DataCol] {
    subSelf =>
    override type Target = self.Target
    override type Data   = T
    override def wrapRep(base: E): Target                                   = self.wrapRep(base)
    override def toLawRep(base: Target, oldRep: RepCol): RepCol             = self.toLawRep(base, oldRep)
    override def buildData(data: T, rep: Target, oldData: DataCol): DataCol = self.buildData(f(rep, data), rep, oldData)
  }

}

object EncoderShape extends ListEncoderShapeImplicit {
  type Aux[-E, U, C, RepCol, DataCol] = EncoderShape[E, RepCol, DataCol] { type Target = C; type Data = U }
}
