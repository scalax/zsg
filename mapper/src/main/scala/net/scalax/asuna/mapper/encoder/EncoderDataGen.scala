package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Input, Output, Unused] {
  self =>

  type TempData
  type TempRep
  def rep: TempRep

  def to(caseModel: UnusedData[Input, Output, Unused]): TempData

  def debug: EncoderDataGen.Aux[Input, Output, Unused, Any, Any] = new EncoderDataGen[Input, Output, Unused] {
    override type TempData = Any
    override type TempRep  = Any
    override def rep: Any                                              = self.rep
    override def to(caseModel: UnusedData[Input, Output, Unused]): Any = self.to(caseModel)

  }

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
        override def to(caseModel: UnusedData[Input, Output, Unused]): TempData = f(caseModel, wrap.rep)
        override val rep                                                        = wrap.rep
      }
  }

  def fromDataGenWrap[Input, Output, Unused]: DataGenWrap[Input, Output, Unused] = new DataGenWrap[Input, Output, Unused] {}

}
