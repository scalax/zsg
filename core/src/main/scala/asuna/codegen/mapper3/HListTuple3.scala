package asuna
class HListTuple3[E1, E2, E3](val head: E3 :: E2 :: E1 :: HNil) extends AnyVal with AsunaTuple3[E1, E2, E3] {
  override def add[T](xyy: T): HListTuple4[E1, E2, E3, T] = new HListTuple4[E1, E2, E3, T](xyy :: head)
  override def rightHead: E3                              = head.head
  override def rightTail: HListTuple2[E1, E2]             = new HListTuple2(head.tail)
  override def i1: E1                                     = head.tail.tail.head
  override def i2: E2                                     = head.tail.head
  override def i3: E3                                     = head.head
}
