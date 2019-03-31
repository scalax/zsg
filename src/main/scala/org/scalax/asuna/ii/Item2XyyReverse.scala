package org.scalax.asuna.ii.item
trait Item2XyyReverse0 extends Any with XyyItem0 {
  override def pudao[T](xyy: T): Item2XyyReverse1[T] = new Item2XyyReverse1(org.scalax.asuna.mapper.item.EatValue0.addRightItem(xyy))
}
object Item2XyyReverse0 extends Item2XyyReverse0
class Item2XyyReverse1[T1](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]) extends AnyVal with XyyItem1[T1] {
  override def pudao[T](xyy: T): Item2XyyReverse2[T, T1] = new Item2XyyReverse2[T, T1](item.addRightItem(xyy))
  override def leftHead: T1                              = item.dropRightItem
  override def leftTail: Item2XyyReverse0                = Item2XyyReverse0
  override def i1: T1                                    = item.item.i1
}
class Item2XyyReverse2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T2]#AddRightItem[T1]) extends AnyVal with XyyItem2[T1, T2] {
  override def pudao[T](xyy: T): Item2XyyReverse3[T, T1, T2] = new Item2XyyReverse3[T, T1, T2](item.addRightItem(xyy))
  override def leftHead: T1                                  = item.dropRightItem
  override def leftTail: Item2XyyReverse1[T2]                = new Item2XyyReverse1(item.dropRight)
  def i1: T1                                                 = item.item.i2
  def i2: T2                                                 = item.item.i1
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
class Item2XyyReverse5[T1, T2, T3, T4, T5](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem5[T1, T2, T3, T4, T5] {
  override def pudao[T](xyy: T): Item2XyyReverse6[T, T1, T2, T3, T4, T5] = new Item2XyyReverse6[T, T1, T2, T3, T4, T5](item.addRightItem(xyy))
  override def leftHead: T1                                              = item.dropRightItem
  override def leftTail: Item2XyyReverse4[T2, T3, T4, T5]                = new Item2XyyReverse4(item.dropRight)
  def i1: T1                                                             = item.item.i2.i1.i1
  def i2: T2                                                             = item.item.i1.i2.i2
  def i3: T3                                                             = item.item.i1.i2.i1
  def i4: T4                                                             = item.item.i1.i1.i2
  def i5: T5                                                             = item.item.i1.i1.i1
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
class Item2XyyReverse7[T1, T2, T3, T4, T5, T6, T7](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem7[T1, T2, T3, T4, T5, T6, T7] {
  override def pudao[T](xyy: T): Item2XyyReverse8[T, T1, T2, T3, T4, T5, T6, T7] = new Item2XyyReverse8[T, T1, T2, T3, T4, T5, T6, T7](item.addRightItem(xyy))
  override def leftHead: T1                                                      = item.dropRightItem
  override def leftTail: Item2XyyReverse6[T2, T3, T4, T5, T6, T7]                = new Item2XyyReverse6(item.dropRight)
  def i1: T1                                                                     = item.item.i2.i2.i1
  def i2: T2                                                                     = item.item.i2.i1.i2
  def i3: T3                                                                     = item.item.i2.i1.i1
  def i4: T4                                                                     = item.item.i1.i2.i2
  def i5: T5                                                                     = item.item.i1.i2.i1
  def i6: T6                                                                     = item.item.i1.i1.i2
  def i7: T7                                                                     = item.item.i1.i1.i1
}
class Item2XyyReverse8[T1, T2, T3, T4, T5, T6, T7, T8](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[
    T1
  ]
) extends AnyVal
    with XyyItem8[T1, T2, T3, T4, T5, T6, T7, T8] {
  override def pudao[T](xyy: T): Item2XyyReverse9[T, T1, T2, T3, T4, T5, T6, T7, T8] = new Item2XyyReverse9[T, T1, T2, T3, T4, T5, T6, T7, T8](item.addRightItem(xyy))
  override def leftHead: T1                                                          = item.dropRightItem
  override def leftTail: Item2XyyReverse7[T2, T3, T4, T5, T6, T7, T8]                = new Item2XyyReverse7(item.dropRight)
  def i1: T1                                                                         = item.item.i2.i2.i2
  def i2: T2                                                                         = item.item.i2.i2.i1
  def i3: T3                                                                         = item.item.i2.i1.i2
  def i4: T4                                                                         = item.item.i2.i1.i1
  def i5: T5                                                                         = item.item.i1.i2.i2
  def i6: T6                                                                         = item.item.i1.i2.i1
  def i7: T7                                                                         = item.item.i1.i1.i2
  def i8: T8                                                                         = item.item.i1.i1.i1
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
class Item2XyyReverse10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[
    T3
  ]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
  override def pudao[T](xyy: T): Item2XyyReverse11[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    new Item2XyyReverse11[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](item.addRightItem(xyy))
  override def leftHead: T1                                                    = item.dropRightItem
  override def leftTail: Item2XyyReverse9[T2, T3, T4, T5, T6, T7, T8, T9, T10] = new Item2XyyReverse9(item.dropRight)
  def i1: T1                                                                   = item.item.i2.i1.i1.i2
  def i2: T2                                                                   = item.item.i2.i1.i1.i1
  def i3: T3                                                                   = item.item.i1.i2.i2.i2
  def i4: T4                                                                   = item.item.i1.i2.i2.i1
  def i5: T5                                                                   = item.item.i1.i2.i1.i2
  def i6: T6                                                                   = item.item.i1.i2.i1.i1
  def i7: T7                                                                   = item.item.i1.i1.i2.i2
  def i8: T8                                                                   = item.item.i1.i1.i2.i1
  def i9: T9                                                                   = item.item.i1.i1.i1.i2
  def i10: T10                                                                 = item.item.i1.i1.i1.i1
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
class Item2XyyReverse12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[
    T6
  ]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
  override def pudao[T](xyy: T): Item2XyyReverse13[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new Item2XyyReverse13[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](item.addRightItem(xyy))
  override def leftHead: T1                                                               = item.dropRightItem
  override def leftTail: Item2XyyReverse11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new Item2XyyReverse11(item.dropRight)
  def i1: T1                                                                              = item.item.i2.i1.i2.i2
  def i2: T2                                                                              = item.item.i2.i1.i2.i1
  def i3: T3                                                                              = item.item.i2.i1.i1.i2
  def i4: T4                                                                              = item.item.i2.i1.i1.i1
  def i5: T5                                                                              = item.item.i1.i2.i2.i2
  def i6: T6                                                                              = item.item.i1.i2.i2.i1
  def i7: T7                                                                              = item.item.i1.i2.i1.i2
  def i8: T8                                                                              = item.item.i1.i2.i1.i1
  def i9: T9                                                                              = item.item.i1.i1.i2.i2
  def i10: T10                                                                            = item.item.i1.i1.i2.i1
  def i11: T11                                                                            = item.item.i1.i1.i1.i2
  def i12: T12                                                                            = item.item.i1.i1.i1.i1
}
class Item2XyyReverse13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[
    T7
  ]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
  override def pudao[T](xyy: T): Item2XyyReverse14[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new Item2XyyReverse14[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](item.addRightItem(xyy))
  override def leftHead: T1                                                                    = item.dropRightItem
  override def leftTail: Item2XyyReverse12[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new Item2XyyReverse12(item.dropRight)
  def i1: T1                                                                                   = item.item.i2.i2.i1.i1
  def i2: T2                                                                                   = item.item.i2.i1.i2.i2
  def i3: T3                                                                                   = item.item.i2.i1.i2.i1
  def i4: T4                                                                                   = item.item.i2.i1.i1.i2
  def i5: T5                                                                                   = item.item.i2.i1.i1.i1
  def i6: T6                                                                                   = item.item.i1.i2.i2.i2
  def i7: T7                                                                                   = item.item.i1.i2.i2.i1
  def i8: T8                                                                                   = item.item.i1.i2.i1.i2
  def i9: T9                                                                                   = item.item.i1.i2.i1.i1
  def i10: T10                                                                                 = item.item.i1.i1.i2.i2
  def i11: T11                                                                                 = item.item.i1.i1.i2.i1
  def i12: T12                                                                                 = item.item.i1.i1.i1.i2
  def i13: T13                                                                                 = item.item.i1.i1.i1.i1
}
class Item2XyyReverse14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[
    T8
  ]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
  override def pudao[T](xyy: T): Item2XyyReverse15[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new Item2XyyReverse15[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](item.addRightItem(xyy))
  override def leftHead: T1                                                                         = item.dropRightItem
  override def leftTail: Item2XyyReverse13[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new Item2XyyReverse13(item.dropRight)
  def i1: T1                                                                                        = item.item.i2.i2.i1.i2
  def i2: T2                                                                                        = item.item.i2.i2.i1.i1
  def i3: T3                                                                                        = item.item.i2.i1.i2.i2
  def i4: T4                                                                                        = item.item.i2.i1.i2.i1
  def i5: T5                                                                                        = item.item.i2.i1.i1.i2
  def i6: T6                                                                                        = item.item.i2.i1.i1.i1
  def i7: T7                                                                                        = item.item.i1.i2.i2.i2
  def i8: T8                                                                                        = item.item.i1.i2.i2.i1
  def i9: T9                                                                                        = item.item.i1.i2.i1.i2
  def i10: T10                                                                                      = item.item.i1.i2.i1.i1
  def i11: T11                                                                                      = item.item.i1.i1.i2.i2
  def i12: T12                                                                                      = item.item.i1.i1.i2.i1
  def i13: T13                                                                                      = item.item.i1.i1.i1.i2
  def i14: T14                                                                                      = item.item.i1.i1.i1.i1
}
class Item2XyyReverse15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[
    T9
  ]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
  override def pudao[T](xyy: T): Item2XyyReverse16[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new Item2XyyReverse16[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](item.addRightItem(xyy))
  override def leftHead: T1                                                                              = item.dropRightItem
  override def leftTail: Item2XyyReverse14[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new Item2XyyReverse14(item.dropRight)
  def i1: T1                                                                                             = item.item.i2.i2.i2.i1
  def i2: T2                                                                                             = item.item.i2.i2.i1.i2
  def i3: T3                                                                                             = item.item.i2.i2.i1.i1
  def i4: T4                                                                                             = item.item.i2.i1.i2.i2
  def i5: T5                                                                                             = item.item.i2.i1.i2.i1
  def i6: T6                                                                                             = item.item.i2.i1.i1.i2
  def i7: T7                                                                                             = item.item.i2.i1.i1.i1
  def i8: T8                                                                                             = item.item.i1.i2.i2.i2
  def i9: T9                                                                                             = item.item.i1.i2.i2.i1
  def i10: T10                                                                                           = item.item.i1.i2.i1.i2
  def i11: T11                                                                                           = item.item.i1.i2.i1.i1
  def i12: T12                                                                                           = item.item.i1.i1.i2.i2
  def i13: T13                                                                                           = item.item.i1.i1.i2.i1
  def i14: T14                                                                                           = item.item.i1.i1.i1.i2
  def i15: T15                                                                                           = item.item.i1.i1.i1.i1
}
class Item2XyyReverse16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[
    T10
  ]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
  override def pudao[T](xyy: T): Item2XyyReverse17[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new Item2XyyReverse17[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](item.addRightItem(xyy))
  override def leftHead: T1                                                                                   = item.dropRightItem
  override def leftTail: Item2XyyReverse15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new Item2XyyReverse15(item.dropRight)
  def i1: T1                                                                                                  = item.item.i2.i2.i2.i2
  def i2: T2                                                                                                  = item.item.i2.i2.i2.i1
  def i3: T3                                                                                                  = item.item.i2.i2.i1.i2
  def i4: T4                                                                                                  = item.item.i2.i2.i1.i1
  def i5: T5                                                                                                  = item.item.i2.i1.i2.i2
  def i6: T6                                                                                                  = item.item.i2.i1.i2.i1
  def i7: T7                                                                                                  = item.item.i2.i1.i1.i2
  def i8: T8                                                                                                  = item.item.i2.i1.i1.i1
  def i9: T9                                                                                                  = item.item.i1.i2.i2.i2
  def i10: T10                                                                                                = item.item.i1.i2.i2.i1
  def i11: T11                                                                                                = item.item.i1.i2.i1.i2
  def i12: T12                                                                                                = item.item.i1.i2.i1.i1
  def i13: T13                                                                                                = item.item.i1.i1.i2.i2
  def i14: T14                                                                                                = item.item.i1.i1.i2.i1
  def i15: T15                                                                                                = item.item.i1.i1.i1.i2
  def i16: T16                                                                                                = item.item.i1.i1.i1.i1
}
class Item2XyyReverse17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[
    T11
  ]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[
    T1
  ]
) extends AnyVal
    with XyyItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
  override def pudao[T](xyy: T): Item2XyyReverse18[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new Item2XyyReverse18[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](item.addRightItem(xyy))
  override def leftHead: T1                                                                                        = item.dropRightItem
  override def leftTail: Item2XyyReverse16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = new Item2XyyReverse16(item.dropRight)
  def i1: T1                                                                                                       = item.item.i2.i1.i1.i1.i1
  def i2: T2                                                                                                       = item.item.i1.i2.i2.i2.i2
  def i3: T3                                                                                                       = item.item.i1.i2.i2.i2.i1
  def i4: T4                                                                                                       = item.item.i1.i2.i2.i1.i2
  def i5: T5                                                                                                       = item.item.i1.i2.i2.i1.i1
  def i6: T6                                                                                                       = item.item.i1.i2.i1.i2.i2
  def i7: T7                                                                                                       = item.item.i1.i2.i1.i2.i1
  def i8: T8                                                                                                       = item.item.i1.i2.i1.i1.i2
  def i9: T9                                                                                                       = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                     = item.item.i1.i1.i2.i2.i2
  def i11: T11                                                                                                     = item.item.i1.i1.i2.i2.i1
  def i12: T12                                                                                                     = item.item.i1.i1.i2.i1.i2
  def i13: T13                                                                                                     = item.item.i1.i1.i2.i1.i1
  def i14: T14                                                                                                     = item.item.i1.i1.i1.i2.i2
  def i15: T15                                                                                                     = item.item.i1.i1.i1.i2.i1
  def i16: T16                                                                                                     = item.item.i1.i1.i1.i1.i2
  def i17: T17                                                                                                     = item.item.i1.i1.i1.i1.i1
}
class Item2XyyReverse18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[
    T12
  ]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[
    T2
  ]#AddRightItem[T1]
) extends AnyVal
    with XyyItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
  override def pudao[T](xyy: T): Item2XyyReverse19[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new Item2XyyReverse19[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](item.addRightItem(xyy))
  override def leftHead: T1                                                                                             = item.dropRightItem
  override def leftTail: Item2XyyReverse17[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = new Item2XyyReverse17(item.dropRight)
  def i1: T1                                                                                                            = item.item.i2.i1.i1.i1.i2
  def i2: T2                                                                                                            = item.item.i2.i1.i1.i1.i1
  def i3: T3                                                                                                            = item.item.i1.i2.i2.i2.i2
  def i4: T4                                                                                                            = item.item.i1.i2.i2.i2.i1
  def i5: T5                                                                                                            = item.item.i1.i2.i2.i1.i2
  def i6: T6                                                                                                            = item.item.i1.i2.i2.i1.i1
  def i7: T7                                                                                                            = item.item.i1.i2.i1.i2.i2
  def i8: T8                                                                                                            = item.item.i1.i2.i1.i2.i1
  def i9: T9                                                                                                            = item.item.i1.i2.i1.i1.i2
  def i10: T10                                                                                                          = item.item.i1.i2.i1.i1.i1
  def i11: T11                                                                                                          = item.item.i1.i1.i2.i2.i2
  def i12: T12                                                                                                          = item.item.i1.i1.i2.i2.i1
  def i13: T13                                                                                                          = item.item.i1.i1.i2.i1.i2
  def i14: T14                                                                                                          = item.item.i1.i1.i2.i1.i1
  def i15: T15                                                                                                          = item.item.i1.i1.i1.i2.i2
  def i16: T16                                                                                                          = item.item.i1.i1.i1.i2.i1
  def i17: T17                                                                                                          = item.item.i1.i1.i1.i1.i2
  def i18: T18                                                                                                          = item.item.i1.i1.i1.i1.i1
}
class Item2XyyReverse19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T19]#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[
    T13
  ]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[
    T3
  ]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
  override def pudao[T](xyy: T): Item2XyyReverse20[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new Item2XyyReverse20[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](item.addRightItem(xyy))
  override def leftHead: T1                                                                                                  = item.dropRightItem
  override def leftTail: Item2XyyReverse18[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = new Item2XyyReverse18(item.dropRight)
  def i1: T1                                                                                                                 = item.item.i2.i1.i1.i2.i1
  def i2: T2                                                                                                                 = item.item.i2.i1.i1.i1.i2
  def i3: T3                                                                                                                 = item.item.i2.i1.i1.i1.i1
  def i4: T4                                                                                                                 = item.item.i1.i2.i2.i2.i2
  def i5: T5                                                                                                                 = item.item.i1.i2.i2.i2.i1
  def i6: T6                                                                                                                 = item.item.i1.i2.i2.i1.i2
  def i7: T7                                                                                                                 = item.item.i1.i2.i2.i1.i1
  def i8: T8                                                                                                                 = item.item.i1.i2.i1.i2.i2
  def i9: T9                                                                                                                 = item.item.i1.i2.i1.i2.i1
  def i10: T10                                                                                                               = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                               = item.item.i1.i2.i1.i1.i1
  def i12: T12                                                                                                               = item.item.i1.i1.i2.i2.i2
  def i13: T13                                                                                                               = item.item.i1.i1.i2.i2.i1
  def i14: T14                                                                                                               = item.item.i1.i1.i2.i1.i2
  def i15: T15                                                                                                               = item.item.i1.i1.i2.i1.i1
  def i16: T16                                                                                                               = item.item.i1.i1.i1.i2.i2
  def i17: T17                                                                                                               = item.item.i1.i1.i1.i2.i1
  def i18: T18                                                                                                               = item.item.i1.i1.i1.i1.i2
  def i19: T19                                                                                                               = item.item.i1.i1.i1.i1.i1
}
class Item2XyyReverse20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T20]#AddRightItem[T19]#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[T15]#AddRightItem[
    T14
  ]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[T5]#AddRightItem[
    T4
  ]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
  override def pudao[T](xyy: T): Item2XyyReverse21[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    new Item2XyyReverse21[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](item.addRightItem(xyy))
  override def leftHead: T1                                                                                                       = item.dropRightItem
  override def leftTail: Item2XyyReverse19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = new Item2XyyReverse19(item.dropRight)
  def i1: T1                                                                                                                      = item.item.i2.i1.i1.i2.i2
  def i2: T2                                                                                                                      = item.item.i2.i1.i1.i2.i1
  def i3: T3                                                                                                                      = item.item.i2.i1.i1.i1.i2
  def i4: T4                                                                                                                      = item.item.i2.i1.i1.i1.i1
  def i5: T5                                                                                                                      = item.item.i1.i2.i2.i2.i2
  def i6: T6                                                                                                                      = item.item.i1.i2.i2.i2.i1
  def i7: T7                                                                                                                      = item.item.i1.i2.i2.i1.i2
  def i8: T8                                                                                                                      = item.item.i1.i2.i2.i1.i1
  def i9: T9                                                                                                                      = item.item.i1.i2.i1.i2.i2
  def i10: T10                                                                                                                    = item.item.i1.i2.i1.i2.i1
  def i11: T11                                                                                                                    = item.item.i1.i2.i1.i1.i2
  def i12: T12                                                                                                                    = item.item.i1.i2.i1.i1.i1
  def i13: T13                                                                                                                    = item.item.i1.i1.i2.i2.i2
  def i14: T14                                                                                                                    = item.item.i1.i1.i2.i2.i1
  def i15: T15                                                                                                                    = item.item.i1.i1.i2.i1.i2
  def i16: T16                                                                                                                    = item.item.i1.i1.i2.i1.i1
  def i17: T17                                                                                                                    = item.item.i1.i1.i1.i2.i2
  def i18: T18                                                                                                                    = item.item.i1.i1.i1.i2.i1
  def i19: T19                                                                                                                    = item.item.i1.i1.i1.i1.i2
  def i20: T20                                                                                                                    = item.item.i1.i1.i1.i1.i1
}
class Item2XyyReverse21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T21]#AddRightItem[T20]#AddRightItem[T19]#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[T16]#AddRightItem[
    T15
  ]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[T6]#AddRightItem[
    T5
  ]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
  override def pudao[T](xyy: T): Item2XyyReverse22[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new Item2XyyReverse22[T, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](item.addRightItem(xyy))
  override def leftHead: T1 = item.dropRightItem
  override def leftTail: Item2XyyReverse20[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new Item2XyyReverse20(item.dropRight)
  def i1: T1   = item.item.i2.i1.i2.i1.i1
  def i2: T2   = item.item.i2.i1.i1.i2.i2
  def i3: T3   = item.item.i2.i1.i1.i2.i1
  def i4: T4   = item.item.i2.i1.i1.i1.i2
  def i5: T5   = item.item.i2.i1.i1.i1.i1
  def i6: T6   = item.item.i1.i2.i2.i2.i2
  def i7: T7   = item.item.i1.i2.i2.i2.i1
  def i8: T8   = item.item.i1.i2.i2.i1.i2
  def i9: T9   = item.item.i1.i2.i2.i1.i1
  def i10: T10 = item.item.i1.i2.i1.i2.i2
  def i11: T11 = item.item.i1.i2.i1.i2.i1
  def i12: T12 = item.item.i1.i2.i1.i1.i2
  def i13: T13 = item.item.i1.i2.i1.i1.i1
  def i14: T14 = item.item.i1.i1.i2.i2.i2
  def i15: T15 = item.item.i1.i1.i2.i2.i1
  def i16: T16 = item.item.i1.i1.i2.i1.i2
  def i17: T17 = item.item.i1.i1.i2.i1.i1
  def i18: T18 = item.item.i1.i1.i1.i2.i2
  def i19: T19 = item.item.i1.i1.i1.i2.i1
  def i20: T20 = item.item.i1.i1.i1.i1.i2
  def i21: T21 = item.item.i1.i1.i1.i1.i1
}
class Item2XyyReverse22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
  val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T22]#AddRightItem[T21]#AddRightItem[T20]#AddRightItem[T19]#AddRightItem[T18]#AddRightItem[T17]#AddRightItem[
    T16
  ]#AddRightItem[T15]#AddRightItem[T14]#AddRightItem[T13]#AddRightItem[T12]#AddRightItem[T11]#AddRightItem[T10]#AddRightItem[T9]#AddRightItem[T8]#AddRightItem[T7]#AddRightItem[
    T6
  ]#AddRightItem[T5]#AddRightItem[T4]#AddRightItem[T3]#AddRightItem[T2]#AddRightItem[T1]
) extends AnyVal
    with XyyItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  override def leftHead: T1 = item.dropRightItem
  override def leftTail: Item2XyyReverse21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new Item2XyyReverse21(item.dropRight)
  def i1: T1   = item.item.i2.i1.i2.i1.i2
  def i2: T2   = item.item.i2.i1.i2.i1.i1
  def i3: T3   = item.item.i2.i1.i1.i2.i2
  def i4: T4   = item.item.i2.i1.i1.i2.i1
  def i5: T5   = item.item.i2.i1.i1.i1.i2
  def i6: T6   = item.item.i2.i1.i1.i1.i1
  def i7: T7   = item.item.i1.i2.i2.i2.i2
  def i8: T8   = item.item.i1.i2.i2.i2.i1
  def i9: T9   = item.item.i1.i2.i2.i1.i2
  def i10: T10 = item.item.i1.i2.i2.i1.i1
  def i11: T11 = item.item.i1.i2.i1.i2.i2
  def i12: T12 = item.item.i1.i2.i1.i2.i1
  def i13: T13 = item.item.i1.i2.i1.i1.i2
  def i14: T14 = item.item.i1.i2.i1.i1.i1
  def i15: T15 = item.item.i1.i1.i2.i2.i2
  def i16: T16 = item.item.i1.i1.i2.i2.i1
  def i17: T17 = item.item.i1.i1.i2.i1.i2
  def i18: T18 = item.item.i1.i1.i2.i1.i1
  def i19: T19 = item.item.i1.i1.i1.i2.i2
  def i20: T20 = item.item.i1.i1.i1.i2.i1
  def i21: T21 = item.item.i1.i1.i1.i1.i2
  def i22: T22 = item.item.i1.i1.i1.i1.i1
}
