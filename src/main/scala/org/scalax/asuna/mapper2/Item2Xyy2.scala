package org.scalax.asuna.ii.item
class Item2Xyy2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]) extends AnyVal with XyyItem2[T1, T2] {
  override def eat[T](xyy: T): Item2Xyy3[T1, T2, T] = new Item2Xyy3[T1, T2, T](item.addRightItem(xyy))
  override def rightHead: T2                        = item.dropRightItem
  override def rightTail: Item2Xyy1[T1]             = new Item2Xyy1(item.dropRight)
  def i1: T1                                        = item.item.i1
  def i2: T2                                        = item.item.i2
}
class Item2XyyReverse2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T2]#AddRightItem[T1]) extends AnyVal with XyyItem2[T1, T2] {
  override def pudao[T](xyy: T): Item2XyyReverse3[T, T1, T2] = new Item2XyyReverse3[T, T1, T2](item.addRightItem(xyy))
  override def leftHead: T1                                  = item.dropRightItem
  override def leftTail: Item2XyyReverse1[T2]                = new Item2XyyReverse1(item.dropRight)
  def i1: T1                                                 = item.item.i2
  def i2: T2                                                 = item.item.i1
}
