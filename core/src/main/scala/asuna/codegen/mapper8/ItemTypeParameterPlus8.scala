package asuna
trait ItemTypeParameterPlus8 {
  val plus8Any: Plus[
    ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
    AnyTypeParameter,
    ItemTypeParameter8[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
  ] =
    new Plus[
      ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter8[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item8[
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H
      ] = p.add(item)
      override def takeTail(
        t: Item8[
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H
        ]
      ): AnyTypeParameter#H = t.rightHead
      override def takeHead(
        t: Item8[
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H
        ]
      ): Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.rightTail
      override def sub: Plus[
        ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter8[
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter
        ]#T
      ] = plus8Any
    }
  val put8Any: Plus[
    ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
    AnyTypeParameter,
    ItemTypeParameter8[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
  ] =
    new Plus[
      ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter],
      AnyTypeParameter,
      ItemTypeParameter8[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]
    ] {
      override def plus(
        p: Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H],
        item: AnyTypeParameter#H
      ): Item8[
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H,
        AnyTypeParameter#H
      ] = p.pull(item)
      override def takeTail(
        t: Item8[
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H
        ]
      ): AnyTypeParameter#H = t.leftHead
      override def takeHead(
        t: Item8[
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H,
          AnyTypeParameter#H
        ]
      ): Item7[AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H, AnyTypeParameter#H] = t.leftTail
      override def sub: Plus[
        ItemTypeParameter7[AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter, AnyTypeParameter]#T,
        AnyTypeParameter#T,
        ItemTypeParameter8[
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter,
          AnyTypeParameter
        ]#T
      ] = put8Any
    }
  @inline def plus8[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter
  ]: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    plus8Any.asInstanceOf[Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  @inline def put8[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter
  ]: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeParameter8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    put8Any.asInstanceOf[Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, ItemTypeParameter8[T8, T1, T2, T3, T4, T5, T6, T7]]]
}
object ItemTypeParameterPlus8 extends ItemTypeParameterPlus8
