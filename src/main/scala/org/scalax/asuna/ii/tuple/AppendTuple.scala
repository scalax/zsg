package org.scalax.asuna.mapper.item
trait AppendTuple {
  implicit def xyy1[K <: org.scalax.asuna.mapper.KindContext, H1, T1 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.Application[K, Tuple1[H1], XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.Application[K, Tuple1[H1], XyyTupleType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType1[T1]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyTuplePlus.hlistPut1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyTuplePlus.hlistPlus1)
          }
        } else {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyTuplePlus.item2Put1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyTuplePlus.item2Plus1)
          }
        }
      }
    }
  implicit def xyy2[K <: org.scalax.asuna.mapper.KindContext, H1, H2, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2), XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2), XyyTupleType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType2[T1, T2]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut2)
          } else {
            context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyTuplePlus.hlistPlus2)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put2)
          } else {
            context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyTuplePlus.item2Plus2)
          }
        }
      }
    }
  implicit def xyy3[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType3[T1, T2, T3]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag2.appendEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut3)
          } else {
            context.append(ItemTag2.appendEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyTuplePlus.hlistPlus3)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag2.appendEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put3)
          } else {
            context.append(ItemTag2.appendEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyTuplePlus.item2Plus3)
          }
        }
      }
    }
  implicit def xyy4[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType4[T1, T2, T3, T4]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag3.appendEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut4)
          } else {
            context.append(ItemTag3.appendEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyTuplePlus.hlistPlus4)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag3.appendEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put4)
          } else {
            context.append(ItemTag3.appendEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyTuplePlus.item2Plus4)
          }
        }
      }
    }
  implicit def xyy5[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType5[T1, T2, T3, T4, T5]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag4.appendEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut5)
          } else {
            context.append(ItemTag4.appendEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyTuplePlus.hlistPlus5)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag4.appendEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put5)
          } else {
            context.append(ItemTag4.appendEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyTuplePlus.item2Plus5)
          }
        }
      }
    }
  implicit def xyy6[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag5.appendEatXyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut6)
          } else {
            context.append(ItemTag5.appendEatXyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyTuplePlus.hlistPlus6)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag5.appendEatXyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put6)
          } else {
            context.append(ItemTag5.appendEatXyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyTuplePlus.item2Plus6)
          }
        }
      }
    }
  implicit def xyy7[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag6.appendEatXyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut7)
          } else {
            context.append(ItemTag6.appendEatXyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyTuplePlus.hlistPlus7)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag6.appendEatXyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put7)
          } else {
            context.append(ItemTag6.appendEatXyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyTuplePlus.item2Plus7)
          }
        }
      }
    }
  implicit def xyy8[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8]
  ): org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(ItemTag7.appendEatXyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut8)
          } else {
            context.append(ItemTag7.appendEatXyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyTuplePlus.hlistPlus8)
          }
        } else {
          if (context.isReverse) {
            context.append(ItemTag7.appendEatXyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put8)
          } else {
            context.append(ItemTag7.appendEatXyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyTuplePlus.item2Plus8)
          }
        }
      }
    }
}
object AppendTuple extends AppendTuple
