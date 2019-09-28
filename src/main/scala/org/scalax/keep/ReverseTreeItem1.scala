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

class ReverseTreeItem8[T1, T2, T3, T4, T5, T6, T7, T8](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[
    T6
  ]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with Item8[T1, T2, T3, T4, T5, T6, T7, T8] {
  override def leftHead: T1 = item.dropRightItem
  override def leftTail: ReverseTreeItem7[T2, T3, T4, T5, T6, T7, T8] =
    new ReverseTreeItem7(item.dropRight)
  def i1: T1 = item.item.i2.i2.i2
  def i2: T2 = item.item.i2.i2.i1
  def i3: T3 = item.item.i2.i1.i2
  def i4: T4 = item.item.i2.i1.i1
  def i5: T5 = item.item.i1.i2.i2
  def i6: T6 = item.item.i1.i2.i1
  def i7: T7 = item.item.i1.i1.i2
  def i8: T8 = item.item.i1.i1.i1
}
