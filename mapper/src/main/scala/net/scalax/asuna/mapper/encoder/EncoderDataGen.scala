package org.scalax.asuna.mapper.encoder

import org.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Model] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def to(caseModel: Model): TempData

  def debug: EncoderDataGen.Aux[Model, Any, Any] = new EncoderDataGen[Model] {
    override type TempData = Any
    override type TempRep  = Any
    override def rep: Any                  = self.rep
    override def to(caseModel: Model): Any = self.to(caseModel)
  }

}

package impl {

  import org.scalax.asuna.mapper.common.DataGenTag

  trait DataGenWrap[Model] {
    def apply[TempRep1 <: DataGenTag](
        wrap: TempRep1
    )(f: (Model, TempRep1) => TempRep1#TempData): EncoderDataGen.Aux[Model, TempRep1, TempRep1#TempData] = {
      new EncoderDataGen[Model] {
        self =>
        override type TempData = TempRep1#TempData
        override type TempRep  = TempRep1
        override val rep: TempRep1                  = wrap
        override def to(caseModel: Model): TempData = f(caseModel, self.rep)
      }
    }
  }

  class DataGenWrapImpl[Model] extends DataGenWrap[Model]

}

object EncoderDataGen {

  type Aux[Model, Rep, Temp] = EncoderDataGen[Model] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[Model]: impl.DataGenWrap[Model] = new impl.DataGenWrapImpl[Model]

}
