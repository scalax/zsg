package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.ZsgTuple1
import zsg.ZsgTuple2
import zsg.NodeTuple1
import zsg.NodeTuple2
import zsg.BuildContent
trait PlusToTuple_3_1 {
        final def plus1WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3
        ]: Plus1[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]],
            ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] = new Plus1[
            NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]],
            ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]] =
                    BuildContent.nodeTuple2(BuildContent.tuple2(z._1 , z._2) , BuildContent.tuple1(z._3))
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: NodeTuple2[ZsgTuple2[Plus1_X1 , Plus1_X2] , ZsgTuple1[Plus1_X3]], y: ZsgTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(x.i1.i1 , x.i1.i2 , x.i2.i1)
        }
}
