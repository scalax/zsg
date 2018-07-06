package net.scalax.asuna.core

sealed abstract trait AbsDataModel

trait OutputData[DataType] extends AbsDataModel {
  def current: DataType
}

object OutputData {
  def simpleLift[T](t: T): OutputData[T] = new OutputData[T] {
    override def current = t
  }
  def lift[T](t: T): OutputData[T] = simpleLift(t)
}

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

trait OutputSubData[Output, Sub] extends AbsDataModel with SubOnly[Sub] with OutputData[Output] {
  self =>

  override def current: Output
  override def sub: Sub

  override def changeSub[F](cv: Sub => F): OutputSubData[Output, F] = new OutputSubData[Output, F] {
    override def current = self.current
    override def sub: F = cv(self.sub)
  }

}

object OutputSubData {
  def simpleLift[T](t: T): OutputSubData[T, T] = new OutputSubData[T, T] {
    override def current = t
    override def sub = t
  }
}

trait DataModel[Input, Output, Sub] extends AbsDataModel with IOData[Input, Output] with SubOnly[Sub] {
  self =>

  override def apply(i: Input): Output
  override def sub: Sub

  override def compose[F](g: F => Input): DataModel[F, Output, Sub] = new DataModel[F, Output, Sub] {
    override def apply(i: F): Output = self.apply(g(i))
    override def sub: Sub = self.sub
  }

  override def andThen[F](g: Output => F): DataModel[Input, F, Sub] = new DataModel[Input, F, Sub] {
    override def apply(i: Input): F = g(self.apply(i))
    override def sub: Sub = self.sub
  }

  override def changeSub[F](cv: Sub => F): DataModel[Input, Output, F] = new DataModel[Input, Output, F] {
    override def apply(i: Input): Output = self.apply(i)
    override def sub: F = cv(self.sub)
  }

}

trait SubOnly[DataType] {
  self =>

  def sub: DataType

  def changeSub[F](cv: DataType => F): SubOnly[F] = new SubOnly[F] {
    override def sub: F = cv(self.sub)
  }

}

object SubOnly {
  def simpleLift[T](t: T): SubOnly[T] = new SubOnly[T] {
    override def sub = t
  }
  def lift[T](t: T): SubOnly[T] = simpleLift(t)
}

object IOData {
  def newInstance[A, B](f: A => B): IOData[A, B] = new IOData[A, B] {
    override def apply(i: A): B = f(i)
  }
  def simpleInstance[A]: IOData[A, A] = newInstance(identity)
}