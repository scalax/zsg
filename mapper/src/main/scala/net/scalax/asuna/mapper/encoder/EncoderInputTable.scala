package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderInputTable[Table, Output] {

  type TempRep
  type TempData

  def inputTable(table: Table): EncoderDataGen.Aux[Output, TempRep, TempData]

}

object EncoderInputTable {

  type Aux[Table, Output, Rep, Temp] = EncoderInputTable[Table, Output] { type TempRep = Rep; type TempData = Temp }

  implicit def encoderDataGenImplicit[Output, Table, Rep, Temp]: EncoderInputTable.Aux[Table, Output, Rep, Temp] =
    macro EncoderCaseClassMapper.EncoderCaseClassMapperImpl.caseclassEncoderGeneric[Output, Table, Rep, Temp]

  def apply[T, O, Rep, Data](f: T => EncoderDataGen.Aux[O, Rep, Data]): EncoderInputTable.Aux[T, O, Rep, Data] = new EncoderInputTable[T, O] {
    override type TempRep  = Rep
    override type TempData = Data
    override def inputTable(table: T): EncoderDataGen.Aux[O, Rep, Data] = f(table)
  }

}
