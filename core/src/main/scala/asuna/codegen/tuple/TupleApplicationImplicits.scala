package asuna
trait TupleApplicationImplicits {
  implicit def tupleApplicationImplicits2[K <: KindContext, H1, H2, T1 <: TypeHList, T2 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, (H1, H2), TupleTypeHList2[T1, T2]] =
    new Application[K, (H1, H2), TupleTypeHList2[T1, T2]] {
      override def application(context: Context[K]): K#M[TupleTypeHList2[T1, T2]] = {
        if (context.isReverse) {
          context.append(ItemTag1.itemTagApplicationImplicit1(t2).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut2)
        } else {
          context.append(ItemTag1.itemTagApplicationImplicit1(t1).application(context), t2.application(context), TupleTypeHListPlus1.hlistPlus2)
        }
      }
    }
  implicit def tupleApplicationImplicits3[K <: KindContext, H1, H2, H3, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, (H1, H2, H3), TupleTypeHList3[T1, T2, T3]] =
    new Application[K, (H1, H2, H3), TupleTypeHList3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[TupleTypeHList3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(ItemTag2.itemTagApplicationImplicit2(t2, t3).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut3)
        } else {
          context.append(ItemTag2.itemTagApplicationImplicit2(t1, t2).application(context), t3.application(context), TupleTypeHListPlus1.hlistPlus3)
        }
      }
    }
  implicit def tupleApplicationImplicits4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, (H1, H2, H3, H4), TupleTypeHList4[T1, T2, T3, T4]] =
    new Application[K, (H1, H2, H3, H4), TupleTypeHList4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[TupleTypeHList4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(ItemTag3.itemTagApplicationImplicit3(t2, t3, t4).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut4)
        } else {
          context.append(ItemTag3.itemTagApplicationImplicit3(t1, t2, t3).application(context), t4.application(context), TupleTypeHListPlus1.hlistPlus4)
        }
      }
    }
  implicit def tupleApplicationImplicits5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, (H1, H2, H3, H4, H5), TupleTypeHList5[T1, T2, T3, T4, T5]] =
    new Application[K, (H1, H2, H3, H4, H5), TupleTypeHList5[T1, T2, T3, T4, T5]] {
      override def application(context: Context[K]): K#M[TupleTypeHList5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(ItemTag4.itemTagApplicationImplicit4(t2, t3, t4, t5).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut5)
        } else {
          context.append(ItemTag4.itemTagApplicationImplicit4(t1, t2, t3, t4).application(context), t5.application(context), TupleTypeHListPlus1.hlistPlus5)
        }
      }
    }
  implicit def tupleApplicationImplicits6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, (H1, H2, H3, H4, H5, H6), TupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, (H1, H2, H3, H4, H5, H6), TupleTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[TupleTypeHList6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append(ItemTag5.itemTagApplicationImplicit5(t2, t3, t4, t5, t6).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut6)
        } else {
          context.append(ItemTag5.itemTagApplicationImplicit5(t1, t2, t3, t4, t5).application(context), t6.application(context), TupleTypeHListPlus1.hlistPlus6)
        }
      }
    }
  implicit def tupleApplicationImplicits7[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7), TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7), TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.isReverse) {
          context.append(ItemTag6.itemTagApplicationImplicit6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut7)
        } else {
          context.append(ItemTag6.itemTagApplicationImplicit6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), TupleTypeHListPlus1.hlistPlus7)
        }
      }
    }
  implicit def tupleApplicationImplicits8[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: Context[K]): K#M[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.isReverse) {
          context.append(ItemTag7.itemTagApplicationImplicit7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), TupleTypeHListPlus1.hlistPut8)
        } else {
          context.append(ItemTag7.itemTagApplicationImplicit7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), TupleTypeHListPlus1.hlistPlus8)
        }
      }
    }
  implicit def tupleApplicationImplicits9[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), TupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), TupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: Context[K]): K#M[TupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.isReverse) {
          context.append(
            ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context),
            t1.application(context),
            TupleTypeHListPlus1.hlistPut9
          )
        } else {
          context.append(
            ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context),
            t9.application(context),
            TupleTypeHListPlus1.hlistPlus9
          )
        }
      }
    }
  implicit def tupleApplicationImplicits10[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), TupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), TupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: Context[K]): K#M[TupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.isReverse) {
          val i1 = ItemTag1.itemTagApplicationImplicit1(t10).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList1[T10], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList1[T10]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut10)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag1.itemTagApplicationImplicit1(t9).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList1[T9], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList1[T9]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t10.application(context), TupleTypeHListPlus2.hlistPlus10)
        }
      }
    }
  implicit def tupleApplicationImplicits11[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), TupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), TupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: Context[K]): K#M[TupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.isReverse) {
          val i1 = ItemTag2.itemTagApplicationImplicit2(t10, t11).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList2[T10, T11], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList2[T10, T11]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut11)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag2.itemTagApplicationImplicit2(t9, t10).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList2[T9, T10], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList2[T9, T10]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t11.application(context), TupleTypeHListPlus2.hlistPlus11)
        }
      }
    }
  implicit def tupleApplicationImplicits12[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), TupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), TupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def application(context: Context[K]): K#M[TupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        if (context.isReverse) {
          val i1 = ItemTag3.itemTagApplicationImplicit3(t10, t11, t12).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList3[T10, T11, T12], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList3[T10, T11, T12]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut12)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag3.itemTagApplicationImplicit3(t9, t10, t11).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList3[T9, T10, T11], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList3[T9, T10, T11]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t12.application(context), TupleTypeHListPlus2.hlistPlus12)
        }
      }
    }
  implicit def tupleApplicationImplicits13[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), TupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), TupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def application(context: Context[K]): K#M[TupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        if (context.isReverse) {
          val i1 = ItemTag4.itemTagApplicationImplicit4(t10, t11, t12, t13).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList4[T10, T11, T12, T13], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList4[T10, T11, T12, T13]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut13)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag4.itemTagApplicationImplicit4(t9, t10, t11, t12).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList4[T9, T10, T11, T12], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList4[T9, T10, T11, T12]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t13.application(context), TupleTypeHListPlus2.hlistPlus13)
        }
      }
    }
  implicit def tupleApplicationImplicits14[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), TupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), TupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def application(context: Context[K]): K#M[TupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.isReverse) {
          val i1 = ItemTag5.itemTagApplicationImplicit5(t10, t11, t12, t13, t14).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList5[T10, T11, T12, T13, T14], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList5[T10, T11, T12, T13, T14]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut14)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag5.itemTagApplicationImplicit5(t9, t10, t11, t12, t13).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList5[T9, T10, T11, T12, T13], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList5[T9, T10, T11, T12, T13]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t14.application(context), TupleTypeHListPlus2.hlistPlus14)
        }
      }
    }
  implicit def tupleApplicationImplicits15[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), TupleTypeHList15[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15),
      TupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        if (context.isReverse) {
          val i1 = ItemTag6.itemTagApplicationImplicit6(t10, t11, t12, t13, t14, t15).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList6[T10, T11, T12, T13, T14, T15], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList6[T10, T11, T12, T13, T14, T15]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut15)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag6.itemTagApplicationImplicit6(t9, t10, t11, t12, t13, t14).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList6[T9, T10, T11, T12, T13, T14], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList6[T9, T10, T11, T12, T13, T14]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t15.application(context), TupleTypeHListPlus2.hlistPlus15)
        }
      }
    }
  implicit def tupleApplicationImplicits16[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), TupleTypeHList16[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16),
      TupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.isReverse) {
          val i1 = ItemTag7.itemTagApplicationImplicit7(t10, t11, t12, t13, t14, t15, t16).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList7[T10, T11, T12, T13, T14, T15, T16], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList7[T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut16)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag7.itemTagApplicationImplicit7(t9, t10, t11, t12, t13, t14, t15).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList7[T9, T10, T11, T12, T13, T14, T15], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList7[T9, T10, T11, T12, T13, T14, T15]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t16.application(context), TupleTypeHListPlus2.hlistPlus16)
        }
      }
    }
  implicit def tupleApplicationImplicits17[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), TupleTypeHList17[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17),
      TupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.isReverse) {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList2[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), TupleTypeHListPlus2.hlistPut17)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t17.application(context), TupleTypeHListPlus2.hlistPlus17)
        }
      }
    }
  implicit def tupleApplicationImplicits18[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), TupleTypeHList18[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18),
      TupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        if (context.isReverse) {
          val i1 = ItemTag1.itemTagApplicationImplicit1(t18).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[ItemTypeHList1[T18], ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList1[T18]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList1[T18]
          ], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList3[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList1[T18]
          ]](i4, i3, ItemTypeHListPlus3.put3)
          context.append(i5, t1.application(context), TupleTypeHListPlus3.hlistPut18)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag1.itemTagApplicationImplicit1(t17).application(context)
          val i4 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], ItemTypeHList1[T17], ItemTypeHList3[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            ItemTypeHList1[T17]
          ]](i4, i3, ItemTypeHListPlus3.plus3)
          context.append(i5, t18.application(context), TupleTypeHListPlus3.hlistPlus18)
        }
      }
    }
  implicit def tupleApplicationImplicits19[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), TupleTypeHList19[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19),
      TupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.isReverse) {
          val i1 = ItemTag2.itemTagApplicationImplicit2(t18, t19).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[ItemTypeHList2[T18, T19], ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList2[T18, T19]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList2[T18, T19]
          ], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList3[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList2[T18, T19]
          ]](i4, i3, ItemTypeHListPlus3.put3)
          context.append(i5, t1.application(context), TupleTypeHListPlus3.hlistPut19)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag2.itemTagApplicationImplicit2(t17, t18).application(context)
          val i4 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], ItemTypeHList2[T17, T18], ItemTypeHList3[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            ItemTypeHList2[T17, T18]
          ]](i4, i3, ItemTypeHListPlus3.plus3)
          context.append(i5, t19.application(context), TupleTypeHListPlus3.hlistPlus19)
        }
      }
    }
  implicit def tupleApplicationImplicits20[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), TupleTypeHList20[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20),
      TupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def application(context: Context[K]): K#M[TupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        if (context.isReverse) {
          val i1 = ItemTag3.itemTagApplicationImplicit3(t18, t19, t20).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[ItemTypeHList3[T18, T19, T20], ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList3[T18, T19, T20]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList3[T18, T19, T20]
          ], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList3[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList3[T18, T19, T20]
          ]](i4, i3, ItemTypeHListPlus3.put3)
          context.append(i5, t1.application(context), TupleTypeHListPlus3.hlistPut20)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag3.itemTagApplicationImplicit3(t17, t18, t19).application(context)
          val i4 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], ItemTypeHList3[T17, T18, T19], ItemTypeHList3[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            ItemTypeHList3[T17, T18, T19]
          ]](i4, i3, ItemTypeHListPlus3.plus3)
          context.append(i5, t20.application(context), TupleTypeHListPlus3.hlistPlus20)
        }
      }
    }
  implicit def tupleApplicationImplicits21[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    H21,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList,
    T21 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20],
    t21: Application[K, H21, T21]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), TupleTypeHList21[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21),
      TupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def application(
        context: Context[K]
      ): K#M[TupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        if (context.isReverse) {
          val i1 = ItemTag4.itemTagApplicationImplicit4(t18, t19, t20, t21).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[ItemTypeHList4[T18, T19, T20, T21], ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList4[T18, T19, T20, T21]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList4[T18, T19, T20, T21]
          ], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList3[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList4[T18, T19, T20, T21]
          ]](i4, i3, ItemTypeHListPlus3.put3)
          context.append(i5, t1.application(context), TupleTypeHListPlus3.hlistPut21)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag4.itemTagApplicationImplicit4(t17, t18, t19, t20).application(context)
          val i4 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], ItemTypeHList4[T17, T18, T19, T20], ItemTypeHList3[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            ItemTypeHList4[T17, T18, T19, T20]
          ]](i4, i3, ItemTypeHListPlus3.plus3)
          context.append(i5, t21.application(context), TupleTypeHListPlus3.hlistPlus21)
        }
      }
    }
  implicit def tupleApplicationImplicits22[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    H21,
    H22,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    T7 <: TypeHList,
    T8 <: TypeHList,
    T9 <: TypeHList,
    T10 <: TypeHList,
    T11 <: TypeHList,
    T12 <: TypeHList,
    T13 <: TypeHList,
    T14 <: TypeHList,
    T15 <: TypeHList,
    T16 <: TypeHList,
    T17 <: TypeHList,
    T18 <: TypeHList,
    T19 <: TypeHList,
    T20 <: TypeHList,
    T21 <: TypeHList,
    T22 <: TypeHList
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8],
    t9: Application[K, H9, T9],
    t10: Application[K, H10, T10],
    t11: Application[K, H11, T11],
    t12: Application[K, H12, T12],
    t13: Application[K, H13, T13],
    t14: Application[K, H14, T14],
    t15: Application[K, H15, T15],
    t16: Application[K, H16, T16],
    t17: Application[K, H17, T17],
    t18: Application[K, H18, T18],
    t19: Application[K, H19, T19],
    t20: Application[K, H20, T20],
    t21: Application[K, H21, T21],
    t22: Application[K, H22, T22]
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), TupleTypeHList22[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22
  ]] =
    new Application[
      K,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22),
      TupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def application(
        context: Context[K]
      ): K#M[TupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        if (context.isReverse) {
          val i1 = ItemTag5.itemTagApplicationImplicit5(t18, t19, t20, t21, t22).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.itemTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[ItemTypeHList5[T18, T19, T20, T21, T22], ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList5[T18, T19, T20, T21, T22]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList5[T18, T19, T20, T21, T22]
          ], ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], ItemTypeHList3[
            ItemTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            ItemTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            ItemTypeHList5[T18, T19, T20, T21, T22]
          ]](i4, i3, ItemTypeHListPlus3.put3)
          context.append(i5, t1.application(context), TupleTypeHListPlus3.hlistPut22)
        } else {
          val i1 = ItemTag8.itemTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.itemTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag5.itemTagApplicationImplicit5(t17, t18, t19, t20, t21).application(context)
          val i4 = context.append[ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[ItemTypeHList2[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], ItemTypeHList5[T17, T18, T19, T20, T21], ItemTypeHList3[
            ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            ItemTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            ItemTypeHList5[T17, T18, T19, T20, T21]
          ]](i4, i3, ItemTypeHListPlus3.plus3)
          context.append(i5, t22.application(context), TupleTypeHListPlus3.hlistPlus22)
        }
      }
    }
}
object TupleApplicationImplicits extends TupleApplicationImplicits
