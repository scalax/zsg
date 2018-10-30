package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}

import scala.language.higherKinds

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]]
    extends EncoderDataShapeValueHelper[RepCol, DataCol]
    with EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: EncoderWrapApply[RepCol, DataCol]                           = EncoderWrapApply.encoderInstance[RepCol, DataCol]
  def singleModel[Case]: EncoderWrapApply[RepCol, DataCol]#TableWrap[Case]           = wrapApply.withSingleModel[Case]
  def debugSingleModel[Case]: EncoderWrapApply[RepCol, DataCol]#DebugTableWrap[Case] = wrapApply.debugWithSingleModel[Case]
  def fillSingleModel[Case]: EncoderShapeValue[Case, RepCol, DataCol]                = ???
  def unusedModel[Input, Output, Unused]: EncoderWrapApply[RepCol, DataCol]#UnusedModelWrap[Input, Output, Unused] =
    wrapApply.withUnusedModel[Input, Output, Unused]
  def debugUnusedModel[Input, Output, Unused]: EncoderWrapApply[RepCol, DataCol]#DebugUnusedModelWrap[Input, Output, Unused] =
    wrapApply.debugWithUnusedModel[Input, Output, Unused]
  def fillLazyeModel[Input, Output, Unused]: EncoderShapeValue[UnusedData[Input, Output, Unused], RepCol, DataCol] = ???

}
