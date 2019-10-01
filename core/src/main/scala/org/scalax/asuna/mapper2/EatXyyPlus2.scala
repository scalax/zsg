package org.scalax.asuna.mapper.item
object ArticleXyyPlus2 {
def plus2[ T1 <: org.scalax.asuna.mapper.TypeParam  ,   T2 <: org.scalax.asuna.mapper.TypeParam  ]
: org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ], T2, EatXyyType2[ T1  ,   T2  ]] =
new org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ], T2, EatXyyType2[ T1  ,   T2  ]] {
override def plus(p: Item1[ T1#H  ], item: T2#H): Item2[ T1#H  ,   T2#H  ] = p.eat(item)
override def takeHead(t: Item2[ T1#H  ,   T2#H  ]): T2#H = t.rightHead
override def takeTail(t: Item2[ T1#H  ,   T2#H  ]): Item1[ T1#H  ] = t.rightTail
override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ]#T, T2#T, EatXyyType2[ T1  ,   T2  ]#T] = plus2[ T1#T  ,   T2#T  ]
}
def put2[ T1 <: org.scalax.asuna.mapper.TypeParam  ,   T2 <: org.scalax.asuna.mapper.TypeParam  ]
: org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ], T2, EatXyyType2[T2  , T1 ]] =
new org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ], T2, EatXyyType2[T2  , T1 ]] {
override def plus(p: Item1[ T1#H  ], item: T2#H): Item2[T2#H  , T1#H ] = p.pudao(item)
override def takeHead(t: Item2[T2#H  , T1#H ]): T2#H = t.leftHead
override def takeTail(t: Item2[T2#H  , T1#H ]): Item1[ T1#H  ] = t.leftTail
override def sub: org.scalax.asuna.mapper.Plus[EatXyyType1[ T1  ]#T, T2#T, EatXyyType2[T2  , T1 ]#T] = put2[ T1#T  ,   T2#T  ]
}
}
class TypeParam2[T1  , T2 ] extends org.scalax.asuna.mapper.TypeParam {
override type H = T1
override type T = TypeParam1[ T2  ]
}
