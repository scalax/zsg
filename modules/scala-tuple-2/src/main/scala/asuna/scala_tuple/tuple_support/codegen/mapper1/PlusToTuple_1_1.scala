package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_1 {
        final def plus1WithTypeParameter1Dynamic[Y1]: Plus1[
            AsunaTuple0,
            Y1,
            Tuple1[Y1]
        ] = new Plus1[
            AsunaTuple0,
            Y1,
            Tuple1[Y1]
        ] {
                final override def takeHead1(z: Tuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                final override def takeTail1(z: Tuple1[Y1]): Y1 = z._1
                final override def plus1(x: AsunaTuple0, y: Y1): Tuple1[Y1] = Tuple1(y)
        }
        final val plus1WithTypeParameter1Strict: Plus1[
            AsunaTuple0,
            Any,
            Tuple1[Any]
        ] = plus1WithTypeParameter1Dynamic[Any]
        final def plus1WithTypeParameter1[Y1]: Plus1[
            AsunaTuple0,
            Y1,
            Tuple1[Y1]
        ] = plus1WithTypeParameter1Strict.asInstanceOf[Plus1[
            AsunaTuple0,
            Y1,
            Tuple1[Y1]
        ]]
}
