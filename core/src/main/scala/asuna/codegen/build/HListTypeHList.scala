package asuna
class HListTypeHList0 extends TypeHList {
  override type H = HNil
  override type T = HListTypeHList0
}
class HListTypeHList1[E1 <: TypeHList] extends TypeHList {
  override type H = E1#H :: HNil
  override type T = HListTypeHList1[E1#T]
}
class HListTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override type H = E2#H :: E1#H :: HNil
  override type T = HListTypeHList2[E1#T, E2#T]
}
class HListTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = E3#H :: E2#H :: E1#H :: HNil
  override type T = HListTypeHList3[E1#T, E2#T, E3#T]
}
class HListTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override type H = E4#H :: E3#H :: E2#H :: E1#H :: HNil
  override type T = HListTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
class HListTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override type H = E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
  override type T = HListTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class HListTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override type H = E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
  override type T = HListTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class HListTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override type H = E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
  override type T = HListTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
