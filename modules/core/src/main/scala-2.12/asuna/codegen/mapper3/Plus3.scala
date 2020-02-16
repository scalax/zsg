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
final def cachePlusWithTypeParameter0[X1_C1  , X2_C1  , X3_C1
, Y1  , Y2  , Y3  ]:
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
final def cachePlusWithTypeParameter1[X1_C1
, X2_C1    , X3_C1
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple1[X1_C1  ]
, AsunaTuple1[X2_C1  ]  , AsunaTuple1[X3_C1  ]
, Y1  , Y2  , Y3
, AsunaTuple2[Y1  , X1_C1  ]  , AsunaTuple2[Y2  , X2_C1  ]  , AsunaTuple2[Y3  , X3_C1  ]
] = new Plus3[
AsunaTuple1[X1_C1  ]
, AsunaTuple1[X2_C1  ]  , AsunaTuple1[X3_C1  ]
, Y1  , Y2  , Y3
, AsunaTuple2[Y1  , X1_C1  ]  , AsunaTuple2[Y2  , X2_C1  ]  , AsunaTuple2[Y3  , X3_C1  ]
] {
final override def takeHead1(z: AsunaTuple2[Y1  , X1_C1  ]): AsunaTuple1[X1_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail1(z: AsunaTuple2[Y1  , X1_C1  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple1[X1_C1  ], y: Y1): AsunaTuple2[Y1  , X1_C1  ] = new AsunaTuple2(y  , x.i1 )
final override def takeHead2(z: AsunaTuple2[Y2  , X2_C1  ]): AsunaTuple1[X2_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail2(z: AsunaTuple2[Y2  , X2_C1  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple1[X2_C1  ], y: Y2): AsunaTuple2[Y2  , X2_C1  ] = new AsunaTuple2(y  , x.i1 )
final override def takeHead3(z: AsunaTuple2[Y3  , X3_C1  ]): AsunaTuple1[X3_C1  ] = new AsunaTuple1(z.i2 )
final override def takeTail3(z: AsunaTuple2[Y3  , X3_C1  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple1[X3_C1  ], y: Y3): AsunaTuple2[Y3  , X3_C1  ] = new AsunaTuple2(y  , x.i1 )
}
final def cachePlusWithTypeParameter2[X1_C1  , X1_C2
, X2_C1  , X2_C2    , X3_C1  , X3_C2
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple2[X1_C1  , X1_C2  ]
, AsunaTuple2[X2_C1  , X2_C2  ]  , AsunaTuple2[X3_C1  , X3_C2  ]
, Y1  , Y2  , Y3
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]  , AsunaTuple3[Y2  , X2_C1  , X2_C2  ]  , AsunaTuple3[Y3  , X3_C1  , X3_C2  ]
] = new Plus3[
AsunaTuple2[X1_C1  , X1_C2  ]
, AsunaTuple2[X2_C1  , X2_C2  ]  , AsunaTuple2[X3_C1  , X3_C2  ]
, Y1  , Y2  , Y3
, AsunaTuple3[Y1  , X1_C1  , X1_C2  ]  , AsunaTuple3[Y2  , X2_C1  , X2_C2  ]  , AsunaTuple3[Y3  , X3_C1  , X3_C2  ]
] {
final override def takeHead1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): AsunaTuple2[X1_C1  , X1_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail1(z: AsunaTuple3[Y1  , X1_C1  , X1_C2  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple2[X1_C1  , X1_C2  ], y: Y1): AsunaTuple3[Y1  , X1_C1  , X1_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
final override def takeHead2(z: AsunaTuple3[Y2  , X2_C1  , X2_C2  ]): AsunaTuple2[X2_C1  , X2_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail2(z: AsunaTuple3[Y2  , X2_C1  , X2_C2  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple2[X2_C1  , X2_C2  ], y: Y2): AsunaTuple3[Y2  , X2_C1  , X2_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
final override def takeHead3(z: AsunaTuple3[Y3  , X3_C1  , X3_C2  ]): AsunaTuple2[X3_C1  , X3_C2  ] = new AsunaTuple2(z.i2  , z.i3 )
final override def takeTail3(z: AsunaTuple3[Y3  , X3_C1  , X3_C2  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple2[X3_C1  , X3_C2  ], y: Y3): AsunaTuple3[Y3  , X3_C1  , X3_C2  ] = new AsunaTuple3(y  , x.i1  , x.i2 )
}
final def cachePlusWithTypeParameter3[X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ]
, AsunaTuple3[X2_C1  , X2_C2  , X2_C3  ]  , AsunaTuple3[X3_C1  , X3_C2  , X3_C3  ]
, Y1  , Y2  , Y3
, AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]  , AsunaTuple4[Y2  , X2_C1  , X2_C2  , X2_C3  ]  , AsunaTuple4[Y3  , X3_C1  , X3_C2  , X3_C3  ]
] = new Plus3[
AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ]
, AsunaTuple3[X2_C1  , X2_C2  , X2_C3  ]  , AsunaTuple3[X3_C1  , X3_C2  , X3_C3  ]
, Y1  , Y2  , Y3
, AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]  , AsunaTuple4[Y2  , X2_C1  , X2_C2  , X2_C3  ]  , AsunaTuple4[Y3  , X3_C1  , X3_C2  , X3_C3  ]
] {
final override def takeHead1(z: AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]): AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ] = new AsunaTuple3(z.i2  , z.i3  , z.i4 )
final override def takeTail1(z: AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple3[X1_C1  , X1_C2  , X1_C3  ], y: Y1): AsunaTuple4[Y1  , X1_C1  , X1_C2  , X1_C3  ] = new AsunaTuple4(y  , x.i1  , x.i2  , x.i3 )
final override def takeHead2(z: AsunaTuple4[Y2  , X2_C1  , X2_C2  , X2_C3  ]): AsunaTuple3[X2_C1  , X2_C2  , X2_C3  ] = new AsunaTuple3(z.i2  , z.i3  , z.i4 )
final override def takeTail2(z: AsunaTuple4[Y2  , X2_C1  , X2_C2  , X2_C3  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple3[X2_C1  , X2_C2  , X2_C3  ], y: Y2): AsunaTuple4[Y2  , X2_C1  , X2_C2  , X2_C3  ] = new AsunaTuple4(y  , x.i1  , x.i2  , x.i3 )
final override def takeHead3(z: AsunaTuple4[Y3  , X3_C1  , X3_C2  , X3_C3  ]): AsunaTuple3[X3_C1  , X3_C2  , X3_C3  ] = new AsunaTuple3(z.i2  , z.i3  , z.i4 )
final override def takeTail3(z: AsunaTuple4[Y3  , X3_C1  , X3_C2  , X3_C3  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple3[X3_C1  , X3_C2  , X3_C3  ], y: Y3): AsunaTuple4[Y3  , X3_C1  , X3_C2  , X3_C3  ] = new AsunaTuple4(y  , x.i1  , x.i2  , x.i3 )
}
final def cachePlusWithTypeParameter4[X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
, AsunaTuple4[X2_C1  , X2_C2  , X2_C3  , X2_C4  ]  , AsunaTuple4[X3_C1  , X3_C2  , X3_C3  , X3_C4  ]
, Y1  , Y2  , Y3
, AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]  , AsunaTuple5[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ]  , AsunaTuple5[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ]
] = new Plus3[
AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ]
, AsunaTuple4[X2_C1  , X2_C2  , X2_C3  , X2_C4  ]  , AsunaTuple4[X3_C1  , X3_C2  , X3_C3  , X3_C4  ]
, Y1  , Y2  , Y3
, AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]  , AsunaTuple5[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ]  , AsunaTuple5[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ]
] {
final override def takeHead1(z: AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]): AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ] = new AsunaTuple4(z.i2  , z.i3  , z.i4  , z.i5 )
final override def takeTail1(z: AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple4[X1_C1  , X1_C2  , X1_C3  , X1_C4  ], y: Y1): AsunaTuple5[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  ] = new AsunaTuple5(y  , x.i1  , x.i2  , x.i3  , x.i4 )
final override def takeHead2(z: AsunaTuple5[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ]): AsunaTuple4[X2_C1  , X2_C2  , X2_C3  , X2_C4  ] = new AsunaTuple4(z.i2  , z.i3  , z.i4  , z.i5 )
final override def takeTail2(z: AsunaTuple5[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple4[X2_C1  , X2_C2  , X2_C3  , X2_C4  ], y: Y2): AsunaTuple5[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  ] = new AsunaTuple5(y  , x.i1  , x.i2  , x.i3  , x.i4 )
final override def takeHead3(z: AsunaTuple5[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ]): AsunaTuple4[X3_C1  , X3_C2  , X3_C3  , X3_C4  ] = new AsunaTuple4(z.i2  , z.i3  , z.i4  , z.i5 )
final override def takeTail3(z: AsunaTuple5[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple4[X3_C1  , X3_C2  , X3_C3  , X3_C4  ], y: Y3): AsunaTuple5[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  ] = new AsunaTuple5(y  , x.i1  , x.i2  , x.i3  , x.i4 )
}
final def cachePlusWithTypeParameter5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
, AsunaTuple5[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]  , AsunaTuple5[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]
, Y1  , Y2  , Y3
, AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]  , AsunaTuple6[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]  , AsunaTuple6[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]
] = new Plus3[
AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]
, AsunaTuple5[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]  , AsunaTuple5[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]
, Y1  , Y2  , Y3
, AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]  , AsunaTuple6[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]  , AsunaTuple6[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]
] {
final override def takeHead1(z: AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]): AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ] = new AsunaTuple5(z.i2  , z.i3  , z.i4  , z.i5  , z.i6 )
final override def takeTail1(z: AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple5[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ], y: Y1): AsunaTuple6[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  ] = new AsunaTuple6(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5 )
final override def takeHead2(z: AsunaTuple6[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]): AsunaTuple5[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ] = new AsunaTuple5(z.i2  , z.i3  , z.i4  , z.i5  , z.i6 )
final override def takeTail2(z: AsunaTuple6[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple5[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ], y: Y2): AsunaTuple6[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  ] = new AsunaTuple6(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5 )
final override def takeHead3(z: AsunaTuple6[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]): AsunaTuple5[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ] = new AsunaTuple5(z.i2  , z.i3  , z.i4  , z.i5  , z.i6 )
final override def takeTail3(z: AsunaTuple6[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple5[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ], y: Y3): AsunaTuple6[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  ] = new AsunaTuple6(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5 )
}
final def cachePlusWithTypeParameter6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
, AsunaTuple6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]  , AsunaTuple6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]
, Y1  , Y2  , Y3
, AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]  , AsunaTuple7[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]  , AsunaTuple7[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]
] = new Plus3[
AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]
, AsunaTuple6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]  , AsunaTuple6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]
, Y1  , Y2  , Y3
, AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]  , AsunaTuple7[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]  , AsunaTuple7[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]
] {
final override def takeHead1(z: AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]): AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ] = new AsunaTuple6(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7 )
final override def takeTail1(z: AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple6[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ], y: Y1): AsunaTuple7[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  ] = new AsunaTuple7(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6 )
final override def takeHead2(z: AsunaTuple7[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]): AsunaTuple6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ] = new AsunaTuple6(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7 )
final override def takeTail2(z: AsunaTuple7[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple6[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ], y: Y2): AsunaTuple7[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  ] = new AsunaTuple7(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6 )
final override def takeHead3(z: AsunaTuple7[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]): AsunaTuple6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ] = new AsunaTuple6(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7 )
final override def takeTail3(z: AsunaTuple7[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple6[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ], y: Y3): AsunaTuple7[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  ] = new AsunaTuple7(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6 )
}
final def cachePlusWithTypeParameter7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, Y1  , Y2  , Y3  ]:
Plus3[
AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
, AsunaTuple7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]  , AsunaTuple7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]
, Y1  , Y2  , Y3
, AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]  , AsunaTuple8[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]  , AsunaTuple8[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]
] = new Plus3[
AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]
, AsunaTuple7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]  , AsunaTuple7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]
, Y1  , Y2  , Y3
, AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]  , AsunaTuple8[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]  , AsunaTuple8[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]
] {
final override def takeHead1(z: AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]): AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ] = new AsunaTuple7(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7  , z.i8 )
final override def takeTail1(z: AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ]): Y1 = z.i1
final override def plus1(x: AsunaTuple7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ], y: Y1): AsunaTuple8[Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  ] = new AsunaTuple8(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6  , x.i7 )
final override def takeHead2(z: AsunaTuple8[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]): AsunaTuple7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ] = new AsunaTuple7(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7  , z.i8 )
final override def takeTail2(z: AsunaTuple8[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ]): Y2 = z.i1
final override def plus2(x: AsunaTuple7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ], y: Y2): AsunaTuple8[Y2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  ] = new AsunaTuple8(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6  , x.i7 )
final override def takeHead3(z: AsunaTuple8[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]): AsunaTuple7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ] = new AsunaTuple7(z.i2  , z.i3  , z.i4  , z.i5  , z.i6  , z.i7  , z.i8 )
final override def takeTail3(z: AsunaTuple8[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ]): Y3 = z.i1
final override def plus3(x: AsunaTuple7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ], y: Y3): AsunaTuple8[Y3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  ] = new AsunaTuple8(y  , x.i1  , x.i2  , x.i3  , x.i4  , x.i5  , x.i6  , x.i7 )
}
}
