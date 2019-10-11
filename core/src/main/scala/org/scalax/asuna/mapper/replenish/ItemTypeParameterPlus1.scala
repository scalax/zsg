package org.scalax.asuna.mapper

object ItemTypeParameterPlus1 {
  def hlistPlusInit[T0 <: ItemTypeParameter0, T1 <: TypeParameter]: Plus[T0, T1, ItemTypeParameter1[T1]] =
    new Plus[T0, T1, ItemTypeParameter1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]          = HListItem0.add(item)
      override def takeTail(t: Item1[T1#H]): T1#H                  = t.i1
      override def takeHead(t: Item1[T1#H]): T0#H                  = HListItem0
      override def sub: Plus[T0#T, T1#T, ItemTypeParameter1[T1#T]] = hlistPlusInit[T0#T, T1#T]
    }
  def hlistPutInit[T0 <: ItemTypeParameter0, T1 <: TypeParameter]: Plus[T0, T1, ItemTypeParameter1[T1]] =
    new Plus[T0, T1, ItemTypeParameter1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]          = ReverseHListItem0.pull(item)
      override def takeTail(t: Item1[T1#H]): T1#H                  = t.i1
      override def takeHead(t: Item1[T1#H]): T0#H                  = ReverseHListItem0
      override def sub: Plus[T0#T, T1#T, ItemTypeParameter1[T1#T]] = hlistPutInit[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]] = hlistPlusInit[ItemTypeParameter0, T1]
  def hlistPut1[T1 <: TypeParameter]: Plus[ItemTypeParameter0, T1, ItemTypeParameter1[T1]]  = hlistPutInit[ItemTypeParameter0, T1]
}
