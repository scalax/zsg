package org.scalax.asuna.ii.item
class Item2Xyy6[T1, T2, T3, T4, T5, T6](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]
) extends AnyVal
    with XyyItem6[T1, T2, T3, T4, T5, T6] {
  override def eat[T](xyy: T): Item2Xyy7[T1, T2, T3, T4, T5, T6, T] = new Item2Xyy7[T1, T2, T3, T4, T5, T6, T](item.addRightItem(xyy))
  override def rightHead: T6                                        = item.dropRightItem
  override def rightTail: Item2Xyy5[T1, T2, T3, T4, T5]             = new Item2Xyy5(item.dropRight)
  def i1: T1                                                        = item.item.i1.i1.i1
  def i2: T2                                                        = item.item.i1.i1.i2
  def i3: T3                                                        = item.item.i1.i2.i1
  def i4: T4                                                        = item.item.i1.i2.i2
  def i5: T5                                                        = item.item.i2.i1.i1
  def i6: T6                                                        = item.item.i2.i1.i2
}
class Item2XyyReverse6[T1, T2, T3, T4, T5, T6](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem6[T1, T2, T3, T4, T5, T6] {
  override def pudao[T](xyy: T): Item2XyyReverse7[T, T1, T2, T3, T4, T5, T6] = new Item2XyyReverse7[T, T1, T2, T3, T4, T5, T6](item.addRightItem(xyy))
  override def leftHead: T1                                                  = item.dropRightItem
  override def leftTail: Item2XyyReverse5[T2, T3, T4, T5, T6]                = new Item2XyyReverse5(item.dropRight)
  def i1: T1                                                                 = item.item.i2.i1.i2
  def i2: T2                                                                 = item.item.i2.i1.i1
  def i3: T3                                                                 = item.item.i1.i2.i2
  def i4: T4                                                                 = item.item.i1.i2.i1
  def i5: T5                                                                 = item.item.i1.i1.i2
  def i6: T6                                                                 = item.item.i1.i1.i1
}
