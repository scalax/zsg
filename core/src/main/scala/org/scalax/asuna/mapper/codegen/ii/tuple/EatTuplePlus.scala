package org.scalax.asuna.mapper
object ArticleXyyTuplePlus {
  def hlistPlus2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[ItemTypeParameter1[T1], T2, TupleTypeParameter2[T1, T2]] =
    new Plus[ItemTypeParameter1[T1], T2, TupleTypeParameter2[T1, T2]] {
      override def plus(p: Item1[T1#H], item: T2#H): (T1#H, T2#H)                           = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H)): T2#H                                          = t._2
      override def takeHead(t: (T1#H, T2#H)): Item1[T1#H]                                   = HListItem0.add(t._1)
      override def sub: Plus[ItemTypeParameter1[T1]#T, T2#T, TupleTypeParameter2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: TypeParameter, T2 <: TypeParameter]: Plus[ItemTypeParameter1[T1], T2, TupleTypeParameter2[T2, T1]] =
    new Plus[ItemTypeParameter1[T1], T2, TupleTypeParameter2[T2, T1]] {
      override def plus(p: Item1[T1#H], item: T2#H): (T2#H, T1#H)                           = p.pullToTuple(item)
      override def takeTail(t: (T2#H, T1#H)): T2#H                                          = t._1
      override def takeHead(t: (T2#H, T1#H)): Item1[T1#H]                                   = ReverseHListItem0.pull(t._2)
      override def sub: Plus[ItemTypeParameter1[T1]#T, T2#T, TupleTypeParameter2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def hlistPlus3[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter]: Plus[ItemTypeParameter2[T1, T2], T3, TupleTypeParameter3[T1, T2, T3]] =
    new Plus[ItemTypeParameter2[T1, T2], T3, TupleTypeParameter3[T1, T2, T3]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): (T1#H, T2#H, T3#H)                       = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H)): T3#H                                            = t._3
      override def takeHead(t: (T1#H, T2#H, T3#H)): Item2[T1#H, T2#H]                               = HListItem0.add(t._1).add(t._2)
      override def sub: Plus[ItemTypeParameter2[T1, T2]#T, T3#T, TupleTypeParameter3[T1, T2, T3]#T] = hlistPlus3[T1#T, T2#T, T3#T]
    }
  def hlistPut3[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter]: Plus[ItemTypeParameter2[T1, T2], T3, TupleTypeParameter3[T3, T1, T2]] =
    new Plus[ItemTypeParameter2[T1, T2], T3, TupleTypeParameter3[T3, T1, T2]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): (T3#H, T1#H, T2#H)                       = p.pullToTuple(item)
      override def takeTail(t: (T3#H, T1#H, T2#H)): T3#H                                            = t._1
      override def takeHead(t: (T3#H, T1#H, T2#H)): Item2[T1#H, T2#H]                               = ReverseHListItem0.pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter2[T1, T2]#T, T3#T, TupleTypeParameter3[T3, T1, T2]#T] = hlistPut3[T1#T, T2#T, T3#T]
    }
  def hlistPlus4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]
    : Plus[ItemTypeParameter3[T1, T2, T3], T4, TupleTypeParameter4[T1, T2, T3, T4]] =
    new Plus[ItemTypeParameter3[T1, T2, T3], T4, TupleTypeParameter4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): (T1#H, T2#H, T3#H, T4#H)                   = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H)): T4#H                                              = t._4
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H)): Item3[T1#H, T2#H, T3#H]                           = HListItem0.add(t._1).add(t._2).add(t._3)
      override def sub: Plus[ItemTypeParameter3[T1, T2, T3]#T, T4#T, TupleTypeParameter4[T1, T2, T3, T4]#T] = hlistPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPut4[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter]
    : Plus[ItemTypeParameter3[T1, T2, T3], T4, TupleTypeParameter4[T4, T1, T2, T3]] =
    new Plus[ItemTypeParameter3[T1, T2, T3], T4, TupleTypeParameter4[T4, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): (T4#H, T1#H, T2#H, T3#H)                   = p.pullToTuple(item)
      override def takeTail(t: (T4#H, T1#H, T2#H, T3#H)): T4#H                                              = t._1
      override def takeHead(t: (T4#H, T1#H, T2#H, T3#H)): Item3[T1#H, T2#H, T3#H]                           = ReverseHListItem0.pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter3[T1, T2, T3]#T, T4#T, TupleTypeParameter4[T4, T1, T2, T3]#T] = hlistPut4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPlus5[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter]
    : Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, TupleTypeParameter5[T1, T2, T3, T4, T5]] =
    new Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, TupleTypeParameter5[T1, T2, T3, T4, T5]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T1#H, T2#H, T3#H, T4#H, T5#H)               = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): T5#H                                                = t._5
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): Item4[T1#H, T2#H, T3#H, T4#H]                       = HListItem0.add(t._1).add(t._2).add(t._3).add(t._4)
      override def sub: Plus[ItemTypeParameter4[T1, T2, T3, T4]#T, T5#T, TupleTypeParameter5[T1, T2, T3, T4, T5]#T] = hlistPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPut5[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter]
    : Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, TupleTypeParameter5[T5, T1, T2, T3, T4]] =
    new Plus[ItemTypeParameter4[T1, T2, T3, T4], T5, TupleTypeParameter5[T5, T1, T2, T3, T4]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T5#H, T1#H, T2#H, T3#H, T4#H)               = p.pullToTuple(item)
      override def takeTail(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): T5#H                                                = t._1
      override def takeHead(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): Item4[T1#H, T2#H, T3#H, T4#H]                       = ReverseHListItem0.pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter4[T1, T2, T3, T4]#T, T5#T, TupleTypeParameter5[T5, T1, T2, T3, T4]#T] = hlistPut5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPlus6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, TupleTypeParameter6[T1, T2, T3, T4, T5, T6]] =
    new Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, TupleTypeParameter6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T6#H                                        = t._6
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): Item5[T1#H, T2#H, T3#H, T4#H, T5#H]         = HListItem0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5)
      override def sub: Plus[ItemTypeParameter5[T1, T2, T3, T4, T5]#T, T6#T, TupleTypeParameter6[T1, T2, T3, T4, T5, T6]#T] =
        hlistPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPut6[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter]
    : Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, TupleTypeParameter6[T6, T1, T2, T3, T4, T5]] =
    new Plus[ItemTypeParameter5[T1, T2, T3, T4, T5], T6, TupleTypeParameter6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H) = p.pullToTuple(item)
      override def takeTail(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): T6#H                                        = t._1
      override def takeHead(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): Item5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ReverseHListItem0.pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter5[T1, T2, T3, T4, T5]#T, T6#T, TupleTypeParameter6[T6, T1, T2, T3, T4, T5]#T] =
        hlistPut6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPlus7[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter, T7 <: TypeParameter]
    : Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, TupleTypeParameter7[T1, T2, T3, T4, T5, T6, T7]] =
    new Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, TupleTypeParameter7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T7#H                                              = t._7
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        HListItem0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6)
      override def sub: Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6]#T, T7#T, TupleTypeParameter7[T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPut7[T1 <: TypeParameter, T2 <: TypeParameter, T3 <: TypeParameter, T4 <: TypeParameter, T5 <: TypeParameter, T6 <: TypeParameter, T7 <: TypeParameter]
    : Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, TupleTypeParameter7[T7, T1, T2, T3, T4, T5, T6]] =
    new Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6], T7, TupleTypeParameter7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H) = p.pullToTuple(item)
      override def takeTail(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T7#H                                              = t._1
      override def takeHead(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ReverseHListItem0.pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter6[T1, T2, T3, T4, T5, T6]#T, T7#T, TupleTypeParameter7[T7, T1, T2, T3, T4, T5, T6]#T] =
        hlistPut7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPlus8[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter
  ]: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T8#H                                                    = t._8
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        HListItem0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7)
      override def sub: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, TupleTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPut8[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter
  ]: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeParameter8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7], T8, TupleTypeParameter8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H) = p.pullToTuple(item)
      override def takeTail(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T8#H                                                    = t._1
      override def takeHead(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ReverseHListItem0.pull(t._8).pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, TupleTypeParameter8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPut8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPlus9[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter,
    T9 <: TypeParameter
  ]: Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8], T9, TupleTypeParameter9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8], T9, TupleTypeParameter9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): T9#H                                                          = t._9
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        HListItem0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8)
      override def sub: Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, TupleTypeParameter9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        hlistPlus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def hlistPut9[
    T1 <: TypeParameter,
    T2 <: TypeParameter,
    T3 <: TypeParameter,
    T4 <: TypeParameter,
    T5 <: TypeParameter,
    T6 <: TypeParameter,
    T7 <: TypeParameter,
    T8 <: TypeParameter,
    T9 <: TypeParameter
  ]: Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8], T9, TupleTypeParameter9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8], T9, TupleTypeParameter9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H) =
        p.pullToTuple(item)
      override def takeTail(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T9#H = t._1
      override def takeHead(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        ReverseHListItem0.pull(t._9).pull(t._8).pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[ItemTypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, TupleTypeParameter9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPut9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
}
