package zsg
object PlusInstanceTuple2 {
            def pContextNum1[  K1   , I1 ]:  Plus1[  K1   , I1    , ZTuple2[K1, I1] ]  =  new  Plus1[  K1   , I1    , ZTuple2[K1, I1] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
            }
            val cacheContextNum1:  Plus1[  Any   , Any    , ZTuple2[Any, Any] ]  = pContextNum1[  Any   , Any ]
            def contextNum1[  K1   , I1 ]:  Plus1[  K1   , I1    , ZTuple2[K1, I1] ]  = cacheContextNum1.asInstanceOf[ Plus1[  K1   , I1    , ZTuple2[K1, I1] ] ]
            def pContextNum2[  K1   ,  K2   , I1  , I2 ]:  Plus2[  K1   ,  K2   , I1  , I2    , ZTuple2[K1, I1]  , ZTuple2[K2, I2] ]  =  new  Plus2[  K1   ,  K2   , I1  , I2    , ZTuple2[K1, I1]  , ZTuple2[K2, I2] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
            }
            val cacheContextNum2:  Plus2[  Any   ,  Any   , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum2[  Any   ,  Any   , Any  , Any ]
            def contextNum2[  K1   ,  K2   , I1  , I2 ]:  Plus2[  K1   ,  K2   , I1  , I2    , ZTuple2[K1, I1]  , ZTuple2[K2, I2] ]  = cacheContextNum2.asInstanceOf[ Plus2[  K1   ,  K2   , I1  , I2    , ZTuple2[K1, I1]  , ZTuple2[K2, I2] ] ]
            def pContextNum3[  K1   ,  K2   ,  K3   , I1  , I2  , I3 ]:  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3] ]  =  new  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
            }
            val cacheContextNum3:  Plus3[  Any   ,  Any   ,  Any   , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum3[  Any   ,  Any   ,  Any   , Any  , Any  , Any ]
            def contextNum3[  K1   ,  K2   ,  K3   , I1  , I2  , I3 ]:  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3] ]  = cacheContextNum3.asInstanceOf[ Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3] ] ]
            def pContextNum4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4 ]:  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4] ]  =  new  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZTuple2[K4, I4]): K4 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[K4, I4]): I4 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
                    override def plus4(m: K4, n: I4): ZTuple2[K4, I4] = new ZTuple2(m, n)
            }
            val cacheContextNum4:  Plus4[  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum4[  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any ]
            def contextNum4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4 ]:  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4] ]  = cacheContextNum4.asInstanceOf[ Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4] ] ]
            def pContextNum5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5 ]:  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5] ]  =  new  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZTuple2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZTuple2[K5, I5]): K5 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[K5, I5]): I5 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
                    override def plus4(m: K4, n: I4): ZTuple2[K4, I4] = new ZTuple2(m, n)
                    override def plus5(m: K5, n: I5): ZTuple2[K5, I5] = new ZTuple2(m, n)
            }
            val cacheContextNum5:  Plus5[  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum5[  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any ]
            def contextNum5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5 ]:  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5] ]  = cacheContextNum5.asInstanceOf[ Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5] ] ]
            def pContextNum6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6 ]:  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6] ]  =  new  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZTuple2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZTuple2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZTuple2[K6, I6]): K6 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[K6, I6]): I6 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
                    override def plus4(m: K4, n: I4): ZTuple2[K4, I4] = new ZTuple2(m, n)
                    override def plus5(m: K5, n: I5): ZTuple2[K5, I5] = new ZTuple2(m, n)
                    override def plus6(m: K6, n: I6): ZTuple2[K6, I6] = new ZTuple2(m, n)
            }
            val cacheContextNum6:  Plus6[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum6[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any ]
            def contextNum6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6 ]:  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6] ]  = cacheContextNum6.asInstanceOf[ Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6] ] ]
            def pContextNum7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7 ]:  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7] ]  =  new  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZTuple2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZTuple2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZTuple2[K6, I6]): K6 = n.i1
                    override def takeHead7(n: ZTuple2[K7, I7]): K7 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[K6, I6]): I6 = n.i2
                    override def takeTail7(n: ZTuple2[K7, I7]): I7 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
                    override def plus4(m: K4, n: I4): ZTuple2[K4, I4] = new ZTuple2(m, n)
                    override def plus5(m: K5, n: I5): ZTuple2[K5, I5] = new ZTuple2(m, n)
                    override def plus6(m: K6, n: I6): ZTuple2[K6, I6] = new ZTuple2(m, n)
                    override def plus7(m: K7, n: I7): ZTuple2[K7, I7] = new ZTuple2(m, n)
            }
            val cacheContextNum7:  Plus7[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum7[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any  , Any ]
            def contextNum7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7 ]:  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7] ]  = cacheContextNum7.asInstanceOf[ Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7] ] ]
            def pContextNum8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8 ]:  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7]  , ZTuple2[K8, I8] ]  =  new  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7]  , ZTuple2[K8, I8] ]   {
                    override def takeHead1(n: ZTuple2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZTuple2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZTuple2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZTuple2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZTuple2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZTuple2[K6, I6]): K6 = n.i1
                    override def takeHead7(n: ZTuple2[K7, I7]): K7 = n.i1
                    override def takeHead8(n: ZTuple2[K8, I8]): K8 = n.i1
                    override def takeTail1(n: ZTuple2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZTuple2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZTuple2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZTuple2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZTuple2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZTuple2[K6, I6]): I6 = n.i2
                    override def takeTail7(n: ZTuple2[K7, I7]): I7 = n.i2
                    override def takeTail8(n: ZTuple2[K8, I8]): I8 = n.i2
                    override def plus1(m: K1, n: I1): ZTuple2[K1, I1] = new ZTuple2(m, n)
                    override def plus2(m: K2, n: I2): ZTuple2[K2, I2] = new ZTuple2(m, n)
                    override def plus3(m: K3, n: I3): ZTuple2[K3, I3] = new ZTuple2(m, n)
                    override def plus4(m: K4, n: I4): ZTuple2[K4, I4] = new ZTuple2(m, n)
                    override def plus5(m: K5, n: I5): ZTuple2[K5, I5] = new ZTuple2(m, n)
                    override def plus6(m: K6, n: I6): ZTuple2[K6, I6] = new ZTuple2(m, n)
                    override def plus7(m: K7, n: I7): ZTuple2[K7, I7] = new ZTuple2(m, n)
                    override def plus8(m: K8, n: I8): ZTuple2[K8, I8] = new ZTuple2(m, n)
            }
            val cacheContextNum8:  Plus8[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any  , Any  , Any    , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any]  , ZTuple2[Any, Any] ]  = pContextNum8[  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   ,  Any   , Any  , Any  , Any  , Any  , Any  , Any  , Any  , Any ]
            def contextNum8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8 ]:  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7]  , ZTuple2[K8, I8] ]  = cacheContextNum8.asInstanceOf[ Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZTuple2[K1, I1]  , ZTuple2[K2, I2]  , ZTuple2[K3, I3]  , ZTuple2[K4, I4]  , ZTuple2[K5, I5]  , ZTuple2[K6, I6]  , ZTuple2[K7, I7]  , ZTuple2[K8, I8] ] ]
            def pNodeContextNum1[  K1 <: TupleTag   , I1 <: TupleTag ]:  Plus1[  K1   , I1    , ZNode2[K1, I1] ]  =  new  Plus1[  K1   , I1    , ZNode2[K1, I1] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum1:  Plus1[  TupleTag   , TupleTag    , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum1[  TupleTag   , TupleTag ]
            def nodeContextNum1[  K1 <: TupleTag   , I1 <: TupleTag ]:  Plus1[  K1   , I1    , ZNode2[K1, I1] ]  = cacheNodeContextNum1.asInstanceOf[ Plus1[  K1   , I1    , ZNode2[K1, I1] ] ]
            def pNodeContextNum2[  K1 <: TupleTag   ,  K2 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag ]:  Plus2[  K1   ,  K2   , I1  , I2    , ZNode2[K1, I1]  , ZNode2[K2, I2] ]  =  new  Plus2[  K1   ,  K2   , I1  , I2    , ZNode2[K1, I1]  , ZNode2[K2, I2] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum2:  Plus2[  TupleTag   ,  TupleTag   , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum2[  TupleTag   ,  TupleTag   , TupleTag  , TupleTag ]
            def nodeContextNum2[  K1 <: TupleTag   ,  K2 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag ]:  Plus2[  K1   ,  K2   , I1  , I2    , ZNode2[K1, I1]  , ZNode2[K2, I2] ]  = cacheNodeContextNum2.asInstanceOf[ Plus2[  K1   ,  K2   , I1  , I2    , ZNode2[K1, I1]  , ZNode2[K2, I2] ] ]
            def pNodeContextNum3[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag ]:  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3] ]  =  new  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum3:  Plus3[  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum3[  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum3[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag ]:  Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3] ]  = cacheNodeContextNum3.asInstanceOf[ Plus3[  K1   ,  K2   ,  K3   , I1  , I2  , I3    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3] ] ]
            def pNodeContextNum4[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag ]:  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4] ]  =  new  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZNode2[K4, I4]): K4 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[K4, I4]): I4 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: K4, n: I4): ZNode2[K4, I4] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum4:  Plus4[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum4[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum4[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag ]:  Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4] ]  = cacheNodeContextNum4.asInstanceOf[ Plus4[  K1   ,  K2   ,  K3   ,  K4   , I1  , I2  , I3  , I4    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4] ] ]
            def pNodeContextNum5[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag ]:  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5] ]  =  new  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZNode2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZNode2[K5, I5]): K5 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[K5, I5]): I5 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: K4, n: I4): ZNode2[K4, I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: K5, n: I5): ZNode2[K5, I5] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum5:  Plus5[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum5[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum5[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag ]:  Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5] ]  = cacheNodeContextNum5.asInstanceOf[ Plus5[  K1   ,  K2   ,  K3   ,  K4   ,  K5   , I1  , I2  , I3  , I4  , I5    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5] ] ]
            def pNodeContextNum6[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag ]:  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6] ]  =  new  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZNode2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZNode2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZNode2[K6, I6]): K6 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[K6, I6]): I6 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: K4, n: I4): ZNode2[K4, I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: K5, n: I5): ZNode2[K5, I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: K6, n: I6): ZNode2[K6, I6] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum6:  Plus6[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum6[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum6[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag ]:  Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6] ]  = cacheNodeContextNum6.asInstanceOf[ Plus6[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   , I1  , I2  , I3  , I4  , I5  , I6    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6] ] ]
            def pNodeContextNum7[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   ,  K7 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag ]:  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7] ]  =  new  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZNode2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZNode2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZNode2[K6, I6]): K6 = n.i1
                    override def takeHead7(n: ZNode2[K7, I7]): K7 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[K6, I6]): I6 = n.i2
                    override def takeTail7(n: ZNode2[K7, I7]): I7 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: K4, n: I4): ZNode2[K4, I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: K5, n: I5): ZNode2[K5, I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: K6, n: I6): ZNode2[K6, I6] = new ZNode2(i1 = m, i2 = n)
                    override def plus7(m: K7, n: I7): ZNode2[K7, I7] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum7:  Plus7[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum7[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum7[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   ,  K7 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag ]:  Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7] ]  = cacheNodeContextNum7.asInstanceOf[ Plus7[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   , I1  , I2  , I3  , I4  , I5  , I6  , I7    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7] ] ]
            def pNodeContextNum8[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   ,  K7 <: TupleTag   ,  K8 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag  , I8 <: TupleTag ]:  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7]  , ZNode2[K8, I8] ]  =  new  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7]  , ZNode2[K8, I8] ]   {
                    override def takeHead1(n: ZNode2[K1, I1]): K1 = n.i1
                    override def takeHead2(n: ZNode2[K2, I2]): K2 = n.i1
                    override def takeHead3(n: ZNode2[K3, I3]): K3 = n.i1
                    override def takeHead4(n: ZNode2[K4, I4]): K4 = n.i1
                    override def takeHead5(n: ZNode2[K5, I5]): K5 = n.i1
                    override def takeHead6(n: ZNode2[K6, I6]): K6 = n.i1
                    override def takeHead7(n: ZNode2[K7, I7]): K7 = n.i1
                    override def takeHead8(n: ZNode2[K8, I8]): K8 = n.i1
                    override def takeTail1(n: ZNode2[K1, I1]): I1 = n.i2
                    override def takeTail2(n: ZNode2[K2, I2]): I2 = n.i2
                    override def takeTail3(n: ZNode2[K3, I3]): I3 = n.i2
                    override def takeTail4(n: ZNode2[K4, I4]): I4 = n.i2
                    override def takeTail5(n: ZNode2[K5, I5]): I5 = n.i2
                    override def takeTail6(n: ZNode2[K6, I6]): I6 = n.i2
                    override def takeTail7(n: ZNode2[K7, I7]): I7 = n.i2
                    override def takeTail8(n: ZNode2[K8, I8]): I8 = n.i2
                    override def plus1(m: K1, n: I1): ZNode2[K1, I1] = new ZNode2(i1 = m, i2 = n)
                    override def plus2(m: K2, n: I2): ZNode2[K2, I2] = new ZNode2(i1 = m, i2 = n)
                    override def plus3(m: K3, n: I3): ZNode2[K3, I3] = new ZNode2(i1 = m, i2 = n)
                    override def plus4(m: K4, n: I4): ZNode2[K4, I4] = new ZNode2(i1 = m, i2 = n)
                    override def plus5(m: K5, n: I5): ZNode2[K5, I5] = new ZNode2(i1 = m, i2 = n)
                    override def plus6(m: K6, n: I6): ZNode2[K6, I6] = new ZNode2(i1 = m, i2 = n)
                    override def plus7(m: K7, n: I7): ZNode2[K7, I7] = new ZNode2(i1 = m, i2 = n)
                    override def plus8(m: K8, n: I8): ZNode2[K8, I8] = new ZNode2(i1 = m, i2 = n)
            }
            val cacheNodeContextNum8:  Plus8[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag    , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag]  , ZNode2[TupleTag, TupleTag] ]  = pNodeContextNum8[  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   ,  TupleTag   , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag  , TupleTag ]
            def nodeContextNum8[  K1 <: TupleTag   ,  K2 <: TupleTag   ,  K3 <: TupleTag   ,  K4 <: TupleTag   ,  K5 <: TupleTag   ,  K6 <: TupleTag   ,  K7 <: TupleTag   ,  K8 <: TupleTag   , I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag  , I8 <: TupleTag ]:  Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7]  , ZNode2[K8, I8] ]  = cacheNodeContextNum8.asInstanceOf[ Plus8[  K1   ,  K2   ,  K3   ,  K4   ,  K5   ,  K6   ,  K7   ,  K8   , I1  , I2  , I3  , I4  , I5  , I6  , I7  , I8    , ZNode2[K1, I1]  , ZNode2[K2, I2]  , ZNode2[K3, I3]  , ZNode2[K4, I4]  , ZNode2[K5, I5]  , ZNode2[K6, I6]  , ZNode2[K7, I7]  , ZNode2[K8, I8] ] ]
}
