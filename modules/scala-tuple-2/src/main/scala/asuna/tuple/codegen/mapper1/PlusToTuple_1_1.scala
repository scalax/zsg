package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_1_1 {
final def plusWithTypeParameter1[X1_C1
, Y1  ]:
Plus1[
X1_C1
, Y1
, (Y1 , X1_C1)
] = new Plus1[
X1_C1
, Y1
, (Y1 , X1_C1)
] {
final override def takeHead1(z: (Y1 , X1_C1)): X1_C1 = z._2
final override def takeTail1(z: (Y1 , X1_C1)): Y1 = z._1
final override def plus1(x: X1_C1, y: Y1): (Y1 , X1_C1) = (y, x)
}
}
