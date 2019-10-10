package org.scalax.asuna.mapper

object ArticleXyyPlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: TypeParameter]: Plus[T0, T1, EatXyyType1[T1]] =
    new Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]   = HListItem0.add(item)
      override def takeTail(t: Item1[T1#H]): T1#H           = t.i1
      override def takeHead(t: Item1[T1#H]): T0#H           = HListItem0
      override def sub: Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def miaomiaomiao2[T0 <: EatXyyType0, T1 <: TypeParameter]: Plus[T0, T1, EatXyyType1[T1]] =
    new Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]   = ReverseHListItem0.pull(item)
      override def takeTail(t: Item1[T1#H]): T1#H           = t.i1
      override def takeHead(t: Item1[T1#H]): T0#H           = ReverseHListItem0
      override def sub: Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao2[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: TypeParameter] = miaomiaomiao1[EatXyyType0, T1]
  def hlistPut1[T1 <: TypeParameter]  = miaomiaomiao2[EatXyyType0, T1]
}

class TypeParam1[T1] extends TypeParameter {
  override type H = T1
  override type T = EndParameter
}
