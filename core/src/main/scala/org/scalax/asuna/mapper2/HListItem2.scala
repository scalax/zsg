package org.scalax.asuna.mapper.item
class HListItem2[E1, E2](val head: E2 :: E1 :: HNil) extends AnyVal with Item2[E1, E2] {
  override def eat[T](xyy: T): HListItem3[E1, E2, T] = new HListItem3[E1, E2, T](xyy :: head)
  override def rightHead: E2                         = head.head
  override def rightTail: HListItem1[E1]             = new HListItem1(head.tail)
  override def i1: E1                                = head.tail.head
  override def i2: E2                                = head.head
}
