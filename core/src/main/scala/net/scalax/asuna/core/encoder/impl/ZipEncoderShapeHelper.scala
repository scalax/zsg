package net.scalax.asuna.core.encoder.impl

import net.scalax.asuna.core.encoder.EncoderShape

trait ZipEncoderShapeHelper {

  def zipEncoder[A, B, C, D, E, F, RepCol, DataCol](
      shape1: EncoderShape.Aux[A, B, C, RepCol, DataCol]
    , shape2: EncoderShape.Aux[D, E, F, RepCol, DataCol]
  ): EncoderShape.Aux[(A, D), (B, E), (C, F), RepCol, DataCol] = {
    new EncoderShape[(A, D), RepCol, DataCol] {
      self =>
      override type Target = (C, F)
      override type Data   = (B, E)
      override def wrapRep(base: (A, D)): (C, F) = {
        (shape1.wrapRep(base._1), shape2.wrapRep(base._2))
      }
      override def buildRep(base: (C, F), oldRep: RepCol): RepCol = {
        val repCol2 = shape2.buildRep(base._2, oldRep)
        shape1.buildRep(base._1, repCol2)
      }
      override def buildData(data: (B, E), rep: (C, F), oldData: DataCol): DataCol = {
        val dataCol2 = shape2.buildData(data._2, rep._2, oldData)
        shape1.buildData(data._1, rep._1, dataCol2)
      }
    }
  }

}

object ZipEncoderShapeHelper extends ZipEncoderShapeHelper
