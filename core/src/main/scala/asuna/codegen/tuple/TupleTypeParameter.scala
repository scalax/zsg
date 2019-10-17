package asuna
class TupleTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H)
  override type T = TupleTypeHList2[E1#T, E2#T]
}
class TupleTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H)
  override type T = TupleTypeHList3[E1#T, E2#T, E3#T]
}
class TupleTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H)
  override type T = TupleTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
class TupleTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H)
  override type T = TupleTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class TupleTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H)
  override type T = TupleTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class TupleTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H)
  override type T = TupleTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
class TupleTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
    extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H)
  override type T = TupleTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
class TupleTypeHList9[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H)
  override type T = TupleTypeHList9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
}
class TupleTypeHList10[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H)
  override type T = TupleTypeHList10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
}
class TupleTypeHList11[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H)
  override type T = TupleTypeHList11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
}
class TupleTypeHList12[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H)
  override type T = TupleTypeHList12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
}
class TupleTypeHList13[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H)
  override type T = TupleTypeHList13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
}
class TupleTypeHList14[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H)
  override type T = TupleTypeHList14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
}
class TupleTypeHList15[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H)
  override type T = TupleTypeHList15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
}
class TupleTypeHList16[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H)
  override type T = TupleTypeHList16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
}
class TupleTypeHList17[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H)
  override type T = TupleTypeHList17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
}
class TupleTypeHList18[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList,
  E18 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H)
  override type T = TupleTypeHList18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
}
class TupleTypeHList19[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList,
  E18 <: TypeHList,
  E19 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H)
  override type T = TupleTypeHList19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
}
class TupleTypeHList20[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList,
  E18 <: TypeHList,
  E19 <: TypeHList,
  E20 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H, E20#H)
  override type T = TupleTypeHList20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
}
class TupleTypeHList21[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList,
  E18 <: TypeHList,
  E19 <: TypeHList,
  E20 <: TypeHList,
  E21 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H, E20#H, E21#H)
  override type T =
    TupleTypeHList21[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T]
}
class TupleTypeHList22[
  E1 <: TypeHList,
  E2 <: TypeHList,
  E3 <: TypeHList,
  E4 <: TypeHList,
  E5 <: TypeHList,
  E6 <: TypeHList,
  E7 <: TypeHList,
  E8 <: TypeHList,
  E9 <: TypeHList,
  E10 <: TypeHList,
  E11 <: TypeHList,
  E12 <: TypeHList,
  E13 <: TypeHList,
  E14 <: TypeHList,
  E15 <: TypeHList,
  E16 <: TypeHList,
  E17 <: TypeHList,
  E18 <: TypeHList,
  E19 <: TypeHList,
  E20 <: TypeHList,
  E21 <: TypeHList,
  E22 <: TypeHList
] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H, E9#H, E10#H, E11#H, E12#H, E13#H, E14#H, E15#H, E16#H, E17#H, E18#H, E19#H, E20#H, E21#H, E22#H)
  override type T =
    TupleTypeHList22[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T, E22#T]
}
