package org.scalax.asuna.mapper.item
object ArticleXyyPlus1 {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam, E1 <: EatXyyType1[T1]](t0: T0, t1: T1, e1: E1): org.scalax.asuna.mapper.Plus[T0, T1, E1] = {
    new org.scalax.asuna.mapper.Plus[T0, T1, E1](t0, t1, e1) {
      override def plus(p: t0.H, item: t1.H): Item1[t1.H]                                = HListItem0.eat(item)
      override def takeHead(t: Item1[t1.H]): t1.H                                        = t.i1
      override def takeTail(t: Item1[t1.H]): t0.H                                        = HListItem0
      override lazy val sub: org.scalax.asuna.mapper.Plus[t0.T, t1.T, EatXyyType1[t1.T]] = miaomiaomiao1[t0.T, t1.T, EatXyyType1[t1.T]](t0.tail, t1.tail, new EatXyyType1(t1.tail) {})
    }
  }
  /*def miaomiaomiao2[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam](t0: T0, t1: T1, eatT1: EatXyyType1[T1]): org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, EatXyyType1[T1]](t0, t1, eatT1) {
      override def plus(p: t0.H, item: t1.H): Item1[t1.H]                      = ReverseHListItem0.pudao(item)
      override def takeHead(t: Item1[t1.H]): t1.H                              = t.i1
      override def takeTail(t: Item1[t1.H]): t0.H                              = ReverseHListItem0
      override lazy val sub: org.scalax.asuna.mapper.Plus[t0.T, t1.T, eatT1.T] = miaomiaomiao2[t0.T, t1.T](t0.tail, t1.tail, eatT1.tail)
    }*/
  def hlistPlus1[T1 <: org.scalax.asuna.mapper.TypeParam](t1: T1) = miaomiaomiao1[EatXyyType0, T1, EatXyyType1[T1]](new EatXyyType0, t1, new EatXyyType1[T1](t1) {})
  //def hlistPut1[T1 <: org.scalax.asuna.mapper.TypeParam](t1: T1)  = miaomiaomiao2[EatXyyType0, T1](new EatXyyType0, t1, new EatXyyType1(t1) {})
}

class TypeParam1[T1] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = org.scalax.asuna.mapper.EndParam
  override lazy val tail: org.scalax.asuna.mapper.EndParam = org.scalax.asuna.mapper.EndParam.value
}
