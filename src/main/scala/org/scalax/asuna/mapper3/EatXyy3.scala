package org.scalax.asuna.ii.item
import shapeless._
class ArticleXyy3[E1, E2, E3](val head: E3 :: E2 :: E1 :: HNil) extends AnyVal with XyyItem3[E1, E2, E3] {
  override def eat[T](xyy: T): ArticleXyy4[E1, E2, E3, T] = new ArticleXyy4[E1, E2, E3, T](xyy :: head)
  override def rightHead: E3                              = head.head
  override def rightTail: ArticleXyy2[E1, E2]             = new ArticleXyy2(head.tail)
  override def i1: E1                                     = head.tail.tail.head
  override def i2: E2                                     = head.tail.head
  override def i3: E3                                     = head.head
}
