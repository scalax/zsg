package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class ItemTag5[ T1, M1 <: org.scalax.asuna.mapper.item.Message  ,   T2, M2 <: org.scalax.asuna.mapper.item.Message  ,   T3, M3 <: org.scalax.asuna.mapper.item.Message  ,   T4, M4 <: org.scalax.asuna.mapper.item.Message  ,   T5, M5 <: org.scalax.asuna.mapper.item.Message  ] extends org.scalax.asuna.mapper.item.ItemTag {
override type XyyItemType = Item5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]
override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag5[ T1, M :-<>-: M1  ,   T2, M :-<>-: M2  ,   T3, M :-<>-: M3  ,   T4, M :-<>-: M4  ,   T5, M :-<>-: M5  ]
def debug[K <: org.scalax.asuna.mapper.KindContext  , I1 <: org.scalax.asuna.mapper.TypeParam  , I2 <: org.scalax.asuna.mapper.TypeParam  , I3 <: org.scalax.asuna.mapper.TypeParam  , I4 <: org.scalax.asuna.mapper.TypeParam  , I5 <: org.scalax.asuna.mapper.TypeParam ](c: org.scalax.asuna.mapper.Context[K])(implicit
dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1]  ,
dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, M2]  ,
dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, M3]  ,
dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, M4]  ,
dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, M5]
): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag5[ T1, M1  ,   T2, M2  ,   T3, M3  ,   T4, M4  ,   T5, M5  ], EatXyyType5[ I1  ,   I2  ,   I3  ,   I4  ,   I5  ]] =
ItemTag5.appendEatXyy5( dapp1  ,   dapp2  ,   dapp3  ,   dapp4  ,   dapp5  )
}
object ItemTag5 {
implicit def appendEatXyy5[K <: org.scalax.asuna.mapper.KindContext  , H1  , H2  , H3  , H4  , H5
, T1 <: org.scalax.asuna.mapper.TypeParam  , T2 <: org.scalax.asuna.mapper.TypeParam  , T3 <: org.scalax.asuna.mapper.TypeParam  , T4 <: org.scalax.asuna.mapper.TypeParam  , T5 <: org.scalax.asuna.mapper.TypeParam
, M1 <: org.scalax.asuna.mapper.item.Message  , M2 <: org.scalax.asuna.mapper.item.Message  , M3 <: org.scalax.asuna.mapper.item.Message  , M4 <: org.scalax.asuna.mapper.item.Message  , M5 <: org.scalax.asuna.mapper.item.Message ]
(implicit  t1: org.scalax.asuna.mapper.Application[K, H1, T1]  ,   t2: org.scalax.asuna.mapper.Application[K, H2, T2]  ,   t3: org.scalax.asuna.mapper.Application[K, H3, T3]  ,   t4: org.scalax.asuna.mapper.Application[K, H4, T4]  ,   t5: org.scalax.asuna.mapper.Application[K, H5, T5]  )
: org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag5[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ], EatXyyType5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] =
new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag5[ H1, M1  ,   H2, M2  ,   H3, M3  ,   H4, M4  ,   H5, M5  ], EatXyyType5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] {
override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]] = {
if (context.isReverse) {
context.append(ItemTag4.appendEatXyy4( t2  ,   t3  ,   t4  ,   t5  ).application(context), t1.application(context), ArticleXyyPlus5.put5)
} else {
context.append(ItemTag4.appendEatXyy4( t1  ,   t2  ,   t3  ,   t4  ).application(context), t5.application(context), ArticleXyyPlus5.plus5)
}
}
}
}
