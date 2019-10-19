package asuna
class HListTuple2[E1, E2](val head: E2 :: E1 :: HNil) extends AnyVal with AsunaTuple2[E1, E2] {
  override def add[T](xyy: T): HListTuple3[E1, E2, T] = new HListTuple3[E1, E2, T](xyy :: head)
  override def rightHead: E2                          = head.head
  override def rightTail: HListTuple1[E1]             = new HListTuple1(head.tail)
  override def i1: E1                                 = head.tail.head
  override def i2: E2                                 = head.head
}
