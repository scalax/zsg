package org.scalax.asuna.mapper
trait ItemTypeParameterPlus3 {
def plus3[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ]
: Plus[ItemTypeParameter2[ T1  ,   T2  ], T3, ItemTypeParameter3[ T1  ,   T2  ,   T3  ]] =
new Plus[ItemTypeParameter2[ T1  ,   T2  ], T3, ItemTypeParameter3[ T1  ,   T2  ,   T3  ]] {
override def plus(p: Item2[ T1#H  ,   T2#H  ], item: T3#H): Item3[ T1#H  ,   T2#H  ,   T3#H  ] = p.add(item)
override def takeTail(t: Item3[ T1#H  ,   T2#H  ,   T3#H  ]): T3#H = t.rightHead
override def takeHead(t: Item3[ T1#H  ,   T2#H  ,   T3#H  ]): Item2[ T1#H  ,   T2#H  ] = t.rightTail
override def sub: Plus[ItemTypeParameter2[ T1  ,   T2  ]#T, T3#T, ItemTypeParameter3[ T1  ,   T2  ,   T3  ]#T] = plus3[ T1#T  ,   T2#T  ,   T3#T  ]
}
def put3[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ]
: Plus[ItemTypeParameter2[ T1  ,   T2  ], T3, ItemTypeParameter3[T3  , T1  , T2 ]] =
new Plus[ItemTypeParameter2[ T1  ,   T2  ], T3, ItemTypeParameter3[T3  , T1  , T2 ]] {
override def plus(p: Item2[ T1#H  ,   T2#H  ], item: T3#H): Item3[T3#H  , T1#H  , T2#H ] = p.pull(item)
override def takeTail(t: Item3[T3#H  , T1#H  , T2#H ]): T3#H = t.leftHead
override def takeHead(t: Item3[T3#H  , T1#H  , T2#H ]): Item2[ T1#H  ,   T2#H  ] = t.leftTail
override def sub: Plus[ItemTypeParameter2[ T1  ,   T2  ]#T, T3#T, ItemTypeParameter3[T3  , T1  , T2 ]#T] = put3[ T1#T  ,   T2#T  ,   T3#T  ]
}
}
object ItemTypeParameterPlus3 extends ItemTypeParameterPlus3
