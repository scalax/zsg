package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait DecoderDataGen[LazyModel] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def from(caseModel: TempData): LazyModel

  def debug: DecoderDataGen.Aux[LazyModel, Any, Nothing] = new DecoderDataGen[LazyModel] {
    override type TempData = Nothing
    override type TempRep  = Any
    override def rep: Any                            = self.rep
    override def from(caseModel: Nothing): LazyModel = self.from(caseModel)
  }

}

package impl {
  class DecoderDataGenImpl[TRep, TData, LazyModel](f: (TData, TRep) => LazyModel, wrap: DataGenWrap.Aux[TRep, TData]) extends DecoderDataGen[LazyModel] {
    override type TempData = TData
    override type TempRep  = TRep

    override val rep: TempRep                      = wrap.rep
    override def from(caseModel: TData): LazyModel = f(caseModel, wrap.rep)
  }
}

object DecoderDataGen {

  type Aux[LazyModel, Rep, Temp] = DecoderDataGen[LazyModel] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[TempRep, TempData, LazyModel](
      wrap: DataGenWrap.Aux[TempRep, TempData]
  )(f: (TempData, TempRep) => LazyModel): DecoderDataGen.Aux[LazyModel, TempRep, TempData] =
    new impl.DecoderDataGenImpl(f = f, wrap = wrap)

}
