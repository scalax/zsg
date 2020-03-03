package asuna
abstract class Plus5[
    X1 , X2 , X3 , X4 , X5,
    Y1 , Y2 , Y3 , Y4 , Y5,
    Z1 , Z2 , Z3 , Z4 , Z5
] {
        def takeHead1(z: Z1): X1
        def takeTail1(z: Z1): Y1
        def plus1(x: X1, y: Y1): Z1
        def takeHead2(z: Z2): X2
        def takeTail2(z: Z2): Y2
        def plus2(x: X2, y: Y2): Z2
        def takeHead3(z: Z3): X3
        def takeTail3(z: Z3): Y3
        def plus3(x: X3, y: Y3): Z3
        def takeHead4(z: Z4): X4
        def takeTail4(z: Z4): Y4
        def plus4(x: X4, y: Y4): Z4
        def takeHead5(z: Z5): X5
        def takeTail5(z: Z5): Y5
        def plus5(x: X5, y: Y5): Z5
}
object Plus5 {
    final def cachePlusWithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
        AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
    ] = new Plus5[
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
        AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
    ] {
            final override def takeHead1(z: AsunaTuple1[Y1]): Y1 = z.i1
            final override def takeTail1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
            final override def plus1(y: Y1, x: AsunaTuple0): AsunaTuple1[Y1] = new AsunaTuple1(y)
            final override def takeHead2(z: AsunaTuple1[Y2]): Y2 = z.i1
            final override def takeTail2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
            final override def plus2(y: Y2, x: AsunaTuple0): AsunaTuple1[Y2] = new AsunaTuple1(y)
            final override def takeHead3(z: AsunaTuple1[Y3]): Y3 = z.i1
            final override def takeTail3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
            final override def plus3(y: Y3, x: AsunaTuple0): AsunaTuple1[Y3] = new AsunaTuple1(y)
            final override def takeHead4(z: AsunaTuple1[Y4]): Y4 = z.i1
            final override def takeTail4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
            final override def plus4(y: Y4, x: AsunaTuple0): AsunaTuple1[Y4] = new AsunaTuple1(y)
            final override def takeHead5(z: AsunaTuple1[Y5]): Y5 = z.i1
            final override def takeTail5(z: AsunaTuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
            final override def plus5(y: Y5, x: AsunaTuple0): AsunaTuple1[Y5] = new AsunaTuple1(y)
    }
    final val cachePlusWithTypeParameter0Strict: Plus5[
        Any , Any , Any , Any , Any,
        AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
        AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
    ] = cachePlusWithTypeParameter0Dynamic[Any , Any , Any , Any , Any]
    final def cachePlusWithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
        AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
    ] = cachePlusWithTypeParameter0Strict.asInstanceOf[Plus5[
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
        AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
    ]]
    final def cachePlusWithTypeParameter1Dynamic[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5
    ]: Plus5[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2] , AsunaTuple2[Y3, X3] , AsunaTuple2[Y4, X4] , AsunaTuple2[Y5, X5]
    ] = new Plus5[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2] , AsunaTuple2[Y3, X3] , AsunaTuple2[Y4, X4] , AsunaTuple2[Y5, X5]
    ] {
            final override def takeHead1(z: AsunaTuple2[Y1, X1]): X1 = z.i2
            final override def takeTail1(z: AsunaTuple2[Y1, X1]): Y1 = z.i1
            final override def plus1(x: X1, y: Y1): AsunaTuple2[Y1, X1] = new AsunaTuple2(y, x)
            final override def takeHead2(z: AsunaTuple2[Y2, X2]): X2 = z.i2
            final override def takeTail2(z: AsunaTuple2[Y2, X2]): Y2 = z.i1
            final override def plus2(x: X2, y: Y2): AsunaTuple2[Y2, X2] = new AsunaTuple2(y, x)
            final override def takeHead3(z: AsunaTuple2[Y3, X3]): X3 = z.i2
            final override def takeTail3(z: AsunaTuple2[Y3, X3]): Y3 = z.i1
            final override def plus3(x: X3, y: Y3): AsunaTuple2[Y3, X3] = new AsunaTuple2(y, x)
            final override def takeHead4(z: AsunaTuple2[Y4, X4]): X4 = z.i2
            final override def takeTail4(z: AsunaTuple2[Y4, X4]): Y4 = z.i1
            final override def plus4(x: X4, y: Y4): AsunaTuple2[Y4, X4] = new AsunaTuple2(y, x)
            final override def takeHead5(z: AsunaTuple2[Y5, X5]): X5 = z.i2
            final override def takeTail5(z: AsunaTuple2[Y5, X5]): Y5 = z.i1
            final override def plus5(x: X5, y: Y5): AsunaTuple2[Y5, X5] = new AsunaTuple2(y, x)
    }
    final val cachePlusWithTypeParameter1Strict: Plus5[
        Any , Any , Any , Any , Any,
        Any , Any , Any , Any , Any,
        AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any] , AsunaTuple2[Any, Any]
    ] = cachePlusWithTypeParameter1Dynamic[
        Any , Any , Any , Any , Any,
        Any , Any , Any , Any , Any
    ]
    final def cachePlusWithTypeParameter1[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5
    ]: Plus5[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2] , AsunaTuple2[Y3, X3] , AsunaTuple2[Y4, X4] , AsunaTuple2[Y5, X5]
    ] = cachePlusWithTypeParameter1Strict.asInstanceOf[Plus5[
        X1 , X2 , X3 , X4 , X5,
        Y1 , Y2 , Y3 , Y4 , Y5,
        AsunaTuple2[Y1, X1] , AsunaTuple2[Y2, X2] , AsunaTuple2[Y3, X3] , AsunaTuple2[Y4, X4] , AsunaTuple2[Y5, X5]
    ]]
}
