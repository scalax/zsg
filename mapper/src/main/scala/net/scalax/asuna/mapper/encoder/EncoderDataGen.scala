package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Output] {

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: Output, tempRep: TempRep): TempData

}

object EncoderDataGen {

  type Aux[Output, Rep, Data] = EncoderDataGen[Output] { type TempRep = Rep; type TempData = Data }

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
