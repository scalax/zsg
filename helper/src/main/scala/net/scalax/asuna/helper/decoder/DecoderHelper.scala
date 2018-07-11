package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.{ DataModel, DecoderShape, DecoderShapeValue }
import net.scalax.asuna.helper.decoder.macroImpl.{ DecoderDataModelMapper, DecoderMapper }

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassShapeMacroHelper[Abs] {
  def caseOnly[Table, Case]: Table => DecoderShapeValue[Case, Abs] = macro DecoderMapper.DecoderMapperImpl.impl[Table, Case, Abs]
  def dataModel[Table, ICase, Case, SubCase]: Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs] = macro DecoderDataModelMapper.DecoderDataModelMapperImpl.impl[Table, ICase, Case, SubCase, Abs]
}

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[Abs, Wrapper[_, _] <: DecoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape[Rep, D, Out, Abs]): Wrapper[Out, D]
}

trait DecoderHelper[Abs] extends CaseClassShapeMacroHelper[Abs] with DecoderDataShapeValueHelper[Abs] with DecoderDelayTagHelper[Abs] with DecoderDateModelHelper[Abs]