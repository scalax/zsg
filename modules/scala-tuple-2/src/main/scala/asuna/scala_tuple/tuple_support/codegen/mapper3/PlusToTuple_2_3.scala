package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_3 {
        final def plus3WithTypeParameter2Dynamic[
            X1 , X2 , X3,
            Y1 , Y2 , Y3
        ]: Plus3[
            X1 , X2 , X3,
            Y1 , Y2 , Y3,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3]
        ] = new Plus3[
            X1 , X2 , X3,
            Y1 , Y2 , Y3,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3]
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
        }
        final val plus3WithTypeParameter2Strict: Plus3[
            Any , Any , Any,
            Any , Any , Any,
            Tuple2[Any, Any] , Tuple2[Any, Any] , Tuple2[Any, Any]
        ] = plus3WithTypeParameter2Dynamic[
            Any , Any , Any,
            Any , Any , Any
        ]
        final def plus3WithTypeParameter2[
            X1 , X2 , X3,
            Y1 , Y2 , Y3
        ]: Plus3[
            X1 , X2 , X3,
            Y1 , Y2 , Y3,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3]
        ] = plus3WithTypeParameter2Strict.asInstanceOf[Plus3[
            X1 , X2 , X3,
            Y1 , Y2 , Y3,
            Tuple2[Y1, X1] , Tuple2[Y2, X2] , Tuple2[Y3, X3]
        ]]
}
