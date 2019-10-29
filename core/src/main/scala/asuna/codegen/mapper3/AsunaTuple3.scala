package asuna
import asuna.support.heterogeneous._
class AsunaTuple3[E1, E2, E3](override val head: E1, override val tail: AsunaTuple2[E2, E3]) extends HList {
  override type Head = E1
  override type Tail = AsunaTuple2[E2, E3]
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
  override type Append[T] =
    AsunaTuple4[T, E1, E2, E3]
  override def ::[T](t: T): Append[T] =
    new AsunaTuple4[T, E1, E2, E3](t, this)
}
