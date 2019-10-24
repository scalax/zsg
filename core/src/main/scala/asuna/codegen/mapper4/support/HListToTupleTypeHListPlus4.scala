package asuna.support
import asuna.AnyTypeHList
import asuna.TupleTypeHList4
import asuna.AsunaTuple4
import asuna.Plus
import asuna.TypeHList
import asuna.support.heterogeneous._
trait HListToTupleTypeHListPlus4 {
  val plus4Any: Plus[
    HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        new AsunaValueTuple4(i1 = ii3, i2 = ii2, i3 = ii1, i4 = item)
      }
      override def takeTail(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i4
      override def takeHead(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i3 :: t.i2 :: t.i1 :: HNil
      override lazy val sub
        : Plus[HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        plus4Any
    }
  @inline def plus4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList]: Plus[
    HListTypeHList3[E1, E2, E3],
    E4,
    TupleTypeHList4[E1, E2, E3, E4]
  ] =
    plus4Any.asInstanceOf[Plus[
      HListTypeHList3[E1, E2, E3],
      E4,
      TupleTypeHList4[E1, E2, E3, E4]
    ]]
  val put4Any: Plus[
    HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        new AsunaValueTuple4(i1 = item, i2 = ii1, i3 = ii2, i4 = ii3)
      }
      override def takeTail(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.i1
      override def takeHead(t: AsunaTuple4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i2 :: t.i3 :: t.i4 :: HNil
      override lazy val sub
        : Plus[HListTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, TupleTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        put4Any
    }
  @inline def put4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[HListTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T4, T3, T2, T1]] =
    put4Any.asInstanceOf[Plus[HListTypeHList3[T1, T2, T3], T4, TupleTypeHList4[T4, T3, T2, T1]]]
}
object HListToTupleTypeHListPlus4 extends HListToTupleTypeHListPlus4
