class ItemImpl0 extends Item0
class ItemImpl1[I1](val head: I1) extends ItemImpl0 with Item1[I1] {
  def i1: I1 = head
}
class ItemImpl2[I1, I2](override val head: I1, val tail: ItemImpl1[I2]) extends ItemImpl1(head) with Item2[I1, I2] {
  override def i1: I1 = head
  def i2: I2          = tail.head
}
class ItemImpl3[I1, I2, I3](override val head: I1, override val tail: ItemImpl2[I2, I3]) extends ItemImpl2[I2, I3](tail.head, tail.tail) with Item3[I1, I2, I3] {
  self =>
  override def i1: I1
  override def i2: I2
  def i3: I3
}
class ItemImpl4[I1, I2, I3, I4](override val head: I1, override val tail: ItemImpl3[I2, I3, I4])
    extends ItemImpl3[I2, I3, I4](tail.head, tail.tail)
    with Item4[I1, I2, I3, I4] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  def i4: I4
}
class ItemImpl5[I1, I2, I3, I4, I5](override val head: I1, override val tail: ItemImpl4[I2, I3, I4, I5])
    extends ItemImpl4[I2, I3, I4, I5](tail.head, tail.tail)
    with Item5[I1, I2, I3, I4, I5] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  def i5: I5
}
class ItemImpl6[I1, I2, I3, I4, I5, I6](override val head: I1, override val tail: ItemImpl5[I2, I3, I4, I5, I6])
    extends ItemImpl5[I2, I3, I4, I5, I6](tail.head, tail.tail)
    with Item6[I1, I2, I3, I4, I5, I6] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  def i6: I6
}
class ItemImpl7[I1, I2, I3, I4, I5, I6, I7](override val head: I1, override val tail: ItemImpl6[I2, I3, I4, I5, I6, I7])
    extends ItemImpl6[I2, I3, I4, I5, I6, I7](tail.head, tail.tail)
    with Item7[I1, I2, I3, I4, I5, I6, I7] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  def i7: I7
}
class ItemImpl8[I1, I2, I3, I4, I5, I6, I7, I8](override val head: I1, override val tail: ItemImpl7[I2, I3, I4, I5, I6, I7, I8])
    extends ItemImpl7[I2, I3, I4, I5, I6, I7, I8](tail.head, tail.tail)
    with Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  def i8: I8
}
class ItemImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9](override val head: I1, override val tail: ItemImpl8[I2, I3, I4, I5, I6, I7, I8, I9])
    extends ItemImpl8[I2, I3, I4, I5, I6, I7, I8, I9](tail.head, tail.tail)
    with Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  def i9: I9
}
class ItemImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](override val head: I1, override val tail: ItemImpl9[I2, I3, I4, I5, I6, I7, I8, I9, I10])
    extends ItemImpl9[I2, I3, I4, I5, I6, I7, I8, I9, I10](tail.head, tail.tail)
    with Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  def i10: I10
}
class ItemImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](override val head: I1, override val tail: ItemImpl10[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11])
    extends ItemImpl10[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](tail.head, tail.tail)
    with Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  def i11: I11
}
class ItemImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](override val head: I1, override val tail: ItemImpl11[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12])
    extends ItemImpl11[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](tail.head, tail.tail)
    with Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  def i12: I12
}
class ItemImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](override val head: I1,
                                                                         override val tail: ItemImpl12[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13])
    extends ItemImpl12[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](tail.head, tail.tail)
    with Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  def i13: I13
}
class ItemImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](override val head: I1,
                                                                              override val tail: ItemImpl13[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14])
    extends ItemImpl13[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](tail.head, tail.tail)
    with Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  def i14: I14
}
class ItemImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  override val head: I1,
  override val tail: ItemImpl14[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15])
    extends ItemImpl14[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](tail.head, tail.tail)
    with Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  def i15: I15
}
class ItemImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
  override val head: I1,
  override val tail: ItemImpl15[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16])
    extends ItemImpl15[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](tail.head, tail.tail)
    with Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  def i16: I16
}
class ItemImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
  override val head: I1,
  override val tail: ItemImpl16[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17])
    extends ItemImpl16[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](tail.head, tail.tail)
    with Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  def i17: I17
}
class ItemImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
  override val head: I1,
  override val tail: ItemImpl17[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18])
    extends ItemImpl17[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](tail.head, tail.tail)
    with Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  override def i17: I17
  def i18: I18
}
class ItemImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
  override val head: I1,
  override val tail: ItemImpl18[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19])
    extends ItemImpl18[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](tail.head, tail.tail)
    with Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  override def i17: I17
  override def i18: I18
  def i19: I19
}
class ItemImpl20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
  override val head: I1,
  override val tail: ItemImpl19[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20])
    extends ItemImpl19[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](tail.head, tail.tail)
    with Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  override def i17: I17
  override def i18: I18
  override def i19: I19
  def i20: I20
}
class ItemImpl21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
  override val head: I1,
  override val tail: ItemImpl20[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21])
    extends ItemImpl20[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](tail.head, tail.tail)
    with Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  override def i17: I17
  override def i18: I18
  override def i19: I19
  override def i20: I20
  def i21: I21
}
class ItemImpl22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22](
  override val head: I1,
  override val tail: ItemImpl21[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22])
    extends ItemImpl21[I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22](tail.head, tail.tail)
    with Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  override def i7: I7
  override def i8: I8
  override def i9: I9
  override def i10: I10
  override def i11: I11
  override def i12: I12
  override def i13: I13
  override def i14: I14
  override def i15: I15
  override def i16: I16
  override def i17: I17
  override def i18: I18
  override def i19: I19
  override def i20: I20
  override def i21: I21
  def i22: I22
}
