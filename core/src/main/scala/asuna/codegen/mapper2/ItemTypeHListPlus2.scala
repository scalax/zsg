package asuna
trait ItemTypeHListPlus2 {
  val plus2Any: Plus[ItemTypeHList1[AnyTypeHList], AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList1[AnyTypeHList], AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: Item1[AnyTypeHList#H], item: AnyTypeHList#H): Item2[AnyTypeHList#H, AnyTypeHList#H]             = p.add(item)
      override def takeTail(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                      = t.rightHead
      override def takeHead(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): Item1[AnyTypeHList#H]                               = t.rightTail
      override def sub: Plus[ItemTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T] = plus2Any
    }
  val put2Any: Plus[ItemTypeHList1[AnyTypeHList], AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] =
    new Plus[ItemTypeHList1[AnyTypeHList], AnyTypeHList, ItemTypeHList2[AnyTypeHList, AnyTypeHList]] {
      override def plus(p: Item1[AnyTypeHList#H], item: AnyTypeHList#H): Item2[AnyTypeHList#H, AnyTypeHList#H]             = p.pull(item)
      override def takeTail(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): AnyTypeHList#H                                      = t.leftHead
      override def takeHead(t: Item2[AnyTypeHList#H, AnyTypeHList#H]): Item1[AnyTypeHList#H]                               = t.leftTail
      override def sub: Plus[ItemTypeHList1[AnyTypeHList]#T, AnyTypeHList#T, ItemTypeHList2[AnyTypeHList, AnyTypeHList]#T] = put2Any
    }
  @inline def plus2[T1 <: TypeHList, T2 <: TypeHList]: Plus[ItemTypeHList1[T1], T2, ItemTypeHList2[T1, T2]] =
    plus2Any.asInstanceOf[Plus[ItemTypeHList1[T1], T2, ItemTypeHList2[T1, T2]]]
  @inline def put2[T1 <: TypeHList, T2 <: TypeHList]: Plus[ItemTypeHList1[T1], T2, ItemTypeHList2[T2, T1]] =
    put2Any.asInstanceOf[Plus[ItemTypeHList1[T1], T2, ItemTypeHList2[T2, T1]]]
}
object ItemTypeHListPlus2 extends ItemTypeHListPlus2
