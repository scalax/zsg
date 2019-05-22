package org.scalax.asuna.ii.item
import shapeless._
class ArticleXyyReverse3[E1, E2, E3](val head: E1 :: E2 :: E3 :: HNil) extends AnyVal with XyyItem3[E1, E2, E3] {
  override def pudao[T](xyy: T): ArticleXyyReverse4[T, E1, E2, E3] = new ArticleXyyReverse4[T, E1, E2, E3](xyy :: head)
  override def leftHead: E1                                        = head.head
  override def leftTail: ArticleXyyReverse2[E2, E3]                = new ArticleXyyReverse2(head.tail)
  override def i1: E1                                              = head.head
  override def i2: E2                                              = head.tail.head
  override def i3: E3                                              = head.tail.tail.head
}
