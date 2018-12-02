package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import org.scalax.asuna.mapper.decoder.EmptyLazyModel
import org.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderWrapApply[RepCol, DataCol] {
  def withUnusedModel[Input, Output, Sub]: UnusedModelWrap[Input, Output, Sub]           = new UnusedModelWrap[Input, Output, Sub]      {}
  def withSingleModel[Case]: TableWrap[Case]                                             = new TableWrap[Case]                          {}
  def debugWithUnusedModel[Input, Output, Sub]: DebugUnusedModelWrap[Input, Output, Sub] = new DebugUnusedModelWrap[Input, Output, Sub] {}
  def debugWithSingleModel[Case]: DebugTableWrap[Case]                                   = new DebugTableWrap[Case]                     {}

  trait UnusedModelWrap[Input, Output, Sub] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: EncoderInputTable.Aux[FirstEncoderInputTableImplicit, Table, Input, Output, Sub, Rep, TempData]
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
            wrap.to(content)
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }

  }

  trait TableWrap[Case] {
    def apply[Table, Rep, TempData](table: Table)(
        implicit repWrap: EncoderInputTable.Aux[FirstEncoderInputTableImplicit, Table, EmptyLazyModel, Case, EmptyLazyModel, Rep, TempData]
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
            wrap.to(UnusedData.simple(content))
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }
  }

  trait DebugTableWrap[Case] {
    def apply[Table](tableParam: Table): EncoderShapeValue[Case, RepCol, DataCol] =
      macro EncoderCaseClassMapper.BlackboxEncoderCaseClassMapperImpl
        .debugCaseClassSingleModelEncoderGeneric[FirstEncoderInputTableImplicit, Table, Case, RepCol, DataCol]
  }

  trait DebugUnusedModelWrap[Input, Output, Sub] {
    def apply[Table](tableParam: Table): EncoderShapeValue[UnusedData[Input, Output, Sub], RepCol, DataCol] =
      macro EncoderCaseClassMapper.BlackboxEncoderCaseClassMapperImpl
        .debugCaseClassLazyModelEncoderGeneric[FirstEncoderInputTableImplicit, Table, Input, Output, Sub, RepCol, DataCol]
  }

}

object EncoderWrapApply {
  def encoderInstance[RepCol, DataCol]: EncoderWrapApply[RepCol, DataCol] = new EncoderWrapApply[RepCol, DataCol] {}
}
