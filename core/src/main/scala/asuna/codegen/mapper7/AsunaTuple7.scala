package asuna
import asuna.support.heterogeneous._
class AsunaTuple7[E1, E2, E3, E4, E5, E6, E7](override val head: E1, override val tail: AsunaTuple6[E2, E3, E4, E5, E6, E7])
    extends (E1 :: AsunaTuple6[E2, E3, E4, E5, E6, E7]) {
  def i1: E1 = head
  def i2: E2 = tail.head
  def i3: E3 = tail.tail.head
  def i4: E4 = tail.tail.tail.head
  def i5: E5 = tail.tail.tail.tail.head
  def i6: E6 = tail.tail.tail.tail.tail.head
  def i7: E7 = tail.tail.tail.tail.tail.tail.head
}
