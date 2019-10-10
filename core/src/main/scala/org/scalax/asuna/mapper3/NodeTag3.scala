package org.scalax.asuna.mapper
import impl._
class NodeTag3[T1 <: ItemTag, M1 <: Message, T2 <: ItemTag, M2 <: Message, T3 <: ItemTag, M3 <: Message] extends ItemTag {
  override type XyyItemType     = Item3[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType]
  override type M[M <: Message] = NodeTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def find0: T1#M[Asuna.`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[Asuna.`Number： 2`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeParameter, I2 <: TypeParameter, I3 <: TypeParameter](c: Context[K])(
    implicit
    dapp1: DebugApplication[K, T1, I1, Asuna.`Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, Asuna.`Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, Asuna.`Message： Please change .debug(context) to .find2.debug(context).`]
  ): Application[K, NodeTag3[T1, M1, T2, M2, T3, M3], EatXyyType3[I1, I2, I3]] =
    NodeTag3.appendNodeTagEatXyy3(dapp1, dapp2, dapp3)
}
object NodeTag3 {
  implicit def appendNodeTagEatXyy3[
    K <: KindContext,
    H1 <: ItemTag,
    H2 <: ItemTag,
    H3 <: ItemTag,
    T1 <: TypeParameter,
    M1 <: Message,
    T2 <: TypeParameter,
    M2 <: Message,
    T3 <: TypeParameter,
    M3 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] =
    new Application[K, NodeTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] {
      override def application(context: Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(NodeTag2.appendNodeTagEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus3.put3)
        } else {
          context.append(NodeTag2.appendNodeTagEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus3.plus3)
        }
      }
    }
}
class `Please change .debug(context) to .find3.debug(context).` extends Message
