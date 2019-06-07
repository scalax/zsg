package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class ItemTag2[T1, M1 <: org.scalax.asuna.mapper.item.Message, T2, M2 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = XyyItem2[T1, T2]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam, I2 <: org.scalax.asuna.mapper.TypeParam](
    c: org.scalax.asuna.mapper.Context[K]
  )(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, M2]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag2[T1, M1, T2, M2], EatXyyType2[I1, I2]] =
    ItemTag2.appendEatXyy2(dapp1, dapp2)
}
object ItemTag2 {
  implicit def appendEatXyy2[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    M1 <: org.scalax.asuna.mapper.item.Message,
    M2 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag2[H1, M1, H2, M2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag2[H1, M1, H2, M2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(ItemTag1.appendEatXyy1(t2).application(context), t1.application(context), ArticleXyyPlus2.put2)
        } else {
          context.append(ItemTag1.appendEatXyy1(t1).application(context), t2.application(context), ArticleXyyPlus2.plus2)
        }
      }
    }
}
