trait Xyy[I] {
  def item: I
}
class ItemEatXyy0 extends Item0 {
  override def eatToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
class ItemEatXyy1[I1](override val item: Item1[I1]) extends Xyy[Item1[I1]] with Item1[I1] {
  def i1 = item.i1
}
class ItemEatXyy2[I1, I2](override val item: Item2[Item1[I1], Item1[I2]]) extends Xyy[Item2[Item1[I1], Item1[I2]]] with Item2[I1, I2] {
  def i1 = item.i1.i1
  def i2 = item.i2.i1
}
class ItemEatXyy3[I1, I2, I3](override val item: Item2[Item1[I1], Item2[I2, I3]]) extends Xyy[Item2[Item1[I1], Item2[I2, I3]]] with Item3[I1, I2, I3] {
  def i1 = item.i1.i1
  def i2 = item.i2.i1
  def i3 = item.i2.i2
}
class ItemEatXyy4[I1, I2, I3, I4](override val item: Item2[Item2[Item1[I1], Item2[I2, I3]], Item1[Item1[I4]]])
    extends Xyy[Item2[Item2[Item1[I1], Item2[I2, I3]], Item1[Item1[I4]]]]
    with Item4[I1, I2, I3, I4] {
  def i1 = item.i1.i1.i1
  def i2 = item.i1.i2.i1
  def i3 = item.i1.i2.i2
  def i4 = item.i2.i1.i1
}
class ItemEatXyy5[I1, I2, I3, I4, I5](override val item: Item2[Item2[Item1[I1], Item2[I2, I3]], Item1[Item2[I4, I5]]])
    extends Xyy[Item2[Item2[Item1[I1], Item2[I2, I3]], Item1[Item2[I4, I5]]]]
    with Item5[I1, I2, I3, I4, I5] {
  def i1 = item.i1.i1.i1
  def i2 = item.i1.i2.i1
  def i3 = item.i1.i2.i2
  def i4 = item.i2.i1.i1
  def i5 = item.i2.i1.i2
}
class ItemEatXyy6[I1, I2, I3, I4, I5, I6](override val item: Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item1[I6]]])
    extends Xyy[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item1[I6]]]]
    with Item6[I1, I2, I3, I4, I5, I6] {
  def i1 = item.i1.i1.i1
  def i2 = item.i1.i2.i1
  def i3 = item.i1.i2.i2
  def i4 = item.i2.i1.i1
  def i5 = item.i2.i1.i2
  def i6 = item.i2.i2.i1
}
class ItemEatXyy7[I1, I2, I3, I4, I5, I6, I7](override val item: Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]])
    extends Xyy[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]]]
    with Item7[I1, I2, I3, I4, I5, I6, I7] {
  def i1 = item.i1.i1.i1
  def i2 = item.i1.i2.i1
  def i3 = item.i1.i2.i2
  def i4 = item.i2.i1.i1
  def i5 = item.i2.i1.i2
  def i6 = item.i2.i2.i1
  def i7 = item.i2.i2.i2
}
class ItemEatXyy8[I1, I2, I3, I4, I5, I6, I7, I8](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item1[Item1[I8]]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item1[Item1[I8]]]]]
    with Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
  def i1 = item.i1.i1.i1.i1
  def i2 = item.i1.i1.i2.i1
  def i3 = item.i1.i1.i2.i2
  def i4 = item.i1.i2.i1.i1
  def i5 = item.i1.i2.i1.i2
  def i6 = item.i1.i2.i2.i1
  def i7 = item.i1.i2.i2.i2
  def i8 = item.i2.i1.i1.i1
}
class ItemEatXyy9[I1, I2, I3, I4, I5, I6, I7, I8, I9](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item1[Item2[I8, I9]]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item1[Item2[I8, I9]]]]]
    with Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  def i1 = item.i1.i1.i1.i1
  def i2 = item.i1.i1.i2.i1
  def i3 = item.i1.i1.i2.i2
  def i4 = item.i1.i2.i1.i1
  def i5 = item.i1.i2.i1.i2
  def i6 = item.i1.i2.i2.i1
  def i7 = item.i1.i2.i2.i2
  def i8 = item.i2.i1.i1.i1
  def i9 = item.i2.i1.i1.i2
}
class ItemEatXyy10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item2[Item2[I8, I9], Item1[I10]]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item2[Item2[I8, I9], Item1[I10]]]]]
    with Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
}
class ItemEatXyy11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item2[Item2[I8, I9], Item2[I10, I11]]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item1[Item2[Item2[I8, I9], Item2[I10, I11]]]]]
    with Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
  def i11 = item.i2.i1.i2.i2
}
class ItemEatXyy12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item1[Item1[I12]]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item1[Item1[I12]]]]]
    with Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
  def i11 = item.i2.i1.i2.i2
  def i12 = item.i2.i2.i1.i1
}
class ItemEatXyy13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](
  override val item: Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item1[
    Item2[I12, I13]
  ]]]
) extends Xyy[Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item1[Item2[I12, I13]]]]]
    with Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
  def i11 = item.i2.i1.i2.i2
  def i12 = item.i2.i2.i1.i1
  def i13 = item.i2.i2.i1.i2
}
class ItemEatXyy14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](
  override val item: Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item1[I14]]]
  ]
) extends Xyy[
      Item2[Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]], Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item1[I14]]]]
    ]
    with Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
  def i11 = item.i2.i1.i2.i2
  def i12 = item.i2.i2.i1.i1
  def i13 = item.i2.i2.i1.i2
  def i14 = item.i2.i2.i2.i1
}
class ItemEatXyy15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  override val item: Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ]
) extends Xyy[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ]]
    with Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  def i1  = item.i1.i1.i1.i1
  def i2  = item.i1.i1.i2.i1
  def i3  = item.i1.i1.i2.i2
  def i4  = item.i1.i2.i1.i1
  def i5  = item.i1.i2.i1.i2
  def i6  = item.i1.i2.i2.i1
  def i7  = item.i1.i2.i2.i2
  def i8  = item.i2.i1.i1.i1
  def i9  = item.i2.i1.i1.i2
  def i10 = item.i2.i1.i2.i1
  def i11 = item.i2.i1.i2.i2
  def i12 = item.i2.i2.i1.i1
  def i13 = item.i2.i2.i1.i2
  def i14 = item.i2.i2.i2.i1
  def i15 = item.i2.i2.i2.i2
}
class ItemEatXyy16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item1[Item1[Item1[I16]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item1[Item1[Item1[I16]]]]]]
    with Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
}
class ItemEatXyy17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item1[Item1[Item2[I16, I17]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item1[Item1[Item2[I16, I17]]]]]]
    with Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
  def i17 = item.i2.i1.i1.i1.i2
}
class ItemEatXyy18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item1[Item2[Item2[I16, I17], Item1[I18]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item1[Item2[Item2[I16, I17], Item1[I18]]]]]]
    with Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
  def i17 = item.i2.i1.i1.i1.i2
  def i18 = item.i2.i1.i1.i2.i1
}
class ItemEatXyy19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item1[Item2[Item2[I16, I17], Item2[I18, I19]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item1[Item2[Item2[I16, I17], Item2[I18, I19]]]]]]
    with Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
  def i17 = item.i2.i1.i1.i1.i2
  def i18 = item.i2.i1.i1.i2.i1
  def i19 = item.i2.i1.i1.i2.i2
}
class ItemEatXyy20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item2[Item2[Item2[I16, I17], Item2[I18, I19]], Item1[Item1[I20]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item2[Item2[Item2[I16, I17], Item2[I18, I19]], Item1[Item1[I20]]]]]]
    with Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
  def i17 = item.i2.i1.i1.i1.i2
  def i18 = item.i2.i1.i1.i2.i1
  def i19 = item.i2.i1.i1.i2.i2
  def i20 = item.i2.i1.i2.i1.i1
}
class ItemEatXyy21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
  override val item: Item2[Item2[
    Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
    Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
  ], Item1[Item2[Item2[Item2[I16, I17], Item2[I18, I19]], Item1[Item2[I20, I21]]]]]
) extends Xyy[Item2[Item2[
      Item2[Item2[Item1[I1], Item2[I2, I3]], Item2[Item2[I4, I5], Item2[I6, I7]]],
      Item2[Item2[Item2[I8, I9], Item2[I10, I11]], Item2[Item2[I12, I13], Item2[I14, I15]]]
    ], Item1[Item2[Item2[Item2[I16, I17], Item2[I18, I19]], Item1[Item2[I20, I21]]]]]]
    with Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  def i1  = item.i1.i1.i1.i1.i1
  def i2  = item.i1.i1.i1.i2.i1
  def i3  = item.i1.i1.i1.i2.i2
  def i4  = item.i1.i1.i2.i1.i1
  def i5  = item.i1.i1.i2.i1.i2
  def i6  = item.i1.i1.i2.i2.i1
  def i7  = item.i1.i1.i2.i2.i2
  def i8  = item.i1.i2.i1.i1.i1
  def i9  = item.i1.i2.i1.i1.i2
  def i10 = item.i1.i2.i1.i2.i1
  def i11 = item.i1.i2.i1.i2.i2
  def i12 = item.i1.i2.i2.i1.i1
  def i13 = item.i1.i2.i2.i1.i2
  def i14 = item.i1.i2.i2.i2.i1
  def i15 = item.i1.i2.i2.i2.i2
  def i16 = item.i2.i1.i1.i1.i1
  def i17 = item.i2.i1.i1.i1.i2
  def i18 = item.i2.i1.i1.i2.i1
  def i19 = item.i2.i1.i1.i2.i2
  def i20 = item.i2.i1.i2.i1.i1
  def i21 = item.i2.i1.i2.i1.i2
}
