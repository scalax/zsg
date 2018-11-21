package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.mapper.common.DataGenWrap

trait EncoderDataGen[Input, Output, Unused, +TempRep] extends DataGenWrap[TempRep] {
  self =>

  override type TempData
  override def rep: TempRep

  def to(caseModel: UnusedData[Input, Output, Unused]): TempData

  def debug: EncoderDataGen[Input, Output, Unused, Any] = new EncoderDataGen[Input, Output, Unused, Any] {
    override type TempData = Any
    override def rep: Any                                              = self.rep
    override def to(caseModel: UnusedData[Input, Output, Unused]): Any = self.to(caseModel)
  }

}

package impl {
  class EncoderDataGenImpl[Input, Output, Unused, Rep, Temp](wrap: DataGenWrap.Aux[Rep, Temp], f: (UnusedData[Input, Output, Unused], Rep) => Temp)
      extends EncoderDataGen[Input, Output, Unused, Rep] {
    self =>
    override type TempData = Temp
    override val rep: Rep                                               = wrap.rep
    override def to(caseModel: UnusedData[Input, Output, Unused]): Temp = f(caseModel, self.rep)
  }
  trait EncoderDataGenWrap[Input, Output, Unused] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (UnusedData[Input, Output, Unused], TempRep) => TempData): EncoderDataGen.Aux[Input, Output, Unused, TempRep, TempData] =
      new impl.EncoderDataGenImpl(wrap = wrap, f = f)
  }

  class DataGenWrapImpl[Input, Output, Unused] extends EncoderDataGenWrap[Input, Output, Unused]
}

object EncoderDataGen {

  type Aux[Input, Output, Unused, +TempRep, TData] = EncoderDataGen[Input, Output, Unused, TempRep] { type TempData = TData }

  def fromDataGenWrap[Input, Output, Unused]: impl.EncoderDataGenWrap[Input, Output, Unused] = new impl.DataGenWrapImpl[Input, Output, Unused]

}
