package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.helper.encoder.InputTable

import scala.language.experimental.macros

trait DecoderDataGen[Input, Output, Sub] {

  type TempData
  type TempRep
  def rep: TempRep

  def from(caseModel: TempData, tempRep: TempRep): LazyData[Input, Output, Sub]

}

object DecoderDataGen {

  type Aux[Input, Output, Sub, Rep, Temp] = DecoderDataGen[Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

  implicit def decoderDataGenImplicit[Input, Output, Sub, Table, Rep, Temp]: InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, Temp]] =
    macro DecoderCaseClassMapper.DecoderCaseClassMapperImpl.caseclassDecoderGeneric[Input, Output, Sub, Table, Rep, Temp]
  def fromDataGenWrap[TempRep, TempData, Input, Output, Sub](
      wrap: DataGenWrap.Aux[TempRep, TempData]
  )(f: (TempData, TempRep) => LazyData[Input, Output, Sub]): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData] =
    new DecoderDataGen[Input, Output, Sub] {
      override type TempData = wrap.TempData
      override type TempRep  = wrap.TempRep
      override def from(caseModel: TempData, tempRep: TempRep): LazyData[Input, Output, Sub] = f(caseModel, tempRep)
      override val rep                                                                       = wrap.rep
    }
}
