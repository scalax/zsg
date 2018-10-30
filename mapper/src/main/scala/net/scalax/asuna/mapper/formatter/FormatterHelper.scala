package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.core.formatter.FormatterShape

import scala.language.higherKinds

trait FormatterContent[RepOut, DataType]

trait FormatterWrapperHelper[RepCol, EncoderDataCol, DecoderDataCol, Wrapper[_, _] <: FormatterContent[_, _]]
    extends FormatterDataShapeValueHelper[RepCol, EncoderDataCol, DecoderDataCol]
    with FormatterCaseClassShapeMacroHelper[RepCol, EncoderDataCol, DecoderDataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: FormatterShape.Aux[Rep, D, Out, RepCol, EncoderDataCol, DecoderDataCol]): Wrapper[Out, D]
}

trait FormatterCaseClassShapeMacroHelper[RepCol, EncoderDataCol, DecoderDataCol] {
  private val wrapApply: FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol]                           = FormatterWrapApply.formatterInstance[RepCol, EncoderDataCol, DecoderDataCol]
  def singleModel[Case]: FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol]#CaseWrap[Case]            = wrapApply.withModel[Case]
  def debugSingleModel[Case]: FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol]#DebugTableWrap[Case] = wrapApply.debugWithTable[Case]
}
