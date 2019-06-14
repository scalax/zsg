package org.scalax.asuna.mapper.item
object ArticleXyyPlus16 {
  def plus16[
      T1 <: org.scalax.asuna.mapper.TypeParam
    , T2 <: org.scalax.asuna.mapper.TypeParam
    , T3 <: org.scalax.asuna.mapper.TypeParam
    , T4 <: org.scalax.asuna.mapper.TypeParam
    , T5 <: org.scalax.asuna.mapper.TypeParam
    , T6 <: org.scalax.asuna.mapper.TypeParam
    , T7 <: org.scalax.asuna.mapper.TypeParam
    , T8 <: org.scalax.asuna.mapper.TypeParam
    , T9 <: org.scalax.asuna.mapper.TypeParam
    , T10 <: org.scalax.asuna.mapper.TypeParam
    , T11 <: org.scalax.asuna.mapper.TypeParam
    , T12 <: org.scalax.asuna.mapper.TypeParam
    , T13 <: org.scalax.asuna.mapper.TypeParam
    , T14 <: org.scalax.asuna.mapper.TypeParam
    , T15 <: org.scalax.asuna.mapper.TypeParam
    , T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
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
    , T12
    , T13
    , T14
    , T15
    , T16
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
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
      , T12
      , T13
      , T14
      , T15
      , T16
    ]] {
      override def plus(
          p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
        , item: T16#H
      ): XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]                               = p.eat(item)
      override def takeHead(t: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]): T16#H = t.rightHead
      override def takeTail(
          t: XyyItem16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] = t.rightTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, EatXyyType16[
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
        , T12
        , T13
        , T14
        , T15
        , T16
      ]#T] = plus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def put16[
      T1 <: org.scalax.asuna.mapper.TypeParam
    , T2 <: org.scalax.asuna.mapper.TypeParam
    , T3 <: org.scalax.asuna.mapper.TypeParam
    , T4 <: org.scalax.asuna.mapper.TypeParam
    , T5 <: org.scalax.asuna.mapper.TypeParam
    , T6 <: org.scalax.asuna.mapper.TypeParam
    , T7 <: org.scalax.asuna.mapper.TypeParam
    , T8 <: org.scalax.asuna.mapper.TypeParam
    , T9 <: org.scalax.asuna.mapper.TypeParam
    , T10 <: org.scalax.asuna.mapper.TypeParam
    , T11 <: org.scalax.asuna.mapper.TypeParam
    , T12 <: org.scalax.asuna.mapper.TypeParam
    , T13 <: org.scalax.asuna.mapper.TypeParam
    , T14 <: org.scalax.asuna.mapper.TypeParam
    , T15 <: org.scalax.asuna.mapper.TypeParam
    , T16 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
      T16
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
    , T11
    , T12
    , T13
    , T14
    , T15
  ]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
        T16
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
      , T11
      , T12
      , T13
      , T14
      , T15
    ]] {
      override def plus(
          p: XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
        , item: T16#H
      ): XyyItem16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]                               = p.pudao(item)
      override def takeHead(t: XyyItem16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]): T16#H = t.leftHead
      override def takeTail(
          t: XyyItem16[T16#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H]
      ): XyyItem15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] = t.leftTail
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, EatXyyType16[
          T16
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
        , T11
        , T12
        , T13
        , T14
        , T15
      ]#T] = put16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
}
class TypeParam16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16] extends org.scalax.asuna.mapper.TypeParam {
  override type H = T1
  override type T = TypeParam15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
}
