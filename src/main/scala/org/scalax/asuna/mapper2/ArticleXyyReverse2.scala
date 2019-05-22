package org.scalax.asuna.ii.item
import shapeless._
class ArticleXyyReverse2[E1, E2](val head: E1 :: E2 :: HNil) extends AnyVal with XyyItem2[E1, E2] {
  override def pudao[T](xyy: T): ArticleXyyReverse3[T, E1, E2] = new ArticleXyyReverse3[T, E1, E2](xyy :: head)
  override def leftHead: E1                                    = head.head
  override def leftTail: ArticleXyyReverse1[E2]                = new ArticleXyyReverse1(head.tail)
  override def i1: E1                                          = head.head
  override def i2: E2                                          = head.tail.head
}
