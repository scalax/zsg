package zsg
object BuildContent {
  @inline def tuple1[T1](t1: T1): T1                       = t1
  @inline final def nodeTuple1[T1 <: TupleTag](t1: T1): T1 = t1
  @inline def tuple2[T1, T2](t1: T1, t2: T2): ZTuple2[T1, T2] =
    new ZTuple2(i1 = t1, i2 = t2)
  @inline final def nodeTuple2[T1 <: TupleTag, T2 <: TupleTag](t1: T1, t2: T2): ZNode2[T1, T2] =
    new ZNode2(i1 = t1, i2 = t2)
  @inline def tuple3[T1, T2, T3](t1: T1, t2: T2, t3: T3): ZTuple3[T1, T2, T3] =
    new ZTuple3(i1 = t1, i2 = t2, i3 = t3)
  @inline final def nodeTuple3[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag](t1: T1, t2: T2, t3: T3): ZNode3[T1, T2, T3] =
    new ZNode3(i1 = t1, i2 = t2, i3 = t3)
  @inline def tuple4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): ZTuple4[T1, T2, T3, T4] =
    new ZTuple4(i1 = t1, i2 = t2, i3 = t3, i4 = t4)
  @inline final def nodeTuple4[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag](t1: T1, t2: T2, t3: T3, t4: T4): ZNode4[T1, T2, T3, T4] =
    new ZNode4(i1 = t1, i2 = t2, i3 = t3, i4 = t4)
  @inline def tuple5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): ZTuple5[T1, T2, T3, T4, T5] =
    new ZTuple5(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5)
  @inline final def nodeTuple5[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5
  ): ZNode5[T1, T2, T3, T4, T5] =
    new ZNode5(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5)
  @inline def tuple6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): ZTuple6[T1, T2, T3, T4, T5, T6] =
    new ZTuple6(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6)
  @inline final def nodeTuple6[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6
  ): ZNode6[T1, T2, T3, T4, T5, T6] =
    new ZNode6(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6)
  @inline def tuple7[T1, T2, T3, T4, T5, T6, T7](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): ZTuple7[T1, T2, T3, T4, T5, T6, T7] =
    new ZTuple7(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7)
  @inline final def nodeTuple7[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7
  ): ZNode7[T1, T2, T3, T4, T5, T6, T7] =
    new ZNode7(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7)
  @inline def tuple8[T1, T2, T3, T4, T5, T6, T7, T8](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): ZTuple8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new ZTuple8(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8)
  @inline final def nodeTuple8[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag, T8 <: TupleTag](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8
  ): ZNode8[T1, T2, T3, T4, T5, T6, T7, T8] =
    new ZNode8(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8)
  @inline def tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9)
    : ZTuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new ZTuple9(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9)
  @inline final def nodeTuple9[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9): ZNode9[T1, T2, T3, T4, T5, T6, T7, T8, T9] =
    new ZNode9(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9)
  @inline def tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10)
    : ZTuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    new ZTuple10(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10)
  @inline final def nodeTuple10[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10): ZNode10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] =
    new ZNode10(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10)
  @inline def tuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11)
    : ZTuple11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    new ZTuple11(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11)
  @inline final def nodeTuple11[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11): ZNode11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] =
    new ZNode11(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11)
  @inline def tuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12
  ): ZTuple12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new ZTuple12(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12)
  @inline final def nodeTuple12[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12): ZNode12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] =
    new ZNode12(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12)
  @inline def tuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13
  ): ZTuple13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new ZTuple13(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13)
  @inline final def nodeTuple13[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13)
    : ZNode13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13] =
    new ZNode13(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13)
  @inline def tuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14
  ): ZTuple14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new ZTuple14(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13, i14 = t14)
  @inline final def nodeTuple14[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14)
    : ZNode14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14] =
    new ZNode14(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13, i14 = t14)
  @inline def tuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15
  ): ZTuple15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new ZTuple15(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13, i14 = t14, i15 = t15)
  @inline final def nodeTuple15[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15)
    : ZNode15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15] =
    new ZNode15(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6, i7 = t7, i8 = t8, i9 = t9, i10 = t10, i11 = t11, i12 = t12, i13 = t13, i14 = t14, i15 = t15)
  @inline def tuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16
  ): ZTuple16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new ZTuple16(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16
    )
  @inline final def nodeTuple16[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16)
    : ZNode16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] =
    new ZNode16(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16
    )
  @inline def tuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17
  ): ZTuple17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new ZTuple17(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17
    )
  @inline final def nodeTuple17[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17)
    : ZNode17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] =
    new ZNode17(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17
    )
  @inline def tuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18
  ): ZTuple18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new ZTuple18(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18
    )
  @inline final def nodeTuple18[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag,
    T18 <: TupleTag
  ](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8, t9: T9, t10: T10, t11: T11, t12: T12, t13: T13, t14: T14, t15: T15, t16: T16, t17: T17, t18: T18)
    : ZNode18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18] =
    new ZNode18(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18
    )
  @inline def tuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19
  ): ZTuple19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new ZTuple19(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19
    )
  @inline final def nodeTuple19[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag,
    T18 <: TupleTag,
    T19 <: TupleTag
  ](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19
  ): ZNode19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19] =
    new ZNode19(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19
    )
  @inline def tuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20
  ): ZTuple20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    new ZTuple20(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20
    )
  @inline final def nodeTuple20[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag,
    T18 <: TupleTag,
    T19 <: TupleTag,
    T20 <: TupleTag
  ](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20
  ): ZNode20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20] =
    new ZNode20(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20
    )
  @inline def tuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21
  ): ZTuple21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new ZTuple21(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20,
      i21 = t21
    )
  @inline final def nodeTuple21[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag,
    T18 <: TupleTag,
    T19 <: TupleTag,
    T20 <: TupleTag,
    T21 <: TupleTag
  ](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21
  ): ZNode21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21] =
    new ZNode21(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20,
      i21 = t21
    )
  @inline def tuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21,
    t22: T22
  ): ZTuple22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new ZTuple22(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20,
      i21 = t21,
      i22 = t22
    )
  @inline final def nodeTuple22[
    T1 <: TupleTag,
    T2 <: TupleTag,
    T3 <: TupleTag,
    T4 <: TupleTag,
    T5 <: TupleTag,
    T6 <: TupleTag,
    T7 <: TupleTag,
    T8 <: TupleTag,
    T9 <: TupleTag,
    T10 <: TupleTag,
    T11 <: TupleTag,
    T12 <: TupleTag,
    T13 <: TupleTag,
    T14 <: TupleTag,
    T15 <: TupleTag,
    T16 <: TupleTag,
    T17 <: TupleTag,
    T18 <: TupleTag,
    T19 <: TupleTag,
    T20 <: TupleTag,
    T21 <: TupleTag,
    T22 <: TupleTag
  ](
    t1: T1,
    t2: T2,
    t3: T3,
    t4: T4,
    t5: T5,
    t6: T6,
    t7: T7,
    t8: T8,
    t9: T9,
    t10: T10,
    t11: T11,
    t12: T12,
    t13: T13,
    t14: T14,
    t15: T15,
    t16: T16,
    t17: T17,
    t18: T18,
    t19: T19,
    t20: T20,
    t21: T21,
    t22: T22
  ): ZNode22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22] =
    new ZNode22(
      i1 = t1,
      i2 = t2,
      i3 = t3,
      i4 = t4,
      i5 = t5,
      i6 = t6,
      i7 = t7,
      i8 = t8,
      i9 = t9,
      i10 = t10,
      i11 = t11,
      i12 = t12,
      i13 = t13,
      i14 = t14,
      i15 = t15,
      i16 = t16,
      i17 = t17,
      i18 = t18,
      i19 = t19,
      i20 = t20,
      i21 = t21,
      i22 = t22
    )
}
