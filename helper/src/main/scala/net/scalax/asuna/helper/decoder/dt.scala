package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}

import shapeless.Generic

trait CaseDecoderRepWrap[Table, Case] {

  type Rep
  type HListData

  def input(table: Table): Rep

  def generic: Generic.Aux[Case, HListData]

}

trait InputTable[Table, OutPut] {
  def inputTable(table: Table): OutPut
}

object InputTable {
  def apply[T, O](f: T => O): InputTable[T, O] = new InputTable[T, O] {
    override def inputTable(table: T): O = f(table)
  }
}

trait DecoderInputTable[Table, Rep, Data, RepCol, DataCol, CaseClass] {
  def inputTable[Target1](table: Table)(implicit c: DecoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): DecoderShapeValue[CaseClass, RepCol, DataCol]
}

trait EncoderInputTable[Table, Rep, Data, RepCol, DataCol, CaseClass] {
  def inputTable[Target1](table: Table)(implicit c: EncoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): EncoderShapeValue[CaseClass, RepCol, DataCol]
}
