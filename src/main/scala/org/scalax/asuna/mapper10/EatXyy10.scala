package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyy10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10](val head: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil)
    extends AnyVal
    with XyyItem10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10] {
  override def eat[T](xyy: T): ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T] = new ArticleXyy11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, T](xyy :: head)
  override def rightHead: E10                                                           = head.head
  override def rightTail: ArticleXyy9[E1, E2, E3, E4, E5, E6, E7, E8, E9]               = new ArticleXyy9(head.tail)
  override def i1: E1                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                   = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                   = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                   = head.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                   = head.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                   = head.tail.tail.tail.tail.head
  override def i7: E7                                                                   = head.tail.tail.tail.head
  override def i8: E8                                                                   = head.tail.tail.head
  override def i9: E9                                                                   = head.tail.head
  override def i10: E10                                                                 = head.head
}
