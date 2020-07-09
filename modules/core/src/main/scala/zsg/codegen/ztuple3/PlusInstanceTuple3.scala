package zsg
object PlusInstanceTuple3 {
        type HighTupleAlias3[  I1   ,  I2 ] = ZsgTuple2[I1, I2]
        type HighTupleAliasUpper3[  I1   ,  I2   ,  I3 ] = ZsgTuple2[ZsgTuple2[I1, I2], I3]
            def contextNum1[
                      Tuple1_Context1   ,  Tuple2_Context1 
                    , I1
            ]:  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]  = new  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            def contextNum2[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                    , I1
                    , I2
            ]:  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]  = new  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            def contextNum3[
                      Tuple1_Context1   ,  Tuple2_Context1 
                     , 
                      Tuple1_Context2   ,  Tuple2_Context2 
                     , 
                      Tuple1_Context3   ,  Tuple2_Context3 
                    , I1
                    , I2
                    , I3
            ]:  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]  = new  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]  = new  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]  = new  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]  = new  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]  = new  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def takeTail7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus7(m: HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZTuple3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]  = new  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZTuple3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZTuple3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZTuple3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZTuple3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZTuple3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZTuple3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZTuple3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]   {
                    override def takeHead1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead8(n: ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def takeTail7(n: ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                    override def takeTail8(n: ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): I8 = n.i3
                    override def plus1(m: HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZTuple3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZTuple3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZTuple3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZTuple3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZTuple3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZTuple3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus7(m: HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZTuple3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus8(m: HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ], n: I8): ZTuple3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8] = new ZTuple3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
        type NodeHighTupleAlias3[  I1 <: TupleTag   ,  I2 <: TupleTag ] = ZsgTuple2[I1, I2]
        type NodeHighTupleAliasUpper3[  I1 <: TupleTag   ,  I2 <: TupleTag   ,  I3 <: TupleTag ] = ZsgTuple2[ZsgTuple2[I1, I2], I3]
            def nodeContextNum1[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                    , I1 <: TupleTag
            ]:  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]  = new  Plus1[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   , I1    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            def nodeContextNum2[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
            ]:  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]  = new  Plus2[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   , I1  , I2    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
            def nodeContextNum3[
                      Tuple1_Context1 <: TupleTag   ,  Tuple2_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag   ,  Tuple2_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag   ,  Tuple2_Context3 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
            ]:  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]  = new  Plus3[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   , I1  , I2  , I3    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]  = new  Plus4[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   , I1  , I2  , I3  , I4    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]  = new  Plus5[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]  = new  Plus6[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]  = new  Plus7[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def takeTail7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus7(m: NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
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
            ]:  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZNode3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]  = new  Plus8[  HighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1  ]   ,  HighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2  ]   ,  HighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3  ]   ,  HighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4  ]   ,  HighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5  ]   ,  HighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6  ]   ,  HighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7  ]   ,  HighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1 , I1]  , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2 , I2]  , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3 , I3]  , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4 , I4]  , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5 , I5]  , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6 , I6]  , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7 , I7]  , ZNode3[  Tuple1_Context8   ,  Tuple2_Context8 , I8] ]   {
                    override def takeHead1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeHead8(n: ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): NodeHighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ] = new ZsgTuple2(i1 = n.i1, i2 = n.i2)
                    override def takeTail1(n: ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1]): I1 = n.i3
                    override def takeTail2(n: ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2]): I2 = n.i3
                    override def takeTail3(n: ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3]): I3 = n.i3
                    override def takeTail4(n: ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4]): I4 = n.i3
                    override def takeTail5(n: ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5]): I5 = n.i3
                    override def takeTail6(n: ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6]): I6 = n.i3
                    override def takeTail7(n: ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7]): I7 = n.i3
                    override def takeTail8(n: ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8]): I8 = n.i3
                    override def plus1(m: NodeHighTupleAlias3[  Tuple1_Context1   ,  Tuple2_Context1 ], n: I1): ZNode3[ Tuple1_Context1 ,  Tuple2_Context1 ,  I1] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus2(m: NodeHighTupleAlias3[  Tuple1_Context2   ,  Tuple2_Context2 ], n: I2): ZNode3[ Tuple1_Context2 ,  Tuple2_Context2 ,  I2] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus3(m: NodeHighTupleAlias3[  Tuple1_Context3   ,  Tuple2_Context3 ], n: I3): ZNode3[ Tuple1_Context3 ,  Tuple2_Context3 ,  I3] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus4(m: NodeHighTupleAlias3[  Tuple1_Context4   ,  Tuple2_Context4 ], n: I4): ZNode3[ Tuple1_Context4 ,  Tuple2_Context4 ,  I4] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus5(m: NodeHighTupleAlias3[  Tuple1_Context5   ,  Tuple2_Context5 ], n: I5): ZNode3[ Tuple1_Context5 ,  Tuple2_Context5 ,  I5] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus6(m: NodeHighTupleAlias3[  Tuple1_Context6   ,  Tuple2_Context6 ], n: I6): ZNode3[ Tuple1_Context6 ,  Tuple2_Context6 ,  I6] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus7(m: NodeHighTupleAlias3[  Tuple1_Context7   ,  Tuple2_Context7 ], n: I7): ZNode3[ Tuple1_Context7 ,  Tuple2_Context7 ,  I7] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
                    override def plus8(m: NodeHighTupleAlias3[  Tuple1_Context8   ,  Tuple2_Context8 ], n: I8): ZNode3[ Tuple1_Context8 ,  Tuple2_Context8 ,  I8] = new ZNode3(i1 = m.i1 , i2 = m.i2, i3 = n)
            }
}
