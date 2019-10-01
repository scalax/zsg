package org.scalax.asuna.mapper.item
object ArticleXyyPlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]                           = HListItem0.eat(item)
      override def takeHead(t: Item1[T1#H]): T1#H                                   = t.i1
      override def takeTail(t: Item1[T1#H]): T0#H                                   = HListItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def miaomiaomiao2[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]                           = ReverseHListItem0.pudao(item)
      override def takeHead(t: Item1[T1#H]): T1#H                                   = t.i1
      override def takeTail(t: Item1[T1#H]): T0#H                                   = ReverseHListItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao2[T0#T, T1#T]
    }
  def miaomiaomiao3[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]                           = TreeItem0.eat(item)
      override def takeHead(t: Item1[T1#H]): T1#H                                   = t.i1
      override def takeTail(t: Item1[T1#H]): T0#H                                   = TreeItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao3[T0#T, T1#T]
    }
  def miaomiaomiao4[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Item1[T1#H]                           = ReverseTreeItem0.pudao(item)
      override def takeHead(t: Item1[T1#H]): T1#H                                   = t.i1
      override def takeTail(t: Item1[T1#H]): T0#H                                   = ReverseTreeItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao4[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: org.scalax.asuna.mapper.TypeParam] = miaomiaomiao1[EatXyyType0, T1]
  def hlistPut1[T1 <: org.scalax.asuna.mapper.TypeParam]  = miaomiaomiao2[EatXyyType0, T1]
  def item2Plus1[T1 <: org.scalax.asuna.mapper.TypeParam] = miaomiaomiao3[EatXyyType0, T1]
  def item2Put1[T1 <: org.scalax.asuna.mapper.TypeParam]  = miaomiaomiao4[EatXyyType0, T1]

}

class TypeParam1[T1] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = org.scalax.asuna.mapper.EndParam
}
