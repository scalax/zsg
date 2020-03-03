package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_8 {
        final def plus8WithTypeParameter1Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5] , Tuple1[Y6] , Tuple1[Y7] , Tuple1[Y8]
        ] = new Plus8[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5] , Tuple1[Y6] , Tuple1[Y7] , Tuple1[Y8]
        ] {
                final override def takeHead1(z: Tuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail1(z: Tuple1[Y1]): Y1 = z._1
                final override def plus1(x: AsunaTuple0, y: Y1): Tuple1[Y1] = Tuple1(y)
                final override def takeHead2(z: Tuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail2(z: Tuple1[Y2]): Y2 = z._1
                final override def plus2(x: AsunaTuple0, y: Y2): Tuple1[Y2] = Tuple1(y)
                final override def takeHead3(z: Tuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail3(z: Tuple1[Y3]): Y3 = z._1
                final override def plus3(x: AsunaTuple0, y: Y3): Tuple1[Y3] = Tuple1(y)
                final override def takeHead4(z: Tuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail4(z: Tuple1[Y4]): Y4 = z._1
                final override def plus4(x: AsunaTuple0, y: Y4): Tuple1[Y4] = Tuple1(y)
                final override def takeHead5(z: Tuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail5(z: Tuple1[Y5]): Y5 = z._1
                final override def plus5(x: AsunaTuple0, y: Y5): Tuple1[Y5] = Tuple1(y)
                final override def takeHead6(z: Tuple1[Y6]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail6(z: Tuple1[Y6]): Y6 = z._1
                final override def plus6(x: AsunaTuple0, y: Y6): Tuple1[Y6] = Tuple1(y)
                final override def takeHead7(z: Tuple1[Y7]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail7(z: Tuple1[Y7]): Y7 = z._1
                final override def plus7(x: AsunaTuple0, y: Y7): Tuple1[Y7] = Tuple1(y)
                final override def takeHead8(z: Tuple1[Y8]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail8(z: Tuple1[Y8]): Y8 = z._1
                final override def plus8(x: AsunaTuple0, y: Y8): Tuple1[Y8] = Tuple1(y)
        }
        final val plus8WithTypeParameter1Strict: Plus8[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Any , Any , Any , Any , Any , Any , Any , Any,
            Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any]
        ] = plus8WithTypeParameter1Dynamic[Any , Any , Any , Any , Any , Any , Any , Any]
        final def plus8WithTypeParameter1[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5] , Tuple1[Y6] , Tuple1[Y7] , Tuple1[Y8]
        ] = plus8WithTypeParameter1Strict.asInstanceOf[Plus8[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5] , Tuple1[Y6] , Tuple1[Y7] , Tuple1[Y8]
        ]]
}
