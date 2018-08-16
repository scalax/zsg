package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import shapeless.Generic

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
  type HListData

  def input(table: Table): Rep

  def dataTransform(model: Case): HListData

  def withShape[Target1](implicit shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): Table => EncoderShapeValue[Case, RepCol, DataCol] = { table: Table =>
    val shape1 = shape
    val tableShape = new EncoderShape[Table, Case, RepCol, DataCol] {
      override type Target = Target1
      override def wrapRep(base: Table): Target1 = shape1.wrapRep(input(base))

      override def toLawRep(base: Target1, oldRep: RepCol): RepCol = shape1.toLawRep(base, oldRep)

      override def buildData(data: Case, rep: Target1, oldData: DataCol): DataCol = shape.buildData(dataTransform(data), rep, oldData)
    }
    new EncoderShapeValue[Case, RepCol, DataCol] {
      override type RepType = Target1
      override val rep = tableShape.wrapRep(table)
      override val shape = tableShape.packed
    }
  }

}

object CaseRepWrap {
  type Aux[Table, Case, R, HD, RepCol, DatCol] = CaseRepWrap[Table, Case, RepCol, DatCol] { type Rep = R; type HListData = HD }

  trait WrapApply[RepCol, DataCol] {
    def withFunc[Table, Rep1, Case, HListData1](func: Table => Rep1, mg: ModelGen[Case], generic: Generic.Aux[Case, HListData1]): CaseRepWrap.Aux[Table, Case, Rep1, HListData1, RepCol, DataCol] = new CaseRepWrap[Table, Case, RepCol, DataCol] {
      override type Rep = Rep1
      override type HListData = HListData1
      override def input(table: Table): Rep = func(table)
      override def dataTransform(model: Case): HListData1 = generic.to(model)
    }
  }

  def value[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}
}

trait AsunaEncoderGenericContent[RepCol, DataCol] {

}