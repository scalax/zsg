package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.helper.data.macroImpl._

trait DecoderWrapApply[RepCol, DataCol] {
  def withCase[Table, Case]: CaseWrap[Table, Case]                                     = new CaseWrap[Table, Case]                   {}
  def withLazyData[Table, Input, Output, Sub]: LazyDataWrap[Table, Input, Output, Sub] = new LazyDataWrap[Table, Input, Output, Sub] {}

  trait LazyDataWrap[Table, Input, Output, Sub] {

    def compile[Rep, TempData](
        implicit
      repWrap: InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]
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

  }

  trait CaseWrap[Table, Case] {

    def compile[Rep, TempData](
        implicit
      repWrap: InputTable[Table, DecoderDataGen.Aux[EmptyLazyInput, Case, EmptyLazyOutput, Rep, TempData]]
    ): DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] =
      new DecoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] {
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

  }
}

object DecoderWrapApply {
  def decoderInstance[RepCol, DataCol]: DecoderWrapApply[RepCol, DataCol] = new DecoderWrapApply[RepCol, DataCol] {}
}
