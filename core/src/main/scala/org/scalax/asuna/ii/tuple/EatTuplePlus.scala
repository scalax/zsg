package org.scalax.asuna.mapper.item
object ArticleXyyTuplePlus {
  def hlistPlus2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] {
      override def plus(p: Item1[T1#H], item: T2#H): (T1#H, T2#H)                                      = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H)): T2#H                                                     = t._2
      override def takeTail(t: (T1#H, T2#H)): Item1[T1#H]                                              = HListItem0.eat(t._1)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] {
      override def plus(p: Item1[T1#H], item: T2#H): (T2#H, T1#H)                                      = p.pudaoToTuple(item)
      override def takeHead(t: (T2#H, T1#H)): T2#H                                                     = t._1
      override def takeTail(t: (T2#H, T1#H)): Item1[T1#H]                                              = ReverseHListItem0.pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def hlistPlus3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): (T1#H, T2#H, T3#H)                                  = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H)): T3#H                                                       = t._3
      override def takeTail(t: (T1#H, T2#H, T3#H)): Item2[T1#H, T2#H]                                          = HListItem0.eat(t._1).eat(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T1, T2, T3]#T] = hlistPlus3[T1#T, T2#T, T3#T]
    }
  def hlistPut3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): (T3#H, T1#H, T2#H)                                  = p.pudaoToTuple(item)
      override def takeHead(t: (T3#H, T1#H, T2#H)): T3#H                                                       = t._1
      override def takeTail(t: (T3#H, T1#H, T2#H)): Item2[T1#H, T2#H]                                          = ReverseHListItem0.pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T3, T1, T2]#T] = hlistPut3[T1#T, T2#T, T3#T]
    }
  def hlistPlus4[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): (T1#H, T2#H, T3#H, T4#H)                              = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H)): T4#H                                                         = t._4
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H)): Item3[T1#H, T2#H, T3#H]                                      = HListItem0.eat(t._1).eat(t._2).eat(t._3)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T1, T2, T3, T4]#T] = hlistPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPut4[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): (T4#H, T1#H, T2#H, T3#H)                              = p.pudaoToTuple(item)
      override def takeHead(t: (T4#H, T1#H, T2#H, T3#H)): T4#H                                                         = t._1
      override def takeTail(t: (T4#H, T1#H, T2#H, T3#H)): Item3[T1#H, T2#H, T3#H]                                      = ReverseHListItem0.pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T4, T1, T2, T3]#T] = hlistPut4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPlus5[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T1#H, T2#H, T3#H, T4#H, T5#H)                          = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): T5#H                                                           = t._5
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H)): Item4[T1#H, T2#H, T3#H, T4#H]                                  = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T1, T2, T3, T4, T5]#T] = hlistPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPut5[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): (T5#H, T1#H, T2#H, T3#H, T4#H)                          = p.pudaoToTuple(item)
      override def takeHead(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): T5#H                                                           = t._1
      override def takeTail(t: (T5#H, T1#H, T2#H, T3#H, T4#H)): Item4[T1#H, T2#H, T3#H, T4#H]                                  = ReverseHListItem0.pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T5, T1, T2, T3, T4]#T] = hlistPut5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPlus6[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)                      = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T6#H                                                             = t._6
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): Item5[T1#H, T2#H, T3#H, T4#H, T5#H]                              = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T1, T2, T3, T4, T5, T6]#T] = hlistPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPut6[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)                      = p.pudaoToTuple(item)
      override def takeHead(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): T6#H                                                             = t._1
      override def takeTail(t: (T6#H, T1#H, T2#H, T3#H, T4#H, T5#H)): Item5[T1#H, T2#H, T3#H, T4#H, T5#H]                              = ReverseHListItem0.pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T6, T1, T2, T3, T4, T5]#T] = hlistPut6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPlus7[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)                  = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T7#H                                                               = t._7
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]                          = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]#T] = hlistPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPut7[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)                  = p.pudaoToTuple(item)
      override def takeHead(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): T7#H                                                               = t._1
      override def takeTail(t: (T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H)): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]                          = ReverseHListItem0.pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]#T] = hlistPut7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPlus8[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)              = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T8#H                                                                 = t._8
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]                      = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] = hlistPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPut8[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)              = p.pudaoToTuple(item)
      override def takeHead(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): T8#H                                                                 = t._1
      override def takeTail(t: (T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H)): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]                      = ReverseHListItem0.pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] = hlistPut8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPlus9[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {
      override def plus(p: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)          = p.eatToTuple(item)
      override def takeHead(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): T9#H                                                                   = t._9
      override def takeTail(t: (T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H, T9#H)): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]                  = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7).eat(t._8)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]#T] = hlistPlus9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
  def hlistPut9[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, T4 <: org.scalax.asuna.mapper.TypeParam, T5 <: org.scalax.asuna.mapper.TypeParam, T6 <: org.scalax.asuna.mapper.TypeParam, T7 <: org.scalax.asuna.mapper.TypeParam, T8 <: org.scalax.asuna.mapper.TypeParam, T9 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8], T9, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H], item: T9#H): (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)          = p.pudaoToTuple(item)
      override def takeHead(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): T9#H                                                                   = t._1
      override def takeTail(t: (T9#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H)): Item8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]                  = ReverseHListItem0.pudao(t._9).pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType8[T1, T2, T3, T4, T5, T6, T7, T8]#T, T9#T, XyyTupleType9[T9, T1, T2, T3, T4, T5, T6, T7, T8]#T] = hlistPut9[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T, T9#T]
    }
}
