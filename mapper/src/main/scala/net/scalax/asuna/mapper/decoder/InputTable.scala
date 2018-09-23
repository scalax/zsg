package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}

trait DecoderCompiler[Rep, Data, RepCol, DataCol, CaseClass] {
  def compile[Target1](implicit c: DecoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): DecoderShapeValue[CaseClass, RepCol, DataCol]
}
