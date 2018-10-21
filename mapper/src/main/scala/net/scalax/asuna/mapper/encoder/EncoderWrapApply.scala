package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.mapper.decoder.EmptyLazyModel

trait EncoderWrapApply[RepCol, DataCol] {
  def withUnusedModel[Input, Output, Sub]: UnusedModelWrap[Input, Output, Sub] = new UnusedModelWrap[Input, Output, Sub] {}
  def withTable[Case]: TableWrap[Case]                                         = new TableWrap[Case]                     {}

  trait UnusedModelWrap[Input, Output, Sub] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: EncoderInputTable.Aux[Table, Input, Output, Sub, Rep, TempData]
    ): EncoderCompiler[Rep, TempData, RepCol, DataCol, UnusedData[Input, Output, Sub]] =
      new EncoderCompiler[Rep, TempData, RepCol, DataCol, UnusedData[Input, Output, Sub]] {
        override def compile[Target1](
            implicit shape: EncoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]
        ): EncoderShapeValue[UnusedData[Input, Output, Sub], RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new EncoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.emap { (content: UnusedData[Input, Output, Sub]) =>
            wrap.to(content, wrap.rep)
          }
        }
      }

  }

  trait TableWrap[Case] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit repWrap: EncoderInputTable.Aux[Table, EmptyLazyModel, Case, EmptyLazyModel, Rep, TempData]
    ): EncoderCompiler[Rep, TempData, RepCol, DataCol, Case] =
      new EncoderCompiler[Rep, TempData, RepCol, DataCol, Case] {
        override def compile[Target1](implicit shape: EncoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): EncoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new EncoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.emap { (content: Case) =>
            wrap.to(UnusedData.simple(content), wrap.rep)
          }
        }
      }

  }
}

object EncoderWrapApply {
  def encoderInstance[RepCol, DataCol]: EncoderWrapApply[RepCol, DataCol] = new EncoderWrapApply[RepCol, DataCol] {}
}
