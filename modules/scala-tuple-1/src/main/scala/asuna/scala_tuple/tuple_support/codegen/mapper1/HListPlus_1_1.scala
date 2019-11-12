package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait HListPlus_1_1 {
  final def plusWithTypeParameter1[X1_C1, Y1]: Plus1[
    X1_C1,
    Y1,
    Y1 :: X1_C1 :: HNil
  ] =
    new Plus1[
      X1_C1,
      Y1,
      Y1 :: X1_C1 :: HNil
    ] {
      final override def takeHead1(z: Y1 :: X1_C1 :: HNil): X1_C1    = z.tail.head
      final override def takeTail1(z: Y1 :: X1_C1 :: HNil): Y1       = z.head
      final override def plus1(x: X1_C1, y: Y1): Y1 :: X1_C1 :: HNil = y :: x :: HNil
    }
}
