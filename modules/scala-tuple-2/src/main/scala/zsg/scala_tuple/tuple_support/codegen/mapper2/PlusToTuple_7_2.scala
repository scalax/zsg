package zsg.scala_tuple.tuple_support
import zsg.Plus2
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_7_2 {
  final def plus2WithTypeParameter7[
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7
  ]: Plus2[
    zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    ZsgTuple0,
    ZsgTuple0,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7]
  ] = new Plus2[
    zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    ZsgTuple0,
    ZsgTuple0,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7]
  ] {
    final override def takeHead1(
      z: Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7]
    ): zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail1(z: Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus1(
      x: zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
      y: ZsgTuple0
    ): Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
    final override def takeHead2(
      z: Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7]
    ): zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail2(z: Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus2(
      x: zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
      y: ZsgTuple0
    ): Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
  }
}
