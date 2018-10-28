package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderInputTable[Poly, Table, Input, Output, Sub] {

  type TempRep
  type TempData

  def inputTable(table: Table): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData]

}

object DecoderInputTable {

  type Aux[Poly, Table, Input, Output, Sub, Rep, Temp] = DecoderInputTable[Poly, Table, Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

  def apply[Poly] = new DecoderInputTableApply[Poly] {}

  trait DecoderInputTableApply[Poly] {
    def apply[T, Input, Output, Sub, Rep, Data](
        f: T => DecoderDataGen.Aux[Input, Output, Sub, Rep, Data]
    ): DecoderInputTable.Aux[Poly, T, Input, Output, Sub, Rep, Data] = new DecoderInputTable[Poly, T, Input, Output, Sub] {
      override type TempRep  = Rep
      override type TempData = Data
      override def inputTable(table: T): DecoderDataGen.Aux[Input, Output, Sub, Rep, Data] = f(table)
    }
  }

}

trait FirstDecoderInputTableImplicit {
  implicit def decoderDataGenImplicit[Table, Input, Output, Sub, Rep, Temp]: DecoderInputTable.Aux[
      FirstDecoderInputTableImplicit
    , Table
    , Input
    , Output
    , Sub
    , Rep
    , Temp
  ] =
    macro DecoderCaseClassMapper.DecoderCaseClassMapperImpl.caseclassDecoderGeneric[FirstDecoderInputTableImplicit, Table, Input, Output, Sub, Rep, Temp]
}

object FirstDecoderInputTableImplicit extends FirstDecoderInputTableImplicit
