package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyy5[E1, E2, E3, E4, E5](val head: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem5[E1, E2, E3, E4, E5] {
  override def eat[T](xyy: T): ArticleXyy6[E1, E2, E3, E4, E5, T] = new ArticleXyy6[E1, E2, E3, E4, E5, T](xyy :: head)
  override def rightHead: E5                                      = head.head
  override def rightTail: ArticleXyy4[E1, E2, E3, E4]             = new ArticleXyy4(head.tail)
  override def i1: E1                                             = head.tail.tail.tail.tail.head
  override def i2: E2                                             = head.tail.tail.tail.head
  override def i3: E3                                             = head.tail.tail.head
  override def i4: E4                                             = head.tail.head
  override def i5: E5                                             = head.head
}
