package org.scalax.asuna.mapper
trait ItemTypeParameterPlus5 {
  val plus5Any: Plus[ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter5[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = p.add(item)
      override def takeTail(t: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H =
        t.rightHead
      override def takeHead(
        t: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub: Plus[ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter5[
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter
      ]#T] = plus5Any
    }
  val put5Any: Plus[ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter5[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter5[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]                                            = p.pull(item)
      override def takeTail(t: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H = t.leftHead
      override def takeHead(
        t: Item5[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub: Plus[ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter5[
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter
      ]#T] = put5Any
    }
  @inline def plus5[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter]
    : Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, ItemTypeParameter5[T1, T2, T3, T4, T5]] =
    plus5Any.asInstanceOf[Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, ItemTypeParameter5[T1, T2, T3, T4, T5]]]
  @inline def put5[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter]
    : Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, ItemTypeParameter5[T5, T1, T2, T3, T4]] =
    put5Any.asInstanceOf[Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, ItemTypeParameter5[T5, T1, T2, T3, T4]]]
}
object ItemTypeParameterPlus5 extends ItemTypeParameterPlus5
