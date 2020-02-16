package asuna.scala_tuple.tuple_support
import asuna.Plus8
import asuna.support.heterogeneous._
trait PlusToTuple_10_8 {
  final def plusWithTypeParameter10[
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X1_C9,
    X1_C10,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8,
    X2_C9,
    X2_C10,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X3_C8,
    X3_C9,
    X3_C10,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X4_C8,
    X4_C9,
    X4_C10,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X5_C8,
    X5_C9,
    X5_C10,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7,
    X6_C8,
    X6_C9,
    X6_C10,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X7_C7,
    X7_C8,
    X7_C9,
    X7_C10,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4,
    X8_C5,
    X8_C6,
    X8_C7,
    X8_C8,
    X8_C9,
    X8_C10,
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    Y8
  ]: Plus8[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
    (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10),
    (X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10),
    (X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10),
    (X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10),
    (X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10),
    (X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10),
    (X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10),
    Y1,
    Y2,
    Y3,
    Y4,
    Y5,
    Y6,
    Y7,
    Y8,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10),
    (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10),
    (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10),
    (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10),
    (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10),
    (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10),
    (Y8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10)
  ] =
    new Plus8[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
      (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10),
      (X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10),
      (X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10),
      (X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10),
      (X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10),
      (X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10),
      (X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10),
      Y1,
      Y2,
      Y3,
      Y4,
      Y5,
      Y6,
      Y7,
      Y8,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10),
      (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10),
      (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10),
      (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10),
      (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10),
      (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10),
      (Y8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10)
    ] {
      final override def takeHead1(
        z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10)
      ): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10)): Y1 = z._1
      final override def plus1(
        x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10),
        y: Y1
      ): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead2(
        z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)
      ): (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10)): Y2 = z._1
      final override def plus2(
        x: (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10),
        y: Y2
      ): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead3(
        z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10)
      ): (X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail3(z: (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10)): Y3 = z._1
      final override def plus3(
        x: (X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10),
        y: Y3
      ): (Y3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8, X3_C9, X3_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead4(
        z: (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10)
      ): (X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail4(z: (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10)): Y4 = z._1
      final override def plus4(
        x: (X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10),
        y: Y4
      ): (Y4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8, X4_C9, X4_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead5(
        z: (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10)
      ): (X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail5(z: (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10)): Y5 = z._1
      final override def plus5(
        x: (X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10),
        y: Y5
      ): (Y5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8, X5_C9, X5_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead6(
        z: (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10)
      ): (X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail6(z: (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10)): Y6 = z._1
      final override def plus6(
        x: (X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10),
        y: Y6
      ): (Y6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8, X6_C9, X6_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead7(
        z: (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10)
      ): (X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail7(z: (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10)): Y7 = z._1
      final override def plus7(
        x: (X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10),
        y: Y7
      ): (Y7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8, X7_C9, X7_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
      final override def takeHead8(
        z: (Y8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10)
      ): (X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11)
      final override def takeTail8(z: (Y8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10)): Y8 = z._1
      final override def plus8(
        x: (X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10),
        y: Y8
      ): (Y8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8, X8_C9, X8_C10) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10)
    }
}
