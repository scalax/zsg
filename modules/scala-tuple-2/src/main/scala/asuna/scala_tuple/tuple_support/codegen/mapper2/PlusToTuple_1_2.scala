package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_2 {
        final def plus2WithTypeParameter1[
            Plus1_X1,
            Plus2_X1
        ]: Plus2[
            AsunaTuple1[Plus1_X1],
            AsunaTuple1[Plus2_X1],
            AsunaTuple0 , AsunaTuple0,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1]
        ] = new Plus2[
            AsunaTuple1[Plus1_X1],
            AsunaTuple1[Plus2_X1],
            AsunaTuple0 , AsunaTuple0,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1]
        ] {
                final override def takeHead1(z: Tuple1[Plus1_X1]): AsunaTuple1[Plus1_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail1(z: Tuple1[Plus1_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple1[Plus1_X1], y: AsunaTuple0): Tuple1[Plus1_X1] =
                    Tuple1(x.i1)
                final override def takeHead2(z: Tuple1[Plus2_X1]): AsunaTuple1[Plus2_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail2(z: Tuple1[Plus2_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple1[Plus2_X1], y: AsunaTuple0): Tuple1[Plus2_X1] =
                    Tuple1(x.i1)
        }
}
