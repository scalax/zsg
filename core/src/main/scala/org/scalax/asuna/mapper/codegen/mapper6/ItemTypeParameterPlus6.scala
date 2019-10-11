package org.scalax.asuna.mapper
trait ItemTypeParameterPlus6 {
  val plus6Any: Plus[ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter6[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = p.add(item)
      override def takeTail(
        t: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): AnyTypeParameter#H = t.rightHead
      override def takeHead(
        t: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub: Plus[
        ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T
      ] = plus6Any
    }
  val put6Any: Plus[ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter6[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = p.pull(item)
      override def takeTail(
        t: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): AnyTypeParameter#H = t.leftHead
      override def takeHead(
        t: Item6[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub: Plus[
        ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter6[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T
      ] = put6Any
    }
  @inline def plus6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, ItemTypeParameter6[T1, T2, T3, T4, T5, T6]] =
    plus6Any.asInstanceOf[Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, ItemTypeParameter6[T1, T2, T3, T4, T5, T6]]]
  @inline def put6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, ItemTypeParameter6[T6, T1, T2, T3, T4, T5]] =
    put6Any.asInstanceOf[Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, ItemTypeParameter6[T6, T1, T2, T3, T4, T5]]]
}
object ItemTypeParameterPlus6 extends ItemTypeParameterPlus6
