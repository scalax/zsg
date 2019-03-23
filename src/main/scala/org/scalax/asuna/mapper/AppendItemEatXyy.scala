trait Xyy[I] {
  def item: I
}
class ItemEatXyy0 extends Item0 {
  override def eatToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
class ItemEatXyy1[I1](override val item: E[EatValue1[I1]]) extends Xyy[E[EatValue1[I1]]] with Item1[I1] {
  override def i1: I1 = item.item.i1
}
class ItemEatXyy2[I1, I2](override val item: E[PItem2[EatValue1[I1], EatValue1[I2]]]) extends Xyy[E[PItem2[EatValue1[I1], EatValue1[I2]]]] with Item2[I1, I2] {
  override def i1: I1 = item.item.i1.i1
  override def i2: I2 = item.item.i2.i1
}
class ItemEatXyy3[I1, I2, I3](override val item: E[PItem2[EatValue1[I1], EatValue2[I2, I3]]])
    extends Xyy[E[PItem2[EatValue1[I1], EatValue2[I2, I3]]]]
    with Item3[I1, I2, I3] {
  override def i1: I1 = item.item.i1.i1
  override def i2: I2 = item.item.i2.i1
  override def i3: I3 = item.item.i2.i2
}
class ItemEatXyy4[I1, I2, I3, I4](override val item: E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem1[EatValue1[I4]]]])
    extends Xyy[E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem1[EatValue1[I4]]]]]
    with Item4[I1, I2, I3, I4] {
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i2.i1
  override def i3: I3 = item.item.i1.i2.i2
  override def i4: I4 = item.item.i2.i1.i1
}
class ItemEatXyy5[I1, I2, I3, I4, I5](override val item: E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem1[EatValue2[I4, I5]]]])
    extends Xyy[E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem1[EatValue2[I4, I5]]]]]
    with Item5[I1, I2, I3, I4, I5] {
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i2.i1
  override def i3: I3 = item.item.i1.i2.i2
  override def i4: I4 = item.item.i2.i1.i1
  override def i5: I5 = item.item.i2.i1.i2
}
class ItemEatXyy6[I1, I2, I3, I4, I5, I6](override val item: E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue1[I6]]]])
    extends Xyy[E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue1[I6]]]]]
    with Item6[I1, I2, I3, I4, I5, I6] {
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i2.i1
  override def i3: I3 = item.item.i1.i2.i2
  override def i4: I4 = item.item.i2.i1.i1
  override def i5: I5 = item.item.i2.i1.i2
  override def i6: I6 = item.item.i2.i2.i1
}
class ItemEatXyy7[I1, I2, I3, I4, I5, I6, I7](override val item: E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]]])
    extends Xyy[E[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]]]]
    with Item7[I1, I2, I3, I4, I5, I6, I7] {
  override def i1: I1 = item.item.i1.i1.i1
  override def i2: I2 = item.item.i1.i2.i1
  override def i3: I3 = item.item.i1.i2.i2
  override def i4: I4 = item.item.i2.i1.i1
  override def i5: I5 = item.item.i2.i1.i2
  override def i6: I6 = item.item.i2.i2.i1
  override def i7: I7 = item.item.i2.i2.i2
}
class ItemEatXyy8[I1, I2, I3, I4, I5, I6, I7, I8](
  override val item: E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem1[EatValue1[I8]]]]]
) extends Xyy[E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem1[EatValue1[I8]]]]]]
    with Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
  override def i1: I1 = item.item.i1.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2.i1
  override def i3: I3 = item.item.i1.i1.i2.i2
  override def i4: I4 = item.item.i1.i2.i1.i1
  override def i5: I5 = item.item.i1.i2.i1.i2
  override def i6: I6 = item.item.i1.i2.i2.i1
  override def i7: I7 = item.item.i1.i2.i2.i2
  override def i8: I8 = item.item.i2.i1.i1.i1
}
class ItemEatXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9](
  override val item: E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem1[EatValue2[I8, I9]]]]]
) extends Xyy[E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem1[EatValue2[I8, I9]]]]]]
    with Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  override def i1: I1 = item.item.i1.i1.i1.i1
  override def i2: I2 = item.item.i1.i1.i2.i1
  override def i3: I3 = item.item.i1.i1.i2.i2
  override def i4: I4 = item.item.i1.i2.i1.i1
  override def i5: I5 = item.item.i1.i2.i1.i2
  override def i6: I6 = item.item.i1.i2.i2.i1
  override def i7: I7 = item.item.i1.i2.i2.i2
  override def i8: I8 = item.item.i2.i1.i1.i1
  override def i9: I9 = item.item.i2.i1.i1.i2
}
class ItemEatXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](
  override val item: E[
    PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem2[EatValue2[I8, I9], EatValue1[I10]]]]
  ]
) extends Xyy[
      E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem2[EatValue2[I8, I9], EatValue1[I10]]]]]
    ]
    with Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
}
class ItemEatXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](
  override val item: E[
    PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]]]]
  ]
) extends Xyy[
      E[PItem2[PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]], PItem1[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]]]]]
    ]
    with Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
  override def i11: I11 = item.item.i2.i1.i2.i2
}
class ItemEatXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](
  override val item: E[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem1[EatValue1[I12]]]
  ]]
) extends Xyy[E[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem1[EatValue1[I12]]]
    ]]]
    with Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
  override def i11: I11 = item.item.i2.i1.i2.i2
  override def i12: I12 = item.item.i2.i2.i1.i1
}
class ItemEatXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](
  override val item: E[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem1[EatValue2[I12, I13]]]
  ]]
) extends Xyy[E[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem1[EatValue2[I12, I13]]]
    ]]]
    with Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
  override def i11: I11 = item.item.i2.i1.i2.i2
  override def i12: I12 = item.item.i2.i2.i1.i1
  override def i13: I13 = item.item.i2.i2.i1.i2
}
class ItemEatXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](
  override val item: E[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue1[I14]]]
  ]]
) extends Xyy[E[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue1[I14]]]
    ]]]
    with Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
  override def i11: I11 = item.item.i2.i1.i2.i2
  override def i12: I12 = item.item.i2.i2.i1.i1
  override def i13: I13 = item.item.i2.i2.i1.i2
  override def i14: I14 = item.item.i2.i2.i2.i1
}
class ItemEatXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  override val item: E[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ]]
) extends Xyy[E[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ]]]
    with Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  override def i1: I1   = item.item.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i2.i2.i2
  override def i8: I8   = item.item.i2.i1.i1.i1
  override def i9: I9   = item.item.i2.i1.i1.i2
  override def i10: I10 = item.item.i2.i1.i2.i1
  override def i11: I11 = item.item.i2.i1.i2.i2
  override def i12: I12 = item.item.i2.i2.i1.i1
  override def i13: I13 = item.item.i2.i2.i1.i2
  override def i14: I14 = item.item.i2.i2.i2.i1
  override def i15: I15 = item.item.i2.i2.i2.i2
}
class ItemEatXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem1[PItem1[EatValue1[I16]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem1[PItem1[EatValue1[I16]]]]]]]
    with Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
}
class ItemEatXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem1[PItem1[EatValue2[I16, I17]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem1[PItem1[EatValue2[I16, I17]]]]]]]
    with Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
  override def i17: I17 = item.item.i2.i1.i1.i1.i2
}
class ItemEatXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem1[PItem2[EatValue2[I16, I17], EatValue1[I18]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem1[PItem2[EatValue2[I16, I17], EatValue1[I18]]]]]]]
    with Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
  override def i17: I17 = item.item.i2.i1.i1.i1.i2
  override def i18: I18 = item.item.i2.i1.i1.i2.i1
}
class ItemEatXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem1[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem1[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]]]]]]]
    with Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
  override def i17: I17 = item.item.i2.i1.i1.i1.i2
  override def i18: I18 = item.item.i2.i1.i1.i2.i1
  override def i19: I19 = item.item.i2.i1.i1.i2.i2
}
class ItemEatXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem2[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]], PItem1[EatValue1[I20]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem2[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]], PItem1[EatValue1[I20]]]]]]]
    with Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
  override def i17: I17 = item.item.i2.i1.i1.i1.i2
  override def i18: I18 = item.item.i2.i1.i1.i2.i1
  override def i19: I19 = item.item.i2.i1.i1.i2.i2
  override def i20: I20 = item.item.i2.i1.i2.i1.i1
}
class ItemEatXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
  override val item: E[PItem2[PItem2[
    PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
    PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
  ], PItem1[PItem2[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]], PItem1[EatValue2[I20, I21]]]]]]
) extends Xyy[E[PItem2[PItem2[
      PItem2[PItem2[EatValue1[I1], EatValue2[I2, I3]], PItem2[EatValue2[I4, I5], EatValue2[I6, I7]]],
      PItem2[PItem2[EatValue2[I8, I9], EatValue2[I10, I11]], PItem2[EatValue2[I12, I13], EatValue2[I14, I15]]]
    ], PItem1[PItem2[PItem2[EatValue2[I16, I17], EatValue2[I18, I19]], PItem1[EatValue2[I20, I21]]]]]]]
    with Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  override def i1: I1   = item.item.i1.i1.i1.i1.i1
  override def i2: I2   = item.item.i1.i1.i1.i2.i1
  override def i3: I3   = item.item.i1.i1.i1.i2.i2
  override def i4: I4   = item.item.i1.i1.i2.i1.i1
  override def i5: I5   = item.item.i1.i1.i2.i1.i2
  override def i6: I6   = item.item.i1.i1.i2.i2.i1
  override def i7: I7   = item.item.i1.i1.i2.i2.i2
  override def i8: I8   = item.item.i1.i2.i1.i1.i1
  override def i9: I9   = item.item.i1.i2.i1.i1.i2
  override def i10: I10 = item.item.i1.i2.i1.i2.i1
  override def i11: I11 = item.item.i1.i2.i1.i2.i2
  override def i12: I12 = item.item.i1.i2.i2.i1.i1
  override def i13: I13 = item.item.i1.i2.i2.i1.i2
  override def i14: I14 = item.item.i1.i2.i2.i2.i1
  override def i15: I15 = item.item.i1.i2.i2.i2.i2
  override def i16: I16 = item.item.i2.i1.i1.i1.i1
  override def i17: I17 = item.item.i2.i1.i1.i1.i2
  override def i18: I18 = item.item.i2.i1.i1.i2.i1
  override def i19: I19 = item.item.i2.i1.i1.i2.i2
  override def i20: I20 = item.item.i2.i1.i2.i1.i1
  override def i21: I21 = item.item.i2.i1.i2.i1.i2
}
