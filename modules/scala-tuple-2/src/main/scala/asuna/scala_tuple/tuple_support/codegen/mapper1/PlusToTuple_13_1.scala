package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait PlusToTuple_13_1 {
  final def plusWithTypeParameter13[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, Y1]: Plus1[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13),
    Y1,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13)
  ] =
    new Plus1[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13),
      Y1,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13)
    ] {
      final override def takeHead1(
        z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13)
      ): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11, z._12, z._13, z._14)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13)): Y1 = z._1
      final override def plus1(
        x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13),
        y: Y1
      ): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10, x._11, x._12, x._13)
    }
}
