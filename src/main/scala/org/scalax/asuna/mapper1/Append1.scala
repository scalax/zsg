package org.scalax.asuna.ii.item
class ItemTag1[T1] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = T1
  override type HeadItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage                                       = org.scalax.asuna.mapper.item.EndItemTag
  override type XyyItemType                                     = XyyItem1[T1]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag1[(RawItem, I#RawItem)]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] =
    org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage1[T1, I#HeadItem], I#TailItem]
  def debug[K <: org.scalax.asuna.mapper.item.KindContext, I1 <: org.scalax.asuna.mapper.item.TypeParam](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag1[T1], EatXyyType1[I1]] =
    ItemTag1.appendEatXyy1(dapp1)
}
object ItemTag1 {
  implicit def appendEatXyy1[K <: org.scalax.asuna.mapper.item.KindContext, H1, T1 <: org.scalax.asuna.mapper.item.TypeParam](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag1[H1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag1[H1], EatXyyType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType1[T1]] = {
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
