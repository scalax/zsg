package net.scalax.asuna.core

import net.scalax.asuna.core.macroImpl.{ DataModelMacroShape, MacroShape }
import net.scalax.asuna.hepler._

import scala.language.experimental.macros

trait CaseClassShapeMacroHelper[Abs] {
  def caseOnly[Table, Case]: Table => DataShapeValue[Case, Abs] = macro MacroShape.MacroShapeImpl.impl[Table, Case, Abs]
  def dataModel[Table, ICase, Case, SubCase]: Table => DataShapeValue[DataModel[ICase, Case, SubCase], Abs] = macro DataModelMacroShape.DataModelMacroShapeImpl.impl[Table, ICase, Case, SubCase, Abs]
}

trait AllHelper[Abs] extends CaseClassShapeMacroHelper[Abs] with DataShapeValueHelper[Abs] with DelayTagHelper[Abs] with DateModelHelper[Abs]