package net.scalax.asuna.core.formatter

import net.scalax.asuna.core.common.CommonProvenShape
import net.scalax.asuna.core.decoder.{DecoderProvenShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderProvenShape

trait FormatterProvenShape[U, RepCol, EncoderDataCol, DecoderDataCol]
    extends EncoderProvenShape[U, RepCol, EncoderDataCol]
    with DecoderProvenShape[U, RepCol, DecoderDataCol]
    with CommonProvenShape[U, RepCol] {
  override val dataShapeValue: FormatterShapeValue[U, RepCol, EncoderDataCol, DecoderDataCol]
}

object FormatterProvenShape {

  /*implicit def dataProvenShapeShape[U, RepCol, EncoderDataCol, DecoderDataCol, R <: FormatterProvenShape[U, RepCol, EncoderDataCol, DecoderDataCol]]
    : FormatterShape.Aux[R, U, R, RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[R, RepCol, EncoderDataCol, DecoderDataCol] {
      self =>
      override type Target = R
      override type Data   = U
      override def wrapRep(base: R): R = base
      override def buildRep(base: R, baseRep: RepCol): RepCol =
        base.dataShapeValue.shape.buildRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), baseRep)
      override def takeData(rep: R, oldData: DecoderDataCol): SplitData[U, DecoderDataCol] =
        rep.dataShapeValue.shape.takeData(rep.dataShapeValue.rep, oldData)
      override def buildData(data: U, rep: R, oldData: EncoderDataCol): EncoderDataCol =
        rep.dataShapeValue.shape.buildData(data, rep.dataShapeValue.rep, oldData)
    }

  }*/

}
