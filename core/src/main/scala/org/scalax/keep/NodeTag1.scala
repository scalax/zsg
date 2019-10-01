package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._

class NodeTag1[T1 <: org.scalax.asuna.mapper.item.ItemTag, M1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = Item1[T1#XyyItemType]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = NodeTag1[T1, M :-<>-: M1]

  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, Asuna.`Message: Please change .debug(context) to .find0.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[T1, M1], EatXyyType1[I1]] =
    NodeTag1.appendNodeTagEatXyy1(dapp1)
}
object NodeTag1 {
  implicit def appendNodeTagEatXyy1[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    M1 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[H1, M1], EatXyyType1[T1]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag1[H1, M1], EatXyyType1[T1]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType1[T1]] = {
        if (context.useHList) {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPut1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.hlistPlus1)
          }
        } else {
          if (context.isReverse) {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Put1)
          } else {
            context.append(context.start, t1.application(context), ArticleXyyPlus.item2Plus1)
          }
        }
      }
    }
}
