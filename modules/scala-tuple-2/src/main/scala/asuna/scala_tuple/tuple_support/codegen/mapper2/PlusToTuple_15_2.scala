package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait PlusToTuple_15_2 {
  final def plusWithTypeParameter15[
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
    X1_C11,
    X1_C12,
    X1_C13,
    X1_C14,
    X1_C15,
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
    X2_C11,
    X2_C12,
    X2_C13,
    X2_C14,
    X2_C15,
    Y1,
    Y2
  ]: Plus2[
    (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15),
    (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15),
    Y1,
    Y2,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15),
    (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15)
  ] =
    new Plus2[
      (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15),
      (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15),
      Y1,
      Y2,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15),
      (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15)
    ] {
      final override def takeHead1(
        z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15)
      ): (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11, z._12, z._13, z._14, z._15, z._16)
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15)): Y1 = z._1
      final override def plus1(
        x: (X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15),
        y: Y1
      ): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X1_C9, X1_C10, X1_C11, X1_C12, X1_C13, X1_C14, X1_C15) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10, x._11, x._12, x._13, x._14, x._15)
      final override def takeHead2(
        z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15)
      ): (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15) =
        (z._2, z._3, z._4, z._5, z._6, z._7, z._8, z._9, z._10, z._11, z._12, z._13, z._14, z._15, z._16)
      final override def takeTail2(z: (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15)): Y2 = z._1
      final override def plus2(
        x: (X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15),
        y: Y2
      ): (Y2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8, X2_C9, X2_C10, X2_C11, X2_C12, X2_C13, X2_C14, X2_C15) =
        (y, x._1, x._2, x._3, x._4, x._5, x._6, x._7, x._8, x._9, x._10, x._11, x._12, x._13, x._14, x._15)
    }
}
