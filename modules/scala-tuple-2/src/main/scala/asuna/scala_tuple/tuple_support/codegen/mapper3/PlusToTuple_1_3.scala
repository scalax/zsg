package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_3 {
        final def plus3WithTypeParameter1Dynamic[Y1 , Y2 , Y3]: Plus3[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3]
        ] = new Plus3[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3]
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
        }
        final val plus3WithTypeParameter1Strict: Plus3[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Any , Any , Any,
            Tuple1[Any] , Tuple1[Any] , Tuple1[Any]
        ] = plus3WithTypeParameter1Dynamic[Any , Any , Any]
        final def plus3WithTypeParameter1[Y1 , Y2 , Y3]: Plus3[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3]
        ] = plus3WithTypeParameter1Strict.asInstanceOf[Plus3[
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Y1 , Y2 , Y3,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3]
        ]]
}
