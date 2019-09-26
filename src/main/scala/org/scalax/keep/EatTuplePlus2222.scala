package org.scalax.asuna.mapper.item
object ArticleXyyTuplePlus2222 {
  def hlistPlus17[
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
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
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
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H =
        t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
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
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
      ]#T, T17#T, XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T] =
        hlistPlus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def hlistPut17[
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
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T17,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T17,
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
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        ReverseHListItem0
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
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
      ]#T, T17#T, XyyTupleType17[T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T] =
        hlistPut17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Plus17[
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
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
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
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
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
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, item)
      override def takeHead(t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]): T17#H =
        t._17
      override def takeTail(
        t: Tuple17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        TreeItem0
          .eat(TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .eat(
            TreeItem0.eat(t._9).eat(t._10).eat(t._11).eat(t._12).eat(t._13).eat(t._14).eat(t._15).eat(t._16): Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
      ]#T, T17#T, XyyTupleType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T] =
        item2Plus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def item2Put17[
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
    T17 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
    T17,
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
    new org.scalax.asuna.mapper.Plus[EatXyyType2[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, XyyTupleType17[
      T17,
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
      override def plus(
        p: Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8)
      override def takeHead(t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T17#H = t._1
      override def takeTail(
        t: Tuple17[T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): Item2[Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], Item8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        ReverseTreeItem0
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
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[
        EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8],
        EatXyyType8[T9, T10, T11, T12, T13, T14, T15, T16]
      ]#T, T17#T, XyyTupleType17[T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T] =
        item2Put17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }

}
