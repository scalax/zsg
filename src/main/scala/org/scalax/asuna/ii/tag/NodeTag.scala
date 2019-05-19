package org.scalax.asuna.ii.item
class NodeTag1[T1 <: org.scalax.asuna.mapper.item.ItemTag] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem                                        = T1
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = NodeTag1[T1#Sub]
  override type XyyItemType                                     = XyyItem1[T1]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag1[HeadItem#Sub#Pull[I#HeadItem#Sub]]
}
class NodeTag2[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem                                        = T1
  override type TailItem                                        = NodeTag1[T2]
  override type Sub                                             = NodeTag2[T1#Sub, T2#Sub]
  override type NoMessage                                       = NodeTag2[T1#NoMessage, T2#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag2[HeadItem#Sub#Pull[I#HeadItem#Sub], TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub]]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag2[Type1#Result, Type2#Result], Type2#Left]
  })#II
  override type XyyItemType = XyyItem2[T1#XyyItemType, T2#XyyItemType]
  def debug[K <: org.scalax.asuna.mapper.item.KindContext, I1 <: org.scalax.asuna.mapper.item.TypeParam, I2 <: org.scalax.asuna.mapper.item.TypeParam](
    c: org.scalax.asuna.mapper.item.Context[K]
  )(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag2[T1, T2], EatXyyType2[I1, I2]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy2(dapp1, dapp2)
}
class NodeTag3[T1 <: org.scalax.asuna.mapper.item.ItemTag, T2 <: org.scalax.asuna.mapper.item.ItemTag, T3 <: org.scalax.asuna.mapper.item.ItemTag]
    extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag2[T2, T3]
  override type Sub       = NodeTag3[T1#Sub, T2#Sub, T3#Sub]
  override type NoMessage = NodeTag3[T1#NoMessage, T2#NoMessage, T3#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag3[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag3[Type1#Result, Type2#Result, Type3#Result], Type3#Left]
  })#II
  override type XyyItemType = XyyItem3[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag3[T1, T2, T3], EatXyyType3[I1, I2, I3]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy3(dapp1, dapp2, dapp3)
}
class NodeTag4[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag3[T2, T3, T4]
  override type Sub       = NodeTag4[T1#Sub, T2#Sub, T3#Sub, T4#Sub]
  override type NoMessage = NodeTag4[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag4[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag4[Type1#Result, Type2#Result, Type3#Result, Type4#Result], Type4#Left]
  })#II
  override type XyyItemType = XyyItem4[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag4[T1, T2, T3, T4], EatXyyType4[I1, I2, I3, I4]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
class NodeTag5[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag4[T2, T3, T4, T5]
  override type Sub       = NodeTag5[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub]
  override type NoMessage = NodeTag5[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag5[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag5[Type1#Result, Type2#Result, Type3#Result, Type4#Result, Type5#Result], Type5#Left]
  })#II
  override type XyyItemType = XyyItem5[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag5[T1, T2, T3, T4, T5], EatXyyType5[I1, I2, I3, I4, I5]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
class NodeTag6[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag5[T2, T3, T4, T5, T6]
  override type Sub       = NodeTag6[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub]
  override type NoMessage = NodeTag6[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag6[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type Type6 = T6#InputMessage[Type5#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag6[Type1#Result, Type2#Result, Type3#Result, Type4#Result, Type5#Result, Type6#Result], Type6#Left]
  })#II
  override type XyyItemType = XyyItem6[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag6[T1, T2, T3, T4, T5, T6], EatXyyType6[I1, I2, I3, I4, I5, I6]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
class NodeTag7[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag6[T2, T3, T4, T5, T6, T7]
  override type Sub       = NodeTag7[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub]
  override type NoMessage = NodeTag7[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag7[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type Type6 = T6#InputMessage[Type5#Left];
    type Type7 = T7#InputMessage[Type6#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[
      NodeTag7[Type1#Result, Type2#Result, Type3#Result, Type4#Result, Type5#Result, Type6#Result, Type7#Result],
      Type7#Left
    ]
  })#II
  override type XyyItemType = XyyItem7[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType, T7#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag7[T1, T2, T3, T4, T5, T6, T7], EatXyyType7[I1, I2, I3, I4, I5, I6, I7]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy7(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7)
}
class NodeTag8[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag7[T2, T3, T4, T5, T6, T7, T8]
  override type Sub       = NodeTag8[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub]
  override type NoMessage = NodeTag8[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage, T8#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag8[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type Type6 = T6#InputMessage[Type5#Left];
    type Type7 = T7#InputMessage[Type6#Left];
    type Type8 = T8#InputMessage[Type7#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag8[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result
    ], Type8#Left]
  })#II
  override type XyyItemType = XyyItem8[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType, T7#XyyItemType, T8#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag8[T1, T2, T3, T4, T5, T6, T7, T8], EatXyyType8[I1, I2, I3, I4, I5, I6, I7, I8]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy8(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8)
}
class NodeTag9[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag8[T2, T3, T4, T5, T6, T7, T8, T9]
  override type Sub       = NodeTag9[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub]
  override type NoMessage = NodeTag9[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage, T8#NoMessage, T9#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag9[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type Type6 = T6#InputMessage[Type5#Left];
    type Type7 = T7#InputMessage[Type6#Left];
    type Type8 = T8#InputMessage[Type7#Left];
    type Type9 = T9#InputMessage[Type8#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag9[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result
    ], Type9#Left]
  })#II
  override type XyyItemType =
    XyyItem9[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType, T7#XyyItemType, T8#XyyItemType, T9#XyyItemType]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag9[T1, T2, T3, T4, T5, T6, T7, T8, T9], EatXyyType9[I1, I2, I3, I4, I5, I6, I7, I8, I9]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy9(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9)
}
class NodeTag10[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag9[T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type Sub      = NodeTag10[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub]
  override type NoMessage =
    NodeTag10[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage, T8#NoMessage, T9#NoMessage, T10#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag10[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag10[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result
    ], Type10#Left]
  })#II
  override type XyyItemType = XyyItem10[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], EatXyyType10[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy10(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10)
}
class NodeTag11[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type Sub      = NodeTag11[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub]
  override type NoMessage =
    NodeTag11[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage, T8#NoMessage, T9#NoMessage, T10#NoMessage, T11#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag11[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag11[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result
    ], Type11#Left]
  })#II
  override type XyyItemType = XyyItem11[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], EatXyyType11[
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
    I11
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy11(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11)
}
class NodeTag12[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag11[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]
  override type Sub      = NodeTag12[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub]
  override type NoMessage = NodeTag12[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag12[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag12[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result
    ], Type12#Left]
  })#II
  override type XyyItemType = XyyItem12[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12], EatXyyType12[
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
    I12
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy12(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12)
}
class NodeTag13[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag12[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]
  override type Sub      = NodeTag13[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub]
  override type NoMessage = NodeTag13[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag13[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag13[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result
    ], Type13#Left]
  })#II
  override type XyyItemType = XyyItem13[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13], EatXyyType13[
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
    I13
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy13(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13)
}
class NodeTag14[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag13[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  override type Sub      = NodeTag14[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub]
  override type NoMessage = NodeTag14[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag14[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag14[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result
    ], Type14#Left]
  })#II
  override type XyyItemType = XyyItem14[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14], EatXyyType14[
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
    AppendNodeTagEatXyy.appendNodeTagEatXyy14(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14)
}
class NodeTag15[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag14[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15]
  override type Sub      = NodeTag15[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub, T15#Sub]
  override type NoMessage = NodeTag15[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag15[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag15[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result
    ], Type15#Left]
  })#II
  override type XyyItemType = XyyItem15[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag15[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15], EatXyyType15[
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
    I14,
    I15
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy15(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15)
}
class NodeTag16[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag15[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16]
  override type Sub      = NodeTag16[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub, T15#Sub, T16#Sub]
  override type NoMessage = NodeTag16[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag16[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag16[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result
    ], Type16#Left]
  })#II
  override type XyyItemType = XyyItem16[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag16[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16], EatXyyType16[
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
    I14,
    I15,
    I16
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy16(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16)
}
class NodeTag17[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type Sub =
    NodeTag17[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub, T15#Sub, T16#Sub, T17#Sub]
  override type NoMessage = NodeTag17[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag17[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag17[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result
    ], Type17#Left]
  })#II
  override type XyyItemType = XyyItem17[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType17[
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
    I14,
    I15,
    I16,
    I17
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy17(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17
    )
}
class NodeTag18[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag17[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]
  override type Sub =
    NodeTag18[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub, T12#Sub, T13#Sub, T14#Sub, T15#Sub, T16#Sub, T17#Sub, T18#Sub]
  override type NoMessage = NodeTag18[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage,
    T18#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag18[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag18[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result
    ], Type18#Left]
  })#II
  override type XyyItemType = XyyItem18[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam,
    I18 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`],
    dapp18: org.scalax.asuna.mapper.item.DebugApplication[K, T18, I18, `Application can not load with index 18, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18], EatXyyType18[
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
    I14,
    I15,
    I16,
    I17,
    I18
  ]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy18(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18
    )
}
class NodeTag19[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  T19 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag18[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19]
  override type Sub = NodeTag19[
    T1#Sub,
    T2#Sub,
    T3#Sub,
    T4#Sub,
    T5#Sub,
    T6#Sub,
    T7#Sub,
    T8#Sub,
    T9#Sub,
    T10#Sub,
    T11#Sub,
    T12#Sub,
    T13#Sub,
    T14#Sub,
    T15#Sub,
    T16#Sub,
    T17#Sub,
    T18#Sub,
    T19#Sub
  ]
  override type NoMessage = NodeTag19[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage,
    T18#NoMessage,
    T19#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag19[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type Type19 = T19#InputMessage[Type18#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag19[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result,
      Type19#Result
    ], Type19#Left]
  })#II
  override type XyyItemType = XyyItem19[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType,
    T19#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam,
    I18 <: org.scalax.asuna.mapper.item.TypeParam,
    I19 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`],
    dapp18: org.scalax.asuna.mapper.item.DebugApplication[K, T18, I18, `Application can not load with index 18, please eat xyy.`],
    dapp19: org.scalax.asuna.mapper.item.DebugApplication[K, T19, I19, `Application can not load with index 19, please eat xyy.`]
  )
    : org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag19[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11,
      T12,
      T13,
      T14,
      T15,
      T16,
      T17,
      T18,
      T19
    ], EatXyyType19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy19(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19
    )
}
class NodeTag20[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  T20 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag19[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20]
  override type Sub = NodeTag20[
    T1#Sub,
    T2#Sub,
    T3#Sub,
    T4#Sub,
    T5#Sub,
    T6#Sub,
    T7#Sub,
    T8#Sub,
    T9#Sub,
    T10#Sub,
    T11#Sub,
    T12#Sub,
    T13#Sub,
    T14#Sub,
    T15#Sub,
    T16#Sub,
    T17#Sub,
    T18#Sub,
    T19#Sub,
    T20#Sub
  ]
  override type NoMessage = NodeTag20[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage,
    T18#NoMessage,
    T19#NoMessage,
    T20#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag20[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type Type19 = T19#InputMessage[Type18#Left];
    type Type20 = T20#InputMessage[Type19#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag20[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result,
      Type19#Result,
      Type20#Result
    ], Type20#Left]
  })#II
  override type XyyItemType = XyyItem20[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType,
    T19#XyyItemType,
    T20#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam,
    I18 <: org.scalax.asuna.mapper.item.TypeParam,
    I19 <: org.scalax.asuna.mapper.item.TypeParam,
    I20 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`],
    dapp18: org.scalax.asuna.mapper.item.DebugApplication[K, T18, I18, `Application can not load with index 18, please eat xyy.`],
    dapp19: org.scalax.asuna.mapper.item.DebugApplication[K, T19, I19, `Application can not load with index 19, please eat xyy.`],
    dapp20: org.scalax.asuna.mapper.item.DebugApplication[K, T20, I20, `Application can not load with index 20, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag20[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20
  ], EatXyyType20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy20(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19,
      dapp20
    )
}
class NodeTag21[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  T21 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag20[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21]
  override type Sub = NodeTag21[
    T1#Sub,
    T2#Sub,
    T3#Sub,
    T4#Sub,
    T5#Sub,
    T6#Sub,
    T7#Sub,
    T8#Sub,
    T9#Sub,
    T10#Sub,
    T11#Sub,
    T12#Sub,
    T13#Sub,
    T14#Sub,
    T15#Sub,
    T16#Sub,
    T17#Sub,
    T18#Sub,
    T19#Sub,
    T20#Sub,
    T21#Sub
  ]
  override type NoMessage = NodeTag21[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage,
    T18#NoMessage,
    T19#NoMessage,
    T20#NoMessage,
    T21#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag21[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type Type19 = T19#InputMessage[Type18#Left];
    type Type20 = T20#InputMessage[Type19#Left];
    type Type21 = T21#InputMessage[Type20#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag21[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result,
      Type19#Result,
      Type20#Result,
      Type21#Result
    ], Type21#Left]
  })#II
  override type XyyItemType = XyyItem21[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType,
    T19#XyyItemType,
    T20#XyyItemType,
    T21#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam,
    I18 <: org.scalax.asuna.mapper.item.TypeParam,
    I19 <: org.scalax.asuna.mapper.item.TypeParam,
    I20 <: org.scalax.asuna.mapper.item.TypeParam,
    I21 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`],
    dapp18: org.scalax.asuna.mapper.item.DebugApplication[K, T18, I18, `Application can not load with index 18, please eat xyy.`],
    dapp19: org.scalax.asuna.mapper.item.DebugApplication[K, T19, I19, `Application can not load with index 19, please eat xyy.`],
    dapp20: org.scalax.asuna.mapper.item.DebugApplication[K, T20, I20, `Application can not load with index 20, please eat xyy.`],
    dapp21: org.scalax.asuna.mapper.item.DebugApplication[K, T21, I21, `Application can not load with index 21, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag21[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21
  ], EatXyyType21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy21(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19,
      dapp20,
      dapp21
    )
}
class NodeTag22[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  T21 <: org.scalax.asuna.mapper.item.ItemTag,
  T22 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag21[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  override type Sub = NodeTag22[
    T1#Sub,
    T2#Sub,
    T3#Sub,
    T4#Sub,
    T5#Sub,
    T6#Sub,
    T7#Sub,
    T8#Sub,
    T9#Sub,
    T10#Sub,
    T11#Sub,
    T12#Sub,
    T13#Sub,
    T14#Sub,
    T15#Sub,
    T16#Sub,
    T17#Sub,
    T18#Sub,
    T19#Sub,
    T20#Sub,
    T21#Sub,
    T22#Sub
  ]
  override type NoMessage = NodeTag22[
    T1#NoMessage,
    T2#NoMessage,
    T3#NoMessage,
    T4#NoMessage,
    T5#NoMessage,
    T6#NoMessage,
    T7#NoMessage,
    T8#NoMessage,
    T9#NoMessage,
    T10#NoMessage,
    T11#NoMessage,
    T12#NoMessage,
    T13#NoMessage,
    T14#NoMessage,
    T15#NoMessage,
    T16#NoMessage,
    T17#NoMessage,
    T18#NoMessage,
    T19#NoMessage,
    T20#NoMessage,
    T21#NoMessage,
    T22#NoMessage
  ]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag22[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type Type19 = T19#InputMessage[Type18#Left];
    type Type20 = T20#InputMessage[Type19#Left];
    type Type21 = T21#InputMessage[Type20#Left];
    type Type22 = T22#InputMessage[Type21#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag22[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result,
      Type19#Result,
      Type20#Result,
      Type21#Result,
      Type22#Result
    ], Type22#Left]
  })#II
  override type XyyItemType = XyyItem22[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType,
    T19#XyyItemType,
    T20#XyyItemType,
    T21#XyyItemType,
    T22#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam,
    I6 <: org.scalax.asuna.mapper.item.TypeParam,
    I7 <: org.scalax.asuna.mapper.item.TypeParam,
    I8 <: org.scalax.asuna.mapper.item.TypeParam,
    I9 <: org.scalax.asuna.mapper.item.TypeParam,
    I10 <: org.scalax.asuna.mapper.item.TypeParam,
    I11 <: org.scalax.asuna.mapper.item.TypeParam,
    I12 <: org.scalax.asuna.mapper.item.TypeParam,
    I13 <: org.scalax.asuna.mapper.item.TypeParam,
    I14 <: org.scalax.asuna.mapper.item.TypeParam,
    I15 <: org.scalax.asuna.mapper.item.TypeParam,
    I16 <: org.scalax.asuna.mapper.item.TypeParam,
    I17 <: org.scalax.asuna.mapper.item.TypeParam,
    I18 <: org.scalax.asuna.mapper.item.TypeParam,
    I19 <: org.scalax.asuna.mapper.item.TypeParam,
    I20 <: org.scalax.asuna.mapper.item.TypeParam,
    I21 <: org.scalax.asuna.mapper.item.TypeParam,
    I22 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.item.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.item.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.item.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.item.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.item.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.item.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`],
    dapp12: org.scalax.asuna.mapper.item.DebugApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`],
    dapp13: org.scalax.asuna.mapper.item.DebugApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`],
    dapp14: org.scalax.asuna.mapper.item.DebugApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`],
    dapp15: org.scalax.asuna.mapper.item.DebugApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`],
    dapp16: org.scalax.asuna.mapper.item.DebugApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`],
    dapp17: org.scalax.asuna.mapper.item.DebugApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`],
    dapp18: org.scalax.asuna.mapper.item.DebugApplication[K, T18, I18, `Application can not load with index 18, please eat xyy.`],
    dapp19: org.scalax.asuna.mapper.item.DebugApplication[K, T19, I19, `Application can not load with index 19, please eat xyy.`],
    dapp20: org.scalax.asuna.mapper.item.DebugApplication[K, T20, I20, `Application can not load with index 20, please eat xyy.`],
    dapp21: org.scalax.asuna.mapper.item.DebugApplication[K, T21, I21, `Application can not load with index 21, please eat xyy.`],
    dapp22: org.scalax.asuna.mapper.item.DebugApplication[K, T22, I22, `Application can not load with index 22, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag22[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22
  ], EatXyyType22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]] =
    AppendNodeTagEatXyy.appendNodeTagEatXyy22(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19,
      dapp20,
      dapp21,
      dapp22
    )
}
