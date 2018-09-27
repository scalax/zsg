package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.helper.data.macroImpl.FormatterCaseClassMapper
import net.scalax.asuna.mapper.common.{DataGenWrap, InputTable}

import scala.language.experimental.macros

trait FormatterDataGen[Output] {

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: Output, tempRep: TempRep): TempData
  def from(caseModel: TempData, tempRep: TempRep): Output

}

object FormatterDataGen {

  type Aux[Output, Rep, Temp] = FormatterDataGen[Output] { type TempRep = Rep; type TempData = Temp }

  implicit def formatterDataGenImplicit[Output, Table, Rep, Temp]: InputTable[Table, FormatterDataGen.Aux[Output, Rep, Temp]] =
    macro FormatterCaseClassMapper.FormatterCaseClassMapperImpl.caseclassEncoderGeneric[Output, Table, Rep, Temp]

  trait DataGenWrap[Output] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (Output, TempRep) => TempData)(g: (TempData, TempRep) => Output): FormatterDataGen.Aux[Output, TempRep, TempData] = new FormatterDataGen[Output] {
      override type TempData = wrap.TempData
      override type TempRep  = wrap.TempRep
      override val rep                                                 = wrap.rep
      override def to(caseModel: Output, tempRep: TempRep): TempData   = f(caseModel, tempRep)
      override def from(caseModel: TempData, tempRep: TempRep): Output = g(caseModel, tempRep)
    }
  }

  def fromDataGenWrap[Output]: DataGenWrap[Output] = new DataGenWrap[Output] {}

}