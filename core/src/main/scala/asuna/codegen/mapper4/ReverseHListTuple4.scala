package asuna
class ReverseHListTuple4[E1, E2, E3, E4](val head: E1 :: E2 :: E3 :: E4 :: HNil) extends AnyVal with AsunaTuple4[E1, E2, E3, E4] {
  override def pull[T](xyy: T): ReverseHListTuple5[T, E1, E2, E3, E4] = new ReverseHListTuple5[T, E1, E2, E3, E4](xyy :: head)
  override def leftHead: E1                                           = head.head
  override def leftTail: ReverseHListTuple3[E2, E3, E4]               = new ReverseHListTuple3(head.tail)
  override def i1: E1                                                 = head.head
  override def i2: E2                                                 = head.tail.head
  override def i3: E3                                                 = head.tail.tail.head
  override def i4: E4                                                 = head.tail.tail.tail.head
}
