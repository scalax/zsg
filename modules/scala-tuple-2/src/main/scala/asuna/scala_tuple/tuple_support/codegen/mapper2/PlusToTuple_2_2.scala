package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_2 {
        final def plus2WithTypeParameter2Dynamic[
            X1 , X2,
            Y1 , Y2
        ]: Plus2[
            X1 , X2,
            Y1 , Y2,
            Tuple2[Y1, X1] , Tuple2[Y2, X2]
        ] = new Plus2[
            X1 , X2,
            Y1 , Y2,
            Tuple2[Y1, X1] , Tuple2[Y2, X2]
        ] {
                final override def takeHead1(z: Tuple2[Y1, X1]): X1 = z._2
                final override def takeTail1(z: Tuple2[Y1, X1]): Y1 = z._1
                final override def plus1(x: X1, y: Y1): Tuple2[Y1, X1] = Tuple2(y, x)
                final override def takeHead2(z: Tuple2[Y2, X2]): X2 = z._2
                final override def takeTail2(z: Tuple2[Y2, X2]): Y2 = z._1
                final override def plus2(x: X2, y: Y2): Tuple2[Y2, X2] = Tuple2(y, x)
        }
        final val plus2WithTypeParameter2Strict: Plus2[
            Any , Any,
            Any , Any,
            Tuple2[Any, Any] , Tuple2[Any, Any]
        ] = plus2WithTypeParameter2Dynamic[
            Any , Any,
            Any , Any
        ]
        final def plus2WithTypeParameter2[
            X1 , X2,
            Y1 , Y2
        ]: Plus2[
            X1 , X2,
            Y1 , Y2,
            Tuple2[Y1, X1] , Tuple2[Y2, X2]
        ] = plus2WithTypeParameter2Strict.asInstanceOf[Plus2[
            X1 , X2,
            Y1 , Y2,
            Tuple2[Y1, X1] , Tuple2[Y2, X2]
        ]]
}
