package org.scalax.asuna.ii.item
trait AppendTuple {
  implicit def xyy1[K <: org.scalax.asuna.mapper.item.KindContext, H1, T1 <: org.scalax.asuna.mapper.item.TypeParam](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.item.Application[K, Tuple1[H1], XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.item.Application[K, Tuple1[H1], XyyTupleType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType1[T1]] = {
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
  implicit def xyy2[K <: org.scalax.asuna.mapper.item.KindContext, H1, H2, T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2), XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2), XyyTupleType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType2[T1, T2]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy1(t2).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut2)
          } else {
            context.append(AppendEatXyy.xyy1(t1).application(context), t2.application(context), ArticleXyyTuplePlus.hlistPlus2)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy1(t2).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put2)
          } else {
            context.append(AppendEatXyy.xyy1(t1).application(context), t2.application(context), ArticleXyyTuplePlus.item2Plus2)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3), XyyTupleType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType3[T1, T2, T3]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy2(t2, t3).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut3)
          } else {
            context.append(AppendEatXyy.xyy2(t1, t2).application(context), t3.application(context), ArticleXyyTuplePlus.hlistPlus3)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy2(t2, t3).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put3)
          } else {
            context.append(AppendEatXyy.xyy2(t1, t2).application(context), t3.application(context), ArticleXyyTuplePlus.item2Plus3)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4), XyyTupleType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType4[T1, T2, T3, T4]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut4)
          } else {
            context.append(AppendEatXyy.xyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyTuplePlus.hlistPlus4)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put4)
          } else {
            context.append(AppendEatXyy.xyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyTuplePlus.item2Plus4)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5), XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType5[T1, T2, T3, T4, T5]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut5)
          } else {
            context.append(AppendEatXyy.xyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyTuplePlus.hlistPlus5)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put5)
          } else {
            context.append(AppendEatXyy.xyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyTuplePlus.item2Plus5)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6), XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut6)
          } else {
            context.append(AppendEatXyy.xyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyTuplePlus.hlistPlus6)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put6)
          } else {
            context.append(AppendEatXyy.xyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyTuplePlus.item2Plus6)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7), XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut7)
          } else {
            context.append(AppendEatXyy.xyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyTuplePlus.hlistPlus7)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy6(t2, t3, t4, t5, t6, t7).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put7)
          } else {
            context.append(AppendEatXyy.xyy6(t1, t2, t3, t4, t5, t6).application(context), t7.application(context), ArticleXyyTuplePlus.item2Plus7)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8), XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut8)
          } else {
            context.append(AppendEatXyy.xyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyTuplePlus.hlistPlus8)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy7(t2, t3, t4, t5, t6, t7, t8).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put8)
          } else {
            context.append(AppendEatXyy.xyy7(t1, t2, t3, t4, t5, t6, t7).application(context), t8.application(context), ArticleXyyTuplePlus.item2Plus8)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9), XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut9)
          } else {
            context.append(AppendEatXyy.xyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context), t9.application(context), ArticleXyyTuplePlus.hlistPlus9)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put9)
          } else {
            context.append(AppendEatXyy.xyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context), t9.application(context), ArticleXyyTuplePlus.item2Plus9)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10), XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy9(t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut10)
          } else {
            context.append(AppendEatXyy.xyy9(t1, t2, t3, t4, t5, t6, t7, t8, t9).application(context), t10.application(context), ArticleXyyTuplePlus.hlistPlus10)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy9(t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put10)
          } else {
            context.append(AppendEatXyy.xyy9(t1, t2, t3, t4, t5, t6, t7, t8, t9).application(context), t10.application(context), ArticleXyyTuplePlus.item2Plus10)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11), XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy10(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context), t1.application(context), ArticleXyyTuplePlus.hlistPut11)
          } else {
            context.append(AppendEatXyy.xyy10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t11.application(context), ArticleXyyTuplePlus.hlistPlus11)
          }
        } else {
          if (context.isReverse) {
            context.append(AppendEatXyy.xyy10(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context), t1.application(context), ArticleXyyTuplePlus.item2Put11)
          } else {
            context.append(AppendEatXyy.xyy10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t11.application(context), ArticleXyyTuplePlus.item2Plus11)
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), XyyTupleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12), XyyTupleType12[
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
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy11(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.hlistPut12
            )
          } else {
            context.append(
              AppendEatXyy.xyy11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context),
              t12.application(context),
              ArticleXyyTuplePlus.hlistPlus12
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy11(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.item2Put12
            )
          } else {
            context.append(
              AppendEatXyy.xyy11(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context),
              t12.application(context),
              ArticleXyyTuplePlus.item2Plus12
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), XyyTupleType13[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13), XyyTupleType13[
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
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy12(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.hlistPut13
            )
          } else {
            context.append(
              AppendEatXyy.xyy12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context),
              t13.application(context),
              ArticleXyyTuplePlus.hlistPlus13
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy12(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.item2Put13
            )
          } else {
            context.append(
              AppendEatXyy.xyy12(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12).application(context),
              t13.application(context),
              ArticleXyyTuplePlus.item2Plus13
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), XyyTupleType14[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14), XyyTupleType14[
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
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[XyyTupleType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy13(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.hlistPut14
            )
          } else {
            context.append(
              AppendEatXyy.xyy13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
              t14.application(context),
              ArticleXyyTuplePlus.hlistPlus14
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy13(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.item2Put14
            )
          } else {
            context.append(
              AppendEatXyy.xyy13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
              t14.application(context),
              ArticleXyyTuplePlus.item2Plus14
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), XyyTupleType15[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15), XyyTupleType15[
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
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy14(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.hlistPut15
            )
          } else {
            context.append(
              AppendEatXyy.xyy14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
              t15.application(context),
              ArticleXyyTuplePlus.hlistPlus15
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy14(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.item2Put15
            )
          } else {
            context.append(
              AppendEatXyy.xyy14(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
              t15.application(context),
              ArticleXyyTuplePlus.item2Plus15
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), XyyTupleType16[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16), XyyTupleType16[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy15(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.hlistPut16
            )
          } else {
            context.append(
              AppendEatXyy.xyy15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context),
              t16.application(context),
              ArticleXyyTuplePlus.hlistPlus16
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
              AppendEatXyy.xyy15(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context),
              t1.application(context),
              ArticleXyyTuplePlus.item2Put16
            )
          } else {
            context.append(
              AppendEatXyy.xyy15(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15).application(context),
              t16.application(context),
              ArticleXyyTuplePlus.item2Plus16
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), XyyTupleType17[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17), XyyTupleType17[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy16(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut17
            )
          } else {
            context.append(
                AppendEatXyy.xyy16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context)
              , t17.application(context)
              , ArticleXyyTuplePlus.hlistPlus17
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy16(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put17
            )
          } else {
            context.append(
                AppendEatXyy.xyy16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context)
              , t17.application(context)
              , ArticleXyyTuplePlus.item2Plus17
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), XyyTupleType18[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18), XyyTupleType18[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy17(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut18
            )
          } else {
            context.append(
                AppendEatXyy.xyy17(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context)
              , t18.application(context)
              , ArticleXyyTuplePlus.hlistPlus18
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy17(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put18
            )
          } else {
            context.append(
                AppendEatXyy.xyy17(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context)
              , t18.application(context)
              , ArticleXyyTuplePlus.item2Plus18
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), XyyTupleType19[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19), XyyTupleType19[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy18(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut19
            )
          } else {
            context.append(
                AppendEatXyy.xyy18(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context)
              , t19.application(context)
              , ArticleXyyTuplePlus.hlistPlus19
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy18(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put19
            )
          } else {
            context.append(
                AppendEatXyy.xyy18(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18).application(context)
              , t19.application(context)
              , ArticleXyyTuplePlus.item2Plus19
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), XyyTupleType20[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20), XyyTupleType20[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy19(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut20
            )
          } else {
            context.append(
                AppendEatXyy.xyy19(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context)
              , t20.application(context)
              , ArticleXyyTuplePlus.hlistPlus20
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy19(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put20
            )
          } else {
            context.append(
                AppendEatXyy.xyy19(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19).application(context)
              , t20.application(context)
              , ArticleXyyTuplePlus.item2Plus20
            )
          }
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
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), XyyTupleType21[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21), XyyTupleType21[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy20(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut21
            )
          } else {
            context.append(
                AppendEatXyy.xyy20(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context)
              , t21.application(context)
              , ArticleXyyTuplePlus.hlistPlus21
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy20(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put21
            )
          } else {
            context.append(
                AppendEatXyy.xyy20(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20).application(context)
              , t21.application(context)
              , ArticleXyyTuplePlus.item2Plus21
            )
          }
        }
      }
    }
  implicit def xyy22[
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
    H22,
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
    T21 <: org.scalax.asuna.mapper.item.TypeParam,
    T22 <: org.scalax.asuna.mapper.item.TypeParam
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
    t21: org.scalax.asuna.mapper.item.Application[K, H21, T21],
    t22: org.scalax.asuna.mapper.item.Application[K, H22, T22]
  ): org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), XyyTupleType22[
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
    new org.scalax.asuna.mapper.item.Application[K, (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22), XyyTupleType22[
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
    ]] {
      override def application(
        context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[XyyTupleType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy21(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.hlistPut22
            )
          } else {
            context.append(
                AppendEatXyy.xyy21(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context)
              , t22.application(context)
              , ArticleXyyTuplePlus.hlistPlus22
            )
          }
        } else {
          if (context.isReverse) {
            context.append(
                AppendEatXyy.xyy21(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22).application(context)
              , t1.application(context)
              , ArticleXyyTuplePlus.item2Put22
            )
          } else {
            context.append(
                AppendEatXyy.xyy21(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context)
              , t22.application(context)
              , ArticleXyyTuplePlus.item2Plus22
            )
          }
        }
      }
    }
}
object AppendTuple extends AppendTuple
