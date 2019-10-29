package asuna
import asuna.support.heterogeneous._
class AsunaTuple2[E1, E2](override val head: E1, override val tail: AsunaTuple1[E2]) extends HList {
  override type Head = E1
  override type Tail = AsunaTuple1[E2]
  def i1: E1 = head
  def i2: E2 = tail.head
  override type Append[T] =
    AsunaTuple3[T, E1, E2]
  override def ::[T](t: T): Append[T] =
    new AsunaTuple3[T, E1, E2](t, this)
}
