package asuna.tuple.tupleSupport
import asuna.tuple.ScalaTupleTypeHList2
import asuna.tuple.ScalaTupleTypeHList3
import asuna.tuple.ScalaTupleTypeHList4
import asuna.tuple.ScalaTupleTypeHList5
import asuna.tuple.ScalaTupleTypeHList6
import asuna.tuple.ScalaTupleTypeHList7
import asuna.tuple.ScalaTupleTypeHList8
import asuna.tuple.ScalaTupleTypeHList9
import asuna.tuple.ScalaTupleTypeHList10
import asuna.tuple.ScalaTupleTypeHList11
import asuna.tuple.ScalaTupleTypeHList12
import asuna.tuple.ScalaTupleTypeHList13
import asuna.tuple.ScalaTupleTypeHList14
import asuna.tuple.ScalaTupleTypeHList15
import asuna.tuple.ScalaTupleTypeHList16
import asuna.tuple.ScalaTupleTypeHList17
import asuna.tuple.ScalaTupleTypeHList18
import asuna.tuple.ScalaTupleTypeHList19
import asuna.tuple.ScalaTupleTypeHList20
import asuna.tuple.ScalaTupleTypeHList21
import asuna.tuple.ScalaTupleTypeHList22
import asuna.TypeHList
import asuna.Plus
import asuna.support.heterogeneous._
trait HListToScalaTupleTypeHListPlus {
  def put2[E1 <: TypeHList, E2 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[E1],
    E2,
    ScalaTupleTypeHList2[E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[E1],
      E2,
      ScalaTupleTypeHList2[E2, E1]
    ] {
      override def plus(p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[E1]#H, item: E2#H): ScalaTupleTypeHList2[E2, E1]#H = {
        val ii1 = p.head
        (item, ii1)
      }
      override def takeTail(t: (E2#H, E1#H)): E2#H                                                                           = t._1
      override def takeHead(t: (E2#H, E1#H)): E1#H :: HNil                                                                   = t._2 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList1[E1]#T, E2#T, ScalaTupleTypeHList2[E2, E1]#T] = put2[E1#T, E2#T]
    }
  def put3[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[E1, E2],
    E3,
    ScalaTupleTypeHList3[E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[E1, E2],
      E3,
      ScalaTupleTypeHList3[E3, E2, E1]
    ] {
      override def plus(p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[E1, E2]#H, item: E3#H): ScalaTupleTypeHList3[E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        (item, ii1, ii2)
      }
      override def takeTail(t: (E3#H, E2#H, E1#H)): E3#H                                                                             = t._1
      override def takeHead(t: (E3#H, E2#H, E1#H)): E2#H :: E1#H :: HNil                                                             = t._2 :: t._3 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList2[E1, E2]#T, E3#T, ScalaTupleTypeHList3[E3, E2, E1]#T] = put3[E1#T, E2#T, E3#T]
    }
  def put4[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[E1, E2, E3],
    E4,
    ScalaTupleTypeHList4[E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[E1, E2, E3],
      E4,
      ScalaTupleTypeHList4[E4, E3, E2, E1]
    ] {
      override def plus(p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[E1, E2, E3]#H, item: E4#H): ScalaTupleTypeHList4[E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        (item, ii1, ii2, ii3)
      }
      override def takeTail(t: (E4#H, E3#H, E2#H, E1#H)): E4#H                         = t._1
      override def takeHead(t: (E4#H, E3#H, E2#H, E1#H)): E3#H :: E2#H :: E1#H :: HNil = t._2 :: t._3 :: t._4 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList3[E1, E2, E3]#T, E4#T, ScalaTupleTypeHList4[E4, E3, E2, E1]#T] =
        put4[E1#T, E2#T, E3#T, E4#T]
    }
  def put5[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[E1, E2, E3, E4],
    E5,
    ScalaTupleTypeHList5[E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[E1, E2, E3, E4],
      E5,
      ScalaTupleTypeHList5[E5, E4, E3, E2, E1]
    ] {
      override def plus(p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[E1, E2, E3, E4]#H, item: E5#H): ScalaTupleTypeHList5[E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        (item, ii1, ii2, ii3, ii4)
      }
      override def takeTail(t: (E5#H, E4#H, E3#H, E2#H, E1#H)): E5#H                                 = t._1
      override def takeHead(t: (E5#H, E4#H, E3#H, E2#H, E1#H)): E4#H :: E3#H :: E2#H :: E1#H :: HNil = t._2 :: t._3 :: t._4 :: t._5 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList4[E1, E2, E3, E4]#T, E5#T, ScalaTupleTypeHList5[E5, E4, E3, E2, E1]#T] =
        put5[E1#T, E2#T, E3#T, E4#T, E5#T]
    }
  def put6[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5],
    E6,
    ScalaTupleTypeHList6[E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5],
      E6,
      ScalaTupleTypeHList6[E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]#H, item: E6#H): ScalaTupleTypeHList6[E6, E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        (item, ii1, ii2, ii3, ii4, ii5)
      }
      override def takeTail(t: (E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E6#H                                         = t._1
      override def takeHead(t: (E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList5[E1, E2, E3, E4, E5]#T, E6#T, ScalaTupleTypeHList6[E6, E5, E4, E3, E2, E1]#T] =
        put6[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T]
    }
  def put7[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6],
    E7,
    ScalaTupleTypeHList7[E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6],
      E7,
      ScalaTupleTypeHList7[E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]#H,
        item: E7#H
      ): ScalaTupleTypeHList7[E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6)
      }
      override def takeTail(t: (E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E7#H = t._1
      override def takeHead(t: (E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList6[E1, E2, E3, E4, E5, E6]#T, E7#T, ScalaTupleTypeHList7[E7, E6, E5, E4, E3, E2, E1]#T] =
        put7[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T]
    }
  def put8[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
    E8,
    ScalaTupleTypeHList8[E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7],
      E8,
      ScalaTupleTypeHList8[E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]#H,
        item: E8#H
      ): ScalaTupleTypeHList8[E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        val tt6 = tt5.tail
        val ii7 = tt6.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7)
      }
      override def takeTail(t: (E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E8#H = t._1
      override def takeHead(t: (E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: HNil
      override def sub
        : Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList7[E1, E2, E3, E4, E5, E6, E7]#T, E8#T, ScalaTupleTypeHList8[E8, E7, E6, E5, E4, E3, E2, E1]#T] =
        put8[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T]
    }
  def put9[E1 <: TypeHList, E2 <: TypeHList, E3 <: TypeHList, E4 <: TypeHList, E5 <: TypeHList, E6 <: TypeHList, E7 <: TypeHList, E8 <: TypeHList, E9 <: TypeHList]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8],
    E9,
    ScalaTupleTypeHList9[E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8],
      E9,
      ScalaTupleTypeHList9[E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]#H,
        item: E9#H
      ): ScalaTupleTypeHList9[E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        val tt6 = tt5.tail
        val ii7 = tt6.head
        val tt7 = tt6.tail
        val ii8 = tt7.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8)
      }
      override def takeTail(t: (E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E9#H = t._1
      override def takeHead(t: (E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: HNil
      override def sub
        : Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList8[E1, E2, E3, E4, E5, E6, E7, E8]#T, E9#T, ScalaTupleTypeHList9[E9, E8, E7, E6, E5, E4, E3, E2, E1]#T] =
        put9[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T]
    }
  def put10[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9],
    E10,
    ScalaTupleTypeHList10[E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9],
      E10,
      ScalaTupleTypeHList10[E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]#H,
        item: E10#H
      ): ScalaTupleTypeHList10[E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1 = p.head
        val tt1 = p.tail
        val ii2 = tt1.head
        val tt2 = tt1.tail
        val ii3 = tt2.head
        val tt3 = tt2.tail
        val ii4 = tt3.head
        val tt4 = tt3.tail
        val ii5 = tt4.head
        val tt5 = tt4.tail
        val ii6 = tt5.head
        val tt6 = tt5.tail
        val ii7 = tt6.head
        val tt7 = tt6.tail
        val ii8 = tt7.head
        val tt8 = tt7.tail
        val ii9 = tt8.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9)
      }
      override def takeTail(t: (E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E10#H = t._1
      override def takeHead(
        t: (E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil = t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList9[E1, E2, E3, E4, E5, E6, E7, E8, E9]#T, E10#T, ScalaTupleTypeHList10[
        E10,
        E9,
        E8,
        E7,
        E6,
        E5,
        E4,
        E3,
        E2,
        E1
      ]#T] = put10[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T]
    }
  def put11[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10],
    E11,
    ScalaTupleTypeHList11[E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10],
      E11,
      ScalaTupleTypeHList11[E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]#H,
        item: E11#H
      ): ScalaTupleTypeHList11[E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10)
      }
      override def takeTail(t: (E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E11#H = t._1
      override def takeHead(
        t: (E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList10[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10]#T, E11#T, ScalaTupleTypeHList11[
        E11,
        E10,
        E9,
        E8,
        E7,
        E6,
        E5,
        E4,
        E3,
        E2,
        E1
      ]#T] = put11[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T]
    }
  def put12[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11],
    E12,
    ScalaTupleTypeHList12[E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11],
      E12,
      ScalaTupleTypeHList12[E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]#H,
        item: E12#H
      ): ScalaTupleTypeHList12[E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11)
      }
      override def takeTail(t: (E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E12#H = t._1
      override def takeHead(
        t: (E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList11[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11]#T, E12#T, ScalaTupleTypeHList12[
        E12,
        E11,
        E10,
        E9,
        E8,
        E7,
        E6,
        E5,
        E4,
        E3,
        E2,
        E1
      ]#T] = put12[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T]
    }
  def put13[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12],
    E13,
    ScalaTupleTypeHList13[E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12],
      E13,
      ScalaTupleTypeHList13[E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]#H,
        item: E13#H
      ): ScalaTupleTypeHList13[E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12)
      }
      override def takeTail(t: (E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E13#H = t._1
      override def takeHead(
        t: (E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList12[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12]#T, E13#T, ScalaTupleTypeHList13[
        E13,
        E12,
        E11,
        E10,
        E9,
        E8,
        E7,
        E6,
        E5,
        E4,
        E3,
        E2,
        E1
      ]#T] = put13[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T]
    }
  def put14[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13],
    E14,
    ScalaTupleTypeHList14[E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13],
      E14,
      ScalaTupleTypeHList14[E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]#H,
        item: E14#H
      ): ScalaTupleTypeHList14[E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13)
      }
      override def takeTail(t: (E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E14#H = t._1
      override def takeHead(
        t: (E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: HNil
      override def sub: Plus[ScalaTupleHListTypeHList.ScalaTupleHListTypeHList13[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13]#T, E14#T, ScalaTupleTypeHList14[
        E14,
        E13,
        E12,
        E11,
        E10,
        E9,
        E8,
        E7,
        E6,
        E5,
        E4,
        E3,
        E2,
        E1
      ]#T] = put14[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T]
    }
  def put15[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14],
    E15,
    ScalaTupleTypeHList15[E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14],
      E15,
      ScalaTupleTypeHList15[E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]#H,
        item: E15#H
      ): ScalaTupleTypeHList15[E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14)
      }
      override def takeTail(t: (E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E15#H = t._1
      override def takeHead(
        t: (E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList14[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14]#T,
        E15#T,
        ScalaTupleTypeHList15[E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put15[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T]
    }
  def put16[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15],
    E16,
    ScalaTupleTypeHList16[E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15],
      E16,
      ScalaTupleTypeHList16[E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]#H,
        item: E16#H
      ): ScalaTupleTypeHList16[E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15)
      }
      override def takeTail(t: (E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E16#H = t._1
      override def takeHead(
        t: (E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList15[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15]#T,
        E16#T,
        ScalaTupleTypeHList16[E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put16[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T]
    }
  def put17[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16],
    E17,
    ScalaTupleTypeHList17[E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16],
      E17,
      ScalaTupleTypeHList17[E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]#H,
        item: E17#H
      ): ScalaTupleTypeHList17[E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16)
      }
      override def takeTail(t: (E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E17#H = t._1
      override def takeHead(
        t: (E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList16[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16]#T,
        E17#T,
        ScalaTupleTypeHList17[E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put17[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T]
    }
  def put18[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17],
    E18,
    ScalaTupleTypeHList18[E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17],
      E18,
      ScalaTupleTypeHList18[E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]#H,
        item: E18#H
      ): ScalaTupleTypeHList18[E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        val tt16 = tt15.tail
        val ii17 = tt16.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16, ii17)
      }
      override def takeTail(t: (E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E18#H = t._1
      override def takeHead(
        t: (E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: t._18 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]#T,
        E18#T,
        ScalaTupleTypeHList18[E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put18[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T]
    }
  def put19[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18],
    E19,
    ScalaTupleTypeHList19[E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18],
      E19,
      ScalaTupleTypeHList19[E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]#H,
        item: E19#H
      ): ScalaTupleTypeHList19[E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        val tt16 = tt15.tail
        val ii17 = tt16.head
        val tt17 = tt16.tail
        val ii18 = tt17.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16, ii17, ii18)
      }
      override def takeTail(t: (E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)): E19#H = t._1
      override def takeHead(
        t: (E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: t._18 :: t._19 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]#T,
        E19#T,
        ScalaTupleTypeHList19[E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put19[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T]
    }
  def put20[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19],
    E20,
    ScalaTupleTypeHList20[E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19],
      E20,
      ScalaTupleTypeHList20[E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]#H,
        item: E20#H
      ): ScalaTupleTypeHList20[E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        val tt16 = tt15.tail
        val ii17 = tt16.head
        val tt17 = tt16.tail
        val ii18 = tt17.head
        val tt18 = tt17.tail
        val ii19 = tt18.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16, ii17, ii18, ii19)
      }
      override def takeTail(
        t: (E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E20#H = t._1
      override def takeHead(
        t: (E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: t._18 :: t._19 :: t._20 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19]#T,
        E20#T,
        ScalaTupleTypeHList20[E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put20[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T]
    }
  def put21[
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
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20],
    E21,
    ScalaTupleTypeHList21[E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20],
      E21,
      ScalaTupleTypeHList21[E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]#H,
        item: E21#H
      ): ScalaTupleTypeHList21[E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        val tt16 = tt15.tail
        val ii17 = tt16.head
        val tt17 = tt16.tail
        val ii18 = tt17.head
        val tt18 = tt17.tail
        val ii19 = tt18.head
        val tt19 = tt18.tail
        val ii20 = tt19.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16, ii17, ii18, ii19, ii20)
      }
      override def takeTail(
        t: (E21#H, E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E21#H = t._1
      override def takeHead(
        t: (E21#H, E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: t._18 :: t._19 :: t._20 :: t._21 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList20[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20]#T,
        E21#T,
        ScalaTupleTypeHList21[E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put21[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T]
    }
  def put22[
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
  ]: Plus[
    ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21],
    E22,
    ScalaTupleTypeHList22[E22, E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
  ] =
    new Plus[
      ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21],
      E22,
      ScalaTupleTypeHList22[E22, E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]
    ] {
      override def plus(
        p: ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]#H,
        item: E22#H
      ): ScalaTupleTypeHList22[E22, E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#H = {
        val ii1  = p.head
        val tt1  = p.tail
        val ii2  = tt1.head
        val tt2  = tt1.tail
        val ii3  = tt2.head
        val tt3  = tt2.tail
        val ii4  = tt3.head
        val tt4  = tt3.tail
        val ii5  = tt4.head
        val tt5  = tt4.tail
        val ii6  = tt5.head
        val tt6  = tt5.tail
        val ii7  = tt6.head
        val tt7  = tt6.tail
        val ii8  = tt7.head
        val tt8  = tt7.tail
        val ii9  = tt8.head
        val tt9  = tt8.tail
        val ii10 = tt9.head
        val tt10 = tt9.tail
        val ii11 = tt10.head
        val tt11 = tt10.tail
        val ii12 = tt11.head
        val tt12 = tt11.tail
        val ii13 = tt12.head
        val tt13 = tt12.tail
        val ii14 = tt13.head
        val tt14 = tt13.tail
        val ii15 = tt14.head
        val tt15 = tt14.tail
        val ii16 = tt15.head
        val tt16 = tt15.tail
        val ii17 = tt16.head
        val tt17 = tt16.tail
        val ii18 = tt17.head
        val tt18 = tt17.tail
        val ii19 = tt18.head
        val tt19 = tt18.tail
        val ii20 = tt19.head
        val tt20 = tt19.tail
        val ii21 = tt20.head
        (item, ii1, ii2, ii3, ii4, ii5, ii6, ii7, ii8, ii9, ii10, ii11, ii12, ii13, ii14, ii15, ii16, ii17, ii18, ii19, ii20, ii21)
      }
      override def takeTail(
        t: (E22#H, E21#H, E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E22#H = t._1
      override def takeHead(
        t: (E22#H, E21#H, E20#H, E19#H, E18#H, E17#H, E16#H, E15#H, E14#H, E13#H, E12#H, E11#H, E10#H, E9#H, E8#H, E7#H, E6#H, E5#H, E4#H, E3#H, E2#H, E1#H)
      ): E21#H :: E20#H :: E19#H :: E18#H :: E17#H :: E16#H :: E15#H :: E14#H :: E13#H :: E12#H :: E11#H :: E10#H :: E9#H :: E8#H :: E7#H :: E6#H :: E5#H :: E4#H :: E3#H :: E2#H :: E1#H :: HNil =
        t._2 :: t._3 :: t._4 :: t._5 :: t._6 :: t._7 :: t._8 :: t._9 :: t._10 :: t._11 :: t._12 :: t._13 :: t._14 :: t._15 :: t._16 :: t._17 :: t._18 :: t._19 :: t._20 :: t._21 :: t._22 :: HNil
      override def sub: Plus[
        ScalaTupleHListTypeHList.ScalaTupleHListTypeHList21[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21]#T,
        E22#T,
        ScalaTupleTypeHList22[E22, E21, E20, E19, E18, E17, E16, E15, E14, E13, E12, E11, E10, E9, E8, E7, E6, E5, E4, E3, E2, E1]#T
      ] = put22[E1#T, E2#T, E3#T, E4#T, E5#T, E6#T, E7#T, E8#T, E9#T, E10#T, E11#T, E12#T, E13#T, E14#T, E15#T, E16#T, E17#T, E18#T, E19#T, E20#T, E21#T, E22#T]
    }
}
object HListToScalaTupleTypeHListPlus extends HListToScalaTupleTypeHListPlus
