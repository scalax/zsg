package org.scalax.asuna.mapper
class ReverseHListItem6[E1, E2, E3, E4, E5, E6](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: HNil) extends AnyVal with Item6[E1, E2, E3, E4, E5, E6] {
  override def pull[T](xyy: T): ReverseHListItem7[T, E1, E2, E3, E4, E5, E6] = new ReverseHListItem7[T, E1, E2, E3, E4, E5, E6](xyy :: head)
  override def leftHead: E1                                                  = head.head
  override def leftTail: ReverseHListItem5[E2, E3, E4, E5, E6]               = new ReverseHListItem5(head.tail)
  override def i1: E1                                                        = head.head
  override def i2: E2                                                        = head.tail.head
  override def i3: E3                                                        = head.tail.tail.head
  override def i4: E4                                                        = head.tail.tail.tail.head
  override def i5: E5                                                        = head.tail.tail.tail.tail.head
  override def i6: E6                                                        = head.tail.tail.tail.tail.tail.head
}
