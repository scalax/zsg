package org.scalax.asuna.ii.item
import shapeless._
class ArticleXyyReverse5[E1, E2, E3, E4, E5](val head: E1 :: E2 :: E3 :: E4 :: E5 :: HNil) extends AnyVal with XyyItem5[E1, E2, E3, E4, E5] {
  override def pudao[T](xyy: T): ArticleXyyReverse6[T, E1, E2, E3, E4, E5] = new ArticleXyyReverse6[T, E1, E2, E3, E4, E5](xyy :: head)
  override def leftHead: E1                                                = head.head
  override def leftTail: ArticleXyyReverse4[E2, E3, E4, E5]                = new ArticleXyyReverse4(head.tail)
  override def i1: E1                                                      = head.head
  override def i2: E2                                                      = head.tail.head
  override def i3: E3                                                      = head.tail.tail.head
  override def i4: E4                                                      = head.tail.tail.tail.head
  override def i5: E5                                                      = head.tail.tail.tail.tail.head
}
