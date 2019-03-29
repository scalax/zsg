package org.scalax.asuna.ii.item
object ArticleXyyPlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.item.TypeParam]: org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Plus[T0, T1, EatXyyType1[T1]] {
      override def plus(p: T0#H, item: T1#H): ArticleXyy1[T1#H]                          = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[T0#T, T1#T, EatXyyType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def plus1[T1 <: org.scalax.asuna.mapper.item.TypeParam] = miaomiaomiao1[EatXyyType0, T1]
  def put1[T1 <: org.scalax.asuna.mapper.item.TypeParam]  = plus1[T1]
  def plus2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, EatXyyType2[T1, T2]] {
      override def plus(p: ArticleXyy1[T1#H], item: T2#H): ArticleXyy2[T1#H, T2#H]                        = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, EatXyyType2[T1, T2]#T] = plus2[T1#T, T2#T]
    }
  def put2[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, EatXyyType2[T2, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1], T2, EatXyyType2[T2, T1]] {
      override def plus(p: ArticleXyy1[T1#H], item: T2#H): ArticleXyy2[T2#H, T1#H]                        = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType1[T1]#T, T2#T, EatXyyType2[T2, T1]#T] = put2[T1#T, T2#T]
    }
  def plus3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T1, T2, T3]] {
      override def plus(p: ArticleXyy2[T1#H, T2#H], item: T3#H): ArticleXyy3[T1#H, T2#H, T3#H]                    = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, EatXyyType3[T1, T2, T3]#T] = plus3[T1#T, T2#T, T3#T]
    }
  def put3[T1 <: org.scalax.asuna.mapper.item.TypeParam, T2 <: org.scalax.asuna.mapper.item.TypeParam, T3 <: org.scalax.asuna.mapper.item.TypeParam]
    : org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T3, T2, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2], T3, EatXyyType3[T3, T2, T1]] {
      override def plus(p: ArticleXyy2[T1#H, T2#H], item: T3#H): ArticleXyy3[T3#H, T2#H, T1#H]                    = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType2[T1, T2]#T, T3#T, EatXyyType3[T3, T2, T1]#T] = put3[T1#T, T2#T, T3#T]
    }
  def plus4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T1, T2, T3, T4]] {
      override def plus(p: ArticleXyy3[T1#H, T2#H, T3#H], item: T4#H): ArticleXyy4[T1#H, T2#H, T3#H, T4#H]                = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, EatXyyType4[T1, T2, T3, T4]#T] = plus4[T1#T, T2#T, T3#T, T4#T]
    }
  def put4[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T4, T2, T3, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T4, T2, T3, T1]] {
      override def plus(p: ArticleXyy3[T1#H, T2#H, T3#H], item: T4#H): ArticleXyy4[T4#H, T2#H, T3#H, T1#H]                = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, EatXyyType4[T4, T2, T3, T1]#T] = put4[T1#T, T2#T, T3#T, T4#T]
    }
  def plus5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T1, T2, T3, T4, T5]] {
      override def plus(p: ArticleXyy4[T1#H, T2#H, T3#H, T4#H], item: T5#H): ArticleXyy5[T1#H, T2#H, T3#H, T4#H, T5#H]            = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, EatXyyType5[T1, T2, T3, T4, T5]#T] = plus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def put5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T5, T2, T3, T4, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T5, T2, T3, T4, T1]] {
      override def plus(p: ArticleXyy4[T1#H, T2#H, T3#H, T4#H], item: T5#H): ArticleXyy5[T5#H, T2#H, T3#H, T4#H, T1#H]            = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, EatXyyType5[T5, T2, T3, T4, T1]#T] = put5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def plus6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: ArticleXyy5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): ArticleXyy6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, EatXyyType6[T1, T2, T3, T4, T5, T6]#T] =
        plus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def put6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T2, T3, T4, T5, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T2, T3, T4, T5, T1]] {
      override def plus(p: ArticleXyy5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): ArticleXyy6[T6#H, T2#H, T3#H, T4#H, T5#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, EatXyyType6[T6, T2, T3, T4, T5, T1]#T] =
        put6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def plus7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: ArticleXyy6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): ArticleXyy7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        plus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def put7[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T7, T2, T3, T4, T5, T6, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, EatXyyType7[T7, T2, T3, T4, T5, T6, T1]] {
      override def plus(p: ArticleXyy6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): ArticleXyy7[T7#H, T2#H, T3#H, T4#H, T5#H, T6#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, EatXyyType7[T7, T2, T3, T4, T5, T6, T1]#T] =
        put7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def plus8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: ArticleXyy7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): ArticleXyy8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        plus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def put8[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T8, T2, T3, T4, T5, T6, T7, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, EatXyyType8[T8, T2, T3, T4, T5, T6, T7, T1]] {
      override def plus(p: ArticleXyy7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): ArticleXyy8[T8#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, EatXyyType8[T8, T2, T3, T4, T5, T6, T7, T1]#T] =
        put8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def plus9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: ArticleXyy8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): ArticleXyy9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H] =
        p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        plus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def put9[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T9, T2, T3, T4, T5, T6, T7, T8, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, EatXyyType9[T9, T2, T3, T4, T5, T6, T7, T8, T1]] {
      override def plus(p: ArticleXyy8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): ArticleXyy9[T9#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T1#H] =
        p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, EatXyyType9[T9, T2, T3, T4, T5, T6, T7, T8, T1]#T] =
        put9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def plus10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {
      override def plus(
        p: ArticleXyy9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): ArticleXyy10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H] = p.eat(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T] =
        plus10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def put10[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam,
    T7 <: org.scalax.asuna.mapper.item.TypeParam,
    T8 <: org.scalax.asuna.mapper.item.TypeParam,
    T9 <: org.scalax.asuna.mapper.item.TypeParam,
    T10 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T10, T2, T3, T4, T5, T6, T7, T8, T9, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9], T10, EatXyyType10[T10, T2, T3, T4, T5, T6, T7, T8, T9, T1]] {
      override def plus(
        p: ArticleXyy9[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H],
        item: T10#H
      ): ArticleXyy10[T10#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T1#H] = p.pudao(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T, T10#T, EatXyyType10[T10, T2, T3, T4, T5, T6, T7, T8, T9, T1]#T] =
        put10[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T]
    }
  def plus11[
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
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {
      override def plus(
        p: ArticleXyy10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): ArticleXyy11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[
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
      ]#T] = plus11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
  def put11[
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
    T11 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T2, T3, T4, T5, T6, T7, T8, T9, T10, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], T11, EatXyyType11[T11, T2, T3, T4, T5, T6, T7, T8, T9, T10, T1]] {
      override def plus(
        p: ArticleXyy10[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H],
        item: T11#H
      ): ArticleXyy11[T11#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]#T, T11#T, EatXyyType11[
        T11,
        T2,
        T3,
        T4,
        T5,
        T6,
        T7,
        T8,
        T9,
        T10,
        T1
      ]#T] = put11[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T]
    }
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
        p: ArticleXyy11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): ArticleXyy12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H] = p.eat(item)
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
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[T12, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T1]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], T12, EatXyyType12[
      T12,
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
      T1
    ]] {
      override def plus(
        p: ArticleXyy11[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H],
        item: T12#H
      ): ArticleXyy12[T12#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]#T, T12#T, EatXyyType12[
        T12,
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
        T1
      ]#T] = put12[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T]
    }
  def plus13[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, EatXyyType13[
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
    T12,
    T13
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, EatXyyType13[
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
      T12,
      T13
    ]] {
      override def plus(
        p: ArticleXyy12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): ArticleXyy13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, EatXyyType13[
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
        T12,
        T13
      ]#T] = plus13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def put13[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, EatXyyType13[
    T13,
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
    T12,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], T13, EatXyyType13[
      T13,
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
      T12,
      T1
    ]] {
      override def plus(
        p: ArticleXyy12[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H],
        item: T13#H
      ): ArticleXyy13[T13#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]#T, T13#T, EatXyyType13[
        T13,
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
        T12,
        T1
      ]#T] = put13[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T]
    }
  def plus14[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, EatXyyType14[
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
    T12,
    T13,
    T14
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, EatXyyType14[
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
      T12,
      T13,
      T14
    ]] {
      override def plus(
        p: ArticleXyy13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): ArticleXyy14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, EatXyyType14[
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
        T12,
        T13,
        T14
      ]#T] = plus14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def put14[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, EatXyyType14[
    T14,
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
    T12,
    T13,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], T14, EatXyyType14[
      T14,
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
      T12,
      T13,
      T1
    ]] {
      override def plus(
        p: ArticleXyy13[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H],
        item: T14#H
      ): ArticleXyy14[T14#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]#T, T14#T, EatXyyType14[
        T14,
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
        T12,
        T13,
        T1
      ]#T] = put14[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T]
    }
  def plus15[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, EatXyyType15[
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
    T12,
    T13,
    T14,
    T15
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, EatXyyType15[
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
      T12,
      T13,
      T14,
      T15
    ]] {
      override def plus(
        p: ArticleXyy14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): ArticleXyy15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, EatXyyType15[
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
        T12,
        T13,
        T14,
        T15
      ]#T] = plus15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def put15[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, EatXyyType15[
    T15,
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
    T12,
    T13,
    T14,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], T15, EatXyyType15[
      T15,
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
      T12,
      T13,
      T14,
      T1
    ]] {
      override def plus(
        p: ArticleXyy14[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H],
        item: T15#H
      ): ArticleXyy15[T15#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]#T, T15#T, EatXyyType15[
        T15,
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
        T12,
        T13,
        T14,
        T1
      ]#T] = put15[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T]
    }
  def plus16[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
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
    T12,
    T13,
    T14,
    T15,
    T16
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
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
      T12,
      T13,
      T14,
      T15,
      T16
    ]] {
      override def plus(
        p: ArticleXyy15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): ArticleXyy16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, EatXyyType16[
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
        T12,
        T13,
        T14,
        T15,
        T16
      ]#T] = plus16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def put16[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
    T16,
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
    T12,
    T13,
    T14,
    T15,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], T16, EatXyyType16[
      T16,
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
      T12,
      T13,
      T14,
      T15,
      T1
    ]] {
      override def plus(
        p: ArticleXyy15[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H],
        item: T16#H
      ): ArticleXyy16[T16#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]#T, T16#T, EatXyyType16[
        T16,
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
        T12,
        T13,
        T14,
        T15,
        T1
      ]#T] = put16[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T]
    }
  def plus17[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, EatXyyType17[
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, EatXyyType17[
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17
    ]] {
      override def plus(
        p: ArticleXyy16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): ArticleXyy17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, EatXyyType17[
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
        T12,
        T13,
        T14,
        T15,
        T16,
        T17
      ]#T] = plus17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def put17[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, EatXyyType17[
    T17,
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], T17, EatXyyType17[
      T17,
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T1
    ]] {
      override def plus(
        p: ArticleXyy16[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H],
        item: T17#H
      ): ArticleXyy17[T17#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]#T, T17#T, EatXyyType17[
        T17,
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
        T12,
        T13,
        T14,
        T15,
        T16,
        T1
      ]#T] = put17[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T]
    }
  def plus18[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, EatXyyType18[
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, EatXyyType18[
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18
    ]] {
      override def plus(
        p: ArticleXyy17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): ArticleXyy18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H] = p.eat(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, EatXyyType18[
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
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T18
      ]#T] = plus18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def put18[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, EatXyyType18[
    T18,
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], T18, EatXyyType18[
      T18,
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T1
    ]] {
      override def plus(
        p: ArticleXyy17[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H],
        item: T18#H
      ): ArticleXyy18[T18#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T1#H] = p.pudao(item)
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]#T, T18#T, EatXyyType18[
        T18,
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
        T12,
        T13,
        T14,
        T15,
        T16,
        T17,
        T1
      ]#T] = put18[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T]
    }
  def plus19[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, EatXyyType19[
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, EatXyyType19[
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ]] {
      override def plus(
        p: ArticleXyy18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): ArticleXyy19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H] = p.eat(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, EatXyyType19[
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19
        ]#T] = plus19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def put19[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, EatXyyType19[
    T19,
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], T19, EatXyyType19[
      T19,
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T1
    ]] {
      override def plus(
        p: ArticleXyy18[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H],
        item: T19#H
      ): ArticleXyy19[T19#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T1#H] = p.pudao(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]#T, T19#T, EatXyyType19[
          T19,
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T1
        ]#T] = put19[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T]
    }
  def plus20[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, EatXyyType20[
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, EatXyyType20[
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20
    ]] {
      override def plus(
        p: ArticleXyy19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): ArticleXyy20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H] = p.eat(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, EatXyyType20[
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20
        ]#T] = plus20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def put20[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, EatXyyType20[
    T20,
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19], T20, EatXyyType20[
      T20,
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T1
    ]] {
      override def plus(
        p: ArticleXyy19[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H],
        item: T20#H
      ): ArticleXyy20[T20#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T1#H] = p.pudao(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]#T, T20#T, EatXyyType20[
          T20,
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T1
        ]#T] = put20[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T]
    }
  def plus21[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, EatXyyType21[
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, EatXyyType21[
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T21
    ]] {
      override def plus(
        p: ArticleXyy20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): ArticleXyy21[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T21#H] =
        p.eat(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, EatXyyType21[
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T21
        ]#T] = plus21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
  def put21[
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
    T12 <: org.scalax.asuna.mapper.item.TypeParam,
    T13 <: org.scalax.asuna.mapper.item.TypeParam,
    T14 <: org.scalax.asuna.mapper.item.TypeParam,
    T15 <: org.scalax.asuna.mapper.item.TypeParam,
    T16 <: org.scalax.asuna.mapper.item.TypeParam,
    T17 <: org.scalax.asuna.mapper.item.TypeParam,
    T18 <: org.scalax.asuna.mapper.item.TypeParam,
    T19 <: org.scalax.asuna.mapper.item.TypeParam,
    T20 <: org.scalax.asuna.mapper.item.TypeParam,
    T21 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, EatXyyType21[
    T21,
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
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T1
  ]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20], T21, EatXyyType21[
      T21,
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
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19,
      T20,
      T1
    ]] {
      override def plus(
        p: ArticleXyy20[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H],
        item: T21#H
      ): ArticleXyy21[T21#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H, T10#H, T11#H, T12#H, T13#H, T14#H, T15#H, T16#H, T17#H, T18#H, T19#H, T20#H, T1#H] =
        p.pudao(item)
      override def sub
        : org.scalax.asuna.mapper.item.Plus[EatXyyType20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]#T, T21#T, EatXyyType21[
          T21,
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
          T12,
          T13,
          T14,
          T15,
          T16,
          T17,
          T18,
          T19,
          T20,
          T1
        ]#T] = put21[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T, T10#T, T11#T, T12#T, T13#T, T14#T, T15#T, T16#T, T17#T, T18#T, T19#T, T20#T, T21#T]
    }
}
