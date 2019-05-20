package org.scalax.asuna.ii.item
class ItemTagWithMessage4[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage3[T2, Message2, T3, Message3, T4, Message4]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag4[T1, T2, T3, T4]
  override type XyyItemType = XyyItem4[T1, T2, T3, T4]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage4[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage4[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag4[T1, T2, T3, T4], EatXyyType4[I1, I2, I3, I4]] =
    ItemTag4.appendEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
