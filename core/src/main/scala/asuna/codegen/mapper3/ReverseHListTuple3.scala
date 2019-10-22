package asuna
class ReverseHListTuple3[E1, E2, E3](val head: E1 :: E2 :: E3 :: HNil) extends AnyVal with AsunaTuple3[E1, E2, E3] {
  override def pull[T](xyy: T): ReverseHListTuple4[T, E1, E2, E3] = new ReverseHListTuple4[T, E1, E2, E3](xyy :: head)
  override def leftHead: E1                                       = head.head
  override def leftTail: ReverseHListTuple2[E2, E3]               = new ReverseHListTuple2(head.tail)
  override def i1: E1                                             = head.head
  override def i2: E2                                             = head.tail.head
  override def i3: E3                                             = head.tail.tail.head
}