package zsg.scala_tuple.tuple_support
import zsg.Plus6
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_1_6 {
  final def plus6WithTypeParameter1Dynamic[Y1, Y2, Y3, Y4, Y5, Y6]: Plus6[
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Tuple1[Y1],
    Tuple1[Y2],
    Tuple1[Y3],
    Tuple1[Y4],
    Tuple1[Y5],
    Tuple1[Y6]
  ] =
    new Plus6[
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Tuple1[Y1],
      Tuple1[Y2],
      Tuple1[Y3],
      Tuple1[Y4],
      Tuple1[Y5],
      Tuple1[Y6]
    ] {
      final override def takeHead1(z: Tuple1[Y1]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail1(z: Tuple1[Y1]): Y1           = z._1
      final override def plus1(x: ZsgTuple0, y: Y1): Tuple1[Y1] = Tuple1(y)
      final override def takeHead2(z: Tuple1[Y2]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail2(z: Tuple1[Y2]): Y2           = z._1
      final override def plus2(x: ZsgTuple0, y: Y2): Tuple1[Y2] = Tuple1(y)
      final override def takeHead3(z: Tuple1[Y3]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail3(z: Tuple1[Y3]): Y3           = z._1
      final override def plus3(x: ZsgTuple0, y: Y3): Tuple1[Y3] = Tuple1(y)
      final override def takeHead4(z: Tuple1[Y4]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail4(z: Tuple1[Y4]): Y4           = z._1
      final override def plus4(x: ZsgTuple0, y: Y4): Tuple1[Y4] = Tuple1(y)
      final override def takeHead5(z: Tuple1[Y5]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail5(z: Tuple1[Y5]): Y5           = z._1
      final override def plus5(x: ZsgTuple0, y: Y5): Tuple1[Y5] = Tuple1(y)
      final override def takeHead6(z: Tuple1[Y6]): ZsgTuple0    = ZsgTuple0.value
      final override def takeTail6(z: Tuple1[Y6]): Y6           = z._1
      final override def plus6(x: ZsgTuple0, y: Y6): Tuple1[Y6] = Tuple1(y)
    }
  final val plus6WithTypeParameter1Strict: Plus6[
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Tuple1[Any],
    Tuple1[Any],
    Tuple1[Any],
    Tuple1[Any],
    Tuple1[Any],
    Tuple1[Any]
  ] = plus6WithTypeParameter1Dynamic[Any, Any, Any, Any, Any, Any]
  final def plus6WithTypeParameter1[Y1, Y2, Y3, Y4, Y5, Y6]: Plus6[
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    ZsgTuple0,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Tuple1[Y1],
    Tuple1[Y2],
    Tuple1[Y3],
    Tuple1[Y4],
    Tuple1[Y5],
    Tuple1[Y6]
  ] =
    plus6WithTypeParameter1Strict.asInstanceOf[Plus6[
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      ZsgTuple0,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Tuple1[Y1],
      Tuple1[Y2],
      Tuple1[Y3],
      Tuple1[Y4],
      Tuple1[Y5],
      Tuple1[Y6]
    ]]
}
