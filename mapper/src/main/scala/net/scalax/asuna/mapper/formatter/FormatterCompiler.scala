package org.scalax.asuna.mapper.formatter

import org.scalax.asuna.core.formatter.{FormatterShape, FormatterShapeValue}

trait FormatterCompiler[Rep, Data, RepCol, EncoderDataCol, DecoderDataCol, CaseClass] {
  def compile[Target1](
      implicit c: FormatterShape.Aux[Rep, Data, Target1, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShapeValue[CaseClass, RepCol, EncoderDataCol, DecoderDataCol]

  def debugCompile: Rep

  def alwaysCompile: FormatterShapeValue[CaseClass, RepCol, EncoderDataCol, DecoderDataCol] = ???
}
