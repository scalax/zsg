package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.mapper.decoder.macroImpl.DecoderCaseClassMapper

import scala.language.experimental.macros

trait DecoderWrapApply[RepCol, DataCol] {
  def withLazyModel[L]: LazyModelWrap[L]                   = new LazyModelWrap[L]       {}
  def withSingleModel[Case]: TableWrap[Case]               = new TableWrap[Case]        {}
  def debugWithLazyModel[L]: DebugLazyModelWrap[L]         = new DebugLazyModelWrap[L]  {}
  def debugWithSingleModel[Output]: DebugTableWrap[Output] = new DebugTableWrap[Output] {}

  trait LazyModelWrap[LazyModel] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: DecoderInputTable.Aux[FirstDecoderInputTableImplicit, Table, LazyModel, Rep, TempData]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel] {
        override def compile[Target1](
            implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]
        ): DecoderShapeValue[LazyModel, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content)
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }

  }

  trait TableWrap[Case] {
    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: DecoderInputTable.Aux[FirstDecoderInputTableImplicit, Table, LazyModel[EmptyLazyModel, Case, EmptyLazyModel], Rep, TempData]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] {
        override def compile[Target1](implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): DecoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content).apply(EmptyLazyModel.value)
          }
        }

        override def debugCompile: Rep = repWrap.inputTable(table).rep
      }
  }

  trait DebugTableWrap[Case] {
    def apply[Table](tableParam: Table)(
        implicit l: DecoderInputTable.Aux[DebugSingleModelDecoder, Table, LazyModel[EmptyLazyModel, Case, EmptyLazyModel], Any, Any]
    ): DecoderShapeValue[Case, RepCol, DataCol] =
      ???
  }

  trait DebugLazyModelWrap[LazyModel] {
    def apply[Table](tableParam: Table): DecoderShapeValue[LazyModel, RepCol, DataCol] =
      macro DecoderCaseClassMapper.BlackboxDecoderCaseClassMapperImpl
        .debugCaseClassLazyModelDecoderGeneric[FirstDecoderInputTableImplicit, Table, LazyModel, RepCol, DataCol]
  }

}

object DecoderWrapApply {
  def decoderInstance[RepCol, DataCol]: DecoderWrapApply[RepCol, DataCol] = new DecoderWrapApply[RepCol, DataCol] {}
}

trait DebugSingleModelDecoder {
  implicit def implicit1[Table, LazyModel, RepCol, DataCol]: DecoderInputTable.Aux[DebugSingleModelDecoder, Table, LazyModel, Any, Any] =
    macro DecoderCaseClassMapper.BlackboxDecoderCaseClassMapperImpl
      .debugCaseClassSingleModelDecoderGeneric[DebugSingleModelDecoder, Table, LazyModel, RepCol, DataCol]
}

object DebugSingleModelDecoder extends DebugSingleModelDecoder
