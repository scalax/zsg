package net.scalax.asuna.core

sealed abstract trait AbsDataModel

trait OutputData extends AbsDataModel

trait IOData[Input, Output] extends AbsDataModel with Function1[Input, Output] {
  self =>

  override def apply(i: Input): Output
  override def compose[A](g: A => Input): IOData[A, Output] = new IOData[A, Output] {
    override def apply(input: A): Output = self.apply(g(input))
  }
  override def andThen[A](g: Output => A): IOData[Input, A] = new IOData[Input, A] {
    override def apply(input: Input): A = g(self.apply(input))
  }
}

trait OutputSubData[Output, Sub] extends AbsDataModel {
  def current: Output
  def sub: Sub
}

trait DataModel[A, B, C] extends AbsDataModel with Function1[A, B] {
  self =>

  override def apply(i: A): B = current(i)

  def current: A => B
  def sub: C

  override def compose[F](g: F => A): DataModel[F, B, C] = new DataModel[F, B, C] {
    override def current: F => B = { (f: F) => self.current(g(f)) }
    override def sub: C = self.sub
  }
  override def andThen[F](g: B => F): DataModel[A, F, C] = new DataModel[A, F, C] {
    override def current: A => F = { (a: A) => g(self.current(a)) }
    override def sub: C = self.sub
  }

  def changeSub[F](cv: C => F): DataModel[A, B, F] = new DataModel[A, B, F] {
    override def current: A => B = self.current
    override def sub: F = cv(self.sub)
  }

}

trait SubOnly[DataType] {
  def sub: DataType
}

object IOData {
  def newInstance[A, B](f: A => B): IOData[A, B] = new IOData[A, B] {
    override def apply(i: A): B = f(i)
  }
  def simpleInstance[A]: IOData[A, A] = newInstance(identity)
}
/*trait EmptyData

object EmptyData {
  val value: EmptyData = new EmptyData {}
}*/ 