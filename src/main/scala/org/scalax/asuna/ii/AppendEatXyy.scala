package org.scalax.asuna.ii.item
trait AppendEatXyy {
  implicit def xyy0[K <: org.scalax.asuna.mapper.item.KindContext]: org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem0, EatXyyType0] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem0, EatXyyType0] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType0] = context.start
    }
  implicit def xyy1[K <: org.scalax.asuna.mapper.item.KindContext, H1, T1 <: org.scalax.asuna.mapper.item.TypeParam](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem1[H1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem1[H1], EatXyyType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType1[T1]] = {
        if (context.useHList) {
          if (context.reverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPut1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPlus1)
          }
        } else {
          if (context.reverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Put1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Plus1)
          }
        }
      }
    }
  implicit def xyy2[K <: org.scalax.asuna.mapper.item.KindContext, H1, H2, T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem2[H1, H2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem2[H1, H2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.reverse) {
          context.append(xyy1(t2).application(context), t1.application(context), ArticleXyyPlus.put2)
        } else {
          context.append(xyy1(t1).application(context), t2.application(context), ArticleXyyPlus.plus2)
        }
      }
    }
  implicit def xyy3[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem3[H1, H2, H3], EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem3[H1, H2, H3], EatXyyType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.reverse) {
          context.append(xyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus.put3)
        } else {
          context.append(xyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus.plus3)
        }
      }
    }
  implicit def xyy4[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType4[T1, T2, T3, T4]] = {
        if (context.reverse) {
          context.append(xyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyPlus.put4)
        } else {
          context.append(xyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyPlus.plus4)
        }
      }
    }
  implicit def xyy5[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType5[T1, T2, T3, T4, T5]] = {
        if (context.reverse) {
          context.append(xyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyPlus.put5)
        } else {
          context.append(xyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyPlus.plus5)
        }
      }
    }
  implicit def xyy6[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.reverse) {
          context.append(xyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyPlus.put6)
        } else {
          context.append(xyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyPlus.plus6)
        }
      }
    }
  implicit def xyy7[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem7[H1, H2, H3, H4, H5, H6, H7], EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem7[H1, H2, H3, H4, H5, H6, H7], EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.reverse) {
          context.append(xyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyPlus.put7)
        } else {
          context.append(xyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyPlus.plus7)
        }
      }
    }
  implicit def xyy8[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem8[H1, H2, H3, H4, H5, H6, H7, H8], EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem8[H1, H2, H3, H4, H5, H6, H7, H8], EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.reverse) {
          context.append(xyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyPlus.put8)
        } else {
          context.append(xyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyPlus.plus8)
        }
      }
    }
  implicit def xyy9[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem9[H1, H2, H3, H4, H5, H6, H7, H8, H9], EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem9[H1, H2, H3, H4, H5, H6, H7, H8, H9], EatXyyType9[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.reverse) {
          context.append(xyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context), t1.application(context), ArticleXyyPlus.put9)
        } else {
          context.append(xyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context), t9.application(context), ArticleXyyPlus.plus9)
        }
      }
    }
  implicit def xyy10[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], EatXyyType10[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], EatXyyType10[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.reverse) {
          context.append(xyy9(t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t1.application(context), ArticleXyyPlus.put10)
        } else {
          context.append(xyy9(t1, t2, t3, t4, t5, t6, t7, t8, t9).application(context), t10.application(context), ArticleXyyPlus.plus10)
        }
      }
    }
  implicit def xyy11[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], EatXyyType11[
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
    T11
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], EatXyyType11[
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
      T11
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.reverse) {
          context.append(xyy10(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context), t1.application(context), ArticleXyyPlus.put11)
        } else {
          context.append(xyy10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t11.application(context), ArticleXyyPlus.plus11)
        }
      }
    }
  implicit def xyy12[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], EatXyyType12[
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
    T12
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem12[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12], EatXyyType12[
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
      T12
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        if (context.reverse) {
          context.append(xyy11(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context), t1.application(context), ArticleXyyPlus.put12)
        } else {
          context.append(xyy11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context), t12.application(context), ArticleXyyPlus.plus12)
        }
      }
    }
  implicit def xyy13[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], EatXyyType13[
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
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem13[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13], EatXyyType13[
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
      T13
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        if (context.reverse) {
          context.append(xyy12(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context), t1.application(context), ArticleXyyPlus.put13)
        } else {
          context.append(xyy12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context), t13.application(context), ArticleXyyPlus.plus13)
        }
      }
    }
  implicit def xyy14[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], EatXyyType14[
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
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem14[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14], EatXyyType14[
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
      T14
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.reverse) {
          context.append(xyy13(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context), t1.application(context), ArticleXyyPlus.put14)
        } else {
          context.append(xyy13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context), t14.application(context), ArticleXyyPlus.plus14)
        }
      }
    }
  implicit def xyy15[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], EatXyyType15[
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
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem15[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15], EatXyyType15[
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
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        if (context.reverse) {
          context.append(xyy14(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context), t1.application(context), ArticleXyyPlus.put15)
        } else {
          context.append(xyy14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context), t15.application(context), ArticleXyyPlus.plus15)
        }
      }
    }
  implicit def xyy16[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16], EatXyyType16[
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
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem16[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16],
      EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.reverse) {
          context.append(xyy15(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context), t1.application(context), ArticleXyyPlus.put16)
        } else {
          context.append(xyy15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context), t16.application(context), ArticleXyyPlus.plus16)
        }
      }
    }
  implicit def xyy17[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.item.Application[K, H17, T17]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], EatXyyType17[
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
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17],
      EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.reverse) {
          context.append(
            xyy16(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context),
            t1.application(context),
            ArticleXyyPlus.put17
          )
        } else {
          context.append(
            xyy16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context),
            t17.application(context),
            ArticleXyyPlus.plus17
          )
        }
      }
    }
  implicit def xyy18[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.item.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.item.Application[K, H18, T18]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18], EatXyyType18[
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
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem18[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18],
      EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        if (context.reverse) {
          context.append(
            xyy17(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context),
            t1.application(context),
            ArticleXyyPlus.put18
          )
        } else {
          context.append(
            xyy17(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context),
            t18.application(context),
            ArticleXyyPlus.plus18
          )
        }
      }
    }
  implicit def xyy19[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.item.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.item.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.item.Application[K, H19, T19]
  )
    : org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem19[
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
      H19
    ], EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem19[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19],
      EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.reverse) {
          context.append(
            xyy18(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context),
            t1.application(context),
            ArticleXyyPlus.put19
          )
        } else {
          context.append(
            xyy18(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context),
            t19.application(context),
            ArticleXyyPlus.plus19
          )
        }
      }
    }
  implicit def xyy20[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.item.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.item.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.item.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.item.Application[K, H20, T20]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem20[
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
    H20
  ], EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem20[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20],
      EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        if (context.reverse) {
          context.append(
            xyy19(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context),
            t1.application(context),
            ArticleXyyPlus.put20
          )
        } else {
          context.append(
            xyy19(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context),
            t20.application(context),
            ArticleXyyPlus.plus20
          )
        }
      }
    }
  implicit def xyy21[
    K <: org.scalax.asuna.mapper.item.KindContext,
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
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.item.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.item.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.item.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.item.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.item.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.item.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.item.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.item.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.item.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.item.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.item.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.item.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.item.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.item.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.item.Application[K, H20, T20],
    t21: org.scalax.asuna.mapper.item.Application[K, H21, T21]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.XyyItem21[
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
    H21
  ], EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new org.scalax.asuna.mapper.item.Application[
      K,
      org.scalax.asuna.ii.item.XyyItem21[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21],
      EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        if (context.reverse) {
          context.append(
            xyy20(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context),
            t1.application(context),
            ArticleXyyPlus.put21
          )
        } else {
          context.append(
            xyy20(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context),
            t21.application(context),
            ArticleXyyPlus.plus21
          )
        }
      }
    }
}
