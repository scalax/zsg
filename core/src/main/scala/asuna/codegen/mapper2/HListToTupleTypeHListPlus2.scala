package asuna
trait HListToTupleTypeHListPlus2 {
  val plus2Any: Plus[
    HListTypeHList1[AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList2[AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList1[AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList2[AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(p: HListTypeHList1[AnyTypeHList]#H, item: AnyTypeHList#H): TupleTypeHList2[AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        new AsunaValueTuple2(i1 = ii1, i2 = item)
      }
      override def takeTail(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                       = t.i2
      override def takeHead(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: HNil                               = t.i1 :: HNil
      override lazy val sub: Plus[HListTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T] = plus2Any
    }
  @inline def plus2[E1 <: TypeHList, E2 <: TypeHList]: Plus[
    HListTypeHList1[E1],
    E2,
    TupleTypeHList2[E1, E2]
  ] =
    plus2Any.asInstanceOf[Plus[
      HListTypeHList1[E1],
      E2,
      TupleTypeHList2[E1, E2]
    ]]
  val put2Any: Plus[
    HListTypeHList1[AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList2[AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList1[AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList2[AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(p: HListTypeHList1[AnyTypeHList]#H, item: AnyTypeHList#H): TupleTypeHList2[AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        new AsunaValueTuple2(i1 = item, i2 = ii1)
      }
      override def takeTail(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                       = t.i1
      override def takeHead(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: HNil                               = t.i2 :: HNil
      override lazy val sub: Plus[HListTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T] = put2Any
    }
  @inline def put2[T1 <: TypeHList, T2 <: TypeHList]: Plus[HListTypeHList1[T1], T2, TupleTypeHList2[T2, T1]] =
    put2Any.asInstanceOf[Plus[HListTypeHList1[T1], T2, TupleTypeHList2[T2, T1]]]
}
object HListToTupleTypeHListPlus2 extends HListToTupleTypeHListPlus2
