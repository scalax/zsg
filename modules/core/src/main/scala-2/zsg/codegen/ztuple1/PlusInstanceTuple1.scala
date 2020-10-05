package zsg
object PlusInstanceTuple1 {
  def pContextNum1[I1]: Plus1[ZsgTuple0, I1, ZTuple1[I1]] = new Plus1[ZsgTuple0, I1, ZTuple1[I1]] {
    override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
  }
  val cacheContextNum1: Plus1[ZsgTuple0, Any, ZTuple1[Any]] = pContextNum1[Any]
  def contextNum1[I1]: Plus1[ZsgTuple0, I1, ZTuple1[I1]]    = cacheContextNum1.asInstanceOf[Plus1[ZsgTuple0, I1, ZTuple1[I1]]]
  def pContextNum2[I1, I2]: Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZTuple1[I1], ZTuple1[I2]] = new Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZTuple1[I1], ZTuple1[I2]] {
    override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
    override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
    override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
  }
  val cacheContextNum2: Plus2[ZsgTuple0, ZsgTuple0, Any, Any, ZTuple1[Any], ZTuple1[Any]] = pContextNum2[Any, Any]
  def contextNum2[I1, I2]: Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZTuple1[I1], ZTuple1[I2]] =
    cacheContextNum2.asInstanceOf[Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZTuple1[I1], ZTuple1[I2]]]
  def pContextNum3[I1, I2, I3]: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3]] =
    new Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3]] {
      override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
      override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
      override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
      override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
      override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
    }
  val cacheContextNum3: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] = pContextNum3[Any, Any, Any]
  def contextNum3[I1, I2, I3]: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3]] =
    cacheContextNum3.asInstanceOf[Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3]]]
  def pContextNum4[I1, I2, I3, I4]: Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4]] =
    new Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4]] {
      override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZTuple1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
      override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
      override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
      override def takeTail4(n: ZTuple1[I4]): I4           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
      override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
      override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
      override def plus4(m: ZsgTuple0, n: I4): ZTuple1[I4] = new ZTuple1(n)
    }
  val cacheContextNum4: Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, Any, ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] =
    pContextNum4[Any, Any, Any, Any]
  def contextNum4[I1, I2, I3, I4]: Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4]] =
    cacheContextNum4.asInstanceOf[Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4]]]
  def pContextNum5[I1, I2, I3, I4, I5]
    : Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5]] =
    new Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5]] {
      override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZTuple1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead5(n: ZTuple1[I5]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
      override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
      override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
      override def takeTail4(n: ZTuple1[I4]): I4           = n.i1
      override def takeTail5(n: ZTuple1[I5]): I5           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
      override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
      override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
      override def plus4(m: ZsgTuple0, n: I4): ZTuple1[I4] = new ZTuple1(n)
      override def plus5(m: ZsgTuple0, n: I5): ZTuple1[I5] = new ZTuple1(n)
    }
  val cacheContextNum5
    : Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, Any, Any, ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] =
    pContextNum5[Any, Any, Any, Any, Any]
  def contextNum5[I1, I2, I3, I4, I5]
    : Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5]] = cacheContextNum5
    .asInstanceOf[Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5]]]
  def pContextNum6[I1, I2, I3, I4, I5, I6]: Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZTuple1[I1], ZTuple1[
    I2
  ], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6]] = new Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZTuple1[
    I1
  ], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6]] {
    override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead4(n: ZTuple1[I4]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead5(n: ZTuple1[I5]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead6(n: ZTuple1[I6]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
    override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
    override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
    override def takeTail4(n: ZTuple1[I4]): I4           = n.i1
    override def takeTail5(n: ZTuple1[I5]): I5           = n.i1
    override def takeTail6(n: ZTuple1[I6]): I6           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
    override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
    override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
    override def plus4(m: ZsgTuple0, n: I4): ZTuple1[I4] = new ZTuple1(n)
    override def plus5(m: ZsgTuple0, n: I5): ZTuple1[I5] = new ZTuple1(n)
    override def plus6(m: ZsgTuple0, n: I6): ZTuple1[I6] = new ZTuple1(n)
  }
  val cacheContextNum6: Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, Any, Any, Any, ZTuple1[Any], ZTuple1[Any], ZTuple1[
    Any
  ], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] = pContextNum6[Any, Any, Any, Any, Any, Any]
  def contextNum6[I1, I2, I3, I4, I5, I6]: Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZTuple1[I1], ZTuple1[
    I2
  ], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6]] =
    cacheContextNum6.asInstanceOf[Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZTuple1[I1], ZTuple1[I2], ZTuple1[
      I3
    ], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6]]]
  def pContextNum7[I1, I2, I3, I4, I5, I6, I7]: Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZTuple1[
    I1
  ], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7]] =
    new Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZTuple1[I1], ZTuple1[I2], ZTuple1[I3], ZTuple1[
      I4
    ], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7]] {
      override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZTuple1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead5(n: ZTuple1[I5]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead6(n: ZTuple1[I6]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead7(n: ZTuple1[I7]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
      override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
      override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
      override def takeTail4(n: ZTuple1[I4]): I4           = n.i1
      override def takeTail5(n: ZTuple1[I5]): I5           = n.i1
      override def takeTail6(n: ZTuple1[I6]): I6           = n.i1
      override def takeTail7(n: ZTuple1[I7]): I7           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
      override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
      override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
      override def plus4(m: ZsgTuple0, n: I4): ZTuple1[I4] = new ZTuple1(n)
      override def plus5(m: ZsgTuple0, n: I5): ZTuple1[I5] = new ZTuple1(n)
      override def plus6(m: ZsgTuple0, n: I6): ZTuple1[I6] = new ZTuple1(n)
      override def plus7(m: ZsgTuple0, n: I7): ZTuple1[I7] = new ZTuple1(n)
    }
  val cacheContextNum7: Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, Any, Any, Any, Any, ZTuple1[Any], ZTuple1[
    Any
  ], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] = pContextNum7[Any, Any, Any, Any, Any, Any, Any]
  def contextNum7[I1, I2, I3, I4, I5, I6, I7]: Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZTuple1[
    I1
  ], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7]] =
    cacheContextNum7.asInstanceOf[Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZTuple1[I1], ZTuple1[
      I2
    ], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7]]]
  def pContextNum8[I1, I2, I3, I4, I5, I6, I7, I8]
    : Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZTuple1[I1], ZTuple1[I2], ZTuple1[
      I3
    ], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7], ZTuple1[I8]] =
    new Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZTuple1[I1], ZTuple1[I2], ZTuple1[
      I3
    ], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7], ZTuple1[I8]] {
      override def takeHead1(n: ZTuple1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZTuple1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZTuple1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZTuple1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead5(n: ZTuple1[I5]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead6(n: ZTuple1[I6]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead7(n: ZTuple1[I7]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead8(n: ZTuple1[I8]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZTuple1[I1]): I1           = n.i1
      override def takeTail2(n: ZTuple1[I2]): I2           = n.i1
      override def takeTail3(n: ZTuple1[I3]): I3           = n.i1
      override def takeTail4(n: ZTuple1[I4]): I4           = n.i1
      override def takeTail5(n: ZTuple1[I5]): I5           = n.i1
      override def takeTail6(n: ZTuple1[I6]): I6           = n.i1
      override def takeTail7(n: ZTuple1[I7]): I7           = n.i1
      override def takeTail8(n: ZTuple1[I8]): I8           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZTuple1[I1] = new ZTuple1(n)
      override def plus2(m: ZsgTuple0, n: I2): ZTuple1[I2] = new ZTuple1(n)
      override def plus3(m: ZsgTuple0, n: I3): ZTuple1[I3] = new ZTuple1(n)
      override def plus4(m: ZsgTuple0, n: I4): ZTuple1[I4] = new ZTuple1(n)
      override def plus5(m: ZsgTuple0, n: I5): ZTuple1[I5] = new ZTuple1(n)
      override def plus6(m: ZsgTuple0, n: I6): ZTuple1[I6] = new ZTuple1(n)
      override def plus7(m: ZsgTuple0, n: I7): ZTuple1[I7] = new ZTuple1(n)
      override def plus8(m: ZsgTuple0, n: I8): ZTuple1[I8] = new ZTuple1(n)
    }
  val cacheContextNum8: Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, Any, Any, Any, Any, Any, Any, Any, Any, ZTuple1[
    Any
  ], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any], ZTuple1[Any]] = pContextNum8[Any, Any, Any, Any, Any, Any, Any, Any]
  def contextNum8[I1, I2, I3, I4, I5, I6, I7, I8]
    : Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZTuple1[I1], ZTuple1[I2], ZTuple1[
      I3
    ], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7], ZTuple1[I8]] =
    cacheContextNum8.asInstanceOf[Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZTuple1[
      I1
    ], ZTuple1[I2], ZTuple1[I3], ZTuple1[I4], ZTuple1[I5], ZTuple1[I6], ZTuple1[I7], ZTuple1[I8]]]
  def pNodeContextNum1[I1 <: TupleTag]: Plus1[ZsgTuple0, I1, ZNode1[I1]] = new Plus1[ZsgTuple0, I1, ZNode1[I1]] {
    override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZNode1[I1]): I1           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
  }
  val cacheNodeContextNum1: Plus1[ZsgTuple0, TupleTag, ZNode1[TupleTag]] = pNodeContextNum1[TupleTag]
  def nodeContextNum1[I1 <: TupleTag]: Plus1[ZsgTuple0, I1, ZNode1[I1]]  = cacheNodeContextNum1.asInstanceOf[Plus1[ZsgTuple0, I1, ZNode1[I1]]]
  def pNodeContextNum2[I1 <: TupleTag, I2 <: TupleTag]: Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZNode1[I1], ZNode1[I2]] =
    new Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZNode1[I1], ZNode1[I2]] {
      override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZNode1[I1]): I1           = n.i1
      override def takeTail2(n: ZNode1[I2]): I2           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
      override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
    }
  val cacheNodeContextNum2: Plus2[ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, ZNode1[TupleTag], ZNode1[TupleTag]] = pNodeContextNum2[TupleTag, TupleTag]
  def nodeContextNum2[I1 <: TupleTag, I2 <: TupleTag]: Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZNode1[I1], ZNode1[I2]] =
    cacheNodeContextNum2.asInstanceOf[Plus2[ZsgTuple0, ZsgTuple0, I1, I2, ZNode1[I1], ZNode1[I2]]]
  def pNodeContextNum3[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag]: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZNode1[I1], ZNode1[I2], ZNode1[I3]] =
    new Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZNode1[I1], ZNode1[I2], ZNode1[I3]] {
      override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZNode1[I1]): I1           = n.i1
      override def takeTail2(n: ZNode1[I2]): I2           = n.i1
      override def takeTail3(n: ZNode1[I3]): I3           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
      override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
      override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
    }
  val cacheNodeContextNum3: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, TupleTag, ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag]] =
    pNodeContextNum3[TupleTag, TupleTag, TupleTag]
  def nodeContextNum3[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag]: Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZNode1[I1], ZNode1[I2], ZNode1[I3]] =
    cacheNodeContextNum3.asInstanceOf[Plus3[ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, ZNode1[I1], ZNode1[I2], ZNode1[I3]]]
  def pNodeContextNum4[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag]
    : Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4]] =
    new Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4]] {
      override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZNode1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZNode1[I1]): I1           = n.i1
      override def takeTail2(n: ZNode1[I2]): I2           = n.i1
      override def takeTail3(n: ZNode1[I3]): I3           = n.i1
      override def takeTail4(n: ZNode1[I4]): I4           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
      override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
      override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
      override def plus4(m: ZsgTuple0, n: I4): ZNode1[I4] = new ZNode1(i1 = n)
    }
  val cacheNodeContextNum4
    : Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, TupleTag, TupleTag, ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag]] =
    pNodeContextNum4[TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum4[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag]
    : Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4]] =
    cacheNodeContextNum4.asInstanceOf[Plus4[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4]]]
  def pNodeContextNum5[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag]
    : Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5]] =
    new Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5]] {
      override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZNode1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead5(n: ZNode1[I5]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZNode1[I1]): I1           = n.i1
      override def takeTail2(n: ZNode1[I2]): I2           = n.i1
      override def takeTail3(n: ZNode1[I3]): I3           = n.i1
      override def takeTail4(n: ZNode1[I4]): I4           = n.i1
      override def takeTail5(n: ZNode1[I5]): I5           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
      override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
      override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
      override def plus4(m: ZsgTuple0, n: I4): ZNode1[I4] = new ZNode1(i1 = n)
      override def plus5(m: ZsgTuple0, n: I5): ZNode1[I5] = new ZNode1(i1 = n)
    }
  val cacheNodeContextNum5: Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, ZNode1[TupleTag], ZNode1[
    TupleTag
  ], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag]] = pNodeContextNum5[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum5[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag]
    : Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5]] = cacheNodeContextNum5
    .asInstanceOf[Plus5[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5]]]
  def pNodeContextNum6[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag]
    : Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5], ZNode1[
      I6
    ]] = new Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[
    I5
  ], ZNode1[I6]] {
    override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead4(n: ZNode1[I4]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead5(n: ZNode1[I5]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead6(n: ZNode1[I6]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZNode1[I1]): I1           = n.i1
    override def takeTail2(n: ZNode1[I2]): I2           = n.i1
    override def takeTail3(n: ZNode1[I3]): I3           = n.i1
    override def takeTail4(n: ZNode1[I4]): I4           = n.i1
    override def takeTail5(n: ZNode1[I5]): I5           = n.i1
    override def takeTail6(n: ZNode1[I6]): I6           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
    override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
    override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
    override def plus4(m: ZsgTuple0, n: I4): ZNode1[I4] = new ZNode1(i1 = n)
    override def plus5(m: ZsgTuple0, n: I5): ZNode1[I5] = new ZNode1(i1 = n)
    override def plus6(m: ZsgTuple0, n: I6): ZNode1[I6] = new ZNode1(i1 = n)
  }
  val cacheNodeContextNum6: Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, ZNode1[
    TupleTag
  ], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag]] =
    pNodeContextNum6[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum6[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag]
    : Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5], ZNode1[
      I6
    ]] = cacheNodeContextNum6.asInstanceOf[Plus6[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, ZNode1[I1], ZNode1[I2], ZNode1[
    I3
  ], ZNode1[I4], ZNode1[I5], ZNode1[I6]]]
  def pNodeContextNum7[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag, I7 <: TupleTag]
    : Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[
      I4
    ], ZNode1[I5], ZNode1[I6], ZNode1[I7]] = new Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZNode1[
    I1
  ], ZNode1[I2], ZNode1[I3], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7]] {
    override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead4(n: ZNode1[I4]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead5(n: ZNode1[I5]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead6(n: ZNode1[I6]): ZsgTuple0    = ZsgTuple0.value
    override def takeHead7(n: ZNode1[I7]): ZsgTuple0    = ZsgTuple0.value
    override def takeTail1(n: ZNode1[I1]): I1           = n.i1
    override def takeTail2(n: ZNode1[I2]): I2           = n.i1
    override def takeTail3(n: ZNode1[I3]): I3           = n.i1
    override def takeTail4(n: ZNode1[I4]): I4           = n.i1
    override def takeTail5(n: ZNode1[I5]): I5           = n.i1
    override def takeTail6(n: ZNode1[I6]): I6           = n.i1
    override def takeTail7(n: ZNode1[I7]): I7           = n.i1
    override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
    override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
    override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
    override def plus4(m: ZsgTuple0, n: I4): ZNode1[I4] = new ZNode1(i1 = n)
    override def plus5(m: ZsgTuple0, n: I5): ZNode1[I5] = new ZNode1(i1 = n)
    override def plus6(m: ZsgTuple0, n: I6): ZNode1[I6] = new ZNode1(i1 = n)
    override def plus7(m: ZsgTuple0, n: I7): ZNode1[I7] = new ZNode1(i1 = n)
  }
  val cacheNodeContextNum7
    : Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, ZNode1[
      TupleTag
    ], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag], ZNode1[TupleTag]] =
    pNodeContextNum7[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum7[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag, I7 <: TupleTag]
    : Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZNode1[I1], ZNode1[I2], ZNode1[I3], ZNode1[
      I4
    ], ZNode1[I5], ZNode1[I6], ZNode1[I7]] =
    cacheNodeContextNum7.asInstanceOf[Plus7[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, ZNode1[I1], ZNode1[
      I2
    ], ZNode1[I3], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7]]]
  def pNodeContextNum8[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag, I7 <: TupleTag, I8 <: TupleTag]
    : Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZNode1[I1], ZNode1[I2], ZNode1[
      I3
    ], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7], ZNode1[I8]] =
    new Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZNode1[I1], ZNode1[I2], ZNode1[
      I3
    ], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7], ZNode1[I8]] {
      override def takeHead1(n: ZNode1[I1]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead2(n: ZNode1[I2]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead3(n: ZNode1[I3]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead4(n: ZNode1[I4]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead5(n: ZNode1[I5]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead6(n: ZNode1[I6]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead7(n: ZNode1[I7]): ZsgTuple0    = ZsgTuple0.value
      override def takeHead8(n: ZNode1[I8]): ZsgTuple0    = ZsgTuple0.value
      override def takeTail1(n: ZNode1[I1]): I1           = n.i1
      override def takeTail2(n: ZNode1[I2]): I2           = n.i1
      override def takeTail3(n: ZNode1[I3]): I3           = n.i1
      override def takeTail4(n: ZNode1[I4]): I4           = n.i1
      override def takeTail5(n: ZNode1[I5]): I5           = n.i1
      override def takeTail6(n: ZNode1[I6]): I6           = n.i1
      override def takeTail7(n: ZNode1[I7]): I7           = n.i1
      override def takeTail8(n: ZNode1[I8]): I8           = n.i1
      override def plus1(m: ZsgTuple0, n: I1): ZNode1[I1] = new ZNode1(i1 = n)
      override def plus2(m: ZsgTuple0, n: I2): ZNode1[I2] = new ZNode1(i1 = n)
      override def plus3(m: ZsgTuple0, n: I3): ZNode1[I3] = new ZNode1(i1 = n)
      override def plus4(m: ZsgTuple0, n: I4): ZNode1[I4] = new ZNode1(i1 = n)
      override def plus5(m: ZsgTuple0, n: I5): ZNode1[I5] = new ZNode1(i1 = n)
      override def plus6(m: ZsgTuple0, n: I6): ZNode1[I6] = new ZNode1(i1 = n)
      override def plus7(m: ZsgTuple0, n: I7): ZNode1[I7] = new ZNode1(i1 = n)
      override def plus8(m: ZsgTuple0, n: I8): ZNode1[I8] = new ZNode1(i1 = n)
    }
  val cacheNodeContextNum8: Plus8[
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    TupleTag,
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag],
    ZNode1[TupleTag]
  ] = pNodeContextNum8[TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag, TupleTag]
  def nodeContextNum8[I1 <: TupleTag, I2 <: TupleTag, I3 <: TupleTag, I4 <: TupleTag, I5 <: TupleTag, I6 <: TupleTag, I7 <: TupleTag, I8 <: TupleTag]
    : Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZNode1[I1], ZNode1[I2], ZNode1[
      I3
    ], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7], ZNode1[I8]] = cacheNodeContextNum8
    .asInstanceOf[Plus8[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0, I1, I2, I3, I4, I5, I6, I7, I8, ZNode1[I1], ZNode1[
      I2
    ], ZNode1[I3], ZNode1[I4], ZNode1[I5], ZNode1[I6], ZNode1[I7], ZNode1[I8]]]
}
