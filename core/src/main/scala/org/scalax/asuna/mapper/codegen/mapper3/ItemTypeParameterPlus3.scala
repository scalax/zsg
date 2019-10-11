package org.scalax.asuna.mapper
trait ItemTypeParameterPlus3 {
  val plus3Any: Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]] =
    new Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: Item2[AnyTypeParameter#H, AnyTypeParameter#H], item: AnyTypeParameter#H): Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] =
        p.add(item)
      override def takeTail(t: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                            = t.rightHead
      override def takeHead(t: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): Item2[AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub
        : Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T] =
        plus3Any
    }
  val put3Any: Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]] =
    new Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: Item2[AnyTypeParameter#H, AnyTypeParameter#H], item: AnyTypeParameter#H): Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] =
        p.pull(item)
      override def takeTail(t: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                            = t.leftHead
      override def takeHead(t: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): Item2[AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub
        : Plus[ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T] =
        put3Any
    }
  @inline def plus3[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter]: Plus[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T1, T2, T3]] =
    plus3Any.asInstanceOf[Plus[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T1, T2, T3]]]
  @inline def put3[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter]: Plus[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T3, T1, T2]] =
    put3Any.asInstanceOf[Plus[ItemTypeParameter2[T1, T2], T3, ItemTypeParameter3[T3, T1, T2]]]
}
object ItemTypeParameterPlus3 extends ItemTypeParameterPlus3
