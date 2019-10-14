package asuna
class HListItem3[E1, E2, E3](val head: E3 :: E2 :: E1 :: HNil) extends AnyVal with Item3[E1, E2, E3] {
  override def add[T](xyy: T): HListItem4[E1, E2, E3, T] = new HListItem4[E1, E2, E3, T](xyy :: head)
  override def rightHead: E3                             = head.head
  override def rightTail: HListItem2[E1, E2]             = new HListItem2(head.tail)
  override def i1: E1                                    = head.tail.tail.head
  override def i2: E2                                    = head.tail.head
  override def i3: E3                                    = head.head
}
