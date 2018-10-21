package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Input, Output, Unused] {

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: UnusedData[Input, Output, Unused], tempRep: TempRep): TempData

}

object EncoderDataGen {

  type Aux[Input, Output, Unused, Rep, Temp] = EncoderDataGen[Input, Output, Unused] { type TempRep = Rep; type TempData = Temp }

  trait DataGenWrap[Input, Output, Unused] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (UnusedData[Input, Output, Unused], TempRep) => TempData): EncoderDataGen.Aux[Input, Output, Unused, TempRep, TempData] =
      new EncoderDataGen[Input, Output, Unused] {
        override type TempData = wrap.TempData
        override type TempRep  = wrap.TempRep
        override def to(caseModel: UnusedData[Input, Output, Unused], tempRep: TempRep): TempData = f(caseModel, tempRep)
        override val rep                                                                          = wrap.rep
      }
  }

  def fromDataGenWrap[Input, Output, Unused]: DataGenWrap[Input, Output, Unused] = new DataGenWrap[Input, Output, Unused] {}

}
