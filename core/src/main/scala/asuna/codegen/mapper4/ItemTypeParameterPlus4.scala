package asuna
trait ItemTypeParameterPlus4 {
  val plus4Any: Plus[ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter4[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]                                            = p.add(item)
      override def takeTail(t: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H = t.rightHead
      override def takeHead(
        t: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub: Plus[ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter4[
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter
      ]#T] = plus4Any
    }
  val put4Any: Plus[ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter], AnyTypeParameter, ItemTypeParameter4[
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter,
    AnyTypeParameter
  ]] =
    new Plus[
      ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter4[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]                                            = p.pull(item)
      override def takeTail(t: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]): AnyTypeParameter#H = t.leftHead
      override def takeHead(
        t: Item4[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H]
      ): Item3[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub: Plus[ItemTypeParameter3[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T, AnyTypeParameter#T, ItemTypeParameter4[
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter,
        AnyTypeParameter
      ]#T] = put4Any
    }
  @inline def plus4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]
    : Plus[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T1, T2, T3, T4]] =
    plus4Any.asInstanceOf[Plus[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T1, T2, T3, T4]]]
  @inline def put4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]
    : Plus[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T4, T1, T2, T3]] =
    put4Any.asInstanceOf[Plus[ItemTypeParameter3[T1, T2, T3], T4, ItemTypeParameter4[T4, T1, T2, T3]]]
}
object ItemTypeParameterPlus4 extends ItemTypeParameterPlus4
