package asuna.support

import asuna.{AnyTypeHList, AsunaTuple0, AsunaTuple1, Plus, TupleTypeHList0, TupleTypeHList1, TypeHList}

trait TupleTypeHListPlus1 {

  @inline def hlistPlus1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]] =
    hlistPlus1Any.asInstanceOf[Plus[TupleTypeHList0, T1, TupleTypeHList1[T1]]]

  val hlistPlus1Any: Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] =
    new Plus[TupleTypeHList0, AnyTypeHList, TupleTypeHList1[AnyTypeHList]] {
      override def plus(p: TupleTypeHList0#H, item: AnyTypeHList#H): AsunaTuple1[AnyTypeHList#H]      = new AsunaValueTuple1(item)
      override def takeTail(t: AsunaTuple1[AnyTypeHList#H]): AnyTypeHList#H                           = t.i1
      override def takeHead(t: AsunaTuple1[AnyTypeHList#H]): TupleTypeHList0#H                        = AsunaTuple0
      override lazy val sub: Plus[TupleTypeHList0#T, AnyTypeHList#T, TupleTypeHList1[AnyTypeHList#T]] = hlistPlus1Any
    }

}

object TupleTypeHListPlus1 extends TupleTypeHListPlus1
