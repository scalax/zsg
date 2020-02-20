package asuna
abstract class Plus1[X1   , Y1   , Z1 ] {
def takeHead1(z: Z1): X1
def takeTail1(z: Z1): Y1
def plus1(x: X1, y: Y1): Z1
}
object Plus1 {
final def cachePlusWithTypeParameter0[X1_C1
, Y1  ]:
Plus1[
AsunaTuple0
, Y1
, AsunaTuple1[Y1]
] = new Plus1[
AsunaTuple0
, Y1
, AsunaTuple1[Y1]
] {
final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
}
final def cachePlusWithTypeParameter1[X1_C1
, Y1  ]:
Plus1[
AsunaTuple1[X1_C1  ]
, Y1
, AsunaTuple2[Y1  , X1_C1  ]
] = new Plus1[
AsunaTuple1[X1_C1  ]
, Y1
, AsunaTuple2[Y1  , X1_C1  ]
] {
final override def takeHead1(z: AsunaTuple2[Y1  , X1_C1  ]): AsunaTuple1[X1_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail1(z: AsunaTuple2[Y1  , X1_C1  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple1[X1_C1  ], y: Y1): AsunaTuple2[Y1  , X1_C1  ] = new AsunaTuple2(y  , x.i1 )
}
final def cachePlusWithTypeParameter2[X1_C1  , X1_C2
, Y1  ]:
Plus1[
AsunaTuple2[X1_C1  , X1_C2  ]
, Y1
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]
] = new Plus1[
AsunaTuple2[X1_C1  , X1_C2  ]
, Y1
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]
] {
final override def takeHead1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): AsunaTuple2[X1_C1  , X1_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple2[X1_C1  , X1_C2  ], y: Y1): AsunaTuple3[Y1  , X1_C1  , X1_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
}
}
