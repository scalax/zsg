package org.scalax.asuna.ii.item
class NodeTag5[
    T1 <: org.scalax.asuna.mapper.item.ItemTag
  , T2 <: org.scalax.asuna.mapper.item.ItemTag
  , T3 <: org.scalax.asuna.mapper.item.ItemTag
  , T4 <: org.scalax.asuna.mapper.item.ItemTag
  , T5 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag4[T2, T3, T4, T5]
  override type Sub       = NodeTag5[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub]
  override type NoMessage = NodeTag5[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag5[
      HeadItem#Sub#Pull[I#HeadItem#Sub]
    , TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub]
    , TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub]
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
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
    , dapp5: org.scalax.asuna.mapper.item.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag5[T1, T2, T3, T4, T5], EatXyyType5[I1, I2, I3, I4, I5]] =
    NodeTag5.appendNodeTagEatXyy5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
object NodeTag5 {
  implicit def appendNodeTagEatXyy5[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , H2 <: org.scalax.asuna.mapper.item.ItemTag
    , H3 <: org.scalax.asuna.mapper.item.ItemTag
    , H4 <: org.scalax.asuna.mapper.item.ItemTag
    , H5 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
    , t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(NodeTag4.appendNodeTagEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyPlus.put5)
        } else {
          context.append(NodeTag4.appendNodeTagEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyPlus.plus5)
        }
      }
    }
}