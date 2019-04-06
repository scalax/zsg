package org.scalax.asuna.ii.item
class NodeTagWithMessage1[T1 <: org.scalax.asuna.mapper.item.ItemTag, M1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem                                        = T1
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = NodeTagWithMessage1[T1#Sub, M1]
  override type NoMessage                                       = NodeTag1[T1#Sub]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag1[HeadItem#Sub#Pull[I#HeadItem#Sub]]
}
class NodeTagWithMessage2[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem                                        = T1
  override type TailItem                                        = NodeTagWithMessage1[T2, M2]
  override type Sub                                             = NodeTagWithMessage2[T1#Sub, M1, T2#Sub, M2]
  override type NoMessage                                       = NodeTag2[T1#NoMessage, T2#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag2[HeadItem#Sub#Pull[I#HeadItem#Sub], TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub]]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage2[Type1#Result, M1, Type2#Result, M2], Type2#Left]
  })#II
}
class NodeTagWithMessage3[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage2[T2, M2, T3, M3]
  override type Sub       = NodeTagWithMessage3[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3]
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
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage3[Type1#Result, M1, Type2#Result, M2, Type3#Result, M3], Type3#Left]
  })#II
}
class NodeTagWithMessage4[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage3[T2, M2, T3, M3, T4, M4]
  override type Sub       = NodeTagWithMessage4[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4]
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
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage4[Type1#Result, M1, Type2#Result, M2, Type3#Result, M3, Type4#Result, M4], Type4#Left]
  })#II
}
class NodeTagWithMessage5[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage4[T2, M2, T3, M3, T4, M4, T5, M5]
  override type Sub       = NodeTagWithMessage5[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage5[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5
    ], Type5#Left]
  })#II
}
class NodeTagWithMessage6[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage5[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6]
  override type Sub       = NodeTagWithMessage6[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage6[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6
    ], Type6#Left]
  })#II
}
class NodeTagWithMessage7[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage6[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7]
  override type Sub       = NodeTagWithMessage7[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6, T7#Sub, M7]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage7[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7
    ], Type7#Left]
  })#II
}
class NodeTagWithMessage8[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage7[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8]
  override type Sub       = NodeTagWithMessage8[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6, T7#Sub, M7, T8#Sub, M8]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage8[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8
    ], Type8#Left]
  })#II
}
class NodeTagWithMessage9[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTagWithMessage8[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9]
  override type Sub       = NodeTagWithMessage9[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6, T7#Sub, M7, T8#Sub, M8, T9#Sub, M9]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage9[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9
    ], Type9#Left]
  })#II
}
class NodeTagWithMessage10[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage9[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10]
  override type Sub      = NodeTagWithMessage10[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6, T7#Sub, M7, T8#Sub, M8, T9#Sub, M9, T10#Sub, M10]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage10[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10
    ], Type10#Left]
  })#II
}
class NodeTagWithMessage11[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage10[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11]
  override type Sub =
    NodeTagWithMessage11[T1#Sub, M1, T2#Sub, M2, T3#Sub, M3, T4#Sub, M4, T5#Sub, M5, T6#Sub, M6, T7#Sub, M7, T8#Sub, M8, T9#Sub, M9, T10#Sub, M10, T11#Sub, M11]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage11[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11
    ], Type11#Left]
  })#II
}
class NodeTagWithMessage12[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage11[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12]
  override type Sub = NodeTagWithMessage12[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage12[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12
    ], Type12#Left]
  })#II
}
class NodeTagWithMessage13[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage12[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13]
  override type Sub = NodeTagWithMessage13[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage13[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13
    ], Type13#Left]
  })#II
}
class NodeTagWithMessage14[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage13[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14]
  override type Sub = NodeTagWithMessage14[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage14[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14
    ], Type14#Left]
  })#II
}
class NodeTagWithMessage15[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem =
    NodeTagWithMessage14[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14, T15, M15]
  override type Sub = NodeTagWithMessage15[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage15[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15
    ], Type15#Left]
  })#II
}
class NodeTagWithMessage16[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem =
    NodeTagWithMessage15[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14, T15, M15, T16, M16]
  override type Sub = NodeTagWithMessage16[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage16[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16
    ], Type16#Left]
  })#II
}
class NodeTagWithMessage17[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem =
    NodeTagWithMessage16[T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14, T15, M15, T16, M16, T17, M17]
  override type Sub = NodeTagWithMessage17[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage17[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17
    ], Type17#Left]
  })#II
}
class NodeTagWithMessage18[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  M18 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage17[
    T2,
    M2,
    T3,
    M3,
    T4,
    M4,
    T5,
    M5,
    T6,
    M6,
    T7,
    M7,
    T8,
    M8,
    T9,
    M9,
    T10,
    M10,
    T11,
    M11,
    T12,
    M12,
    T13,
    M13,
    T14,
    M14,
    T15,
    M15,
    T16,
    M16,
    T17,
    M17,
    T18,
    M18
  ]
  override type Sub = NodeTagWithMessage18[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17,
    T18#Sub,
    M18
  ]
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage18[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17,
      Type18#Result,
      M18
    ], Type18#Left]
  })#II
}
class NodeTagWithMessage19[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  M18 <: org.scalax.asuna.mapper.item.Message,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  M19 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage18[
    T2,
    M2,
    T3,
    M3,
    T4,
    M4,
    T5,
    M5,
    T6,
    M6,
    T7,
    M7,
    T8,
    M8,
    T9,
    M9,
    T10,
    M10,
    T11,
    M11,
    T12,
    M12,
    T13,
    M13,
    T14,
    M14,
    T15,
    M15,
    T16,
    M16,
    T17,
    M17,
    T18,
    M18,
    T19,
    M19
  ]
  override type Sub = NodeTagWithMessage19[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17,
    T18#Sub,
    M18,
    T19#Sub,
    M19
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage19[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17,
      Type18#Result,
      M18,
      Type19#Result,
      M19
    ], Type19#Left]
  })#II
}
class NodeTagWithMessage20[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  M18 <: org.scalax.asuna.mapper.item.Message,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  M19 <: org.scalax.asuna.mapper.item.Message,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  M20 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage19[
    T2,
    M2,
    T3,
    M3,
    T4,
    M4,
    T5,
    M5,
    T6,
    M6,
    T7,
    M7,
    T8,
    M8,
    T9,
    M9,
    T10,
    M10,
    T11,
    M11,
    T12,
    M12,
    T13,
    M13,
    T14,
    M14,
    T15,
    M15,
    T16,
    M16,
    T17,
    M17,
    T18,
    M18,
    T19,
    M19,
    T20,
    M20
  ]
  override type Sub = NodeTagWithMessage20[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17,
    T18#Sub,
    M18,
    T19#Sub,
    M19,
    T20#Sub,
    M20
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage20[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17,
      Type18#Result,
      M18,
      Type19#Result,
      M19,
      Type20#Result,
      M20
    ], Type20#Left]
  })#II
}
class NodeTagWithMessage21[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  M18 <: org.scalax.asuna.mapper.item.Message,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  M19 <: org.scalax.asuna.mapper.item.Message,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  M20 <: org.scalax.asuna.mapper.item.Message,
  T21 <: org.scalax.asuna.mapper.item.ItemTag,
  M21 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage20[
    T2,
    M2,
    T3,
    M3,
    T4,
    M4,
    T5,
    M5,
    T6,
    M6,
    T7,
    M7,
    T8,
    M8,
    T9,
    M9,
    T10,
    M10,
    T11,
    M11,
    T12,
    M12,
    T13,
    M13,
    T14,
    M14,
    T15,
    M15,
    T16,
    M16,
    T17,
    M17,
    T18,
    M18,
    T19,
    M19,
    T20,
    M20,
    T21,
    M21
  ]
  override type Sub = NodeTagWithMessage21[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17,
    T18#Sub,
    M18,
    T19#Sub,
    M19,
    T20#Sub,
    M20,
    T21#Sub,
    M21
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage21[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17,
      Type18#Result,
      M18,
      Type19#Result,
      M19,
      Type20#Result,
      M20,
      Type21#Result,
      M21
    ], Type21#Left]
  })#II
}
class NodeTagWithMessage22[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  M15 <: org.scalax.asuna.mapper.item.Message,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  M16 <: org.scalax.asuna.mapper.item.Message,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  M17 <: org.scalax.asuna.mapper.item.Message,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  M18 <: org.scalax.asuna.mapper.item.Message,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  M19 <: org.scalax.asuna.mapper.item.Message,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  M20 <: org.scalax.asuna.mapper.item.Message,
  T21 <: org.scalax.asuna.mapper.item.ItemTag,
  M21 <: org.scalax.asuna.mapper.item.Message,
  T22 <: org.scalax.asuna.mapper.item.ItemTag,
  M22 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTagWithMessage21[
    T2,
    M2,
    T3,
    M3,
    T4,
    M4,
    T5,
    M5,
    T6,
    M6,
    T7,
    M7,
    T8,
    M8,
    T9,
    M9,
    T10,
    M10,
    T11,
    M11,
    T12,
    M12,
    T13,
    M13,
    T14,
    M14,
    T15,
    M15,
    T16,
    M16,
    T17,
    M17,
    T18,
    M18,
    T19,
    M19,
    T20,
    M20,
    T21,
    M21,
    T22,
    M22
  ]
  override type Sub = NodeTagWithMessage22[
    T1#Sub,
    M1,
    T2#Sub,
    M2,
    T3#Sub,
    M3,
    T4#Sub,
    M4,
    T5#Sub,
    M5,
    T6#Sub,
    M6,
    T7#Sub,
    M7,
    T8#Sub,
    M8,
    T9#Sub,
    M9,
    T10#Sub,
    M10,
    T11#Sub,
    M11,
    T12#Sub,
    M12,
    T13#Sub,
    M13,
    T14#Sub,
    M14,
    T15#Sub,
    M15,
    T16#Sub,
    M16,
    T17#Sub,
    M17,
    T18#Sub,
    M18,
    T19#Sub,
    M19,
    T20#Sub,
    M20,
    T21#Sub,
    M21,
    T22#Sub,
    M22
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
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTagWithMessage22[
      Type1#Result,
      M1,
      Type2#Result,
      M2,
      Type3#Result,
      M3,
      Type4#Result,
      M4,
      Type5#Result,
      M5,
      Type6#Result,
      M6,
      Type7#Result,
      M7,
      Type8#Result,
      M8,
      Type9#Result,
      M9,
      Type10#Result,
      M10,
      Type11#Result,
      M11,
      Type12#Result,
      M12,
      Type13#Result,
      M13,
      Type14#Result,
      M14,
      Type15#Result,
      M15,
      Type16#Result,
      M16,
      Type17#Result,
      M17,
      Type18#Result,
      M18,
      Type19#Result,
      M19,
      Type20#Result,
      M20,
      Type21#Result,
      M21,
      Type22#Result,
      M22
    ], Type22#Left]
  })#II
}
