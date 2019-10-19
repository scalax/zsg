package asuna
class ReverseHListTuple2[E1, E2](val head: E1 :: E2 :: HNil) extends AnyVal with AsunaTuple2[E1, E2] {
  override def pull[T](xyy: T): ReverseHListTuple3[T, E1, E2] = new ReverseHListTuple3[T, E1, E2](xyy :: head)
  override def leftHead: E1                                   = head.head
  override def leftTail: ReverseHListTuple1[E2]               = new ReverseHListTuple1(head.tail)
  override def i1: E1                                         = head.head
  override def i2: E2                                         = head.tail.head
}
