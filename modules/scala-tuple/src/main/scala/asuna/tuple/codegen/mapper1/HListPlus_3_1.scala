package asuna
import asuna.support.heterogeneous._
trait HListPlus_3_1 {
final def plusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
] {
final override def takeHead1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil):  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil = z.tail
final override def takeTail1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil): Y1 = z.head
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil, y: Y1): Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil = x.::(y)
}
}
