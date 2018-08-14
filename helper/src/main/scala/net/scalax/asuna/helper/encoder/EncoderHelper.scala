package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import shapeless.Lazy

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassEncoderShapeMapperHelper[RepCol, DataCol] {
  implicit def caseOnly[Table, Case, Target]: CaseRepWrap.Aux[Table, Case, Target, RepCol, DataCol] = macro EncoderMapper.EncoderMapperImpl.impl[Table, Case, Target, RepCol, DataCol]

  trait WrapAbcdef[Table, Case] {
    def laoinert[Target](implicit caseOnly: CaseRepWrap.Aux[Table, Case, Target, RepCol, DataCol]): CaseRepWrap.Aux[Table, Case, Target, RepCol, DataCol] = caseOnly
  }

  def toTargetWrap[Table, Case]: WrapAbcdef[Table, Case] = new WrapAbcdef[Table, Case] {}
}

trait ForTableInput[Table, Case, RepCol, DataCol] {
  def input(table: Table): EncoderShapeValue[Case, RepCol, DataCol]
}

/*class ForTableInputImpl[Table, Case, RepCol, DataCol](tableGen: Table => EncoderShapeValue[Case, RepCol, DataCol]) extends ForTableInput[Table, Case, RepCol, DataCol] {
  override def input(table: Table): EncoderShapeValue[Case, RepCol, DataCol] = tableGen(table)
}*/

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: Lazy[EncoderShape.Aux[Rep, D, Out, RepCol, DataCol]]): Wrapper[Out, D]
}

trait EncoderHelper[RepCol, DataCol] extends EncoderDataShapeValueHelper[RepCol, DataCol] with CaseClassEncoderShapeMapperHelper[RepCol, DataCol]

object EncoderHelper {
  def value[RepCol, DataCol]: EncoderHelper[RepCol, DataCol] = new EncoderHelper[RepCol, DataCol] {}
}