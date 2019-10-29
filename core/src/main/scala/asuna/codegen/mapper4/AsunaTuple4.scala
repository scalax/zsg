package asuna
import asuna.support.heterogeneous._
class AsunaTuple4[E1, E2, E3, E4](override val head: E1, override val tail: AsunaTuple3[E2, E3, E4]) extends HList {
  override type Head = E1
  override type Tail = AsunaTuple3[E2, E3, E4]
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
  def i4: E4 = tail.tail.tail.head
  override type Append[T] =
    AsunaTuple5[T, E1, E2, E3, E4]
  override def ::[T](t: T): Append[T] =
    new AsunaTuple5[T, E1, E2, E3, E4](t, this)
}
