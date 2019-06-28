package org.scalax.asuna.mapper.item
import shapeless._
class HListItem8[E1, E2, E3, E4, E5, E6, E7, E8](val head: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with Item8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def eat[T](xyy: T): HListItem9[E1, E2, E3, E4, E5, E6, E7, E8, T] = new HListItem9[E1, E2, E3, E4, E5, E6, E7, E8, T](xyy :: head)
  override def rightHead: E8                                                 = head.head
  override def rightTail: HListItem7[E1, E2, E3, E4, E5, E6, E7]             = new HListItem7(head.tail)
  override def i1: E1                                                        = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                        = head.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                        = head.tail.tail.tail.tail.tail.head
  override def i4: E4                                                        = head.tail.tail.tail.tail.head
  override def i5: E5                                                        = head.tail.tail.tail.head
  override def i6: E6                                                        = head.tail.tail.head
  override def i7: E7                                                        = head.tail.head
  override def i8: E8                                                        = head.head
}
