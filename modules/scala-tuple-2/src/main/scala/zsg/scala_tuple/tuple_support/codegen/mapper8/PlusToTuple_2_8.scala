package zsg.scala_tuple.tuple_support
import zsg.Plus8
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_2_8 {
        final def plus8WithTypeParameter2Dynamic[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8
        ]: Plus8[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5] , Tuple2[Y6, X6] , Tuple2[Y7, X7] , Tuple2[Y8, X8]
        ] = new Plus8[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5] , Tuple2[Y6, X6] , Tuple2[Y7, X7] , Tuple2[Y8, X8]
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
                final override def takeHead6(z: Tuple2[Y6, X6]): X6 = z._2
                final override def takeTail6(z: Tuple2[Y6, X6]): Y6 = z._1
                final override def plus6(x: X6, y: Y6): Tuple2[Y6, X6] = Tuple2(y, x)
                final override def takeHead7(z: Tuple2[Y7, X7]): X7 = z._2
                final override def takeTail7(z: Tuple2[Y7, X7]): Y7 = z._1
                final override def plus7(x: X7, y: Y7): Tuple2[Y7, X7] = Tuple2(y, x)
                final override def takeHead8(z: Tuple2[Y8, X8]): X8 = z._2
                final override def takeTail8(z: Tuple2[Y8, X8]): Y8 = z._1
                final override def plus8(x: X8, y: Y8): Tuple2[Y8, X8] = Tuple2(y, x)
        }
        final val plus8WithTypeParameter2Strict: Plus8[
            Any , Any , Any , Any , Any , Any , Any , Any,
            Any , Any , Any , Any , Any , Any , Any , Any,
            Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any]
        ] = plus8WithTypeParameter2Dynamic[
            Any , Any , Any , Any , Any , Any , Any , Any,
            Any , Any , Any , Any , Any , Any , Any , Any
        ]
        final def plus8WithTypeParameter2[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8
        ]: Plus8[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5] , Tuple2[Y6, X6] , Tuple2[Y7, X7] , Tuple2[Y8, X8]
        ] = plus8WithTypeParameter2Strict.asInstanceOf[Plus8[
            X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
            Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3] , Tuple2[Y4, X4] , Tuple2[Y5, X5] , Tuple2[Y6, X6] , Tuple2[Y7, X7] , Tuple2[Y8, X8]
        ]]
}
