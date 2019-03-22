class ItemPlusXyy0 extends Item0 {}
class ItemPlusXyy1[I1](override val item: EatValue0#AddItem[I1]) extends Xyy[EatValue0#AddItem[I1]] with Item1[I1] {
  override def i1: I1                         = item.item.i1
  def addItem[T](xyy: T): ItemPlusXyy2[I1, T] = new ItemPlusXyy2(item.addItem(xyy))
}
class ItemPlusXyy2[I1, I2](override val item: EatValue0#AddItem[I1]#AddItem[I2]) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]] with Item2[I1, I2] {
  override def i1: I1                             = item.item.i1
  override def i2: I2                             = item.item.i2
  def addItem[T](xyy: T): ItemPlusXyy3[I1, I2, T] = new ItemPlusXyy3(item.addItem(xyy))
}
class ItemPlusXyy3[I1, I2, I3](override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3])
    extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]]
    with Item3[I1, I2, I3] {
  override def i1: I1                                 = item.item.i1.i1
  override def i2: I2                                 = item.item.i1.i2
  override def i3: I3                                 = item.item.i2.i1
  def addItem[T](xyy: T): ItemPlusXyy4[I1, I2, I3, T] = new ItemPlusXyy4(item.addItem(xyy))
}
class ItemPlusXyy4[I1, I2, I3, I4](override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4])
    extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]]
    with Item4[I1, I2, I3, I4] {
  override def i1: I1                                     = item.item.i1.i1
  override def i2: I2                                     = item.item.i1.i2
  override def i3: I3                                     = item.item.i2.i1
  override def i4: I4                                     = item.item.i2.i2
  def addItem[T](xyy: T): ItemPlusXyy5[I1, I2, I3, I4, T] = new ItemPlusXyy5(item.addItem(xyy))
}
class ItemPlusXyy5[I1, I2, I3, I4, I5](override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5])
    extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]]
    with Item5[I1, I2, I3, I4, I5] {
  override def i1: I1                                         = item.item.i1.i1.i1
  override def i2: I2                                         = item.item.i1.i1.i2
  override def i3: I3                                         = item.item.i1.i2.i1
  override def i4: I4                                         = item.item.i1.i2.i2
  override def i5: I5                                         = item.item.i2.i1.i1
  def addItem[T](xyy: T): ItemPlusXyy6[I1, I2, I3, I4, I5, T] = new ItemPlusXyy6(item.addItem(xyy))
}
class ItemPlusXyy6[I1, I2, I3, I4, I5, I6](override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6])
    extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]]
    with Item6[I1, I2, I3, I4, I5, I6] {
  override def i1: I1                                             = item.item.i1.i1.i1
  override def i2: I2                                             = item.item.i1.i1.i2
  override def i3: I3                                             = item.item.i1.i2.i1
  override def i4: I4                                             = item.item.i1.i2.i2
  override def i5: I5                                             = item.item.i2.i1.i1
  override def i6: I6                                             = item.item.i2.i1.i2
  def addItem[T](xyy: T): ItemPlusXyy7[I1, I2, I3, I4, I5, I6, T] = new ItemPlusXyy7(item.addItem(xyy))
}
class ItemPlusXyy7[I1, I2, I3, I4, I5, I6, I7](override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7])
    extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]]
    with Item7[I1, I2, I3, I4, I5, I6, I7] {
  override def i1: I1                                                 = item.item.i1.i1.i1
  override def i2: I2                                                 = item.item.i1.i1.i2
  override def i3: I3                                                 = item.item.i1.i2.i1
  override def i4: I4                                                 = item.item.i1.i2.i2
  override def i5: I5                                                 = item.item.i2.i1.i1
  override def i6: I6                                                 = item.item.i2.i1.i2
  override def i7: I7                                                 = item.item.i2.i2.i1
  def addItem[T](xyy: T): ItemPlusXyy8[I1, I2, I3, I4, I5, I6, I7, T] = new ItemPlusXyy8(item.addItem(xyy))
}
class ItemPlusXyy8[I1, I2, I3, I4, I5, I6, I7, I8](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]]
    with Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
  override def i1: I1                                                     = item.item.i1.i1.i1
  override def i2: I2                                                     = item.item.i1.i1.i2
  override def i3: I3                                                     = item.item.i1.i2.i1
  override def i4: I4                                                     = item.item.i1.i2.i2
  override def i5: I5                                                     = item.item.i2.i1.i1
  override def i6: I6                                                     = item.item.i2.i1.i2
  override def i7: I7                                                     = item.item.i2.i2.i1
  override def i8: I8                                                     = item.item.i2.i2.i2
  def addItem[T](xyy: T): ItemPlusXyy9[I1, I2, I3, I4, I5, I6, I7, I8, T] = new ItemPlusXyy9(item.addItem(xyy))
}
class ItemPlusXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]]
    with Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  override def i1: I1                                                          = item.item.i1.i1.i1.i1
  override def i2: I2                                                          = item.item.i1.i1.i1.i2
  override def i3: I3                                                          = item.item.i1.i1.i2.i1
  override def i4: I4                                                          = item.item.i1.i1.i2.i2
  override def i5: I5                                                          = item.item.i1.i2.i1.i1
  override def i6: I6                                                          = item.item.i1.i2.i1.i2
  override def i7: I7                                                          = item.item.i1.i2.i2.i1
  override def i8: I8                                                          = item.item.i1.i2.i2.i2
  override def i9: I9                                                          = item.item.i2.i1.i1.i1
  def addItem[T](xyy: T): ItemPlusXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, T] = new ItemPlusXyy10(item.addItem(xyy))
}
class ItemPlusXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]]
    with Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  override def i1: I1                                                               = item.item.i1.i1.i1.i1
  override def i2: I2                                                               = item.item.i1.i1.i1.i2
  override def i3: I3                                                               = item.item.i1.i1.i2.i1
  override def i4: I4                                                               = item.item.i1.i1.i2.i2
  override def i5: I5                                                               = item.item.i1.i2.i1.i1
  override def i6: I6                                                               = item.item.i1.i2.i1.i2
  override def i7: I7                                                               = item.item.i1.i2.i2.i1
  override def i8: I8                                                               = item.item.i1.i2.i2.i2
  override def i9: I9                                                               = item.item.i2.i1.i1.i1
  override def i10: I10                                                             = item.item.i2.i1.i1.i2
  def addItem[T](xyy: T): ItemPlusXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, T] = new ItemPlusXyy11(item.addItem(xyy))
}
class ItemPlusXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]]
    with Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  override def i1: I1                                                                    = item.item.i1.i1.i1.i1
  override def i2: I2                                                                    = item.item.i1.i1.i1.i2
  override def i3: I3                                                                    = item.item.i1.i1.i2.i1
  override def i4: I4                                                                    = item.item.i1.i1.i2.i2
  override def i5: I5                                                                    = item.item.i1.i2.i1.i1
  override def i6: I6                                                                    = item.item.i1.i2.i1.i2
  override def i7: I7                                                                    = item.item.i1.i2.i2.i1
  override def i8: I8                                                                    = item.item.i1.i2.i2.i2
  override def i9: I9                                                                    = item.item.i2.i1.i1.i1
  override def i10: I10                                                                  = item.item.i2.i1.i1.i2
  override def i11: I11                                                                  = item.item.i2.i1.i2.i1
  def addItem[T](xyy: T): ItemPlusXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, T] = new ItemPlusXyy12(item.addItem(xyy))
}
class ItemPlusXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]
) extends Xyy[
      EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[I12]
    ]
    with Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  override def i1: I1                                                                         = item.item.i1.i1.i1.i1
  override def i2: I2                                                                         = item.item.i1.i1.i1.i2
  override def i3: I3                                                                         = item.item.i1.i1.i2.i1
  override def i4: I4                                                                         = item.item.i1.i1.i2.i2
  override def i5: I5                                                                         = item.item.i1.i2.i1.i1
  override def i6: I6                                                                         = item.item.i1.i2.i1.i2
  override def i7: I7                                                                         = item.item.i1.i2.i2.i1
  override def i8: I8                                                                         = item.item.i1.i2.i2.i2
  override def i9: I9                                                                         = item.item.i2.i1.i1.i1
  override def i10: I10                                                                       = item.item.i2.i1.i1.i2
  override def i11: I11                                                                       = item.item.i2.i1.i2.i1
  override def i12: I12                                                                       = item.item.i2.i1.i2.i2
  def addItem[T](xyy: T): ItemPlusXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, T] = new ItemPlusXyy13(item.addItem(xyy))
}
class ItemPlusXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]]
    with Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  override def i1: I1                                                                              = item.item.i1.i1.i1.i1
  override def i2: I2                                                                              = item.item.i1.i1.i1.i2
  override def i3: I3                                                                              = item.item.i1.i1.i2.i1
  override def i4: I4                                                                              = item.item.i1.i1.i2.i2
  override def i5: I5                                                                              = item.item.i1.i2.i1.i1
  override def i6: I6                                                                              = item.item.i1.i2.i1.i2
  override def i7: I7                                                                              = item.item.i1.i2.i2.i1
  override def i8: I8                                                                              = item.item.i1.i2.i2.i2
  override def i9: I9                                                                              = item.item.i2.i1.i1.i1
  override def i10: I10                                                                            = item.item.i2.i1.i1.i2
  override def i11: I11                                                                            = item.item.i2.i1.i2.i1
  override def i12: I12                                                                            = item.item.i2.i1.i2.i2
  override def i13: I13                                                                            = item.item.i2.i2.i1.i1
  def addItem[T](xyy: T): ItemPlusXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, T] = new ItemPlusXyy14(item.addItem(xyy))
}
class ItemPlusXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]]
    with Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  override def i1: I1                                                                                   = item.item.i1.i1.i1.i1
  override def i2: I2                                                                                   = item.item.i1.i1.i1.i2
  override def i3: I3                                                                                   = item.item.i1.i1.i2.i1
  override def i4: I4                                                                                   = item.item.i1.i1.i2.i2
  override def i5: I5                                                                                   = item.item.i1.i2.i1.i1
  override def i6: I6                                                                                   = item.item.i1.i2.i1.i2
  override def i7: I7                                                                                   = item.item.i1.i2.i2.i1
  override def i8: I8                                                                                   = item.item.i1.i2.i2.i2
  override def i9: I9                                                                                   = item.item.i2.i1.i1.i1
  override def i10: I10                                                                                 = item.item.i2.i1.i1.i2
  override def i11: I11                                                                                 = item.item.i2.i1.i2.i1
  override def i12: I12                                                                                 = item.item.i2.i1.i2.i2
  override def i13: I13                                                                                 = item.item.i2.i2.i1.i1
  override def i14: I14                                                                                 = item.item.i2.i2.i1.i2
  def addItem[T](xyy: T): ItemPlusXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, T] = new ItemPlusXyy15(item.addItem(xyy))
}
class ItemPlusXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]]
    with Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  override def i1: I1                                                                                        = item.item.i1.i1.i1.i1
  override def i2: I2                                                                                        = item.item.i1.i1.i1.i2
  override def i3: I3                                                                                        = item.item.i1.i1.i2.i1
  override def i4: I4                                                                                        = item.item.i1.i1.i2.i2
  override def i5: I5                                                                                        = item.item.i1.i2.i1.i1
  override def i6: I6                                                                                        = item.item.i1.i2.i1.i2
  override def i7: I7                                                                                        = item.item.i1.i2.i2.i1
  override def i8: I8                                                                                        = item.item.i1.i2.i2.i2
  override def i9: I9                                                                                        = item.item.i2.i1.i1.i1
  override def i10: I10                                                                                      = item.item.i2.i1.i1.i2
  override def i11: I11                                                                                      = item.item.i2.i1.i2.i1
  override def i12: I12                                                                                      = item.item.i2.i1.i2.i2
  override def i13: I13                                                                                      = item.item.i2.i2.i1.i1
  override def i14: I14                                                                                      = item.item.i2.i2.i1.i2
  override def i15: I15                                                                                      = item.item.i2.i2.i2.i1
  def addItem[T](xyy: T): ItemPlusXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, T] = new ItemPlusXyy16(item.addItem(xyy))
}
class ItemPlusXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]]
    with Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  override def i1: I1                                                                                             = item.item.i1.i1.i1.i1
  override def i2: I2                                                                                             = item.item.i1.i1.i1.i2
  override def i3: I3                                                                                             = item.item.i1.i1.i2.i1
  override def i4: I4                                                                                             = item.item.i1.i1.i2.i2
  override def i5: I5                                                                                             = item.item.i1.i2.i1.i1
  override def i6: I6                                                                                             = item.item.i1.i2.i1.i2
  override def i7: I7                                                                                             = item.item.i1.i2.i2.i1
  override def i8: I8                                                                                             = item.item.i1.i2.i2.i2
  override def i9: I9                                                                                             = item.item.i2.i1.i1.i1
  override def i10: I10                                                                                           = item.item.i2.i1.i1.i2
  override def i11: I11                                                                                           = item.item.i2.i1.i2.i1
  override def i12: I12                                                                                           = item.item.i2.i1.i2.i2
  override def i13: I13                                                                                           = item.item.i2.i2.i1.i1
  override def i14: I14                                                                                           = item.item.i2.i2.i1.i2
  override def i15: I15                                                                                           = item.item.i2.i2.i2.i1
  override def i16: I16                                                                                           = item.item.i2.i2.i2.i2
  def addItem[T](xyy: T): ItemPlusXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, T] = new ItemPlusXyy17(item.addItem(xyy))
}
class ItemPlusXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]]
    with Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  override def i1: I1                                                                                                  = item.item.i1.i1.i1.i1.i1
  override def i2: I2                                                                                                  = item.item.i1.i1.i1.i1.i2
  override def i3: I3                                                                                                  = item.item.i1.i1.i1.i2.i1
  override def i4: I4                                                                                                  = item.item.i1.i1.i1.i2.i2
  override def i5: I5                                                                                                  = item.item.i1.i1.i2.i1.i1
  override def i6: I6                                                                                                  = item.item.i1.i1.i2.i1.i2
  override def i7: I7                                                                                                  = item.item.i1.i1.i2.i2.i1
  override def i8: I8                                                                                                  = item.item.i1.i1.i2.i2.i2
  override def i9: I9                                                                                                  = item.item.i1.i2.i1.i1.i1
  override def i10: I10                                                                                                = item.item.i1.i2.i1.i1.i2
  override def i11: I11                                                                                                = item.item.i1.i2.i1.i2.i1
  override def i12: I12                                                                                                = item.item.i1.i2.i1.i2.i2
  override def i13: I13                                                                                                = item.item.i1.i2.i2.i1.i1
  override def i14: I14                                                                                                = item.item.i1.i2.i2.i1.i2
  override def i15: I15                                                                                                = item.item.i1.i2.i2.i2.i1
  override def i16: I16                                                                                                = item.item.i1.i2.i2.i2.i2
  override def i17: I17                                                                                                = item.item.i2.i1.i1.i1.i1
  def addItem[T](xyy: T): ItemPlusXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, T] = new ItemPlusXyy18(item.addItem(xyy))
}
class ItemPlusXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]]
    with Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  override def i1: I1                                                                                                       = item.item.i1.i1.i1.i1.i1
  override def i2: I2                                                                                                       = item.item.i1.i1.i1.i1.i2
  override def i3: I3                                                                                                       = item.item.i1.i1.i1.i2.i1
  override def i4: I4                                                                                                       = item.item.i1.i1.i1.i2.i2
  override def i5: I5                                                                                                       = item.item.i1.i1.i2.i1.i1
  override def i6: I6                                                                                                       = item.item.i1.i1.i2.i1.i2
  override def i7: I7                                                                                                       = item.item.i1.i1.i2.i2.i1
  override def i8: I8                                                                                                       = item.item.i1.i1.i2.i2.i2
  override def i9: I9                                                                                                       = item.item.i1.i2.i1.i1.i1
  override def i10: I10                                                                                                     = item.item.i1.i2.i1.i1.i2
  override def i11: I11                                                                                                     = item.item.i1.i2.i1.i2.i1
  override def i12: I12                                                                                                     = item.item.i1.i2.i1.i2.i2
  override def i13: I13                                                                                                     = item.item.i1.i2.i2.i1.i1
  override def i14: I14                                                                                                     = item.item.i1.i2.i2.i1.i2
  override def i15: I15                                                                                                     = item.item.i1.i2.i2.i2.i1
  override def i16: I16                                                                                                     = item.item.i1.i2.i2.i2.i2
  override def i17: I17                                                                                                     = item.item.i2.i1.i1.i1.i1
  override def i18: I18                                                                                                     = item.item.i2.i1.i1.i1.i2
  def addItem[T](xyy: T): ItemPlusXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, T] = new ItemPlusXyy19(item.addItem(xyy))
}
class ItemPlusXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]]
    with Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  override def i1: I1                                                                                                            = item.item.i1.i1.i1.i1.i1
  override def i2: I2                                                                                                            = item.item.i1.i1.i1.i1.i2
  override def i3: I3                                                                                                            = item.item.i1.i1.i1.i2.i1
  override def i4: I4                                                                                                            = item.item.i1.i1.i1.i2.i2
  override def i5: I5                                                                                                            = item.item.i1.i1.i2.i1.i1
  override def i6: I6                                                                                                            = item.item.i1.i1.i2.i1.i2
  override def i7: I7                                                                                                            = item.item.i1.i1.i2.i2.i1
  override def i8: I8                                                                                                            = item.item.i1.i1.i2.i2.i2
  override def i9: I9                                                                                                            = item.item.i1.i2.i1.i1.i1
  override def i10: I10                                                                                                          = item.item.i1.i2.i1.i1.i2
  override def i11: I11                                                                                                          = item.item.i1.i2.i1.i2.i1
  override def i12: I12                                                                                                          = item.item.i1.i2.i1.i2.i2
  override def i13: I13                                                                                                          = item.item.i1.i2.i2.i1.i1
  override def i14: I14                                                                                                          = item.item.i1.i2.i2.i1.i2
  override def i15: I15                                                                                                          = item.item.i1.i2.i2.i2.i1
  override def i16: I16                                                                                                          = item.item.i1.i2.i2.i2.i2
  override def i17: I17                                                                                                          = item.item.i2.i1.i1.i1.i1
  override def i18: I18                                                                                                          = item.item.i2.i1.i1.i1.i2
  override def i19: I19                                                                                                          = item.item.i2.i1.i1.i2.i1
  def addItem[T](xyy: T): ItemPlusXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, T] = new ItemPlusXyy20(item.addItem(xyy))
}
class ItemPlusXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]]
    with Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i1.i2.i2.i2
  override def i9: I9   = item.item.i1.i2.i1.i1.i1
  override def i10: I10 = item.item.i1.i2.i1.i1.i2
  override def i11: I11 = item.item.i1.i2.i1.i2.i1
  override def i12: I12 = item.item.i1.i2.i1.i2.i2
  override def i13: I13 = item.item.i1.i2.i2.i1.i1
  override def i14: I14 = item.item.i1.i2.i2.i1.i2
  override def i15: I15 = item.item.i1.i2.i2.i2.i1
  override def i16: I16 = item.item.i1.i2.i2.i2.i2
  override def i17: I17 = item.item.i2.i1.i1.i1.i1
  override def i18: I18 = item.item.i2.i1.i1.i1.i2
  override def i19: I19 = item.item.i2.i1.i1.i2.i1
  override def i20: I20 = item.item.i2.i1.i1.i2.i2
  def addItem[T](xyy: T): ItemPlusXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, T] =
    new ItemPlusXyy21(item.addItem(xyy))
}
class ItemPlusXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]#AddItem[I21]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]#AddItem[I21]]
    with Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i1.i2.i2.i2
  override def i9: I9   = item.item.i1.i2.i1.i1.i1
  override def i10: I10 = item.item.i1.i2.i1.i1.i2
  override def i11: I11 = item.item.i1.i2.i1.i2.i1
  override def i12: I12 = item.item.i1.i2.i1.i2.i2
  override def i13: I13 = item.item.i1.i2.i2.i1.i1
  override def i14: I14 = item.item.i1.i2.i2.i1.i2
  override def i15: I15 = item.item.i1.i2.i2.i2.i1
  override def i16: I16 = item.item.i1.i2.i2.i2.i2
  override def i17: I17 = item.item.i2.i1.i1.i1.i1
  override def i18: I18 = item.item.i2.i1.i1.i1.i2
  override def i19: I19 = item.item.i2.i1.i1.i2.i1
  override def i20: I20 = item.item.i2.i1.i1.i2.i2
  override def i21: I21 = item.item.i2.i1.i2.i1.i1
  def addItem[T](xyy: T): ItemPlusXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, T] =
    new ItemPlusXyy22(item.addItem(xyy))
}
class ItemPlusXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22](
  override val item: EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
    I12
  ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]#AddItem[I21]#AddItem[I22]
) extends Xyy[EatValue0#AddItem[I1]#AddItem[I2]#AddItem[I3]#AddItem[I4]#AddItem[I5]#AddItem[I6]#AddItem[I7]#AddItem[I8]#AddItem[I9]#AddItem[I10]#AddItem[I11]#AddItem[
      I12
    ]#AddItem[I13]#AddItem[I14]#AddItem[I15]#AddItem[I16]#AddItem[I17]#AddItem[I18]#AddItem[I19]#AddItem[I20]#AddItem[I21]#AddItem[I22]]
    with Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i1.i2.i2.i2
  override def i9: I9   = item.item.i1.i2.i1.i1.i1
  override def i10: I10 = item.item.i1.i2.i1.i1.i2
  override def i11: I11 = item.item.i1.i2.i1.i2.i1
  override def i12: I12 = item.item.i1.i2.i1.i2.i2
  override def i13: I13 = item.item.i1.i2.i2.i1.i1
  override def i14: I14 = item.item.i1.i2.i2.i1.i2
  override def i15: I15 = item.item.i1.i2.i2.i2.i1
  override def i16: I16 = item.item.i1.i2.i2.i2.i2
  override def i17: I17 = item.item.i2.i1.i1.i1.i1
  override def i18: I18 = item.item.i2.i1.i1.i1.i2
  override def i19: I19 = item.item.i2.i1.i1.i2.i1
  override def i20: I20 = item.item.i2.i1.i1.i2.i2
  override def i21: I21 = item.item.i2.i1.i2.i1.i1
  override def i22: I22 = item.item.i2.i1.i2.i1.i2
}
