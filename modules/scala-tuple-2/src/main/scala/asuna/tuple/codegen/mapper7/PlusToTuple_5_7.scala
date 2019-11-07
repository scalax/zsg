package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_5_7 {
  final def plusWithTypeParameter5[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7
  ]: Plus7[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: HNil,
    X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: HNil,
    X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: HNil,
    X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: HNil,
    X6_C1 :: X6_C2 :: X6_C3 :: X6_C4 :: X6_C5 :: HNil,
    X7_C1 :: X7_C2 :: X7_C3 :: X7_C4 :: X7_C5 :: HNil,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5),
    (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5),
    (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5),
    (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5),
    (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5),
    (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5)
  ] =
    new Plus7[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: HNil,
      X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: HNil,
      X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: HNil,
      X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: HNil,
      X6_C1 :: X6_C2 :: X6_C3 :: X6_C4 :: X6_C5 :: HNil,
      X7_C1 :: X7_C2 :: X7_C3 :: X7_C4 :: X7_C5 :: HNil,
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Y7,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5),
      (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5),
      (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5),
      (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5),
      (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5),
      (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): Y1 = z._1
      final override def plus1(x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil, y: Y1): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)): X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5)): Y2 = z._1
      final override def plus2(x: X2_C1 :: X2_C2 :: X2_C3 :: X2_C4 :: X2_C5 :: HNil, y: Y2): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead3(z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5)): X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail3(z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5)): Y3 = z._1
      final override def plus3(x: X3_C1 :: X3_C2 :: X3_C3 :: X3_C4 :: X3_C5 :: HNil, y: Y3): (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead4(z: (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5)): X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail4(z: (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5)): Y4 = z._1
      final override def plus4(x: X4_C1 :: X4_C2 :: X4_C3 :: X4_C4 :: X4_C5 :: HNil, y: Y4): (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead5(z: (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5)): X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail5(z: (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5)): Y5 = z._1
      final override def plus5(x: X5_C1 :: X5_C2 :: X5_C3 :: X5_C4 :: X5_C5 :: HNil, y: Y5): (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead6(z: (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5)): X6_C1 :: X6_C2 :: X6_C3 :: X6_C4 :: X6_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail6(z: (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5)): Y6 = z._1
      final override def plus6(x: X6_C1 :: X6_C2 :: X6_C3 :: X6_C4 :: X6_C5 :: HNil, y: Y6): (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
      final override def takeHead7(z: (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5)): X7_C1 :: X7_C2 :: X7_C3 :: X7_C4 :: X7_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail7(z: (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5)): Y7 = z._1
      final override def plus7(x: X7_C1 :: X7_C2 :: X7_C3 :: X7_C4 :: X7_C5 :: HNil, y: Y7): (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
    }
}
