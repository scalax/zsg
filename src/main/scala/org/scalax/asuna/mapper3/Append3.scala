package org.scalax.asuna.ii.item
class ItemTag3[T1, T2, T3] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag2[T2, T3]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag3[T1, T2, T3]
  override type XyyItemType = XyyItem3[T1, T2, T3]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] =
    ItemTag3[(RawItem, I#RawItem), (TailItem#RawItem, I#TailItem#RawItem), (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage3[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag3[T1, T2, T3], EatXyyType3[I1, I2, I3]] =
    ItemTag3.appendEatXyy3(dapp1, dapp2, dapp3)
}
object ItemTag3 {
  implicit def appendEatXyy3[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag3[H1, H2, H3], EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag3[H1, H2, H3], EatXyyType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(ItemTag2.appendEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus3.put3)
        } else {
          context.append(ItemTag2.appendEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus3.plus3)
        }
      }
    }
}
