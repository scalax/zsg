package org.scalax.asuna.mapper.decoder

import org.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}

import scala.language.higherKinds

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _]]
    extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol]
    with DecoderCoreHelpers[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait DecoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: DecoderWrapApply[RepCol, DataCol]                               = DecoderWrapApply.decoderInstance[RepCol, DataCol]
  def singleModel[Case]: DecoderWrapApply[RepCol, DataCol]#TableWrap[Case]               = wrapApply.withSingleModel[Case]
  def debugSingleModel[Output]: DecoderWrapApply[RepCol, DataCol]#DebugTableWrap[Output] = wrapApply.debugWithSingleModel[Output]
  def fillSingleModel[Case]: DecoderShapeValue[Case, RepCol, DataCol]                    = ???
  def lazyModel[L]: DecoderWrapApply[RepCol, DataCol]#LazyModelWrap[L] =
    wrapApply.withLazyModel[L]
  def debugLazyModel[L]: DecoderWrapApply[RepCol, DataCol]#DebugLazyModelWrap[L] =
    wrapApply.debugWithLazyModel[L]
  def fillLazyeModel[L]: DecoderShapeValue[L, RepCol, DataCol] = ???

}

trait DecoderHelper[RepCol, DataCol]
