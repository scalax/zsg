package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.{ CaseModelContent2222, SetterContent }
import net.scalax.asuna.helper.decoder.macroImpl.DecoderMapper

import scala.language.experimental.macros
import shapeless.Generic

trait CaseDecoderRepWrap[Table, Case] {

  type Rep
  type HListData

  def input(table: Table): Rep

  def generic: Generic.Aux[Case, HListData]

}

trait CaseDecoderRepWrap1111[Table, Case] {
  type Rep
  val caseContent: CaseModelContent2222[Case]
  def input(table: Table): Rep
}
object CaseDecoderRepWrap1111 {
  type Aux[R, Table, Case] = CaseDecoderRepWrap1111[Table, Case] { type Rep = R }
  implicit def caseClassDecoderRepWrap[Rep, Table, Case](implicit content: CaseModelContent2222[Case]): CaseDecoderRepWrap1111.Aux[Rep, Table, Case] = macro DecoderMapper.DecoderMapperImpl1111.impl1111[Rep, Table, Case]

  def withFunc1111[Table, Rep1, Case, HListData1](func: Table => Rep1, content: CaseModelContent2222[Case]): CaseDecoderRepWrap1111.Aux[Rep1, Table, Case] = {
    new CaseDecoderRepWrap1111[Table, Case] {
      override type Rep = Rep1
      override def input(table: Table): Rep = func(table)
      override val caseContent = content
    }
  }
}

trait InputTable[Table, OutPut] {
  def inputTable(table: Table): OutPut
}

trait DecoderInputTable[Table, Rep, Data, RepCol, DataCol, CaseClass] {
  def inputTable[Target1](table: Table)(implicit c: DecoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): DecoderShapeValue[CaseClass, RepCol, DataCol]
}

trait EncoderInputTable[Table, Rep, Data, RepCol, DataCol, CaseClass] {
  def inputTable[Target1](table: Table)(implicit c: EncoderShape.Aux[Rep, Data, Target1, RepCol, DataCol]): EncoderShapeValue[CaseClass, RepCol, DataCol]
}

trait WrapApply[RepCol, DataCol] {
  def withCase[Table, Case]: CaseWrap[Table, Case] = new CaseWrap[Table, Case] {}
  trait CaseWrap[Table, Case] {

    def compileDecoder1111[Rep](implicit repWrap: CaseDecoderRepWrap1111.Aux[Rep, Table, Case]): DecoderInputTable[Table, Rep, SetterContent => SetterContent, RepCol, DataCol, Case] = new DecoderInputTable[Table, Rep, SetterContent => SetterContent, RepCol, DataCol, Case] {
      override def inputTable[Target1](table: Table)(implicit shape: DecoderShape.Aux[Rep, SetterContent => SetterContent, Target1, RepCol, DataCol]): DecoderShapeValue[Case, RepCol, DataCol] = {
        val shape1 = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new DecoderShapeValue[SetterContent => SetterContent, RepCol, DataCol] {
          override type RepType = Target1
          override val rep = wrappedRep
          override val shape = shape1.packed
        }
        sv.dmap { (content: SetterContent => SetterContent) => repWrap.caseContent.toModel(content(CaseModelContent2222.empty)) }
      }
    }

    def compileDecoderHList[Rep, HListData, Target1](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData], shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] {
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

    def compileEncoder1111[Rep](implicit repWrap: CaseDecoderRepWrap1111.Aux[Rep, Table, Case]): EncoderInputTable[Table, Rep, Symbol => Any, RepCol, DataCol, Case] = new EncoderInputTable[Table, Rep, Symbol => Any, RepCol, DataCol, Case] {
      override def inputTable[Target1](table: Table)(implicit shape: EncoderShape.Aux[Rep, Symbol => Any, Target1, RepCol, DataCol]): EncoderShapeValue[Case, RepCol, DataCol] = {
        val shape1 = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new EncoderShapeValue[Symbol => Any, RepCol, DataCol] {
          override type RepType = Target1
          override val rep = wrappedRep
          override val shape = shape1.packed
        }
        sv.emap { (content: Case) => { symbol: Symbol => repWrap.caseContent.get(content, symbol) } }
      }
    }

    def compileEncoderHList[Rep, HListData, Target1](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData], shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]): InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] {
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