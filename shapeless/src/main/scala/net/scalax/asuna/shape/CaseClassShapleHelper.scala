package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.macroImpl.{ DataModelMacroShape, MacroShape }

import scala.language.experimental.macros

object CaseClassShapleHelper {

  trait CaseClassShapeMacroHelper[Abs] {
    def caseOnly[Table, Case]: Table => DataShapeValue[Case, Abs] = macro MacroShape.MacroShapeImpl.impl[Table, Case, Abs]
    def dataModel[Table, ICase, Case, SubCase]: Table => DataShapeValue[DataModel[ICase, Case, SubCase], Abs] = macro DataModelMacroShape.DataModelMacroShapeImpl.impl[Table, ICase, Case, SubCase, Abs]
  }

}