package org.scalax.asuna.mapper.formatter

import org.scalax.asuna.core.formatter.{FormatterShape, FormatterShapeValue}
import org.scalax.asuna.helper.data.macroImpl.FormatterCaseClassMapper

import scala.language.experimental.macros

trait FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] {
  def withModel[Case]: CaseWrap[Case]            = new CaseWrap[Case]       {}
  def debugWithTable[Case]: DebugTableWrap[Case] = new DebugTableWrap[Case] {}

  trait CaseWrap[Case] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit repWrap: FormatterInputTable.Aux[FirstFormatterInputTableImplicit, Table, Case, Rep, TempData]
    ): FormatterCompiler[Rep, TempData, RepCol, EncoderDataCol, DecoderDataCol, Case] =
      new FormatterCompiler[Rep, TempData, RepCol, EncoderDataCol, DecoderDataCol, Case] {
        override def compile[Target1](
            implicit shape: FormatterShape.Aux[Rep, TempData, Target1, RepCol, EncoderDataCol, DecoderDataCol]
        ): FormatterShapeValue[Case, RepCol, EncoderDataCol, DecoderDataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new FormatterShapeValue[TempData, RepCol, EncoderDataCol, DecoderDataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.fmap { (r: TempData) =>
            wrap.from(r)
          } { content =>
            wrap.to(content)
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }
  }

  trait DebugTableWrap[Case] {
    def apply[Table](tableParam: Table): FormatterShapeValue[Case, RepCol, EncoderDataCol, DecoderDataCol] =
      macro FormatterCaseClassMapper.BlackboxFormatterCaseClassMapperImpl
        .debugCaseClassFormatterGeneric[FirstFormatterInputTableImplicit, Table, Case, RepCol, EncoderDataCol, DecoderDataCol]
  }

}

object FormatterWrapApply {
  def formatterInstance[RepCol, EncoderDataCol, DecoderDataCol]: FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] =
    new FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] {}
}
