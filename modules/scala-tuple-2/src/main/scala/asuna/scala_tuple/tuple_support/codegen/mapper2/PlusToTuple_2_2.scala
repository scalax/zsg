package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait PlusToTuple_2_2 {
  final def plusWithTypeParameter2[X1_C1, X1_C2, X2_C1, X2_C2, Y1, Y2]: Plus2[
    X1_C1 :: X1_C2 :: HNil,
    X2_C1 :: X2_C2 :: HNil,
    Y1,
    Y2,
    (Y1, X1_C1, X1_C2),
    (Y2, X2_C1, X2_C2)
  ] =
    new Plus2[
      X1_C1 :: X1_C2 :: HNil,
      X2_C1 :: X2_C2 :: HNil,
      Y1,
      Y2,
      (Y1, X1_C1, X1_C2),
      (Y2, X2_C1, X2_C2)
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
    }
}
