package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.core.encoder.EncoderShape.Aux
import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.helper.data.macroImpl._
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

trait WrapApply[RepCol, DataCol] {
  def withCase[Table, Case]: CaseWrap[Table, Case] = new CaseWrap[Table, Case] {}
  trait CaseWrap[Table, Case] {

    def compileDecoder2222[Rep, TempData](
        implicit repWrap: InputTable[Table, DecoderDataGen.Aux[EmptyLazyInput, Case, EmptyLazyOutput, Rep, TempData]]
    ): DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] = new DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] {
      override def inputTable[Target1](
          table: Table
      )(implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): DecoderShapeValue[Case, RepCol, DataCol] = {
        val shape1     = shape
        val wrap       = repWrap.inputTable(table)
        val wrappedRep = shape1.wrapRep(wrap.rep)
        val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
          override type RepType = Target1
          override val rep   = wrappedRep
          override val shape = shape1.packed
        }
        sv.dmap { (content: TempData) =>
          wrap.from(content, wrap.rep).apply(EmptyLazyInput.value)
        }
      }
    }

    def compileDecoder3333[Rep, TempData, Input, Output, Sub](
        implicit cv: Case <:< LazyData[Input, Output, Sub]
      , repWrap: InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]
    ): DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, LazyData[Input, Output, Sub]] =
      new DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, LazyData[Input, Output, Sub]] {
        override def inputTable[Target1](
            table: Table
        )(implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): DecoderShapeValue[LazyData[Input, Output, Sub], RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content, wrap.rep)
          }
        }
      }

    def compileDecoderHList[Rep, HListData, Target1](
        implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]
      , shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]
    ): InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] {
      override def inputTable(table: Table): DecoderShapeValue[Case, RepCol, DataCol] = {
        val shape1     = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new DecoderShapeValue[HListData, RepCol, DataCol] {
          override type RepType = Target1
          override val rep   = wrappedRep
          override val shape = shape1.packed
        }
        sv.dmap { (hlist: HListData) =>
          repWrap.generic.from(hlist)
        }
      }
    }

    def aa[Rep, HListData](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]) = {
      new {
        def bb[Target1](
            implicit shape: DecoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]
        ): InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] =
          new InputTable[Table, DecoderShapeValue[Case, RepCol, DataCol]] {
            override def inputTable(table: Table): DecoderShapeValue[Case, RepCol, DataCol] = {
              val shape1     = shape
              val wrappedRep = shape1.wrapRep(repWrap.input(table))
              val sv = new DecoderShapeValue[HListData, RepCol, DataCol] {
                override type RepType = Target1
                override val rep   = wrappedRep
                override val shape = shape1.packed
              }
              sv.dmap { (hlist: HListData) =>
                repWrap.generic.from(hlist)
              }
            }
          }
      }
    }

    def compileEncoder2222[Rep, TempData](
        implicit repWrap: InputTable[Table, EncoderDataGen.Aux[Case, Rep, TempData]]
    ): EncoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] =
      new EncoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] {
        override def inputTable[Target1](
            table: Table
        )(implicit shape: Aux[Rep, TempData, Target1, RepCol, DataCol]): EncoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new EncoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.emap { (content: Case) =>
            wrap.to(content, wrap.rep)
          }
        }
      }

    def compileEncoderHList[Rep, HListData, Target1](
        implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]
      , shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]
    ): InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] = new InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] {
      override def inputTable(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = {
        val shape1     = shape
        val wrappedRep = shape1.wrapRep(repWrap.input(table))
        val sv = new EncoderShapeValue[HListData, RepCol, DataCol] {
          override type RepType = Target1
          override val rep   = wrappedRep
          override val shape = shape1.packed
        }
        sv.emap { hlist =>
          repWrap.generic.to(hlist)
        }
      }
    }

    def cc[Rep, HListData](implicit repWrap: CaseDecoderRepWrap.Aux[Table, Case, Rep, HListData]) = {
      new {
        def dd[Target1](
            implicit shape: EncoderShape.Aux[Rep, HListData, Target1, RepCol, DataCol]
        ): InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] =
          new InputTable[Table, EncoderShapeValue[Case, RepCol, DataCol]] {
            override def inputTable(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = {
              val shape1     = shape
              val wrappedRep = shape1.wrapRep(repWrap.input(table))
              val sv = new EncoderShapeValue[HListData, RepCol, DataCol] {
                override type RepType = Target1
                override val rep   = wrappedRep
                override val shape = shape1.packed
              }
              sv.emap { (hlist: Case) =>
                repWrap.generic.to(hlist)
              }
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
  implicit def caseClassDecoderRepWrap[Table, Case, Target, HListData](
      implicit genImplicit: Generic.Aux[Case, HListData]
  ): CaseDecoderRepWrap.Aux[Table, Case, Target, HListData] =
    macro DecoderMapper.DecoderMapperImpl.impl[Table, Case, Target, HListData]

  type Aux[Table, Case, R, HD] = CaseDecoderRepWrap[Table, Case] { type Rep = R; type HListData = HD }

  def context[RepCol, DataCol]: WrapApply[RepCol, DataCol] = new WrapApply[RepCol, DataCol] {}

  def withFunc[Table, Rep1, Case, HListData1](
      func: Table => Rep1
    , generic: Generic.Aux[Case, HListData1]
  ): CaseDecoderRepWrap.Aux[Table, Case, Rep1, HListData1] = {
    val generic1 = generic
    new CaseDecoderRepWrap[Table, Case] {
      override type Rep       = Rep1
      override type HListData = HListData1
      override def input(table: Table): Rep = func(table)
      override val generic                  = generic1
    }
  }

}
