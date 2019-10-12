package org.scalax.asuna.mapper
trait ItemTypeParameterPlus7 {
  val plus7Any: Plus[
    ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
    AnyTypeParameter,
    ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
  ] =
    new Plus[
      ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = p.add(item)
      override def takeTail(
        t: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): AnyTypeParameter#H = t.rightHead
      override def takeHead(
        t: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub: Plus[
        ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T
      ] = plus7Any
    }
  val put7Any: Plus[
    ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
    AnyTypeParameter,
    ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
  ] =
    new Plus[
      ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = p.pull(item)
      override def takeTail(
        t: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): AnyTypeParameter#H = t.leftHead
      override def takeHead(
        t: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub: Plus[
        ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T
      ] = put7Any
    }
  @inline def plus7[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter, T7 <: TypeParameter]
    : Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7]] =
    plus7Any.asInstanceOf[Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7]]]
  @inline def put7[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter, T7 <: TypeParameter]
    : Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, ItemTypeParameter7[T7, T1, T2, T3, T4, T5, T6]] =
    put7Any.asInstanceOf[Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, ItemTypeParameter7[T7, T1, T2, T3, T4, T5, T6]]]
}
object ItemTypeParameterPlus7 extends ItemTypeParameterPlus7
