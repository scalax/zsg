package org.scalax.asuna.mapper.item
object ArticleXyyPlus7 {
  def plus7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eat(item)
      override def takeHead(t: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T7#H                                              = t.rightHead
      override def takeTail(t: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]         = t.rightTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        plus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def put7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Item7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.pudao(item)
      override def takeHead(t: Item7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T7#H                                              = t.leftHead
      override def takeTail(t: Item7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]         = t.leftTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, EatXyyType7[T7, T1, T2, T3, T4, T5, T6]#T] =
        put7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
}
class TypeParam7[T1, T2, T3, T4, T5, T6, T7] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam6[T2, T3, T4, T5, T6, T7]
}
