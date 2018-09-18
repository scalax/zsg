package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.DecoderShape
import net.scalax.asuna.helper.encoder.{DecoderCoreHelpers, DecoderWrapApply}

import scala.language.higherKinds

trait DecoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: DecoderWrapApply[RepCol, DataCol]                           = DecoderWrapApply.decoderInstance[RepCol, DataCol]
  def caseOnly[Table, Case]: DecoderWrapApply[RepCol, DataCol]#CaseWrap[Table, Case] = wrapApply.withCase[Table, Case]
  def lazyData[Table, Input, Output, Sub]: DecoderWrapApply[RepCol, DataCol]#LazyDataWrap[Table, Input, Output, Sub] =
    wrapApply.withLazyData[Table, Input, Output, Sub]
}

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _]]
    extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol]
    with DecoderCoreHelpers[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait DecoderHelper[RepCol, DataCol]
