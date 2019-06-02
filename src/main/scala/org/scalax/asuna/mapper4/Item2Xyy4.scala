package org.scalax.asuna.mapper.item
class Item2Xyy4[T1, T2, T3, T4](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4])
    extends AnyVal
    with XyyItem4[T1, T2, T3, T4] {
  override def eat[T](xyy: T): Item2Xyy5[T1, T2, T3, T4, T] = new Item2Xyy5[T1, T2, T3, T4, T](item.addRightItem(xyy))
  override def rightHead: T4                                = item.dropRightItem
  override def rightTail: Item2Xyy3[T1, T2, T3]             = new Item2Xyy3(item.dropRight)
  def i1: T1                                                = item.item.i1.i1
  def i2: T2                                                = item.item.i1.i2
  def i3: T3                                                = item.item.i2.i1
  def i4: T4                                                = item.item.i2.i2
}
class Item2XyyReverse4[T1, T2, T3, T4](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1])
    extends AnyVal
    with XyyItem4[T1, T2, T3, T4] {
  override def pudao[T](xyy: T): Item2XyyReverse5[T, T1, T2, T3, T4] = new Item2XyyReverse5[T, T1, T2, T3, T4](item.addRightItem(xyy))
  override def leftHead: T1                                          = item.dropRightItem
  override def leftTail: Item2XyyReverse3[T2, T3, T4]                = new Item2XyyReverse3(item.dropRight)
  def i1: T1                                                         = item.item.i2.i2
  def i2: T2                                                         = item.item.i2.i1
  def i3: T3                                                         = item.item.i1.i2
  def i4: T4                                                         = item.item.i1.i1
}
