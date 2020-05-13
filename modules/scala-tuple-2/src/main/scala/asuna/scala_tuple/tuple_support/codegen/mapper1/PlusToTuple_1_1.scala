package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.ZsgTuple0
import asuna.ZsgTuple1
import asuna.ZsgTuple2
import asuna.NodeTuple1
import asuna.NodeTuple2
import asuna.BuildContent
trait PlusToTuple_1_1 {
        final def plus1WithTypeParameter1Dynamic[Y1]: Plus1[
            ZsgTuple0,
            Y1,
            Tuple1[Y1]
        ] = new Plus1[
            ZsgTuple0,
            Y1,
            Tuple1[Y1]
        ] {
                final override def takeHead1(z: Tuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                final override def takeTail1(z: Tuple1[Y1]): Y1 = z._1
                final override def plus1(x: ZsgTuple0, y: Y1): Tuple1[Y1] = Tuple1(y)
        }
        final val plus1WithTypeParameter1Strict: Plus1[
            ZsgTuple0,
            Any,
            Tuple1[Any]
        ] = plus1WithTypeParameter1Dynamic[Any]
        final def plus1WithTypeParameter1[Y1]: Plus1[
            ZsgTuple0,
            Y1,
            Tuple1[Y1]
        ] = plus1WithTypeParameter1Strict.asInstanceOf[Plus1[
            ZsgTuple0,
            Y1,
            Tuple1[Y1]
        ]]
}
