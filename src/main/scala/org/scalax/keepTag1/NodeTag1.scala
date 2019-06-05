package org.scalax.asuna.mapper.item
class NodeTag1[T1 <: org.scalax.asuna.mapper.item.ItemTag] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem                                        = T1
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = NodeTag1[T1#Sub]
  override type NoMessage                                       = NodeTag1[T1#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag1[HeadItem#Sub#Pull[I#HeadItem#Sub]]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag1[Type1#Result], Type1#Left]
  })#II
  override type XyyItemType = XyyItem1[T1#XyyItemType]
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[T1], EatXyyType1[I1]] =
    NodeTag1.appendNodeTagEatXyy1(dapp1)
}
object NodeTag1 {
  implicit def appendNodeTagEatXyy1[
      K <: org.scalax.asuna.mapper.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[H1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[H1], EatXyyType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType1[T1]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPut1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPlus1)
          }
        } else {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Put1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Plus1)
          }
        }
      }
    }
}
