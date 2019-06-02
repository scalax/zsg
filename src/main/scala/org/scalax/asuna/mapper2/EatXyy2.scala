package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyy2[E1, E2](val head: E2 :: E1 :: HNil) extends AnyVal with XyyItem2[E1, E2] {
  override def eat[T](xyy: T): ArticleXyy3[E1, E2, T] = new ArticleXyy3[E1, E2, T](xyy :: head)
  override def rightHead: E2                          = head.head
  override def rightTail: ArticleXyy1[E1]             = new ArticleXyy1(head.tail)
  override def i1: E1                                 = head.tail.head
  override def i2: E2                                 = head.head
}
