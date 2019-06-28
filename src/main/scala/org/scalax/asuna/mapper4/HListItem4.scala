package org.scalax.asuna.mapper.item
import shapeless._
class HListItem4[E1, E2, E3, E4](val head: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with Item4[E1, E2, E3, E4] {
  override def eat[T](xyy: T): HListItem5[E1, E2, E3, E4, T] = new HListItem5[E1, E2, E3, E4, T](xyy :: head)
  override def rightHead: E4                                 = head.head
  override def rightTail: HListItem3[E1, E2, E3]             = new HListItem3(head.tail)
  override def i1: E1                                        = head.tail.tail.tail.head
  override def i2: E2                                        = head.tail.tail.head
  override def i3: E3                                        = head.tail.head
  override def i4: E4                                        = head.head
}
