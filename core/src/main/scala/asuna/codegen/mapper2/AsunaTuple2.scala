package asuna
import asuna.support.heterogeneous._
class AsunaTuple2[E1, E2](override val head: E1, override val tail: AsunaTuple1[E2]) extends (E1 :: AsunaTuple1[E2]) {
  def i1: E1 = head
  def i2: E2 = tail.head
}
