package net.scalax.asuna.core.formatter

import net.scalax.asuna.core.common.CommonShape
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.formatter.impl.ListFormatterShapeImplicit

trait FormatterShape[-E, RepCol, EncoderDataCol, DecoderDataCol]
    extends EncoderShape[E, RepCol, EncoderDataCol]
    with DecoderShape[E, RepCol, DecoderDataCol]
    with CommonShape[E, RepCol] {
  self =>

  override type Target
  override type Data

  override def packed: FormatterShape.Aux[Target, Data, Target, RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[Target, RepCol, EncoderDataCol, DecoderDataCol] {
      subSelf =>
      override type Data   = self.Data
      override type Target = self.Target
      override def packed: FormatterShape.Aux[self.Target, subSelf.Data, Target, RepCol, EncoderDataCol, DecoderDataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target                                                               = base
      override def toLawRep(base: Target, oldRep: RepCol): RepCol                                                        = self.toLawRep(base, oldRep)
      override def takeData(rep: Target, oldData: DecoderDataCol): SplitData[self.Data, DecoderDataCol]                  = self.takeData(rep, oldData)
      override def buildData(data: Data, rep: Target, oldData: EncoderDataCol): EncoderDataCol                           = self.buildData(data, rep, oldData)
    }
  }
  override def wrapRep(base: E): Target
  override def toLawRep(base: Target, oldRep: RepCol): RepCol
  override def takeData(rep: Target, oldData: DecoderDataCol): SplitData[Data, DecoderDataCol]
  override def buildData(data: Data, rep: Target, oldData: EncoderDataCol): EncoderDataCol
  def fmap[T](f: (Target, Data) => T)(g: (Target, T) => Data): FormatterShape.Aux[E, T, self.Target, RepCol, EncoderDataCol, DecoderDataCol] =
    new FormatterShape[E, RepCol, EncoderDataCol, DecoderDataCol] {
      subSelf =>
      override type Target = self.Target
      override type Data   = T
      override def wrapRep(base: E): Target                       = self.wrapRep(base)
      override def toLawRep(base: Target, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def takeData(rep: Target, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = {
        val sd = self.takeData(rep, oldData)
        sd.copy(current = f(rep, sd.current))
      }
      override def buildData(data: T, rep: Target, oldData: EncoderDataCol): EncoderDataCol = self.buildData(g(rep, data), rep, oldData)
    }

}

object FormatterShape extends ListFormatterShapeImplicit {
  type Aux[-E, D, T, RepCol, EncoderDataCol, DecoderDataCol] = FormatterShape[E, RepCol, EncoderDataCol, DecoderDataCol] { type Target = T; type Data = D }
}
