package asuna
trait TupleTypeHListPlus8 {
  val plus8Any: Plus[TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList8[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.add(item)
      override def takeTail(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override lazy val sub: Plus[
        TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = plus8Any
    }
  val put8Any: Plus[TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList8[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.pull(item)
      override def takeTail(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override lazy val sub: Plus[
        TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = put8Any
    }
  @inline def plus8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    plus8Any.asInstanceOf[Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  @inline def put8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    put8Any.asInstanceOf[Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]]]
}
object TupleTypeHListPlus8 extends TupleTypeHListPlus8
