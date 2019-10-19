package asuna
trait TupleTypeHListPlus2 {
  val plus2Any: Plus[TupleTypeHList1[AnyTypeHList], AnyTypeHList, TupleTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList1[AnyTypeHList], AnyTypeHList, TupleTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AsunaTuple1[AnyTypeHList#H], item: AnyTypeHList#H): AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]        = p.add(item)
      override def takeTail(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                       = t.rightHead
      override def takeHead(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple1[AnyTypeHList#H]                          = t.rightTail
      override lazy val sub: Plus[TupleTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T] = plus2Any
    }
  val put2Any: Plus[TupleTypeHList1[AnyTypeHList], AnyTypeHList, TupleTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[TupleTypeHList1[AnyTypeHList], AnyTypeHList, TupleTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AsunaTuple1[AnyTypeHList#H], item: AnyTypeHList#H): AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]        = p.pull(item)
      override def takeTail(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                       = t.leftHead
      override def takeHead(t: AsunaTuple2[AnyTypeHList#H, AnyTypeHList#H]): AsunaTuple1[AnyTypeHList#H]                          = t.leftTail
      override lazy val sub: Plus[TupleTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList2[AnyTypeHList, AnyTypeHList]#T] = put2Any
    }
  @inline def plus2[T1 <: TypeHList, T2 <: TypeHList]: Plus[TupleTypeHList1[T1], T2, TupleTypeHList2[T1, T2]] =
    plus2Any.asInstanceOf[Plus[TupleTypeHList1[T1], T2, TupleTypeHList2[T1, T2]]]
  @inline def put2[T1 <: TypeHList, T2 <: TypeHList]: Plus[TupleTypeHList1[T1], T2, TupleTypeHList2[T2, T1]] =
    put2Any.asInstanceOf[Plus[TupleTypeHList1[T1], T2, TupleTypeHList2[T2, T1]]]
}
object TupleTypeHListPlus2 extends TupleTypeHListPlus2
