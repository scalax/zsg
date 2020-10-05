package zsg.scala_tuple.tuple_support
import zsg.Plus7
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_6_7 {
  final def plus7WithTypeParameter6[
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus4_X6,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus5_X5,
    Plus5_X6,
    Plus6_X1,
    Plus6_X2,
    Plus6_X3,
    Plus6_X4,
    Plus6_X5,
    Plus6_X6,
    Plus7_X1,
    Plus7_X2,
    Plus7_X3,
    Plus7_X4,
    Plus7_X5,
    Plus7_X6
  ]: Plus7[
    zsg.ZTuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
    zsg.ZTuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
    zsg.ZTuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
    zsg.ZTuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
    zsg.ZTuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6],
    zsg.ZTuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6],
    zsg.ZTuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6],
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
    Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
    Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
    Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
    Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6],
    Tuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6],
    Tuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6]
  ] =
    new Plus7[
      zsg.ZTuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
      zsg.ZTuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
      zsg.ZTuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
      zsg.ZTuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
      zsg.ZTuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6],
      zsg.ZTuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6],
      zsg.ZTuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6],
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
      Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
      Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
      Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
      Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6],
      Tuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6],
      Tuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6]
    ] {
      final override def takeHead1(
        z: Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6]
      ): zsg.ZTuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail1(z: Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus1(
        x: zsg.ZTuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
        y: ZsgTuple0
      ): Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead2(
        z: Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6]
      ): zsg.ZTuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail2(z: Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus2(
        x: zsg.ZTuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
        y: ZsgTuple0
      ): Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead3(
        z: Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6]
      ): zsg.ZTuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail3(z: Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus3(
        x: zsg.ZTuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
        y: ZsgTuple0
      ): Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead4(
        z: Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6]
      ): zsg.ZTuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail4(z: Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus4(
        x: zsg.ZTuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
        y: ZsgTuple0
      ): Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead5(
        z: Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6]
      ): zsg.ZTuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail5(z: Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus5(
        x: zsg.ZTuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6],
        y: ZsgTuple0
      ): Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead6(
        z: Tuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6]
      ): zsg.ZTuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail6(z: Tuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus6(
        x: zsg.ZTuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6],
        y: ZsgTuple0
      ): Tuple6[Plus6_X1, Plus6_X2, Plus6_X3, Plus6_X4, Plus6_X5, Plus6_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
      final override def takeHead7(
        z: Tuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6]
      ): zsg.ZTuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6] =
        new zsg.ZTuple6(i1 = z._1, i2 = z._2, i3 = z._3, i4 = z._4, i5 = z._5, i6 = z._6)
      final override def takeTail7(z: Tuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6]): ZsgTuple0 = ZsgTuple0.value
      final override def plus7(
        x: zsg.ZTuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6],
        y: ZsgTuple0
      ): Tuple6[Plus7_X1, Plus7_X2, Plus7_X3, Plus7_X4, Plus7_X5, Plus7_X6] =
        Tuple6(_1 = x.i1, _2 = x.i2, _3 = x.i3, _4 = x.i4, _5 = x.i5, _6 = x.i6)
    }
}
