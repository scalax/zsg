package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import shapeless.{ Generic, Lazy }

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassEncoderShapeMapperHelper[RepCol, DataCol] {
  implicit def caseOnly[Table, Case, Target, HListData](implicit genImplicit: Generic.Aux[Case, HListData]): CaseRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol] = macro EncoderMapper.EncoderMapperImpl.impl[Table, Case, Target, HListData, RepCol, DataCol]

  trait WrapAbcdef[Table, Case] {
    def laoinert[Target, HListData](implicit caseOnly: CaseRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol]): CaseRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol] = caseOnly
  }

  def toTargetWrap[Table, Case]: WrapAbcdef[Table, Case] = new WrapAbcdef[Table, Case] {}
}

/*trait ForTableInput[Table, Case, RepCol, DataCol] {
  def input(table: Table): EncoderShapeValue[Case, RepCol, DataCol]
}*/

/*class ForTableInputImpl[Table, Case, RepCol, DataCol](tableGen: Table => EncoderShapeValue[Case, RepCol, DataCol]) extends ForTableInput[Table, Case, RepCol, DataCol] {
  override def input(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = tableGen(table)
}*/

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait EncoderHelper[RepCol, DataCol] extends EncoderDataShapeValueHelper[RepCol, DataCol] with CaseClassEncoderShapeMapperHelper[RepCol, DataCol]

object EncoderHelper {
  def value[RepCol, DataCol]: EncoderHelper[RepCol, DataCol] = new EncoderHelper[RepCol, DataCol] {}
}