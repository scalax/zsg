trait Item0
trait Item1[I1] extends Item0 {
  def i1: I1
}
trait Item2[I1, I2] extends Item1[I1] {
  self =>
  override def i1: I1
  def i2: I2
}
trait Item3[I1, I2, I3] extends Item2[I1, I2] {
  self =>
  override def i1: I1
  override def i2: I2
  def i3: I3
}
trait Item4[I1, I2, I3, I4] extends Item3[I1, I2, I3] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  def i4: I4
}
trait Item5[I1, I2, I3, I4, I5] extends Item4[I1, I2, I3, I4] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  def i5: I5
}
trait Item6[I1, I2, I3, I4, I5, I6] extends Item5[I1, I2, I3, I4, I5] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  def i6: I6
}
trait Item7[I1, I2, I3, I4, I5, I6, I7] extends Item6[I1, I2, I3, I4, I5, I6] {
  self =>
  override def i1: I1
  override def i2: I2
  override def i3: I3
  override def i4: I4
  override def i5: I5
  override def i6: I6
  def i7: I7
}
trait Item8[I1, I2, I3, I4, I5, I6, I7, I8] extends Item7[I1, I2, I3, I4, I5, I6, I7] {
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
trait Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends Item8[I1, I2, I3, I4, I5, I6, I7, I8] {
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
trait Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] {
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
trait Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] {
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
trait Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] {
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
trait Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] {
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
trait Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] {
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
trait Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] {
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
trait Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] {
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
trait Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
    extends Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] {
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
trait Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
    extends Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] {
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
trait Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
    extends Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] {
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
trait Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
    extends Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] {
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
trait Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]
    extends Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] {
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
trait Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]
    extends Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] {
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
