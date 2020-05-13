package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_2 {
        final def plus2WithTypeParameter1Dynamic[Y1 , Y2]: Plus2[
            ZsgTuple0 , ZsgTuple0,
            Y1 , Y2,
            Tuple1[Y1] , Tuple1[Y2]
        ] = new Plus2[
            ZsgTuple0 , ZsgTuple0,
            Y1 , Y2,
            Tuple1[Y1] , Tuple1[Y2]
        ] {
                final override def takeHead1(z: Tuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail1(z: Tuple1[Y1]): Y1 = z._1
                final override def plus1(x: AsunaTuple0, y: Y1): Tuple1[Y1] = Tuple1(y)
                final override def takeHead2(z: Tuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail2(z: Tuple1[Y2]): Y2 = z._1
                final override def plus2(x: AsunaTuple0, y: Y2): Tuple1[Y2] = Tuple1(y)
        }
        final val plus2WithTypeParameter1Strict: Plus2[
            ZsgTuple0 , ZsgTuple0,
            Any , Any,
            Tuple1[Any] , Tuple1[Any]
        ] = plus2WithTypeParameter1Dynamic[Any , Any]
        final def plus2WithTypeParameter1[Y1 , Y2]: Plus2[
            ZsgTuple0 , ZsgTuple0,
            Y1 , Y2,
            Tuple1[Y1] , Tuple1[Y2]
        ] = plus2WithTypeParameter1Strict.asInstanceOf[Plus2[
            ZsgTuple0 , ZsgTuple0,
            Y1 , Y2,
            Tuple1[Y1] , Tuple1[Y2]
        ]]
}
