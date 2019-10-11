package org.scalax.asuna.mapper
import impl._
class ItemTag3[ T1, M1 <: Message  ,   T2, M2 <: Message  ,   T3, M3 <: Message  ] extends ItemTag {
override type ItemType = Item3[ T1  ,   T2  ,   T3  ]
override type M[M <: Message] = ItemTag3[ T1, M :-<>-: M1  ,   T2, M :-<>-: M2  ,   T3, M :-<>-: M3  ]
def debug[K <: KindContext  , I1 <: TypeParameter  , I2 <: TypeParameter  , I3 <: TypeParameter ](c: Context[K])(implicit
dapp1: DebugItemApplication[K, T1, I1, M1]  ,
dapp2: DebugItemApplication[K, T2, I2, M2]  ,
dapp3: DebugItemApplication[K, T3, I3, M3]
): Application[K, ItemTag3[ T1, M1  ,   T2, M2  ,   T3, M3  ], ItemTypeParameter3[ I1  ,   I2  ,   I3  ]] =
ItemTag3.itemTagApplicationImplicit3( dapp1  ,   dapp2  ,   dapp3  )
}
object ItemTag3 {
implicit def itemTagApplicationImplicit3[K <: KindContext  , H1  , H2  , H3
, T1 <: TypeParameter  , T2 <: TypeParameter  , T3 <: TypeParameter
, M1 <: Message  , M2 <: Message  , M3 <: Message ]
(implicit  t1: Application[K, H1, T1]  ,   t2: Application[K, H2, T2]  ,   t3: Application[K, H3, T3]  )
: Application[K, ItemTag3[ H1, M1  ,   H2, M2  ,   H3, M3  ], ItemTypeParameter3[ T1  ,   T2  ,   T3  ]] =
new Application[K, ItemTag3[ H1, M1  ,   H2, M2  ,   H3, M3  ], ItemTypeParameter3[ T1  ,   T2  ,   T3  ]] {
override def application(context: Context[K]): K#M[ItemTypeParameter3[ T1  ,   T2  ,   T3  ]] = {
if (context.isReverse) {
context.append(ItemTag2.itemTagApplicationImplicit2( t2  ,   t3  ).application(context), t1.application(context), ItemTypeParameterPlus3.put3)
} else {
context.append(ItemTag2.itemTagApplicationImplicit2( t1  ,   t2  ).application(context), t3.application(context), ItemTypeParameterPlus3.plus3)
}
}
}
}
