package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.core.formatter.{FormatterShape, FormatterShapeValue}
import net.scalax.asuna.mapper.common.InputTable

trait FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] {
  def withModel[Case]: CaseWrap[Case] = new CaseWrap[Case] {}
  trait CaseWrap[Case] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit repWrap: InputTable[Table, FormatterDataGen.Aux[Case, Rep, TempData]]
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
            wrap.from(r, wrap.rep)
          } { content =>
            wrap.to(content, wrap.rep)
          }
        }
      }

  }
}

object FormatterWrapApply {
  def encoderInstance[RepCol, EncoderDataCol, DecoderDataCol]: FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] =
    new FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol] {}
}
