package asuna
import asuna.support.heterogeneous._
class AsunaTuple3[E1, E2, E3](override val head: E1, override val tail: AsunaTuple2[E2, E3]) extends (E1 :: AsunaTuple2[E2, E3]) {
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
}
