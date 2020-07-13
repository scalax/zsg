package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_3_2 {
        final def plus2WithTypeParameter3[
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3
        ]: Plus2[
            zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            ZsgTuple0 , ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ] = new Plus2[
            zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            ZsgTuple0 , ZsgTuple0,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ] {
                final override def takeHead1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    new zsg.ZTuple3(i1 = z._1 , i2 = z._2 , i3 = z._3)
                final override def takeTail1(z: Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3], y: ZsgTuple0): Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] =
                    Tuple3(_1 = x.i1 , _2 = x.i2 , _3 = x.i3)
                final override def takeHead2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] =
                    new zsg.ZTuple3(i1 = z._1 , i2 = z._2 , i3 = z._3)
                final override def takeTail2(z: Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3], y: ZsgTuple0): Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] =
                    Tuple3(_1 = x.i1 , _2 = x.i2 , _3 = x.i3)
        }
}
