package org.scalax.asuna.mapper.item
trait ReverseHListItem0 extends Any with Item0 {
  override def pudao[T](xyy: T): ReverseHListItem1[T] = new ReverseHListItem1(xyy :: HNil)
}
object ReverseHListItem0 extends ReverseHListItem0
class ReverseHListItem1[E1](val head: E1 :: HNil) extends AnyVal with Item1[E1] {
  override def pudao[T](xyy: T): ReverseHListItem2[T, E1] = new ReverseHListItem2[T, E1](xyy :: head)
  override def leftHead: E1                               = head.head
  override def leftTail: ReverseHListItem0                = ReverseHListItem0
  override def i1: E1                                     = head.head
}

class ReverseHListItem8[E1, E2, E3, E4, E5, E6, E7, E8](
  val head: E1 :: E2 :: E3 :: E4 :: E5 :: E6 :: E7 :: E8 :: HNil
) extends AnyVal
    with Item8[E1, E2, E3, E4, E5, E6, E7, E8] {
  override def leftHead: E1 = head.head
  override def leftTail: ReverseHListItem7[E2, E3, E4, E5, E6, E7, E8] =
    new ReverseHListItem7(head.tail)
  override def i1: E1 = head.head
  override def i2: E2 = head.tail.head
  override def i3: E3 = head.tail.tail.head
  override def i4: E4 = head.tail.tail.tail.head
  override def i5: E5 = head.tail.tail.tail.tail.head
  override def i6: E6 = head.tail.tail.tail.tail.tail.head
  override def i7: E7 = head.tail.tail.tail.tail.tail.tail.head
  override def i8: E8 = head.tail.tail.tail.tail.tail.tail.tail.head
}
