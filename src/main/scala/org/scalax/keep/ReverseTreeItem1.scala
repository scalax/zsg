package org.scalax.asuna.mapper.item
trait ReverseTreeItem0 extends Any with Item0 {
  override def pudao[T](xyy: T): ReverseTreeItem1[T] = new ReverseTreeItem1(org.scalax.asuna.mapper.item.EatValue0.addRightItem(xyy))
}
object ReverseTreeItem0 extends ReverseTreeItem0
class ReverseTreeItem1[T1](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]) extends AnyVal with Item1[T1] {
  override def pudao[T](xyy: T): ReverseTreeItem2[T, T1] = new ReverseTreeItem2[T, T1](item.addRightItem(xyy))
  override def leftHead: T1                              = item.dropRightItem
  override def leftTail: ReverseTreeItem0                = ReverseTreeItem0
  override def i1: T1                                    = item.item.i1
}

class ReverseTreeItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T22]#AddRightItem[T21]#AddRightItem[T20]#AddRightItem[T19]#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[
      T16
  ]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[
      T6
  ]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with Item22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  override def leftHead: T1 = item.dropRightItem
  override def leftTail: ReverseTreeItem21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new ReverseTreeItem21(item.dropRight)
  def i1: T1   = item.item.i2.i1.i2.i1.i2
  def i2: T2   = item.item.i2.i1.i2.i1.i1
  def i3: T3   = item.item.i2.i1.i1.i2.i2
  def i4: T4   = item.item.i2.i1.i1.i2.i1
  def i5: T5   = item.item.i2.i1.i1.i1.i2
  def i6: T6   = item.item.i2.i1.i1.i1.i1
  def i7: T7   = item.item.i1.i2.i2.i2.i2
  def i8: T8   = item.item.i1.i2.i2.i2.i1
  def i9: T9   = item.item.i1.i2.i2.i1.i2
  def i10: T10 = item.item.i1.i2.i2.i1.i1
  def i11: T11 = item.item.i1.i2.i1.i2.i2
  def i12: T12 = item.item.i1.i2.i1.i2.i1
  def i13: T13 = item.item.i1.i2.i1.i1.i2
  def i14: T14 = item.item.i1.i2.i1.i1.i1
  def i15: T15 = item.item.i1.i1.i2.i2.i2
  def i16: T16 = item.item.i1.i1.i2.i2.i1
  def i17: T17 = item.item.i1.i1.i2.i1.i2
  def i18: T18 = item.item.i1.i1.i2.i1.i1
  def i19: T19 = item.item.i1.i1.i1.i2.i2
  def i20: T20 = item.item.i1.i1.i1.i2.i1
  def i21: T21 = item.item.i1.i1.i1.i1.i2
  def i22: T22 = item.item.i1.i1.i1.i1.i1
}
