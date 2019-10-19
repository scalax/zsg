package asuna
trait TupleTypeHListPlus7 {
  val plus7Any: Plus[TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList7[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.add(item)
      override def takeTail(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override lazy val sub: Plus[TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus7Any
    }
  val put7Any: Plus[TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList7[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.pull(item)
      override def takeTail(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: AsunaTuple7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AsunaTuple6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override lazy val sub: Plus[TupleTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put7Any
    }
  @inline def plus7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    plus7Any.asInstanceOf[Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]]]
  @inline def put7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T7, T1, T2, T3, T4, T5, T6]] =
    put7Any.asInstanceOf[Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, TupleTypeHList7[T7, T1, T2, T3, T4, T5, T6]]]
}
object TupleTypeHListPlus7 extends TupleTypeHListPlus7
