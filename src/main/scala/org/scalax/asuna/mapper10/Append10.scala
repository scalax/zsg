package org.scalax.asuna.ii.item
class ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag9[T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type XyyItemType = XyyItem10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag10[
      (RawItem, I#RawItem)
    , (TailItem#RawItem, I#TailItem#RawItem)
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage10[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10], EatXyyType10[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
  ]] =
    ItemTag10.appendEatXyy10(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10)
}
object ItemTag10 {
  implicit def appendEatXyy10[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1
    , H2
    , H3
    , H4
    , H5
    , H6
    , H7
    , H8
    , H9
    , H10
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
    , T6 <: org.scalax.asuna.mapper.item.TypeParam
    , T7 <: org.scalax.asuna.mapper.item.TypeParam
    , T8 <: org.scalax.asuna.mapper.item.TypeParam
    , T9 <: org.scalax.asuna.mapper.item.TypeParam
    , T10 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
    , t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
    , t6: org.scalax.asuna.mapper.item.Application[K, H6, T6]
    , t7: org.scalax.asuna.mapper.item.Application[K, H7, T7]
    , t8: org.scalax.asuna.mapper.item.Application[K, H8, T8]
    , t9: org.scalax.asuna.mapper.item.Application[K, H9, T9]
    , t10: org.scalax.asuna.mapper.item.Application[K, H10, T10]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], EatXyyType10[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
  ]] =
    new org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag10[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10], EatXyyType10[
        T1
      , T2
      , T3
      , T4
      , T5
      , T6
      , T7
      , T8
      , T9
      , T10
    ]] {
      override def application(context: org.scalax.asuna.mapper.item.Context[K]): K#M[EatXyyType10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = {
        if (context.isReverse) {
          context.append(ItemTag9.appendEatXyy9(t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t1.application(context), ArticleXyyPlus10.put10)
        } else {
          context.append(ItemTag9.appendEatXyy9(t1, t2, t3, t4, t5, t6, t7, t8, t9).application(context), t10.application(context), ArticleXyyPlus10.plus10)
        }
      }
    }
}
