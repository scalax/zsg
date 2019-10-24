package asuna.tuple
import asuna._
class ScalaTupleTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H)
  override type T = ScalaTupleTypeHList2[E1#T, E2#T]
}
class ScalaTupleTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H)
  override type T = ScalaTupleTypeHList3[E1#T, E2#T, E3#T]
}
class ScalaTupleTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H)
  override type T = ScalaTupleTypeHList4[E1#T, E2#T, E3#T, E4#T]
}
class ScalaTupleTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H)
  override type T = ScalaTupleTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
}
class ScalaTupleTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H)
  override type T = ScalaTupleTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
}
class ScalaTupleTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList] extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H)
  override type T = ScalaTupleTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
}
class ScalaTupleTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
    extends TypeHList {
  override type H = (E1#H, E2#H, E3#H, E4#H, E5#H, E6#H, E7#H, E8#H)
  override type T = ScalaTupleTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
}
class ScalaTupleTypeHList9[
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
  override type T = ScalaTupleTypeHList9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
}
class ScalaTupleTypeHList10[
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
  override type T = ScalaTupleTypeHList10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
}
class ScalaTupleTypeHList11[
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
  override type T = ScalaTupleTypeHList11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
}
class ScalaTupleTypeHList12[
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
  override type T = ScalaTupleTypeHList12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
}
class ScalaTupleTypeHList13[
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
  override type T = ScalaTupleTypeHList13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
}
class ScalaTupleTypeHList14[
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
  override type T = ScalaTupleTypeHList14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
}
class ScalaTupleTypeHList15[
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
  override type T = ScalaTupleTypeHList15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
}
class ScalaTupleTypeHList16[
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
  override type T = ScalaTupleTypeHList16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
}
class ScalaTupleTypeHList17[
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
  override type T = ScalaTupleTypeHList17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
}
class ScalaTupleTypeHList18[
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
  override type T = ScalaTupleTypeHList18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
}
class ScalaTupleTypeHList19[
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
  override type T = ScalaTupleTypeHList19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
}
class ScalaTupleTypeHList20[
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
  override type T =
    ScalaTupleTypeHList20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
}
class ScalaTupleTypeHList21[
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
    ScalaTupleTypeHList21[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T]
}
class ScalaTupleTypeHList22[
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
    ScalaTupleTypeHList22[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T, E22#T]
}
