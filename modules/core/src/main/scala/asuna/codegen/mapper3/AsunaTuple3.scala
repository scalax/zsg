package asuna
import asuna.support.heterogeneous._
final class AsunaTuple3[E1, E2, E3](override final val head: E1, override final val tail: AsunaTuple2[E2, E3]) extends HList {
  override final type Head = E1
  override final type Tail = AsunaTuple2[E2, E3]
  final def i1: E1 = head
  final def i2: E2 = tail.head
  final def i3: E3 = tail.tail.head
  override final type Append[T] =
    AsunaTuple4[T, E1, E2, E3]
  override final def ::[T](t: T): Append[T] =
    new AsunaTuple4[T, E1, E2, E3](t, this)
}
