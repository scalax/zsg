package org.scalax.asuna.ii.item
trait Item2Xyy0 extends Any with XyyItem0 {
  override def eat[T](xyy: T): Item2Xyy1[T] = new Item2Xyy1(org.scalax.asuna.mapper.item.EatValue0.addRightItem(xyy))
}
object Item2Xyy0 extends Item2Xyy0
class Item2Xyy1[T1](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]) extends AnyVal with XyyItem1[T1] {
  override def eat[T](xyy: T): Item2Xyy2[T1, T] = new Item2Xyy2[T1, T](item.addRightItem(xyy))
  override def rightHead: T1                    = item.dropRightItem
  override def rightTail: Item2Xyy0             = Item2Xyy0
  override def i1: T1                           = item.item.i1
}
class Item2Xyy2[T1, T2](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]) extends AnyVal with XyyItem2[T1, T2] {
  override def eat[T](xyy: T): Item2Xyy3[T1, T2, T] = new Item2Xyy3[T1, T2, T](item.addRightItem(xyy))
  override def rightHead: T2                        = item.dropRightItem
  override def rightTail: Item2Xyy1[T1]             = new Item2Xyy1(item.dropRight)
  def i1: T1                                        = item.item.i1
  def i2: T2                                        = item.item.i2
}
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
class Item2Xyy5[T1, T2, T3, T4, T5](val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5])
    extends AnyVal
    with XyyItem5[T1, T2, T3, T4, T5] {
  override def eat[T](xyy: T): Item2Xyy6[T1, T2, T3, T4, T5, T] = new Item2Xyy6[T1, T2, T3, T4, T5, T](item.addRightItem(xyy))
  override def rightHead: T5                                    = item.dropRightItem
  override def rightTail: Item2Xyy4[T1, T2, T3, T4]             = new Item2Xyy4(item.dropRight)
  def i1: T1                                                    = item.item.i1.i1.i1
  def i2: T2                                                    = item.item.i1.i1.i2
  def i3: T3                                                    = item.item.i1.i2.i1
  def i4: T4                                                    = item.item.i1.i2.i2
  def i5: T5                                                    = item.item.i2.i1.i1
}
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
class Item2Xyy7[T1, T2, T3, T4, T5, T6, T7](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]
) extends AnyVal
    with XyyItem7[T1, T2, T3, T4, T5, T6, T7] {
  override def eat[T](xyy: T): Item2Xyy8[T1, T2, T3, T4, T5, T6, T7, T] = new Item2Xyy8[T1, T2, T3, T4, T5, T6, T7, T](item.addRightItem(xyy))
  override def rightHead: T7                                            = item.dropRightItem
  override def rightTail: Item2Xyy6[T1, T2, T3, T4, T5, T6]             = new Item2Xyy6(item.dropRight)
  def i1: T1                                                            = item.item.i1.i1.i1
  def i2: T2                                                            = item.item.i1.i1.i2
  def i3: T3                                                            = item.item.i1.i2.i1
  def i4: T4                                                            = item.item.i1.i2.i2
  def i5: T5                                                            = item.item.i2.i1.i1
  def i6: T6                                                            = item.item.i2.i1.i2
  def i7: T7                                                            = item.item.i2.i2.i1
}
class Item2Xyy8[T1, T2, T3, T4, T5, T6, T7, T8](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]
) extends AnyVal
    with XyyItem8[T1, T2, T3, T4, T5, T6, T7, T8] {
  override def eat[T](xyy: T): Item2Xyy9[T1, T2, T3, T4, T5, T6, T7, T8, T] = new Item2Xyy9[T1, T2, T3, T4, T5, T6, T7, T8, T](item.addRightItem(xyy))
  override def rightHead: T8                                                = item.dropRightItem
  override def rightTail: Item2Xyy7[T1, T2, T3, T4, T5, T6, T7]             = new Item2Xyy7(item.dropRight)
  def i1: T1                                                                = item.item.i1.i1.i1
  def i2: T2                                                                = item.item.i1.i1.i2
  def i3: T3                                                                = item.item.i1.i2.i1
  def i4: T4                                                                = item.item.i1.i2.i2
  def i5: T5                                                                = item.item.i2.i1.i1
  def i6: T6                                                                = item.item.i2.i1.i2
  def i7: T7                                                                = item.item.i2.i2.i1
  def i8: T8                                                                = item.item.i2.i2.i2
}
class Item2Xyy9[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]
) extends AnyVal
    with XyyItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9] {
  override def eat[T](xyy: T): Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T] = new Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T](item.addRightItem(xyy))
  override def rightHead: T9                                                     = item.dropRightItem
  override def rightTail: Item2Xyy8[T1, T2, T3, T4, T5, T6, T7, T8]              = new Item2Xyy8(item.dropRight)
  def i1: T1                                                                     = item.item.i1.i1.i1.i1
  def i2: T2                                                                     = item.item.i1.i1.i1.i2
  def i3: T3                                                                     = item.item.i1.i1.i2.i1
  def i4: T4                                                                     = item.item.i1.i1.i2.i2
  def i5: T5                                                                     = item.item.i1.i2.i1.i1
  def i6: T6                                                                     = item.item.i1.i2.i1.i2
  def i7: T7                                                                     = item.item.i1.i2.i2.i1
  def i8: T8                                                                     = item.item.i1.i2.i2.i2
  def i9: T9                                                                     = item.item.i2.i1.i1.i1
}
class Item2Xyy10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]
) extends AnyVal
    with XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] {
  override def eat[T](xyy: T): Item2Xyy11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T] = new Item2Xyy11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T](item.addRightItem(xyy))
  override def rightHead: T10                                                         = item.dropRightItem
  override def rightTail: Item2Xyy9[T1, T2, T3, T4, T5, T6, T7, T8, T9]               = new Item2Xyy9(item.dropRight)
  def i1: T1                                                                          = item.item.i1.i1.i1.i1
  def i2: T2                                                                          = item.item.i1.i1.i1.i2
  def i3: T3                                                                          = item.item.i1.i1.i2.i1
  def i4: T4                                                                          = item.item.i1.i1.i2.i2
  def i5: T5                                                                          = item.item.i1.i2.i1.i1
  def i6: T6                                                                          = item.item.i1.i2.i1.i2
  def i7: T7                                                                          = item.item.i1.i2.i2.i1
  def i8: T8                                                                          = item.item.i1.i2.i2.i2
  def i9: T9                                                                          = item.item.i2.i1.i1.i1
  def i10: T10                                                                        = item.item.i2.i1.i1.i2
}
class Item2Xyy11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
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
class Item2Xyy12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]
) extends AnyVal
    with XyyItem12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] {
  override def eat[T](xyy: T): Item2Xyy13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T] =
    new Item2Xyy13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T](item.addRightItem(xyy))
  override def rightHead: T12                                                      = item.dropRightItem
  override def rightTail: Item2Xyy11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] = new Item2Xyy11(item.dropRight)
  def i1: T1                                                                       = item.item.i1.i1.i1.i1
  def i2: T2                                                                       = item.item.i1.i1.i1.i2
  def i3: T3                                                                       = item.item.i1.i1.i2.i1
  def i4: T4                                                                       = item.item.i1.i1.i2.i2
  def i5: T5                                                                       = item.item.i1.i2.i1.i1
  def i6: T6                                                                       = item.item.i1.i2.i1.i2
  def i7: T7                                                                       = item.item.i1.i2.i2.i1
  def i8: T8                                                                       = item.item.i1.i2.i2.i2
  def i9: T9                                                                       = item.item.i2.i1.i1.i1
  def i10: T10                                                                     = item.item.i2.i1.i1.i2
  def i11: T11                                                                     = item.item.i2.i1.i2.i1
  def i12: T12                                                                     = item.item.i2.i1.i2.i2
}
class Item2Xyy13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]
) extends AnyVal
    with XyyItem13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] {
  override def eat[T](xyy: T): Item2Xyy14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T] =
    new Item2Xyy14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T](item.addRightItem(xyy))
  override def rightHead: T13                                                           = item.dropRightItem
  override def rightTail: Item2Xyy12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] = new Item2Xyy12(item.dropRight)
  def i1: T1                                                                            = item.item.i1.i1.i1.i1
  def i2: T2                                                                            = item.item.i1.i1.i1.i2
  def i3: T3                                                                            = item.item.i1.i1.i2.i1
  def i4: T4                                                                            = item.item.i1.i1.i2.i2
  def i5: T5                                                                            = item.item.i1.i2.i1.i1
  def i6: T6                                                                            = item.item.i1.i2.i1.i2
  def i7: T7                                                                            = item.item.i1.i2.i2.i1
  def i8: T8                                                                            = item.item.i1.i2.i2.i2
  def i9: T9                                                                            = item.item.i2.i1.i1.i1
  def i10: T10                                                                          = item.item.i2.i1.i1.i2
  def i11: T11                                                                          = item.item.i2.i1.i2.i1
  def i12: T12                                                                          = item.item.i2.i1.i2.i2
  def i13: T13                                                                          = item.item.i2.i2.i1.i1
}
class Item2Xyy14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]
) extends AnyVal
    with XyyItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] {
  override def eat[T](xyy: T): Item2Xyy15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T] =
    new Item2Xyy15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T](item.addRightItem(xyy))
  override def rightHead: T14                                                                = item.dropRightItem
  override def rightTail: Item2Xyy13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] = new Item2Xyy13(item.dropRight)
  def i1: T1                                                                                 = item.item.i1.i1.i1.i1
  def i2: T2                                                                                 = item.item.i1.i1.i1.i2
  def i3: T3                                                                                 = item.item.i1.i1.i2.i1
  def i4: T4                                                                                 = item.item.i1.i1.i2.i2
  def i5: T5                                                                                 = item.item.i1.i2.i1.i1
  def i6: T6                                                                                 = item.item.i1.i2.i1.i2
  def i7: T7                                                                                 = item.item.i1.i2.i2.i1
  def i8: T8                                                                                 = item.item.i1.i2.i2.i2
  def i9: T9                                                                                 = item.item.i2.i1.i1.i1
  def i10: T10                                                                               = item.item.i2.i1.i1.i2
  def i11: T11                                                                               = item.item.i2.i1.i2.i1
  def i12: T12                                                                               = item.item.i2.i1.i2.i2
  def i13: T13                                                                               = item.item.i2.i2.i1.i1
  def i14: T14                                                                               = item.item.i2.i2.i1.i2
}
class Item2Xyy15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]
) extends AnyVal
    with XyyItem15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] {
  override def eat[T](xyy: T): Item2Xyy16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T] =
    new Item2Xyy16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T](item.addRightItem(xyy))
  override def rightHead: T15                                                                     = item.dropRightItem
  override def rightTail: Item2Xyy14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] = new Item2Xyy14(item.dropRight)
  def i1: T1                                                                                      = item.item.i1.i1.i1.i1
  def i2: T2                                                                                      = item.item.i1.i1.i1.i2
  def i3: T3                                                                                      = item.item.i1.i1.i2.i1
  def i4: T4                                                                                      = item.item.i1.i1.i2.i2
  def i5: T5                                                                                      = item.item.i1.i2.i1.i1
  def i6: T6                                                                                      = item.item.i1.i2.i1.i2
  def i7: T7                                                                                      = item.item.i1.i2.i2.i1
  def i8: T8                                                                                      = item.item.i1.i2.i2.i2
  def i9: T9                                                                                      = item.item.i2.i1.i1.i1
  def i10: T10                                                                                    = item.item.i2.i1.i1.i2
  def i11: T11                                                                                    = item.item.i2.i1.i2.i1
  def i12: T12                                                                                    = item.item.i2.i1.i2.i2
  def i13: T13                                                                                    = item.item.i2.i2.i1.i1
  def i14: T14                                                                                    = item.item.i2.i2.i1.i2
  def i15: T15                                                                                    = item.item.i2.i2.i2.i1
}
class Item2Xyy16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]
) extends AnyVal
    with XyyItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] {
  override def eat[T](xyy: T): Item2Xyy17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T] =
    new Item2Xyy17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T](item.addRightItem(xyy))
  override def rightHead: T16                                                                          = item.dropRightItem
  override def rightTail: Item2Xyy15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] = new Item2Xyy15(item.dropRight)
  def i1: T1                                                                                           = item.item.i1.i1.i1.i1
  def i2: T2                                                                                           = item.item.i1.i1.i1.i2
  def i3: T3                                                                                           = item.item.i1.i1.i2.i1
  def i4: T4                                                                                           = item.item.i1.i1.i2.i2
  def i5: T5                                                                                           = item.item.i1.i2.i1.i1
  def i6: T6                                                                                           = item.item.i1.i2.i1.i2
  def i7: T7                                                                                           = item.item.i1.i2.i2.i1
  def i8: T8                                                                                           = item.item.i1.i2.i2.i2
  def i9: T9                                                                                           = item.item.i2.i1.i1.i1
  def i10: T10                                                                                         = item.item.i2.i1.i1.i2
  def i11: T11                                                                                         = item.item.i2.i1.i2.i1
  def i12: T12                                                                                         = item.item.i2.i1.i2.i2
  def i13: T13                                                                                         = item.item.i2.i2.i1.i1
  def i14: T14                                                                                         = item.item.i2.i2.i1.i2
  def i15: T15                                                                                         = item.item.i2.i2.i2.i1
  def i16: T16                                                                                         = item.item.i2.i2.i2.i2
}
class Item2Xyy17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]
) extends AnyVal
    with XyyItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] {
  override def eat[T](xyy: T): Item2Xyy18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T] =
    new Item2Xyy18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T](item.addRightItem(xyy))
  override def rightHead: T17                                                                               = item.dropRightItem
  override def rightTail: Item2Xyy16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] = new Item2Xyy16(item.dropRight)
  def i1: T1                                                                                                = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                              = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                              = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                              = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                              = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                              = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                              = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                              = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                              = item.item.i2.i1.i1.i1.i1
}
class Item2Xyy18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]#AddRightItem[
      T18
  ]
) extends AnyVal
    with XyyItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] {
  override def eat[T](xyy: T): Item2Xyy19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T] =
    new Item2Xyy19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T](item.addRightItem(xyy))
  override def rightHead: T18                                                                                    = item.dropRightItem
  override def rightTail: Item2Xyy17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] = new Item2Xyy17(item.dropRight)
  def i1: T1                                                                                                     = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                     = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                     = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                     = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                     = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                     = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                     = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                     = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                     = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                   = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                   = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                                   = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                                   = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                                   = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                                   = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                                   = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                                   = item.item.i2.i1.i1.i1.i1
  def i18: T18                                                                                                   = item.item.i2.i1.i1.i1.i2
}
class Item2Xyy19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]#AddRightItem[
      T18
  ]#AddRightItem[T19]
) extends AnyVal
    with XyyItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] {
  override def eat[T](xyy: T): Item2Xyy20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T] =
    new Item2Xyy20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T](item.addRightItem(xyy))
  override def rightHead: T19                                                                                         = item.dropRightItem
  override def rightTail: Item2Xyy18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] = new Item2Xyy18(item.dropRight)
  def i1: T1                                                                                                          = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                          = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                          = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                          = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                          = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                          = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                          = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                          = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                          = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                        = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                        = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                                        = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                                        = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                                        = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                                        = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                                        = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                                        = item.item.i2.i1.i1.i1.i1
  def i18: T18                                                                                                        = item.item.i2.i1.i1.i1.i2
  def i19: T19                                                                                                        = item.item.i2.i1.i1.i2.i1
}
class Item2Xyy20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]#AddRightItem[
      T18
  ]#AddRightItem[T19]#AddRightItem[T20]
) extends AnyVal
    with XyyItem20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] {
  override def eat[T](xyy: T): Item2Xyy21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T] =
    new Item2Xyy21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T](item.addRightItem(xyy))
  override def rightHead: T20                                                                                              = item.dropRightItem
  override def rightTail: Item2Xyy19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] = new Item2Xyy19(item.dropRight)
  def i1: T1                                                                                                               = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                               = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                               = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                               = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                               = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                               = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                               = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                               = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                               = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                             = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                             = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                                             = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                                             = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                                             = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                                             = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                                             = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                                             = item.item.i2.i1.i1.i1.i1
  def i18: T18                                                                                                             = item.item.i2.i1.i1.i1.i2
  def i19: T19                                                                                                             = item.item.i2.i1.i1.i2.i1
  def i20: T20                                                                                                             = item.item.i2.i1.i1.i2.i2
}
class Item2Xyy21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]#AddRightItem[
      T18
  ]#AddRightItem[T19]#AddRightItem[T20]#AddRightItem[T21]
) extends AnyVal
    with XyyItem21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] {
  override def eat[T](xyy: T): Item2Xyy22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T] =
    new Item2Xyy22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T](item.addRightItem(xyy))
  override def rightHead: T21                                                                                                   = item.dropRightItem
  override def rightTail: Item2Xyy20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] = new Item2Xyy20(item.dropRight)
  def i1: T1                                                                                                                    = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                                    = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                                    = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                                    = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                                    = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                                    = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                                    = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                                    = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                                    = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                                  = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                                  = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                                                  = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                                                  = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                                                  = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                                                  = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                                                  = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                                                  = item.item.i2.i1.i1.i1.i1
  def i18: T18                                                                                                                  = item.item.i2.i1.i1.i1.i2
  def i19: T19                                                                                                                  = item.item.i2.i1.i1.i2.i1
  def i20: T20                                                                                                                  = item.item.i2.i1.i1.i2.i2
  def i21: T21                                                                                                                  = item.item.i2.i1.i2.i1.i1
}
class Item2Xyy22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    val item: org.scalax.asuna.mapper.item.EatValue0#AddRightItem[T1]#AddRightItem[T2]#AddRightItem[T3]#AddRightItem[T4]#AddRightItem[T5]#AddRightItem[T6]#AddRightItem[
      T7
  ]#AddRightItem[
      T8
  ]#AddRightItem[T9]#AddRightItem[T10]#AddRightItem[T11]#AddRightItem[T12]#AddRightItem[T13]#AddRightItem[T14]#AddRightItem[T15]#AddRightItem[T16]#AddRightItem[T17]#AddRightItem[
      T18
  ]#AddRightItem[T19]#AddRightItem[T20]#AddRightItem[T21]#AddRightItem[T22]
) extends AnyVal
    with XyyItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] {
  override def rightHead: T22                                                                                                        = item.dropRightItem
  override def rightTail: Item2Xyy21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] = new Item2Xyy21(item.dropRight)
  def i1: T1                                                                                                                         = item.item.i1.i1.i1.i1.i1
  def i2: T2                                                                                                                         = item.item.i1.i1.i1.i1.i2
  def i3: T3                                                                                                                         = item.item.i1.i1.i1.i2.i1
  def i4: T4                                                                                                                         = item.item.i1.i1.i1.i2.i2
  def i5: T5                                                                                                                         = item.item.i1.i1.i2.i1.i1
  def i6: T6                                                                                                                         = item.item.i1.i1.i2.i1.i2
  def i7: T7                                                                                                                         = item.item.i1.i1.i2.i2.i1
  def i8: T8                                                                                                                         = item.item.i1.i1.i2.i2.i2
  def i9: T9                                                                                                                         = item.item.i1.i2.i1.i1.i1
  def i10: T10                                                                                                                       = item.item.i1.i2.i1.i1.i2
  def i11: T11                                                                                                                       = item.item.i1.i2.i1.i2.i1
  def i12: T12                                                                                                                       = item.item.i1.i2.i1.i2.i2
  def i13: T13                                                                                                                       = item.item.i1.i2.i2.i1.i1
  def i14: T14                                                                                                                       = item.item.i1.i2.i2.i1.i2
  def i15: T15                                                                                                                       = item.item.i1.i2.i2.i2.i1
  def i16: T16                                                                                                                       = item.item.i1.i2.i2.i2.i2
  def i17: T17                                                                                                                       = item.item.i2.i1.i1.i1.i1
  def i18: T18                                                                                                                       = item.item.i2.i1.i1.i1.i2
  def i19: T19                                                                                                                       = item.item.i2.i1.i1.i2.i1
  def i20: T20                                                                                                                       = item.item.i2.i1.i1.i2.i2
  def i21: T21                                                                                                                       = item.item.i2.i1.i2.i1.i1
  def i22: T22                                                                                                                       = item.item.i2.i1.i2.i1.i2
}
