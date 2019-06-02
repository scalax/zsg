package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyy13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13](
  val head: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with XyyItem13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13] {
  override def eat[T](xyy: T): ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T] =
    new ArticleXyy14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, T](xyy :: head)
  override def rightHead: E13                                                             = head.head
  override def rightTail: ArticleXyy12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12] = new ArticleXyy12(head.tail)
  override def i1: E1                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                     = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                     = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                     = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                     = head.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                     = head.tail.tail.tail.tail.head
  override def i10: E10                                                                   = head.tail.tail.tail.head
  override def i11: E11                                                                   = head.tail.tail.head
  override def i12: E12                                                                   = head.tail.head
  override def i13: E13                                                                   = head.head
}
