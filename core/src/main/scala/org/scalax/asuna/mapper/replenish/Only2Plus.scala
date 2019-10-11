package org.scalax.asuna.mapper

trait Only2Plus {
  def hlistPlus2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[T1, T2, ItemTypeParameter2[T1, T2]] =
    new Plus[T1, T2, ItemTypeParameter2[T1, T2]] {
      override def plus(p: T1#H, item: T2#H): Item2[T1#H, T2#H]        = HListItem0.add(p).add(item)
      override def takeTail(t: Item2[T1#H, T2#H]): T2#H                = t.i2
      override def takeHead(t: Item2[T1#H, T2#H]): T1#H                = t.i1
      override def sub: Plus[T1#T, T2#T, ItemTypeParameter2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[T1, T2, ItemTypeParameter2[T2, T1]] =
    new Plus[T1, T2, ItemTypeParameter2[T2, T1]] {
      override def plus(p: T1#H, item: T2#H): Item2[T2#H, T1#H]        = ReverseHListItem0.pull(p).pull(item)
      override def takeTail(t: Item2[T2#H, T1#H]): T2#H                = t.i1
      override def takeHead(t: Item2[T2#H, T1#H]): T1#H                = t.i2
      override def sub: Plus[T1#T, T2#T, ItemTypeParameter2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
}

object Only2Plus extends Only2Plus
