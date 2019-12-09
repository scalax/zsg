package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait PlusToTuple_3_1 {
final def plusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  )
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  HNil.value
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head )
}
}
