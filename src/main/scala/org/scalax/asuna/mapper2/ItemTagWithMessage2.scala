package org.scalax.asuna.ii.item
class ItemTagWithMessage2[T1, Message1 <: org.scalax.asuna.mapper.item.Message, T2, Message2 <: org.scalax.asuna.mapper.item.Message]
    extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = T1
  override type HeadItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem                                        = ItemTagWithMessage1[T2, Message2]
  override type Sub                                             = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage                                       = ItemTag2[T1, T2]
  override type XyyItemType                                     = XyyItem2[T1, T2]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage2[(RawItem, I#RawItem), Message1, (TailItem#RawItem, I#TailItem#RawItem), Message2]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] =
    org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage2[T1, I#HeadItem, T2, I#TailItem#HeadItem], I#TailItem#TailItem]
  def debug[K <: org.scalax.asuna.mapper.item.KindContext, I1 <: org.scalax.asuna.mapper.item.TypeParam, I2 <: org.scalax.asuna.mapper.item.TypeParam](
    c: org.scalax.asuna.mapper.item.Context[K]
  )(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag2[T1, T2], EatXyyType2[I1, I2]] =
    ItemTag2.appendEatXyy2(dapp1, dapp2)
}
