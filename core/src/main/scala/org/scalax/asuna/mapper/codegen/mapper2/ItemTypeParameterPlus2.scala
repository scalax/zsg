package org.scalax.asuna.mapper
trait ItemTypeParameterPlus2 {
def plus2[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ]
: Plus[ItemTypeParameter1[ T1  ], T2, ItemTypeParameter2[ T1  ,   T2  ]] =
new Plus[ItemTypeParameter1[ T1  ], T2, ItemTypeParameter2[ T1  ,   T2  ]] {
override def plus(p: Item1[ T1#H  ], item: T2#H): Item2[ T1#H  ,   T2#H  ] = p.add(item)
override def takeTail(t: Item2[ T1#H  ,   T2#H  ]): T2#H = t.rightHead
override def takeHead(t: Item2[ T1#H  ,   T2#H  ]): Item1[ T1#H  ] = t.rightTail
override def sub: Plus[ItemTypeParameter1[ T1  ]#T, T2#T, ItemTypeParameter2[ T1  ,   T2  ]#T] = plus2[ T1#T  ,   T2#T  ]
}
def put2[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ]
: Plus[ItemTypeParameter1[ T1  ], T2, ItemTypeParameter2[T2  , T1 ]] =
new Plus[ItemTypeParameter1[ T1  ], T2, ItemTypeParameter2[T2  , T1 ]] {
override def plus(p: Item1[ T1#H  ], item: T2#H): Item2[T2#H  , T1#H ] = p.pull(item)
override def takeTail(t: Item2[T2#H  , T1#H ]): T2#H = t.leftHead
override def takeHead(t: Item2[T2#H  , T1#H ]): Item1[ T1#H  ] = t.leftTail
override def sub: Plus[ItemTypeParameter1[ T1  ]#T, T2#T, ItemTypeParameter2[T2  , T1 ]#T] = put2[ T1#T  ,   T2#T  ]
}
}
object ItemTypeParameterPlus2 extends ItemTypeParameterPlus2
