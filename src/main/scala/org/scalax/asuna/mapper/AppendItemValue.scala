class ItemValue0 extends Item0 {
override def eat[T](xyy: T): ItemValue1[T] = new ItemValue1(i1 = xyy)
override def eatToTuple[T](xyy: T): Tuple1[T] = Tuple1(xyy)
}
class ItemValue1 [ I1  ](
override val i1: I1
) extends Item1 [ I1  ] {
self =>
override def eat[T](xyy: T): ItemValue2[T,  I1  ] = new ItemValue2[T,  I1  ](
i1 = xyy,
i2 = self.i1
)
override def eatToTuple[T](xyy: T): Tuple2[T,  I1  ] = {
(xyy,
self.i1
)
}
}
class ItemValue2 [ I1  ,   I2  ](
override val i1: I1  ,
override val i2: I2
) extends Item2 [ I1  ,   I2  ] {
self =>
override def eat[T](xyy: T): ItemValue3[T,  I1  ,   I2  ] = new ItemValue3[T,  I1  ,   I2  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2
)
override def eatToTuple[T](xyy: T): Tuple3[T,  I1  ,   I2  ] = {
(xyy,
self.i1  ,
self.i2
)
}
}
class ItemValue3 [ I1  ,   I2  ,   I3  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3
) extends Item3 [ I1  ,   I2  ,   I3  ] {
self =>
override def eat[T](xyy: T): ItemValue4[T,  I1  ,   I2  ,   I3  ] = new ItemValue4[T,  I1  ,   I2  ,   I3  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3
)
override def eatToTuple[T](xyy: T): Tuple4[T,  I1  ,   I2  ,   I3  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3
)
}
}
class ItemValue4 [ I1  ,   I2  ,   I3  ,   I4  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4
) extends Item4 [ I1  ,   I2  ,   I3  ,   I4  ] {
self =>
override def eat[T](xyy: T): ItemValue5[T,  I1  ,   I2  ,   I3  ,   I4  ] = new ItemValue5[T,  I1  ,   I2  ,   I3  ,   I4  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4
)
override def eatToTuple[T](xyy: T): Tuple5[T,  I1  ,   I2  ,   I3  ,   I4  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4
)
}
}
class ItemValue5 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5
) extends Item5 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ] {
self =>
override def eat[T](xyy: T): ItemValue6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ] = new ItemValue6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5
)
override def eatToTuple[T](xyy: T): Tuple6[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ] = {
(xyy,
self.i1  ,
self.i2  ,
self.i3  ,
self.i4  ,
self.i5
)
}
}
class ItemValue6 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6
) extends Item6 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] {
self =>
override def eat[T](xyy: T): ItemValue7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] = new ItemValue7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6
)
override def eatToTuple[T](xyy: T): Tuple7[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ] = {
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
class ItemValue7 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7
) extends Item7 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] {
self =>
override def eat[T](xyy: T): ItemValue8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] = new ItemValue8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7
)
override def eatToTuple[T](xyy: T): Tuple8[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ] = {
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
class ItemValue8 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8
) extends Item8 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] {
self =>
override def eat[T](xyy: T): ItemValue9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] = new ItemValue9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8
)
override def eatToTuple[T](xyy: T): Tuple9[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ] = {
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
class ItemValue9 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9
) extends Item9 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] {
self =>
override def eat[T](xyy: T): ItemValue10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] = new ItemValue10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9
)
override def eatToTuple[T](xyy: T): Tuple10[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ] = {
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
class ItemValue10 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10
) extends Item10 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] {
self =>
override def eat[T](xyy: T): ItemValue11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] = new ItemValue11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10
)
override def eatToTuple[T](xyy: T): Tuple11[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ] = {
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
class ItemValue11 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11
) extends Item11 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] {
self =>
override def eat[T](xyy: T): ItemValue12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] = new ItemValue12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11
)
override def eatToTuple[T](xyy: T): Tuple12[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ] = {
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
class ItemValue12 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12
) extends Item12 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] {
self =>
override def eat[T](xyy: T): ItemValue13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] = new ItemValue13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12
)
override def eatToTuple[T](xyy: T): Tuple13[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ] = {
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
class ItemValue13 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13
) extends Item13 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] {
self =>
override def eat[T](xyy: T): ItemValue14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] = new ItemValue14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13
)
override def eatToTuple[T](xyy: T): Tuple14[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ] = {
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
class ItemValue14 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14
) extends Item14 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] {
self =>
override def eat[T](xyy: T): ItemValue15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] = new ItemValue15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14
)
override def eatToTuple[T](xyy: T): Tuple15[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ] = {
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
class ItemValue15 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15
) extends Item15 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] {
self =>
override def eat[T](xyy: T): ItemValue16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] = new ItemValue16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15
)
override def eatToTuple[T](xyy: T): Tuple16[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ] = {
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
class ItemValue16 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16
) extends Item16 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] {
self =>
override def eat[T](xyy: T): ItemValue17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] = new ItemValue17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16
)
override def eatToTuple[T](xyy: T): Tuple17[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ] = {
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
class ItemValue17 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16  ,
override val i17: I17
) extends Item17 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] {
self =>
override def eat[T](xyy: T): ItemValue18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] = new ItemValue18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16  ,
i18 = self.i17
)
override def eatToTuple[T](xyy: T): Tuple18[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ] = {
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
class ItemValue18 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16  ,
override val i17: I17  ,
override val i18: I18
) extends Item18 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] {
self =>
override def eat[T](xyy: T): ItemValue19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] = new ItemValue19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16  ,
i18 = self.i17  ,
i19 = self.i18
)
override def eatToTuple[T](xyy: T): Tuple19[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ] = {
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
class ItemValue19 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16  ,
override val i17: I17  ,
override val i18: I18  ,
override val i19: I19
) extends Item19 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] {
self =>
override def eat[T](xyy: T): ItemValue20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] = new ItemValue20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16  ,
i18 = self.i17  ,
i19 = self.i18  ,
i20 = self.i19
)
override def eatToTuple[T](xyy: T): Tuple20[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ] = {
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
class ItemValue20 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16  ,
override val i17: I17  ,
override val i18: I18  ,
override val i19: I19  ,
override val i20: I20
) extends Item20 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] {
self =>
override def eat[T](xyy: T): ItemValue21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] = new ItemValue21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16  ,
i18 = self.i17  ,
i19 = self.i18  ,
i20 = self.i19  ,
i21 = self.i20
)
override def eatToTuple[T](xyy: T): Tuple21[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ] = {
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
class ItemValue21 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ](
override val i1: I1  ,
override val i2: I2  ,
override val i3: I3  ,
override val i4: I4  ,
override val i5: I5  ,
override val i6: I6  ,
override val i7: I7  ,
override val i8: I8  ,
override val i9: I9  ,
override val i10: I10  ,
override val i11: I11  ,
override val i12: I12  ,
override val i13: I13  ,
override val i14: I14  ,
override val i15: I15  ,
override val i16: I16  ,
override val i17: I17  ,
override val i18: I18  ,
override val i19: I19  ,
override val i20: I20  ,
override val i21: I21
) extends Item21 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] {
self =>
override def eat[T](xyy: T): ItemValue22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] = new ItemValue22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ](
i1 = xyy,
i2 = self.i1  ,
i3 = self.i2  ,
i4 = self.i3  ,
i5 = self.i4  ,
i6 = self.i5  ,
i7 = self.i6  ,
i8 = self.i7  ,
i9 = self.i8  ,
i10 = self.i9  ,
i11 = self.i10  ,
i12 = self.i11  ,
i13 = self.i12  ,
i14 = self.i13  ,
i15 = self.i14  ,
i16 = self.i15  ,
i17 = self.i16  ,
i18 = self.i17  ,
i19 = self.i18  ,
i20 = self.i19  ,
i21 = self.i20  ,
i22 = self.i21
)
override def eatToTuple[T](xyy: T): Tuple22[T,  I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ] = {
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
class ItemValue22 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ,   I22  ](
override  val i1: I1  ,
override  val i2: I2  ,
override  val i3: I3  ,
override  val i4: I4  ,
override  val i5: I5  ,
override  val i6: I6  ,
override  val i7: I7  ,
override  val i8: I8  ,
override  val i9: I9  ,
override  val i10: I10  ,
override  val i11: I11  ,
override  val i12: I12  ,
override  val i13: I13  ,
override  val i14: I14  ,
override  val i15: I15  ,
override  val i16: I16  ,
override  val i17: I17  ,
override  val i18: I18  ,
override  val i19: I19  ,
override  val i20: I20  ,
override  val i21: I21  ,
val i22: I22
) extends Item22 [ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ,   I9  ,   I10  ,   I11  ,   I12  ,   I13  ,   I14  ,   I15  ,   I16  ,   I17  ,   I18  ,   I19  ,   I20  ,   I21  ,   I22  ] {
self =>
}
