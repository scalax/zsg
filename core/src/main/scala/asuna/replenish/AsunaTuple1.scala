package asuna

import asuna.support.heterogeneous._

class AsunaTuple1[E1](override val head: E1) extends (E1 :: AsunaTuple0)(head, AsunaTuple0) {
  def i1: E1 = head
}
