package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.support.heterogeneous._
trait PlusToTuple_3_3 {
  final def plusWithTypeParameter3[X1_C1, X1_C2, X1_C3, X2_C1, X2_C2, X2_C3, X3_C1, X3_C2, X3_C3, Y1, Y2, Y3]: Plus3[
    (X1_C1, X1_C2, X1_C3),
    (X2_C1, X2_C2, X2_C3),
    (X3_C1, X3_C2, X3_C3),
    Y1,
    Y2,
    Y3,
    (Y1, X1_C1, X1_C2, X1_C3),
    (Y2, X2_C1, X2_C2, X2_C3),
    (Y3, X3_C1, X3_C2, X3_C3)
  ] =
    new Plus3[
      (X1_C1, X1_C2, X1_C3),
      (X2_C1, X2_C2, X2_C3),
      (X3_C1, X3_C2, X3_C3),
      Y1,
      Y2,
      Y3,
      (Y1, X1_C1, X1_C2, X1_C3),
      (Y2, X2_C1, X2_C2, X2_C3),
      (Y3, X3_C1, X3_C2, X3_C3)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3)): (X1_C1, X1_C2, X1_C3) =
        (z._2, z._3, z._4)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3)): Y1 = z._1
      final override def plus1(x: (X1_C1, X1_C2, X1_C3), y: Y1): (Y1, X1_C1, X1_C2, X1_C3) =
        (y, x._1, x._2, x._3)
      final override def takeHead2(z: (Y2, X2_C1, X2_C2, X2_C3)): (X2_C1, X2_C2, X2_C3) =
        (z._2, z._3, z._4)
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3)): Y2 = z._1
      final override def plus2(x: (X2_C1, X2_C2, X2_C3), y: Y2): (Y2, X2_C1, X2_C2, X2_C3) =
        (y, x._1, x._2, x._3)
      final override def takeHead3(z: (Y3, X3_C1, X3_C2, X3_C3)): (X3_C1, X3_C2, X3_C3) =
        (z._2, z._3, z._4)
      final override def takeTail3(z: (Y3, X3_C1, X3_C2, X3_C3)): Y3 = z._1
      final override def plus3(x: (X3_C1, X3_C2, X3_C3), y: Y3): (Y3, X3_C1, X3_C2, X3_C3) =
        (y, x._1, x._2, x._3)
    }
}
