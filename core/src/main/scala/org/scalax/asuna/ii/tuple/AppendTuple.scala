package org.scalax.asuna.mapper.item
trait AppendTuple {
  implicit def xyy2[K <: org.scalax.asuna.mapper.KindContext, H1, H2, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2]): org.scalax.asuna.mapper.Application[K, (H1, H2), XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2), XyyTupleType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut2)
        } else {
          context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyTuplePlus.hlistPlus2)
        }
      }
    }
  implicit def xyy3[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3]): org.scalax.asuna.mapper.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(ItemTag2.appendEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut3)
        } else {
          context.append(ItemTag2.appendEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyTuplePlus.hlistPlus3)
        }
      }
    }
  implicit def xyy4[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3], t4: org.scalax.asuna.mapper.Application[K, H4, T4]): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(ItemTag3.appendEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut4)
        } else {
          context.append(ItemTag3.appendEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyTuplePlus.hlistPlus4)
        }
      }
    }
  implicit def xyy5[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3], t4: org.scalax.asuna.mapper.Application[K, H4, T4], t5: org.scalax.asuna.mapper.Application[K, H5, T5]): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(ItemTag4.appendEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut5)
        } else {
          context.append(ItemTag4.appendEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyTuplePlus.hlistPlus5)
        }
      }
    }
  implicit def xyy6[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3], t4: org.scalax.asuna.mapper.Application[K, H4, T4], t5: org.scalax.asuna.mapper.Application[K, H5, T5], t6: org.scalax.asuna.mapper.Application[K, H6, T6]): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append(ItemTag5.appendEatXyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut6)
        } else {
          context.append(ItemTag5.appendEatXyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyTuplePlus.hlistPlus6)
        }
      }
    }
  implicit def xyy7[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3], t4: org.scalax.asuna.mapper.Application[K, H4, T4], t5: org.scalax.asuna.mapper.Application[K, H5, T5], t6: org.scalax.asuna.mapper.Application[K, H6, T6], t7: org.scalax.asuna.mapper.Application[K, H7, T7]): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.isReverse) {
          context.append(ItemTag6.appendEatXyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut7)
        } else {
          context.append(ItemTag6.appendEatXyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyTuplePlus.hlistPlus7)
        }
      }
    }
  implicit def xyy8[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3], t4: org.scalax.asuna.mapper.Application[K, H4, T4], t5: org.scalax.asuna.mapper.Application[K, H5, T5], t6: org.scalax.asuna.mapper.Application[K, H6, T6], t7: org.scalax.asuna.mapper.Application[K, H7, T7], t8: org.scalax.asuna.mapper.Application[K, H8, T8])
    : org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.isReverse) {
          context.append(ItemTag7.appendEatXyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut8)
        } else {
          context.append(ItemTag7.appendEatXyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyTuplePlus.hlistPlus8)
        }
      }
    }
  implicit def xyy9[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.isReverse) {
          context.append(ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut9)
        } else {
          context.append(ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context), t9.application(context), ArticleXyyTuplePlus.hlistPlus9)
        }
      }
    }
  implicit def xyy10[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.isReverse) {
          val i1 = ItemTag1.appendEatXyy1(t10).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType1[T10], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType1[T10]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut10)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag1.appendEatXyy1(t9).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType1[T9], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType1[T9]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t10.application(context), ArticleXyyTuplePlus22.hlistPlus10)
        }
      }
    }
  implicit def xyy11[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.isReverse) {
          val i1 = ItemTag2.appendEatXyy2(t10, t11).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType2[T10, T11], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType2[T10, T11]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut11)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag2.appendEatXyy2(t9, t10).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType2[T9, T10], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType2[T9, T10]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t11.application(context), ArticleXyyTuplePlus22.hlistPlus11)
        }
      }
    }
  implicit def xyy12[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), XyyTupleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), XyyTupleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        if (context.isReverse) {
          val i1 = ItemTag3.appendEatXyy3(t10, t11, t12).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType3[T10, T11, T12], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType3[T10, T11, T12]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut12)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag3.appendEatXyy3(t9, t10, t11).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType3[T9, T10, T11], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType3[T9, T10, T11]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t12.application(context), ArticleXyyTuplePlus22.hlistPlus12)
        }
      }
    }
  implicit def xyy13[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), XyyTupleType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), XyyTupleType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        if (context.isReverse) {
          val i1 = ItemTag4.appendEatXyy4(t10, t11, t12, t13).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType4[T10, T11, T12, T13], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType4[T10, T11, T12, T13]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut13)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag4.appendEatXyy4(t9, t10, t11, t12).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType4[T9, T10, T11, T12], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType4[T9, T10, T11, T12]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t13.application(context), ArticleXyyTuplePlus22.hlistPlus13)
        }
      }
    }
  implicit def xyy14[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam, T14 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), XyyTupleType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), XyyTupleType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.isReverse) {
          val i1 = ItemTag5.appendEatXyy5(t10, t11, t12, t13, t14).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType5[T10, T11, T12, T13, T14], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType5[T10, T11, T12, T13, T14]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut14)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag5.appendEatXyy5(t9, t10, t11, t12, t13).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType5[T9, T10, T11, T12, T13], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType5[T9, T10, T11, T12, T13]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t14.application(context), ArticleXyyTuplePlus22.hlistPlus14)
        }
      }
    }
  implicit def xyy15[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam, T14 <: org.scalax.asuna.mapper.TypeParam, T15 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), XyyTupleType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), XyyTupleType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        if (context.isReverse) {
          val i1 = ItemTag6.appendEatXyy6(t10, t11, t12, t13, t14, t15).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType6[T10, T11, T12, T13, T14, T15], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType6[T10, T11, T12, T13, T14, T15]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut15)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag6.appendEatXyy6(t9, t10, t11, t12, t13, t14).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType6[T9, T10, T11, T12, T13, T14], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType6[T9, T10, T11, T12, T13, T14]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t15.application(context), ArticleXyyTuplePlus22.hlistPlus15)
        }
      }
    }
  implicit def xyy16[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam, T14 <: org.scalax.asuna.mapper.TypeParam, T15 <: org.scalax.asuna.mapper.TypeParam, T16 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), XyyTupleType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), XyyTupleType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.isReverse) {
          val i1 = ItemTag7.appendEatXyy7(t10, t11, t12, t13, t14, t15, t16).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType7[T10, T11, T12, T13, T14, T15, T16], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType7[T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut16)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag7.appendEatXyy7(t9, t10, t11, t12, t13, t14, t15).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType7[T9, T10, T11, T12, T13, T14, T15], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType7[T9, T10, T11, T12, T13, T14, T15]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t16.application(context), ArticleXyyTuplePlus22.hlistPlus16)
        }
      }
    }
  implicit def xyy17[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam, T14 <: org.scalax.asuna.mapper.TypeParam, T15 <: org.scalax.asuna.mapper.TypeParam, T16 <: org.scalax.asuna.mapper.TypeParam, T17 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.isReverse) {
          val i1 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i2 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i3 = context.append[EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType2[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          context.append(i3, t1.application(context), ArticleXyyTuplePlus22.hlistPut17)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          context.append(i3, t17.application(context), ArticleXyyTuplePlus22.hlistPlus17)
        }
      }
    }
  implicit def xyy18[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam, T10 <: org.scalax.asuna.mapper.TypeParam, T11 <: org.scalax.asuna.mapper.TypeParam, T12 <: org.scalax.asuna.mapper.TypeParam, T13 <: org.scalax.asuna.mapper.TypeParam, T14 <: org.scalax.asuna.mapper.TypeParam, T15 <: org.scalax.asuna.mapper.TypeParam, T16 <: org.scalax.asuna.mapper.TypeParam, T17 <: org.scalax.asuna.mapper.TypeParam, T18 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        if (context.isReverse) {
          val i1 = ItemTag1.appendEatXyy1(t18).application(context)
          val i2 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[EatXyyType1[T18], EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType1[T18]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType1[T18]
          ], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType3[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType1[T18]
          ]](i4, i3, ArticleXyyPlus3.put3)
          context.append(i5, t1.application(context), ArticleXyyTuplePlus222.hlistPut18)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag1.appendEatXyy1(t17).application(context)
          val i4 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], EatXyyType1[T17], EatXyyType3[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
            EatXyyType1[T17]
          ]](i4, i3, ArticleXyyPlus3.plus3)
          context.append(i5, t18.application(context), ArticleXyyTuplePlus222.hlistPlus18)
        }
      }
    }
  implicit def xyy19[
    K <: org.scalax.asuna.mapper.KindContext,
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
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.isReverse) {
          val i1 = ItemTag2.appendEatXyy2(t18, t19).application(context)
          val i2 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[EatXyyType2[T18, T19], EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType2[T18, T19]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType2[T18, T19]
          ], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType3[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType2[T18, T19]
          ]](i4, i3, ArticleXyyPlus3.put3)
          context.append(i5, t1.application(context), ArticleXyyTuplePlus222.hlistPut19)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag2.appendEatXyy2(t17, t18).application(context)
          val i4 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], EatXyyType2[T17, T18], EatXyyType3[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
            EatXyyType2[T17, T18]
          ]](i4, i3, ArticleXyyPlus3.plus3)
          context.append(i5, t19.application(context), ArticleXyyTuplePlus222.hlistPlus19)
        }
      }
    }
  implicit def xyy20[
    K <: org.scalax.asuna.mapper.KindContext,
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
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam,
    T20 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.Application[K, H20, T20]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        if (context.isReverse) {
          val i1 = ItemTag3.appendEatXyy3(t18, t19, t20).application(context)
          val i2 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[EatXyyType3[T18, T19, T20], EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType3[T18, T19, T20]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType3[T18, T19, T20]
          ], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType3[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType3[T18, T19, T20]
          ]](i4, i3, ArticleXyyPlus3.put3)
          context.append(i5, t1.application(context), ArticleXyyTuplePlus222.hlistPut20)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag3.appendEatXyy3(t17, t18, t19).application(context)
          val i4 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], EatXyyType3[T17, T18, T19], EatXyyType3[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
            EatXyyType3[T17, T18, T19]
          ]](i4, i3, ArticleXyyPlus3.plus3)
          context.append(i5, t20.application(context), ArticleXyyTuplePlus222.hlistPlus20)
        }
      }
    }
  implicit def xyy21[
    K <: org.scalax.asuna.mapper.KindContext,
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
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam,
    T20 <: org.scalax.asuna.mapper.TypeParam,
    T21 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.Application[K, H20, T20],
    t21: org.scalax.asuna.mapper.Application[K, H21, T21]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        if (context.isReverse) {
          val i1 = ItemTag4.appendEatXyy4(t18, t19, t20, t21).application(context)
          val i2 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[EatXyyType4[T18, T19, T20, T21], EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType4[T18, T19, T20, T21]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType4[T18, T19, T20, T21]
          ], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType3[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType4[T18, T19, T20, T21]
          ]](i4, i3, ArticleXyyPlus3.put3)
          context.append(i5, t1.application(context), ArticleXyyTuplePlus222.hlistPut21)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag4.appendEatXyy4(t17, t18, t19, t20).application(context)
          val i4 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], EatXyyType4[T17, T18, T19, T20], EatXyyType3[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
            EatXyyType4[T17, T18, T19, T20]
          ]](i4, i3, ArticleXyyPlus3.plus3)
          context.append(i5, t21.application(context), ArticleXyyTuplePlus222.hlistPlus21)
        }
      }
    }
  implicit def xyy22[
    K <: org.scalax.asuna.mapper.KindContext,
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
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam,
    T20 <: org.scalax.asuna.mapper.TypeParam,
    T21 <: org.scalax.asuna.mapper.TypeParam,
    T22 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.Application[K, H20, T20],
    t21: org.scalax.asuna.mapper.Application[K, H21, T21],
    t22: org.scalax.asuna.mapper.Application[K, H22, T22]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), XyyTupleType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), XyyTupleType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        if (context.isReverse) {
          val i1 = ItemTag5.appendEatXyy5(t18, t19, t20, t21, t22).application(context)
          val i2 = ItemTag8.appendEatXyy8(t10, t11, t12, t13, t14, t15, t16, t17).application(context)
          val i3 = ItemTag8.appendEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context)
          val i4 = context.append[EatXyyType5[T18, T19, T20, T21, T22], EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType5[T18, T19, T20, T21, T22]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPut2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType5[T18, T19, T20, T21, T22]
          ], EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType3[
            EatXyyType8[T2, T3, T4, T5, T6, T7, T8, T9],
            EatXyyType8[T10, T11, T12, T13, T14, T15, T16, T17],
            EatXyyType5[T18, T19, T20, T21, T22]
          ]](i4, i3, ArticleXyyPlus3.put3)
          context.append(i5, t1.application(context), ArticleXyyTuplePlus222.hlistPut22)
        } else {
          val i1 = ItemTag8.appendEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context)
          val i2 = ItemTag8.appendEatXyy8(t9, t10, t11, t12, t13, t14, t15, t16).application(context)
          val i3 = ItemTag5.appendEatXyy5(t17, t18, t19, t20, t21).application(context)
          val i4 = context.append[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ]](i1, i2, org.scalax.asuna.mapper.item.EatXyy2OnlyPlus.hlistPlus2)
          val i5 = context.append[EatXyyType2[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
          ], EatXyyType5[T17, T18, T19, T20, T21], EatXyyType3[
            EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
            EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
            EatXyyType5[T17, T18, T19, T20, T21]
          ]](i4, i3, ArticleXyyPlus3.plus3)
          context.append(i5, t22.application(context), ArticleXyyTuplePlus222.hlistPlus22)
        }
      }
    }
}
object AppendTuple extends AppendTuple
