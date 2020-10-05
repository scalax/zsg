package zsg.scala_tuple.tuple_support
import zsg.Plus7
import zsg.ZsgTuple0
import zsg.BuildContent
trait PlusToTuple_2_7 {
  final def plus7WithTypeParameter2Dynamic[
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7
  ]: Plus7[
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Tuple2[Y1, X1],
    Tuple2[Y2, X2],
    Tuple2[Y3, X3],
    Tuple2[Y4, X4],
    Tuple2[Y5, X5],
    Tuple2[Y6, X6],
    Tuple2[Y7, X7]
  ] = new Plus7[
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Tuple2[Y1, X1],
    Tuple2[Y2, X2],
    Tuple2[Y3, X3],
    Tuple2[Y4, X4],
    Tuple2[Y5, X5],
    Tuple2[Y6, X6],
    Tuple2[Y7, X7]
  ] {
    final override def takeHead1(z: Tuple2[Y1, X1]): Y1    = z._1
    final override def takeTail1(z: Tuple2[Y1, X1]): X1    = z._2
    final override def plus1(y: Y1, x: X1): Tuple2[Y1, X1] = Tuple2(y, x)
    final override def takeHead2(z: Tuple2[Y2, X2]): Y2    = z._1
    final override def takeTail2(z: Tuple2[Y2, X2]): X2    = z._2
    final override def plus2(y: Y2, x: X2): Tuple2[Y2, X2] = Tuple2(y, x)
    final override def takeHead3(z: Tuple2[Y3, X3]): Y3    = z._1
    final override def takeTail3(z: Tuple2[Y3, X3]): X3    = z._2
    final override def plus3(y: Y3, x: X3): Tuple2[Y3, X3] = Tuple2(y, x)
    final override def takeHead4(z: Tuple2[Y4, X4]): Y4    = z._1
    final override def takeTail4(z: Tuple2[Y4, X4]): X4    = z._2
    final override def plus4(y: Y4, x: X4): Tuple2[Y4, X4] = Tuple2(y, x)
    final override def takeHead5(z: Tuple2[Y5, X5]): Y5    = z._1
    final override def takeTail5(z: Tuple2[Y5, X5]): X5    = z._2
    final override def plus5(y: Y5, x: X5): Tuple2[Y5, X5] = Tuple2(y, x)
    final override def takeHead6(z: Tuple2[Y6, X6]): Y6    = z._1
    final override def takeTail6(z: Tuple2[Y6, X6]): X6    = z._2
    final override def plus6(y: Y6, x: X6): Tuple2[Y6, X6] = Tuple2(y, x)
    final override def takeHead7(z: Tuple2[Y7, X7]): Y7    = z._1
    final override def takeTail7(z: Tuple2[Y7, X7]): X7    = z._2
    final override def plus7(y: Y7, x: X7): Tuple2[Y7, X7] = Tuple2(y, x)
  }
  final val plus7WithTypeParameter2Strict: Plus7[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Tuple2[Any, Any],
    Tuple2[Any, Any],
    Tuple2[Any, Any],
    Tuple2[Any, Any],
    Tuple2[Any, Any],
    Tuple2[Any, Any],
    Tuple2[Any, Any]
  ] = plus7WithTypeParameter2Dynamic[
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any,
    Any
  ]
  final def plus7WithTypeParameter2[
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7
  ]: Plus7[
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Tuple2[Y1, X1],
    Tuple2[Y2, X2],
    Tuple2[Y3, X3],
    Tuple2[Y4, X4],
    Tuple2[Y5, X5],
    Tuple2[Y6, X6],
    Tuple2[Y7, X7]
  ] = plus7WithTypeParameter2Strict.asInstanceOf[Plus7[
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    X1,
    X2,
    X3,
    X4,
    X5,
    X6,
    X7,
    Tuple2[Y1, X1],
    Tuple2[Y2, X2],
    Tuple2[Y3, X3],
    Tuple2[Y4, X4],
    Tuple2[Y5, X5],
    Tuple2[Y6, X6],
    Tuple2[Y7, X7]
  ]]
}
