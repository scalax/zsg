package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_1_2 {
final def plusWithTypeParameter1[X1_C1  , X2_C1
, Y1  , Y2  ]:
Plus2[
X1_C1  , X2_C1
, Y1  , Y2
, (Y1 , X1_C1)  , (Y2 , X2_C1)
] = new Plus2[
X1_C1  , X2_C1
, Y1  , Y2
, (Y1 , X1_C1)  , (Y2 , X2_C1)
] {
final override def takeHead1(z: (Y1 , X1_C1)): X1_C1 = z._2
final override def takeTail1(z: (Y1 , X1_C1)): Y1 = z._1
final override def plus1(x: X1_C1, y: Y1): (Y1 , X1_C1) = (y, x)
final override def takeHead2(z: (Y2 , X2_C1)): X2_C1 = z._2
final override def takeTail2(z: (Y2 , X2_C1)): Y2 = z._1
final override def plus2(x: X2_C1, y: Y2): (Y2 , X2_C1) = (y, x)
}
}
