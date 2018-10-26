package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderInputTable[Poly, Table, Input, Output, Unused] {

  type TempRep
  type TempData

  def inputTable(table: Table): EncoderDataGen.Aux[Input, Output, Unused, TempRep, TempData]

}

object EncoderInputTable {

  type Aux[Poly, Table, Input, Output, Unused, Rep, Temp] = EncoderInputTable[Poly, Table, Input, Output, Unused] { type TempRep = Rep; type TempData = Temp }

  def apply[Poly] = new EncoderInputTableApply[Poly] {}

  trait EncoderInputTableApply[Poly] {
    def apply[T, Input, Output, Unused, Rep, Data](
        f: T => EncoderDataGen.Aux[Input, Output, Unused, Rep, Data]
    ): EncoderInputTable.Aux[Poly, T, Input, Output, Unused, Rep, Data] = new EncoderInputTable[Poly, T, Input, Output, Unused] {
      override type TempRep  = Rep
      override type TempData = Data
      override def inputTable(table: T): EncoderDataGen.Aux[Input, Output, Unused, Rep, Data] = f(table)
    }
  }

}

trait FirstEncoderInputTableImplicit {
  implicit def encoderDataGenImplicit[Input, Output, Unused, Table, Rep, Temp]: EncoderInputTable.Aux[
      FirstEncoderInputTableImplicit
    , Table
    , Input
    , Output
    , Unused
    , Rep
    , Temp
  ] =
    macro EncoderCaseClassMapper.EncoderCaseClassMapperImpl.caseclassEncoderGeneric[FirstEncoderInputTableImplicit, Input, Output, Unused, Table, Rep, Temp]
}

object FirstEncoderInputTableImplicit extends FirstEncoderInputTableImplicit
