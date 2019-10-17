package asuna
trait ItemTypeHListPlus8 {
  val plus8Any: Plus[ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList8[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.add(item)
      override def takeTail(
        t: Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override def sub: Plus[
        ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        ItemTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = plus8Any
    }
  val put8Any: Plus[ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList8[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.pull(item)
      override def takeTail(
        t: Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: Item8[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override def sub: Plus[
        ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T,
        AnyTypeHList#T,
        ItemTypeHList8[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T
      ] = put8Any
    }
  @inline def plus8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    plus8Any.asInstanceOf[Plus[ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  @inline def put8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    put8Any.asInstanceOf[Plus[ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]]]
}
object ItemTypeHListPlus8 extends ItemTypeHListPlus8
