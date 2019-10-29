package asuna
import asuna.support.heterogeneous._
class AsunaTuple4[E1, E2, E3, E4](override val head: E1, override val tail: AsunaTuple3[E2, E3, E4]) extends (E1 :: AsunaTuple3[E2, E3, E4]) {
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
  def i4: E4 = tail.tail.tail.head
}
