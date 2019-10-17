package asuna
trait ItemTypeHListPlus4 {
  val plus4Any: Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(
        p: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                                                               = p.add(item)
      override def takeTail(t: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                        = t.rightHead
      override def takeHead(t: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.rightTail
      override def sub
        : Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        plus4Any
    }
  val put4Any: Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(
        p: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H],
        item: AnyTypeHList#H
      ): Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]                                                                               = p.pull(item)
      override def takeTail(t: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                        = t.leftHead
      override def takeHead(t: Item4[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H] = t.leftTail
      override def sub
        : Plus[ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList4[AnyTypeHList, AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] =
        put4Any
    }
  @inline def plus4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T1, T2, T3, T4]] =
    plus4Any.asInstanceOf[Plus[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T1, T2, T3, T4]]]
  @inline def put4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T4, T1, T2, T3]] =
    put4Any.asInstanceOf[Plus[ItemTypeHList3[T1, T2, T3], T4, ItemTypeHList4[T4, T1, T2, T3]]]
}
object ItemTypeHListPlus4 extends ItemTypeHListPlus4
