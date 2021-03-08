package zsg.scala_tuple.tuple_support
object PlusInstanceScalaTuple_5 {
  type HighTupleAlias5[I1, I2, I3, I4]          = zsg.ZsgTuple2[zsg.ZsgTuple2[I1, I2], zsg.ZsgTuple2[I3, I4]]
  type HighTupleAliasUpper5[I1, I2, I3, I4, I5] = zsg.ZsgTuple2[zsg.ZsgTuple2[zsg.ZsgTuple2[I1, I2], zsg.ZsgTuple2[I3, I4]], I5]
  class PContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    I1
  ] extends zsg.Plus1[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], I1, Tuple5[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        I1
      ]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum1: PContextNum1[Any, Any, Any, Any, Any] = new PContextNum1[Any, Any, Any, Any, Any]
  def contextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    I1
  ]: PContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    I1
  ] = cacheContextNum1.asInstanceOf[PContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    I1
  ]]
  class PContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    I1,
    I2
  ] extends zsg.Plus2[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], I1, I2, Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1], Tuple5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        I2
      ]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum2: PContextNum2[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] = new PContextNum2[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    I1,
    I2
  ]: PContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    I1,
    I2
  ] = cacheContextNum2.asInstanceOf[PContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    I1,
    I2
  ]]
  class PContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    I1,
    I2,
    I3
  ] extends zsg.Plus3[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], I1, I2, I3, Tuple5[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        I1
      ], Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2], Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum3: PContextNum3[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum3[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    I1,
    I2,
    I3
  ]: PContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    I1,
    I2,
    I3
  ] = cacheContextNum3.asInstanceOf[PContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    I1,
    I2,
    I3
  ]]
  class PContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    I1,
    I2,
    I3,
    I4
  ] extends zsg.Plus4[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], HighTupleAlias5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4
      ], I1, I2, I3, I4, Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1], Tuple5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        I2
      ], Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3], Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead4(
      n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]
    ): HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def takeTail4(n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]): I4 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus4(
      m: HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      n: I4
    ): Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum4: PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    I1,
    I2,
    I3,
    I4
  ]: PContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    I1,
    I2,
    I3,
    I4
  ] = cacheContextNum4.asInstanceOf[PContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    I1,
    I2,
    I3,
    I4
  ]]
  class PContextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] extends zsg.Plus5[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], HighTupleAlias5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4
      ], HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5], I1, I2, I3, I4, I5, Tuple5[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        I1
      ], Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2], Tuple5[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        I3
      ], Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4], Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead4(
      n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]
    ): HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead5(
      n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]
    ): HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def takeTail4(n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]): I4 = n._5
    override def takeTail5(n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]): I5 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus4(
      m: HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      n: I4
    ): Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus5(
      m: HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      n: I5
    ): Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum5: PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ]: PContextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] = cacheContextNum5.asInstanceOf[PContextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ]]
  class PContextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] extends zsg.Plus6[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], HighTupleAlias5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4
      ], HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5], HighTupleAlias5[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6
      ], I1, I2, I3, I4, I5, I6, Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1], Tuple5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        I2
      ], Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3], Tuple5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        I4
      ], Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5], Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead4(
      n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]
    ): HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead5(
      n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]
    ): HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead6(
      n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]
    ): HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def takeTail4(n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]): I4 = n._5
    override def takeTail5(n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]): I5 = n._5
    override def takeTail6(n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]): I6 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus4(
      m: HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      n: I4
    ): Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus5(
      m: HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      n: I5
    ): Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus6(
      m: HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
      n: I6
    ): Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum6
    : PContextNum6[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum6[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ]: PContextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] = cacheContextNum6.asInstanceOf[PContextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ]]
  class PContextNum7[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] extends zsg.Plus7[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], HighTupleAlias5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4
      ], HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5], HighTupleAlias5[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6
      ], HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7], I1, I2, I3, I4, I5, I6, I7, Tuple5[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        I1
      ], Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2], Tuple5[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        I3
      ], Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4], Tuple5[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        I5
      ], Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6], Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead4(
      n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]
    ): HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead5(
      n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]
    ): HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead6(
      n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]
    ): HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead7(
      n: Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7]
    ): HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def takeTail4(n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]): I4 = n._5
    override def takeTail5(n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]): I5 = n._5
    override def takeTail6(n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]): I6 = n._5
    override def takeTail7(n: Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7]): I7 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus4(
      m: HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      n: I4
    ): Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus5(
      m: HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      n: I5
    ): Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus6(
      m: HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
      n: I6
    ): Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus7(
      m: HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7],
      n: I7
    ): Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum7: PContextNum7[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any
  ] = new PContextNum7[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any
  ]
  def contextNum7[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ]: PContextNum7[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] = cacheContextNum7.asInstanceOf[PContextNum7[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ]]
  class PContextNum8[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] extends zsg.Plus8[HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], HighTupleAlias5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2
      ], HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], HighTupleAlias5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4
      ], HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5], HighTupleAlias5[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6
      ], HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7], HighTupleAlias5[
        Tuple1_Context8,
        Tuple2_Context8,
        Tuple3_Context8,
        Tuple4_Context8
      ], I1, I2, I3, I4, I5, I6, I7, I8, Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1], Tuple5[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        I2
      ], Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3], Tuple5[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        I4
      ], Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5], Tuple5[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        I6
      ], Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7], Tuple5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, I8]] {
    override def takeHead1(
      n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]
    ): HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead2(
      n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]
    ): HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead3(
      n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]
    ): HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead4(
      n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]
    ): HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead5(
      n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]
    ): HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead6(
      n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]
    ): HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead7(
      n: Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7]
    ): HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeHead8(
      n: Tuple5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, I8]
    ): HighTupleAlias5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8] =
      new zsg.ZsgTuple2(i1 = new zsg.ZsgTuple2(i1 = n._1, i2 = n._2), i2 = new zsg.ZsgTuple2(i1 = n._3, i2 = n._4))
    override def takeTail1(n: Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1]): I1 = n._5
    override def takeTail2(n: Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2]): I2 = n._5
    override def takeTail3(n: Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3]): I3 = n._5
    override def takeTail4(n: Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4]): I4 = n._5
    override def takeTail5(n: Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5]): I5 = n._5
    override def takeTail6(n: Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6]): I6 = n._5
    override def takeTail7(n: Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7]): I7 = n._5
    override def takeTail8(n: Tuple5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, I8]): I8 = n._5
    override def plus1(
      m: HighTupleAlias5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      n: I1
    ): Tuple5[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, I1] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus2(
      m: HighTupleAlias5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      n: I2
    ): Tuple5[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, I2] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus3(
      m: HighTupleAlias5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      n: I3
    ): Tuple5[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, I3] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus4(
      m: HighTupleAlias5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      n: I4
    ): Tuple5[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, I4] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus5(
      m: HighTupleAlias5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      n: I5
    ): Tuple5[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, I5] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus6(
      m: HighTupleAlias5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
      n: I6
    ): Tuple5[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, I6] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus7(
      m: HighTupleAlias5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7],
      n: I7
    ): Tuple5[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, I7] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
    override def plus8(
      m: HighTupleAlias5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8],
      n: I8
    ): Tuple5[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, I8] = new Tuple5(_1 = m.i1.i1, _2 = m.i1.i2, _3 = m.i2.i1, _4 = m.i2.i2, _5 = n)
  }
  val cacheContextNum8: PContextNum8[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any
  ] = new PContextNum8[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any
  ]
  def contextNum8[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ]: PContextNum8[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] = cacheContextNum8.asInstanceOf[PContextNum8[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ]]
}
