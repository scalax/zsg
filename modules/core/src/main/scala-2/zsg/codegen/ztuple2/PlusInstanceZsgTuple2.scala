package zsg
object PlusInstanceZsgTuple2 {
  type HighTupleAlias2[I1]          = I1
  type HighTupleAliasUpper2[I1, I2] = ZsgTuple2[I1, I2]
  class PContextNum1[
    Tuple1_Context1,
    I1
  ] extends Plus1[HighTupleAlias2[Tuple1_Context1], I1, ZsgTuple2[Tuple1_Context1, I1]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum1: PContextNum1[Any, Any] = new PContextNum1[Any, Any]
  def contextNum1[
    Tuple1_Context1,
    I1
  ]: PContextNum1[
    Tuple1_Context1,
    I1
  ] =
    cacheContextNum1.asInstanceOf[PContextNum1[
      Tuple1_Context1,
      I1
    ]]
  class PContextNum2[
    Tuple1_Context1,
    Tuple1_Context2,
    I1,
    I2
  ] extends Plus2[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], I1, I2, ZsgTuple2[Tuple1_Context1, I1], ZsgTuple2[Tuple1_Context2, I2]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum2: PContextNum2[Any, Any, Any, Any] = new PContextNum2[Any, Any, Any, Any]
  def contextNum2[
    Tuple1_Context1,
    Tuple1_Context2,
    I1,
    I2
  ]: PContextNum2[
    Tuple1_Context1,
    Tuple1_Context2,
    I1,
    I2
  ] =
    cacheContextNum2.asInstanceOf[PContextNum2[
      Tuple1_Context1,
      Tuple1_Context2,
      I1,
      I2
    ]]
  class PContextNum3[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    I1,
    I2,
    I3
  ] extends Plus3[
        HighTupleAlias2[Tuple1_Context1],
        HighTupleAlias2[Tuple1_Context2],
        HighTupleAlias2[Tuple1_Context3],
        I1,
        I2,
        I3,
        ZsgTuple2[Tuple1_Context1, I1],
        ZsgTuple2[Tuple1_Context2, I2],
        ZsgTuple2[Tuple1_Context3, I3]
      ] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum3: PContextNum3[Any, Any, Any, Any, Any, Any] = new PContextNum3[Any, Any, Any, Any, Any, Any]
  def contextNum3[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    I1,
    I2,
    I3
  ]: PContextNum3[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    I1,
    I2,
    I3
  ] =
    cacheContextNum3.asInstanceOf[PContextNum3[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      I1,
      I2,
      I3
    ]]
  class PContextNum4[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    I1,
    I2,
    I3,
    I4
  ] extends Plus4[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], HighTupleAlias2[Tuple1_Context3], HighTupleAlias2[
        Tuple1_Context4
      ], I1, I2, I3, I4, ZsgTuple2[Tuple1_Context1, I1], ZsgTuple2[Tuple1_Context2, I2], ZsgTuple2[Tuple1_Context3, I3], ZsgTuple2[Tuple1_Context4, I4]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeHead4(n: ZsgTuple2[Tuple1_Context4, I4]): HighTupleAlias2[Tuple1_Context4]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def takeTail4(n: ZsgTuple2[Tuple1_Context4, I4]): I4                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus4(m: HighTupleAlias2[Tuple1_Context4], n: I4): ZsgTuple2[Tuple1_Context4, I4] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum4: PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any] = new PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum4[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    I1,
    I2,
    I3,
    I4
  ]: PContextNum4[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    I1,
    I2,
    I3,
    I4
  ] =
    cacheContextNum4.asInstanceOf[PContextNum4[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      I1,
      I2,
      I3,
      I4
    ]]
  class PContextNum5[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] extends Plus5[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], HighTupleAlias2[Tuple1_Context3], HighTupleAlias2[Tuple1_Context4], HighTupleAlias2[
        Tuple1_Context5
      ], I1, I2, I3, I4, I5, ZsgTuple2[Tuple1_Context1, I1], ZsgTuple2[Tuple1_Context2, I2], ZsgTuple2[Tuple1_Context3, I3], ZsgTuple2[Tuple1_Context4, I4], ZsgTuple2[
        Tuple1_Context5,
        I5
      ]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeHead4(n: ZsgTuple2[Tuple1_Context4, I4]): HighTupleAlias2[Tuple1_Context4]    = n.i1
    override def takeHead5(n: ZsgTuple2[Tuple1_Context5, I5]): HighTupleAlias2[Tuple1_Context5]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def takeTail4(n: ZsgTuple2[Tuple1_Context4, I4]): I4                                  = n.i2
    override def takeTail5(n: ZsgTuple2[Tuple1_Context5, I5]): I5                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus4(m: HighTupleAlias2[Tuple1_Context4], n: I4): ZsgTuple2[Tuple1_Context4, I4] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus5(m: HighTupleAlias2[Tuple1_Context5], n: I5): ZsgTuple2[Tuple1_Context5, I5] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum5: PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] = new PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum5[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ]: PContextNum5[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] =
    cacheContextNum5.asInstanceOf[PContextNum5[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      I1,
      I2,
      I3,
      I4,
      I5
    ]]
  class PContextNum6[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] extends Plus6[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], HighTupleAlias2[Tuple1_Context3], HighTupleAlias2[Tuple1_Context4], HighTupleAlias2[
        Tuple1_Context5
      ], HighTupleAlias2[Tuple1_Context6], I1, I2, I3, I4, I5, I6, ZsgTuple2[Tuple1_Context1, I1], ZsgTuple2[Tuple1_Context2, I2], ZsgTuple2[
        Tuple1_Context3,
        I3
      ], ZsgTuple2[Tuple1_Context4, I4], ZsgTuple2[Tuple1_Context5, I5], ZsgTuple2[Tuple1_Context6, I6]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeHead4(n: ZsgTuple2[Tuple1_Context4, I4]): HighTupleAlias2[Tuple1_Context4]    = n.i1
    override def takeHead5(n: ZsgTuple2[Tuple1_Context5, I5]): HighTupleAlias2[Tuple1_Context5]    = n.i1
    override def takeHead6(n: ZsgTuple2[Tuple1_Context6, I6]): HighTupleAlias2[Tuple1_Context6]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def takeTail4(n: ZsgTuple2[Tuple1_Context4, I4]): I4                                  = n.i2
    override def takeTail5(n: ZsgTuple2[Tuple1_Context5, I5]): I5                                  = n.i2
    override def takeTail6(n: ZsgTuple2[Tuple1_Context6, I6]): I6                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus4(m: HighTupleAlias2[Tuple1_Context4], n: I4): ZsgTuple2[Tuple1_Context4, I4] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus5(m: HighTupleAlias2[Tuple1_Context5], n: I5): ZsgTuple2[Tuple1_Context5, I5] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus6(m: HighTupleAlias2[Tuple1_Context6], n: I6): ZsgTuple2[Tuple1_Context6, I6] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum6: PContextNum6[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum6[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum6[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ]: PContextNum6[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] =
    cacheContextNum6.asInstanceOf[PContextNum6[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      I1,
      I2,
      I3,
      I4,
      I5,
      I6
    ]]
  class PContextNum7[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] extends Plus7[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], HighTupleAlias2[Tuple1_Context3], HighTupleAlias2[Tuple1_Context4], HighTupleAlias2[
        Tuple1_Context5
      ], HighTupleAlias2[Tuple1_Context6], HighTupleAlias2[Tuple1_Context7], I1, I2, I3, I4, I5, I6, I7, ZsgTuple2[Tuple1_Context1, I1], ZsgTuple2[
        Tuple1_Context2,
        I2
      ], ZsgTuple2[Tuple1_Context3, I3], ZsgTuple2[Tuple1_Context4, I4], ZsgTuple2[Tuple1_Context5, I5], ZsgTuple2[Tuple1_Context6, I6], ZsgTuple2[Tuple1_Context7, I7]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeHead4(n: ZsgTuple2[Tuple1_Context4, I4]): HighTupleAlias2[Tuple1_Context4]    = n.i1
    override def takeHead5(n: ZsgTuple2[Tuple1_Context5, I5]): HighTupleAlias2[Tuple1_Context5]    = n.i1
    override def takeHead6(n: ZsgTuple2[Tuple1_Context6, I6]): HighTupleAlias2[Tuple1_Context6]    = n.i1
    override def takeHead7(n: ZsgTuple2[Tuple1_Context7, I7]): HighTupleAlias2[Tuple1_Context7]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def takeTail4(n: ZsgTuple2[Tuple1_Context4, I4]): I4                                  = n.i2
    override def takeTail5(n: ZsgTuple2[Tuple1_Context5, I5]): I5                                  = n.i2
    override def takeTail6(n: ZsgTuple2[Tuple1_Context6, I6]): I6                                  = n.i2
    override def takeTail7(n: ZsgTuple2[Tuple1_Context7, I7]): I7                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus4(m: HighTupleAlias2[Tuple1_Context4], n: I4): ZsgTuple2[Tuple1_Context4, I4] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus5(m: HighTupleAlias2[Tuple1_Context5], n: I5): ZsgTuple2[Tuple1_Context5, I5] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus6(m: HighTupleAlias2[Tuple1_Context6], n: I6): ZsgTuple2[Tuple1_Context6, I6] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus7(m: HighTupleAlias2[Tuple1_Context7], n: I7): ZsgTuple2[Tuple1_Context7, I7] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum7: PContextNum7[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum7[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum7[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ]: PContextNum7[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] =
    cacheContextNum7.asInstanceOf[PContextNum7[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7,
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
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    Tuple1_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] extends Plus8[HighTupleAlias2[Tuple1_Context1], HighTupleAlias2[Tuple1_Context2], HighTupleAlias2[Tuple1_Context3], HighTupleAlias2[Tuple1_Context4], HighTupleAlias2[
        Tuple1_Context5
      ], HighTupleAlias2[Tuple1_Context6], HighTupleAlias2[Tuple1_Context7], HighTupleAlias2[Tuple1_Context8], I1, I2, I3, I4, I5, I6, I7, I8, ZsgTuple2[
        Tuple1_Context1,
        I1
      ], ZsgTuple2[Tuple1_Context2, I2], ZsgTuple2[Tuple1_Context3, I3], ZsgTuple2[Tuple1_Context4, I4], ZsgTuple2[Tuple1_Context5, I5], ZsgTuple2[
        Tuple1_Context6,
        I6
      ], ZsgTuple2[Tuple1_Context7, I7], ZsgTuple2[Tuple1_Context8, I8]] {
    override def takeHead1(n: ZsgTuple2[Tuple1_Context1, I1]): HighTupleAlias2[Tuple1_Context1]    = n.i1
    override def takeHead2(n: ZsgTuple2[Tuple1_Context2, I2]): HighTupleAlias2[Tuple1_Context2]    = n.i1
    override def takeHead3(n: ZsgTuple2[Tuple1_Context3, I3]): HighTupleAlias2[Tuple1_Context3]    = n.i1
    override def takeHead4(n: ZsgTuple2[Tuple1_Context4, I4]): HighTupleAlias2[Tuple1_Context4]    = n.i1
    override def takeHead5(n: ZsgTuple2[Tuple1_Context5, I5]): HighTupleAlias2[Tuple1_Context5]    = n.i1
    override def takeHead6(n: ZsgTuple2[Tuple1_Context6, I6]): HighTupleAlias2[Tuple1_Context6]    = n.i1
    override def takeHead7(n: ZsgTuple2[Tuple1_Context7, I7]): HighTupleAlias2[Tuple1_Context7]    = n.i1
    override def takeHead8(n: ZsgTuple2[Tuple1_Context8, I8]): HighTupleAlias2[Tuple1_Context8]    = n.i1
    override def takeTail1(n: ZsgTuple2[Tuple1_Context1, I1]): I1                                  = n.i2
    override def takeTail2(n: ZsgTuple2[Tuple1_Context2, I2]): I2                                  = n.i2
    override def takeTail3(n: ZsgTuple2[Tuple1_Context3, I3]): I3                                  = n.i2
    override def takeTail4(n: ZsgTuple2[Tuple1_Context4, I4]): I4                                  = n.i2
    override def takeTail5(n: ZsgTuple2[Tuple1_Context5, I5]): I5                                  = n.i2
    override def takeTail6(n: ZsgTuple2[Tuple1_Context6, I6]): I6                                  = n.i2
    override def takeTail7(n: ZsgTuple2[Tuple1_Context7, I7]): I7                                  = n.i2
    override def takeTail8(n: ZsgTuple2[Tuple1_Context8, I8]): I8                                  = n.i2
    override def plus1(m: HighTupleAlias2[Tuple1_Context1], n: I1): ZsgTuple2[Tuple1_Context1, I1] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus2(m: HighTupleAlias2[Tuple1_Context2], n: I2): ZsgTuple2[Tuple1_Context2, I2] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus3(m: HighTupleAlias2[Tuple1_Context3], n: I3): ZsgTuple2[Tuple1_Context3, I3] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus4(m: HighTupleAlias2[Tuple1_Context4], n: I4): ZsgTuple2[Tuple1_Context4, I4] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus5(m: HighTupleAlias2[Tuple1_Context5], n: I5): ZsgTuple2[Tuple1_Context5, I5] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus6(m: HighTupleAlias2[Tuple1_Context6], n: I6): ZsgTuple2[Tuple1_Context6, I6] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus7(m: HighTupleAlias2[Tuple1_Context7], n: I7): ZsgTuple2[Tuple1_Context7, I7] = new ZsgTuple2(i1 = m, i2 = n)
    override def plus8(m: HighTupleAlias2[Tuple1_Context8], n: I8): ZsgTuple2[Tuple1_Context8, I8] = new ZsgTuple2(i1 = m, i2 = n)
  }
  val cacheContextNum8: PContextNum8[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum8[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum8[
    Tuple1_Context1,
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    Tuple1_Context8,
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
    Tuple1_Context2,
    Tuple1_Context3,
    Tuple1_Context4,
    Tuple1_Context5,
    Tuple1_Context6,
    Tuple1_Context7,
    Tuple1_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] =
    cacheContextNum8.asInstanceOf[PContextNum8[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7,
      Tuple1_Context8,
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
