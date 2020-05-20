package zsg
    class DebugMessage1[X1]
    class DebugMessage2[X1 , X2]
    class DebugMessage3[X1 , X2 , X3]
    class DebugMessage4[X1 , X2 , X3 , X4]
    class DebugMessage5[X1 , X2 , X3 , X4 , X5]
    class DebugMessage6[X1 , X2 , X3 , X4 , X5 , X6]
    class DebugMessage7[X1 , X2 , X3 , X4 , X5 , X6 , X7]
    class DebugMessage8[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
object DebugMessage {
    def byImplicit[X1](
        i1: DebugMessage1[X1]
    )(
         implicit 
        message1: X1
    ): DebugMessage1[X1] = new DebugMessage1[X1]
    def byImplicit[X1 , X2](
        i2: DebugMessage2[X1 , X2]
    )(
         implicit 
            message1: X1,
        message2: X2
    ): DebugMessage2[X1 , X2] = new DebugMessage2[X1 , X2]
    def byImplicit[X1 , X2 , X3](
        i3: DebugMessage3[X1 , X2 , X3]
    )(
         implicit 
            message1: X1,
            message2: X2,
        message3: X3
    ): DebugMessage3[X1 , X2 , X3] = new DebugMessage3[X1 , X2 , X3]
    def byImplicit[X1 , X2 , X3 , X4](
        i4: DebugMessage4[X1 , X2 , X3 , X4]
    )(
         implicit 
            message1: X1,
            message2: X2,
            message3: X3,
        message4: X4
    ): DebugMessage4[X1 , X2 , X3 , X4] = new DebugMessage4[X1 , X2 , X3 , X4]
    def byImplicit[X1 , X2 , X3 , X4 , X5](
        i5: DebugMessage5[X1 , X2 , X3 , X4 , X5]
    )(
         implicit 
            message1: X1,
            message2: X2,
            message3: X3,
            message4: X4,
        message5: X5
    ): DebugMessage5[X1 , X2 , X3 , X4 , X5] = new DebugMessage5[X1 , X2 , X3 , X4 , X5]
    def byImplicit[X1 , X2 , X3 , X4 , X5 , X6](
        i6: DebugMessage6[X1 , X2 , X3 , X4 , X5 , X6]
    )(
         implicit 
            message1: X1,
            message2: X2,
            message3: X3,
            message4: X4,
            message5: X5,
        message6: X6
    ): DebugMessage6[X1 , X2 , X3 , X4 , X5 , X6] = new DebugMessage6[X1 , X2 , X3 , X4 , X5 , X6]
    def byImplicit[X1 , X2 , X3 , X4 , X5 , X6 , X7](
        i7: DebugMessage7[X1 , X2 , X3 , X4 , X5 , X6 , X7]
    )(
         implicit 
            message1: X1,
            message2: X2,
            message3: X3,
            message4: X4,
            message5: X5,
            message6: X6,
        message7: X7
    ): DebugMessage7[X1 , X2 , X3 , X4 , X5 , X6 , X7] = new DebugMessage7[X1 , X2 , X3 , X4 , X5 , X6 , X7]
    def byImplicit[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8](
        i8: DebugMessage8[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
    )(
         implicit 
            message1: X1,
            message2: X2,
            message3: X3,
            message4: X4,
            message5: X5,
            message6: X6,
            message7: X7,
        message8: X8
    ): DebugMessage8[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8] = new DebugMessage8[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8]
}
