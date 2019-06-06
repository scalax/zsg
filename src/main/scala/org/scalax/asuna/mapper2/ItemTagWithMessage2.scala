package org.scalax.asuna.mapper.item
class ItemTagWithMessage2[T1, Message1 <: org.scalax.asuna.mapper.item.Message, T2, Message2 <: org.scalax.asuna.mapper.item.Message]
    extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type XyyItemType = XyyItem2[T1, T2]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] =
    org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage2[T1, I#HeadItem, T2, I#TailItem#HeadItem], I#TailItem#TailItem]
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam, I2 <: org.scalax.asuna.mapper.TypeParam](
    c: org.scalax.asuna.mapper.Context[K]
  )(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, Message1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, Message2]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag2[T1, T2], EatXyyType2[I1, I2]] =
    ItemTag2.appendEatXyy2(dapp1, dapp2)
}
object ItemTagWithMessage2 {
  implicit def appendEatXyy2[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    Message1 <: org.scalax.asuna.mapper.item.Message,
    Message2 <: org.scalax.asuna.mapper.item.Message,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage2[H1, Message1, H2, Message2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTagWithMessage2[H1, Message1, H2, Message2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyPlus2.put2)
        } else {
          context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyPlus2.plus2)
        }
      }
    }
}
