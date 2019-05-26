package org.scalax.asuna.ii.item
object ArticleXyyPlus11 {
  def plus11[
      T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
    , T6 <: org.scalax.asuna.mapper.item.TypeParam
    , T7 <: org.scalax.asuna.mapper.item.TypeParam
    , T8 <: org.scalax.asuna.mapper.item.TypeParam
    , T9 <: org.scalax.asuna.mapper.item.TypeParam
    , T10 <: org.scalax.asuna.mapper.item.TypeParam
    , T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
          p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
        , item: T11#H
      ): XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]                               = p.eat(item)
      override def takeHead(t: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]): T11#H = t.rightHead
      override def takeTail(
          t: XyyItem11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = t.rightTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[
          T1
        , T2
        , T3
        , T4
        , T5
        , T6
        , T7
        , T8
        , T9
        , T10
        , T11
      ]#T] = plus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def put11[
      T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
    , T6 <: org.scalax.asuna.mapper.item.TypeParam
    , T7 <: org.scalax.asuna.mapper.item.TypeParam
    , T8 <: org.scalax.asuna.mapper.item.TypeParam
    , T9 <: org.scalax.asuna.mapper.item.TypeParam
    , T10 <: org.scalax.asuna.mapper.item.TypeParam
    , T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
          p: XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
        , item: T11#H
      ): XyyItem11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]                               = p.pudao(item)
      override def takeHead(t: XyyItem11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]): T11#H = t.leftHead
      override def takeTail(
          t: XyyItem11[T11#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H]
      ): XyyItem10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = t.leftTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[
          T11
        , T1
        , T2
        , T3
        , T4
        , T5
        , T6
        , T7
        , T8
        , T9
        , T10
      ]#T] = put11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
}
class TypeParam11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11] extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = T1
  override type T = TypeParam10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
}
