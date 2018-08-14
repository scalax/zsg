package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }

trait HListEncoderShapeWrap[Rep, Data, RepCol, DataCol] {

  val rep: Rep
  val columnInfo: MacroColumnInfo

}

trait EncoderWitCol[RepCol, DataCol] {
  def toWrap[T, D](rep: T, pro: PropertyType[D], columnInfo: MacroColumnInfo): HListEncoderShapeWrap[T, D, RepCol, DataCol] = {
    val rep1 = rep
    val columnInfo1 = columnInfo
    new HListEncoderShapeWrap[T, D, RepCol, DataCol] {
      override val rep: T = rep1
      override val columnInfo = columnInfo1
    }
  }
}

object EncoderWitCol {
  def value[RepCol, DataCol]: EncoderWitCol[RepCol, DataCol] = new EncoderWitCol[RepCol, DataCol] {}
}

trait CaseRepWrap[Table, Case, RepCol, DataCol] {

  type Rep
  def input(table: Table): Rep

}

object CaseRepWrap {
  type Aux[Table, Case, R, RepCol, DatCol] = CaseRepWrap[Table, Case, RepCol, DatCol] { type Rep = R }

  trait WrapApply[RepCol, DataCol] {
    def withFunc[Table, Rep1, Case](func: Table => Rep1, mg: ModelGen[Case]): CaseRepWrap.Aux[Table, Case, Rep1, RepCol, DataCol] = new CaseRepWrap[Table, Case, RepCol, DataCol] {
      override type Rep = Rep1
      override def input(table: Table): Rep = func(table)
    }
  }

  def value[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}
}

trait AsunaEncoderGenericContent[RepCol, DataCol] {

}