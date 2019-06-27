package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class ItemTag4[
  T1,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4,
  M4 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = XyyItem4[T1, T2, T3, T4]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag4[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1],
    dapp2: org.scalax.asuna.mapper.DebugItemApplication[K, T2, I2, M2],
    dapp3: org.scalax.asuna.mapper.DebugItemApplication[K, T3, I3, M3],
    dapp4: org.scalax.asuna.mapper.DebugItemApplication[K, T4, I4, M4]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag4[T1, M1, T2, M2, T3, M3, T4, M4], EatXyyType4[I1, I2, I3, I4]] =
    ItemTag4.appendEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
object ItemTag4 {
  implicit def appendEatXyy4[
    K <: org.scalax.asuna.mapper.KindContext,
    H1,
    H2,
    H3,
    H4,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    M1 <: org.scalax.asuna.mapper.item.Message,
    M2 <: org.scalax.asuna.mapper.item.Message,
    M3 <: org.scalax.asuna.mapper.item.Message,
    M4 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag4[H1, M1, H2, M2, H3, M3, H4, M4], EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag4[H1, M1, H2, M2, H3, M3, H4, M4], EatXyyType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(ItemTag3.appendEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyPlus4.put4)
        } else {
          context.append(ItemTag3.appendEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyPlus4.plus4)
        }
      }
    }
}
