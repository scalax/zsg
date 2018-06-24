package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.macroImpl.MacroShape

import scala.language.experimental.macros

object CaseClassShapleHelper {

  def shapeFromCase[Table, Case, Abs]: Table => DataShapeValue[Case, Abs] = macro MacroShape.MacroShapeImpl.impl[Table, Case, Abs]

}