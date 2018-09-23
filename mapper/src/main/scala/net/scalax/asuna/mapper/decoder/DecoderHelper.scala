package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.helper.data.macroImpl.LazyData
import net.scalax.asuna.helper.encoder.{DecoderCoreHelpers, DecoderWrapApply}

import scala.language.higherKinds

trait DecoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: DecoderWrapApply[RepCol, DataCol]               = DecoderWrapApply.decoderInstance[RepCol, DataCol]
  def modelOnly[Case]: DecoderWrapApply[RepCol, DataCol]#TableWrap[Case] = wrapApply.withTable[Case]
  def lazyData[Input, Output, Sub]: DecoderWrapApply[RepCol, DataCol]#LazyDataWrap[Input, Output, Sub] =
    wrapApply.withLazyData[Input, Output, Sub]
}

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _]]
    extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol]
    with DecoderCoreHelpers[RepCol, DataCol] {
  type ShapeValue[CaseClass]                  = DecoderShapeValue[CaseClass, RepCol, DataCol]
  type LazyDataShapeValue[Input, Output, Sub] = DecoderShapeValue[LazyData[Input, Output, Sub], RepCol, DataCol]

  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait DecoderHelper[RepCol, DataCol]
