package asuna.scala_tuple.tuple_support
import asuna.Plus6
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_1_6 {
        final def plus6WithTypeParameter1[
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1
        ]: Plus6[
            AsunaTuple1[Plus1_X1],
            AsunaTuple1[Plus2_X1],
            AsunaTuple1[Plus3_X1],
            AsunaTuple1[Plus4_X1],
            AsunaTuple1[Plus5_X1],
            AsunaTuple1[Plus6_X1],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
        ] = new Plus6[
            AsunaTuple1[Plus1_X1],
            AsunaTuple1[Plus2_X1],
            AsunaTuple1[Plus3_X1],
            AsunaTuple1[Plus4_X1],
            AsunaTuple1[Plus5_X1],
            AsunaTuple1[Plus6_X1],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
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
                final override def takeHead3(z: Tuple1[Plus3_X1]): AsunaTuple1[Plus3_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail3(z: Tuple1[Plus3_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple1[Plus3_X1], y: AsunaTuple0): Tuple1[Plus3_X1] =
                    Tuple1(x.i1)
                final override def takeHead4(z: Tuple1[Plus4_X1]): AsunaTuple1[Plus4_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail4(z: Tuple1[Plus4_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple1[Plus4_X1], y: AsunaTuple0): Tuple1[Plus4_X1] =
                    Tuple1(x.i1)
                final override def takeHead5(z: Tuple1[Plus5_X1]): AsunaTuple1[Plus5_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail5(z: Tuple1[Plus5_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus5(x: AsunaTuple1[Plus5_X1], y: AsunaTuple0): Tuple1[Plus5_X1] =
                    Tuple1(x.i1)
                final override def takeHead6(z: Tuple1[Plus6_X1]): AsunaTuple1[Plus6_X1] =
                    BuildContent.tuple1(z._1)
                final override def takeTail6(z: Tuple1[Plus6_X1]): AsunaTuple0 = AsunaTuple0.value
                final override def plus6(x: AsunaTuple1[Plus6_X1], y: AsunaTuple0): Tuple1[Plus6_X1] =
                    Tuple1(x.i1)
        }
}
