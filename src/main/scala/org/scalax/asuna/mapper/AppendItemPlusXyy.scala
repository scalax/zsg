package org.scalax.asuna.mapper.item
trait ItemPlusXyy0 extends Any with Item0 {
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy1[I1] extends Any with Xyy[EatValue0#AddRightItem[I1]] with Item1[I1] {
  override protected def item: EatValue0#AddRightItem[I1]
  override def i1: I1 = item.item.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy2[I1, I2] extends Any with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]] with Item2[I1, I2] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]
  override def i1: I1 = item.item.i1
  override def i2: I2 = item.item.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy3[I1, I2, I3] extends Any with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]] with Item3[I1, I2, I3] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]
  override def i1: I1 = item.item.i1.i1
  override def i2: I2 = item.item.i1.i2
  override def i3: I3 = item.item.i2.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy4[I1, I2, I3, I4] extends Any with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]] with Item4[I1, I2, I3, I4] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]
  override def i1: I1 = item.item.i1.i1
  override def i2: I2 = item.item.i1.i2
  override def i3: I3 = item.item.i2.i1
  override def i4: I4 = item.item.i2.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy5[I1, I2, I3, I4, I5]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]]
    with Item5[I1, I2, I3, I4, I5] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2
  override def i3: I3 = item.item.i1.i2.i1
  override def i4: I4 = item.item.i1.i2.i2
  override def i5: I5 = item.item.i2.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy6[I1, I2, I3, I4, I5, I6]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]]
    with Item6[I1, I2, I3, I4, I5, I6] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2
  override def i3: I3 = item.item.i1.i2.i1
  override def i4: I4 = item.item.i1.i2.i2
  override def i5: I5 = item.item.i2.i1.i1
  override def i6: I6 = item.item.i2.i1.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy7[I1, I2, I3, I4, I5, I6, I7]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]]
    with Item7[I1, I2, I3, I4, I5, I6, I7] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2
  override def i3: I3 = item.item.i1.i2.i1
  override def i4: I4 = item.item.i1.i2.i2
  override def i5: I5 = item.item.i2.i1.i1
  override def i6: I6 = item.item.i2.i1.i2
  override def i7: I7 = item.item.i2.i2.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy8[I1, I2, I3, I4, I5, I6, I7, I8]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]]
    with Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
  override protected def item
    : EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2
  override def i3: I3 = item.item.i1.i2.i1
  override def i4: I4 = item.item.i1.i2.i2
  override def i5: I5 = item.item.i2.i1.i1
  override def i6: I6 = item.item.i2.i1.i2
  override def i7: I7 = item.item.i2.i2.i1
  override def i8: I8 = item.item.i2.i2.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]
    ]
    with Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  override protected def item
    : EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]
  override def i1: I1 = item.item.i1.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i1.i2
  override def i3: I3 = item.item.i1.i1.i2.i1
  override def i4: I4 = item.item.i1.i1.i2.i2
  override def i5: I5 = item.item.i1.i2.i1.i1
  override def i6: I6 = item.item.i1.i2.i1.i2
  override def i7: I7 = item.item.i1.i2.i2.i1
  override def i8: I8 = item.item.i1.i2.i2.i2
  override def i9: I9 = item.item.i2.i1.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]]
    with Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]]
    with Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]]
    with Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def i12: I12 = item.item.i2.i1.i2.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]]
    with Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def i12: I12 = item.item.i2.i1.i2.i2
  override def i13: I13 = item.item.i2.i2.i1.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]]
    with Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def i12: I12 = item.item.i2.i1.i2.i2
  override def i13: I13 = item.item.i2.i2.i1.i1
  override def i14: I14 = item.item.i2.i2.i1.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]]
    with Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def i12: I12 = item.item.i2.i1.i2.i2
  override def i13: I13 = item.item.i2.i2.i1.i1
  override def i14: I14 = item.item.i2.i2.i1.i2
  override def i15: I15 = item.item.i2.i2.i2.i1
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]]
    with Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2
  override def i3: I3   = item.item.i1.i1.i2.i1
  override def i4: I4   = item.item.i1.i1.i2.i2
  override def i5: I5   = item.item.i1.i2.i1.i1
  override def i6: I6   = item.item.i1.i2.i1.i2
  override def i7: I7   = item.item.i1.i2.i2.i1
  override def i8: I8   = item.item.i1.i2.i2.i2
  override def i9: I9   = item.item.i2.i1.i1.i1
  override def i10: I10 = item.item.i2.i1.i1.i2
  override def i11: I11 = item.item.i2.i1.i2.i1
  override def i12: I12 = item.item.i2.i1.i2.i2
  override def i13: I13 = item.item.i2.i2.i1.i1
  override def i14: I14 = item.item.i2.i2.i1.i2
  override def i15: I15 = item.item.i2.i2.i2.i1
  override def i16: I16 = item.item.i2.i2.i2.i2
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]]
    with Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]
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
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]]
    with Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  override protected def item
    : EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]#AddRightItem[
      I10
    ]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]
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
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
    extends Any
    with Xyy[
      EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]#AddRightItem[
        I10
      ]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[I19]
    ]
    with Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  override protected def item
    : EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[I9]#AddRightItem[
      I10
    ]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[I19]
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
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]]
    with Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]
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
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]#AddRightItem[I21]]
    with Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]#AddRightItem[I21]
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
  override def eat[T](xyy: T): Eat[T]
}
trait ItemPlusXyy22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]
    extends Any
    with Xyy[EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[I8]#AddRightItem[
      I9
    ]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[I18]#AddRightItem[
      I19
    ]#AddRightItem[I20]#AddRightItem[I21]#AddRightItem[I22]]
    with Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] {
  override protected def item: EatValue0#AddRightItem[I1]#AddRightItem[I2]#AddRightItem[I3]#AddRightItem[I4]#AddRightItem[I5]#AddRightItem[I6]#AddRightItem[I7]#AddRightItem[
    I8
  ]#AddRightItem[I9]#AddRightItem[I10]#AddRightItem[I11]#AddRightItem[I12]#AddRightItem[I13]#AddRightItem[I14]#AddRightItem[I15]#AddRightItem[I16]#AddRightItem[I17]#AddRightItem[
    I18
  ]#AddRightItem[I19]#AddRightItem[I20]#AddRightItem[I21]#AddRightItem[I22]
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
