trait Item0 {
def eat[T](xyy: T): Item1[T] = new Item1[T] {
override def i1: T = xyy
}
def eatToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
trait Item1 [ I1  ] {
self =>
def i1: I1
def eat[T](xyy: T): Item2[T,  I1  ] = new Item2[T,  I1  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
}
def eatToTuple[T](xyy: T): Tuple2[T,  I1  ] = {
(xyy,
self.i1
)
}
}
trait Item2 [ I1  ,   I2  ] {
self =>
def i1: I1
def i2: I2
def eat[T](xyy: T): Item3[T,  I1  ,   I2  ] = new Item3[T,  I1  ,   I2  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
}
def eatToTuple[T](xyy: T): Tuple3[T,  I1  ,   I2  ] = {
(xyy,
self.i1  ,
self.i2
)
}
}
trait Item3 [ I1  ,   I2  ,   I3  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def eat[T](xyy: T): Item4[T,  I1  ,   I2  ,   I3  ] = new Item4[T,  I1  ,   I2  ,   I3  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
}
def eatToTuple[T](xyy: T): Tuple4[T,  I1  ,   I2  ,   I3  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3
)
}
}
trait Item4 [ I1  ,   I2  ,   I3  ,   I4  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def i4: I4
def eat[T](xyy: T): Item5[T,  I1  ,   I2  ,   I3  ,   I4  ] = new Item5[T,  I1  ,   I2  ,   I3  ,   I4  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
}
def eatToTuple[T](xyy: T): Tuple5[T,  I1  ,   I2  ,   I3  ,   I4  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4
)
}
}
trait Item5 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def i4: I4
def i5: I5
def eat[T](xyy: T): Item6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ] = new Item6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
}
def eatToTuple[T](xyy: T): Tuple6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5
)
}
}
trait Item6 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def i4: I4
def i5: I5
def i6: I6
def eat[T](xyy: T): Item7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] = new Item7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
}
def eatToTuple[T](xyy: T): Tuple7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6
)
}
}
trait Item7 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def i4: I4
def i5: I5
def i6: I6
def i7: I7
def eat[T](xyy: T): Item8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] = new Item8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
}
def eatToTuple[T](xyy: T): Tuple8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7
)
}
}
trait Item8 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] {
self =>
def i1: I1
def i2: I2
def i3: I3
def i4: I4
def i5: I5
def i6: I6
def i7: I7
def i8: I8
def eat[T](xyy: T): Item9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] = new Item9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
}
def eatToTuple[T](xyy: T): Tuple9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8
)
}
}
trait Item9 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] {
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
def eat[T](xyy: T): Item10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] = new Item10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
}
def eatToTuple[T](xyy: T): Tuple10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9
)
}
}
trait Item10 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] {
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
def eat[T](xyy: T): Item11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] = new Item11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
}
def eatToTuple[T](xyy: T): Tuple11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10
)
}
}
trait Item11 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] {
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
def eat[T](xyy: T): Item12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] = new Item12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
}
def eatToTuple[T](xyy: T): Tuple12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11
)
}
}
trait Item12 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] {
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
def eat[T](xyy: T): Item13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] = new Item13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
}
def eatToTuple[T](xyy: T): Tuple13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12
)
}
}
trait Item13 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] {
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
def eat[T](xyy: T): Item14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] = new Item14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
}
def eatToTuple[T](xyy: T): Tuple14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13
)
}
}
trait Item14 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] {
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
def eat[T](xyy: T): Item15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] = new Item15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
}
def eatToTuple[T](xyy: T): Tuple15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14
)
}
}
trait Item15 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] {
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
def eat[T](xyy: T): Item16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] = new Item16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
}
def eatToTuple[T](xyy: T): Tuple16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15
)
}
}
trait Item16 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] {
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
def eat[T](xyy: T): Item17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] = new Item17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
}
def eatToTuple[T](xyy: T): Tuple17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16
)
}
}
trait Item17 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] {
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
def eat[T](xyy: T): Item18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] = new Item18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
override def i18: I17 = self.i17
}
def eatToTuple[T](xyy: T): Tuple18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16  ,
self.i17
)
}
}
trait Item18 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] {
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
def eat[T](xyy: T): Item19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] = new Item19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
override def i18: I17 = self.i17
override def i19: I18 = self.i18
}
def eatToTuple[T](xyy: T): Tuple19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16  ,
self.i17  ,
self.i18
)
}
}
trait Item19 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] {
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
def eat[T](xyy: T): Item20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] = new Item20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
override def i18: I17 = self.i17
override def i19: I18 = self.i18
override def i20: I19 = self.i19
}
def eatToTuple[T](xyy: T): Tuple20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16  ,
self.i17  ,
self.i18  ,
self.i19
)
}
}
trait Item20 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] {
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
def eat[T](xyy: T): Item21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] = new Item21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
override def i18: I17 = self.i17
override def i19: I18 = self.i18
override def i20: I19 = self.i19
override def i21: I20 = self.i20
}
def eatToTuple[T](xyy: T): Tuple21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16  ,
self.i17  ,
self.i18  ,
self.i19  ,
self.i20
)
}
}
trait Item21 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] {
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
def eat[T](xyy: T): Item22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] = new Item22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] {
override def i1: T = xyy
override def i2: I1 = self.i1
override def i3: I2 = self.i2
override def i4: I3 = self.i3
override def i5: I4 = self.i4
override def i6: I5 = self.i5
override def i7: I6 = self.i6
override def i8: I7 = self.i7
override def i9: I8 = self.i8
override def i10: I9 = self.i9
override def i11: I10 = self.i10
override def i12: I11 = self.i11
override def i13: I12 = self.i12
override def i14: I13 = self.i13
override def i15: I14 = self.i14
override def i16: I15 = self.i15
override def i17: I16 = self.i16
override def i18: I17 = self.i17
override def i19: I18 = self.i18
override def i20: I19 = self.i19
override def i21: I20 = self.i20
override def i22: I21 = self.i21
}
def eatToTuple[T](xyy: T): Tuple22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5  ,
self.i6  ,
self.i7  ,
self.i8  ,
self.i9  ,
self.i10  ,
self.i11  ,
self.i12  ,
self.i13  ,
self.i14  ,
self.i15  ,
self.i16  ,
self.i17  ,
self.i18  ,
self.i19  ,
self.i20  ,
self.i21
)
}
}
trait Item22 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ,   I22  ] {
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
