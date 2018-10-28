package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.helper.data.macroImpl.FormatterCaseClassMapper
import net.scalax.asuna.mapper.formatter.FormatterInputTable

import scala.language.experimental.macros

trait FormatterBlackBoxInputTable {
  implicit def formatterDataGenImplicit[Table, Output]: FormatterBlackBoxInputTable.Aux[FormatterBlackBoxInputTable, Table, Output] =
    macro FormatterCaseClassMapper.BlackboxFormatterCaseClassMapperImpl.caseclassFormatterGeneric[FormatterBlackBoxInputTable, Table, Output, Any, Any]
}

object FormatterBlackBoxInputTable extends FormatterBlackBoxInputTable {

  type Aux[Poly, Table, Output] = FormatterInputTable[Poly, Table, Output] { type TempRep = Any; type TempData = Any }

}
