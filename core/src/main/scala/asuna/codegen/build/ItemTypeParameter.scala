package asuna
class ItemTypeParameter0 extends TypeParameter {
  override type H = Item0
  override type T = ItemTypeParameter0
}
class ItemTypeParameter1[E1 <: TypeParameter] extends TypeParameter {
  override type H = Item1[E1#H]
  override type T = ItemTypeParameter1[E1#T]
}
class ItemTypeParameter2[E1 <: TypeParameter, E2 <: TypeParameter] extends TypeParameter {
  override type H = Item2[E1#H, E2#H]
  override type T = ItemTypeParameter2[E1#T, E2#T]
}
class ItemTypeParameter3[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter] extends TypeParameter {
  override type H = Item3[E1#H, E2#H, E3#H]
  override type T = ItemTypeParameter3[E1#T, E2#T, E3#T]
}
class ItemTypeParameter4[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter, E4 <: TypeParameter] extends TypeParameter {
  override type H = Item4[E1#H, E2#H, E3#H, E4#H]
  override type T = ItemTypeParameter4[E1#T, E2#T, E3#T, E4#T]
}
class ItemTypeParameter5[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter, E4 <: TypeParameter, E5 <: TypeParameter] extends TypeParameter {
  override type H = Item5[E1#H, E2#H, E3#H, E4#H, E5#H]
  override type T = ItemTypeParameter5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class ItemTypeParameter6[E1 <: TypeParameter, E2 <: TypeParameter, E3 <: TypeParameter, E4 <: TypeParameter, E5 <: TypeParameter, E6 <: TypeParameter]
    extends TypeParameter {
  override type H = Item6[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H]
  override type T = ItemTypeParameter6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class ItemTypeParameter7[
  E1 <: TypeParameter,
  E2 <: TypeParameter,
  E3 <: TypeParameter,
  E4 <: TypeParameter,
  E5 <: TypeParameter,
  E6 <: TypeParameter,
  E7 <: TypeParameter
] extends TypeParameter {
  override type H = Item7[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H]
  override type T = ItemTypeParameter7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
class ItemTypeParameter8[
  E1 <: TypeParameter,
  E2 <: TypeParameter,
  E3 <: TypeParameter,
  E4 <: TypeParameter,
  E5 <: TypeParameter,
  E6 <: TypeParameter,
  E7 <: TypeParameter,
  E8 <: TypeParameter
] extends TypeParameter {
  override type H = Item8[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H]
  override type T = ItemTypeParameter8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
