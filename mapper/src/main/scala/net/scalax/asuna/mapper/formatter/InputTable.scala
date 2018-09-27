package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.core.formatter.{FormatterShape, FormatterShapeValue}

trait FormatterCompiler[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol, CaseClass] {
  def compile[Target1](
    implicit c: FormatterShape.Aux[Rep, Data, Target1, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[CaseClass, RepCol, EncoderDataCol, DecoderDataCol]
}
