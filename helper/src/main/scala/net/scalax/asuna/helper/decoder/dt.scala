package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import shapeless.Generic

trait CaseDecoderRepWrap[Table, Case, RepCol, DataCol] {

  type Rep
  type HListData

  def input(table: Table): Rep

  def dataTransform(model: HListData): Case

  def withShape[Target1](implicit shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): Table => DecoderShapeValue[Case, RepCol, DataCol] = { table: Table =>
    val shape1 = shape
    val wrappedRep = shape1.wrapRep(input(table))
    val sv = new DecoderShapeValue[HListData, RepCol, DataCol] {
      override type RepType = Target1
      override val rep = wrappedRep
      override val shape = shape1.packed
    }
    sv.dmap { (hlist: HListData) => dataTransform(hlist) }
  }

}

object CaseDecoderRepWrap {
  type Aux[Table, Case, R, HD, RepCol, DatCol] = CaseDecoderRepWrap[Table, Case, RepCol, DatCol] { type Rep = R; type HListData = HD }

  trait WrapApply[RepCol, DataCol] {
    def withFunc[Table, Rep1, Case, HListData1](func: Table => Rep1, mg: ModelGen[Case], generic: Generic.Aux[Case, HListData1]): CaseDecoderRepWrap.Aux[Table, Case, Rep1, HListData1, RepCol, DataCol] = new CaseDecoderRepWrap[Table, Case, RepCol, DataCol] {
      override type Rep = Rep1
      override type HListData = HListData1
      override def input(table: Table): Rep = func(table)
      override def dataTransform(model: HListData1): Case = generic.from(model)
    }
  }

  def value[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}
}