package org.scalax.asuna.mapper

import impl._

class ItemTag1[T1, M1 <: Message] extends ItemTag {
  override type XyyItemType     = Item1[T1]
  override type M[M <: Message] = ItemTag1[T1, M :-<>-: M1]

  def debug[K <: KindContext, I1 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugItemApplication[K, T1, I1, M1]
  ): Application[K, ItemTag1[T1, Message], EatXyyType1[I1]] =
    ItemTag1.appendEatXyy1(dapp1)
}
object ItemTag1 {
  implicit def appendEatXyy1[K <: KindContext, H1, T1 <: TypeParameter, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, ItemTag1[H1, M1], EatXyyType1[T1]] =
    new Application[K, ItemTag1[H1, M1], EatXyyType1[T1]] {
      override def application(context: Context[K]): K#M[EatXyyType1[T1]] = {
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
