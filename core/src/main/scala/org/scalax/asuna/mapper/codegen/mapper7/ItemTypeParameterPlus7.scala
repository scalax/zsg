package org.scalax.asuna.mapper
trait ItemTypeParameterPlus7 {
def plus7[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ,   T6 <: TypeParameter  ,   T7 <: TypeParameter  ]
: Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ], T7, ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]] =
new Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ], T7, ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]] {
override def plus(p: Item6[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ], item: T7#H): Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ] = p.add(item)
override def takeTail(t: Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ]): T7#H = t.rightHead
override def takeHead(t: Item7[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ,   T7#H  ]): Item6[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ] = t.rightTail
override def sub: Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ]#T, T7#T, ItemTypeParameter7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]#T] = plus7[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ,   T6#T  ,   T7#T  ]
}
def put7[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ,   T6 <: TypeParameter  ,   T7 <: TypeParameter  ]
: Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ], T7, ItemTypeParameter7[T7  , T1  , T2  , T3  , T4  , T5  , T6 ]] =
new Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ], T7, ItemTypeParameter7[T7  , T1  , T2  , T3  , T4  , T5  , T6 ]] {
override def plus(p: Item6[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ], item: T7#H): Item7[T7#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H ] = p.pull(item)
override def takeTail(t: Item7[T7#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H ]): T7#H = t.leftHead
override def takeHead(t: Item7[T7#H  , T1#H  , T2#H  , T3#H  , T4#H  , T5#H  , T6#H ]): Item6[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ,   T6#H  ] = t.leftTail
override def sub: Plus[ItemTypeParameter6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ]#T, T7#T, ItemTypeParameter7[T7  , T1  , T2  , T3  , T4  , T5  , T6 ]#T] = put7[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ,   T6#T  ,   T7#T  ]
}
}
object ItemTypeParameterPlus7 extends ItemTypeParameterPlus7
