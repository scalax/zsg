package org.scalax.asuna.ii.item
object ArticleXyyPlus5 {
  def plus5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T1, T2, T3, T4, T5]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H]                  = p.eat(item)
      override def takeHead(t: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H]): T5#H                                                      = t.rightHead
      override def takeTail(t: XyyItem5[T1#H, T2#H, T3#H, T4#H, T5#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H]                          = t.rightTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, EatXyyType5[T1, T2, T3, T4, T5]#T] = plus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def put5[
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ]: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4], T5, EatXyyType5[T5, T1, T2, T3, T4]] {
      override def plus(p: XyyItem4[T1#H, T2#H, T3#H, T4#H], item: T5#H): XyyItem5[T5#H, T1#H, T2#H, T3#H, T4#H]                  = p.pudao(item)
      override def takeHead(t: XyyItem5[T5#H, T1#H, T2#H, T3#H, T4#H]): T5#H                                                      = t.leftHead
      override def takeTail(t: XyyItem5[T5#H, T1#H, T2#H, T3#H, T4#H]): XyyItem4[T1#H, T2#H, T3#H, T4#H]                          = t.leftTail
      override def sub: org.scalax.asuna.mapper.item.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, EatXyyType5[T5, T1, T2, T3, T4]#T] = put5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
}
class TypeParam5[T1, T2, T3, T4, T5] extends org.scalax.asuna.mapper.item.TypeParam {
  override type H = T1
  override type T = TypeParam4[T2, T3, T4, T5]
}
object TypeParam5 {
  type Aux[T1, T2, T3, T4, T5] = org.scalax.asuna.mapper.item.TypeParam {
    type H = T1
    type T <: TypeParam4.Aux[T2, T3, T4, T5]
  }
}
