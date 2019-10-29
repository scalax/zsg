package asuna
import asuna.support.heterogeneous._
class AsunaTuple6[E1, E2, E3, E4, E5, E6](override val head: E1, override val tail: AsunaTuple5[E2, E3, E4, E5, E6]) extends (E1 :: AsunaTuple5[E2, E3, E4, E5, E6]) {
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
  def i4: E4 = tail.tail.tail.head
  def i5: E5 = tail.tail.tail.tail.head
  def i6: E6 = tail.tail.tail.tail.tail.head
}
