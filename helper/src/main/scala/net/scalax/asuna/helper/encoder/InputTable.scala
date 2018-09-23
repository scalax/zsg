package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}

trait EncoderCompiler[Rep, Data, RepCol, DataCol, CaseClass] {
  def compile[Target1](implicit c: EncoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): EncoderShapeValue[CaseClass, RepCol, DataCol]
}
