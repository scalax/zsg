package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.helper.data.macroImpl.FormatterCaseClassMapper

import scala.language.experimental.macros

trait FormatterInputTable[Poly, Table, Output] {

  type TempRep
  type TempData

  def inputTable(table: Table): FormatterDataGen.Aux[Output, TempRep, TempData]

}

object FormatterInputTable {

  type Aux[Poly, Table, Output, Rep, Temp] = FormatterInputTable[Poly, Table, Output] { type TempRep = Rep; type TempData = Temp }

  def apply[Poly] = new FormatterInputTableApply[Poly] {}

  trait FormatterInputTableApply[Poly] {
    def apply[T, O, Rep, Data](f: T => FormatterDataGen.Aux[O, Rep, Data]): FormatterInputTable.Aux[Poly, T, O, Rep, Data] =
      new FormatterInputTable[Poly, T, O] {
        override type TempRep  = Rep
        override type TempData = Data
        override def inputTable(table: T): FormatterDataGen.Aux[O, Rep, Data] = f(table)
      }
  }

}

trait FirstFormatterInputTableImplicit {
  implicit def encoderDataGenImplicit[Table, Output, Rep, Temp]: FormatterInputTable.Aux[FirstFormatterInputTableImplicit, Table, Output, Rep, Temp] =
    macro FormatterCaseClassMapper.FormatterCaseClassMapperImpl.caseclassFormatterGeneric[FirstFormatterInputTableImplicit, Table, Output, Rep, Temp]
}

object FirstFormatterInputTableImplicit extends FirstFormatterInputTableImplicit
