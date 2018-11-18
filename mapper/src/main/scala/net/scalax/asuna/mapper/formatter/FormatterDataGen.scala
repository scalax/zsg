package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.mapper.common.DataGenWrap

trait FormatterDataGen[Output] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def to(caseModel: Output, tempRep: TempRep): TempData
  def from(caseModel: TempData, tempRep: TempRep): Output

  def debug: FormatterDataGen.Aux[Output, Any, Any] = new FormatterDataGen[Output] {
    override type TempData = Any
    override type TempRep  = Any
    override def rep: Any                                   = self.rep
    override def to(caseModel: Output, tempRep: Any): Any   = ()
    override def from(caseModel: Any, tempRep: Any): Output = throw new Exception("Debug instance will not have implement.")
  }

}

package impl {
  class FormatterDataGenImpl[Output, Rep, Temp](wrap: DataGenWrap.Aux[Rep, Temp], f: (Output, Rep) => Temp, g: (Temp, Rep) => Output)
      extends FormatterDataGen[Output] {
    override type TempData = Temp
    override type TempRep  = Rep
    override val rep: Rep                                    = wrap.rep
    override def to(caseModel: Output, tempRep: Rep): Temp   = f(caseModel, tempRep)
    override def from(caseModel: Temp, tempRep: Rep): Output = g(caseModel, tempRep)
  }

  trait DataGenWrap[Output] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (Output, TempRep) => TempData)(g: (TempData, TempRep) => Output): FormatterDataGen.Aux[Output, TempRep, TempData] =
      new FormatterDataGenImpl(wrap = wrap, f = f, g = g)
  }

  class DataGenWrapImpl[Output] extends DataGenWrap[Output]
}

object FormatterDataGen {

  type Aux[Output, Rep, Temp] = FormatterDataGen[Output] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[Output]: impl.DataGenWrap[Output] = new impl.DataGenWrapImpl[Output]

}
