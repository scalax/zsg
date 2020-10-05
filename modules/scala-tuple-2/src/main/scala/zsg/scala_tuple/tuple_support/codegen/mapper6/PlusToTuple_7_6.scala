package zsg.scala_tuple.tuple_support
import zsg.Plus6
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_7_6 {
  final def plus6WithTypeParameter7[
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
    Plus2_X7,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus3_X7,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus4_X6,
    Plus4_X7,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus5_X5,
    Plus5_X6,
    Plus5_X7,
    Plus6_X1,
    Plus6_X2,
    Plus6_X3,
    Plus6_X4,
    Plus6_X5,
    Plus6_X6,
    Plus6_X7
  ]: Plus6[
    zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    zsg.ZTuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7],
    zsg.ZTuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7],
    zsg.ZTuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7],
    zsg.ZTuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7],
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7],
    Tuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7],
    Tuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7],
    Tuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7]
  ] = new Plus6[
    zsg.ZTuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    zsg.ZTuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    zsg.ZTuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7],
    zsg.ZTuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7],
    zsg.ZTuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7],
    zsg.ZTuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7],
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Tuple7[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7],
    Tuple7[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7],
    Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7],
    Tuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7],
    Tuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7],
    Tuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7]
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
    final override def takeHead3(
      z: Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7]
    ): zsg.ZTuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail3(z: Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus3(
      x: zsg.ZTuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7],
      y: ZsgTuple0
    ): Tuple7[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
    final override def takeHead4(
      z: Tuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7]
    ): zsg.ZTuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail4(z: Tuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus4(
      x: zsg.ZTuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7],
      y: ZsgTuple0
    ): Tuple7[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
    final override def takeHead5(
      z: Tuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7]
    ): zsg.ZTuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail5(z: Tuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus5(
      x: zsg.ZTuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7],
      y: ZsgTuple0
    ): Tuple7[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6, Plus5_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
    final override def takeHead6(
      z: Tuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7]
    ): zsg.ZTuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7] =
      new zsg.ZTuple7(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6, i7 = z._7)
    final override def takeTail6(z: Tuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7]): ZsgTuple0 = ZsgTuple0.value
    final override def plus6(
      x: zsg.ZTuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7],
      y: ZsgTuple0
    ): Tuple7[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6, Plus6_X7] =
      Tuple7(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6, _7 = x.i7)
  }
}
