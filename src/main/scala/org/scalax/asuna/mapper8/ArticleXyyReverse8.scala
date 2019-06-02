package org.scalax.asuna.mapper.item
import shapeless._
class ArticleXyyReverse8[E1, E2, E3, E4, E5, E6, E7, E8](val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: HNil)
    extends AnyVal
    with XyyItem8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def pudao[T](xyy: T): ArticleXyyReverse9[T, E1, E2, E3, E4, E5, E6, E7, E8] = new ArticleXyyReverse9[T, E1, E2, E3, E4, E5, E6, E7, E8](xyy :: head)
  override def leftHead: E1                                                            = head.head
  override def leftTail: ArticleXyyReverse7[E2, E3, E4, E5, E6, E7, E8]                = new ArticleXyyReverse7(head.tail)
  override def i1: E1                                                                  = head.head
  override def i2: E2                                                                  = head.tail.head
  override def i3: E3                                                                  = head.tail.tail.head
  override def i4: E4                                                                  = head.tail.tail.tail.head
  override def i5: E5                                                                  = head.tail.tail.tail.tail.head
  override def i6: E6                                                                  = head.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                  = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                  = head.tail.tail.tail.tail.tail.tail.tail.head
}
