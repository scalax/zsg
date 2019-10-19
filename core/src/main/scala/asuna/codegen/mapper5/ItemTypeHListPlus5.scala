package asuna
trait TupleTypeHListPlus5 {
  val plus5Any: Plus[TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList5[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.add(item)
      override def takeTail(t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override lazy val sub: Plus[TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus5Any
    }
  val put5Any: Plus[TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList5[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.pull(item)
      override def takeTail(t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: AsunaTuple5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override lazy val sub: Plus[TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put5Any
    }
  @inline def plus5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[TupleTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T1, T2, T3, T4, T5]] =
    plus5Any.asInstanceOf[Plus[TupleTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T1, T2, T3, T4, T5]]]
  @inline def put5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[TupleTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T5, T1, T2, T3, T4]] =
    put5Any.asInstanceOf[Plus[TupleTypeHList4[T1, T2, T3, T4], T5, TupleTypeHList5[T5, T1, T2, T3, T4]]]
}
object TupleTypeHListPlus5 extends TupleTypeHListPlus5
