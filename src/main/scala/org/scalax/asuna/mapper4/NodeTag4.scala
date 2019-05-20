package org.scalax.asuna.ii.item
class NodeTag4[
    T1 <: org.scalax.asuna.mapper.item.ItemTag
  , T2 <: org.scalax.asuna.mapper.item.ItemTag
  , T3 <: org.scalax.asuna.mapper.item.ItemTag
  , T4 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem   = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem  = T1
  override type TailItem  = NodeTag3[T2, T3, T4]
  override type Sub       = NodeTag4[T1#Sub, T2#Sub, T3#Sub, T4#Sub]
  override type NoMessage = NodeTag4[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag4[
      HeadItem#Sub#Pull[I#HeadItem#Sub]
    , TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub]
    , TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub]
    , TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub]
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
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag4[T1, T2, T3, T4], EatXyyType4[I1, I2, I3, I4]] =
    NodeTag4.appendNodeTagEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
object NodeTag4 {
  implicit def appendNodeTagEatXyy4[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , H2 <: org.scalax.asuna.mapper.item.ItemTag
    , H3 <: org.scalax.asuna.mapper.item.ItemTag
    , H4 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(NodeTag3.appendNodeTagEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyPlus.put4)
        } else {
          context.append(NodeTag3.appendNodeTagEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyPlus.plus4)
        }
      }
    }
}
