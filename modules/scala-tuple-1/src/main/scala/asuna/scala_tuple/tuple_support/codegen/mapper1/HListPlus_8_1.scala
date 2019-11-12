package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait HListPlus_8_1 {
  final def plusWithTypeParameter8[X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, Y1]: Plus1[
    X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
    Y1,
    Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil
  ] =
    new Plus1[
      X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
      Y1,
      Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil
    ] {
      final override def takeHead1(
        z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil
      ): X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil                                         = z.tail
      final override def takeTail1(z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil): Y1 = z.head
      final override def plus1(
        x: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil,
        y: Y1
      ): Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: X1_C4 :: X1_C5 :: X1_C6 :: X1_C7 :: X1_C8 :: HNil = x.::(y)
    }
}
