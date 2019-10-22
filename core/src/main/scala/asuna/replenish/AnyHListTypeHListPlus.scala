package asuna

import scala.language.higherKinds

trait AnyHListTypeHListPlus {
  self =>

  val plus: Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] = new Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: HList, item: Any): HList                                   = item :: p
    override def takeHead(t: HList): HList                                          = t.tail
    override def takeTail(t: HList): Any                                            = t.head
    override lazy val sub: Plus[AnyHListTypeHList, AnyTypeHList, AnyHListTypeHList] = self.plus
  }

  val plus0To1: Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] = new Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] {
    override def plus(p: AsunaTuple0, item: Any): HList                           = item :: HNil
    override def takeHead(t: HList): AsunaTuple0                                  = AsunaTuple0
    override def takeTail(t: HList): AsunaTuple0                                  = AsunaTuple0
    override lazy val sub: Plus[TupleTypeHList0, AnyTypeHList, AnyHListTypeHList] = self.plus0To1
  }

  @inline def hlistPlus1[T1 <: TypeHList]: Plus[TupleTypeHList0, T1, HListTypeHList1[T1]] = plus0To1.asInstanceOf[Plus[TupleTypeHList0, T1, HListTypeHList1[T1]]]

}

object AnyHListTypeHListPlus extends AnyHListTypeHListPlus
