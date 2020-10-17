package zsg
object PlusInstanceTuple3 {
        type HighTupleAlias3[  I1   ,  I2 ] = zsg.ZsgTuple2[I1, I2]
        type HighTupleAliasUpper3[  I1   ,  I2   ,  I3 ] = zsg.ZsgTuple2[zsg.ZsgTuple2[I1, I2], I3]
            class PContextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ] extends  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum1: PContextNum1[  Any   ,  Any   ,  Any ] = new PContextNum1[  Any   ,  Any   ,  Any ]
            def contextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ]: PContextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ] = cacheContextNum1.asInstanceOf[PContextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ]]
            class PContextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ] extends  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum2: PContextNum2[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum2[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ]: PContextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ] = cacheContextNum2.asInstanceOf[PContextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ]]
            class PContextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ] extends  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum3: PContextNum3[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum3[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ]: PContextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ] = cacheContextNum3.asInstanceOf[PContextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ]]
            class PContextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ] extends  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum4: PContextNum4[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum4[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                 , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ]: PContextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ] = cacheContextNum4.asInstanceOf[PContextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ]]
            class PContextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ] extends  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum5: PContextNum5[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum5[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                 , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                 , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ]: PContextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ] = cacheContextNum5.asInstanceOf[PContextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ]]
            class PContextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ] extends  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum6: PContextNum6[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum6[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                 , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                 , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                 , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ]: PContextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ] = cacheContextNum6.asInstanceOf[PContextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ]]
            class PContextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ] extends  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def takeTail7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus7(m: HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum7: PContextNum7[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum7[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                 , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                 , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                 , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                 , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ]: PContextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ] = cacheContextNum7.asInstanceOf[PContextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ]]
            class PContextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                     , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ] extends  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZTuple3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]   {
                     inline  override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead8(n: ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def takeTail7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                     inline  override def takeTail8(n: ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): I8 = n.i3
                     inline  override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus7(m: HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus8(m: HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ], n: I8): ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheContextNum8: PContextNum8[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ] = new PContextNum8[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any ]
            def contextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                 , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                 , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                 , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                 , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                 , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                 , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                 , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ]: PContextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                     , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ] = cacheContextNum8.asInstanceOf[PContextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                     , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ]]
        type NodeHighTupleAlias3[  I1 <: TupleTag   ,  I2 <: TupleTag ] = zsg.ZsgTuple2[I1, I2]
        type NodeHighTupleAliasUpper3[  I1 <: TupleTag   ,  I2 <: TupleTag   ,  I3 <: TupleTag ] = zsg.ZsgTuple2[zsg.ZsgTuple2[I1, I2], I3]
            class PNodeContextNum1[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                    , I1 <: TupleTag
            ] extends  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum1: PNodeContextNum1[  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum1[  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum1[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                    , I1 <: TupleTag
            ]: PNodeContextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ] = cacheNodeContextNum1.asInstanceOf[PNodeContextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ]]
            class PNodeContextNum2[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
            ] extends  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum2: PNodeContextNum2[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum2[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum2[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
            ]: PNodeContextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ] = cacheNodeContextNum2.asInstanceOf[PNodeContextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ]]
            class PNodeContextNum3[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
            ] extends  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum3: PNodeContextNum3[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum3[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum3[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
            ]: PNodeContextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ] = cacheNodeContextNum3.asInstanceOf[PNodeContextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ]]
            class PNodeContextNum4[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
            ] extends  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum4: PNodeContextNum4[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum4[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum4[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                 , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
            ]: PNodeContextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ] = cacheNodeContextNum4.asInstanceOf[PNodeContextNum4[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ]]
            class PNodeContextNum5[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
            ] extends  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum5: PNodeContextNum5[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum5[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum5[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                 , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                 , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
            ]: PNodeContextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ] = cacheNodeContextNum5.asInstanceOf[PNodeContextNum5[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ]]
            class PNodeContextNum6[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
            ] extends  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum6: PNodeContextNum6[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum6[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum6[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                 , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                 , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                 , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
            ]: PNodeContextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ] = cacheNodeContextNum6.asInstanceOf[PNodeContextNum6[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ]]
            class PNodeContextNum7[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                     , 
                      Tuple1_Context7 <: TupleTag   ,  Tuple2_Context7 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
            ] extends  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def takeTail7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus7(m: NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum7: PNodeContextNum7[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum7[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum7[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                 , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                 , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                 , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                 , 
                      Tuple1_Context7 <: TupleTag   ,  Tuple2_Context7 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
            ]: PNodeContextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ] = cacheNodeContextNum7.asInstanceOf[PNodeContextNum7[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ]]
            class PNodeContextNum8[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                     , 
                      Tuple1_Context7 <: TupleTag   ,  Tuple2_Context7 <: TupleTag 
                     , 
                      Tuple1_Context8 <: TupleTag   ,  Tuple2_Context8 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
                    , I8 <: TupleTag
            ] extends  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZNode3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]   {
                     inline  override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeHead8(n: ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): NodeHighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                     inline  override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                     inline  override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                     inline  override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                     inline  override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                     inline  override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                     inline  override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                     inline  override def takeTail7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                     inline  override def takeTail8(n: ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): I8 = n.i3
                     inline  override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus7(m: NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                     inline  override def plus8(m: NodeHighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ], n: I8): ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            val cacheNodeContextNum8: PNodeContextNum8[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ] = new PNodeContextNum8[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag ]
            def nodeContextNum8[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                 , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                 , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                 , 
                      Tuple1_Context4 <: TupleTag   ,  Tuple2_Context4 <: TupleTag 
                 , 
                      Tuple1_Context5 <: TupleTag   ,  Tuple2_Context5 <: TupleTag 
                 , 
                      Tuple1_Context6 <: TupleTag   ,  Tuple2_Context6 <: TupleTag 
                 , 
                      Tuple1_Context7 <: TupleTag   ,  Tuple2_Context7 <: TupleTag 
                 , 
                      Tuple1_Context8 <: TupleTag   ,  Tuple2_Context8 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
                    , I8 <: TupleTag
            ]: PNodeContextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                     , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ] = cacheNodeContextNum8.asInstanceOf[PNodeContextNum8[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                     , 
                      Tuple1_Context4   ,  Tuple2_Context4 
                     , 
                      Tuple1_Context5   ,  Tuple2_Context5 
                     , 
                      Tuple1_Context6   ,  Tuple2_Context6 
                     , 
                      Tuple1_Context7   ,  Tuple2_Context7 
                     , 
                      Tuple1_Context8   ,  Tuple2_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ]]
}
