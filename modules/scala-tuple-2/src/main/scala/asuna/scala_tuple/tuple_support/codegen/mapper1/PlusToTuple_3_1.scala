package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.ZsgTuple0
import asuna.ZsgTuple1
import asuna.ZsgTuple2
import asuna.NodeTuple1
import asuna.NodeTuple2
import asuna.BuildContent
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
