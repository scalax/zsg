package net.scalax.asuna.helper.data.macroImpl

case class EmptyLazyInput()

object EmptyLazyInput {
  val value: EmptyLazyInput = EmptyLazyInput()
}

case class EmptyLazyOutput()

object EmptyLazyOutput {
  val value: EmptyLazyOutput = EmptyLazyOutput()
}

trait LazyData[Input, Output, Sub] extends Function1[Input, Output] {
  self =>

  override def apply(input: Input): Output
  def sub: Sub

  override def compose[A](g: A => Input): LazyData[A, Output, Sub] = new LazyData[A, Output, Sub] {
    override def apply(input: A): Output = self.apply(g(input))
    override def sub = self.sub
  }

  override def andThen[A](g: Output => A): LazyData[Input, A, Sub] = new LazyData[Input, A, Sub] {
    override def apply(input: Input): A = g(self.apply(input))
    def sub = self.sub
  }

  def changeSub[F](cv: Sub => F): LazyData[Input, Output, F] = new LazyData[Input, Output, F] {
    override def apply(input: Input): Output = self.apply(input)
    override def sub: F = cv(self.sub)
  }

}

trait LazyDataWrap[Input, Output, Sub] {

  type CaseDataHelper

  def to(data: LazyData[Input, Output, Sub]): CaseDataHelper
  def from(data: CaseDataHelper): LazyData[Input, Output, Sub]

}

object LazyDataWrap {
  type Aux[HelperData, Input, Output, Sub] = LazyDataWrap[Input, Output, Sub] { type CaseDataHelper = HelperData }
}