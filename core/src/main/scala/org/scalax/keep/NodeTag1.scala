package org.scalax.asuna.mapper
import impl._

class NodeTag1[T1 <: ItemTag, M1 <: Message] extends ItemTag {
  override type XyyItemType     = Item1[T1#XyyItemType]
  override type M[M <: Message] = NodeTag1[T1, M :-<>-: M1]

  def debug[K <: KindContext, I1 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, Asuna.`Message： Please change .debug(context) to .find0.debug(context).`]
  ): Application[K, NodeTag1[T1, M1], EatXyyType1[I1]] =
    NodeTag1.appendNodeTagEatXyy1(dapp1)
}
object NodeTag1 {
  implicit def appendNodeTagEatXyy1[
    K <: KindContext,
    H1 <: ItemTag,
    T1 <: TypeParameter,
    M1 <: Message
  ](
    implicit t1: Application[K, H1, T1]
  ): Application[K, NodeTag1[H1, M1], EatXyyType1[T1]] =
    new Application[K, NodeTag1[H1, M1], EatXyyType1[T1]] {
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
