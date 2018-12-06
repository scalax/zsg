package org.scalax.asuna.mapper.formatter

import org.scalax.asuna.core.formatter.FormatterShape

import scala.annotation.implicitNotFound

trait FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message] {
  type Target
  def shape: FormatterShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol]
}

object FormatterDebugShape {

  @implicitNotFound(
      msg = "FormatterShape not found in this property.\nRepIndex: ${ErrorIndex}\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}\nEncoderDataCol: ${EncoderDataCol}\nDecoderDataCol: ${DecoderDataCol}\n\n" +
      "If RepType is some of CaseClassRepMapper?, replace ${FormatterField} to ${RepField} and continue debug.\n" +
      "If not, define context.debugSingleModel or context.debugUnusedModel to find the implicit not found column${Message}"
  )
  type Aux[Rep, Data, T, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message] =
    FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message] { type Target = T }

  implicit def formatterDebugShapeImplicit[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message](
      implicit shape: FormatterShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterDebugShape.Aux[Rep, Data, Target, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message] = {
    type Target1 = Target
    val shape1 = shape
    new FormatterDebugShape[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol, ErrorIndex, FormatterField, RepField, Message] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
