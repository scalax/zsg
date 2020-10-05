package zsg
object PlusInstanceTuple6 {
  type HighTupleAlias6[I1, I2, I3, I4, I5]          = ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], I5]
  type HighTupleAliasUpper6[I1, I2, I3, I4, I5, I6] = ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[I5, I6]]
  class PContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    I1
  ] extends Plus1[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        I1,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum1: PContextNum1[Any, Any, Any, Any, Any, Any] = new PContextNum1[Any, Any, Any, Any, Any, Any]
  def contextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    I1
  ]: PContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    I1
  ] =
    cacheContextNum1.asInstanceOf[PContextNum1[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      I1
    ]]
  class PContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    I1,
    I2
  ] extends Plus2[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        I1,
        I2,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum2: PContextNum2[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum2[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    I1,
    I2
  ]: PContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    I1,
    I2
  ] =
    cacheContextNum2.asInstanceOf[PContextNum2[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      I1,
      I2
    ]]
  class PContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    I1,
    I2,
    I3
  ] extends Plus3[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        I1,
        I2,
        I3,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum3: PContextNum3[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum3[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    I1,
    I2,
    I3
  ]: PContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    I1,
    I2,
    I3
  ] =
    cacheContextNum3.asInstanceOf[PContextNum3[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      I1,
      I2,
      I3
    ]]
  class PContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    I1,
    I2,
    I3,
    I4
  ] extends Plus4[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        I1,
        I2,
        I3,
        I4,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum4: PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum4[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    I1,
    I2,
    I3,
    I4
  ]: PContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    I1,
    I2,
    I3,
    I4
  ] =
    cacheContextNum4.asInstanceOf[PContextNum4[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] extends Plus5[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        I1,
        I2,
        I3,
        I4,
        I5,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum5
    : PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] =
    new PContextNum5[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] =
    cacheContextNum5.asInstanceOf[PContextNum5[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] extends Plus6[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheContextNum6: PContextNum6[
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
  ] = new PContextNum6[
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
  def contextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] =
    cacheContextNum6.asInstanceOf[PContextNum6[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] extends Plus7[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6],
        ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead7(
      n: ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
    ): HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def takeTail7(n: ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]): I7 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus7(
      m: HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
      n: I7
    ): ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
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
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
      Tuple1_Context7,
      Tuple2_Context7,
      Tuple3_Context7,
      Tuple4_Context7,
      Tuple5_Context7,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] extends Plus8[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
        HighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        I8,
        ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6],
        ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7],
        ZTuple6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]
      ] {
    override def takeHead1(
      n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead7(
      n: ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
    ): HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead8(
      n: ZTuple6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]
    ): HighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def takeTail7(n: ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]): I7 = n.i6
    override def takeTail8(n: ZTuple6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]): I8 = n.i6
    override def plus1(
      m: HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZTuple6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZTuple6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZTuple6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZTuple6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZTuple6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZTuple6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus7(
      m: HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
      n: I7
    ): ZTuple6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus8(
      m: HighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8],
      n: I8
    ): ZTuple6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8] =
      new ZTuple6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
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
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
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
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
      Tuple1_Context7,
      Tuple2_Context7,
      Tuple3_Context7,
      Tuple4_Context7,
      Tuple5_Context7,
      Tuple1_Context8,
      Tuple2_Context8,
      Tuple3_Context8,
      Tuple4_Context8,
      Tuple5_Context8,
      I1,
      I2,
      I3,
      I4,
      I5,
      I6,
      I7,
      I8
    ]]
  type NodeHighTupleAlias6[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag] =
    ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], I5]
  type NodeHighTupleAliasUpper6[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag] =
    ZsgTuple2[ZsgTuple2[ZsgTuple2[I1, I2], ZsgTuple2[I3, I4]], ZsgTuple2[I5, I6]]
  class PNodeContextNum1[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    I1 <: TupleTag
  ] extends Plus1[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        I1,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum1: PNodeContextNum1[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag] =
    new PNodeContextNum1[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum1[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    I1 <: TupleTag
  ]: PNodeContextNum1[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    I1
  ] =
    cacheNodeContextNum1.asInstanceOf[PNodeContextNum1[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      I1
    ]]
  class PNodeContextNum2[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag
  ] extends Plus2[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        I1,
        I2,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum2: PNodeContextNum2[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag] =
    new PNodeContextNum2[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum2[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag
  ]: PNodeContextNum2[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    I1,
    I2
  ] =
    cacheNodeContextNum2.asInstanceOf[PNodeContextNum2[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      I1,
      I2
    ]]
  class PNodeContextNum3[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag
  ] extends Plus3[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        I1,
        I2,
        I3,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum3: PNodeContextNum3[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum3[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum3[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag
  ]: PNodeContextNum3[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    I1,
    I2,
    I3
  ] =
    cacheNodeContextNum3.asInstanceOf[PNodeContextNum3[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      I1,
      I2,
      I3
    ]]
  class PNodeContextNum4[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag
  ] extends Plus4[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        I1,
        I2,
        I3,
        I4,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum4: PNodeContextNum4[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum4[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum4[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag
  ]: PNodeContextNum4[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    I1,
    I2,
    I3,
    I4
  ] =
    cacheNodeContextNum4.asInstanceOf[PNodeContextNum4[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      I1,
      I2,
      I3,
      I4
    ]]
  class PNodeContextNum5[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag
  ] extends Plus5[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        I1,
        I2,
        I3,
        I4,
        I5,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum5: PNodeContextNum5[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum5[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum5[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag
  ]: PNodeContextNum5[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    I1,
    I2,
    I3,
    I4,
    I5
  ] =
    cacheNodeContextNum5.asInstanceOf[PNodeContextNum5[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      I1,
      I2,
      I3,
      I4,
      I5
    ]]
  class PNodeContextNum6[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag
  ] extends Plus6[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum6: PNodeContextNum6[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum6[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum6[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag
  ]: PNodeContextNum6[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6
  ] =
    cacheNodeContextNum6.asInstanceOf[PNodeContextNum6[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
      I1,
      I2,
      I3,
      I4,
      I5,
      I6
    ]]
  class PNodeContextNum7[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    Tuple1_Context7 <: TupleTag,
    Tuple2_Context7 <: TupleTag,
    Tuple3_Context7 <: TupleTag,
    Tuple4_Context7 <: TupleTag,
    Tuple5_Context7 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag,
    I7 <: TupleTag
  ] extends Plus7[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6],
        ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead7(
      n: ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
    ): NodeHighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def takeTail7(n: ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]): I7 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus7(
      m: NodeHighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
      n: I7
    ): ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum7: PNodeContextNum7[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum7[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum7[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    Tuple1_Context7 <: TupleTag,
    Tuple2_Context7 <: TupleTag,
    Tuple3_Context7 <: TupleTag,
    Tuple4_Context7 <: TupleTag,
    Tuple5_Context7 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag,
    I7 <: TupleTag
  ]: PNodeContextNum7[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7
  ] =
    cacheNodeContextNum7.asInstanceOf[PNodeContextNum7[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
      Tuple1_Context7,
      Tuple2_Context7,
      Tuple3_Context7,
      Tuple4_Context7,
      Tuple5_Context7,
      I1,
      I2,
      I3,
      I4,
      I5,
      I6,
      I7
    ]]
  class PNodeContextNum8[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    Tuple1_Context7 <: TupleTag,
    Tuple2_Context7 <: TupleTag,
    Tuple3_Context7 <: TupleTag,
    Tuple4_Context7 <: TupleTag,
    Tuple5_Context7 <: TupleTag,
    Tuple1_Context8 <: TupleTag,
    Tuple2_Context8 <: TupleTag,
    Tuple3_Context8 <: TupleTag,
    Tuple4_Context8 <: TupleTag,
    Tuple5_Context8 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag,
    I7 <: TupleTag,
    I8 <: TupleTag
  ] extends Plus8[
        HighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
        HighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
        HighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
        HighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
        HighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
        HighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
        HighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
        HighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8],
        I1,
        I2,
        I3,
        I4,
        I5,
        I6,
        I7,
        I8,
        ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1],
        ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2],
        ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3],
        ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4],
        ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5],
        ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6],
        ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7],
        ZNode6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]
      ] {
    override def takeHead1(
      n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]
    ): NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead2(
      n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]
    ): NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead3(
      n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]
    ): NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead4(
      n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]
    ): NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead5(
      n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]
    ): NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead6(
      n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]
    ): NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead7(
      n: ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]
    ): NodeHighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeHead8(
      n: ZNode6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]
    ): NodeHighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8] =
      new ZsgTuple2(i1 = new ZsgTuple2(i1 = new ZsgTuple2(i1 = n.i1, i2 = n.i2), i2 = new ZsgTuple2(i1 = n.i3, i2 = n.i4)), i2 = n.i5)
    override def takeTail1(n: ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1]): I1 = n.i6
    override def takeTail2(n: ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2]): I2 = n.i6
    override def takeTail3(n: ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3]): I3 = n.i6
    override def takeTail4(n: ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4]): I4 = n.i6
    override def takeTail5(n: ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5]): I5 = n.i6
    override def takeTail6(n: ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6]): I6 = n.i6
    override def takeTail7(n: ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7]): I7 = n.i6
    override def takeTail8(n: ZNode6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8]): I8 = n.i6
    override def plus1(
      m: NodeHighTupleAlias6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1],
      n: I1
    ): ZNode6[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, I1] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus2(
      m: NodeHighTupleAlias6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2],
      n: I2
    ): ZNode6[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, I2] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus3(
      m: NodeHighTupleAlias6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3],
      n: I3
    ): ZNode6[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, I3] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus4(
      m: NodeHighTupleAlias6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4],
      n: I4
    ): ZNode6[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, I4] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus5(
      m: NodeHighTupleAlias6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5],
      n: I5
    ): ZNode6[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, I5] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus6(
      m: NodeHighTupleAlias6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6],
      n: I6
    ): ZNode6[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, I6] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus7(
      m: NodeHighTupleAlias6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7],
      n: I7
    ): ZNode6[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, I7] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
    override def plus8(
      m: NodeHighTupleAlias6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8],
      n: I8
    ): ZNode6[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, I8] =
      new ZNode6(i1 = m.i1.i1.i1, i2 = m.i1.i1.i2, i3 = m.i1.i2.i1, i4 = m.i1.i2.i2, i5 = m.i2, i6 = n)
  }
  val cacheNodeContextNum8: PNodeContextNum8[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ] = new PNodeContextNum8[
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag
  ]
  def nodeContextNum8[
    Tuple1_Context1 <: TupleTag,
    Tuple2_Context1 <: TupleTag,
    Tuple3_Context1 <: TupleTag,
    Tuple4_Context1 <: TupleTag,
    Tuple5_Context1 <: TupleTag,
    Tuple1_Context2 <: TupleTag,
    Tuple2_Context2 <: TupleTag,
    Tuple3_Context2 <: TupleTag,
    Tuple4_Context2 <: TupleTag,
    Tuple5_Context2 <: TupleTag,
    Tuple1_Context3 <: TupleTag,
    Tuple2_Context3 <: TupleTag,
    Tuple3_Context3 <: TupleTag,
    Tuple4_Context3 <: TupleTag,
    Tuple5_Context3 <: TupleTag,
    Tuple1_Context4 <: TupleTag,
    Tuple2_Context4 <: TupleTag,
    Tuple3_Context4 <: TupleTag,
    Tuple4_Context4 <: TupleTag,
    Tuple5_Context4 <: TupleTag,
    Tuple1_Context5 <: TupleTag,
    Tuple2_Context5 <: TupleTag,
    Tuple3_Context5 <: TupleTag,
    Tuple4_Context5 <: TupleTag,
    Tuple5_Context5 <: TupleTag,
    Tuple1_Context6 <: TupleTag,
    Tuple2_Context6 <: TupleTag,
    Tuple3_Context6 <: TupleTag,
    Tuple4_Context6 <: TupleTag,
    Tuple5_Context6 <: TupleTag,
    Tuple1_Context7 <: TupleTag,
    Tuple2_Context7 <: TupleTag,
    Tuple3_Context7 <: TupleTag,
    Tuple4_Context7 <: TupleTag,
    Tuple5_Context7 <: TupleTag,
    Tuple1_Context8 <: TupleTag,
    Tuple2_Context8 <: TupleTag,
    Tuple3_Context8 <: TupleTag,
    Tuple4_Context8 <: TupleTag,
    Tuple5_Context8 <: TupleTag,
    I1 <: TupleTag,
    I2 <: TupleTag,
    I3 <: TupleTag,
    I4 <: TupleTag,
    I5 <: TupleTag,
    I6 <: TupleTag,
    I7 <: TupleTag,
    I8 <: TupleTag
  ]: PNodeContextNum8[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8
  ] =
    cacheNodeContextNum8.asInstanceOf[PNodeContextNum8[
      Tuple1_Context1,
      Tuple2_Context1,
      Tuple3_Context1,
      Tuple4_Context1,
      Tuple5_Context1,
      Tuple1_Context2,
      Tuple2_Context2,
      Tuple3_Context2,
      Tuple4_Context2,
      Tuple5_Context2,
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3,
      Tuple4_Context3,
      Tuple5_Context3,
      Tuple1_Context4,
      Tuple2_Context4,
      Tuple3_Context4,
      Tuple4_Context4,
      Tuple5_Context4,
      Tuple1_Context5,
      Tuple2_Context5,
      Tuple3_Context5,
      Tuple4_Context5,
      Tuple5_Context5,
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6,
      Tuple4_Context6,
      Tuple5_Context6,
      Tuple1_Context7,
      Tuple2_Context7,
      Tuple3_Context7,
      Tuple4_Context7,
      Tuple5_Context7,
      Tuple1_Context8,
      Tuple2_Context8,
      Tuple3_Context8,
      Tuple4_Context8,
      Tuple5_Context8,
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
