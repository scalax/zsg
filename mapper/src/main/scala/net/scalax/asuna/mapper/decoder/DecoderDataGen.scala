package org.scalax.asuna.mapper.decoder

import org.scalax.asuna.mapper.common.{DataGenTag, DataGenWrap}

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

  import org.scalax.asuna.mapper.common.DataGenTag

  class DecoderDataGenImpl[TRep <: DataGenTag, LazyModel](f: (TRep#TempData, TRep) => LazyModel, wrap: TRep) extends DecoderDataGen[LazyModel] {
    self =>

    override type TempData = TRep#TempData
    override type TempRep  = TRep
    override val rep: TempRep                              = wrap
    override def from(caseModel: TRep#TempData): LazyModel = f(caseModel, self.rep)

  }
}

object DecoderDataGen {

  type Aux[LazyModel, Rep, Temp] = DecoderDataGen[LazyModel] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[TempRep <: DataGenTag, LazyModel](
      wrap: TempRep
  )(f: (TempRep#TempData, TempRep) => LazyModel): DecoderDataGen.Aux[LazyModel, TempRep, TempRep#TempData] =
    new impl.DecoderDataGenImpl(f = f, wrap = wrap)

}
