package asuna
import asuna.support.heterogeneous._
trait HListToTupleTypeHListPlus8 {
  val plus8Any: Plus[
    HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        val tt6 = tt5.tail
        val ii7 = tt6.head
        new AsunaValueTuple8(i1 = ii7, i2 = ii6, i3 = ii5, i4 = ii4, i5 = ii3, i6 = ii2, i7 = ii1, i8 = item)
      }
      override def takeTail(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.i8
      override def takeHead(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i7 :: t.i6 :: t.i5 :: t.i4 :: t.i3 :: t.i2 :: t.i1 :: HNil
      override lazy val sub: Plus[
        HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = plus8Any
    }
  @inline def plus8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]: Plus[
    HListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
    E8,
    TupleTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]
  ] =
    plus8Any.asInstanceOf[Plus[
      HListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
      E8,
      TupleTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]
    ]]
  val put8Any: Plus[
    HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
    AnyTypeHList,
    TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
  ] =
    new Plus[
      HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H,
        item: AnyTypeHList#H
      ): TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        val tt6 = tt5.tail
        val ii7 = tt6.head
        new AsunaValueTuple8(i1 = item, i2 = ii1, i3 = ii2, i4 = ii3, i5 = ii4, i6 = ii5, i7 = ii6, i8 = ii7)
      }
      override def takeTail(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.i1
      override def takeHead(
        t: AsunaTuple8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: AnyTypeHList#H :: HNil =
        t.i2 :: t.i3 :: t.i4 :: t.i5 :: t.i6 :: t.i7 :: t.i8 :: HNil
      override lazy val sub: Plus[
        HListTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        TupleTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = put8Any
    }
  @inline def put8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[HListTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T8, T7, T6, T5, T4, T3, T2, T1]] =
    put8Any.asInstanceOf[Plus[HListTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeHList8[T8, T7, T6, T5, T4, T3, T2, T1]]]
}
object HListToTupleTypeHListPlus8 extends HListToTupleTypeHListPlus8
