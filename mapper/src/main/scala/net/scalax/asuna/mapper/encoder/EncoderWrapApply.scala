package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import org.scalax.asuna.mapper.decoder.EmptyLazyModel
import org.scalax.asuna.mapper.encoder.macroImpl.EncoderCaseClassMapper

import scala.language.experimental.macros

trait EncoderWrapApply[RepCol, DataCol] {
  def withUnusedModel[Model]: UnusedModelWrap[Model]           = new UnusedModelWrap[Model]      {}
  def withSingleModel[Case]: TableWrap[Case]                   = new TableWrap[Case]             {}
  def debugWithUnusedModel[Model]: DebugUnusedModelWrap[Model] = new DebugUnusedModelWrap[Model] {}
  def debugWithSingleModel[Case]: DebugTableWrap[Case]         = new DebugTableWrap[Case]        {}

  trait UnusedModelWrap[Model] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: EncoderInputTable.Aux[FirstEncoderInputTableImplicit, Table, Model, Rep, TempData]
    ): EncoderCompiler[Rep, TempData, RepCol, DataCol, Model] =
      new EncoderCompiler[Rep, TempData, RepCol, DataCol, Model] {
        override def compile[Target1](
            implicit shape: EncoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]
        ): EncoderShapeValue[Model, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new EncoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.emap { (content: Model) =>
            wrap.to(content)
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }

  }

  trait TableWrap[Case] {
    def apply[Table, Rep, TempData](table: Table)(
        implicit repWrap: EncoderInputTable.Aux[FirstEncoderInputTableImplicit, Table, UnusedData[EmptyLazyModel, Case, EmptyLazyModel], Rep, TempData]
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
    def apply[Table](tableParam: Table)(
        implicit l: EncoderInputTable.Aux[DebugSingleModelEncoder, Table, UnusedData[EmptyLazyModel, Case, EmptyLazyModel], Any, Any]
    ): EncoderShapeValue[Case, RepCol, DataCol] = ???
  }

  trait DebugUnusedModelWrap[Model] {
    def apply[Table](tableParam: Table): EncoderShapeValue[Model, RepCol, DataCol] =
      macro EncoderCaseClassMapper.BlackboxEncoderCaseClassMapperImpl
        .debugCaseClassLazyModelEncoderGeneric[FirstEncoderInputTableImplicit, Table, Model, RepCol, DataCol]
  }

}

object EncoderWrapApply {
  def encoderInstance[RepCol, DataCol]: EncoderWrapApply[RepCol, DataCol] = new EncoderWrapApply[RepCol, DataCol] {}
}

trait DebugSingleModelEncoder {
  implicit def implicit1[Table, UnusedModel, RepCol, DataCol]: EncoderInputTable.Aux[DebugSingleModelEncoder, Table, UnusedModel, Any, Any] =
    macro EncoderCaseClassMapper.BlackboxEncoderCaseClassMapperImpl
      .debugCaseClassSingleModelEncoderGeneric[DebugSingleModelEncoder, Table, UnusedModel, RepCol, DataCol]
}

object DebugSingleModelEncoder extends DebugSingleModelEncoder
