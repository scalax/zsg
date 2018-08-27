package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.DecoderShape
import net.scalax.asuna.helper.decoder.macroImpl.DecoderMapper
import net.scalax.asuna.helper.encoder.CaseDecoderRepWrap
import shapeless.Generic

import scala.language.experimental.macros
import scala.language.higherKinds

trait DecoderCaseClassShapeMacroHelper[RepCol, DataCol] {
  implicit def caseOnlysdfasgedrsgesrtsertgyer[Table, Case, Target, HListData](implicit genImplicit: Generic.Aux[Case, HListData]): CaseDecoderRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol] = macro DecoderMapper.DecoderMapperImpl.impl[Table, Case, Target, HListData, RepCol, DataCol]

  trait Wsdglhjiohjajert[Table, Case] {
    def laoinert[Target, HListData](implicit caseOnly: CaseDecoderRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol]): CaseDecoderRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol] = caseOnly
  }

  def toTargetWrapDecoder[Table, Case]: Wsdglhjiohjajert[Table, Case] = new Wsdglhjiohjajert[Table, Case] {}
}

trait DecoderContent[RepOut, DataType]

trait DecoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: DecoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait DecoderHelper[RepCol, DataCol] extends DecoderCaseClassShapeMacroHelper[RepCol, DataCol]