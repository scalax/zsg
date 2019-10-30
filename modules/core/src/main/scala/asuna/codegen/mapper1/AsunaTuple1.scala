package asuna
import asuna.support.heterogeneous._
class AsunaTuple1[E1](override val head: E1) extends HList {
  override type Head = E1
  override type Tail = AsunaTuple0
  override def tail: AsunaTuple0 = AsunaTuple0
  def i1: E1                     = head
  override type Append[T] =
    AsunaTuple2[T, E1]
  override def ::[T](t: T): Append[T] =
    new AsunaTuple2[T, E1](t, this)
}
