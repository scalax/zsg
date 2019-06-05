package org.scalax.asuna.mapper.item
class ItemTagWithMessage5[
  T1,
  Message1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  Message2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  Message3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  Message4 <: org.scalax.asuna.mapper.item.Message,
  T5,
  Message5 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage4[T2, Message2, T3, Message3, T4, Message4, T5, Message5]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag5[T1, T2, T3, T4, T5]
  override type XyyItemType = XyyItem5[T1, T2, T3, T4, T5]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage5[
    (RawItem, I#RawItem),
    Message1,
    (TailItem#RawItem, I#TailItem#RawItem),
    Message2,
    (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem),
    Message3,
    (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem),
    Message4,
    (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message5
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage5[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, Message2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, Message3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, Message4],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, Message5]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag5[T1, T2, T3, T4, T5], EatXyyType5[I1, I2, I3, I4, I5]] =
    ItemTag5.appendEatXyy5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
object ItemTagWithMessage5 {
  implicit def appendEatXyy5[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    Message1 <: org.scalax.asuna.mapper.item.Message,
    Message2 <: org.scalax.asuna.mapper.item.Message,
    Message3 <: org.scalax.asuna.mapper.item.Message,
    Message4 <: org.scalax.asuna.mapper.item.Message,
    Message5 <: org.scalax.asuna.mapper.item.Message,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.ItemTagWithMessage5[H1, Message1, H2, Message2, H3, Message3, H4, Message4, H5, Message5],
    EatXyyType5[T1, T2, T3, T4, T5]
  ] =
    new org.scalax.asuna.mapper.Application[
      K,
      org.scalax.asuna.mapper.item.ItemTagWithMessage5[H1, Message1, H2, Message2, H3, Message3, H4, Message4, H5, Message5],
      EatXyyType5[T1, T2, T3, T4, T5]
    ] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(ItemTag4.appendEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyPlus5.put5)
        } else {
          context.append(ItemTag4.appendEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyPlus5.plus5)
        }
      }
    }
}
