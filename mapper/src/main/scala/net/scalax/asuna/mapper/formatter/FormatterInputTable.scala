package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.helper.data.macroImpl.FormatterCaseClassMapper

import scala.language.experimental.macros

trait FormatterInputTable[Table, Output] {

  type TempRep
  type TempData

  def inputTable(table: Table): FormatterDataGen.Aux[Output, TempRep, TempData]

}

object FormatterInputTable {

  type Aux[Table, Output, Rep, Temp] = FormatterInputTable[Table, Output] { type TempRep = Rep; type TempData = Temp }

  implicit def encoderDataGenImplicit[Output, Table, Rep, Temp]: FormatterInputTable.Aux[Table, Output, Rep, Temp] =
    macro FormatterCaseClassMapper.FormatterCaseClassMapperImpl.caseclassFormatterGeneric[Output, Table, Rep, Temp]

  def apply[T, O, Rep, Data](f: T => FormatterDataGen.Aux[O, Rep, Data]): FormatterInputTable.Aux[T, O, Rep, Data] = new FormatterInputTable[T, O] {
    override type TempRep  = Rep
    override type TempData = Data
    override def inputTable(table: T): FormatterDataGen.Aux[O, Rep, Data] = f(table)
  }

}
