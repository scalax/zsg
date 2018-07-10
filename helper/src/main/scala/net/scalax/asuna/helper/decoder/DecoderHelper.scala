package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.{ DataModel, DecoderShape, DecoderShapeValue }
import net.scalax.asuna.core.macroImpl.{ DataModelMacroShape, MacroShape }
import net.scalax.asuna.hepler.{ DataShapeValueHelper, DateModelHelper, DelayTagHelper }

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassShapeMacroHelper[Abs] {
  def caseOnly[Table, Case]: Table => DecoderShapeValue[Case, Abs] = macro MacroShape.MacroShapeImpl.impl[Table, Case, Abs]
  def dataModel[Table, ICase, Case, SubCase]: Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs] = macro DataModelMacroShape.DataModelMacroShapeImpl.impl[Table, ICase, Case, SubCase, Abs]
}

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[Abs, Wrapper[_, _] <: DecoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape[Rep, D, Out, Abs]): Wrapper[Out, D]
}

trait DecoderHelper[Abs] extends CaseClassShapeMacroHelper[Abs] with DataShapeValueHelper[Abs] with DelayTagHelper[Abs] with DateModelHelper[Abs]