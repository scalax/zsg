package asuna
import asuna.support.heterogeneous._
trait HListToTupleTypeHListPlus3 {
  val plus3Any: Plus[
    HListTypeHList2[AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList2[AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(p: HListTypeHList2[AnyTypeHList, AnyTypeHList]#H, item: AnyTypeHList#H): TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        new AsunaValueTuple3(i1 = ii2, i2 = ii1, i3 = item)
      }
      override def takeTail(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                   = t.i3
      override def takeHead(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: AnyTypeHList#H :: HNil                         = t.i2 :: t.i1 :: HNil
      override lazy val sub: Plus[HListTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = plus3Any
    }
  @inline def plus3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList]: Plus[
    HListTypeHList2[E1, E2],
    E3,
    TupleTypeHList3[E1, E2, E3]
  ] =
    plus3Any.asInstanceOf[Plus[
      HListTypeHList2[E1, E2],
      E3,
      TupleTypeHList3[E1, E2, E3]
    ]]
  val put3Any: Plus[
    HListTypeHList2[AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList2[AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(p: HListTypeHList2[AnyTypeHList, AnyTypeHList]#H, item: AnyTypeHList#H): TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        new AsunaValueTuple3(i1 = item, i2 = ii1, i3 = ii2)
      }
      override def takeTail(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                   = t.i1
      override def takeHead(t: AsunaTuple3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: AnyTypeHList#H :: HNil                         = t.i2 :: t.i3 :: HNil
      override lazy val sub: Plus[HListTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = put3Any
    }
  @inline def put3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[HListTypeHList2[T1, T2], T3, TupleTypeHList3[T3, T2, T1]] =
    put3Any.asInstanceOf[Plus[HListTypeHList2[T1, T2], T3, TupleTypeHList3[T3, T2, T1]]]
}
object HListToTupleTypeHListPlus3 extends HListToTupleTypeHListPlus3
