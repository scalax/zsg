package asuna
import asuna.support.heterogeneous._
final class AsunaTuple1[E1](override final val head: E1) extends HList {
  override final type Head = E1
  override final type Tail = AsunaTuple0
  override final def tail: AsunaTuple0 = AsunaTuple0.value
  final def i1: E1                     = head
  override final type Append[T] =
    AsunaTuple2[T, E1]
  override final def ::[T](t: T): Append[T] =
    new AsunaTuple2[T, E1](t, this)
}
