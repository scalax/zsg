package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait HListPlus_4_1 {
final def plusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
, Y1
, Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
] {
final override def takeHead1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil = z.tail
final override def takeTail1(z: Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil): Y1 = z.head
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil, y: Y1): Y1 ::  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil = x.::(y)
}
}
