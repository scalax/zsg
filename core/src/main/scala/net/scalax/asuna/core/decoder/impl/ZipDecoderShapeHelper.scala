package net.scalax.asuna.core.decoder.impl

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}

trait ZipDecoderShapeHelper {

  def zipDecoder[A, B, C, D, E, F, RepCol, DataCol](
      shape1: DecoderShape.Aux[A, B, C, RepCol, DataCol]
    , shape2: DecoderShape.Aux[D, E, F, RepCol, DataCol]
  ): DecoderShape.Aux[(A, D), (B, E), (C, F), RepCol, DataCol] = {
    new DecoderShape[(A, D), RepCol, DataCol] {
      self =>
      override type Target = (C, F)
      override type Data   = (B, E)
      override def wrapRep(base: => (A, D)): (C, F) = {
        (shape1.wrapRep(base._1), shape2.wrapRep(base._2))
      }
      override def toLawRep(base: (C, F), oldRep: RepCol): RepCol = {
        val repCol2 = shape2.toLawRep(base._2, oldRep)
        shape1.toLawRep(base._1, repCol2)
      }
      override def takeData(rep: (C, F), oldData: DataCol): SplitData[(B, E), DataCol] = {
        val SplitData(data1, left1) = shape1.takeData(rep._1, oldData)
        val SplitData(data2, left2) = shape2.takeData(rep._2, left1)
        SplitData((data1, data2), left2)
      }
    }
  }

}

object ZipDecoderShapeHelper extends ZipDecoderShapeHelper
