package asuna
trait TupleTypeHListPlus4 {
  val plus4Any: Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(
        p: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.add(item)
      override def takeTail(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.rightHead
      override def takeHead(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] =
        t.rightTail
      override lazy val sub
        : Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        plus4Any
    }
  val put4Any: Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(
        p: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.pull(item)
      override def takeTail(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.leftHead
      override def takeHead(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] =
        t.leftTail
      override lazy val sub
        : Plus[TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        put4Any
    }
  @inline def plus4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[TupleTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T1, T2, T3, T4]] =
    plus4Any.asInstanceOf[Plus[TupleTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T1, T2, T3, T4]]]
  @inline def put4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[TupleTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T4, T1, T2, T3]] =
    put4Any.asInstanceOf[Plus[TupleTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T4, T1, T2, T3]]]
}
object TupleTypeHListPlus4 extends TupleTypeHListPlus4
