package asuna.tuple
import asuna._
trait ScalaTupleTypeHListPlus3 {
  def hlistPlus18[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[T17]],
    T18,
    ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[T17]],
      T18,
      ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def plus(
        p: AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple1[
          T17#H
        ]],
        item: T18#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H)): T18#H = t._18
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H)): AsunaTuple3[
        AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
        AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        AsunaTuple1[T17#H]
      ] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(
            HListTuple0
              .add(t._9)
              .add(t._10)
              .add(t._11)
              .add(t._12)
              .add(t._13)
              .add(t._14)
              .add(t._15)
              .add(t._16): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .add(HListTuple0.add(t._17): AsunaTuple1[T17#H])
      override def sub: Plus[TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[
        T17
      ]]#T, T18#T, ScalaTupleTypeHList18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T] =
        hlistPlus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPut18[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[T17]],
    T18,
    ScalaTupleTypeHList18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[T17]],
      T18,
      ScalaTupleTypeHList18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def plus(
        p: AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple1[
          T17#H
        ]],
        item: T18#H
      ): (T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, p.i3.i1)
      override def takeTail(t: (T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H)): T18#H = t._1
      override def takeHead(t: (T18#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H)): AsunaTuple3[
        AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
        AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        AsunaTuple1[T17#H]
      ] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._18): AsunaTuple1[T17#H])
          .pull(
            ReverseHListTuple0
              .pull(t._17)
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pull(
            ReverseHListTuple0
              .pull(t._9)
              .pull(t._8)
              .pull(t._7)
              .pull(t._6)
              .pull(t._5)
              .pull(t._4)
              .pull(t._3)
              .pull(t._2): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: Plus[TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList1[
        T17
      ]]#T, T18#T, ScalaTupleTypeHList18[T18, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T] =
        hlistPut18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def hlistPlus19[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]],
    T19,
    ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]],
      T19,
      ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple2[T17#H, T18#H]
        ],
        item: T19#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H) =
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
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H)): T19#H =
        t._19
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple2[
        T17#H,
        T18#H
      ]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(
            HListTuple0
              .add(t._9)
              .add(t._10)
              .add(t._11)
              .add(t._12)
              .add(t._13)
              .add(t._14)
              .add(t._15)
              .add(t._16): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .add(HListTuple0.add(t._17).add(t._18): AsunaTuple2[T17#H, T18#H])
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]]#T,
        T19#T,
        ScalaTupleTypeHList19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T
      ] = hlistPlus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPut19[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]],
    T19,
    ScalaTupleTypeHList19[T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]],
      T19,
      ScalaTupleTypeHList19[T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple2[T17#H, T18#H]
        ],
        item: T19#H
      ): (T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H) =
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
      override def takeTail(t: (T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H)): T19#H = t._1
      override def takeHead(
        t: (T19#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple2[
        T17#H,
        T18#H
      ]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._19).pull(t._18): AsunaTuple2[T17#H, T18#H])
          .pull(
            ReverseHListTuple0
              .pull(t._17)
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pull(
            ReverseHListTuple0
              .pull(t._9)
              .pull(t._8)
              .pull(t._7)
              .pull(t._6)
              .pull(t._5)
              .pull(t._4)
              .pull(t._3)
              .pull(t._2): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList2[T17, T18]]#T,
        T19#T,
        ScalaTupleTypeHList19[T19, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T
      ] = hlistPut19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def hlistPlus20[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]],
    T20,
    ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]],
      T20,
      ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple3[T17#H, T18#H, T19#H]
        ],
        item: T20#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H) =
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
      override def takeTail(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H)
      ): T20#H = t._20
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple3[
        T17#H,
        T18#H,
        T19#H
      ]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(
            HListTuple0
              .add(t._9)
              .add(t._10)
              .add(t._11)
              .add(t._12)
              .add(t._13)
              .add(t._14)
              .add(t._15)
              .add(t._16): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .add(HListTuple0.add(t._17).add(t._18).add(t._19): AsunaTuple3[T17#H, T18#H, T19#H])
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]]#T,
        T20#T,
        ScalaTupleTypeHList20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T
      ] = hlistPlus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPut20[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]],
    T20,
    ScalaTupleTypeHList20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]],
      T20,
      ScalaTupleTypeHList20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple3[T17#H, T18#H, T19#H]
        ],
        item: T20#H
      ): (T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H) =
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
      override def takeTail(
        t: (T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H)
      ): T20#H = t._1
      override def takeHead(
        t: (T20#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple3[
        T17#H,
        T18#H,
        T19#H
      ]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._20).pull(t._19).pull(t._18): AsunaTuple3[T17#H, T18#H, T19#H])
          .pull(
            ReverseHListTuple0
              .pull(t._17)
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pull(
            ReverseHListTuple0
              .pull(t._9)
              .pull(t._8)
              .pull(t._7)
              .pull(t._6)
              .pull(t._5)
              .pull(t._4)
              .pull(t._3)
              .pull(t._2): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList3[T17, T18, T19]]#T,
        T20#T,
        ScalaTupleTypeHList20[T20, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T
      ] = hlistPut20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def hlistPlus21[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]],
    T21,
    ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]],
      T21,
      ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple4[T17#H, T18#H, T19#H, T20#H]
        ],
        item: T21#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H) =
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
      override def takeTail(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H)
      ): T21#H = t._21
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple4[
        T17#H,
        T18#H,
        T19#H,
        T20#H
      ]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(
            HListTuple0
              .add(t._9)
              .add(t._10)
              .add(t._11)
              .add(t._12)
              .add(t._13)
              .add(t._14)
              .add(t._15)
              .add(t._16): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .add(HListTuple0.add(t._17).add(t._18).add(t._19).add(t._20): AsunaTuple4[T17#H, T18#H, T19#H, T20#H])
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]]#T,
        T21#T,
        ScalaTupleTypeHList21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T
      ] = hlistPlus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def hlistPut21[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]],
    T21,
    ScalaTupleTypeHList21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]],
      T21,
      ScalaTupleTypeHList21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple4[T17#H, T18#H, T19#H, T20#H]
        ],
        item: T21#H
      ): (T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H) =
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
      override def takeTail(
        t: (T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H)
      ): T21#H = t._1
      override def takeHead(
        t: (T21#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple4[
        T17#H,
        T18#H,
        T19#H,
        T20#H
      ]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._21).pull(t._20).pull(t._19).pull(t._18): AsunaTuple4[T17#H, T18#H, T19#H, T20#H])
          .pull(
            ReverseHListTuple0
              .pull(t._17)
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pull(
            ReverseHListTuple0
              .pull(t._9)
              .pull(t._8)
              .pull(t._7)
              .pull(t._6)
              .pull(t._5)
              .pull(t._4)
              .pull(t._3)
              .pull(t._2): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: Plus[
        TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList4[T17, T18, T19, T20]]#T,
        T21#T,
        ScalaTupleTypeHList21[T21, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T
      ] = hlistPut21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def hlistPlus22[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList5[T17, T18, T19, T20, T21]],
    T22,
    ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList5[T17, T18, T19, T20, T21]],
      T22,
      ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple5[T17#H, T18#H, T19#H, T20#H, T21#H]
        ],
        item: T22#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H) =
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
          p.i3.i5,
          item
        )
      override def takeTail(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H)
      ): T22#H = t._22
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H, T22#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple5[
        T17#H,
        T18#H,
        T19#H,
        T20#H,
        T21#H
      ]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(
            HListTuple0
              .add(t._9)
              .add(t._10)
              .add(t._11)
              .add(t._12)
              .add(t._13)
              .add(t._14)
              .add(t._15)
              .add(t._16): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .add(HListTuple0.add(t._17).add(t._18).add(t._19).add(t._20).add(t._21): AsunaTuple5[T17#H, T18#H, T19#H, T20#H, T21#H])
      override def sub: Plus[TupleTypeHList3[
        TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
        TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
        TupleTypeHList5[T17, T18, T19, T20, T21]
      ]#T, T22#T, ScalaTupleTypeHList22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]#T] =
        hlistPlus22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
  def hlistPut22[
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
  ]: Plus[
    TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList5[T17, T18, T19, T20, T21]],
    T22,
    ScalaTupleTypeHList22[T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  ] =
    new Plus[
      TupleTypeHList3[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16], TupleTypeHList5[T17, T18, T19, T20, T21]],
      T22,
      ScalaTupleTypeHList22[T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
    ] {
      override def plus(
        p: AsunaTuple3[
          AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H],
          AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
          AsunaTuple5[T17#H, T18#H, T19#H, T20#H, T21#H]
        ],
        item: T22#H
      ): (T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H) =
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
          p.i3.i4,
          p.i3.i5
        )
      override def takeTail(
        t: (T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H)
      ): T22#H = t._1
      override def takeHead(
        t: (T22#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H)
      ): AsunaTuple3[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H], AsunaTuple5[
        T17#H,
        T18#H,
        T19#H,
        T20#H,
        T21#H
      ]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._22).pull(t._21).pull(t._20).pull(t._19).pull(t._18): AsunaTuple5[T17#H, T18#H, T19#H, T20#H, T21#H])
          .pull(
            ReverseHListTuple0
              .pull(t._17)
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
          )
          .pull(
            ReverseHListTuple0
              .pull(t._9)
              .pull(t._8)
              .pull(t._7)
              .pull(t._6)
              .pull(t._5)
              .pull(t._4)
              .pull(t._3)
              .pull(t._2): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]
          )
      override def sub: Plus[TupleTypeHList3[
        TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8],
        TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16],
        TupleTypeHList5[T17, T18, T19, T20, T21]
      ]#T, T22#T, ScalaTupleTypeHList22[T22, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]#T] =
        hlistPut22[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T, T22#T]
    }
}
object ScalaTupleTypeHListPlus3 extends ScalaTupleTypeHListPlus3
