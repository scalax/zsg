package org.scalax.asuna.ii.item
class ItemTag4[T1, T2, T3, T4] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag3[T2, T3, T4]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag4[T1, T2, T3, T4]
  override type XyyItemType = XyyItem4[T1, T2, T3, T4]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag4[
      (RawItem, I#RawItem)
    , (TailItem#RawItem, I#TailItem#RawItem)
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage4[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag4[T1, T2, T3, T4], EatXyyType4[I1, I2, I3, I4]] =
    ItemTag4.appendEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
object ItemTag4 {
  implicit def appendEatXyy4[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1
    , H2
    , H3
    , H4
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(ItemTag3.appendEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyPlus4.put4)
        } else {
          context.append(ItemTag3.appendEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyPlus4.plus4)
        }
      }
    }
}
