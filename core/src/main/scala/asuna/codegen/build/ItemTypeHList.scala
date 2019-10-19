package asuna
class TupleTypeHList0 extends TypeHList {
  override type H = AsunaTuple0
  override type T = TupleTypeHList0
}
class TupleTypeHList1[E1 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple1[E1#H]
  override type T = TupleTypeHList1[E1#T]
}
class TupleTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple2[E1#H, E2#H]
  override type T = TupleTypeHList2[E1#T, E2#T]
}
class TupleTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple3[E1#H, E2#H, E3#H]
  override type T = TupleTypeHList3[E1#T, E2#T, E3#T]
}
class TupleTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple4[E1#H, E2#H, E3#H, E4#H]
  override type T = TupleTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
class TupleTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple5[E1#H, E2#H, E3#H, E4#H, E5#H]
  override type T = TupleTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class TupleTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple6[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H]
  override type T = TupleTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class TupleTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override type H = AsunaTuple7[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H]
  override type T = TupleTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
class TupleTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
    extends TypeHList {
  override type H = AsunaTuple8[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H]
  override type T = TupleTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
