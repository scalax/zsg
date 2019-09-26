package org.scalax.asuna.mapper.item
object ArticleXyyTuplePlus {
  def miaomiaomiao1[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                            = HListItem0.eatToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                    = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                    = HListItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao1[T0#T, T1#T]
    }
  def miaomiaomiao2[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                            = ReverseHListItem0.pudaoToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                    = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                    = ReverseHListItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao2[T0#T, T1#T]
    }
  def miaomiaomiao3[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                            = TreeItem0.eatToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                    = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                    = TreeItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao3[T0#T, T1#T]
    }
  def miaomiaomiao4[T0 <: EatXyyType0, T1 <: org.scalax.asuna.mapper.TypeParam]: org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] =
    new org.scalax.asuna.mapper.Plus[T0, T1, XyyTupleType1[T1]] {
      override def plus(p: T0#H, item: T1#H): Tuple1[T1#H]                            = ReverseTreeItem0.pudaoToTuple(item)
      override def takeHead(t: Tuple1[T1#H]): T1#H                                    = t._1
      override def takeTail(t: Tuple1[T1#H]): T0#H                                    = ReverseTreeItem0
      override def sub: org.scalax.asuna.mapper.Plus[T0#T, T1#T, XyyTupleType1[T1#T]] = miaomiaomiao4[T0#T, T1#T]
    }
  def hlistPlus1[T1 <: org.scalax.asuna.mapper.TypeParam] = miaomiaomiao1[EatXyyType0, T1]
  def hlistPut1[T1 <: org.scalax.asuna.mapper.TypeParam]  = miaomiaomiao2[EatXyyType0, T1]
  def item2Plus1[T1 <: org.scalax.asuna.mapper.TypeParam] = miaomiaomiao3[EatXyyType0, T1]
  def item2Put1[T1 <: org.scalax.asuna.mapper.TypeParam]  = miaomiaomiao4[EatXyyType0, T1]
  def hlistPlus2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] {
      override def plus(p: Item1[T1#H], item: T2#H): Tuple2[T1#H, T2#H]                                = p.eatToTuple(item)
      override def takeHead(t: Tuple2[T1#H, T2#H]): T2#H                                               = t._2
      override def takeTail(t: Tuple2[T1#H, T2#H]): Item1[T1#H]                                        = HListItem0.eat(t._1)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T1, T2]#T] = hlistPlus2[T1#T, T2#T]
    }
  def hlistPut2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] {
      override def plus(p: Item1[T1#H], item: T2#H): Tuple2[T2#H, T1#H]                                = p.pudaoToTuple(item)
      override def takeHead(t: Tuple2[T2#H, T1#H]): T2#H                                               = t._1
      override def takeTail(t: Tuple2[T2#H, T1#H]): Item1[T1#H]                                        = ReverseHListItem0.pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T2, T1]#T] = hlistPut2[T1#T, T2#T]
    }
  def item2Plus2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T1, T2]] {
      override def plus(p: Item1[T1#H], item: T2#H): Tuple2[T1#H, T2#H]                                = p.eatToTuple(item)
      override def takeHead(t: Tuple2[T1#H, T2#H]): T2#H                                               = t._2
      override def takeTail(t: Tuple2[T1#H, T2#H]): Item1[T1#H]                                        = TreeItem0.eat(t._1)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T1, T2]#T] = item2Plus2[T1#T, T2#T]
    }
  def item2Put2[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType1[T1], T2, XyyTupleType2[T2, T1]] {
      override def plus(p: Item1[T1#H], item: T2#H): Tuple2[T2#H, T1#H]                                = p.pudaoToTuple(item)
      override def takeHead(t: Tuple2[T2#H, T1#H]): T2#H                                               = t._1
      override def takeTail(t: Tuple2[T2#H, T1#H]): Item1[T1#H]                                        = ReverseTreeItem0.pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[T1]#T, T2#T, XyyTupleType2[T2, T1]#T] = item2Put2[T1#T, T2#T]
    }
  def hlistPlus3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Tuple3[T1#H, T2#H, T3#H]                            = p.eatToTuple(item)
      override def takeHead(t: Tuple3[T1#H, T2#H, T3#H]): T3#H                                                 = t._3
      override def takeTail(t: Tuple3[T1#H, T2#H, T3#H]): Item2[T1#H, T2#H]                                    = HListItem0.eat(t._1).eat(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T1, T2, T3]#T] = hlistPlus3[T1#T, T2#T, T3#T]
    }
  def hlistPut3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Tuple3[T3#H, T1#H, T2#H]                            = p.pudaoToTuple(item)
      override def takeHead(t: Tuple3[T3#H, T1#H, T2#H]): T3#H                                                 = t._1
      override def takeTail(t: Tuple3[T3#H, T1#H, T2#H]): Item2[T1#H, T2#H]                                    = ReverseHListItem0.pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T3, T1, T2]#T] = hlistPut3[T1#T, T2#T, T3#T]
    }
  def item2Plus3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T1, T2, T3]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Tuple3[T1#H, T2#H, T3#H]                            = p.eatToTuple(item)
      override def takeHead(t: Tuple3[T1#H, T2#H, T3#H]): T3#H                                                 = t._3
      override def takeTail(t: Tuple3[T1#H, T2#H, T3#H]): Item2[T1#H, T2#H]                                    = TreeItem0.eat(t._1).eat(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T1, T2, T3]#T] = item2Plus3[T1#T, T2#T, T3#T]
    }
  def item2Put3[T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam]
    : org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2], T3, XyyTupleType3[T3, T1, T2]] {
      override def plus(p: Item2[T1#H, T2#H], item: T3#H): Tuple3[T3#H, T1#H, T2#H]                            = p.pudaoToTuple(item)
      override def takeHead(t: Tuple3[T3#H, T1#H, T2#H]): T3#H                                                 = t._1
      override def takeTail(t: Tuple3[T3#H, T1#H, T2#H]): Item2[T1#H, T2#H]                                    = ReverseTreeItem0.pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType2[T1, T2]#T, T3#T, XyyTupleType3[T3, T1, T2]#T] = item2Put3[T1#T, T2#T, T3#T]
    }
  def hlistPlus4[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T1#H, T2#H, T3#H, T4#H]                        = p.eatToTuple(item)
      override def takeHead(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): T4#H                                                   = t._4
      override def takeTail(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): Item3[T1#H, T2#H, T3#H]                                = HListItem0.eat(t._1).eat(t._2).eat(t._3)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T1, T2, T3, T4]#T] = hlistPlus4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPut4[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T4#H, T1#H, T2#H, T3#H]                        = p.pudaoToTuple(item)
      override def takeHead(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): T4#H                                                   = t._1
      override def takeTail(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): Item3[T1#H, T2#H, T3#H]                                = ReverseHListItem0.pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T4, T1, T2, T3]#T] = hlistPut4[T1#T, T2#T, T3#T, T4#T]
    }
  def item2Plus4[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T1, T2, T3, T4]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T1#H, T2#H, T3#H, T4#H]                        = p.eatToTuple(item)
      override def takeHead(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): T4#H                                                   = t._4
      override def takeTail(t: Tuple4[T1#H, T2#H, T3#H, T4#H]): Item3[T1#H, T2#H, T3#H]                                = TreeItem0.eat(t._1).eat(t._2).eat(t._3)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T1, T2, T3, T4]#T] = item2Plus4[T1#T, T2#T, T3#T, T4#T]
    }
  def item2Put4[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3], T4, XyyTupleType4[T4, T1, T2, T3]] {
      override def plus(p: Item3[T1#H, T2#H, T3#H], item: T4#H): Tuple4[T4#H, T1#H, T2#H, T3#H]                        = p.pudaoToTuple(item)
      override def takeHead(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): T4#H                                                   = t._1
      override def takeTail(t: Tuple4[T4#H, T1#H, T2#H, T3#H]): Item3[T1#H, T2#H, T3#H]                                = ReverseTreeItem0.pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType3[T1, T2, T3]#T, T4#T, XyyTupleType4[T4, T1, T2, T3]#T] = item2Put4[T1#T, T2#T, T3#T, T4#T]
    }
  def hlistPlus5[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]                    = p.eatToTuple(item)
      override def takeHead(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): T5#H                                                     = t._5
      override def takeTail(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): Item4[T1#H, T2#H, T3#H, T4#H]                            = HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T1, T2, T3, T4, T5]#T] = hlistPlus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPut5[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]                    = p.pudaoToTuple(item)
      override def takeHead(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): T5#H                                                     = t._1
      override def takeTail(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): Item4[T1#H, T2#H, T3#H, T4#H]                            = ReverseHListItem0.pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T5, T1, T2, T3, T4]#T] = hlistPut5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def item2Plus5[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T1, T2, T3, T4, T5]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]                    = p.eatToTuple(item)
      override def takeHead(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): T5#H                                                     = t._5
      override def takeTail(t: Tuple5[T1#H, T2#H, T3#H, T4#H, T5#H]): Item4[T1#H, T2#H, T3#H, T4#H]                            = TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T1, T2, T3, T4, T5]#T] = item2Plus5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def item2Put5[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4], T5, XyyTupleType5[T5, T1, T2, T3, T4]] {
      override def plus(p: Item4[T1#H, T2#H, T3#H, T4#H], item: T5#H): Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]                    = p.pudaoToTuple(item)
      override def takeHead(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): T5#H                                                     = t._1
      override def takeTail(t: Tuple5[T5#H, T1#H, T2#H, T3#H, T4#H]): Item4[T1#H, T2#H, T3#H, T4#H]                            = ReverseTreeItem0.pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType4[T1, T2, T3, T4]#T, T5#T, XyyTupleType5[T5, T1, T2, T3, T4]#T] = item2Put5[T1#T, T2#T, T3#T, T4#T, T5#T]
    }
  def hlistPlus6[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                        = t._6
      override def takeTail(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T1, T2, T3, T4, T5, T6]#T] =
        hlistPlus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPut6[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                        = t._1
      override def takeTail(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ReverseHListItem0.pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T6, T1, T2, T3, T4, T5]#T] =
        hlistPut6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def item2Plus6[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T6#H                                        = t._6
      override def takeTail(t: Tuple6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T1, T2, T3, T4, T5, T6]#T] =
        item2Plus6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def item2Put6[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5], T6, XyyTupleType6[T6, T1, T2, T3, T4, T5]] {
      override def plus(p: Item5[T1#H, T2#H, T3#H, T4#H, T5#H], item: T6#H): Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): T6#H                                        = t._1
      override def takeTail(t: Tuple6[T6#H, T1#H, T2#H, T3#H, T4#H, T5#H]): Item5[T1#H, T2#H, T3#H, T4#H, T5#H] =
        ReverseTreeItem0.pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType5[T1, T2, T3, T4, T5]#T, T6#T, XyyTupleType6[T6, T1, T2, T3, T4, T5]#T] =
        item2Put6[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T]
    }
  def hlistPlus7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T7#H                                              = t._7
      override def takeTail(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPlus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPut7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T7#H                                              = t._1
      override def takeTail(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ReverseHListItem0.pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]#T] =
        hlistPut7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def item2Plus7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T7#H                                              = t._7
      override def takeTail(t: Tuple7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T1, T2, T3, T4, T5, T6, T7]#T] =
        item2Plus7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def item2Put7[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6], T7, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]] {
      override def plus(p: Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H], item: T7#H): Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): T7#H                                              = t._1
      override def takeTail(t: Tuple7[T7#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H]): Item6[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H] =
        ReverseTreeItem0.pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType6[T1, T2, T3, T4, T5, T6]#T, T7#T, XyyTupleType7[T7, T1, T2, T3, T4, T5, T6]#T] =
        item2Put7[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T]
    }
  def hlistPlus8[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T8#H                                                    = t._8
      override def takeTail(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        HListItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        hlistPlus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def hlistPut8[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T8#H                                                    = t._1
      override def takeTail(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ReverseHListItem0.pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        hlistPut8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def item2Plus8[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H] = p.eatToTuple(item)
      override def takeHead(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): T8#H                                                    = t._8
      override def takeTail(t: Tuple8[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H, T8#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        TreeItem0.eat(t._1).eat(t._2).eat(t._3).eat(t._4).eat(t._5).eat(t._6).eat(t._7)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T1, T2, T3, T4, T5, T6, T7, T8]#T] =
        item2Plus8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
  def item2Put8[
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam
  ]: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] =
    new org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7], T8, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]] {
      override def plus(p: Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H], item: T8#H): Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] = p.pudaoToTuple(item)
      override def takeHead(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): T8#H                                                    = t._1
      override def takeTail(t: Tuple8[T8#H, T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H]): Item7[T1#H, T2#H, T3#H, T4#H, T5#H, T6#H, T7#H] =
        ReverseTreeItem0.pudao(t._8).pudao(t._7).pudao(t._6).pudao(t._5).pudao(t._4).pudao(t._3).pudao(t._2)
      override def sub: org.scalax.asuna.mapper.Plus[EatXyyType7[T1, T2, T3, T4, T5, T6, T7]#T, T8#T, XyyTupleType8[T8, T1, T2, T3, T4, T5, T6, T7]#T] =
        item2Put8[T1#T, T2#T, T3#T, T4#T, T5#T, T6#T, T7#T, T8#T]
    }
}
