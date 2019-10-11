package org.scalax.asuna.mapper
trait ItemTypeParameterPlus5 {
def plus5[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ]
: Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ], T5, ItemTypeParameter5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] =
new Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ], T5, ItemTypeParameter5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] {
override def plus(p: Item4[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ], item: T5#H): Item5[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ] = p.add(item)
override def takeTail(t: Item5[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ]): T5#H = t.rightHead
override def takeHead(t: Item5[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ,   T5#H  ]): Item4[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ] = t.rightTail
override def sub: Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ]#T, T5#T, ItemTypeParameter5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]#T] = plus5[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ]
}
def put5[ T1 <: TypeParameter  ,   T2 <: TypeParameter  ,   T3 <: TypeParameter  ,   T4 <: TypeParameter  ,   T5 <: TypeParameter  ]
: Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ], T5, ItemTypeParameter5[T5  , T1  , T2  , T3  , T4 ]] =
new Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ], T5, ItemTypeParameter5[T5  , T1  , T2  , T3  , T4 ]] {
override def plus(p: Item4[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ], item: T5#H): Item5[T5#H  , T1#H  , T2#H  , T3#H  , T4#H ] = p.pull(item)
override def takeTail(t: Item5[T5#H  , T1#H  , T2#H  , T3#H  , T4#H ]): T5#H = t.leftHead
override def takeHead(t: Item5[T5#H  , T1#H  , T2#H  , T3#H  , T4#H ]): Item4[ T1#H  ,   T2#H  ,   T3#H  ,   T4#H  ] = t.leftTail
override def sub: Plus[ItemTypeParameter4[ T1  ,   T2  ,   T3  ,   T4  ]#T, T5#T, ItemTypeParameter5[T5  , T1  , T2  , T3  , T4 ]#T] = put5[ T1#T  ,   T2#T  ,   T3#T  ,   T4#T  ,   T5#T  ]
}
}
object ItemTypeParameterPlus5 extends ItemTypeParameterPlus5
