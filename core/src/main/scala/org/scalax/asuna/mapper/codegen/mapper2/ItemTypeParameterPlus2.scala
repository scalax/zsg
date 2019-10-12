package org.scalax.asuna.mapper
trait ItemTypeParameterPlus2 {
  val plus2Any: Plus[ItemTypeParameter1[AnyTypeParameter], AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] =
    new Plus[ItemTypeParameter1[AnyTypeParameter], AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: Item1[AnyTypeParameter#H], item: AnyTypeParameter#H): Item2[AnyTypeParameter#H, AnyTypeParameter#H]                     = p.add(item)
      override def takeTail(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                                                  = t.rightHead
      override def takeHead(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): Item1[AnyTypeParameter#H]                                           = t.rightTail
      override def sub: Plus[ItemTypeParameter1[AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T] = plus2Any
    }
  val put2Any: Plus[ItemTypeParameter1[AnyTypeParameter], AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] =
    new Plus[ItemTypeParameter1[AnyTypeParameter], AnyTypeParameter, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]] {
      override def plus(p: Item1[AnyTypeParameter#H], item: AnyTypeParameter#H): Item2[AnyTypeParameter#H, AnyTypeParameter#H]                     = p.pull(item)
      override def takeTail(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H                                                  = t.leftHead
      override def takeHead(t: Item2[AnyTypeParameter#H, AnyTypeParameter#H]): Item1[AnyTypeParameter#H]                                           = t.leftTail
      override def sub: Plus[ItemTypeParameter1[AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter2[AnyTypeParameter, AnyTypeParameter]#T] = put2Any
    }
  @inline def plus2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]] =
    plus2Any.asInstanceOf[Plus[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T1, T2]]]
  @inline def put2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T2, T1]] =
    put2Any.asInstanceOf[Plus[ItemTypeParameter1[T1], T2, ItemTypeParameter2[T2, T1]]]
}
object ItemTypeParameterPlus2 extends ItemTypeParameterPlus2
