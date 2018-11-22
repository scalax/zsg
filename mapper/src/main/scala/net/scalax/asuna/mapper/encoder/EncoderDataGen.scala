package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Input, Output, Unused] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def to(caseModel: UnusedData[Input, Output, Unused]): TempData

  def debug: EncoderDataGen.Aux[Input, Output, Unused, Any, Any] = new EncoderDataGen[Input, Output, Unused] {
    override type TempData = Any
    override type TempRep  = Any
    override def rep: Any                                              = self.rep
    override def to(caseModel: UnusedData[Input, Output, Unused]): Any = self.to(caseModel)
  }

}

package impl {

  import net.scalax.asuna.mapper.common.DataGenTag

  trait DataGenWrap[Input, Output, Unused] {
    def apply[TempRep1 <: DataGenTag](
        wrap: TempRep1
    )(f: (UnusedData[Input, Output, Unused], TempRep1) => TempRep1#TempData): EncoderDataGen.Aux[Input, Output, Unused, TempRep1, TempRep1#TempData] = {
      new EncoderDataGen[Input, Output, Unused] {
        self =>
        override type TempData = TempRep1#TempData
        override type TempRep  = TempRep1
        override val rep: TempRep1                                              = wrap
        override def to(caseModel: UnusedData[Input, Output, Unused]): TempData = f(caseModel, self.rep)
      }
    }

  }

  class DataGenWrapImpl[Input, Output, Unused] extends DataGenWrap[Input, Output, Unused]

}

object EncoderDataGen {

  type Aux[Input, Output, Unused, Rep, Temp] = EncoderDataGen[Input, Output, Unused] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[Input, Output, Unused]: impl.DataGenWrap[Input, Output, Unused] = new impl.DataGenWrapImpl[Input, Output, Unused]

}
