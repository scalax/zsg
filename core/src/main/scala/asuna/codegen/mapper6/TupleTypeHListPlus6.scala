package asuna
trait TupleTypeHListPlus6 {
  val plus6Any: Plus[TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList6[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.add(item)
      override def takeTail(t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override lazy val sub: Plus[TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList6[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus6Any
    }
  val put6Any: Plus[TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList6[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.pull(item)
      override def takeTail(t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override lazy val sub: Plus[TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList6[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put6Any
    }
  @inline def plus6[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList]
    : Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    plus6Any.asInstanceOf[Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T1, T2, T3, T4, T5, T6]]]
  @inline def put6[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList]
    : Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T6, T1, T2, T3, T4, T5]] =
    put6Any.asInstanceOf[Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, TupleTypeHList6[T6, T1, T2, T3, T4, T5]]]
}
object TupleTypeHListPlus6 extends TupleTypeHListPlus6
