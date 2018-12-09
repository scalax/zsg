package org.scalax.asuna.mapper.decoder

import org.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderInputTable[Poly, Table, LazyModel] {

  type TempRep
  type TempData

  def inputTable(table: Table): DecoderDataGen.Aux[LazyModel, TempRep, TempData]

}

object DecoderInputTable {

  type Aux[Poly, Table, LazyModel, Rep, Temp] = DecoderInputTable[Poly, Table, LazyModel] { type TempRep = Rep; type TempData = Temp }

  def apply[Poly] = new DecoderInputTableApply[Poly] {}

  trait DecoderInputTableApply[Poly] {
    def apply[T, LazyModel, Rep, Data](
        f: T => DecoderDataGen.Aux[LazyModel, Rep, Data]
    ): DecoderInputTable.Aux[Poly, T, LazyModel, Rep, Data] = new DecoderInputTable[Poly, T, LazyModel] {
      override type TempRep  = Rep
      override type TempData = Data
      override def inputTable(table: T): DecoderDataGen.Aux[LazyModel, Rep, Data] = f(table)
    }
  }

}

trait FirstDecoderInputTableImplicit {
  implicit def decoderDataGenImplicit[Table, LazyModel, Rep, Temp]: DecoderInputTable.Aux[
      FirstDecoderInputTableImplicit
    , Table
    , LazyModel
    , Rep
    , Temp
  ] =
    macro DecoderCaseClassMapper.DecoderCaseClassMapperImpl.caseClassDecoderGeneric[FirstDecoderInputTableImplicit, Table, LazyModel, Rep, Temp]
}

object FirstDecoderInputTableImplicit extends FirstDecoderInputTableImplicit
