package asuna.tuple
import asuna._
trait ScalaTupleTypeHListPlus2 {
  def hlistPlus10[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]], T10, ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]], T10, ScalaTupleTypeHList10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple1[T9#H]],
        item: T10#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H)): T10#H = t._10
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple1[T9#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9): AsunaTuple1[T9#H])
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]]#T, T10#T, ScalaTupleTypeHList10[
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
      ]#T] = hlistPlus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPut10[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]], T10, ScalaTupleTypeHList10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]], T10, ScalaTupleTypeHList10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple1[T9#H]],
        item: T10#H
      ): (T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1)
      override def takeTail(t: (T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): T10#H = t._1
      override def takeHead(
        t: (T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple1[T9#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._10): AsunaTuple1[T9#H])
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
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList1[T9]]#T, T10#T, ScalaTupleTypeHList10[
        T10,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9
      ]#T] = hlistPut10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def hlistPlus11[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]], T11, ScalaTupleTypeHList11[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]],
      T11,
      ScalaTupleTypeHList11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple2[T9#H, T10#H]],
        item: T11#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H)): T11#H = t._11
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple2[T9#H, T10#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10): AsunaTuple2[T9#H, T10#H])
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]]#T, T11#T, ScalaTupleTypeHList11[
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
      ]#T] = hlistPlus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPut11[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]], T11, ScalaTupleTypeHList11[
    T11,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]],
      T11,
      ScalaTupleTypeHList11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple2[T9#H, T10#H]],
        item: T11#H
      ): (T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2)
      override def takeTail(t: (T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H)): T11#H = t._1
      override def takeHead(
        t: (T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple2[T9#H, T10#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._11).pull(t._10): AsunaTuple2[T9#H, T10#H])
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
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList2[T9, T10]]#T, T11#T, ScalaTupleTypeHList11[
        T11,
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
      ]#T] = hlistPut11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def hlistPlus12[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]], T12, ScalaTupleTypeHList12[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]],
      T12,
      ScalaTupleTypeHList12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H)): T12#H = t._12
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple3[T9#H, T10#H, T11#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10).add(t._11): AsunaTuple3[T9#H, T10#H, T11#H])
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]]#T, T12#T, ScalaTupleTypeHList12[
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
      ]#T] = hlistPlus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPut12[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]], T12, ScalaTupleTypeHList12[
    T12,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]],
      T12,
      ScalaTupleTypeHList12[T12, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple3[T9#H, T10#H, T11#H]],
        item: T12#H
      ): (T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3)
      override def takeTail(t: (T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H)): T12#H = t._1
      override def takeHead(
        t: (T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple3[T9#H, T10#H, T11#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._12).pull(t._11).pull(t._10): AsunaTuple3[T9#H, T10#H, T11#H])
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
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList3[T9, T10, T11]]#T, T12#T, ScalaTupleTypeHList12[
        T12,
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
      ]#T] = hlistPut12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def hlistPlus13[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]], T13, ScalaTupleTypeHList13[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]],
      T13,
      ScalaTupleTypeHList13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H)): T13#H = t._13
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple4[T9#H, T10#H, T11#H, T12#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10).add(t._11).add(t._12): AsunaTuple4[T9#H, T10#H, T11#H, T12#H])
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]]#T, T13#T, ScalaTupleTypeHList13[
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
      ]#T] = hlistPlus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPut13[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]], T13, ScalaTupleTypeHList13[
    T13,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]],
      T13,
      ScalaTupleTypeHList13[T13, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple4[T9#H, T10#H, T11#H, T12#H]],
        item: T13#H
      ): (T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4)
      override def takeTail(t: (T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H)): T13#H = t._1
      override def takeHead(
        t: (T13#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple4[T9#H, T10#H, T11#H, T12#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._13).pull(t._12).pull(t._11).pull(t._10): AsunaTuple4[T9#H, T10#H, T11#H, T12#H])
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
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList4[T9, T10, T11, T12]]#T, T13#T, ScalaTupleTypeHList13[
        T13,
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
      ]#T] = hlistPut13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def hlistPlus14[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]], T14, ScalaTupleTypeHList14[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]],
      T14,
      ScalaTupleTypeHList14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H)): T14#H = t._14
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10).add(t._11).add(t._12).add(t._13): AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H])
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]]#T, T14#T, ScalaTupleTypeHList14[
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
      ]#T] = hlistPlus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPut14[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]], T14, ScalaTupleTypeHList14[
    T14,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]],
      T14,
      ScalaTupleTypeHList14[T14, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H]],
        item: T14#H
      ): (T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5)
      override def takeTail(t: (T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H)): T14#H = t._1
      override def takeHead(
        t: (T14#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._14).pull(t._13).pull(t._12).pull(t._11).pull(t._10): AsunaTuple5[T9#H, T10#H, T11#H, T12#H, T13#H])
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
      override def sub: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList5[T9, T10, T11, T12, T13]]#T, T14#T, ScalaTupleTypeHList14[
        T14,
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
      ]#T] = hlistPut14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def hlistPlus15[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]], T15, ScalaTupleTypeHList15[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]],
      T15,
      ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H)): T15#H = t._15
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10).add(t._11).add(t._12).add(t._13).add(t._14): AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
      override def sub: Plus[
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]]#T,
        T15#T,
        ScalaTupleTypeHList15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T
      ] = hlistPlus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPut15[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]], T15, ScalaTupleTypeHList15[
    T15,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]],
      T15,
      ScalaTupleTypeHList15[T15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]],
        item: T15#H
      ): (T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6)
      override def takeTail(t: (T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H)): T15#H = t._1
      override def takeHead(
        t: (T15#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H]] =
        ReverseHListTuple0
          .pull(ReverseHListTuple0.pull(t._15).pull(t._14).pull(t._13).pull(t._12).pull(t._11).pull(t._10): AsunaTuple6[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H])
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
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList6[T9, T10, T11, T12, T13, T14]]#T,
        T15#T,
        ScalaTupleTypeHList15[T15, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T
      ] = hlistPut15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def hlistPlus16[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]], T16, ScalaTupleTypeHList16[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]],
      T16,
      ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H)): T16#H = t._16
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        HListTuple0
          .add(HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H])
          .add(HListTuple0.add(t._9).add(t._10).add(t._11).add(t._12).add(t._13).add(t._14).add(t._15): AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H])
      override def sub: Plus[
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]]#T,
        T16#T,
        ScalaTupleTypeHList16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T
      ] = hlistPlus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPut16[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]], T16, ScalaTupleTypeHList16[
    T16,
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]],
      T16,
      ScalaTupleTypeHList16[T16, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]],
        item: T16#H
      ): (T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7)
      override def takeTail(t: (T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H)): T16#H = t._1
      override def takeHead(
        t: (T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]] =
        ReverseHListTuple0
          .pull(
            ReverseHListTuple0
              .pull(t._16)
              .pull(t._15)
              .pull(t._14)
              .pull(t._13)
              .pull(t._12)
              .pull(t._11)
              .pull(t._10): AsunaTuple7[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
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
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList7[T9, T10, T11, T12, T13, T14, T15]]#T,
        T16#T,
        ScalaTupleTypeHList16[T16, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T
      ] = hlistPut16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def hlistPlus17[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, ScalaTupleTypeHList17[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]],
      T17,
      ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H) =
        (p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8, item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H)): T17#H = t._17
      override def takeHead(
        t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
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
      override def sub: Plus[
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]]#T,
        T17#T,
        ScalaTupleTypeHList17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T
      ] = hlistPlus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def hlistPut17[
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
  ]: Plus[TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]], T17, ScalaTupleTypeHList17[
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
    new Plus[
      TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]],
      T17,
      ScalaTupleTypeHList17[T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
    ] {
      override def plus(
        p: AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]],
        item: T17#H
      ): (T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H) =
        (item, p.i1.i1, p.i1.i2, p.i1.i3, p.i1.i4, p.i1.i5, p.i1.i6, p.i1.i7, p.i1.i8, p.i2.i1, p.i2.i2, p.i2.i3, p.i2.i4, p.i2.i5, p.i2.i6, p.i2.i7, p.i2.i8)
      override def takeTail(t: (T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H)): T17#H = t._1
      override def takeHead(
        t: (T17#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H)
      ): AsunaTuple2[AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], AsunaTuple8[T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]] =
        ReverseHListTuple0
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
        TupleTypeHList2[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], TupleTypeHList8[T9, T10, T11, T12, T13, T14, T15, T16]]#T,
        T17#T,
        ScalaTupleTypeHList17[T17, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T
      ] = hlistPut17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
}
object ScalaTupleTypeHListPlus2 extends ScalaTupleTypeHListPlus2