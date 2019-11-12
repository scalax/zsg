package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait PlusToTuple_5_1 {
  final def plusWithTypeParameter5[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, Y1]: Plus1[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil,
    Y1,
    (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)
  ] =
    new Plus1[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil,
      Y1,
      (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)
    ] {
      final override def takeHead1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil =
        z._2 :: z._3 :: z._4 :: z._5 :: z._6 :: HNil
      final override def takeTail1(z: (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5)): Y1 = z._1
      final override def plus1(x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: HNil, y: Y1): (Y1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5) =
        (y, x.head, x.tail.head, x.tail.tail.head, x.tail.tail.tail.head, x.tail.tail.tail.tail.head)
    }
}
