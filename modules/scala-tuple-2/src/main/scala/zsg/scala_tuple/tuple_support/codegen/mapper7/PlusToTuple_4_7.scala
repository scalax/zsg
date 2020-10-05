package zsg.scala_tuple.tuple_support
import zsg.Plus7
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_4_7 {
  final def plus7WithTypeParameter4[
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus6_X1,
    Plus6_X2,
    Plus6_X3,
    Plus6_X4,
    Plus7_X1,
    Plus7_X2,
    Plus7_X3,
    Plus7_X4
  ]: Plus7[
    zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
    zsg.ZTuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4],
    zsg.ZTuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4],
    zsg.ZTuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4],
    zsg.ZTuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4],
    zsg.ZTuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4],
    zsg.ZTuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4],
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
    Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4],
    Tuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4],
    Tuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4],
    Tuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4],
    Tuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4],
    Tuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4]
  ] =
    new Plus7[
      zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
      zsg.ZTuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4],
      zsg.ZTuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4],
      zsg.ZTuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4],
      zsg.ZTuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4],
      zsg.ZTuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4],
      zsg.ZTuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4],
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4],
      Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4],
      Tuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4],
      Tuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4],
      Tuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4],
      Tuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4],
      Tuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4]
    ] {
      final override def takeHead1(z: Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4]): zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail1(z: Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus1(x: zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4], y: ZsgTuple0): Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead2(z: Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4]): zsg.ZTuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail2(z: Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus2(x: zsg.ZTuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4], y: ZsgTuple0): Tuple4[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead3(z: Tuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4]): zsg.ZTuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail3(z: Tuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus3(x: zsg.ZTuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4], y: ZsgTuple0): Tuple4[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead4(z: Tuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4]): zsg.ZTuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail4(z: Tuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus4(x: zsg.ZTuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4], y: ZsgTuple0): Tuple4[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead5(z: Tuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4]): zsg.ZTuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail5(z: Tuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus5(x: zsg.ZTuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4], y: ZsgTuple0): Tuple4[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead6(z: Tuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4]): zsg.ZTuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail6(z: Tuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus6(x: zsg.ZTuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4], y: ZsgTuple0): Tuple4[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
      final override def takeHead7(z: Tuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4]): zsg.ZTuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4] =
        new zsg.ZTuple4(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4)
      final override def takeTail7(z: Tuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4]): ZsgTuple0 = ZsgTuple0.value
      final override def plus7(x: zsg.ZTuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4], y: ZsgTuple0): Tuple4[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4] =
        Tuple4(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4)
    }
}
