package asuna.scala_tuple.tuple_support
import asuna.Plus1
trait PlusToTuple_8_1 {
  final def plusWithTypeParameter8[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, Y1]: Plus1[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8),
    Y1,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8)
  ] =
    new Plus1[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8),
      Y1,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8)): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8)): Y1 = z._1
      final override def plus1(x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8), y: Y1): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8)
    }
}
