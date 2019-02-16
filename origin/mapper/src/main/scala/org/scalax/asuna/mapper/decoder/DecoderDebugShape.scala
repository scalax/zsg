package org.scalax.asuna.mapper.decoder

import org.scalax.asuna.core.decoder.DecoderShape

import scala.annotation.implicitNotFound

trait DecoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message] {
  type Target
  def shape: DecoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
}

object DecoderDebugShape {

  @implicitNotFound(
      msg = "DecoderShape not found in this property.\nRepIndex: ${ErrorIndex}\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}\nDataCol: ${DataCol}\n\n" +
      "If RepType is some of CaseClassRepMapper?, replace ${DecoderField} to ${RepField} and continue debug.\n" +
      "If not, define context.debugSingleModel or context.debugUnusedModel to find the implicit not found column${Message}"
  )
  type Aux[Rep, Data, T, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message] =
    DecoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message] { type Target = T }

  implicit def decoderDebugShapeImplicit[Rep, Data, Target, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message](
      implicit shape: DecoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
  ): DecoderDebugShape.Aux[Rep, Data, Target, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message] = {
    type Target1 = Target
    val shape1 = shape
    new DecoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, DecoderField, RepField, Message] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
