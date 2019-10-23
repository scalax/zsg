package asuna
trait HListToTupleTypeHListPlus5 {
  val plus5Any: Plus[
    HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        new AsunaValueTuple5(i1 = ii4, i2 = ii3, i3 = ii2, i4 = ii1, i5 = item)
      }
      override def takeTail(t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i5
      override def takeHead(
        t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil = t.i4 :: t.i3 :: t.i2 :: t.i1 :: HNil
      override lazy val sub: Plus[HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus5Any
    }
  @inline def plus5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList]: Plus[
    HListTypeHList4[E1, E2, E3, E4],
    E5,
    TupleTypeHList5[E1, E2, E3, E4, E5]
  ] =
    plus5Any.asInstanceOf[Plus[
      HListTypeHList4[E1, E2, E3, E4],
      E5,
      TupleTypeHList5[E1, E2, E3, E4, E5]
    ]]
  val put5Any: Plus[
    HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        new AsunaValueTuple5(i1 = item, i2 = ii1, i3 = ii2, i4 = ii3, i5 = ii4)
      }
      override def takeTail(t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i1
      override def takeHead(
        t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil = t.i2 :: t.i3 :: t.i4 :: t.i5 :: HNil
      override lazy val sub: Plus[HListTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put5Any
    }
  @inline def put5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[HListTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T5, T4, T3, T2, T1]] =
    put5Any.asInstanceOf[Plus[HListTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T5, T4, T3, T2, T1]]]
}
object HListToTupleTypeHListPlus5 extends HListToTupleTypeHListPlus5
