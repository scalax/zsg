package asuna
trait HListToTupleTypeHListPlus6 {
  val plus6Any: Plus[
    HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        new AsunaValueTuple6(i1 = ii5, i2 = ii4, i3 = ii3, i4 = ii2, i5 = ii1, i6 = item)
      }
      override def takeTail(t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i6
      override def takeHead(
        t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil = t.i5 :: t.i4 :: t.i3 :: t.i2 :: t.i1 :: HNil
      override lazy val sub: Plus[HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList6[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus6Any
    }
  @inline def plus6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList]: Plus[
    HListTypeHList5[E1, E2, E3, E4, E5],
    E6,
    TupleTypeHList6[E1, E2, E3, E4, E5, E6]
  ] =
    plus6Any.asInstanceOf[Plus[
      HListTypeHList5[E1, E2, E3, E4, E5],
      E6,
      TupleTypeHList6[E1, E2, E3, E4, E5, E6]
    ]]
  val put6Any: Plus[
    HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        new AsunaValueTuple6(i1 = item, i2 = ii1, i3 = ii2, i4 = ii3, i5 = ii4, i6 = ii5)
      }
      override def takeTail(t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i1
      override def takeHead(
        t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil = t.i2 :: t.i3 :: t.i4 :: t.i5 :: t.i6 :: HNil
      override lazy val sub: Plus[HListTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList6[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put6Any
    }
  @inline def put6[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList]
    : Plus[HListTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T6, T5, T4, T3, T2, T1]] =
    put6Any.asInstanceOf[Plus[HListTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T6, T5, T4, T3, T2, T1]]]
}
object HListToTupleTypeHListPlus6 extends HListToTupleTypeHListPlus6
