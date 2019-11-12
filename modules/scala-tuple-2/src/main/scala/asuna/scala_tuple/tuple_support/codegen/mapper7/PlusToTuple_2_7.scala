package asuna.scala_tuple.tuple_support
import asuna.Plus7
import asuna.support.heterogeneous._
trait PlusToTuple_2_7 {
  final def plusWithTypeParameter2[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2, X5_C1, X5_C2, X6_C1, X6_C2, X7_C1, X7_C2, Y1, Y2, Y3, Y4, Y5, Y6, Y7]: Plus7[
    X1_C1 :: X1_C2 :: HNil,
    X2_C1 :: X2_C2 :: HNil,
    X3_C1 :: X3_C2 :: HNil,
    X4_C1 :: X4_C2 :: HNil,
    X5_C1 :: X5_C2 :: HNil,
    X6_C1 :: X6_C2 :: HNil,
    X7_C1 :: X7_C2 :: HNil,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    (Y1, X1_C1, X1_C2),
    (Y2, X2_C1, X2_C2),
    (Y3, X3_C1, X3_C2),
    (Y4, X4_C1, X4_C2),
    (Y5, X5_C1, X5_C2),
    (Y6, X6_C1, X6_C2),
    (Y7, X7_C1, X7_C2)
  ] =
    new Plus7[
      X1_C1 :: X1_C2 :: HNil,
      X2_C1 :: X2_C2 :: HNil,
      X3_C1 :: X3_C2 :: HNil,
      X4_C1 :: X4_C2 :: HNil,
      X5_C1 :: X5_C2 :: HNil,
      X6_C1 :: X6_C2 :: HNil,
      X7_C1 :: X7_C2 :: HNil,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Y7,
      (Y1, X1_C1, X1_C2),
      (Y2, X2_C1, X2_C2),
      (Y3, X3_C1, X3_C2),
      (Y4, X4_C1, X4_C2),
      (Y5, X5_C1, X5_C2),
      (Y6, X6_C1, X6_C2),
      (Y7, X7_C1, X7_C2)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2)): X1_C1 :: X1_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail1(z: (Y1, X1_C1, X1_C2)): Y1 = z._1
      final override def plus1(x: X1_C1 :: X1_C2 :: HNil, y: Y1): (Y1, X1_C1, X1_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead2(z: (Y2, X2_C1, X2_C2)): X2_C1 :: X2_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail2(z: (Y2, X2_C1, X2_C2)): Y2 = z._1
      final override def plus2(x: X2_C1 :: X2_C2 :: HNil, y: Y2): (Y2, X2_C1, X2_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead3(z: (Y3, X3_C1, X3_C2)): X3_C1 :: X3_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail3(z: (Y3, X3_C1, X3_C2)): Y3 = z._1
      final override def plus3(x: X3_C1 :: X3_C2 :: HNil, y: Y3): (Y3, X3_C1, X3_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead4(z: (Y4, X4_C1, X4_C2)): X4_C1 :: X4_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail4(z: (Y4, X4_C1, X4_C2)): Y4 = z._1
      final override def plus4(x: X4_C1 :: X4_C2 :: HNil, y: Y4): (Y4, X4_C1, X4_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead5(z: (Y5, X5_C1, X5_C2)): X5_C1 :: X5_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail5(z: (Y5, X5_C1, X5_C2)): Y5 = z._1
      final override def plus5(x: X5_C1 :: X5_C2 :: HNil, y: Y5): (Y5, X5_C1, X5_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead6(z: (Y6, X6_C1, X6_C2)): X6_C1 :: X6_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail6(z: (Y6, X6_C1, X6_C2)): Y6 = z._1
      final override def plus6(x: X6_C1 :: X6_C2 :: HNil, y: Y6): (Y6, X6_C1, X6_C2) =
        (y, x.head, x.tail.head)
      final override def takeHead7(z: (Y7, X7_C1, X7_C2)): X7_C1 :: X7_C2 :: HNil =
        z._2 :: z._3 :: HNil
      final override def takeTail7(z: (Y7, X7_C1, X7_C2)): Y7 = z._1
      final override def plus7(x: X7_C1 :: X7_C2 :: HNil, y: Y7): (Y7, X7_C1, X7_C2) =
        (y, x.head, x.tail.head)
    }
}