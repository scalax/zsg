package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_4_1 {
final def plusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  HNil
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head )
}
}
