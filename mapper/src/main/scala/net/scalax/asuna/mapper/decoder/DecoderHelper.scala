package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.core.decoder.DecoderShape

import scala.language.higherKinds

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _]]
    extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol]
    with DecoderCoreHelpers[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait DecoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: DecoderWrapApply[RepCol, DataCol]                           = DecoderWrapApply.decoderInstance[RepCol, DataCol]
  def singleModel[Case]: DecoderWrapApply[RepCol, DataCol]#TableWrap[Case]           = wrapApply.withTable[Case]
  def debugSingleModel[Case]: DecoderWrapApply[RepCol, DataCol]#DebugTableWrap[Case] = wrapApply.debugWithTable[Case]
  def lazyModel[Input, Output, Sub]: DecoderWrapApply[RepCol, DataCol]#LazyModelWrap[Input, Output, Sub] =
    wrapApply.withLazyModel[Input, Output, Sub]
}

trait DecoderHelper[RepCol, DataCol]
