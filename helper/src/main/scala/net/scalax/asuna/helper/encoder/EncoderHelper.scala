package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.decoder.DecoderCaseClassShapeMacroHelper

import scala.language.higherKinds

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]] extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol] with EncoderDataShapeValueHelper[RepCol, DataCol] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}
