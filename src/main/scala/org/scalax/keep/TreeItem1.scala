package org.scalax.asuna.mapper.item
trait TreeItem0 extends Any with Item0 {
  override def eat[T](xyy: T): TreeItem1[T] = new TreeItem1(org.scalax.asuna.mapper.item.EatValue0.addRightItem(xyy))
}
object TreeItem0 extends TreeItem0
class TreeItem1[T1](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]) extends AnyVal with Item1[T1] {
  override def eat[T](xyy: T): TreeItem2[T1, T] = new TreeItem2[T1, T](item.addRightItem(xyy))
  override def rightHead: T1                    = item.dropRightItem
  override def rightTail: TreeItem0             = TreeItem0
  override def i1: T1                           = item.item.i1
}

class TreeItem8[T1, T2, T3, T4, T5, T6, T7, T8](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[T7]#AddRightItem[
    T8
  ]
) extends AnyVal
    with Item8[T1, T2, T3, T4, T5, T6, T7, T8] {
  override def rightHead: T8                                    = item.dropRightItem
  override def rightTail: TreeItem7[T1, T2, T3, T4, T5, T6, T7] = new TreeItem7(item.dropRight)
  def i1: T1                                                    = item.item.i1.i1.i1
  def i2: T2                                                    = item.item.i1.i1.i2
  def i3: T3                                                    = item.item.i1.i2.i1
  def i4: T4                                                    = item.item.i1.i2.i2
  def i5: T5                                                    = item.item.i2.i1.i1
  def i6: T6                                                    = item.item.i2.i1.i2
  def i7: T7                                                    = item.item.i2.i2.i1
  def i8: T8                                                    = item.item.i2.i2.i2
}
