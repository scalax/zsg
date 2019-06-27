package org.scalax.asuna.mapper.item
import shapeless._
trait HListItem0 extends Any with Item0 {
  override def eat[T](xyy: T): HListItem1[T] = new HListItem1(xyy :: HNil)
}
object HListItem0 extends HListItem0
class HListItem1[E1](val head: E1 :: HNil) extends AnyVal with Item1[E1] {
  override def eat[T](xyy: T): HListItem2[E1, T] = new HListItem2[E1, T](xyy :: head)
  override def rightHead: E1                     = head.head
  override def rightTail: HListItem0             = HListItem0
  override def i1: E1                            = head.head
}

class HListItem22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22](
    val head: E22 :: E21 :: E20 :: E19 :: E18 :: E17 :: E16 :: E15 :: E14 :: E13 :: E12 :: E11 :: E10 :: E9 :: E8 :: E7 :: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil
) extends AnyVal
    with Item22[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22] {
  override def rightHead: E22                                                                                                         = head.head
  override def rightTail: HListItem21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21] = new HListItem21(head.tail)
  override def i1: E1                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i2: E2                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i3: E3                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i4: E4                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i5: E5                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i6: E6                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i7: E7                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i8: E8                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i9: E9                                                                                                                 = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i10: E10                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i11: E11                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i12: E12                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i13: E13                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i14: E14                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.tail.head
  override def i15: E15                                                                                                               = head.tail.tail.tail.tail.tail.tail.tail.head
  override def i16: E16                                                                                                               = head.tail.tail.tail.tail.tail.tail.head
  override def i17: E17                                                                                                               = head.tail.tail.tail.tail.tail.head
  override def i18: E18                                                                                                               = head.tail.tail.tail.tail.head
  override def i19: E19                                                                                                               = head.tail.tail.tail.head
  override def i20: E20                                                                                                               = head.tail.tail.head
  override def i21: E21                                                                                                               = head.tail.head
  override def i22: E22                                                                                                               = head.head
}
