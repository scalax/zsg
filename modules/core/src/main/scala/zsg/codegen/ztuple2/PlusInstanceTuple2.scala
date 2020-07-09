package zsg
object PlusInstanceTuple2 {
        type HighTupleAlias2[  I1 ] = I1
        type HighTupleAliasUpper2[  I1   ,  I2 ] = ZsgTuple2[I1, I2]
            def contextNum1[
                      Tuple1_Context1 
                    , I1
            ]:  Plus1[  HighTupleAlias2[  Tuple1_Context1  ]   , I1    , ZTuple2[  Tuple1_Context1 , I1] ]  = new  Plus1[  HighTupleAlias2[  Tuple1_Context1  ]   , I1    , ZTuple2[  Tuple1_Context1 , I1] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum2[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                    , I1
                    , I2
            ]:  Plus2[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   , I1  , I2    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2] ]  = new  Plus2[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   , I1  , I2    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum3[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                    , I1
                    , I2
                    , I3
            ]:  Plus3[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   , I1  , I2  , I3    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3] ]  = new  Plus3[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   , I1  , I2  , I3    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum4[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                     , 
                      Tuple1_Context4 
                    , I1
                    , I2
                    , I3
                    , I4
            ]:  Plus4[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   , I1  , I2  , I3  , I4    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4] ]  = new  Plus4[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   , I1  , I2  , I3  , I4    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZTuple2[ Tuple1_Context4 ,  I4]): HighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
                    override def plus4(m: HighTupleAlias2[  Tuple1_Context4 ], n: I4): ZTuple2[ Tuple1_Context4 ,  I4] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum5[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                     , 
                      Tuple1_Context4 
                     , 
                      Tuple1_Context5 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
            ]:  Plus5[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5] ]  = new  Plus5[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZTuple2[ Tuple1_Context4 ,  I4]): HighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZTuple2[ Tuple1_Context5 ,  I5]): HighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
                    override def plus4(m: HighTupleAlias2[  Tuple1_Context4 ], n: I4): ZTuple2[ Tuple1_Context4 ,  I4] = new ZTuple2(i1 = m, i2 = n)
                    override def plus5(m: HighTupleAlias2[  Tuple1_Context5 ], n: I5): ZTuple2[ Tuple1_Context5 ,  I5] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum6[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                     , 
                      Tuple1_Context4 
                     , 
                      Tuple1_Context5 
                     , 
                      Tuple1_Context6 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
            ]:  Plus6[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6] ]  = new  Plus6[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZTuple2[ Tuple1_Context4 ,  I4]): HighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZTuple2[ Tuple1_Context5 ,  I5]): HighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZTuple2[ Tuple1_Context6 ,  I6]): HighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
                    override def plus4(m: HighTupleAlias2[  Tuple1_Context4 ], n: I4): ZTuple2[ Tuple1_Context4 ,  I4] = new ZTuple2(i1 = m, i2 = n)
                    override def plus5(m: HighTupleAlias2[  Tuple1_Context5 ], n: I5): ZTuple2[ Tuple1_Context5 ,  I5] = new ZTuple2(i1 = m, i2 = n)
                    override def plus6(m: HighTupleAlias2[  Tuple1_Context6 ], n: I6): ZTuple2[ Tuple1_Context6 ,  I6] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum7[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                     , 
                      Tuple1_Context4 
                     , 
                      Tuple1_Context5 
                     , 
                      Tuple1_Context6 
                     , 
                      Tuple1_Context7 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
            ]:  Plus7[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6]  , ZTuple2[  Tuple1_Context7 , I7] ]  = new  Plus7[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6]  , ZTuple2[  Tuple1_Context7 , I7] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZTuple2[ Tuple1_Context4 ,  I4]): HighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZTuple2[ Tuple1_Context5 ,  I5]): HighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZTuple2[ Tuple1_Context6 ,  I6]): HighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeHead7(n: ZTuple2[ Tuple1_Context7 ,  I7]): HighTupleAlias2[  Tuple1_Context7 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def takeTail7(n: ZTuple2[ Tuple1_Context7 ,  I7]): I7 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
                    override def plus4(m: HighTupleAlias2[  Tuple1_Context4 ], n: I4): ZTuple2[ Tuple1_Context4 ,  I4] = new ZTuple2(i1 = m, i2 = n)
                    override def plus5(m: HighTupleAlias2[  Tuple1_Context5 ], n: I5): ZTuple2[ Tuple1_Context5 ,  I5] = new ZTuple2(i1 = m, i2 = n)
                    override def plus6(m: HighTupleAlias2[  Tuple1_Context6 ], n: I6): ZTuple2[ Tuple1_Context6 ,  I6] = new ZTuple2(i1 = m, i2 = n)
                    override def plus7(m: HighTupleAlias2[  Tuple1_Context7 ], n: I7): ZTuple2[ Tuple1_Context7 ,  I7] = new ZTuple2(i1 = m, i2 = n)
            }
            def contextNum8[
                      Tuple1_Context1 
                     , 
                      Tuple1_Context2 
                     , 
                      Tuple1_Context3 
                     , 
                      Tuple1_Context4 
                     , 
                      Tuple1_Context5 
                     , 
                      Tuple1_Context6 
                     , 
                      Tuple1_Context7 
                     , 
                      Tuple1_Context8 
                    , I1
                    , I2
                    , I3
                    , I4
                    , I5
                    , I6
                    , I7
                    , I8
            ]:  Plus8[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   ,  HighTupleAlias2[  Tuple1_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6]  , ZTuple2[  Tuple1_Context7 , I7]  , ZTuple2[  Tuple1_Context8 , I8] ]  = new  Plus8[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   ,  HighTupleAlias2[  Tuple1_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[  Tuple1_Context1 , I1]  , ZTuple2[  Tuple1_Context2 , I2]  , ZTuple2[  Tuple1_Context3 , I3]  , ZTuple2[  Tuple1_Context4 , I4]  , ZTuple2[  Tuple1_Context5 , I5]  , ZTuple2[  Tuple1_Context6 , I6]  , ZTuple2[  Tuple1_Context7 , I7]  , ZTuple2[  Tuple1_Context8 , I8] ]   {
                    override def takeHead1(n: ZTuple2[ Tuple1_Context1 ,  I1]): HighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZTuple2[ Tuple1_Context2 ,  I2]): HighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZTuple2[ Tuple1_Context3 ,  I3]): HighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZTuple2[ Tuple1_Context4 ,  I4]): HighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZTuple2[ Tuple1_Context5 ,  I5]): HighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZTuple2[ Tuple1_Context6 ,  I6]): HighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeHead7(n: ZTuple2[ Tuple1_Context7 ,  I7]): HighTupleAlias2[  Tuple1_Context7 ] = n.i1
                    override def takeHead8(n: ZTuple2[ Tuple1_Context8 ,  I8]): HighTupleAlias2[  Tuple1_Context8 ] = n.i1
                    override def takeTail1(n: ZTuple2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def takeTail7(n: ZTuple2[ Tuple1_Context7 ,  I7]): I7 = n.i2
                    override def takeTail8(n: ZTuple2[ Tuple1_Context8 ,  I8]): I8 = n.i2
                    override def plus1(m: HighTupleAlias2[  Tuple1_Context1 ], n: I1): ZTuple2[ Tuple1_Context1 ,  I1] = new ZTuple2(i1 = m, i2 = n)
                    override def plus2(m: HighTupleAlias2[  Tuple1_Context2 ], n: I2): ZTuple2[ Tuple1_Context2 ,  I2] = new ZTuple2(i1 = m, i2 = n)
                    override def plus3(m: HighTupleAlias2[  Tuple1_Context3 ], n: I3): ZTuple2[ Tuple1_Context3 ,  I3] = new ZTuple2(i1 = m, i2 = n)
                    override def plus4(m: HighTupleAlias2[  Tuple1_Context4 ], n: I4): ZTuple2[ Tuple1_Context4 ,  I4] = new ZTuple2(i1 = m, i2 = n)
                    override def plus5(m: HighTupleAlias2[  Tuple1_Context5 ], n: I5): ZTuple2[ Tuple1_Context5 ,  I5] = new ZTuple2(i1 = m, i2 = n)
                    override def plus6(m: HighTupleAlias2[  Tuple1_Context6 ], n: I6): ZTuple2[ Tuple1_Context6 ,  I6] = new ZTuple2(i1 = m, i2 = n)
                    override def plus7(m: HighTupleAlias2[  Tuple1_Context7 ], n: I7): ZTuple2[ Tuple1_Context7 ,  I7] = new ZTuple2(i1 = m, i2 = n)
                    override def plus8(m: HighTupleAlias2[  Tuple1_Context8 ], n: I8): ZTuple2[ Tuple1_Context8 ,  I8] = new ZTuple2(i1 = m, i2 = n)
            }
        type NodeHighTupleAlias2[  I1 <: TupleTag ] = I1
        type NodeHighTupleAliasUpper2[  I1 <: TupleTag   ,  I2 <: TupleTag ] = ZsgTuple2[I1, I2]
            def nodeContextNum1[
                      Tuple1_Context1 <: TupleTag 
                    , I1 <: TupleTag
            ]:  Plus1[  HighTupleAlias2[  Tuple1_Context1  ]   , I1    , ZNode2[  Tuple1_Context1 , I1] ]  = new  Plus1[  HighTupleAlias2[  Tuple1_Context1  ]   , I1    , ZNode2[  Tuple1_Context1 , I1] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum2[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
            ]:  Plus2[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   , I1  , I2    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2] ]  = new  Plus2[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   , I1  , I2    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum3[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
            ]:  Plus3[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   , I1  , I2  , I3    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3] ]  = new  Plus3[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   , I1  , I2  , I3    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum4[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
            ]:  Plus4[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   , I1  , I2  , I3  , I4    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4] ]  = new  Plus4[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   , I1  , I2  , I3  , I4    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZNode2[ Tuple1_Context4 ,  I4]): NodeHighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: NodeHighTupleAlias2[  Tuple1_Context4 ], n: I4): ZNode2[ Tuple1_Context4 ,  I4] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum5[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
            ]:  Plus5[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5] ]  = new  Plus5[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   , I1  , I2  , I3  , I4  , I5    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZNode2[ Tuple1_Context4 ,  I4]): NodeHighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZNode2[ Tuple1_Context5 ,  I5]): NodeHighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: NodeHighTupleAlias2[  Tuple1_Context4 ], n: I4): ZNode2[ Tuple1_Context4 ,  I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: NodeHighTupleAlias2[  Tuple1_Context5 ], n: I5): ZNode2[ Tuple1_Context5 ,  I5] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum6[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
            ]:  Plus6[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6] ]  = new  Plus6[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZNode2[ Tuple1_Context4 ,  I4]): NodeHighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZNode2[ Tuple1_Context5 ,  I5]): NodeHighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZNode2[ Tuple1_Context6 ,  I6]): NodeHighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: NodeHighTupleAlias2[  Tuple1_Context4 ], n: I4): ZNode2[ Tuple1_Context4 ,  I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: NodeHighTupleAlias2[  Tuple1_Context5 ], n: I5): ZNode2[ Tuple1_Context5 ,  I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: NodeHighTupleAlias2[  Tuple1_Context6 ], n: I6): ZNode2[ Tuple1_Context6 ,  I6] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum7[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag 
                     , 
                      Tuple1_Context7 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
            ]:  Plus7[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6]  , ZNode2[  Tuple1_Context7 , I7] ]  = new  Plus7[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6]  , ZNode2[  Tuple1_Context7 , I7] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZNode2[ Tuple1_Context4 ,  I4]): NodeHighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZNode2[ Tuple1_Context5 ,  I5]): NodeHighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZNode2[ Tuple1_Context6 ,  I6]): NodeHighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeHead7(n: ZNode2[ Tuple1_Context7 ,  I7]): NodeHighTupleAlias2[  Tuple1_Context7 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def takeTail7(n: ZNode2[ Tuple1_Context7 ,  I7]): I7 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: NodeHighTupleAlias2[  Tuple1_Context4 ], n: I4): ZNode2[ Tuple1_Context4 ,  I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: NodeHighTupleAlias2[  Tuple1_Context5 ], n: I5): ZNode2[ Tuple1_Context5 ,  I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: NodeHighTupleAlias2[  Tuple1_Context6 ], n: I6): ZNode2[ Tuple1_Context6 ,  I6] = new ZNode2(i1 = m, i2 = n)
                    override def plus7(m: NodeHighTupleAlias2[  Tuple1_Context7 ], n: I7): ZNode2[ Tuple1_Context7 ,  I7] = new ZNode2(i1 = m, i2 = n)
            }
            def nodeContextNum8[
                      Tuple1_Context1 <: TupleTag 
                     , 
                      Tuple1_Context2 <: TupleTag 
                     , 
                      Tuple1_Context3 <: TupleTag 
                     , 
                      Tuple1_Context4 <: TupleTag 
                     , 
                      Tuple1_Context5 <: TupleTag 
                     , 
                      Tuple1_Context6 <: TupleTag 
                     , 
                      Tuple1_Context7 <: TupleTag 
                     , 
                      Tuple1_Context8 <: TupleTag 
                    , I1 <: TupleTag
                    , I2 <: TupleTag
                    , I3 <: TupleTag
                    , I4 <: TupleTag
                    , I5 <: TupleTag
                    , I6 <: TupleTag
                    , I7 <: TupleTag
                    , I8 <: TupleTag
            ]:  Plus8[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   ,  HighTupleAlias2[  Tuple1_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6]  , ZNode2[  Tuple1_Context7 , I7]  , ZNode2[  Tuple1_Context8 , I8] ]  = new  Plus8[  HighTupleAlias2[  Tuple1_Context1  ]   ,  HighTupleAlias2[  Tuple1_Context2  ]   ,  HighTupleAlias2[  Tuple1_Context3  ]   ,  HighTupleAlias2[  Tuple1_Context4  ]   ,  HighTupleAlias2[  Tuple1_Context5  ]   ,  HighTupleAlias2[  Tuple1_Context6  ]   ,  HighTupleAlias2[  Tuple1_Context7  ]   ,  HighTupleAlias2[  Tuple1_Context8  ]   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[  Tuple1_Context1 , I1]  , ZNode2[  Tuple1_Context2 , I2]  , ZNode2[  Tuple1_Context3 , I3]  , ZNode2[  Tuple1_Context4 , I4]  , ZNode2[  Tuple1_Context5 , I5]  , ZNode2[  Tuple1_Context6 , I6]  , ZNode2[  Tuple1_Context7 , I7]  , ZNode2[  Tuple1_Context8 , I8] ]   {
                    override def takeHead1(n: ZNode2[ Tuple1_Context1 ,  I1]): NodeHighTupleAlias2[  Tuple1_Context1 ] = n.i1
                    override def takeHead2(n: ZNode2[ Tuple1_Context2 ,  I2]): NodeHighTupleAlias2[  Tuple1_Context2 ] = n.i1
                    override def takeHead3(n: ZNode2[ Tuple1_Context3 ,  I3]): NodeHighTupleAlias2[  Tuple1_Context3 ] = n.i1
                    override def takeHead4(n: ZNode2[ Tuple1_Context4 ,  I4]): NodeHighTupleAlias2[  Tuple1_Context4 ] = n.i1
                    override def takeHead5(n: ZNode2[ Tuple1_Context5 ,  I5]): NodeHighTupleAlias2[  Tuple1_Context5 ] = n.i1
                    override def takeHead6(n: ZNode2[ Tuple1_Context6 ,  I6]): NodeHighTupleAlias2[  Tuple1_Context6 ] = n.i1
                    override def takeHead7(n: ZNode2[ Tuple1_Context7 ,  I7]): NodeHighTupleAlias2[  Tuple1_Context7 ] = n.i1
                    override def takeHead8(n: ZNode2[ Tuple1_Context8 ,  I8]): NodeHighTupleAlias2[  Tuple1_Context8 ] = n.i1
                    override def takeTail1(n: ZNode2[ Tuple1_Context1 ,  I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[ Tuple1_Context2 ,  I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[ Tuple1_Context3 ,  I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[ Tuple1_Context4 ,  I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[ Tuple1_Context5 ,  I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[ Tuple1_Context6 ,  I6]): I6 = n.i2
                    override def takeTail7(n: ZNode2[ Tuple1_Context7 ,  I7]): I7 = n.i2
                    override def takeTail8(n: ZNode2[ Tuple1_Context8 ,  I8]): I8 = n.i2
                    override def plus1(m: NodeHighTupleAlias2[  Tuple1_Context1 ], n: I1): ZNode2[ Tuple1_Context1 ,  I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: NodeHighTupleAlias2[  Tuple1_Context2 ], n: I2): ZNode2[ Tuple1_Context2 ,  I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: NodeHighTupleAlias2[  Tuple1_Context3 ], n: I3): ZNode2[ Tuple1_Context3 ,  I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: NodeHighTupleAlias2[  Tuple1_Context4 ], n: I4): ZNode2[ Tuple1_Context4 ,  I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: NodeHighTupleAlias2[  Tuple1_Context5 ], n: I5): ZNode2[ Tuple1_Context5 ,  I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: NodeHighTupleAlias2[  Tuple1_Context6 ], n: I6): ZNode2[ Tuple1_Context6 ,  I6] = new ZNode2(i1 = m, i2 = n)
                    override def plus7(m: NodeHighTupleAlias2[  Tuple1_Context7 ], n: I7): ZNode2[ Tuple1_Context7 ,  I7] = new ZNode2(i1 = m, i2 = n)
                    override def plus8(m: NodeHighTupleAlias2[  Tuple1_Context8 ], n: I8): ZNode2[ Tuple1_Context8 ,  I8] = new ZNode2(i1 = m, i2 = n)
            }
}
