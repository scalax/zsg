package asuna

trait Only2Plus {
  @inline def hlistPlus2[T1 <: TypeHList, T2 <: TypeHList]: Plus[T1, T2, ItemTypeHList2[T1, T2]] =
    hlistPlus2Any.asInstanceOf[Plus[T1, T2, ItemTypeHList2[T1, T2]]]
  @inline def hlistPut2[T1 <: TypeHList, T2 <: TypeHList]: Plus[T1, T2, ItemTypeHList2[T2, T1]] =
    hlistPut2Any.asInstanceOf[Plus[T1, T2, ItemTypeHList2[T2, T1]]]

  val hlistPlus2Any: Plus[AnyTypeHList, AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[AnyTypeHList, AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AnyTypeHList#H, item: AnyTypeHList#H): Item2[AnyTypeHList#H, AnyTypeHList#H]    = HListItem0.add(p).add(item)
      override def takeTail(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                      = t.i2
      override def takeHead(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                      = t.i1
      override def sub: Plus[AnyTypeHList#T, AnyTypeHList#T, ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T] = hlistPlus2Any
    }
  val hlistPut2Any: Plus[AnyTypeHList, AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[AnyTypeHList, AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: AnyTypeHList#H, item: AnyTypeHList#H): Item2[AnyTypeHList#H, AnyTypeHList#H]    = ReverseHListItem0.pull(p).pull(item)
      override def takeTail(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                      = t.i1
      override def takeHead(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                      = t.i2
      override def sub: Plus[AnyTypeHList#T, AnyTypeHList#T, ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T] = hlistPut2Any
    }
}

object Only2Plus extends Only2Plus
