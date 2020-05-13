package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_4 {
        final def plus4WithTypeParameter1Dynamic[Y1 , Y2 , Y3 , Y4]: Plus4[
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Y1 , Y2 , Y3 , Y4,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4]
        ] = new Plus4[
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Y1 , Y2 , Y3 , Y4,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4]
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
        }
        final val plus4WithTypeParameter1Strict: Plus4[
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Any , Any , Any , Any,
            Tuple1[Any] , Tuple1[Any] , Tuple1[Any] , Tuple1[Any]
        ] = plus4WithTypeParameter1Dynamic[Any , Any , Any , Any]
        final def plus4WithTypeParameter1[Y1 , Y2 , Y3 , Y4]: Plus4[
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Y1 , Y2 , Y3 , Y4,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4]
        ] = plus4WithTypeParameter1Strict.asInstanceOf[Plus4[
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Y1 , Y2 , Y3 , Y4,
            Tuple1[Y1] , Tuple1[Y2] , Tuple1[Y3] , Tuple1[Y4]
        ]]
}
