package asuna
trait TupleTypeHListPlus3 {
  val plus3Any: Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H], item: AnyTypeHList#H): AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]    = p.add(item)
      override def takeTail(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                   = t.rightHead
      override def takeHead(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]                      = t.rightTail
      override lazy val sub: Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = plus3Any
    }
  val put3Any: Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H], item: AnyTypeHList#H): AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]    = p.pull(item)
      override def takeTail(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                   = t.leftHead
      override def takeHead(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]                      = t.leftTail
      override lazy val sub: Plus[TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = put3Any
    }
  @inline def plus3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[TupleTypeHList2[T1, T2], T3, TupleTypeHList3[T1, T2, T3]] =
    plus3Any.asInstanceOf[Plus[TupleTypeHList2[T1, T2], T3, TupleTypeHList3[T1, T2, T3]]]
  @inline def put3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[TupleTypeHList2[T1, T2], T3, TupleTypeHList3[T3, T1, T2]] =
    put3Any.asInstanceOf[Plus[TupleTypeHList2[T1, T2], T3, TupleTypeHList3[T3, T1, T2]]]
}
object TupleTypeHListPlus3 extends TupleTypeHListPlus3
