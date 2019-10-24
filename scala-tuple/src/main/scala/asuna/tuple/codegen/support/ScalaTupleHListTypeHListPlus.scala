package asuna.tuple.support
import asuna._
class ScalaTupleHListTypeHListPlus {
  def plus1[E1 <: TypeHList]: Plus[
    TupleTypeHList0,
    E1,
    ScalaTupleHListTypeHList1[E1]
  ] = plus1Tuple[TupleTypeHList0, E1]
  def plus1Tuple[E1 <: TupleTypeHList0, E2 <: TypeHList]: Plus[
    E1,
    E2,
    ScalaTupleHListTypeHList1[E2]
  ] =
    new Plus[
      E1,
      E2,
      ScalaTupleHListTypeHList1[E2]
    ] {
      override def plus(i: E1#H, item: E2#H): E2#H :: HNil = item :: HNil
      override def takeHead(i: E2#H :: HNil): E1#H         = AsunaTuple0
      override def takeTail(i: E2#H :: HNil): E2#H         = i.head
      override def sub: Plus[
        E1#T,
        E2#T,
        ScalaTupleHListTypeHList1[E2]#T
      ] = plus1Tuple[E1#T, E2#T]
    }
  @inline def plus2[E1 <: TypeHList, E2 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList1[E1],
    E2,
    ScalaTupleHListTypeHList2[E1, E2]
  ] =
    new Plus[
      ScalaTupleHListTypeHList1[E1],
      E2,
      ScalaTupleHListTypeHList2[E1, E2]
    ] {
      override def plus(i: E1#H :: HNil, item: E2#H): E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E2#H :: E1#H :: HNil): E1#H :: HNil         = i.tail
      override def takeTail(i: E2#H :: E1#H :: HNil): E2#H                 = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList1[E1]#T,
        E2#T,
        ScalaTupleHListTypeHList2[E1, E2]#T
      ] = plus2[E1#T, E2#T]
    }
  @inline def plus3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList2[E1, E2],
    E3,
    ScalaTupleHListTypeHList3[E1, E2, E3]
  ] =
    new Plus[
      ScalaTupleHListTypeHList2[E1, E2],
      E3,
      ScalaTupleHListTypeHList3[E1, E2, E3]
    ] {
      override def plus(i: E2#H :: E1#H :: HNil, item: E3#H): E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E3#H :: E2#H :: E1#H :: HNil): E2#H :: E1#H :: HNil         = i.tail
      override def takeTail(i: E3#H :: E2#H :: E1#H :: HNil): E3#H                         = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList2[E1, E2]#T,
        E3#T,
        ScalaTupleHListTypeHList3[E1, E2, E3]#T
      ] = plus3[E1#T, E2#T, E3#T]
    }
  @inline def plus4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList3[E1, E2, E3],
    E4,
    ScalaTupleHListTypeHList4[E1, E2, E3, E4]
  ] =
    new Plus[
      ScalaTupleHListTypeHList3[E1, E2, E3],
      E4,
      ScalaTupleHListTypeHList4[E1, E2, E3, E4]
    ] {
      override def plus(i: E3#H :: E2#H :: E1#H :: HNil, item: E4#H): E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E3#H :: E2#H :: E1#H :: HNil         = i.tail
      override def takeTail(i: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E4#H                                 = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList3[E1, E2, E3]#T,
        E4#T,
        ScalaTupleHListTypeHList4[E1, E2, E3, E4]#T
      ] = plus4[E1#T, E2#T, E3#T, E4#T]
    }
  @inline def plus5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList4[E1, E2, E3, E4],
    E5,
    ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]
  ] =
    new Plus[
      ScalaTupleHListTypeHList4[E1, E2, E3, E4],
      E5,
      ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]
    ] {
      override def plus(i: E4#H :: E3#H :: E2#H :: E1#H :: HNil, item: E5#H): E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E4#H :: E3#H :: E2#H :: E1#H :: HNil         = i.tail
      override def takeTail(i: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E5#H                                         = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList4[E1, E2, E3, E4]#T,
        E5#T,
        ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]#T
      ] = plus5[E1#T, E2#T, E3#T, E4#T, E5#T]
    }
  @inline def plus6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5],
    E6,
    ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]
  ] =
    new Plus[
      ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5],
      E6,
      ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]
    ] {
      override def plus(i: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil, item: E6#H): E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil         = i.tail
      override def takeTail(i: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E6#H                                                 = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]#T,
        E6#T,
        ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]#T
      ] = plus6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
    }
  @inline def plus7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6],
    E7,
    ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]
  ] =
    new Plus[
      ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6],
      E7,
      ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]
    ] {
      override def plus(i: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil, item: E7#H): E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil         = i.tail
      override def takeTail(i: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E7#H                                                         = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]#T,
        E7#T,
        ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]#T
      ] = plus7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
    }
  @inline def plus8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
    E8,
    ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]
  ] =
    new Plus[
      ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
      E8,
      ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]
    ] {
      override def plus(
        i: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E8#H
      ): E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(i: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        i.tail
      override def takeTail(i: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E8#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]#T,
        E8#T,
        ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]#T
      ] = plus8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
    }
  @inline def plus9[
    E1 <: TypeHList,
    E2 <: TypeHList,
    E3 <: TypeHList,
    E4 <: TypeHList,
    E5 <: TypeHList,
    E6 <: TypeHList,
    E7 <: TypeHList,
    E8 <: TypeHList,
    E9 <: TypeHList
  ]: Plus[
    ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8],
    E9,
    ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
  ] =
    new Plus[
      ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8],
      E9,
      ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]
    ] {
      override def plus(
        i: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E9#H
      ): E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                      = i.tail
      override def takeTail(i: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E9#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]#T,
        E9#T,
        ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]#T
      ] = plus9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
    }
  @inline def plus10[
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
  ]: Plus[
    ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9],
    E10,
    ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
  ] =
    new Plus[
      ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9],
      E10,
      ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]
    ] {
      override def plus(
        i: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E10#H
      ): E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                        = i.tail
      override def takeTail(i: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E10#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]#T,
        E10#T,
        ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]#T
      ] = plus10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
    }
  @inline def plus11[
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
  ]: Plus[
    ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10],
    E11,
    ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
  ] =
    new Plus[
      ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10],
      E11,
      ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]
    ] {
      override def plus(
        i: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E11#H
      ): E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                        = i.tail
      override def takeTail(i: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E11#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]#T,
        E11#T,
        ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]#T
      ] = plus11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
    }
  @inline def plus12[
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
  ]: Plus[
    ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11],
    E12,
    ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
  ] =
    new Plus[
      ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11],
      E12,
      ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]
    ] {
      override def plus(
        i: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E12#H
      ): E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                        = i.tail
      override def takeTail(i: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E12#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]#T,
        E12#T,
        ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]#T
      ] = plus12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
    }
  @inline def plus13[
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
  ]: Plus[
    ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12],
    E13,
    ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
  ] =
    new Plus[
      ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12],
      E13,
      ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]
    ] {
      override def plus(
        i: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E13#H
      ): E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                        = i.tail
      override def takeTail(i: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E13#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]#T,
        E13#T,
        ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]#T
      ] = plus13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
    }
  @inline def plus14[
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
  ]: Plus[
    ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13],
    E14,
    ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
  ] =
    new Plus[
      ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13],
      E14,
      ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]
    ] {
      override def plus(
        i: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E14#H
      ): E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil                                        = i.tail
      override def takeTail(i: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil): E14#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]#T,
        E14#T,
        ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]#T
      ] = plus14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
    }
  @inline def plus15[
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
  ]: Plus[
    ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14],
    E15,
    ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
  ] =
    new Plus[
      ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14],
      E15,
      ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]
    ] {
      override def plus(
        i: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E15#H
      ): E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = i.tail
      override def takeTail(
        i: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E15#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]#T,
        E15#T,
        ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]#T
      ] = plus15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
    }
  @inline def plus16[
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
  ]: Plus[
    ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15],
    E16,
    ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
  ] =
    new Plus[
      ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15],
      E16,
      ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]
    ] {
      override def plus(
        i: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E16#H
      ): E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = i.tail
      override def takeTail(
        i: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E16#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]#T,
        E16#T,
        ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]#T
      ] = plus16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
    }
  @inline def plus17[
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
  ]: Plus[
    ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16],
    E17,
    ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
  ] =
    new Plus[
      ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16],
      E17,
      ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]
    ] {
      override def plus(
        i: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E17#H
      ): E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = item :: i
      override def takeHead(
        i: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = i.tail
      override def takeTail(
        i: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E17#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]#T,
        E17#T,
        ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]#T
      ] = plus17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
    }
  @inline def plus18[
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
  ]: Plus[
    ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17],
    E18,
    ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  ] =
    new Plus[
      ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17],
      E18,
      ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
    ] {
      override def plus(
        i: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E18#H
      ): E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        item :: i
      override def takeHead(
        i: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = i.tail
      override def takeTail(
        i: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E18#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]#T,
        E18#T,
        ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]#T
      ] = plus18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
    }
  @inline def plus19[
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
  ]: Plus[
    ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18],
    E19,
    ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
  ] =
    new Plus[
      ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18],
      E19,
      ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]
    ] {
      override def plus(
        i: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E19#H
      ): E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        item :: i
      override def takeHead(
        i: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        i.tail
      override def takeTail(
        i: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E19#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]#T,
        E19#T,
        ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]#T
      ] = plus19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
    }
  @inline def plus20[
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
  ]: Plus[
    ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19],
    E20,
    ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
  ] =
    new Plus[
      ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19],
      E20,
      ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]
    ] {
      override def plus(
        i: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E20#H
      ): E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        item :: i
      override def takeHead(
        i: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        i.tail
      override def takeTail(
        i: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E20#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]#T,
        E20#T,
        ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]#T
      ] = plus20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
    }
  @inline def plus21[
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
  ]: Plus[
    ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20],
    E21,
    ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
  ] =
    new Plus[
      ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20],
      E21,
      ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]
    ] {
      override def plus(
        i: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil,
        item: E21#H
      ): E21#H :: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        item :: i
      override def takeHead(
        i: E21#H :: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        i.tail
      override def takeTail(
        i: E21#H :: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil
      ): E21#H = i.head
      override def sub: Plus[
        ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]#T,
        E21#T,
        ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]#T
      ] = plus21[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T]
    }
}
object ScalaTupleHListTypeHListPlus extends ScalaTupleHListTypeHListPlus
