package org.scalax.asuna.mapper.item
class TreeItem5[T1, T2, T3, T4, T5](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5])
    extends AnyVal
    with Item5[T1, T2, T3, T4, T5] {
  override def eat[T](xyy: T): TreeItem6[T1, T2, T3, T4, T5, T] = new TreeItem6[T1, T2, T3, T4, T5, T](item.addRightItem(xyy))
  override def rightHead: T5                                    = item.dropRightItem
  override def rightTail: TreeItem4[T1, T2, T3, T4]             = new TreeItem4(item.dropRight)
  def i1: T1                                                    = item.item.i1.i1.i1
  def i2: T2                                                    = item.item.i1.i1.i2
  def i3: T3                                                    = item.item.i1.i2.i1
  def i4: T4                                                    = item.item.i1.i2.i2
  def i5: T5                                                    = item.item.i2.i1.i1
}
class ReverseTreeItem5[T1, T2, T3, T4, T5](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with Item5[T1, T2, T3, T4, T5] {
  override def pudao[T](xyy: T): ReverseTreeItem6[T, T1, T2, T3, T4, T5] = new ReverseTreeItem6[T, T1, T2, T3, T4, T5](item.addRightItem(xyy))
  override def leftHead: T1                                              = item.dropRightItem
  override def leftTail: ReverseTreeItem4[T2, T3, T4, T5]                = new ReverseTreeItem4(item.dropRight)
  def i1: T1                                                             = item.item.i2.i1.i1
  def i2: T2                                                             = item.item.i1.i2.i2
  def i3: T3                                                             = item.item.i1.i2.i1
  def i4: T4                                                             = item.item.i1.i1.i2
  def i5: T5                                                             = item.item.i1.i1.i1
}
