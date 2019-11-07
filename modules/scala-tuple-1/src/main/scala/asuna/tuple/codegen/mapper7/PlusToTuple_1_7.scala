package asuna
import asuna.support.heterogeneous._
trait PlusToTuple_1_7 {
final def plusWithTypeParameter1[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7  ]:
Plus7[
X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7
, (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1)  , (Y4 , X4_C1)  , (Y5 , X5_C1)  , (Y6 , X6_C1)  , (Y7 , X7_C1)
] = new Plus7[
X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1
, Y1  , Y2  , Y3  , Y4  , Y5  , Y6  , Y7
, (Y1 , X1_C1)  , (Y2 , X2_C1)  , (Y3 , X3_C1)  , (Y4 , X4_C1)  , (Y5 , X5_C1)  , (Y6 , X6_C1)  , (Y7 , X7_C1)
] {
final override def takeHead1(z: (Y1 , X1_C1)): X1_C1 = z._2
final override def takeTail1(z: (Y1 , X1_C1)): Y1 = z._1
final override def plus1(x: X1_C1, y: Y1): (Y1 , X1_C1) = (y, x)
final override def takeHead2(z: (Y2 , X2_C1)): X2_C1 = z._2
final override def takeTail2(z: (Y2 , X2_C1)): Y2 = z._1
final override def plus2(x: X2_C1, y: Y2): (Y2 , X2_C1) = (y, x)
final override def takeHead3(z: (Y3 , X3_C1)): X3_C1 = z._2
final override def takeTail3(z: (Y3 , X3_C1)): Y3 = z._1
final override def plus3(x: X3_C1, y: Y3): (Y3 , X3_C1) = (y, x)
final override def takeHead4(z: (Y4 , X4_C1)): X4_C1 = z._2
final override def takeTail4(z: (Y4 , X4_C1)): Y4 = z._1
final override def plus4(x: X4_C1, y: Y4): (Y4 , X4_C1) = (y, x)
final override def takeHead5(z: (Y5 , X5_C1)): X5_C1 = z._2
final override def takeTail5(z: (Y5 , X5_C1)): Y5 = z._1
final override def plus5(x: X5_C1, y: Y5): (Y5 , X5_C1) = (y, x)
final override def takeHead6(z: (Y6 , X6_C1)): X6_C1 = z._2
final override def takeTail6(z: (Y6 , X6_C1)): Y6 = z._1
final override def plus6(x: X6_C1, y: Y6): (Y6 , X6_C1) = (y, x)
final override def takeHead7(z: (Y7 , X7_C1)): X7_C1 = z._2
final override def takeTail7(z: (Y7 , X7_C1)): Y7 = z._1
final override def plus7(x: X7_C1, y: Y7): (Y7 , X7_C1) = (y, x)
}
}
