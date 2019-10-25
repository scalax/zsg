package asuna.support

import asuna.support.heterogeneous.HNil
import asuna.{AnyHListTypeHList, AnyTypeHList, AsunaTuple0, Plus, TupleTypeHList0, TypeHList}

trait HListTypeHListPlus1 {
  self =>

  protected val plus0To1: Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] = new Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: TupleTypeHList0#H, item: AnyTypeHList#H): AnyHListTypeHList#H  = item :: HNil
    override def takeHead(t: AnyHListTypeHList#H): TupleTypeHList0#H                    = AsunaTuple0
    override def takeTail(t: AnyHListTypeHList#H): AnyTypeHList#H                       = t.head
    override lazy val sub: Plus[TupleTypeHList0#T, AnyTypeHList#T, AnyHListTypeHList#T] = self.plus0To1
  }

  @inline def plus1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, HListTypeHList1[T1]] = plus0To1.asInstanceOf[Plus[TupleTypeHList0, T1, HListTypeHList1[T1]]]

}

object HListTypeHListPlus1 extends HListTypeHListPlus1
