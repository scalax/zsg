package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderInputTable[Table, Input, Output, Sub] {

  type TempRep
  type TempData

  def inputTable(table: Table): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData]

}

object DecoderInputTable {

  type Aux[Table, Input, Output, Sub, Rep, Temp] = DecoderInputTable[Table, Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

  implicit def decoderDataGenImplicit[Table, Input, Output, Sub, Rep, Temp]: DecoderInputTable.Aux[Table, Input, Output, Sub, Rep, Temp] =
    macro DecoderCaseClassMapper.DecoderCaseClassMapperImpl.caseclassDecoderGeneric[Input, Output, Sub, Table, Rep, Temp]

  def apply[T, Input, Output, Sub, Rep, Data](
      f: T => DecoderDataGen.Aux[Input, Output, Sub, Rep, Data]
  ): DecoderInputTable.Aux[T, Input, Output, Sub, Rep, Data] = new DecoderInputTable[T, Input, Output, Sub] {
    override type TempRep  = Rep
    override type TempData = Data
    override def inputTable(table: T): DecoderDataGen.Aux[Input, Output, Sub, Rep, Data] = f(table)
  }

}
