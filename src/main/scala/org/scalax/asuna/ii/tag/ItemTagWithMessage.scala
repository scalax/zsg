package org.scalax.asuna.ii.item
class ItemTagWithMessage1[T1, Message1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = T1
  override type HeadItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage                                       = ItemTag1[T1]
  override type XyyItemType                                     = XyyItem1[T1]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag1[(RawItem, I#RawItem)]
}
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
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag2[T1, T2], EatXyyType2[I1, I2]] =
    AppendEatXyy.appendEatXyy2(dapp1, dapp2)
}
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
    AppendEatXyy.appendEatXyy3(dapp1, dapp2, dapp3)
}
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
    AppendEatXyy.appendEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
class ItemTagWithMessage5[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage4[T2, Message2, T3, Message3, T4, Message4, T5, Message5]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag5[T1, T2, T3, T4, T5]
  override type XyyItemType = XyyItem5[T1, T2, T3, T4, T5]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage5[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage5[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag5[T1, T2, T3, T4, T5], EatXyyType5[I1, I2, I3, I4, I5]] =
    AppendEatXyy.appendEatXyy5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
class ItemTagWithMessage6[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage5[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag6[T1, T2, T3, T4, T5, T6]
  override type XyyItemType = XyyItem6[T1, T2, T3, T4, T5, T6]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage6[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage6[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag6[T1, T2, T3, T4, T5, T6], EatXyyType6[I1, I2, I3, I4, I5, I6]] =
    AppendEatXyy.appendEatXyy6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
class ItemTagWithMessage7[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage6[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag7[T1, T2, T3, T4, T5, T6, T7]
  override type XyyItemType = XyyItem7[T1, T2, T3, T4, T5, T6, T7]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage7[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage7[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag7[T1, T2, T3, T4, T5, T6, T7], EatXyyType7[I1, I2, I3, I4, I5, I6, I7]] =
    AppendEatXyy.appendEatXyy7(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7)
}
class ItemTagWithMessage8[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage7[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7, T8, Message8]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag8[T1, T2, T3, T4, T5, T6, T7, T8]
  override type XyyItemType = XyyItem8[T1, T2, T3, T4, T5, T6, T7, T8]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage8[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage8[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[I1, I2, I3, I4, I5, I6, I7, I8]] =
    AppendEatXyy.appendEatXyy8(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8)
}
class ItemTagWithMessage9[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTagWithMessage8[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7, T8, Message8, T9, Message9]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  override type XyyItemType = XyyItem9[T1, T2, T3, T4, T5, T6, T7, T8, T9]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage9[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage9[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType9[I1, I2, I3, I4, I5, I6, I7, I8, I9]] =
    AppendEatXyy.appendEatXyy9(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9)
}
class ItemTagWithMessage10[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem =
    ItemTagWithMessage9[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7, T8, Message8, T9, Message9, T10, Message10]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type XyyItemType = XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage10[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage10[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], EatXyyType10[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
  ]] =
    AppendEatXyy.appendEatXyy10(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10)
}
class ItemTagWithMessage11[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem =
    ItemTagWithMessage10[T2, Message2, T3, Message3, T4, Message4, T5, Message5, T6, Message6, T7, Message7, T8, Message8, T9, Message9, T10, Message10, T11, Message11]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type XyyItemType = XyyItem11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage11[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage11[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], EatXyyType11[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
  ]] =
    AppendEatXyy.appendEatXyy11(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11)
}
class ItemTagWithMessage12[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage11[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  override type XyyItemType = XyyItem12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage12[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage12[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], EatXyyType12[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
  ]] =
    AppendEatXyy.appendEatXyy12(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12)
}
class ItemTagWithMessage13[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage12[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  override type XyyItemType = XyyItem13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage13[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage13[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], EatXyyType13[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
  ]] =
    AppendEatXyy.appendEatXyy13(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13)
}
class ItemTagWithMessage14[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage13[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type XyyItemType = XyyItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage14[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage14[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], EatXyyType14[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
  ]] =
    AppendEatXyy.appendEatXyy14(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14)
}
class ItemTagWithMessage15[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage14[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  override type XyyItemType = XyyItem15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage15[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage15[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], EatXyyType15[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
  ]] =
    AppendEatXyy.appendEatXyy15(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15)
}
class ItemTagWithMessage16[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage15[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  override type XyyItemType = XyyItem16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage16[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage16[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType16[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
    , I16
  ]] =
    AppendEatXyy.appendEatXyy16(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16)
}
class ItemTagWithMessage17[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage16[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type XyyItemType = XyyItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage17[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage17[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType17[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
    , I16
    , I17
  ]] =
    AppendEatXyy.appendEatXyy17(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16, dapp17)
}
class ItemTagWithMessage18[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
  , T18
  , Message18 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage17[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
    , T18
    , Message18
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  override type XyyItemType = XyyItem18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage18[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message18
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage18[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T18
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
    , I18 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
    , dapp18: org.scalax.asuna.mapper.item.DebugItemApplication[K, T18, I18, Message18]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], EatXyyType18[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
    , I16
    , I17
    , I18
  ]] =
    AppendEatXyy.appendEatXyy18(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16, dapp17, dapp18)
}
class ItemTagWithMessage19[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
  , T18
  , Message18 <: org.scalax.asuna.mapper.item.Message
  , T19
  , Message19 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage18[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
    , T18
    , Message18
    , T19
    , Message19
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  override type XyyItemType = XyyItem19[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage19[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message18
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message19
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage19[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T18
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T19
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
    , I18 <: org.scalax.asuna.mapper.item.TypeParam
    , I19 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
    , dapp18: org.scalax.asuna.mapper.item.DebugItemApplication[K, T18, I18, Message18]
    , dapp19: org.scalax.asuna.mapper.item.DebugItemApplication[K, T19, I19, Message19]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag19[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
    , T17
    , T18
    , T19
  ], EatXyyType19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]] =
    AppendEatXyy.appendEatXyy19(
        dapp1
      , dapp2
      , dapp3
      , dapp4
      , dapp5
      , dapp6
      , dapp7
      , dapp8
      , dapp9
      , dapp10
      , dapp11
      , dapp12
      , dapp13
      , dapp14
      , dapp15
      , dapp16
      , dapp17
      , dapp18
      , dapp19
    )
}
class ItemTagWithMessage20[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
  , T18
  , Message18 <: org.scalax.asuna.mapper.item.Message
  , T19
  , Message19 <: org.scalax.asuna.mapper.item.Message
  , T20
  , Message20 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage19[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
    , T18
    , Message18
    , T19
    , Message19
    , T20
    , Message20
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  override type XyyItemType = XyyItem20[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage20[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message18
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message19
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message20
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage20[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T18
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T19
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T20
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
    , I18 <: org.scalax.asuna.mapper.item.TypeParam
    , I19 <: org.scalax.asuna.mapper.item.TypeParam
    , I20 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
    , dapp18: org.scalax.asuna.mapper.item.DebugItemApplication[K, T18, I18, Message18]
    , dapp19: org.scalax.asuna.mapper.item.DebugItemApplication[K, T19, I19, Message19]
    , dapp20: org.scalax.asuna.mapper.item.DebugItemApplication[K, T20, I20, Message20]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag20[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
    , T17
    , T18
    , T19
    , T20
  ], EatXyyType20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]] =
    AppendEatXyy.appendEatXyy20(
        dapp1
      , dapp2
      , dapp3
      , dapp4
      , dapp5
      , dapp6
      , dapp7
      , dapp8
      , dapp9
      , dapp10
      , dapp11
      , dapp12
      , dapp13
      , dapp14
      , dapp15
      , dapp16
      , dapp17
      , dapp18
      , dapp19
      , dapp20
    )
}
class ItemTagWithMessage21[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
  , T18
  , Message18 <: org.scalax.asuna.mapper.item.Message
  , T19
  , Message19 <: org.scalax.asuna.mapper.item.Message
  , T20
  , Message20 <: org.scalax.asuna.mapper.item.Message
  , T21
  , Message21 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage20[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
    , T18
    , Message18
    , T19
    , Message19
    , T20
    , Message20
    , T21
    , Message21
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  override type XyyItemType = XyyItem21[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage21[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message18
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message19
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message20
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message21
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage21[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T18
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T19
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T20
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T21
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
    , I18 <: org.scalax.asuna.mapper.item.TypeParam
    , I19 <: org.scalax.asuna.mapper.item.TypeParam
    , I20 <: org.scalax.asuna.mapper.item.TypeParam
    , I21 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
    , dapp18: org.scalax.asuna.mapper.item.DebugItemApplication[K, T18, I18, Message18]
    , dapp19: org.scalax.asuna.mapper.item.DebugItemApplication[K, T19, I19, Message19]
    , dapp20: org.scalax.asuna.mapper.item.DebugItemApplication[K, T20, I20, Message20]
    , dapp21: org.scalax.asuna.mapper.item.DebugItemApplication[K, T21, I21, Message21]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag21[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
    , T17
    , T18
    , T19
    , T20
    , T21
  ], EatXyyType21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]] =
    AppendEatXyy.appendEatXyy21(
        dapp1
      , dapp2
      , dapp3
      , dapp4
      , dapp5
      , dapp6
      , dapp7
      , dapp8
      , dapp9
      , dapp10
      , dapp11
      , dapp12
      , dapp13
      , dapp14
      , dapp15
      , dapp16
      , dapp17
      , dapp18
      , dapp19
      , dapp20
      , dapp21
    )
}
class ItemTagWithMessage22[
    T1
  , Message1 <: org.scalax.asuna.mapper.item.Message
  , T2
  , Message2 <: org.scalax.asuna.mapper.item.Message
  , T3
  , Message3 <: org.scalax.asuna.mapper.item.Message
  , T4
  , Message4 <: org.scalax.asuna.mapper.item.Message
  , T5
  , Message5 <: org.scalax.asuna.mapper.item.Message
  , T6
  , Message6 <: org.scalax.asuna.mapper.item.Message
  , T7
  , Message7 <: org.scalax.asuna.mapper.item.Message
  , T8
  , Message8 <: org.scalax.asuna.mapper.item.Message
  , T9
  , Message9 <: org.scalax.asuna.mapper.item.Message
  , T10
  , Message10 <: org.scalax.asuna.mapper.item.Message
  , T11
  , Message11 <: org.scalax.asuna.mapper.item.Message
  , T12
  , Message12 <: org.scalax.asuna.mapper.item.Message
  , T13
  , Message13 <: org.scalax.asuna.mapper.item.Message
  , T14
  , Message14 <: org.scalax.asuna.mapper.item.Message
  , T15
  , Message15 <: org.scalax.asuna.mapper.item.Message
  , T16
  , Message16 <: org.scalax.asuna.mapper.item.Message
  , T17
  , Message17 <: org.scalax.asuna.mapper.item.Message
  , T18
  , Message18 <: org.scalax.asuna.mapper.item.Message
  , T19
  , Message19 <: org.scalax.asuna.mapper.item.Message
  , T20
  , Message20 <: org.scalax.asuna.mapper.item.Message
  , T21
  , Message21 <: org.scalax.asuna.mapper.item.Message
  , T22
  , Message22 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage21[
      T2
    , Message2
    , T3
    , Message3
    , T4
    , Message4
    , T5
    , Message5
    , T6
    , Message6
    , T7
    , Message7
    , T8
    , Message8
    , T9
    , Message9
    , T10
    , Message10
    , T11
    , Message11
    , T12
    , Message12
    , T13
    , Message13
    , T14
    , Message14
    , T15
    , Message15
    , T16
    , Message16
    , T17
    , Message17
    , T18
    , Message18
    , T19
    , Message19
    , T20
    , Message20
    , T21
    , Message21
    , T22
    , Message22
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  override type XyyItemType = XyyItem22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage22[
      (RawItem, I#RawItem)
    , Message1
    , (TailItem#RawItem, I#TailItem#RawItem)
    , Message2
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , Message3
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , Message4
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message5
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message6
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message7
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message8
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , Message9
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message10
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message11
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message12
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message13
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message14
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message15
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message16
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message17
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message18
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message19
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message20
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message21
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , Message22
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage22[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T18
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T19
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T20
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T21
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T22
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
    , I18 <: org.scalax.asuna.mapper.item.TypeParam
    , I19 <: org.scalax.asuna.mapper.item.TypeParam
    , I20 <: org.scalax.asuna.mapper.item.TypeParam
    , I21 <: org.scalax.asuna.mapper.item.TypeParam
    , I22 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, Message1]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, Message2]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, Message3]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, Message4]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, Message5]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, Message6]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, Message7]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, Message8]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, Message9]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, Message10]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, Message11]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, Message12]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, Message13]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, Message14]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, Message15]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, Message16]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, Message17]
    , dapp18: org.scalax.asuna.mapper.item.DebugItemApplication[K, T18, I18, Message18]
    , dapp19: org.scalax.asuna.mapper.item.DebugItemApplication[K, T19, I19, Message19]
    , dapp20: org.scalax.asuna.mapper.item.DebugItemApplication[K, T20, I20, Message20]
    , dapp21: org.scalax.asuna.mapper.item.DebugItemApplication[K, T21, I21, Message21]
    , dapp22: org.scalax.asuna.mapper.item.DebugItemApplication[K, T22, I22, Message22]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag22[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
    , T17
    , T18
    , T19
    , T20
    , T21
    , T22
  ], EatXyyType22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]] =
    AppendEatXyy.appendEatXyy22(
        dapp1
      , dapp2
      , dapp3
      , dapp4
      , dapp5
      , dapp6
      , dapp7
      , dapp8
      , dapp9
      , dapp10
      , dapp11
      , dapp12
      , dapp13
      , dapp14
      , dapp15
      , dapp16
      , dapp17
      , dapp18
      , dapp19
      , dapp20
      , dapp21
      , dapp22
    )
}
