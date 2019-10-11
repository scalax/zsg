package org.scalax.asuna.mapper
import impl._
class ItemTag8[ T1, M1 <: Message  ,   T2, M2 <: Message  ,   T3, M3 <: Message  ,   T4, M4 <: Message  ,   T5, M5 <: Message  ,   T6, M6 <: Message  ,   T7, M7 <: Message  ,   T8, M8 <: Message  ] extends ItemTag {
override type ItemType = Item8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]
override type M[M <: Message] = ItemTag8[ T1, M :-<>-: M1  ,   T2, M :-<>-: M2  ,   T3, M :-<>-: M3  ,   T4, M :-<>-: M4  ,   T5, M :-<>-: M5  ,   T6, M :-<>-: M6  ,   T7, M :-<>-: M7  ,   T8, M :-<>-: M8  ]
def debug[K <: KindContext  , I1 <: TypeParameter  , I2 <: TypeParameter  , I3 <: TypeParameter  , I4 <: TypeParameter  , I5 <: TypeParameter  , I6 <: TypeParameter  , I7 <: TypeParameter  , I8 <: TypeParameter ](c: Context[K])(implicit
dapp1: DebugItemApplication[K, T1, I1, M1]  ,
dapp2: DebugItemApplication[K, T2, I2, M2]  ,
dapp3: DebugItemApplication[K, T3, I3, M3]  ,
dapp4: DebugItemApplication[K, T4, I4, M4]  ,
dapp5: DebugItemApplication[K, T5, I5, M5]  ,
dapp6: DebugItemApplication[K, T6, I6, M6]  ,
dapp7: DebugItemApplication[K, T7, I7, M7]  ,
dapp8: DebugItemApplication[K, T8, I8, M8]
): Application[K, ItemTag8[ T1, M1  ,   T2, M2  ,   T3, M3  ,   T4, M4  ,   T5, M5  ,   T6, M6  ,   T7, M7  ,   T8, M8  ], ItemTypeParameter8[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ,   I6  ,   I7  ,   I8  ]] =
ItemTag8.itemTagApplicationImplicit8( dapp1  ,   dapp2  ,   dapp3  ,   dapp4  ,   dapp5  ,   dapp6  ,   dapp7  ,   dapp8  )
}
object ItemTag8 {
implicit def itemTagApplicationImplicit8[K <: KindContext  , H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8
, T1 <: TypeParameter  , T2 <: TypeParameter  , T3 <: TypeParameter  , T4 <: TypeParameter  , T5 <: TypeParameter  , T6 <: TypeParameter  , T7 <: TypeParameter  , T8 <: TypeParameter
, M1 <: Message  , M2 <: Message  , M3 <: Message  , M4 <: Message  , M5 <: Message  , M6 <: Message  , M7 <: Message  , M8 <: Message ]
(implicit  t1: Application[K, H1, T1]  ,   t2: Application[K, H2, T2]  ,   t3: Application[K, H3, T3]  ,   t4: Application[K, H4, T4]  ,   t5: Application[K, H5, T5]  ,   t6: Application[K, H6, T6]  ,   t7: Application[K, H7, T7]  ,   t8: Application[K, H8, T8]  )
: Application[K, ItemTag8[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ,   H6, M6  ,   H7, M7  ,   H8, M8  ], ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]] =
new Application[K, ItemTag8[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ,   H6, M6  ,   H7, M7  ,   H8, M8  ], ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]] {
override def application(context: Context[K]): K#M[ItemTypeParameter8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]] = {
if (context.isReverse) {
context.append(ItemTag7.itemTagApplicationImplicit7( t2  ,   t3  ,   t4  ,   t5  ,   t6  ,   t7  ,   t8  ).application(context), t1.application(context), ItemTypeParameterPlus8.put8)
} else {
context.append(ItemTag7.itemTagApplicationImplicit7( t1  ,   t2  ,   t3  ,   t4  ,   t5  ,   t6  ,   t7  ).application(context), t8.application(context), ItemTypeParameterPlus8.plus8)
}
}
}
}
