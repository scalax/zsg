package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}

import scala.language.higherKinds

trait EncoderContent[RepOut, DataType] extends Any

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]]
    extends EncoderDataShapeValueHelper[RepCol, DataCol]
    with EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: EncoderWrapApply[RepCol, DataCol]                                   = EncoderWrapApply.encoderInstance[RepCol, DataCol]
  def singleModel[Case]: EncoderWrapApply[RepCol, DataCol]#TableWrap[Case]                   = wrapApply.withSingleModel[Case]
  def debugSingleModel[Case]: EncoderWrapApply[RepCol, DataCol]#DebugTableWrap[Case]         = wrapApply.debugWithSingleModel[Case]
  def fillSingleModel[Case]: EncoderShapeValue[Case, RepCol, DataCol]                        = ???
  def unusedModel[Model]: EncoderWrapApply[RepCol, DataCol]#UnusedModelWrap[Model]           = wrapApply.withUnusedModel[Model]
  def debugUnusedModel[Model]: EncoderWrapApply[RepCol, DataCol]#DebugUnusedModelWrap[Model] = wrapApply.debugWithUnusedModel[Model]
  def fillLazyeModel[Model]: EncoderShapeValue[Model, RepCol, DataCol]                       = ???
}
