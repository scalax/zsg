package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderInputTable[Table, Input, Output, Unused] {

  type TempRep
  type TempData

  def inputTable(table: Table): EncoderDataGen.Aux[Input, Output, Unused, TempRep, TempData]

}

object EncoderInputTable {

  type Aux[Table, Input, Output, Unused, Rep, Temp] = EncoderInputTable[Table, Input, Output, Unused] { type TempRep = Rep; type TempData = Temp }

  implicit def encoderDataGenImplicit[Input, Output, Unused, Table, Rep, Temp]: EncoderInputTable.Aux[Table, Input, Output, Unused, Rep, Temp] =
    macro EncoderCaseClassMapper.EncoderCaseClassMapperImpl.caseclassEncoderGeneric[Input, Output, Unused, Table, Rep, Temp]

  def apply[T, Input, Output, Unused, Rep, Data](
      f: T => EncoderDataGen.Aux[Input, Output, Unused, Rep, Data]
  ): EncoderInputTable.Aux[T, Input, Output, Unused, Rep, Data] = new EncoderInputTable[T, Input, Output, Unused] {
    override type TempRep  = Rep
    override type TempData = Data
    override def inputTable(table: T): EncoderDataGen.Aux[Input, Output, Unused, Rep, Data] = f(table)
  }

}
