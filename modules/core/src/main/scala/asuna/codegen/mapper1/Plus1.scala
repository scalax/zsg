package asuna
abstract class Plus1[
    X1,
    Y1,
    Z1
] {
        def takeHead1(z: Z1): X1
        def takeTail1(z: Z1): Y1
        def plus1(x: X1, y: Y1): Z1
}
object Plus1 {
    final def cachePlusWithTypeParameter0Dynamic[Y1]: Plus1[
        AsunaTuple0,
        Y1,
        AsunaTuple1[Y1]
    ] = new Plus1[
        AsunaTuple0,
        Y1,
        AsunaTuple1[Y1]
    ] {
            final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
            final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
    }
    final val cachePlusWithTypeParameter0Strict: Plus1[
        AsunaTuple0,
        Any,
        AsunaTuple1[Any]
    ] = new Plus1[
        AsunaTuple0,
        Any,
        AsunaTuple1[Any]
    ] {
            final override def takeHead1(z: AsunaTuple1[Any]): AsunaTuple0 = AsunaTuple0.value
            final override def takeTail1(z: AsunaTuple1[Any]): Any = z.i1
            final override def plus1(x: AsunaTuple0, y: Any): AsunaTuple1[Any] = new AsunaTuple1(y)
    }
    final def cachePlusWithTypeParameter0[Y1]: Plus1[
        AsunaTuple0,
        Y1,
        AsunaTuple1[Y1]
    ] = cachePlusWithTypeParameter0Strict.asInstanceOf[Plus1[
        AsunaTuple0,
        Y1,
        AsunaTuple1[Y1]
    ]]
    final def cachePlusWithTypeParameter1Dynamic[
        X1,
        Y1
    ]: Plus1[
        X1,
        Y1,
        AsunaTuple2[Y1, X1]
    ] = new Plus1[
        X1,
        Y1,
        AsunaTuple2[Y1, X1]
    ] {
            final override def takeHead1(z: AsunaTuple2[Y1, X1]): X1 = z.i2
            final override def takeTail1(z: AsunaTuple2[Y1, X1]): Y1 = z.i1
            final override def plus1(x: X1, y: Y1): AsunaTuple2[Y1, X1] = new AsunaTuple2(y, x)
    }
    final val cachePlusWithTypeParameter1Strict: Plus1[
        Any,
        Any,
        AsunaTuple2[Any, Any]
    ] = new Plus1[
        Any,
        Any,
        AsunaTuple2[Any, Any]
    ] {
            final override def takeHead1(z: AsunaTuple2[Any, Any]): Any = z.i2
            final override def takeTail1(z: AsunaTuple2[Any, Any]): Any = z.i1
            final override def plus1(x: Any, y: Any): AsunaTuple2[Any, Any] = new AsunaTuple2(y, x)
    }
    final def cachePlusWithTypeParameter1[
        X1,
        Y1
    ]: Plus1[
        X1,
        Y1,
        AsunaTuple2[Y1, X1]
    ] = cachePlusWithTypeParameter1Strict.asInstanceOf[Plus1[
        X1,
        Y1,
        AsunaTuple2[Y1, X1]
    ]]
}
