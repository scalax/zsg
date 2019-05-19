package org.scalax.asuna.ii.item
class ItemTag5[T1, T2, T3, T4, T5] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag4[T2, T3, T4, T5]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag5[T1, T2, T3, T4, T5]
  override type XyyItemType = XyyItem5[T1, T2, T3, T4, T5]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag5[
    (RawItem, I#RawItem),
    (TailItem#RawItem, I#TailItem#RawItem),
    (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem),
    (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem),
    (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage5[
    T1,
    I#HeadItem,
    T2,
    I#TailItem#HeadItem,
    T3,
    I#TailItem#TailItem#HeadItem,
    T4,
    I#TailItem#TailItem#TailItem#HeadItem,
    T5,
    I#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
    K <: org.scalax.asuna.mapper.item.KindContext,
    I1 <: org.scalax.asuna.mapper.item.TypeParam,
    I2 <: org.scalax.asuna.mapper.item.TypeParam,
    I3 <: org.scalax.asuna.mapper.item.TypeParam,
    I4 <: org.scalax.asuna.mapper.item.TypeParam,
    I5 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag5[T1, T2, T3, T4, T5], EatXyyType5[I1, I2, I3, I4, I5]] =
    ItemTag5.appendEatXyy5(dapp1, dapp2, dapp3, dapp4, dapp5)
}
object ItemTag5 {
  implicit def appendEatXyy5[
    K <: org.scalax.asuna.mapper.item.KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    T1 <: org.scalax.asuna.mapper.item.TypeParam,
    T2 <: org.scalax.asuna.mapper.item.TypeParam,
    T3 <: org.scalax.asuna.mapper.item.TypeParam,
    T4 <: org.scalax.asuna.mapper.item.TypeParam,
    T5 <: org.scalax.asuna.mapper.item.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.item.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.item.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.item.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag5[H1, H2, H3, H4, H5], EatXyyType5[T1, T2, T3, T4, T5]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType5[T1, T2, T3, T4, T5]] = {
        if (context.isReverse) {
          context.append(ItemTag4.appendEatXyy4(t2, t3, t4, t5).application(context), t1.application(context), ArticleXyyPlus.put5)
        } else {
          context.append(ItemTag4.appendEatXyy4(t1, t2, t3, t4).application(context), t5.application(context), ArticleXyyPlus.plus5)
        }
      }
    }
}
