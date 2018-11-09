package net.scalax.asuna.core.encoder.impl

import net.scalax.asuna.core.decoder.SplitData
import net.scalax.asuna.core.formatter.FormatterShape

trait ZipFormatterShapeHelper {

  def zipFormatter[A, B, C, D, E, F, RepCol, EncoderDataCol, DecoderDataCol](
      shape1: FormatterShape.Aux[A, B, C, RepCol, EncoderDataCol, DecoderDataCol]
    , shape2: FormatterShape.Aux[D, E, F, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[(A, D), (B, E), (C, F), RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[(A, D), RepCol, EncoderDataCol, DecoderDataCol] {
      self =>
      override type Target = (C, F)
      override type Data   = (B, E)
      override def wrapRep(base: => (A, D)): (C, F) = {
        (shape1.wrapRep(base._1), shape2.wrapRep(base._2))
      }
      override def buildRep(base: (C, F), oldRep: RepCol): RepCol = {
        val repCol2 = shape2.buildRep(base._2, oldRep)
        shape1.buildRep(base._1, repCol2)
      }
      override def buildData(data: (B, E), rep: (C, F), oldData: EncoderDataCol): EncoderDataCol = {
        val dataCol2 = shape2.buildData(data._2, rep._2, oldData)
        shape1.buildData(data._1, rep._1, dataCol2)
      }
      override def takeData(rep: (C, F), oldData: DecoderDataCol): SplitData[(B, E), DecoderDataCol] = {
        val SplitData(data1, left1) = shape1.takeData(rep._1, oldData)
        val SplitData(data2, left2) = shape2.takeData(rep._2, left1)
        SplitData((data1, data2), left2)
      }
    }
  }

}

object ZipFormatterShapeHelper extends ZipFormatterShapeHelper
