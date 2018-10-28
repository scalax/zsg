package net.scalax.asuna.core.formatter

import net.scalax.asuna.core.common.CommonShapeValue
import net.scalax.asuna.core.decoder.{DecoderShapeValue, SplitData}
import net.scalax.asuna.core.encoder.EncoderShapeValue
import net.scalax.asuna.core.encoder.impl.ZipFormatterShapeHelper

trait FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol]
    extends EncoderShapeValue[U, RepCol, EncoderDataCol]
    with DecoderShapeValue[U, RepCol, DecoderDataCol]
    with CommonShapeValue[U, RepCol] {
  self =>

  override type RepType
  override val rep: RepType
  override val shape: FormatterShape.Aux[RepType, U, RepType, RepCol, EncoderDataCol, DecoderDataCol]

  def fmap[F](cv: U => F)(rcv: F => U): FormatterShapeValue[F, RepCol, EncoderDataCol, DecoderDataCol] =
    new FormatterShapeValue[F, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = self.RepType
      override val rep   = self.rep
      override val shape = self.shape.fmap((_, u) => cv(u))((_, f) => rcv(f))
      /*new FormatterShape[self.RepType, RepCol, EncoderDataCol, DecoderDataCol] {
        innerSelf =>
        override type Data   = F
        override type Target = self.RepType
        override def wrapRep(base: self.RepType): self.RepType            = base
        override def toLawRep(base: self.RepType, oldRep: RepCol): RepCol = self.shape.toLawRep(self.rep, oldRep)
        override def takeData(currentRep: self.RepType, oldData: DecoderDataCol): SplitData[F, DecoderDataCol] = {
          val data    = self.shape.takeData(currentRep, oldData)
          val current = cv(data.current)
          SplitData(current = current, left = data.left)
        }
        override def buildData(data: F, rep: RepType, oldData: EncoderDataCol): EncoderDataCol = self.shape.buildData(rcv(data), rep, oldData)
      }*/
    }

  def fzip[R](other: FormatterShapeValue[R, RepCol, EncoderDataCol, DecoderDataCol]): FormatterShapeValue[(U, R), RepCol, EncoderDataCol, DecoderDataCol] =
    new FormatterShapeValue[(U, R), RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = (self.RepType, other.RepType)
      override val rep   = (self.rep, other.rep)
      override val shape = ZipFormatterShapeHelper.zipFormatter(self.shape, other.shape)
    }

}

object FormatterShapeValue {

  implicit def dataShapeValueShape[U, RepCol, EncoderDataCol, DecoderDataCol]: FormatterShape.Aux[FormatterShapeValue[
      U
    , RepCol
    , EncoderDataCol
    , DecoderDataCol
  ], U, FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol], RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol], RepCol, EncoderDataCol, DecoderDataCol] {
      self =>
      override type Target = FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol]
      override type Data   = U
      override def wrapRep(
          base: => FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol]
      ): FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol] = base
      override def toLawRep(base: FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol], oldRep: RepCol): RepCol =
        base.shape.toLawRep(base.shape.wrapRep(base.rep), oldRep)
      override def takeData(rep: FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol], oldData: DecoderDataCol): SplitData[U, DecoderDataCol] =
        rep.shape.takeData(rep.rep, oldData)
      override def buildData(data: U, rep: FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol], oldData: EncoderDataCol): EncoderDataCol =
        rep.shape.buildData(data, rep.rep, oldData)
    }
  }

}
