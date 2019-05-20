package org.scalax.asuna.ii.item
class ItemTagWithMessage3[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage2[T2, Message2, T3, Message3]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag3[T1, T2, T3]
  override type XyyItemType = XyyItem3[T1, T2, T3]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage3[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage3[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag3[T1, T2, T3], EatXyyType3[I1, I2, I3]] =
    ItemTag3.appendEatXyy3(dapp1, dapp2, dapp3)
}
