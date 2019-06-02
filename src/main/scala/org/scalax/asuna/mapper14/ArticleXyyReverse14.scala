package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyyReverse14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: E9 :: E10 :: E11 :: E12 :: E13 :: E14 :: HNil
) extends AnyVal
    with XyyItem14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] {
  override def pudao[T](xyy: T): ArticleXyyReverse15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] =
    new ArticleXyyReverse15[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14](xyy :: head)
  override def leftHead: E1                                                                           = head.head
  override def leftTail: ArticleXyyReverse13[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14] = new ArticleXyyReverse13(head.tail)
  override def i1: E1                                                                                 = head.head
  override def i2: E2                                                                                 = head.tail.head
  override def i3: E3                                                                                 = head.tail.tail.head
  override def i4: E4                                                                                 = head.tail.tail.tail.head
  override def i5: E5                                                                                 = head.tail.tail.tail.tail.head
  override def i6: E6                                                                                 = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                 = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
}
