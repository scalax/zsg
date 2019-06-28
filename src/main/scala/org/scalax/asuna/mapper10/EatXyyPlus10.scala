package org.scalax.asuna.mapper.item
object ArticleXyyPlus10 {
  def plus10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: Item9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.eat(item)
      override def takeHead(t: Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T10#H = t.rightHead
      override def takeTail(t: Item10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): Item9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        t.rightTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T] =
        plus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def put10[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(
        p: Item9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): Item10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]                               = p.pudao(item)
      override def takeHead(t: Item10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): T10#H = t.leftHead
      override def takeTail(t: Item10[T10#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H]): Item9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        t.leftTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, EatXyyType10[T10, T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        put10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
}
class TypeParam10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam9[T2, T3, T4, T5, T6, T7, T8, T9, T10]
}
