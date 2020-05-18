package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_2_1 {
        final def plus1WithTypeParameter2Dynamic[
            X1,
            Y1
        ]: Plus1[
            X1,
            Y1,
            Tuple2[Y1, X1]
        ] = new Plus1[
            X1,
            Y1,
            Tuple2[Y1, X1]
        ] {
                final override def takeHead1(z: Tuple2[Y1, X1]): X1 = z._2
                final override def takeTail1(z: Tuple2[Y1, X1]): Y1 = z._1
                final override def plus1(x: X1, y: Y1): Tuple2[Y1, X1] = Tuple2(y, x)
        }
        final val plus1WithTypeParameter2Strict: Plus1[
            Any,
            Any,
            Tuple2[Any, Any]
        ] = plus1WithTypeParameter2Dynamic[
            Any,
            Any
        ]
        final def plus1WithTypeParameter2[
            X1,
            Y1
        ]: Plus1[
            X1,
            Y1,
            Tuple2[Y1, X1]
        ] = plus1WithTypeParameter2Strict.asInstanceOf[Plus1[
            X1,
            Y1,
            Tuple2[Y1, X1]
        ]]
}
