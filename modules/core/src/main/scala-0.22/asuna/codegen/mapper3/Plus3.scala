package asuna
abstract class Plus3[X1  , X2  , X3   , Y1  , Y2  , Y3   , Z1  , Z2  , Z3 ] {
def takeHead1(z: Z1): X1
def takeTail1(z: Z1): Y1
def plus1(x: X1, y: Y1): Z1
def takeHead2(z: Z2): X2
def takeTail2(z: Z2): Y2
def plus2(x: X2, y: Y2): Z2
def takeHead3(z: Z3): X3
def takeTail3(z: Z3): Y3
def plus3(x: X3, y: Y3): Z3
}
object Plus3 {
final inline def cachePlusWithTypeParameter0[Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, Y1  , Y2  , Y3
, AsunaTuple1[Y1]  , AsunaTuple1[Y2]  , AsunaTuple1[Y3]
] = new Plus3[
AsunaTuple0  , AsunaTuple0  , AsunaTuple0
, Y1  , Y2  , Y3
, AsunaTuple1[Y1]  , AsunaTuple1[Y2]  , AsunaTuple1[Y3]
] {
final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
}
final inline def cachePlusWithTypeParameter1[X1  , X2  , X3
, Y1  , Y2  , Y3  ]:
Plus3[
X1  , X2  , X3
, Y1  , Y2  , Y3
, AsunaTuple2[Y1, X1]  , AsunaTuple2[Y2, X2]  , AsunaTuple2[Y3, X3]
] = new Plus3[
X1  , X2  , X3
, Y1  , Y2  , Y3
, AsunaTuple2[Y1, X1]  , AsunaTuple2[Y2, X2]  , AsunaTuple2[Y3, X3]
] {
final override def takeHead1(z: AsunaTuple2[Y1, X1]): X1 = z.i2
final override def takeTail1(z: AsunaTuple2[Y1, X1]): Y1 = z.i1
final override def plus1(x: X1, y: Y1): AsunaTuple2[Y1, X1] = new AsunaTuple2(y, x)
final override def takeHead2(z: AsunaTuple2[Y2, X2]): X2 = z.i2
final override def takeTail2(z: AsunaTuple2[Y2, X2]): Y2 = z.i1
final override def plus2(x: X2, y: Y2): AsunaTuple2[Y2, X2] = new AsunaTuple2(y, x)
final override def takeHead3(z: AsunaTuple2[Y3, X3]): X3 = z.i2
final override def takeTail3(z: AsunaTuple2[Y3, X3]): Y3 = z.i1
final override def plus3(x: X3, y: Y3): AsunaTuple2[Y3, X3] = new AsunaTuple2(y, x)
}
}
