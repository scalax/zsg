package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.helper.encoder.InputTable

import scala.language.experimental.macros

trait EncoderDataGen[Output] {

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: Output, tempRep: TempRep): TempData

}

object EncoderDataGen {

  type Aux[Output, Rep, Temp] = EncoderDataGen[Output] { type TempRep = Rep; type TempData = Temp }

  implicit def encoderDataGenImplicit[Output, Table, Rep, Temp]: InputTable[Table, EncoderDataGen.Aux[Output, Rep, Temp]] =
    macro EncoderCaseClassMapper.EncoderCaseClassMapperImpl.caseclassEncoderGeneric[Output, Table, Rep, Temp]

  trait DataGenWrap[Output] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (Output, TempRep) => TempData): EncoderDataGen.Aux[Output, TempRep, TempData] = new EncoderDataGen[Output] {
      override type TempData = wrap.TempData
      override type TempRep  = wrap.TempRep
      override def to(caseModel: Output, tempRep: TempRep): TempData = f(caseModel, tempRep)
      override val rep                                               = wrap.rep
    }
  }

  def fromDataGenWrap[Output]: DataGenWrap[Output] = new DataGenWrap[Output] {}

}
