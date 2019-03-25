trait Item0 extends Any {
  def eat[T](xyy: T): Item1[T]
}
trait Item1[I1] extends Any {
  self =>
  def i1: I1
  def eat[T](xyy: T): Item2[I1, T]
}
trait Item2[I1, I2] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def eat[T](xyy: T): Item3[I1, I2, T]
}
trait Item3[I1, I2, I3] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def eat[T](xyy: T): Item4[I1, I2, I3, T]
}
trait Item4[I1, I2, I3, I4] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def eat[T](xyy: T): Item5[I1, I2, I3, I4, T]
}
trait Item5[I1, I2, I3, I4, I5] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def eat[T](xyy: T): Item6[I1, I2, I3, I4, I5, T]
}
trait Item6[I1, I2, I3, I4, I5, I6] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def eat[T](xyy: T): Item7[I1, I2, I3, I4, I5, I6, T]
}
trait Item7[I1, I2, I3, I4, I5, I6, I7] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def eat[T](xyy: T): Item8[I1, I2, I3, I4, I5, I6, I7, T]
}
trait Item8[I1, I2, I3, I4, I5, I6, I7, I8] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def eat[T](xyy: T): Item9[I1, I2, I3, I4, I5, I6, I7, I8, T]
}
trait Item9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def eat[T](xyy: T): Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, T]
}
trait Item10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def eat[T](xyy: T): Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, T]
}
trait Item11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def eat[T](xyy: T): Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, T]
}
trait Item12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def eat[T](xyy: T): Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, T]
}
trait Item13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def eat[T](xyy: T): Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, T]
}
trait Item14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def eat[T](xyy: T): Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, T]
}
trait Item15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def eat[T](xyy: T): Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, T]
}
trait Item16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def eat[T](xyy: T): Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, T]
}
trait Item17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def eat[T](xyy: T): Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, T]
}
trait Item18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def i18: I18
  def eat[T](xyy: T): Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, T]
}
trait Item19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def i18: I18
  def i19: I19
  def eat[T](xyy: T): Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, T]
}
trait Item20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def i18: I18
  def i19: I19
  def i20: I20
  def eat[T](xyy: T): Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, T]
}
trait Item21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def i18: I18
  def i19: I19
  def i20: I20
  def i21: I21
  def eat[T](xyy: T): Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, T]
}
trait Item22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] extends Any {
  self =>
  def i1: I1
  def i2: I2
  def i3: I3
  def i4: I4
  def i5: I5
  def i6: I6
  def i7: I7
  def i8: I8
  def i9: I9
  def i10: I10
  def i11: I11
  def i12: I12
  def i13: I13
  def i14: I14
  def i15: I15
  def i16: I16
  def i17: I17
  def i18: I18
  def i19: I19
  def i20: I20
  def i21: I21
  def i22: I22
}
