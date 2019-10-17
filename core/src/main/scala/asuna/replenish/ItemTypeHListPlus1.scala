package asuna

object ItemTypeHListPlus1 {

  @inline def hlistPlus1[T1 <: TypeHList]: Plus[ItemTypeHList0, T1, ItemTypeHList1[T1]] =
    hlistPlusAny.asInstanceOf[Plus[ItemTypeHList0, T1, ItemTypeHList1[T1]]]
  @inline def hlistPut1[T1 <: TypeHList]: Plus[ItemTypeHList0, T1, ItemTypeHList1[T1]] =
    hlistPutAny.asInstanceOf[Plus[ItemTypeHList0, T1, ItemTypeHList1[T1]]]

  val hlistPlusAny: Plus[ItemTypeHList0, AnyTypeHList, ItemTypeHList1[AnyTypeHList]] =
    new Plus[ItemTypeHList0, AnyTypeHList, ItemTypeHList1[AnyTypeHList]] {
      override def plus(p: ItemTypeHList0#H, item: AnyTypeHList#H): Item1[AnyTypeHList#H]      = HListItem0.add(item)
      override def takeTail(t: Item1[AnyTypeHList#H]): AnyTypeHList#H                          = t.i1
      override def takeHead(t: Item1[AnyTypeHList#H]): ItemTypeHList0#H                        = HListItem0
      override def sub: Plus[ItemTypeHList0#T, AnyTypeHList#T, ItemTypeHList1[AnyTypeHList#T]] = hlistPlusAny
    }
  val hlistPutAny: Plus[ItemTypeHList0, AnyTypeHList, ItemTypeHList1[AnyTypeHList]] =
    new Plus[ItemTypeHList0, AnyTypeHList, ItemTypeHList1[AnyTypeHList]] {
      override def plus(p: ItemTypeHList0#H, item: AnyTypeHList#H): Item1[AnyTypeHList#H]      = ReverseHListItem0.pull(item)
      override def takeTail(t: Item1[AnyTypeHList#H]): AnyTypeHList#H                          = t.i1
      override def takeHead(t: Item1[AnyTypeHList#H]): ItemTypeHList0#H                        = ReverseHListItem0
      override def sub: Plus[ItemTypeHList0#T, AnyTypeHList#T, ItemTypeHList1[AnyTypeHList#T]] = hlistPutAny
    }

}
