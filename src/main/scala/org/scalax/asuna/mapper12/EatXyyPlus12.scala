package org.scalax.asuna.ii.item
object ArticleXyyPlus12 {
  def plus12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]                               = p.eat(item)
      override def takeHead(t: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]): T12#H = t.rightHead
      override def takeTail(
        t: XyyItem12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] = t.rightTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, EatXyyType12[
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11,
        T12
      ]#T] = plus12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def put12[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam,
    T11 <: org.scalax.asuna.mapper.item.TypeParam,
    T12 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[T12, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[
      T12,
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def plus(
        p: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): XyyItem12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.pudao(item)
      override def takeHead(t: XyyItem12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T12#H = t.leftHead
      override def takeTail(
        t: XyyItem12[T12#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] = t.leftTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, EatXyyType12[
        T12,
        T1,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T11
      ]#T] = put12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
}
class TypeParam12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12] extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = T1
  override type T = TypeParam11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
}
