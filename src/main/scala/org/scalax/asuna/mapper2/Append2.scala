package org.scalax.asuna.ii.item
class ItemTag2[T1, T2] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = T1
  override type HeadItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem                                        = ItemTag1[T2]
  override type Sub                                             = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage                                       = ItemTag2[T1, T2]
  override type XyyItemType                                     = XyyItem2[T1, T2]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag2[(RawItem, I#RawItem), (TailItem#RawItem, I#TailItem#RawItem)]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] =
    org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage2[T1, I#HeadItem, T2, I#TailItem#HeadItem], I#TailItem#TailItem]
  def debug[K <: org.scalax.asuna.mapper.item.KindContext, I1 <: org.scalax.asuna.mapper.item.TypeParam, I2 <: org.scalax.asuna.mapper.item.TypeParam](
      c: org.scalax.asuna.mapper.item.Context[K]
  )(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag2[T1, T2], EatXyyType2[I1, I2]] =
    ItemTag2.appendEatXyy2(dapp1, dapp2)
}
object ItemTag2 {
  implicit def appendEatXyy2[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1
    , H2
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag2[H1, H2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag2[H1, H2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyPlus2.put2)
        } else {
          context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyPlus2.plus2)
        }
      }
    }
}
