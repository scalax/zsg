package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.ZsgTuple0
import asuna.ZsgTuple1
import asuna.ZsgTuple2
import asuna.NodeTuple1
import asuna.NodeTuple2
import asuna.BuildContent
trait PlusToTuple_3_8 {
        final def plus8WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3,
            Plus7_X1 , Plus7_X2 , Plus7_X3,
            Plus8_X1 , Plus8_X2 , Plus8_X3
        ]: Plus8[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]],
            NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple1[Plus2_X3]],
            NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple1[Plus3_X3]],
            NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple1[Plus4_X3]],
            NodeTuple2[ZsgTuple2[Plus5_X1 , Plus5_X2] , ZsgTuple1[Plus5_X3]],
            NodeTuple2[ZsgTuple2[Plus6_X1 , Plus6_X2] , ZsgTuple1[Plus6_X3]],
            NodeTuple2[ZsgTuple2[Plus7_X1 , Plus7_X2] , ZsgTuple1[Plus7_X3]],
            NodeTuple2[ZsgTuple2[Plus8_X1 , Plus8_X2] , ZsgTuple1[Plus8_X3]],
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] = new Plus8[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]],
            NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple1[Plus2_X3]],
            NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple1[Plus3_X3]],
            NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple1[Plus4_X3]],
            NodeTuple2[ZsgTuple2[Plus5_X1 , Plus5_X2] , ZsgTuple1[Plus5_X3]],
            NodeTuple2[ZsgTuple2[Plus6_X1 , Plus6_X2] , ZsgTuple1[Plus6_X3]],
            NodeTuple2[ZsgTuple2[Plus7_X1 , Plus7_X2] , ZsgTuple1[Plus7_X3]],
            NodeTuple2[ZsgTuple2[Plus8_X1 , Plus8_X2] , ZsgTuple1[Plus8_X3]],
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]], y: ZsgTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple1[Plus2_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple1[Plus2_X3]], y: ZsgTuple0): Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple1[Plus3_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail3(z: Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus3(x: NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple1[Plus3_X3]], y: ZsgTuple0): Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead4(z: Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]): NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple1[Plus4_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail4(z: Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus4(x: NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple1[Plus4_X3]], y: ZsgTuple0): Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead5(z: Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3]): NodeTuple2[ZsgTuple2[Plus5_X1 , Plus5_X2] , ZsgTuple1[Plus5_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail5(z: Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus5(x: NodeTuple2[ZsgTuple2[Plus5_X1 , Plus5_X2] , ZsgTuple1[Plus5_X3]], y: ZsgTuple0): Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead6(z: Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]): NodeTuple2[ZsgTuple2[Plus6_X1 , Plus6_X2] , ZsgTuple1[Plus6_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail6(z: Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus6(x: NodeTuple2[ZsgTuple2[Plus6_X1 , Plus6_X2] , ZsgTuple1[Plus6_X3]], y: ZsgTuple0): Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead7(z: Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]): NodeTuple2[ZsgTuple2[Plus7_X1 , Plus7_X2] , ZsgTuple1[Plus7_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail7(z: Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus7(x: NodeTuple2[ZsgTuple2[Plus7_X1 , Plus7_X2] , ZsgTuple1[Plus7_X3]], y: ZsgTuple0): Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
                final override def takeHead8(z: Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]): NodeTuple2[ZsgTuple2[Plus8_X1 , Plus8_X2] , ZsgTuple1[Plus8_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail8(z: Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus8(x: NodeTuple2[ZsgTuple2[Plus8_X1 , Plus8_X2] , ZsgTuple1[Plus8_X3]], y: ZsgTuple0): Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
        }
}
