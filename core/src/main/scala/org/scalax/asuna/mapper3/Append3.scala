package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class ItemTag3[T1, M1 <: org.scalax.asuna.mapper.item.Message, T2, M2 <: org.scalax.asuna.mapper.item.Message, T3, M3 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = Item3[T1, T2, T3]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam, I2 <: org.scalax.asuna.mapper.TypeParam, I3 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, M2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, M3]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag3[T1, M1, T2, M2, T3, M3], EatXyyType3[I1, I2, I3]] =
    ItemTag3.appendEatXyy3(dapp1, dapp2, dapp3)
}
object ItemTag3 {
  implicit def appendEatXyy3[K <: org.scalax.asuna.mapper.KindContext, H1, H2, H3, T1 <: org.scalax.asuna.mapper.TypeParam, T2 <: org.scalax.asuna.mapper.TypeParam, T3 <: org.scalax.asuna.mapper.TypeParam, M1 <: org.scalax.asuna.mapper.item.Message, M2 <: org.scalax.asuna.mapper.item.Message, M3 <: org.scalax.asuna.mapper.item.Message](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3]): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(ItemTag2.appendEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus3.put3)
        } else {
          context.append(ItemTag2.appendEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus3.plus3)
        }
      }
    }
}
