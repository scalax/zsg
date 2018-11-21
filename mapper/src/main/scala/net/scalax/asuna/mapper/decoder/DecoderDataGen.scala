package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait DecoderDataGen[LazyModel, +TempRep] extends DataGenWrap[TempRep] {
  self =>

  override type TempData
  override def rep: TempRep

  def from(caseModel: TempData): LazyModel

  def debug: DecoderDataGen[LazyModel, Any] = new DecoderDataGen[LazyModel, Any] {
    override type TempData = Nothing
    override def rep: Any                            = self.rep
    override def from(caseModel: Nothing): LazyModel = self.from(caseModel)
  }

}

package impl {
  class DecoderDataGenImpl[TRep, TData, LazyModel](f: (TData, TRep) => LazyModel, wrap: DataGenWrap[TRep]) extends DecoderDataGen[LazyModel, TRep] {
    self =>
    override type TempData = TData
    override val rep: TRep                         = wrap.rep
    override def from(caseModel: TData): LazyModel = f(caseModel, self.rep)
  }
}

object DecoderDataGen {

  type Aux[LazyModel, +TempRep, TData] = DecoderDataGen[LazyModel, TempRep] { type TempData = TData }

  def fromDataGenWrap[TempRep, TempData, LazyModel](
      wrap: DataGenWrap.Aux[TempRep, TempData]
  )(f: (TempData, TempRep) => LazyModel): DecoderDataGen.Aux[LazyModel, TempRep, TempData] =
    new impl.DecoderDataGenImpl(f = f, wrap = wrap)

}
