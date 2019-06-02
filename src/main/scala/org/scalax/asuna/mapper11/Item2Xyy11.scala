package org.scalax.asuna.mapper.item
class Item2Xyy11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[T7]#AddRightItem[
    T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]
) extends AnyVal
    with XyyItem11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
  override def eat[T](xyy: T): Item2Xyy12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T] =
    new Item2Xyy12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T](item.addRightItem(xyy))
  override def rightHead: T11                                                 = item.dropRightItem
  override def rightTail: Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] = new Item2Xyy10(item.dropRight)
  def i1: T1                                                                  = item.item.i1.i1.i1.i1
  def i2: T2                                                                  = item.item.i1.i1.i1.i2
  def i3: T3                                                                  = item.item.i1.i1.i2.i1
  def i4: T4                                                                  = item.item.i1.i1.i2.i2
  def i5: T5                                                                  = item.item.i1.i2.i1.i1
  def i6: T6                                                                  = item.item.i1.i2.i1.i2
  def i7: T7                                                                  = item.item.i1.i2.i2.i1
  def i8: T8                                                                  = item.item.i1.i2.i2.i2
  def i9: T9                                                                  = item.item.i2.i1.i1.i1
  def i10: T10                                                                = item.item.i2.i1.i1.i2
  def i11: T11                                                                = item.item.i2.i1.i2.i1
}
class Item2XyyReverse11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[
    T5
  ]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] {
  override def pudao[T](xyy: T): Item2XyyReverse12[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    new Item2XyyReverse12[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](item.addRightItem(xyy))
  override def leftHead: T1                                                          = item.dropRightItem
  override def leftTail: Item2XyyReverse10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new Item2XyyReverse10(item.dropRight)
  def i1: T1                                                                         = item.item.i2.i1.i2.i1
  def i2: T2                                                                         = item.item.i2.i1.i1.i2
  def i3: T3                                                                         = item.item.i2.i1.i1.i1
  def i4: T4                                                                         = item.item.i1.i2.i2.i2
  def i5: T5                                                                         = item.item.i1.i2.i2.i1
  def i6: T6                                                                         = item.item.i1.i2.i1.i2
  def i7: T7                                                                         = item.item.i1.i2.i1.i1
  def i8: T8                                                                         = item.item.i1.i1.i2.i2
  def i9: T9                                                                         = item.item.i1.i1.i2.i1
  def i10: T10                                                                       = item.item.i1.i1.i1.i2
  def i11: T11                                                                       = item.item.i1.i1.i1.i1
}
