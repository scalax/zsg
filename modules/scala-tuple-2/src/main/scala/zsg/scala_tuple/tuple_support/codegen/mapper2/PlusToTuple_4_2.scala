package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_4_2 {
        final def plus2WithTypeParameter4[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4
        ]: Plus2[
            zsg.ZTuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            zsg.ZTuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            ZsgTuple0 , ZsgTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] = new Plus2[
            zsg.ZTuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            zsg.ZTuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            ZsgTuple0 , ZsgTuple0,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] {
                final override def takeHead1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): zsg.ZTuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    new zsg.ZTuple4(i1 = z._1 , i2 = z._2 , i3 = z._3 , i4 = z._4)
                final override def takeTail1(z: Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: zsg.ZTuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4], y: ZsgTuple0): Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4] =
                    Tuple4(_1 = x.i1 , _2 = x.i2 , _3 = x.i3 , _4 = x.i4)
                final override def takeHead2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): zsg.ZTuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] =
                    new zsg.ZTuple4(i1 = z._1 , i2 = z._2 , i3 = z._3 , i4 = z._4)
                final override def takeTail2(z: Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]): ZsgTuple0 = ZsgTuple0.value
                final override def plus2(x: zsg.ZTuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4], y: ZsgTuple0): Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4] =
                    Tuple4(_1 = x.i1 , _2 = x.i2 , _3 = x.i3 , _4 = x.i4)
        }
}
