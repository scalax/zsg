package asuna.scala_tuple.tuple_support
import asuna.Plus5
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_5 {
        final def plus5WithTypeParameter1Dynamic[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5]
        ] = new Plus5[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5]
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
        }
        final val plus5WithTypeParameter1Strict: Plus5[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Any , Any , Any , Any , Any,
            Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any]
        ] = plus5WithTypeParameter1Dynamic[Any , Any , Any , Any , Any]
        final def plus5WithTypeParameter1[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5]
        ] = plus5WithTypeParameter1Strict.asInstanceOf[Plus5[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4] , Tuple1[Y5]
        ]]
}
