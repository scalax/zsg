package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.hepler.EncoderDataShapeValueHelper

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassEncoderShapeMapperHelper[Abs] {
  def caseOnly[Table, Case]: Table => EncoderShapeValue[Case, Abs] = macro EncoderMapper.EncoderMapperImpl.impl[Table, Case, Abs]
}

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[Abs, Wrapper[_, _] <: EncoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, Abs]): Wrapper[Out, D]
}

trait EncoderHelper[Abs] extends EncoderDataShapeValueHelper[Abs] with CaseClassEncoderShapeMapperHelper[Abs]