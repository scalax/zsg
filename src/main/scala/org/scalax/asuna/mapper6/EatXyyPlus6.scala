package org.scalax.asuna.ii.item
object ArticleXyyPlus6 {
  def plus6[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam,
    T6 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eat(item)
      override def takeHead(t: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                           = t.rightHead
      override def takeTail(t: XyyItem6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H]         = t.rightTail
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
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): XyyItem6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudao(item)
      override def takeHead(t: XyyItem6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                           = t.leftHead
      override def takeTail(t: XyyItem6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H]         = t.leftTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, EatXyyType6[T6, T1, T2, T3, T4, T5]#T] =
        put6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
}
