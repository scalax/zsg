package asuna

trait Only2Plus {
  @inline def hlistPlus2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[T1, T2, ItemTypeParameter2[T1, T2]] =
    hlistPlus2Any.asInstanceOf[Plus[T1, T2, ItemTypeParameter2[T1, T2]]]
  @inline def hlistPut2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[T1, T2, ItemTypeParameter2[T2, T1]] =
    hlistPut2Any.asInstanceOf[Plus[T1, T2, ItemTypeParameter2[T2, T1]]]

  val hlistPlus2Any: Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] =
    new Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: AnyTypeParameter#H, item: AnyTypeParameter#H): Item2[AnyTypeParameter#H, AnyTypeParameter#H]        = HListItem0.add(p).add(item)
      override def takeTail(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                              = t.i2
      override def takeHead(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                              = t.i1
      override def sub: Plus[AnyTypeParameter#T, AnyTypeParameter#T, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T] = hlistPlus2Any
    }
  val hlistPut2Any: Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] =
    new Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: AnyTypeParameter#H, item: AnyTypeParameter#H): Item2[AnyTypeParameter#H, AnyTypeParameter#H]        = ReverseHListItem0.pull(p).pull(item)
      override def takeTail(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                              = t.i1
      override def takeHead(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                              = t.i2
      override def sub: Plus[AnyTypeParameter#T, AnyTypeParameter#T, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T] = hlistPut2Any
    }
}

object Only2Plus extends Only2Plus
