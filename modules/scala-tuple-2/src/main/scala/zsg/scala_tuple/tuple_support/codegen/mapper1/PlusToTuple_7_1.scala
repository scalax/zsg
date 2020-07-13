package zsg.scala_tuple.tuple_support
import zsg.Plus1
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_7_1 {
        final def plus1WithTypeParameter7[
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7
        ]: Plus1[
            zsg.ZTuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            ZsgTuple0,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]
        ] = new Plus1[
            zsg.ZTuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            ZsgTuple0,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]
        ] {
                final override def takeHead1(z: Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]): zsg.ZTuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7] =
                    new zsg.ZTuple7(i1 = z._1 , i2 = z._2 , i3 = z._3 , i4 = z._4 , i5 = z._5 , i6 = z._6 , i7 = z._7)
                final override def takeTail1(z: Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7]): ZsgTuple0 = ZsgTuple0.value
                final override def plus1(x: zsg.ZTuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7], y: ZsgTuple0): Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7] =
                    Tuple7(_1 = x.i1 , _2 = x.i2 , _3 = x.i3 , _4 = x.i4 , _5 = x.i5 , _6 = x.i6 , _7 = x.i7)
        }
}
