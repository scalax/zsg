package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_4_4 {
        final def plus4WithTypeParameter4[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4
        ]: Plus4[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]
        ] = new Plus4[
            AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]],
            AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]],
            AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]],
            AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]
        ] {
                final override def takeHead1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]], y: AsunaTuple0): Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]], y: AsunaTuple0): Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead3(z: Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]): AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail3(z: Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]], y: AsunaTuple0): Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
                final override def takeHead4(z: Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]): AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] =
                    BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4))
                final override def takeTail4(z: Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]], y: AsunaTuple0): Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4] =
                    Tuple4(x.i1.i1 , x.i1.i2 , x.i2.i1 , x.i2.i2)
        }
}
