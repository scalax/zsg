package asuna
class ItemTypeHList0 extends TypeHList {
  override type H = Item0
  override type T = ItemTypeHList0
}
class ItemTypeHList1[E1 <: TypeHList] extends TypeHList {
  override type H = Item1[E1#H]
  override type T = ItemTypeHList1[E1#T]
}
class ItemTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override type H = Item2[E1#H, E2#H]
  override type T = ItemTypeHList2[E1#T, E2#T]
}
class ItemTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = Item3[E1#H, E2#H, E3#H]
  override type T = ItemTypeHList3[E1#T, E2#T, E3#T]
}
class ItemTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override type H = Item4[E1#H, E2#H, E3#H, E4#H]
  override type T = ItemTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
class ItemTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override type H = Item5[E1#H, E2#H, E3#H, E4#H, E5#H]
  override type T = ItemTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class ItemTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override type H = Item6[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H]
  override type T = ItemTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class ItemTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override type H = Item7[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H]
  override type T = ItemTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
class ItemTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
    extends TypeHList {
  override type H = Item8[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H]
  override type T = ItemTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
