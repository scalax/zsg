package asuna.scala_tuple.tuple_support
import asuna.Plus4
import asuna.ZsgTuple0
import asuna.ZsgTuple1
import asuna.ZsgTuple2
import asuna.NodeTuple1
import asuna.NodeTuple2
import asuna.BuildContent
trait PlusToTuple_6_4 {
        final def plus4WithTypeParameter6[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6
        ]: Plus4[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple2[Plus2_X5 , Plus2_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple2[Plus3_X3 , Plus3_X4]] , NodeTuple1[ZsgTuple2[Plus3_X5 , Plus3_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple2[Plus4_X3 , Plus4_X4]] , NodeTuple1[ZsgTuple2[Plus4_X5 , Plus4_X6]]],
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
            Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6]
        ] = new Plus4[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple2[Plus2_X5 , Plus2_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple2[Plus3_X3 , Plus3_X4]] , NodeTuple1[ZsgTuple2[Plus3_X5 , Plus3_X6]]],
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple2[Plus4_X3 , Plus4_X4]] , NodeTuple1[ZsgTuple2[Plus4_X5 , Plus4_X6]]],
            ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
            Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6]
        ] {
                final override def takeHead1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]], y: ZsgTuple0): Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
                final override def takeHead2(z: Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple2[Plus2_X5 , Plus2_X6]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail2(z: Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus2_X1 , Plus2_X2] , ZsgTuple2[Plus2_X3 , Plus2_X4]] , NodeTuple1[ZsgTuple2[Plus2_X5 , Plus2_X6]]], y: ZsgTuple0): Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
                final override def takeHead3(z: Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple2[Plus3_X3 , Plus3_X4]] , NodeTuple1[ZsgTuple2[Plus3_X5 , Plus3_X6]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail3(z: Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6]): ZsgTuple0 = ZsgTuple0.value
                final override def plus3(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus3_X1 , Plus3_X2] , ZsgTuple2[Plus3_X3 , Plus3_X4]] , NodeTuple1[ZsgTuple2[Plus3_X5 , Plus3_X6]]], y: ZsgTuple0): Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
                final override def takeHead4(z: Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple2[Plus4_X3 , Plus4_X4]] , NodeTuple1[ZsgTuple2[Plus4_X5 , Plus4_X6]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail4(z: Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6]): ZsgTuple0 = ZsgTuple0.value
                final override def plus4(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus4_X1 , Plus4_X2] , ZsgTuple2[Plus4_X3 , Plus4_X4]] , NodeTuple1[ZsgTuple2[Plus4_X5 , Plus4_X6]]], y: ZsgTuple0): Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
        }
}
