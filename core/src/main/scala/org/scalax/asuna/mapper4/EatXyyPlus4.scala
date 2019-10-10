package org.scalax.asuna.mapper
object ArticleXyyPlus4 {
  def plus4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]: Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T1, T2, T3, T4]] =
    new Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Item4[T1#H, T2#H, T3#H, T4#H] = p.eat(item)
      override def takeTail(t: Item4[T1#H, T2#H, T3#H, T4#H]): T4#H                            = t.rightHead
      override def takeHead(t: Item4[T1#H, T2#H, T3#H, T4#H]): Item3[T1#H, T2#H, T3#H]         = t.rightTail
      override def sub: Plus[EatXyyType3[T1, T2, T3]#T, T4#T, EatXyyType4[T1, T2, T3, T4]#T]   = plus4[T1#T, T2#T, T3#T, T4#T]
    }
  def put4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]: Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T4, T1, T2, T3]] =
    new Plus[EatXyyType3[T1, T2, T3], T4, EatXyyType4[T4, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Item4[T4#H, T1#H, T2#H, T3#H] = p.pudao(item)
      override def takeTail(t: Item4[T4#H, T1#H, T2#H, T3#H]): T4#H                            = t.leftHead
      override def takeHead(t: Item4[T4#H, T1#H, T2#H, T3#H]): Item3[T1#H, T2#H, T3#H]         = t.leftTail
      override def sub: Plus[EatXyyType3[T1, T2, T3]#T, T4#T, EatXyyType4[T4, T1, T2, T3]#T]   = put4[T1#T, T2#T, T3#T, T4#T]
    }
}
class TypeParam4[T1, T2, T3, T4] extends TypeParameter {
  override type H = T1
  override type T = TypeParam3[T2, T3, T4]
}
