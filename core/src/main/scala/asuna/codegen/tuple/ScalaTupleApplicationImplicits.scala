package asuna.tuple
import asuna._
trait ScalaTupleApplicationImplicits {
  implicit def tupleApplicationImplicits2[K <: KindContext, H1, H2, T1 <: TypeHList, T2 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2]
  ): Application[K, (H1, H2), ScalaTupleTypeHList2[T1, T2]] =
    new Application[K, (H1, H2), ScalaTupleTypeHList2[T1, T2]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList2[T1, T2]] = {
        if (context.isReverse) {
          context.append(TupleTag1.tupleTagApplicationImplicit1(t2).application(context), t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut2)
        } else {
          context.append(TupleTag1.tupleTagApplicationImplicit1(t1).application(context), t2.application(context), asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus2)
        }
      }
    }
  implicit def tupleApplicationImplicits3[K <: KindContext, H1, H2, H3, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, (H1, H2, H3), ScalaTupleTypeHList3[T1, T2, T3]] =
    new Application[K, (H1, H2, H3), ScalaTupleTypeHList3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(TupleTag2.tupleTagApplicationImplicit2(t2, t3).application(context), t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut3)
        } else {
          context.append(TupleTag2.tupleTagApplicationImplicit2(t1, t2).application(context), t3.application(context), asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus3)
        }
      }
    }
  implicit def tupleApplicationImplicits4[K <: KindContext, H1, H2, H3, H4, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4]
  ): Application[K, (H1, H2, H3, H4), ScalaTupleTypeHList4[T1, T2, T3, T4]] =
    new Application[K, (H1, H2, H3, H4), ScalaTupleTypeHList4[T1, T2, T3, T4]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(TupleTag3.tupleTagApplicationImplicit3(t2, t3, t4).application(context), t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut4)
        } else {
          context.append(
            TupleTag3.tupleTagApplicationImplicit3(t1, t2, t3).application(context),
            t4.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus4
          )
        }
      }
    }
  implicit def tupleApplicationImplicits5[K <: KindContext, H1, H2, H3, H4, H5, T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5]
  ): Application[K, (H1, H2, H3, H4, H5), ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] =
    new Application[K, (H1, H2, H3, H4, H5), ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(
            TupleTag4.tupleTagApplicationImplicit4(t2, t3, t4, t5).application(context),
            t1.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut5
          )
        } else {
          context.append(
            TupleTag4.tupleTagApplicationImplicit4(t1, t2, t3, t4).application(context),
            t5.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus5
          )
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
  ): Application[K, (H1, H2, H3, H4, H5, H6), ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Application[K, (H1, H2, H3, H4, H5, H6), ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append(
            TupleTag5.tupleTagApplicationImplicit5(t2, t3, t4, t5, t6).application(context),
            t1.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut6
          )
        } else {
          context.append(
            TupleTag5.tupleTagApplicationImplicit5(t1, t2, t3, t4, t5).application(context),
            t6.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus6
          )
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7), ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7), ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.isReverse) {
          context.append(
            TupleTag6.tupleTagApplicationImplicit6(t2, t3, t4, t5, t6, t7).application(context),
            t1.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut7
          )
        } else {
          context.append(
            TupleTag6.tupleTagApplicationImplicit6(t1, t2, t3, t4, t5, t6).application(context),
            t7.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus7
          )
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.isReverse) {
          context.append(
            TupleTag7.tupleTagApplicationImplicit7(t2, t3, t4, t5, t6, t7, t8).application(context),
            t1.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut8
          )
        } else {
          context.append(
            TupleTag7.tupleTagApplicationImplicit7(t1, t2, t3, t4, t5, t6, t7).application(context),
            t8.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus8
          )
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.isReverse) {
          context.append(
            TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context),
            t1.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPut9
          )
        } else {
          context.append(
            TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context),
            t9.application(context),
            asuna.tuple.ScalaTupleTypeHListPlus1.hlistPlus9
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.isReverse) {
          val i1 = TupleTag1.tupleTagApplicationImplicit1(t10).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList1[T10], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList1[T10]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut10)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag1.tupleTagApplicationImplicit1(t9).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList1[T9]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t10.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus10)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.isReverse) {
          val i1 = TupleTag2.tupleTagApplicationImplicit2(t10, t11).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList2[T10, T11], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList2[T10, T11]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut11)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag2.tupleTagApplicationImplicit2(t9, t10).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList2[T9, T10]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t11.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus11)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        if (context.isReverse) {
          val i1 = TupleTag3.tupleTagApplicationImplicit3(t10, t11, t12).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList3[T10, T11, T12], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList3[T10, T11, T12]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut12)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag3.tupleTagApplicationImplicit3(t9, t10, t11).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList3[T9, T10, T11]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t12.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus12)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        if (context.isReverse) {
          val i1 = TupleTag4.tupleTagApplicationImplicit4(t10, t11, t12, t13).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList4[T10, T11, T12, T13], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList4[T10, T11, T12, T13]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut13)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag4.tupleTagApplicationImplicit4(t9, t10, t11, t12).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList4[T9, T10, T11, T12]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t13.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus13)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.isReverse) {
          val i1 = TupleTag5.tupleTagApplicationImplicit5(t10, t11, t12, t13, t14).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList5[T10, T11, T12, T13, T14], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList5[T10, T11, T12, T13, T14]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut14)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag5.tupleTagApplicationImplicit5(t9, t10, t11, t12, t13).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList5[T9, T10, T11, T12, T13]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t14.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus14)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), ScalaTupleTypeHList15[
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
      ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        if (context.isReverse) {
          val i1 = TupleTag6.tupleTagApplicationImplicit6(t10, t11, t12, t13, t14, t15).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList6[T10, T11, T12, T13, T14, T15], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList6[T10, T11, T12, T13, T14, T15]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut15)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag6.tupleTagApplicationImplicit6(t9, t10, t11, t12, t13, t14).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList6[T9, T10, T11, T12, T13, T14]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t15.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus15)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), ScalaTupleTypeHList16[
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
      ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.isReverse) {
          val i1 = TupleTag7.tupleTagApplicationImplicit7(t10, t11, t12, t13, t14, t15, t16).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList7[T10, T11, T12, T13, T14, T15, T16], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList7[T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut16)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag7.tupleTagApplicationImplicit7(t9, t10, t11, t12, t13, t14, t15).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t16.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus16)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), ScalaTupleTypeHList17[
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
      ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.isReverse) {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList2[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17]
          ]](i1, i2, Only2Plus.hlistPut2)
          context.append(i3, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPut17)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          context.append(i3, t17.application(context), asuna.tuple.ScalaTupleTypeHListPlus2.hlistPlus17)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), ScalaTupleTypeHList18[
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
      ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        if (context.isReverse) {
          val i1 = TupleTag1.tupleTagApplicationImplicit1(t18).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[TupleTypeHList1[T18], TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList1[T18]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList1[T18]
          ], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList3[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList1[T18]
          ]](i4, i3, TupleTypeHListPlus3.put3)
          context.append(i5, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPut18)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = TupleTag1.tupleTagApplicationImplicit1(t17).application(context)
          val i4 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], TupleTypeHList1[T17], TupleTypeHList3[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            TupleTypeHList1[T17]
          ]](i4, i3, TupleTypeHListPlus3.plus3)
          context.append(i5, t18.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPlus18)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), ScalaTupleTypeHList19[
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
      ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def application(context: Context[K]): K#M[ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.isReverse) {
          val i1 = TupleTag2.tupleTagApplicationImplicit2(t18, t19).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[TupleTypeHList2[T18, T19], TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList2[T18, T19]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList2[T18, T19]
          ], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList3[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList2[T18, T19]
          ]](i4, i3, TupleTypeHListPlus3.put3)
          context.append(i5, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPut19)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = TupleTag2.tupleTagApplicationImplicit2(t17, t18).application(context)
          val i4 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], TupleTypeHList2[T17, T18], TupleTypeHList3[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            TupleTypeHList2[T17, T18]
          ]](i4, i3, TupleTypeHListPlus3.plus3)
          context.append(i5, t19.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPlus19)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), ScalaTupleTypeHList20[
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
      ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        if (context.isReverse) {
          val i1 = TupleTag3.tupleTagApplicationImplicit3(t18, t19, t20).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[TupleTypeHList3[T18, T19, T20], TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList3[T18, T19, T20]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList3[T18, T19, T20]
          ], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList3[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList3[T18, T19, T20]
          ]](i4, i3, TupleTypeHListPlus3.put3)
          context.append(i5, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPut20)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = TupleTag3.tupleTagApplicationImplicit3(t17, t18, t19).application(context)
          val i4 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], TupleTypeHList3[T17, T18, T19], TupleTypeHList3[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            TupleTypeHList3[T17, T18, T19]
          ]](i4, i3, TupleTypeHListPlus3.plus3)
          context.append(i5, t20.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPlus20)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), ScalaTupleTypeHList21[
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
      ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        if (context.isReverse) {
          val i1 = TupleTag4.tupleTagApplicationImplicit4(t18, t19, t20, t21).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[TupleTypeHList4[T18, T19, T20, T21], TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList4[T18, T19, T20, T21]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList4[T18, T19, T20, T21]
          ], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList3[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList4[T18, T19, T20, T21]
          ]](i4, i3, TupleTypeHListPlus3.put3)
          context.append(i5, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPut21)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = TupleTag4.tupleTagApplicationImplicit4(t17, t18, t19, t20).application(context)
          val i4 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], TupleTypeHList4[T17, T18, T19, T20], TupleTypeHList3[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            TupleTypeHList4[T17, T18, T19, T20]
          ]](i4, i3, TupleTypeHListPlus3.plus3)
          context.append(i5, t21.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPlus21)
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
  ): Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), ScalaTupleTypeHList22[
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
      ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def application(
        context: Context[K]
      ): K#M[ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        if (context.isReverse) {
          val i1 = TupleTag5.tupleTagApplicationImplicit5(t18, t19, t20, t21, t22).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = TupleTag8.tupleTagApplicationImplicit8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[TupleTypeHList5[T18, T19, T20, T21, T22], TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17], TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList5[T18, T19, T20, T21, T22]
          ]](i1, i2, Only2Plus.hlistPut2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList5[T18, T19, T20, T21, T22]
          ], TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9], TupleTypeHList3[
            TupleTypeHList8[T2, T3, T4, T5, T6, T7, T8, T9],
            TupleTypeHList8[T10, T11, T12, T13, T14, T15, T16, T17],
            TupleTypeHList5[T18, T19, T20, T21, T22]
          ]](i4, i3, TupleTypeHListPlus3.put3)
          context.append(i5, t1.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPut22)
        } else {
          val i1 = TupleTag8.tupleTagApplicationImplicit8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = TupleTag8.tupleTagApplicationImplicit8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = TupleTag5.tupleTagApplicationImplicit5(t17, t18, t19, t20, t21).application(context)
          val i4 = context.append[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, Only2Plus.hlistPlus2)
          val i5 = context.append[TupleTypeHList2[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], TupleTypeHList5[T17, T18, T19, T20, T21], TupleTypeHList3[
            TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
            TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
            TupleTypeHList5[T17, T18, T19, T20, T21]
          ]](i4, i3, TupleTypeHListPlus3.plus3)
          context.append(i5, t22.application(context), asuna.tuple.ScalaTupleTypeHListPlus3.hlistPlus22)
        }
      }
    }
}
object ScalaTupleApplicationImplicits extends ScalaTupleApplicationImplicits
