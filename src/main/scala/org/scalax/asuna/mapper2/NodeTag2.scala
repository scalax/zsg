package org.scalax.asuna.ii.item
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
    dapp1: org.scalax.asuna.mapper.item.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag2[T1, T2], EatXyyType2[I1, I2]] =
    NodeTag2.appendNodeTagEatXyy2(dapp1, dapp2)
}
object NodeTag2 {
  implicit def appendNodeTagEatXyy2[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , H2 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag2[H1, H2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.NodeTag2[H1, H2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(NodeTag1.appendNodeTagEatXyy1(t2).application(context), t1.application(context), ArticleXyyPlus.put2)
        } else {
          context.append(NodeTag1.appendNodeTagEatXyy1(t1).application(context), t2.application(context), ArticleXyyPlus.plus2)
        }
      }
    }
}
class `Application can not load with index 2, please eat xyy.` extends org.scalax.asuna.mapper.item.Message
