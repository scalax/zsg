package org.scalax.asuna.mapper.item

import org.scalax.asuna.mapper.item.impl._

class ItemTag1[T1, M1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  /*override type XyyItemType                                  = Item1[T1]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = ItemTag1[T1, M :-<>-: M1]*/

  /*def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugItemApplication[K, T1, I1, M1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[T1, org.scalax.asuna.mapper.item.Message], EatXyyType1[I1]] =
    ItemTag1.appendEatXyy1(dapp1)*/
}
/*object ItemTag1 {
  implicit def appendEatXyy1[K <: org.scalax.asuna.mapper.TypeResult, H1, T1 <: K, M1 <: org.scalax.asuna.mapper.item.Message](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[H1, M1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.ItemTag1[H1, M1], EatXyyType1[T1]] {
      override val typeResult: EatXyyType1[t1.typeResult.TP] = new EatXyyType1[t1.typeResult.TP](t1.typeResult.typeParam) { }
      override def application(context: org.scalax.asuna.mapper.Context[K]): EatXyyType1[t1.typeResult.Result] = {
        if (context.isReverse) {
          context.append(context.start, t1.application(context), ArticleXyyPlus1.hlistPut1(t1.typeResult.typeParam))
        } else {
          context.append(context.start, t1.application(context), ArticleXyyPlus1.hlistPlus1(t1.typeResult.typeParam))
        }
      }
    }

}*/
