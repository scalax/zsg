package org.scalax.asuna.mapper

object ItemTypeParameterPlus1 {

  @inline def hlistPlus1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]] =
    hlistPlusAny.asInstanceOf[Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]]]
  @inline def hlistPut1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]] =
    hlistPutAny.asInstanceOf[Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]]]

  val hlistPlusAny: Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] =
    new Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] {
      override def plus(p: AnyTypeParameter#H, item: AnyTypeParameter#H): Item1[AnyTypeParameter#H]          = HListItem0.add(item)
      override def takeTail(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = t.i1
      override def takeHead(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = HListItem0
      override def sub: Plus[AnyTypeParameter#T, AnyTypeParameter#T, ItemTypeParameter1[AnyTypeParameter#T]] = hlistPlusAny
    }
  val hlistPutAny: Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] =
    new Plus[AnyTypeParameter, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] {
      override def plus(p: AnyTypeParameter#H, item: AnyTypeParameter#H): Item1[AnyTypeParameter#H]          = ReverseHListItem0.pull(item)
      override def takeTail(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = t.i1
      override def takeHead(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = ReverseHListItem0
      override def sub: Plus[AnyTypeParameter#T, AnyTypeParameter#T, ItemTypeParameter1[AnyTypeParameter#T]] = hlistPutAny
    }

}
