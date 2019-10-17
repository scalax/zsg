package asuna
trait ItemTypeHListPlus7 {
  val plus7Any: Plus[ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList7[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.add(item)
      override def takeTail(t: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H =
        t.rightHead
      override def takeHead(
        t: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override def sub: Plus[ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus7Any
    }
  val put7Any: Plus[ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList7[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList7[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = p.pull(item)
      override def takeTail(t: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H =
        t.leftHead
      override def takeHead(
        t: Item7[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item6[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override def sub: Plus[ItemTypeHList6[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList7[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put7Any
    }
  @inline def plus7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[ItemTypeHList6[T1, T2, T3, T4, T5, T6], T7, ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    plus7Any.asInstanceOf[Plus[ItemTypeHList6[T1, T2, T3, T4, T5, T6], T7, ItemTypeHList7[T1, T2, T3, T4, T5, T6, T7]]]
  @inline def put7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[ItemTypeHList6[T1, T2, T3, T4, T5, T6], T7, ItemTypeHList7[T7, T1, T2, T3, T4, T5, T6]] =
    put7Any.asInstanceOf[Plus[ItemTypeHList6[T1, T2, T3, T4, T5, T6], T7, ItemTypeHList7[T7, T1, T2, T3, T4, T5, T6]]]
}
object ItemTypeHListPlus7 extends ItemTypeHListPlus7
