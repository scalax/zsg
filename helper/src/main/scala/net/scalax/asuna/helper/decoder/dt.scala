package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.decoder.macroImpl.DecoderMapper

import scala.language.experimental.macros
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

trait WrapApply[RepCol, DataCol] {
  def withCase[Table, Case]: CaseWrap[Table, Case] = new CaseWrap[Table, Case] {}
  trait CaseWrap[Table, Case] {
    def compileDecoder[Rep, HListData, Target1](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData], shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] {
      override def inputTable(table: Table): DecoderShapeValue[Case, RepCol, DataCol] = {
        val shape1 = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new DecoderShapeValue[HListData, RepCol, DataCol] {
          override type RepType = Target1
          override val rep = wrappedRep
          override val shape = shape1.packed
        }
        sv.dmap { (hlist: HListData) => repWrap.generic.from(hlist) }
      }
    }

    def aa[Rep, HListData](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]) = {
      new {
        def bb[Target1](implicit shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] {
          override def inputTable(table: Table): DecoderShapeValue[Case, RepCol, DataCol] = {
            val shape1 = shape
            val wrappedRep = shape1.wrapRep(repWrap.input(table))
            val sv = new DecoderShapeValue[HListData, RepCol, DataCol] {
              override type RepType = Target1
              override val rep = wrappedRep
              override val shape = shape1.packed
            }
            sv.dmap { (hlist: HListData) => repWrap.generic.from(hlist) }
          }
        }
      }
    }

    def compileEncoder[Rep, HListData, Target1](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData], shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] {
      override def inputTable(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = {
        val shape1 = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new EncoderShapeValue[HListData, RepCol, DataCol] {
          override type RepType = Target1
          override val rep = wrappedRep
          override val shape = shape1.packed
        }
        sv.emap { hlist => repWrap.generic.to(hlist) }
      }
    }

    def cc[Rep, HListData](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]) = {
      new {
        def dd[Target1](implicit shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] {
          override def inputTable(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = {
            val shape1 = shape
            val wrappedRep = shape1.wrapRep(repWrap.input(table))
            val sv = new EncoderShapeValue[HListData, RepCol, DataCol] {
              override type RepType = Target1
              override val rep = wrappedRep
              override val shape = shape1.packed
            }
            sv.emap { (hlist: Case) => repWrap.generic.to(hlist) }
          }
        }
      }
    }
  }
}

object WrapApply {
  def instance[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}
}

object CaseDecoderRepWrap {
  implicit def caseClassDecoderRepWrap[Table, Case, Target, HListData](implicit genImplicit: Generic.Aux[Case, HListData]): CaseDecoderRepWrap.Aux[Table, Case, Target, HListData] = macro DecoderMapper.DecoderMapperImpl.impl[Table, Case, Target, HListData]

  type Aux[Table, Case, R, HD] = CaseDecoderRepWrap[Table, Case] { type Rep = R; type HListData = HD }

  def context[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}

  def withFunc[Table, Rep1, Case, HListData1](func: Table => Rep1, generic: Generic.Aux[Case, HListData1]): CaseDecoderRepWrap.Aux[Table, Case, Rep1, HListData1] = {
    val generic1 = generic
    new CaseDecoderRepWrap[Table, Case] {
      override type Rep = Rep1
      override type HListData = HListData1
      override def input(table: Table): Rep = func(table)
      override val generic = generic1
    }
  }

}