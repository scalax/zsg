package asuna
final class TupleTypeHList0 extends TypeHList {
  override final type H = AsunaTuple0
  override final type T = TupleTypeHList0
}
final class TupleTypeHList1[E1 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple1[E1#H]
  override final type T = TupleTypeHList1[E1#T]
}
final class TupleTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple2[E1#H, E2#H]
  override final type T = TupleTypeHList2[E1#T, E2#T]
}
final class TupleTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple3[E1#H, E2#H, E3#H]
  override final type T = TupleTypeHList3[E1#T, E2#T, E3#T]
}
final class TupleTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple4[E1#H, E2#H, E3#H, E4#H]
  override final type T = TupleTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
final class TupleTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple5[E1#H, E2#H, E3#H, E4#H, E5#H]
  override final type T = TupleTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
final class TupleTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple6[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H]
  override final type T = TupleTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
final class TupleTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override final type H = AsunaTuple7[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H]
  override final type T = TupleTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
final class TupleTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
    extends TypeHList {
  override final type H = AsunaTuple8[E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H]
  override final type T = TupleTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
