package asuna.scala_tuple.tuple_support
import asuna.Plus5
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.BuildContent
trait PlusToTuple_5_5 {
        final def plus5WithTypeParameter5[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5
        ]: Plus5[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple1[Plus1_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple1[Plus2_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple1[AsunaTuple1[Plus3_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple1[AsunaTuple1[Plus4_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]] , AsunaTuple1[AsunaTuple1[Plus5_X5]]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]
        ] = new Plus5[
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple1[Plus1_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple1[Plus2_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple1[AsunaTuple1[Plus3_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple1[AsunaTuple1[Plus4_X5]]],
            AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]] , AsunaTuple1[AsunaTuple1[Plus5_X5]]],
            AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]
        ] {
                final override def takeHead1(z: Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple1[Plus1_X5]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple1(z._5)))
                final override def takeTail1(z: Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]): AsunaTuple0 = AsunaTuple0.value
                final override def plus1(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus1_X1 , Plus1_X2] , AsunaTuple2[Plus1_X3 , Plus1_X4]] , AsunaTuple1[AsunaTuple1[Plus1_X5]]], y: AsunaTuple0): Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
                final override def takeHead2(z: Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple1[Plus2_X5]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple1(z._5)))
                final override def takeTail2(z: Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]): AsunaTuple0 = AsunaTuple0.value
                final override def plus2(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus2_X1 , Plus2_X2] , AsunaTuple2[Plus2_X3 , Plus2_X4]] , AsunaTuple1[AsunaTuple1[Plus2_X5]]], y: AsunaTuple0): Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
                final override def takeHead3(z: Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple1[AsunaTuple1[Plus3_X5]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple1(z._5)))
                final override def takeTail3(z: Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5]): AsunaTuple0 = AsunaTuple0.value
                final override def plus3(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus3_X1 , Plus3_X2] , AsunaTuple2[Plus3_X3 , Plus3_X4]] , AsunaTuple1[AsunaTuple1[Plus3_X5]]], y: AsunaTuple0): Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
                final override def takeHead4(z: Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple1[AsunaTuple1[Plus4_X5]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple1(z._5)))
                final override def takeTail4(z: Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5]): AsunaTuple0 = AsunaTuple0.value
                final override def plus4(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus4_X1 , Plus4_X2] , AsunaTuple2[Plus4_X3 , Plus4_X4]] , AsunaTuple1[AsunaTuple1[Plus4_X5]]], y: AsunaTuple0): Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
                final override def takeHead5(z: Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]): AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]] , AsunaTuple1[AsunaTuple1[Plus5_X5]]] =
                    BuildContent.tuple2(BuildContent.tuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.tuple1(BuildContent.tuple1(z._5)))
                final override def takeTail5(z: Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]): AsunaTuple0 = AsunaTuple0.value
                final override def plus5(x: AsunaTuple2[AsunaTuple2[AsunaTuple2[Plus5_X1 , Plus5_X2] , AsunaTuple2[Plus5_X3 , Plus5_X4]] , AsunaTuple1[AsunaTuple1[Plus5_X5]]], y: AsunaTuple0): Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5] =
                    Tuple5(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1)
        }
}
