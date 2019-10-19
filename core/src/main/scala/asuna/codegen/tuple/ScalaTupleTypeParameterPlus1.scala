package asuna.tuple
import asuna._
trait ScalaTupleTypeHListPlus1 {
  def hlistPlus2[T1 <: TypeHList, T2 <: TypeHList]: Plus[TupleTypeHList1[T1], T2, ScalaTupleTypeHList2[T1, T2]] =
    new Plus[TupleTypeHList1[T1], T2, ScalaTupleTypeHList2[T1, T2]] {
      override def plus(p: AsunaTuple1[T1#H], item: T2#H): (T1#H, T2#H)                   = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H)): T2#H                                        = t._2
      override def takeHead(t: (T1#H, T2#H)): AsunaTuple1[T1#H]                           = HListTuple0.add(t._1)
      override def sub: Plus[TupleTypeHList1[T1]#T, T2#T, ScalaTupleTypeHList2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: TypeHList, T2 <: TypeHList]: Plus[TupleTypeHList1[T1], T2, ScalaTupleTypeHList2[T2, T1]] =
    new Plus[TupleTypeHList1[T1], T2, ScalaTupleTypeHList2[T2, T1]] {
      override def plus(p: AsunaTuple1[T1#H], item: T2#H): (T2#H, T1#H)                   = p.pullToTuple(item)
      override def takeTail(t: (T2#H, T1#H)): T2#H                                        = t._1
      override def takeHead(t: (T2#H, T1#H)): AsunaTuple1[T1#H]                           = ReverseHListTuple0.pull(t._2)
      override def sub: Plus[TupleTypeHList1[T1]#T, T2#T, ScalaTupleTypeHList2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def hlistPlus3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[TupleTypeHList2[T1, T2], T3, ScalaTupleTypeHList3[T1, T2, T3]] =
    new Plus[TupleTypeHList2[T1, T2], T3, ScalaTupleTypeHList3[T1, T2, T3]] {
      override def plus(p: AsunaTuple2[T1#H, T2#H], item: T3#H): (T1#H, T2#H, T3#H)               = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H)): T3#H                                          = t._3
      override def takeHead(t: (T1#H, T2#H, T3#H)): AsunaTuple2[T1#H, T2#H]                       = HListTuple0.add(t._1).add(t._2)
      override def sub: Plus[TupleTypeHList2[T1, T2]#T, T3#T, ScalaTupleTypeHList3[T1, T2, T3]#T] = hlistPlus3[T1#T, T2#T, T3#T]
    }
  def hlistPut3[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList]: Plus[TupleTypeHList2[T1, T2], T3, ScalaTupleTypeHList3[T3, T1, T2]] =
    new Plus[TupleTypeHList2[T1, T2], T3, ScalaTupleTypeHList3[T3, T1, T2]] {
      override def plus(p: AsunaTuple2[T1#H, T2#H], item: T3#H): (T3#H, T1#H, T2#H)               = p.pullToTuple(item)
      override def takeTail(t: (T3#H, T1#H, T2#H)): T3#H                                          = t._1
      override def takeHead(t: (T3#H, T1#H, T2#H)): AsunaTuple2[T1#H, T2#H]                       = ReverseHListTuple0.pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList2[T1, T2]#T, T3#T, ScalaTupleTypeHList3[T3, T1, T2]#T] = hlistPut3[T1#T, T2#T, T3#T]
    }
  def hlistPlus4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[TupleTypeHList3[T1, T2, T3], T4, ScalaTupleTypeHList4[T1, T2, T3, T4]] =
    new Plus[TupleTypeHList3[T1, T2, T3], T4, ScalaTupleTypeHList4[T1, T2, T3, T4]] {
      override def plus(p: AsunaTuple3[T1#H, T2#H, T3#H], item: T4#H): (T1#H, T2#H, T3#H, T4#H)           = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H)): T4#H                                            = t._4
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H)): AsunaTuple3[T1#H, T2#H, T3#H]                   = HListTuple0.add(t._1).add(t._2).add(t._3)
      override def sub: Plus[TupleTypeHList3[T1, T2, T3]#T, T4#T, ScalaTupleTypeHList4[T1, T2, T3, T4]#T] = hlistPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPut4[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList]: Plus[TupleTypeHList3[T1, T2, T3], T4, ScalaTupleTypeHList4[T4, T1, T2, T3]] =
    new Plus[TupleTypeHList3[T1, T2, T3], T4, ScalaTupleTypeHList4[T4, T1, T2, T3]] {
      override def plus(p: AsunaTuple3[T1#H, T2#H, T3#H], item: T4#H): (T4#H, T1#H, T2#H, T3#H)           = p.pullToTuple(item)
      override def takeTail(t: (T4#H, T1#H, T2#H, T3#H)): T4#H                                            = t._1
      override def takeHead(t: (T4#H, T1#H, T2#H, T3#H)): AsunaTuple3[T1#H, T2#H, T3#H]                   = ReverseHListTuple0.pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList3[T1, T2, T3]#T, T4#T, ScalaTupleTypeHList4[T4, T1, T2, T3]#T] = hlistPut4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPlus5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[TupleTypeHList4[T1, T2, T3, T4], T5, ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] =
    new Plus[TupleTypeHList4[T1, T2, T3, T4], T5, ScalaTupleTypeHList5[T1, T2, T3, T4, T5]] {
      override def plus(p: AsunaTuple4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T1#H, T2#H, T3#H, T4#H, T5#H)       = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): T5#H                                              = t._5
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): AsunaTuple4[T1#H, T2#H, T3#H, T4#H]               = HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4)
      override def sub: Plus[TupleTypeHList4[T1, T2, T3, T4]#T, T5#T, ScalaTupleTypeHList5[T1, T2, T3, T4, T5]#T] = hlistPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPut5[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList]
    : Plus[TupleTypeHList4[T1, T2, T3, T4], T5, ScalaTupleTypeHList5[T5, T1, T2, T3, T4]] =
    new Plus[TupleTypeHList4[T1, T2, T3, T4], T5, ScalaTupleTypeHList5[T5, T1, T2, T3, T4]] {
      override def plus(p: AsunaTuple4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T5#H, T1#H, T2#H, T3#H, T4#H)       = p.pullToTuple(item)
      override def takeTail(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): T5#H                                              = t._1
      override def takeHead(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): AsunaTuple4[T1#H, T2#H, T3#H, T4#H]               = ReverseHListTuple0.pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList4[T1, T2, T3, T4]#T, T5#T, ScalaTupleTypeHList5[T5, T1, T2, T3, T4]#T] = hlistPut5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPlus6[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList]
    : Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] =
    new Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: AsunaTuple5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T6#H                                              = t._6
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): AsunaTuple5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5)
      override def sub: Plus[TupleTypeHList5[T1, T2, T3, T4, T5]#T, T6#T, ScalaTupleTypeHList6[T1, T2, T3, T4, T5, T6]#T] = hlistPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPut6[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList]
    : Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, ScalaTupleTypeHList6[T6, T1, T2, T3, T4, T5]] =
    new Plus[TupleTypeHList5[T1, T2, T3, T4, T5], T6, ScalaTupleTypeHList6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: AsunaTuple5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H) = p.pullToTuple(item)
      override def takeTail(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): T6#H                                              = t._1
      override def takeHead(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): AsunaTuple5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ReverseHListTuple0.pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList5[T1, T2, T3, T4, T5]#T, T6#T, ScalaTupleTypeHList6[T6, T1, T2, T3, T4, T5]#T] = hlistPut6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPlus7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] =
    new Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: AsunaTuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T7#H                                                    = t._7
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): AsunaTuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6)
      override def sub: Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6]#T, T7#T, ScalaTupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPut7[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList]
    : Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, ScalaTupleTypeHList7[T7, T1, T2, T3, T4, T5, T6]] =
    new Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6], T7, ScalaTupleTypeHList7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: AsunaTuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H) = p.pullToTuple(item)
      override def takeTail(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T7#H                                                    = t._1
      override def takeHead(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): AsunaTuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ReverseHListTuple0.pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList6[T1, T2, T3, T4, T5, T6]#T, T7#T, ScalaTupleTypeHList7[T7, T1, T2, T3, T4, T5, T6]#T] =
        hlistPut7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPlus8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: AsunaTuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H) = p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T8#H                                                          = t._8
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): AsunaTuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7)
      override def sub: Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, ScalaTupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPut8[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList]
    : Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ScalaTupleTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7], T8, ScalaTupleTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: AsunaTuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H) = p.pullToTuple(item)
      override def takeTail(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T8#H                                                          = t._1
      override def takeHead(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): AsunaTuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ReverseHListTuple0.pull(t._8).pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, ScalaTupleTypeHList8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPut8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPlus9[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList, T9 <: TypeHList]
    : Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], T9, ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], T9, ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H) =
        p.addToTuple(item)
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): T9#H = t._9
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        HListTuple0.add(t._1).add(t._2).add(t._3).add(t._4).add(t._5).add(t._6).add(t._7).add(t._8)
      override def sub: Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, ScalaTupleTypeHList9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] =
        hlistPlus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def hlistPut9[T1 <: TypeHList, T2 <: TypeHList, T3 <: TypeHList, T4 <: TypeHList, T5 <: TypeHList, T6 <: TypeHList, T7 <: TypeHList, T8 <: TypeHList, T9 <: TypeHList]
    : Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], T9, ScalaTupleTypeHList9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8], T9, ScalaTupleTypeHList9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H) =
        p.pullToTuple(item)
      override def takeTail(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T9#H = t._1
      override def takeHead(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): AsunaTuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] =
        ReverseHListTuple0.pull(t._9).pull(t._8).pull(t._7).pull(t._6).pull(t._5).pull(t._4).pull(t._3).pull(t._2)
      override def sub: Plus[TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, ScalaTupleTypeHList9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPut9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
}
object ScalaTupleTypeHListPlus1 extends ScalaTupleTypeHListPlus1
