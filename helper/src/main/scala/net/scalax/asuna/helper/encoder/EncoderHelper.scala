package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape

import scala.language.higherKinds

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]]
    extends EncoderDataShapeValueHelper[RepCol, DataCol]
    with EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait EncoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  private val wrapApply: EncoderWrapApply[RepCol, DataCol]                           = EncoderWrapApply.encoderInstance[RepCol, DataCol]
  def caseOnly[Table, Case]: EncoderWrapApply[RepCol, DataCol]#CaseWrap[Table, Case] = wrapApply.withCase[Table, Case]
}
