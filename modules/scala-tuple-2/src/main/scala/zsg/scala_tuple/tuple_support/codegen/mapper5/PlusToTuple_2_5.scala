package zsg.scala_tuple.tuple_support
import zsg.Plus5
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_2_5 {
        final def plus5WithTypeParameter2Dynamic[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5
        ]: Plus5[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5]
        ] = new Plus5[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5]
        ] {
                final override def takeHead1(z: Tuple2[Y1, X1]): X1 = z._2
                final override def takeTail1(z: Tuple2[Y1, X1]): Y1 = z._1
                final override def plus1(x: X1, y: Y1): Tuple2[Y1, X1] = Tuple2(y, x)
                final override def takeHead2(z: Tuple2[Y2, X2]): X2 = z._2
                final override def takeTail2(z: Tuple2[Y2, X2]): Y2 = z._1
                final override def plus2(x: X2, y: Y2): Tuple2[Y2, X2] = Tuple2(y, x)
                final override def takeHead3(z: Tuple2[Y3, X3]): X3 = z._2
                final override def takeTail3(z: Tuple2[Y3, X3]): Y3 = z._1
                final override def plus3(x: X3, y: Y3): Tuple2[Y3, X3] = Tuple2(y, x)
                final override def takeHead4(z: Tuple2[Y4, X4]): X4 = z._2
                final override def takeTail4(z: Tuple2[Y4, X4]): Y4 = z._1
                final override def plus4(x: X4, y: Y4): Tuple2[Y4, X4] = Tuple2(y, x)
                final override def takeHead5(z: Tuple2[Y5, X5]): X5 = z._2
                final override def takeTail5(z: Tuple2[Y5, X5]): Y5 = z._1
                final override def plus5(x: X5, y: Y5): Tuple2[Y5, X5] = Tuple2(y, x)
        }
        final val plus5WithTypeParameter2Strict: Plus5[
            Any , Any , Any , Any , Any,
            Any , Any , Any , Any , Any,
            Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any]
        ] = plus5WithTypeParameter2Dynamic[
            Any , Any , Any , Any , Any,
            Any , Any , Any , Any , Any
        ]
        final def plus5WithTypeParameter2[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5
        ]: Plus5[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5]
        ] = plus5WithTypeParameter2Strict.asInstanceOf[Plus5[
            X1 , X2 , X3 , X4 , X5,
            Y1 , Y2 , Y3 , Y4 , Y5,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5]
        ]]
}
