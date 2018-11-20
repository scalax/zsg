package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait DecoderDataGen[Input, Output, Sub] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def from(caseModel: TempData): LazyModel[Input, Output, Sub]

  def debug: DecoderDataGen.Aux[Input, Output, Sub, Any, Nothing] = new DecoderDataGen[Input, Output, Sub] {
    override type TempData = Nothing
    override type TempRep  = Any
    override def rep: Any                                                = self.rep
    override def from(caseModel: Nothing): LazyModel[Input, Output, Sub] = self.from(caseModel)
  }

}

package impl {
  class DecoderDataGenImpl[TRep, TData, Input, Output, Sub](f: (TData, TRep) => LazyModel[Input, Output, Sub], wrap: DataGenWrap.Aux[TRep, TData])
      extends DecoderDataGen[Input, Output, Sub] {
    override type TempData = TData
    override type TempRep  = TRep

    override val rep: TempRep                                          = wrap.rep
    override def from(caseModel: TData): LazyModel[Input, Output, Sub] = f(caseModel, wrap.rep)
  }
}

object DecoderDataGen {

  type Aux[Input, Output, Sub, Rep, Temp] = DecoderDataGen[Input, Output, Sub] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[TempRep, TempData, Input, Output, Sub](
      wrap: DataGenWrap.Aux[TempRep, TempData]
  )(f: (TempData, TempRep) => LazyModel[Input, Output, Sub]): DecoderDataGen.Aux[Input, Output, Sub, TempRep, TempData] =
    new impl.DecoderDataGenImpl(f = f, wrap = wrap)
  /*new DecoderDataGen[Input, Output, Sub] {
      override type TempData = wrap.TempData
      override type TempRep  = wrap.TempRep
      override def from(caseModel: TempData): LazyModel[Input, Output, Sub] = f(caseModel, wrap.rep)
      override val rep                                                      = wrap.rep
    }*/
}
