package asuna
trait ItemTypeHListPlus3 {
  val plus3Any: Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(p: Item2[AnyTypeHList#H, AnyTypeHList#H], item: AnyTypeHList#H): Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]         = p.add(item)
      override def takeTail(t: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                  = t.rightHead
      override def takeHead(t: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): Item2[AnyTypeHList#H, AnyTypeHList#H]                           = t.rightTail
      override def sub: Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = plus3Any
    }
  val put3Any: Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList], AnyTypeHList, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]] {
      override def plus(p: Item2[AnyTypeHList#H, AnyTypeHList#H], item: AnyTypeHList#H): Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]         = p.pull(item)
      override def takeTail(t: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                                  = t.leftHead
      override def takeHead(t: Item3[AnyTypeHList#H, AnyTypeHList#H, AnyTypeHList#H]): Item2[AnyTypeHList#H, AnyTypeHList#H]                           = t.leftTail
      override def sub: Plus[ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList3[AnyTypeHList, AnyTypeHList, AnyTypeHList]#T] = put3Any
    }
  @inline def plus3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T1, T2, T3]] =
    plus3Any.asInstanceOf[Plus[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T1, T2, T3]]]
  @inline def put3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T3, T1, T2]] =
    put3Any.asInstanceOf[Plus[ItemTypeHList2[T1, T2], T3, ItemTypeHList3[T3, T1, T2]]]
}
object ItemTypeHListPlus3 extends ItemTypeHListPlus3
