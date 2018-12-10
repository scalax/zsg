package org.scalax.asuna.mapper.decoder

case class EmptyLazyModel()

object EmptyLazyModel {
  val value: EmptyLazyModel = EmptyLazyModel()
}

trait LazyModel[Input, Output, Sub] extends Function1[Input, Output] {
  self =>

  override def apply(input: Input): Output
  def sub: Sub

  override def compose[A](g: A => Input): LazyModel[A, Output, Sub] = new LazyModel[A, Output, Sub] {
    override def apply(input: A): Output = self.apply(g(input))
    override def sub                     = self.sub
  }

  override def andThen[A](g: Output => A): LazyModel[Input, A, Sub] = new LazyModel[Input, A, Sub] {
    override def apply(input: Input): A = g(self.apply(input))
    def sub                             = self.sub
  }

  def changeSub[F](cv: Sub => F): LazyModel[Input, Output, F] = new LazyModel[Input, Output, F] {
    override def apply(input: Input): Output = self.apply(input)
    override def sub: F                      = cv(self.sub)
  }

}

object LazyModel {
  def init[Input, Output, Sub](gen: (Input => Output), sub: Sub): LazyModel[Input, Output, Sub] = {
    val sub1 = sub

    new LazyModel[Input, Output, Sub] {
      override def apply(input: Input): Output = gen(input)
      override def sub: Sub                    = sub1
    }
  }
}
