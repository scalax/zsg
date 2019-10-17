package asuna
trait ItemTypeHListPlus5 {
  val plus5Any: Plus[ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList5[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.add(item)
      override def takeTail(t: Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.rightHead
      override def takeHead(
        t: Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override def sub: Plus[ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = plus5Any
    }
  val put5Any: Plus[ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList5[
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList,
    AnyTypeHList
  ]] =
    new Plus[
      ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList],
      AnyTypeHList,
      ItemTypeHList5[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]
    ] {
      override def plus(
        p: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                        = p.pull(item)
      override def takeTail(t: Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H = t.leftHead
      override def takeHead(
        t: Item5[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]
      ): Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override def sub: Plus[ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList5[
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList,
        AnyTypeHList
      ]#T] = put5Any
    }
  @inline def plus5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[ItemTypeHList4[T1, T2, T3, T4], T5, ItemTypeHList5[T1, T2, T3, T4, T5]] =
    plus5Any.asInstanceOf[Plus[ItemTypeHList4[T1, T2, T3, T4], T5, ItemTypeHList5[T1, T2, T3, T4, T5]]]
  @inline def put5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[ItemTypeHList4[T1, T2, T3, T4], T5, ItemTypeHList5[T5, T1, T2, T3, T4]] =
    put5Any.asInstanceOf[Plus[ItemTypeHList4[T1, T2, T3, T4], T5, ItemTypeHList5[T5, T1, T2, T3, T4]]]
}
object ItemTypeHListPlus5 extends ItemTypeHListPlus5
