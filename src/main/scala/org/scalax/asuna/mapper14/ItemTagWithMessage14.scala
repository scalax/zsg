package org.scalax.asuna.mapper.item
class ItemTagWithMessage14[
  T1,
  Message1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  Message2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  Message3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  Message4 <: org.scalax.asuna.mapper.item.Message,
  T5,
  Message5 <: org.scalax.asuna.mapper.item.Message,
  T6,
  Message6 <: org.scalax.asuna.mapper.item.Message,
  T7,
  Message7 <: org.scalax.asuna.mapper.item.Message,
  T8,
  Message8 <: org.scalax.asuna.mapper.item.Message,
  T9,
  Message9 <: org.scalax.asuna.mapper.item.Message,
  T10,
  Message10 <: org.scalax.asuna.mapper.item.Message,
  T11,
  Message11 <: org.scalax.asuna.mapper.item.Message,
  T12,
  Message12 <: org.scalax.asuna.mapper.item.Message,
  T13,
  Message13 <: org.scalax.asuna.mapper.item.Message,
  T14,
  Message14 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = T1
  override type HeadItem = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem = ItemTagWithMessage13[
    T2,
    Message2,
    T3,
    Message3,
    T4,
    Message4,
    T5,
    Message5,
    T6,
    Message6,
    T7,
    Message7,
    T8,
    Message8,
    T9,
    Message9,
    T10,
    Message10,
    T11,
    Message11,
    T12,
    Message12,
    T13,
    Message13,
    T14,
    Message14
  ]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type XyyItemType = XyyItem14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTagWithMessage14[
    (RawItem, I#RawItem),
    Message1,
    (TailItem#RawItem, I#TailItem#RawItem),
    Message2,
    (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem),
    Message3,
    (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem),
    Message4,
    (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message5,
    (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message6,
    (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message7,
    (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message8,
    (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem),
    Message9,
    (
      TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem,
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    ),
    Message10,
    (
      TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem,
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    ),
    Message11,
    (
      TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem,
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    ),
    Message12,
    (
      TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem,
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    ),
    Message13,
    (
      TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem,
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    ),
    Message14
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage14[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T6,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T7,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T8,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T9,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T10,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T11,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T12,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T13,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem,
    T14,
    I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam,
    I7 <: org.scalax.asuna.mapper.TypeParam,
    I8 <: org.scalax.asuna.mapper.TypeParam,
    I9 <: org.scalax.asuna.mapper.TypeParam,
    I10 <: org.scalax.asuna.mapper.TypeParam,
    I11 <: org.scalax.asuna.mapper.TypeParam,
    I12 <: org.scalax.asuna.mapper.TypeParam,
    I13 <: org.scalax.asuna.mapper.TypeParam,
    I14 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, Message2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, Message3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, Message4],
    dapp5: org.scalax.asuna.mapper.DebugItemApplication[K, T5, I5, Message5],
    dapp6: org.scalax.asuna.mapper.DebugItemApplication[K, T6, I6, Message6],
    dapp7: org.scalax.asuna.mapper.DebugItemApplication[K, T7, I7, Message7],
    dapp8: org.scalax.asuna.mapper.DebugItemApplication[K, T8, I8, Message8],
    dapp9: org.scalax.asuna.mapper.DebugItemApplication[K, T9, I9, Message9],
    dapp10: org.scalax.asuna.mapper.DebugItemApplication[K, T10, I10, Message10],
    dapp11: org.scalax.asuna.mapper.DebugItemApplication[K, T11, I11, Message11],
    dapp12: org.scalax.asuna.mapper.DebugItemApplication[K, T12, I12, Message12],
    dapp13: org.scalax.asuna.mapper.DebugItemApplication[K, T13, I13, Message13],
    dapp14: org.scalax.asuna.mapper.DebugItemApplication[K, T14, I14, Message14]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], EatXyyType14[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11,
    I12,
    I13,
    I14
  ]] =
    ItemTag14.appendEatXyy14(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14)
}
