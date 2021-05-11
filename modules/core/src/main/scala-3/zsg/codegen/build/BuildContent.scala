package zsg
object BuildContent {
        def plusFuncImpl[X1   , Y1 ] =
        new Plus1[X1   , Y1   , zsg.ZsgTuple2[X1, Y1] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2   , Y1  , Y2 ] =
        new Plus2[X1  , X2   , Y1  , Y2   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3   , Y1  , Y2  , Y3 ] =
        new Plus3[X1  , X2  , X3   , Y1  , Y2  , Y3   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4   , Y1  , Y2  , Y3  , Y4 ] =
        new Plus4[X1  , X2  , X3  , X4   , Y1  , Y2  , Y3  , Y4   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5   , Y1  , Y2  , Y3  , Y4  , Y5 ] =
        new Plus5[X1  , X2  , X3  , X4  , X5   , Y1  , Y2  , Y3  , Y4  , Y5   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6 ] =
        new Plus6[X1  , X2  , X3  , X4  , X5  , X6   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7 ] =
        new Plus7[X1  , X2  , X3  , X4  , X5  , X6  , X7   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8 ] =
        new Plus8[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9 ] =
        new Plus9[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10 ] =
        new Plus10[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11 ] =
        new Plus11[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12 ] =
        new Plus12[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13 ] =
        new Plus13[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14 ] =
        new Plus14[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15 ] =
        new Plus15[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16 ] =
        new Plus16[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17 ] =
        new Plus17[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18 ] =
        new Plus18[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17]  , zsg.ZsgTuple2[X18, Y18] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead18(z: zsg.ZsgTuple2[X18, Y18]): X18 = z.i1
                override def takeTail18(z: zsg.ZsgTuple2[X18, Y18]): Y18 = z.i2
                override def plus18(x: X18, y: Y18): zsg.ZsgTuple2[X18, Y18] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19 ] =
        new Plus19[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17]  , zsg.ZsgTuple2[X18, Y18]  , zsg.ZsgTuple2[X19, Y19] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead18(z: zsg.ZsgTuple2[X18, Y18]): X18 = z.i1
                override def takeTail18(z: zsg.ZsgTuple2[X18, Y18]): Y18 = z.i2
                override def plus18(x: X18, y: Y18): zsg.ZsgTuple2[X18, Y18] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead19(z: zsg.ZsgTuple2[X19, Y19]): X19 = z.i1
                override def takeTail19(z: zsg.ZsgTuple2[X19, Y19]): Y19 = z.i2
                override def plus19(x: X19, y: Y19): zsg.ZsgTuple2[X19, Y19] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20 ] =
        new Plus20[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17]  , zsg.ZsgTuple2[X18, Y18]  , zsg.ZsgTuple2[X19, Y19]  , zsg.ZsgTuple2[X20, Y20] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead18(z: zsg.ZsgTuple2[X18, Y18]): X18 = z.i1
                override def takeTail18(z: zsg.ZsgTuple2[X18, Y18]): Y18 = z.i2
                override def plus18(x: X18, y: Y18): zsg.ZsgTuple2[X18, Y18] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead19(z: zsg.ZsgTuple2[X19, Y19]): X19 = z.i1
                override def takeTail19(z: zsg.ZsgTuple2[X19, Y19]): Y19 = z.i2
                override def plus19(x: X19, y: Y19): zsg.ZsgTuple2[X19, Y19] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead20(z: zsg.ZsgTuple2[X20, Y20]): X20 = z.i1
                override def takeTail20(z: zsg.ZsgTuple2[X20, Y20]): Y20 = z.i2
                override def plus20(x: X20, y: Y20): zsg.ZsgTuple2[X20, Y20] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20  , X21   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20  , Y21 ] =
        new Plus21[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20  , X21   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20  , Y21   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17]  , zsg.ZsgTuple2[X18, Y18]  , zsg.ZsgTuple2[X19, Y19]  , zsg.ZsgTuple2[X20, Y20]  , zsg.ZsgTuple2[X21, Y21] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead18(z: zsg.ZsgTuple2[X18, Y18]): X18 = z.i1
                override def takeTail18(z: zsg.ZsgTuple2[X18, Y18]): Y18 = z.i2
                override def plus18(x: X18, y: Y18): zsg.ZsgTuple2[X18, Y18] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead19(z: zsg.ZsgTuple2[X19, Y19]): X19 = z.i1
                override def takeTail19(z: zsg.ZsgTuple2[X19, Y19]): Y19 = z.i2
                override def plus19(x: X19, y: Y19): zsg.ZsgTuple2[X19, Y19] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead20(z: zsg.ZsgTuple2[X20, Y20]): X20 = z.i1
                override def takeTail20(z: zsg.ZsgTuple2[X20, Y20]): Y20 = z.i2
                override def plus20(x: X20, y: Y20): zsg.ZsgTuple2[X20, Y20] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead21(z: zsg.ZsgTuple2[X21, Y21]): X21 = z.i1
                override def takeTail21(z: zsg.ZsgTuple2[X21, Y21]): Y21 = z.i2
                override def plus21(x: X21, y: Y21): zsg.ZsgTuple2[X21, Y21] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
        def plusFuncImpl[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20  , X21  , X22   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20  , Y21  , Y22 ] =
        new Plus22[X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8  , X9  , X10  , X11  , X12  , X13  , X14  , X15  , X16  , X17  , X18  , X19  , X20  , X21  , X22   , Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  , Y8  , Y9  , Y10  , Y11  , Y12  , Y13  , Y14  , Y15  , Y16  , Y17  , Y18  , Y19  , Y20  , Y21  , Y22   , zsg.ZsgTuple2[X1, Y1]  , zsg.ZsgTuple2[X2, Y2]  , zsg.ZsgTuple2[X3, Y3]  , zsg.ZsgTuple2[X4, Y4]  , zsg.ZsgTuple2[X5, Y5]  , zsg.ZsgTuple2[X6, Y6]  , zsg.ZsgTuple2[X7, Y7]  , zsg.ZsgTuple2[X8, Y8]  , zsg.ZsgTuple2[X9, Y9]  , zsg.ZsgTuple2[X10, Y10]  , zsg.ZsgTuple2[X11, Y11]  , zsg.ZsgTuple2[X12, Y12]  , zsg.ZsgTuple2[X13, Y13]  , zsg.ZsgTuple2[X14, Y14]  , zsg.ZsgTuple2[X15, Y15]  , zsg.ZsgTuple2[X16, Y16]  , zsg.ZsgTuple2[X17, Y17]  , zsg.ZsgTuple2[X18, Y18]  , zsg.ZsgTuple2[X19, Y19]  , zsg.ZsgTuple2[X20, Y20]  , zsg.ZsgTuple2[X21, Y21]  , zsg.ZsgTuple2[X22, Y22] ] {
                override def takeHead1(z: zsg.ZsgTuple2[X1, Y1]): X1 = z.i1
                override def takeTail1(z: zsg.ZsgTuple2[X1, Y1]): Y1 = z.i2
                override def plus1(x: X1, y: Y1): zsg.ZsgTuple2[X1, Y1] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead2(z: zsg.ZsgTuple2[X2, Y2]): X2 = z.i1
                override def takeTail2(z: zsg.ZsgTuple2[X2, Y2]): Y2 = z.i2
                override def plus2(x: X2, y: Y2): zsg.ZsgTuple2[X2, Y2] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead3(z: zsg.ZsgTuple2[X3, Y3]): X3 = z.i1
                override def takeTail3(z: zsg.ZsgTuple2[X3, Y3]): Y3 = z.i2
                override def plus3(x: X3, y: Y3): zsg.ZsgTuple2[X3, Y3] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead4(z: zsg.ZsgTuple2[X4, Y4]): X4 = z.i1
                override def takeTail4(z: zsg.ZsgTuple2[X4, Y4]): Y4 = z.i2
                override def plus4(x: X4, y: Y4): zsg.ZsgTuple2[X4, Y4] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead5(z: zsg.ZsgTuple2[X5, Y5]): X5 = z.i1
                override def takeTail5(z: zsg.ZsgTuple2[X5, Y5]): Y5 = z.i2
                override def plus5(x: X5, y: Y5): zsg.ZsgTuple2[X5, Y5] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead6(z: zsg.ZsgTuple2[X6, Y6]): X6 = z.i1
                override def takeTail6(z: zsg.ZsgTuple2[X6, Y6]): Y6 = z.i2
                override def plus6(x: X6, y: Y6): zsg.ZsgTuple2[X6, Y6] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead7(z: zsg.ZsgTuple2[X7, Y7]): X7 = z.i1
                override def takeTail7(z: zsg.ZsgTuple2[X7, Y7]): Y7 = z.i2
                override def plus7(x: X7, y: Y7): zsg.ZsgTuple2[X7, Y7] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead8(z: zsg.ZsgTuple2[X8, Y8]): X8 = z.i1
                override def takeTail8(z: zsg.ZsgTuple2[X8, Y8]): Y8 = z.i2
                override def plus8(x: X8, y: Y8): zsg.ZsgTuple2[X8, Y8] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead9(z: zsg.ZsgTuple2[X9, Y9]): X9 = z.i1
                override def takeTail9(z: zsg.ZsgTuple2[X9, Y9]): Y9 = z.i2
                override def plus9(x: X9, y: Y9): zsg.ZsgTuple2[X9, Y9] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead10(z: zsg.ZsgTuple2[X10, Y10]): X10 = z.i1
                override def takeTail10(z: zsg.ZsgTuple2[X10, Y10]): Y10 = z.i2
                override def plus10(x: X10, y: Y10): zsg.ZsgTuple2[X10, Y10] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead11(z: zsg.ZsgTuple2[X11, Y11]): X11 = z.i1
                override def takeTail11(z: zsg.ZsgTuple2[X11, Y11]): Y11 = z.i2
                override def plus11(x: X11, y: Y11): zsg.ZsgTuple2[X11, Y11] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead12(z: zsg.ZsgTuple2[X12, Y12]): X12 = z.i1
                override def takeTail12(z: zsg.ZsgTuple2[X12, Y12]): Y12 = z.i2
                override def plus12(x: X12, y: Y12): zsg.ZsgTuple2[X12, Y12] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead13(z: zsg.ZsgTuple2[X13, Y13]): X13 = z.i1
                override def takeTail13(z: zsg.ZsgTuple2[X13, Y13]): Y13 = z.i2
                override def plus13(x: X13, y: Y13): zsg.ZsgTuple2[X13, Y13] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead14(z: zsg.ZsgTuple2[X14, Y14]): X14 = z.i1
                override def takeTail14(z: zsg.ZsgTuple2[X14, Y14]): Y14 = z.i2
                override def plus14(x: X14, y: Y14): zsg.ZsgTuple2[X14, Y14] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead15(z: zsg.ZsgTuple2[X15, Y15]): X15 = z.i1
                override def takeTail15(z: zsg.ZsgTuple2[X15, Y15]): Y15 = z.i2
                override def plus15(x: X15, y: Y15): zsg.ZsgTuple2[X15, Y15] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead16(z: zsg.ZsgTuple2[X16, Y16]): X16 = z.i1
                override def takeTail16(z: zsg.ZsgTuple2[X16, Y16]): Y16 = z.i2
                override def plus16(x: X16, y: Y16): zsg.ZsgTuple2[X16, Y16] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead17(z: zsg.ZsgTuple2[X17, Y17]): X17 = z.i1
                override def takeTail17(z: zsg.ZsgTuple2[X17, Y17]): Y17 = z.i2
                override def plus17(x: X17, y: Y17): zsg.ZsgTuple2[X17, Y17] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead18(z: zsg.ZsgTuple2[X18, Y18]): X18 = z.i1
                override def takeTail18(z: zsg.ZsgTuple2[X18, Y18]): Y18 = z.i2
                override def plus18(x: X18, y: Y18): zsg.ZsgTuple2[X18, Y18] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead19(z: zsg.ZsgTuple2[X19, Y19]): X19 = z.i1
                override def takeTail19(z: zsg.ZsgTuple2[X19, Y19]): Y19 = z.i2
                override def plus19(x: X19, y: Y19): zsg.ZsgTuple2[X19, Y19] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead20(z: zsg.ZsgTuple2[X20, Y20]): X20 = z.i1
                override def takeTail20(z: zsg.ZsgTuple2[X20, Y20]): Y20 = z.i2
                override def plus20(x: X20, y: Y20): zsg.ZsgTuple2[X20, Y20] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead21(z: zsg.ZsgTuple2[X21, Y21]): X21 = z.i1
                override def takeTail21(z: zsg.ZsgTuple2[X21, Y21]): Y21 = z.i2
                override def plus21(x: X21, y: Y21): zsg.ZsgTuple2[X21, Y21] = new zsg.ZsgTuple2(i1 = x, i2 = y)
                override def takeHead22(z: zsg.ZsgTuple2[X22, Y22]): X22 = z.i1
                override def takeTail22(z: zsg.ZsgTuple2[X22, Y22]): Y22 = z.i2
                override def plus22(x: X22, y: Y22): zsg.ZsgTuple2[X22, Y22] = new zsg.ZsgTuple2(i1 = x, i2 = y)
        }
}
