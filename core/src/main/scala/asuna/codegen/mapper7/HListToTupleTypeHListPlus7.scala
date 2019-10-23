package asuna
trait HListToTupleTypeHListPlus7 {
  val plus7Any: Plus[
    HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        new AsunaValueTuple7(i1 = ii6, i2 = ii5, i3 = ii4, i4 = ii3, i5 = ii2, i6 = ii1, i7 = item)
      }
      override def takeTail(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.i7
      override def takeHead(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i6 :: t.i5 :: t.i4 :: t.i3 :: t.i2 :: t.i1 :: HNil
      override lazy val sub: Plus[HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus7Any
    }
  @inline def plus7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]: Plus[
    HListTypeHList6[E1, E2, E3, E4, E5, E6],
    E7,
    TupleTypeHList7[E1, E2, E3, E4, E5, E6, E7]
  ] =
    plus7Any.asInstanceOf[Plus[
      HListTypeHList6[E1, E2, E3, E4, E5, E6],
      E7,
      TupleTypeHList7[E1, E2, E3, E4, E5, E6, E7]
    ]]
  val put7Any: Plus[
    HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        new AsunaValueTuple7(i1 = item, i2 = ii1, i3 = ii2, i4 = ii3, i5 = ii4, i6 = ii5, i7 = ii6)
      }
      override def takeTail(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.i1
      override def takeHead(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i2 :: t.i3 :: t.i4 :: t.i5 :: t.i6 :: t.i7 :: HNil
      override lazy val sub: Plus[HListTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put7Any
    }
  @inline def put7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[HListTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T7, T6, T5, T4, T3, T2, T1]] =
    put7Any.asInstanceOf[Plus[HListTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T7, T6, T5, T4, T3, T2, T1]]]
}
object HListToTupleTypeHListPlus7 extends HListToTupleTypeHListPlus7
