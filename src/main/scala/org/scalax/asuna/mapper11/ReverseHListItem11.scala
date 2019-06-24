package org.scalax.asuna.mapper.item
import shapeless._
class ReverseHListItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: HNil)
    extends AnyVal
    with XyyItem11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] {
  override def pudao[T](xyy: T): ReverseHListItem12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] =
    new ReverseHListItem12[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11](xyy :: head)
  override def leftHead: E1                                                           = head.head
  override def leftTail: ReverseHListItem10[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11] = new ReverseHListItem10(head.tail)
  override def i1: E1                                                                 = head.head
  override def i2: E2                                                                 = head.tail.head
  override def i3: E3                                                                 = head.tail.tail.head
  override def i4: E4                                                                 = head.tail.tail.tail.head
  override def i5: E5                                                                 = head.tail.tail.tail.tail.head
  override def i6: E6                                                                 = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                 = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                 = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
