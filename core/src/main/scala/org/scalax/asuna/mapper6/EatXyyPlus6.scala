package org.scalax.asuna.mapper
object ArticleXyyPlus6 {
  def plus6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eat(item)
      override def takeTail(t: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                        = t.rightHead
      override def takeHead(t: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H]         = t.rightTail
      override def sub: Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, EatXyyType6[T1, T2, T3, T4, T5, T6]#T]           = plus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def put6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T1, T2, T3, T4, T5]] =
    new Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, EatXyyType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Item6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudao(item)
      override def takeTail(t: Item6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                        = t.leftHead
      override def takeHead(t: Item6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H]         = t.leftTail
      override def sub: Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, EatXyyType6[T6, T1, T2, T3, T4, T5]#T]           = put6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
}
class TypeParam6[T1, T2, T3, T4, T5, T6] extends TypeParameter {
  override type H = T1
  override type T = TypeParam5[T2, T3, T4, T5, T6]
}
