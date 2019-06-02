package org.scalax.asuna.mapper.item
class Item2Xyy3[T1, T2, T3](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3])
    extends AnyVal
    with XyyItem3[T1, T2, T3] {
  override def eat[T](xyy: T): Item2Xyy4[T1, T2, T3, T] = new Item2Xyy4[T1, T2, T3, T](item.addRightItem(xyy))
  override def rightHead: T3                            = item.dropRightItem
  override def rightTail: Item2Xyy2[T1, T2]             = new Item2Xyy2(item.dropRight)
  def i1: T1                                            = item.item.i1.i1
  def i2: T2                                            = item.item.i1.i2
  def i3: T3                                            = item.item.i2.i1
}
class Item2XyyReverse3[T1, T2, T3](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1])
    extends AnyVal
    with XyyItem3[T1, T2, T3] {
  override def pudao[T](xyy: T): Item2XyyReverse4[T, T1, T2, T3] = new Item2XyyReverse4[T, T1, T2, T3](item.addRightItem(xyy))
  override def leftHead: T1                                      = item.dropRightItem
  override def leftTail: Item2XyyReverse2[T2, T3]                = new Item2XyyReverse2(item.dropRight)
  def i1: T1                                                     = item.item.i2.i1
  def i2: T2                                                     = item.item.i1.i2
  def i3: T3                                                     = item.item.i1.i1
}
