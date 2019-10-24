package asuna.tuple.support
import asuna.TypeHList
import asuna.support.heterogeneous._
class ScalaTupleHListTypeHList {
  class ScalaTupleHListTypeHList1[E1 <: TypeHList] extends TypeHList {
    override type H = E1#H :: HNil
    override type T = ScalaTupleHListTypeHList1[E1#T]
  }
  class ScalaTupleHListTypeHList2[E1 <: TypeHList, E2 <: TypeHList] extends TypeHList {
    override type H = E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList2[E1#T, E2#T]
  }
  class ScalaTupleHListTypeHList3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList] extends TypeHList {
    override type H = E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList3[E1#T, E2#T, E3#T]
  }
  class ScalaTupleHListTypeHList4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList] extends TypeHList {
    override type H = E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList4[E1#T, E2#T, E3#T, E4#T]
  }
  class ScalaTupleHListTypeHList5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList] extends TypeHList {
    override type H = E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList5[E1#T, E2#T, E3#T, E4#T, E5#T]
  }
  class ScalaTupleHListTypeHList6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList] extends TypeHList {
    override type H = E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
  }
  class ScalaTupleHListTypeHList7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]
      extends TypeHList {
    override type H = E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
  }
  class ScalaTupleHListTypeHList8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]
      extends TypeHList {
    override type H = E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
  }
  class ScalaTupleHListTypeHList9[
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
    override type H = E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
  }
  class ScalaTupleHListTypeHList10[
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
    override type H = E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
  }
  class ScalaTupleHListTypeHList11[
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
    override type H = E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
  }
  class ScalaTupleHListTypeHList12[
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
    override type H = E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
  }
  class ScalaTupleHListTypeHList13[
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
    override type H = E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
  }
  class ScalaTupleHListTypeHList14[
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
    override type H = E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
  }
  class ScalaTupleHListTypeHList15[
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
    override type H = E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
  }
  class ScalaTupleHListTypeHList16[
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
    override type H = E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
  }
  class ScalaTupleHListTypeHList17[
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
    override type H = E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
  }
  class ScalaTupleHListTypeHList18[
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
    override type H =
      E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T = ScalaTupleHListTypeHList18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
  }
  class ScalaTupleHListTypeHList19[
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
    override type H =
      E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T =
      ScalaTupleHListTypeHList19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
  }
  class ScalaTupleHListTypeHList20[
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
    override type H =
      E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T =
      ScalaTupleHListTypeHList20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
  }
  class ScalaTupleHListTypeHList21[
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
    override type H =
      E21#H :: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
    override type T =
      ScalaTupleHListTypeHList21[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T]
  }
}
object ScalaTupleHListTypeHList extends ScalaTupleHListTypeHList
