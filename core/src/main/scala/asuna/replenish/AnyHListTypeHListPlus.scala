package asuna

import scala.language.higherKinds

trait AnyHListTypeHListPlus {
  self =>

  val plus: Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] = new Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: AnyHListTypeHList#H, item: AnyTypeHList#H): AnyHListTypeHList#H  = item :: p
    override def takeHead(t: AnyHListTypeHList#H): AnyHListTypeHList#H                    = t.tail
    override def takeTail(t: AnyHListTypeHList#H): AnyTypeHList#H                         = t.head
    override lazy val sub: Plus[AnyHListTypeHList#T, AnyTypeHList#T, AnyHListTypeHList#T] = self.plus
  }

  val plus0To1: Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] = new Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: TupleTypeHList0#H, item: AnyTypeHList#H): AnyHListTypeHList#H  = item :: HNil
    override def takeHead(t: AnyHListTypeHList#H): TupleTypeHList0#H                    = AsunaTuple0
    override def takeTail(t: AnyHListTypeHList#H): AnyTypeHList#H                       = t.head
    override lazy val sub: Plus[TupleTypeHList0#T, AnyTypeHList#T, AnyHListTypeHList#T] = self.plus0To1
  }

  @inline def hlistPlus1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, HListTypeHList1[T1]] = plus0To1.asInstanceOf[Plus[TupleTypeHList0, T1, HListTypeHList1[T1]]]

}

object AnyHListTypeHListPlus extends AnyHListTypeHListPlus
