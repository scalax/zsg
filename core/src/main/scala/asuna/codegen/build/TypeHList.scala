package asuna
class TypeHList1[T1] extends TypeHList {
override type H = T1
override type T = TypeHNil
}
class TypeHList2[T1  , T2 ] extends TypeHList {
override type H = T1
override type T = TypeHList1[ T2  ]
}
class TypeHList3[T1  , T2  , T3 ] extends TypeHList {
override type H = T1
override type T = TypeHList2[ T2  ,   T3  ]
}
class TypeHList4[T1  , T2  , T3  , T4 ] extends TypeHList {
override type H = T1
override type T = TypeHList3[ T2  ,   T3  ,   T4  ]
}
class TypeHList5[T1  , T2  , T3  , T4  , T5 ] extends TypeHList {
override type H = T1
override type T = TypeHList4[ T2  ,   T3  ,   T4  ,   T5  ]
}
class TypeHList6[T1  , T2  , T3  , T4  , T5  , T6 ] extends TypeHList {
override type H = T1
override type T = TypeHList5[ T2  ,   T3  ,   T4  ,   T5  ,   T6  ]
}
class TypeHList7[T1  , T2  , T3  , T4  , T5  , T6  , T7 ] extends TypeHList {
override type H = T1
override type T = TypeHList6[ T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]
}
class TypeHList8[T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8 ] extends TypeHList {
override type H = T1
override type T = TypeHList7[ T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]
}
