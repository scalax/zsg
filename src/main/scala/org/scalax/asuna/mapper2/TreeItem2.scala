package org.scalax.asuna.mapper.item
class TreeItem2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]) extends AnyVal with XyyItem2[T1, T2] {
  override def eat[T](xyy: T): TreeItem3[T1, T2, T] = new TreeItem3[T1, T2, T](item.addRightItem(xyy))
  override def rightHead: T2                        = item.dropRightItem
  override def rightTail: TreeItem1[T1]             = new TreeItem1(item.dropRight)
  def i1: T1                                        = item.item.i1
  def i2: T2                                        = item.item.i2
}
class ReverseTreeItem2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T2]#AddRightItem[T1]) extends AnyVal with XyyItem2[T1, T2] {
  override def pudao[T](xyy: T): ReverseTreeItem3[T, T1, T2] = new ReverseTreeItem3[T, T1, T2](item.addRightItem(xyy))
  override def leftHead: T1                                  = item.dropRightItem
  override def leftTail: ReverseTreeItem1[T2]                = new ReverseTreeItem1(item.dropRight)
  def i1: T1                                                 = item.item.i2
  def i2: T2                                                 = item.item.i1
}
