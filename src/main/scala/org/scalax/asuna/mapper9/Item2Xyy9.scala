package org.scalax.asuna.ii.item
class Item2Xyy9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[T7]#AddRightItem[
    T8
  ]#AddRightItem[T9]
) extends AnyVal
    with XyyItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9] {
  override def eat[T](xyy: T): Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T] = new Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T](item.addRightItem(xyy))
  override def rightHead: T9                                                     = item.dropRightItem
  override def rightTail: Item2Xyy8[T1, T2, T3, T4, T5, T6, T7, T8]              = new Item2Xyy8(item.dropRight)
  def i1: T1                                                                     = item.item.i1.i1.i1.i1
  def i2: T2                                                                     = item.item.i1.i1.i1.i2
  def i3: T3                                                                     = item.item.i1.i1.i2.i1
  def i4: T4                                                                     = item.item.i1.i1.i2.i2
  def i5: T5                                                                     = item.item.i1.i2.i1.i1
  def i6: T6                                                                     = item.item.i1.i2.i1.i2
  def i7: T7                                                                     = item.item.i1.i2.i2.i1
  def i8: T8                                                                     = item.item.i1.i2.i2.i2
  def i9: T9                                                                     = item.item.i2.i1.i1.i1
}
class Item2XyyReverse9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[
    T2
  ]#AddRightItem[T1]
) extends AnyVal
    with XyyItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9] {
  override def pudao[T](xyy: T): Item2XyyReverse10[T, T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new Item2XyyReverse10[T, T1, T2, T3, T4, T5, T6, T7, T8, T9](item.addRightItem(xyy))
  override def leftHead: T1                                               = item.dropRightItem
  override def leftTail: Item2XyyReverse8[T2, T3, T4, T5, T6, T7, T8, T9] = new Item2XyyReverse8(item.dropRight)
  def i1: T1                                                              = item.item.i2.i1.i1.i1
  def i2: T2                                                              = item.item.i1.i2.i2.i2
  def i3: T3                                                              = item.item.i1.i2.i2.i1
  def i4: T4                                                              = item.item.i1.i2.i1.i2
  def i5: T5                                                              = item.item.i1.i2.i1.i1
  def i6: T6                                                              = item.item.i1.i1.i2.i2
  def i7: T7                                                              = item.item.i1.i1.i2.i1
  def i8: T8                                                              = item.item.i1.i1.i1.i2
  def i9: T9                                                              = item.item.i1.i1.i1.i1
}
