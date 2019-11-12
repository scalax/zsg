package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.Plus2
import asuna.support.heterogeneous._
trait HListPlus_3_2 {
  final def plusWithTypeParameter3[X1_C1, X1_C2, X1_C3, X2_C1, X2_C2, X2_C3, Y1, Y2]: Plus2[
    X1_C1 :: X1_C2 :: X1_C3 :: HNil,
    X2_C1 :: X2_C2 :: X2_C3 :: HNil,
    Y1,
    Y2,
    Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: HNil,
    Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: HNil
  ] =
    new Plus2[
      X1_C1 :: X1_C2 :: X1_C3 :: HNil,
      X2_C1 :: X2_C2 :: X2_C3 :: HNil,
      Y1,
      Y2,
      Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: HNil,
      Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: HNil
    ] {
      final override def takeHead1(z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: HNil): X1_C1 :: X1_C2 :: X1_C3 :: HNil    = z.tail
      final override def takeTail1(z: Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: HNil): Y1                                 = z.head
      final override def plus1(x: X1_C1 :: X1_C2 :: X1_C3 :: HNil, y: Y1): Y1 :: X1_C1 :: X1_C2 :: X1_C3 :: HNil = x.::(y)
      final override def takeHead2(z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: HNil): X2_C1 :: X2_C2 :: X2_C3 :: HNil    = z.tail
      final override def takeTail2(z: Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: HNil): Y2                                 = z.head
      final override def plus2(x: X2_C1 :: X2_C2 :: X2_C3 :: HNil, y: Y2): Y2 :: X2_C1 :: X2_C2 :: X2_C3 :: HNil = x.::(y)
    }
}
