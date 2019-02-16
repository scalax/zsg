package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderInputTable[Poly, Table, Model] {

  type TempRep
  type TempData

  def inputTable(table: Table): EncoderDataGen.Aux[Model, TempRep, TempData]

}

object EncoderInputTable {

  type Aux[Poly, Table, Model, Rep, Temp] = EncoderInputTable[Poly, Table, Model] { type TempRep = Rep; type TempData = Temp }

  def apply[Poly] = new EncoderInputTableApply[Poly] {}

  trait EncoderInputTableApply[Poly] {
    def apply[T, Model, Rep, Data](
        f: T => EncoderDataGen.Aux[Model, Rep, Data]
    ): EncoderInputTable.Aux[Poly, T, Model, Rep, Data] = new EncoderInputTable[Poly, T, Model] {
      override type TempRep  = Rep
      override type TempData = Data
      override def inputTable(table: T): EncoderDataGen.Aux[Model, Rep, Data] = f(table)
    }
  }

}

trait FirstEncoderInputTableImplicit {
  implicit def encoderDataGenImplicit[Table, Model, Rep, Temp]: EncoderInputTable.Aux[
      FirstEncoderInputTableImplicit
    , Table
    , Model
    , Rep
    , Temp
  ] =
    macro EncoderCaseClassMapper.EncoderCaseClassMapperImpl.caseClassEncoderGeneric[FirstEncoderInputTableImplicit, Table, Model, Rep, Temp]
}

object FirstEncoderInputTableImplicit extends FirstEncoderInputTableImplicit
