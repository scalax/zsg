package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.mapper.common.DataGenWrap

trait FormatterDataGen[Output] extends DataGenWrap {
  self =>

  override type TempData
  override type TempRep
  override def rep: TempRep

  def to(caseModel: Output): TempData
  def from(caseModel: TempData): Output

  def debug: FormatterDataGen.Aux[Output, Any, Any] = new FormatterDataGen[Output] {
    override type TempData = Any
    override type TempRep  = Any
    override def rep: Any                     = self.rep
    override def to(caseModel: Output): Any   = ()
    override def from(caseModel: Any): Output = throw new Exception("Debug instance will not have implement.")
  }

}

package impl {

  import net.scalax.asuna.mapper.common.DataGenTag

  class FormatterDataGenImpl[Output, Rep <: DataGenTag](wrap: Rep, f: (Output, Rep) => Rep#TempData, g: (Rep#TempData, Rep) => Output)
      extends FormatterDataGen[Output] {
    self =>
    override type TempData = Rep#TempData
    override type TempRep  = Rep
    override val rep: Rep                              = wrap
    override def to(caseModel: Output): Rep#TempData   = f(caseModel, self.rep)
    override def from(caseModel: Rep#TempData): Output = g(caseModel, self.rep)
  }

  trait DataGenWrap[Output] {
    def apply[TempRep <: DataGenTag](
        wrap: TempRep
    )(f: (Output, TempRep) => TempRep#TempData)(g: (TempRep#TempData, TempRep) => Output): FormatterDataGen.Aux[Output, TempRep, TempRep#TempData] =
      new FormatterDataGenImpl(wrap = wrap, f = f, g = g)
  }

  class DataGenWrapImpl[Output] extends DataGenWrap[Output]
}

object FormatterDataGen {

  type Aux[Output, Rep, Temp] = FormatterDataGen[Output] { type TempRep = Rep; type TempData = Temp }

  def fromDataGenWrap[Output]: impl.DataGenWrap[Output] = new impl.DataGenWrapImpl[Output]

}
