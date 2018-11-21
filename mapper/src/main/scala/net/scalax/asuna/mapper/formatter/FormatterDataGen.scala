package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.mapper.common.DataGenWrap

trait FormatterDataGen[Output, +TempRep] extends DataGenWrap[TempRep] {
  self =>

  override type TempData
  override def rep: TempRep

  def to(caseModel: Output): TempData
  def from(caseModel: TempData): Output

  def debug: FormatterDataGen[Output, Any] = new FormatterDataGen[Output, Any] {
    override type TempData = Any
    override def rep: Any                     = self.rep
    override def to(caseModel: Output): Any   = ()
    override def from(caseModel: Any): Output = throw new Exception("Debug instance will not have implement.")
  }

}

package impl {
  class FormatterDataGenImpl[Output, Rep, Temp](wrap: DataGenWrap.Aux[Rep, Temp], f: (Output, Rep) => Temp, g: (Temp, Rep) => Output)
      extends FormatterDataGen[Output, Rep] {
    self =>
    override type TempData = Temp
    override val rep: Rep                      = wrap.rep
    override def to(caseModel: Output): Temp   = f(caseModel, self.rep)
    override def from(caseModel: Temp): Output = g(caseModel, self.rep)
  }

  trait FormatterDataGenWrap[Output] {
    def apply[TempRep, TempData](
        wrap: DataGenWrap.Aux[TempRep, TempData]
    )(f: (Output, TempRep) => TempData)(g: (TempData, TempRep) => Output): FormatterDataGen.Aux[Output, TempRep, TempData] =
      new FormatterDataGenImpl(wrap = wrap, f = f, g = g)
  }

  class DataGenWrapImpl[Output] extends FormatterDataGenWrap[Output]
}

object FormatterDataGen {

  type Aux[Output, +TempRep, TData] = FormatterDataGen[Output, TempRep] { type TempData = TData }

  def fromDataGenWrap[Output]: impl.DataGenWrapImpl[Output] = new impl.DataGenWrapImpl[Output]

}
