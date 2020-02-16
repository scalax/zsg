package asuna
abstract class Plus1[X1   , Y1   , Z1 ] {
def takeHead1(z: Z1): X1
def takeTail1(z: Z1): Y1
def plus1(x: X1, y: Y1): Z1
}
object Plus1 {
final inline def cachePlusWithTypeParameter0[X1_C1
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
final inline def cachePlusWithTypeParameter1[X1_C1
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
final inline def cachePlusWithTypeParameter2[X1_C1  , X1_C2
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
final inline def cachePlusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3
, Y1  ]:
Plus1[
AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ]
, Y1
, AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]
] = new Plus1[
AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ]
, Y1
, AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]
] {
final override def takeHead1(z: AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]): AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ] = new AsunaTuple3(z.i2  , z.i3  , z.i4 )
final override def takeTail1(z: AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ], y: Y1): AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ] = new AsunaTuple4(y  , x.i1  , x.i2  , x.i3 )
}
final inline def cachePlusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4
, Y1  ]:
Plus1[
AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
, Y1
, AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
] = new Plus1[
AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
, Y1
, AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
] {
final override def takeHead1(z: AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]): AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ] = new AsunaTuple4(z.i2  , z.i3  , z.i4  , z.i5 )
final override def takeTail1(z: AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ], y: Y1): AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ] = new AsunaTuple5(y  , x.i1  , x.i2  , x.i3  , x.i4 )
}
final inline def cachePlusWithTypeParameter5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, Y1  ]:
Plus1[
AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
, Y1
, AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
] = new Plus1[
AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
, Y1
, AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
] {
final override def takeHead1(z: AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]): AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ] = new AsunaTuple5(z.i2  , z.i3  , z.i4  , z.i5  , z.i6 )
final override def takeTail1(z: AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ], y: Y1): AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ] = new AsunaTuple6(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5 )
}
final inline def cachePlusWithTypeParameter6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, Y1  ]:
Plus1[
AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
, Y1
, AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
] = new Plus1[
AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
, Y1
, AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
] {
final override def takeHead1(z: AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]): AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ] = new AsunaTuple6(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7 )
final override def takeTail1(z: AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ], y: Y1): AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ] = new AsunaTuple7(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6 )
}
final inline def cachePlusWithTypeParameter7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, Y1  ]:
Plus1[
AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
, Y1
, AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
] = new Plus1[
AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
, Y1
, AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
] {
final override def takeHead1(z: AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]): AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ] = new AsunaTuple7(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7  , z.i8 )
final override def takeTail1(z: AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ], y: Y1): AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ] = new AsunaTuple8(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6  , x.i7 )
}
}
