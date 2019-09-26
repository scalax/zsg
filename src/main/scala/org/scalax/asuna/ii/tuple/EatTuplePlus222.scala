package org.scalax.asuna.mapper.item
object ArticleXyyTuplePlus222 {
  def hlistPlus18[
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
    T18 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]],
        item: T18#H
      ): Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1, item)
      override def takeHead(t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]): T18#H =
        t._18
      override def takeTail(
        t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            HListItem0
              .eat(t._9)
              .eat(t._10)
              .eat(t._11)
              .eat(t._12)
              .eat(t._13)
              .eat(t._14)
              .eat(t._15)
              .eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(HListItem0.eat(t._17): Item1[T17#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType1[T17]
      ]#T, T18#T, XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T] =
        hlistPlus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPut18[
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
    T18 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
    T18,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
      T18,
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]],
        item: T18#H
      ): Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1)
      override def takeHead(t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T18#H = t._1
      override def takeTail(
        t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._18): Item1[T17#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType1[T17]
      ]#T, T18#T, XyyTupleType18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T] =
        hlistPut18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def item2Plus18[
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
    T18 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]],
        item: T18#H
      ): Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1, item)
      override def takeHead(t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]): T18#H =
        t._18
      override def takeTail(
        t: Tuple18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(TreeItem0.eat(t._17): Item1[T17#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType1[T17]
      ]#T, T18#T, XyyTupleType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T] =
        item2Plus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def item2Put18[
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
    T18 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
    T18,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType1[T17]], T18, XyyTupleType18[
      T18,
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]],
        item: T18#H
      ): Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1)
      override def takeHead(t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T18#H = t._1
      override def takeTail(
        t: Tuple18[T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item1[T17#H]] =
        ReverseTreeItem0
          .pudao(ReverseHListItem0.pudao(t._18): Item1[T17#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType1[T17]
      ]#T, T18#T, XyyTupleType18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T] =
        item2Put18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPlus19[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]],
        item: T19#H
      ): Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          item
        )
      override def takeHead(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T19#H = t._19
      override def takeTail(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            HListItem0
              .eat(t._9)
              .eat(t._10)
              .eat(t._11)
              .eat(t._12)
              .eat(t._13)
              .eat(t._14)
              .eat(t._15)
              .eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(HListItem0.eat(t._17).eat(t._18): Item2[T17#H, T18#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType2[T17, T18]
      ]#T, T19#T, XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T] =
        hlistPlus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPut19[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
    T19,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
      T19,
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]],
        item: T19#H
      ): Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2
        )
      override def takeHead(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): T19#H = t._1
      override def takeTail(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._19).pudao(t._18): Item2[T17#H, T18#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType2[T17, T18]
      ]#T, T19#T, XyyTupleType19[T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T] =
        hlistPut19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def item2Plus19[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]],
        item: T19#H
      ): Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          item
        )
      override def takeHead(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T19#H = t._19
      override def takeTail(
        t: Tuple19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(TreeItem0.eat(t._17).eat(t._18): Item2[T17#H, T18#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType2[T17, T18]
      ]#T, T19#T, XyyTupleType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T] =
        item2Plus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def item2Put19[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
    T19,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType3[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType2[T17, T18]], T19, XyyTupleType19[
      T19,
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
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]],
        item: T19#H
      ): Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2
        )
      override def takeHead(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): T19#H = t._1
      override def takeTail(
        t: Tuple19[T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item2[T17#H, T18#H]] =
        ReverseTreeItem0
          .pudao(ReverseHListItem0.pudao(t._19).pudao(t._18): Item2[T17#H, T18#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType2[T17, T18]
      ]#T, T19#T, XyyTupleType19[T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T] =
        item2Put19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPlus20[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType3[T17, T18, T19]
  ], T20, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType3[T17, T18, T19]
    ], T20, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]],
        item: T20#H
      ): Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          item
        )
      override def takeHead(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T20#H = t._20
      override def takeTail(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            HListItem0
              .eat(t._9)
              .eat(t._10)
              .eat(t._11)
              .eat(t._12)
              .eat(t._13)
              .eat(t._14)
              .eat(t._15)
              .eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(HListItem0.eat(t._17).eat(t._18).eat(t._19): Item3[T17#H, T18#H, T19#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType3[T17, T18, T19]
      ]#T, T20#T, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T] =
        hlistPlus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPut20[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType3[T17, T18, T19]
  ], T20, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType3[T17, T18, T19]
    ], T20, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]],
        item: T20#H
      ): Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3
        )
      override def takeHead(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T20#H = t._1
      override def takeTail(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._20).pudao(t._19).pudao(t._18): Item3[T17#H, T18#H, T19#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType3[T17, T18, T19]
      ]#T, T20#T, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T] =
        hlistPut20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def item2Plus20[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType3[T17, T18, T19]
  ], T20, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType3[T17, T18, T19]
    ], T20, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]],
        item: T20#H
      ): Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          item
        )
      override def takeHead(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T20#H = t._20
      override def takeTail(
        t: Tuple20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(TreeItem0.eat(t._17).eat(t._18).eat(t._19): Item3[T17#H, T18#H, T19#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType3[T17, T18, T19]
      ]#T, T20#T, XyyTupleType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T] =
        item2Plus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def item2Put20[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType3[T17, T18, T19]
  ], T20, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType3[T17, T18, T19]
    ], T20, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]],
        item: T20#H
      ): Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3
        )
      override def takeHead(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): T20#H = t._1
      override def takeTail(
        t: Tuple20[T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item3[T17#H, T18#H, T19#H]] =
        ReverseTreeItem0
          .pudao(ReverseHListItem0.pudao(t._20).pudao(t._19).pudao(t._18): Item3[T17#H, T18#H, T19#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType3[T17, T18, T19]
      ]#T, T20#T, XyyTupleType20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T] =
        item2Put20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPlus21[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType4[T17, T18, T19, T20]
  ], T21, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType4[T17, T18, T19, T20]
    ], T21, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]],
        item: T21#H
      ): Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          p.i3.i4,
          item
        )
      override def takeHead(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T21#H = t._21
      override def takeTail(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]] =
        HListItem0
          .eat(HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            HListItem0
              .eat(t._9)
              .eat(t._10)
              .eat(t._11)
              .eat(t._12)
              .eat(t._13)
              .eat(t._14)
              .eat(t._15)
              .eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(HListItem0.eat(t._17).eat(t._18).eat(t._19).eat(t._20): Item4[T17#H, T18#H, T19#H, T20#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType4[T17, T18, T19, T20]
      ]#T, T21#T, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T] =
        hlistPlus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def hlistPut21[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType4[T17, T18, T19, T20]
  ], T21, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType4[T17, T18, T19, T20]
    ], T21, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]],
        item: T21#H
      ): Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          p.i3.i4
        )
      override def takeHead(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T21#H = t._1
      override def takeTail(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]] =
        ReverseHListItem0
          .pudao(ReverseHListItem0.pudao(t._21).pudao(t._20).pudao(t._19).pudao(t._18): Item4[T17#H, T18#H, T19#H, T20#H])
          .pudao(
            ReverseHListItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseHListItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType4[T17, T18, T19, T20]
      ]#T, T21#T, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T] =
        hlistPut21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def item2Plus21[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType4[T17, T18, T19, T20]
  ], T21, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType4[T17, T18, T19, T20]
    ], T21, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]],
        item: T21#H
      ): Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        (
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          p.i3.i4,
          item
        )
      override def takeHead(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): T21#H = t._21
      override def takeTail(
        t: Tuple21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .eat(TreeItem0.eat(t._17).eat(t._18).eat(t._19).eat(t._20): Item4[T17#H, T18#H, T19#H, T20#H])
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType4[T17, T18, T19, T20]
      ]#T, T21#T, XyyTupleType21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T] =
        item2Plus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def item2Put21[
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
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[
    EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
    EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
    EatXyyType4[T17, T18, T19, T20]
  ], T21, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[
      EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
      EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
      EatXyyType4[T17, T18, T19, T20]
    ], T21, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]] {
      override def plus(
        p: Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]],
        item: T21#H
      ): Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] =
        (
          item,
          p.i1.i1,
          p.i1.i2,
          p.i1.i3,
          p.i1.i4,
          p.i1.i5,
          p.i1.i6,
          p.i1.i7,
          p.i1.i8,
          p.i2.i1,
          p.i2.i2,
          p.i2.i3,
          p.i2.i4,
          p.i2.i5,
          p.i2.i6,
          p.i2.i7,
          p.i2.i8,
          p.i3.i1,
          p.i3.i2,
          p.i3.i3,
          p.i3.i4
        )
      override def takeHead(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): T21#H = t._1
      override def takeTail(
        t: Tuple21[T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H]
      ): Item3[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], Item4[T17#H, T18#H, T19#H, T20#H]] =
        ReverseTreeItem0
          .pudao(ReverseHListItem0.pudao(t._21).pudao(t._20).pudao(t._19).pudao(t._18): Item4[T17#H, T18#H, T19#H, T20#H])
          .pudao(
            ReverseTreeItem0
              .pudao(t._17)
              .pudao(t._16)
              .pudao(t._15)
              .pudao(t._14)
              .pudao(t._13)
              .pudao(t._12)
              .pudao(t._11)
              .pudao(t._10): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pudao(
            ReverseTreeItem0
              .pudao(t._9)
              .pudao(t._8)
              .pudao(t._7)
              .pudao(t._6)
              .pudao(t._5)
              .pudao(t._4)
              .pudao(t._3)
              .pudao(t._2): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16],
        EatXyyType4[T17, T18, T19, T20]
      ]#T, T21#T, XyyTupleType21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T] =
        item2Put21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
}
