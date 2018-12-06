package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.core.encoder.EncoderShape

import scala.annotation.implicitNotFound

trait EncoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message] {
  type Target
  def shape: EncoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
}

object EncoderDebugShape {

  @implicitNotFound(
      msg = "EncoderShape not found in this property.\nRepIndex: ${ErrorIndex}\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}\nDataCol: ${DataCol}\n\n" +
      "If RepType is some of CaseClassRepMapper?, replace ${EncoderField} to ${RepField} and continue debug.\n" +
      "If not, define context.debugSingleModel or context.debugUnusedModel to find the implicit not found column${Message}"
  )
  type Aux[Rep, Data, T, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message] =
    EncoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message] {
      type Target = T
    }

  implicit def encoderDebugShapeImplicit[Rep, Data, Target, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message](
      implicit shape: EncoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
  ): EncoderDebugShape.Aux[Rep, Data, Target, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message] = {
    type Target1 = Target
    val shape1 = shape
    new EncoderDebugShape[Rep, Data, RepCol, DataCol, ErrorIndex, EncoderField, RepField, Message] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
