package org.scalax.asuna.mapper.item

import org.scalax.asuna.mapper.item.impl._

class ItemTag1[T1, M1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = Item1[T1]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag1[T1, M :-<>-: M1]

  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[T1, org.scalax.asuna.mapper.item.Message], EatXyyType1[I1]] =
    ItemTag1.appendEatXyy1(dapp1)
}
object ItemTag1 {
  implicit def appendEatXyy1[K <: org.scalax.asuna.mapper.KindContext, H1, T1 <: org.scalax.asuna.mapper.TypeParam, M1 <: org.scalax.asuna.mapper.item.Message](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[H1, M1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[H1, M1], EatXyyType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType1[T1]] = {
        //if (context.useHList) {
        if (context.isReverse) {
          context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPut1)
        } else {
          context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPlus1)
        }
        /*} else {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Put1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Plus1)
          }
        }*/
      }
    }

}
