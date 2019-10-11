package org.scalax.asuna.mapper

object ItemTypeParameterPlus1 {

  @inline def hlistPlus1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]] =
    hlistPlusAny.asInstanceOf[Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]]]
  @inline def hlistPut1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]] =
    hlistPutAny.asInstanceOf[Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]]]

  val hlistPlusAny: Plus[ItemTypeParameter0, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] =
    new Plus[ItemTypeParameter0, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] {
      override def plus(p: ItemTypeParameter0#H, item: AnyTypeParameter#H): Item1[AnyTypeParameter#H]        = HListItem0.add(item)
      override def takeTail(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = t.i1
      override def takeHead(t: Item1[AnyTypeParameter#H]): ItemTypeParameter0#H                              = HListItem0
      override def sub: Plus[ItemTypeParameter0#T, AnyTypeParameter#T, ItemTypeParameter1[AnyTypeParameter#T]] = hlistPlusAny
    }
  val hlistPutAny: Plus[ItemTypeParameter0, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] =
    new Plus[ItemTypeParameter0, AnyTypeParameter, ItemTypeParameter1[AnyTypeParameter]] {
      override def plus(p: ItemTypeParameter0#H, item: AnyTypeParameter#H): Item1[AnyTypeParameter#H]        = ReverseHListItem0.pull(item)
      override def takeTail(t: Item1[AnyTypeParameter#H]): AnyTypeParameter#H                                = t.i1
      override def takeHead(t: Item1[AnyTypeParameter#H]): ItemTypeParameter0#H                              = ReverseHListItem0
      override def sub: Plus[ItemTypeParameter0#T, AnyTypeParameter#T, ItemTypeParameter1[AnyTypeParameter#T]] = hlistPutAny
    }

}
