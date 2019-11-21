package asuna.scala_tuple.tuple_support
import asuna.Plus2
import asuna.support.heterogeneous._
trait HListPlus_1_2 {
final def plusWithTypeParameter1[X1_C1  , X2_C1
, Y1  , Y2  ]:
Plus2[
X1_C1  , X2_C1
, Y1  , Y2
, Y1 :: X1_C1 :: HNil  , Y2 :: X2_C1 :: HNil
] = new Plus2[
X1_C1  , X2_C1
, Y1  , Y2
, Y1 :: X1_C1 :: HNil  , Y2 :: X2_C1 :: HNil
] {
final override def takeHead1(z: Y1 :: X1_C1 :: HNil): X1_C1 = z.tail.head
final override def takeTail1(z: Y1 :: X1_C1 :: HNil): Y1 = z.head
final override def plus1(x: X1_C1, y: Y1): Y1 :: X1_C1 :: HNil = y :: x :: HNil.value
final override def takeHead2(z: Y2 :: X2_C1 :: HNil): X2_C1 = z.tail.head
final override def takeTail2(z: Y2 :: X2_C1 :: HNil): Y2 = z.head
final override def plus2(x: X2_C1, y: Y2): Y2 :: X2_C1 :: HNil = y :: x :: HNil.value
}
}
