package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_6_1 {
        final def plus1WithTypeParameter6[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6
        ]: Plus1[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]],
            ZsgTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] = new Plus1[
            NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]],
            ZsgTuple0,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] {
                final override def takeHead1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]] =
                    BuildContent.nodeTuple2(BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple2(z._3 , z._4)) , BuildContent.nodeTuple1(BuildContent.tuple2(z._5 , z._6)))
                final override def takeTail1(z: Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple2[Plus1_X3 , Plus1_X4]] , NodeTuple1[ZsgTuple2[Plus1_X5 , Plus1_X6]]], y: ZsgTuple0): Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6] =
                    Tuple6(x.i1.i1.i1 , x.i1.i1.i2 , x.i1.i2.i1 , x.i1.i2.i2 , x.i2.i1.i1 , x.i2.i1.i2)
        }
}