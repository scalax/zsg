package asuna.scala_tuple.tuple_support
import asuna.Plus3
import asuna.support.heterogeneous._
trait HListPlus_2_3 {
final def plusWithTypeParameter2[X1_C1  , X1_C2
, X2_C1  , X2_C2    , X3_C1  , X3_C2
, Y1  , Y2  , Y3  ]:
Plus3[
X1_C1 ::  X1_C2 ::  HNil
,  X2_C1 ::  X2_C2 ::  HNil  ,  X3_C1 ::  X3_C2 ::  HNil
, Y1  , Y2  , Y3
, Y1 ::  X1_C1 ::  X1_C2 ::  HNil  , Y2 ::  X2_C1 ::  X2_C2 ::  HNil  , Y3 ::  X3_C1 ::  X3_C2 ::  HNil
] = new Plus3[
X1_C1 ::  X1_C2 ::  HNil
,  X2_C1 ::  X2_C2 ::  HNil  ,  X3_C1 ::  X3_C2 ::  HNil
, Y1  , Y2  , Y3
, Y1 ::  X1_C1 ::  X1_C2 ::  HNil  , Y2 ::  X2_C1 ::  X2_C2 ::  HNil  , Y3 ::  X3_C1 ::  X3_C2 ::  HNil
] {
final override def takeHead1(z: Y1 ::  X1_C1 ::  X1_C2 ::  HNil):  X1_C1 ::  X1_C2 ::  HNil = z.tail
final override def takeTail1(z: Y1 ::  X1_C1 ::  X1_C2 ::  HNil): Y1 = z.head
final override def plus1(x:  X1_C1 ::  X1_C2 ::  HNil, y: Y1): Y1 ::  X1_C1 ::  X1_C2 ::  HNil = x.::(y)
final override def takeHead2(z: Y2 ::  X2_C1 ::  X2_C2 ::  HNil):  X2_C1 ::  X2_C2 ::  HNil = z.tail
final override def takeTail2(z: Y2 ::  X2_C1 ::  X2_C2 ::  HNil): Y2 = z.head
final override def plus2(x:  X2_C1 ::  X2_C2 ::  HNil, y: Y2): Y2 ::  X2_C1 ::  X2_C2 ::  HNil = x.::(y)
final override def takeHead3(z: Y3 ::  X3_C1 ::  X3_C2 ::  HNil):  X3_C1 ::  X3_C2 ::  HNil = z.tail
final override def takeTail3(z: Y3 ::  X3_C1 ::  X3_C2 ::  HNil): Y3 = z.head
final override def plus3(x:  X3_C1 ::  X3_C2 ::  HNil, y: Y3): Y3 ::  X3_C1 ::  X3_C2 ::  HNil = x.::(y)
}
}
