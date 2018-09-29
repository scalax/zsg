package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait DecoderDataGen[Input, Output, Sub] {

  type TempData
  type TempRep
  def rep: TempRep

  def from(caseModel: TempData, tempRep: TempRep): LazyModel[Input, Output, Sub]

}

object DecoderDataGen {

  type Aux[Input, Output, Sub, Rep, Temp] = DecoderDataGen[Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[TempRep, TempData, Input, Output, Sub](
      wrap: DataGenWrap.Aux[TempRep, TempData]
  )(f: (TempData, TempRep) => LazyModel[Input, Output, Sub]): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData] =
    new DecoderDataGen[Input, Output, Sub] {
      override type TempData = wrap.TempData
      override type TempRep  = wrap.TempRep
      override def from(caseModel: TempData, tempRep: TempRep): LazyModel[Input, Output, Sub] = f(caseModel, tempRep)
      override val rep                                                                        = wrap.rep
    }
}
