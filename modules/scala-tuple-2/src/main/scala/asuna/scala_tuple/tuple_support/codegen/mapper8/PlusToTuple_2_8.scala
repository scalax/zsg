package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_2_8 {
        final def plus8WithTypeParameter2[
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2,
            Plus5_X1 , Plus5_X2,
            Plus6_X1 , Plus6_X2,
            Plus7_X1 , Plus7_X2,
            Plus8_X1 , Plus8_X2
        ]: Plus8[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple2[Plus3_X1 , Plus3_X2],
            AsunaTuple2[Plus4_X1 , Plus4_X2],
            AsunaTuple2[Plus5_X1 , Plus5_X2],
            AsunaTuple2[Plus6_X1 , Plus6_X2],
            AsunaTuple2[Plus7_X1 , Plus7_X2],
            AsunaTuple2[Plus8_X1 , Plus8_X2],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2],
            Tuple2[Plus8_X1 , Plus8_X2]
        ] = new Plus8[
            AsunaTuple2[Plus1_X1 , Plus1_X2],
            AsunaTuple2[Plus2_X1 , Plus2_X2],
            AsunaTuple2[Plus3_X1 , Plus3_X2],
            AsunaTuple2[Plus4_X1 , Plus4_X2],
            AsunaTuple2[Plus5_X1 , Plus5_X2],
            AsunaTuple2[Plus6_X1 , Plus6_X2],
            AsunaTuple2[Plus7_X1 , Plus7_X2],
            AsunaTuple2[Plus8_X1 , Plus8_X2],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2],
            Tuple2[Plus8_X1 , Plus8_X2]
        ] {
                final override def takeHead1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple2[Plus1_X1 , Plus1_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail1(z: Tuple2[Plus1_X1 , Plus1_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[Plus1_X1 , Plus1_X2], y: AsunaTuple0): Tuple2[Plus1_X1 , Plus1_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple2[Plus2_X1 , Plus2_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail2(z: Tuple2[Plus2_X1 , Plus2_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[Plus2_X1 , Plus2_X2], y: AsunaTuple0): Tuple2[Plus2_X1 , Plus2_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead3(z: Tuple2[Plus3_X1 , Plus3_X2]): AsunaTuple2[Plus3_X1 , Plus3_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail3(z: Tuple2[Plus3_X1 , Plus3_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[Plus3_X1 , Plus3_X2], y: AsunaTuple0): Tuple2[Plus3_X1 , Plus3_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead4(z: Tuple2[Plus4_X1 , Plus4_X2]): AsunaTuple2[Plus4_X1 , Plus4_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail4(z: Tuple2[Plus4_X1 , Plus4_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[Plus4_X1 , Plus4_X2], y: AsunaTuple0): Tuple2[Plus4_X1 , Plus4_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead5(z: Tuple2[Plus5_X1 , Plus5_X2]): AsunaTuple2[Plus5_X1 , Plus5_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail5(z: Tuple2[Plus5_X1 , Plus5_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus5(x: AsunaTuple2[Plus5_X1 , Plus5_X2], y: AsunaTuple0): Tuple2[Plus5_X1 , Plus5_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead6(z: Tuple2[Plus6_X1 , Plus6_X2]): AsunaTuple2[Plus6_X1 , Plus6_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail6(z: Tuple2[Plus6_X1 , Plus6_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus6(x: AsunaTuple2[Plus6_X1 , Plus6_X2], y: AsunaTuple0): Tuple2[Plus6_X1 , Plus6_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead7(z: Tuple2[Plus7_X1 , Plus7_X2]): AsunaTuple2[Plus7_X1 , Plus7_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail7(z: Tuple2[Plus7_X1 , Plus7_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus7(x: AsunaTuple2[Plus7_X1 , Plus7_X2], y: AsunaTuple0): Tuple2[Plus7_X1 , Plus7_X2] =
                    Tuple2(x.i1 , x.i2)
                final override def takeHead8(z: Tuple2[Plus8_X1 , Plus8_X2]): AsunaTuple2[Plus8_X1 , Plus8_X2] =
                    BuildContent.tuple2(z._1 , z._2)
                final override def takeTail8(z: Tuple2[Plus8_X1 , Plus8_X2]): AsunaTuple0 = AsunaTuple0.value
                final override def plus8(x: AsunaTuple2[Plus8_X1 , Plus8_X2], y: AsunaTuple0): Tuple2[Plus8_X1 , Plus8_X2] =
                    Tuple2(x.i1 , x.i2)
        }
}
