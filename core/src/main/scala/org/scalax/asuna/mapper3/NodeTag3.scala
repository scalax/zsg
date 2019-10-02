package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class NodeTag3[T1 <: org.scalax.asuna.mapper.item.ItemTag, M1 <: org.scalax.asuna.mapper.item.Message, T2 <: org.scalax.asuna.mapper.item.ItemTag, M2 <: org.scalax.asuna.mapper.item.Message, T3 <: org.scalax.asuna.mapper.item.ItemTag, M3 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = Item3[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = NodeTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
  def find0: T1#M[Asuna.`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[Asuna.`Number： 2`] = throw new Exception("debugging...")
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam, I2 <: org.scalax.asuna.mapper.TypeParam, I3 <: org.scalax.asuna.mapper.TypeParam](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, Asuna.`Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, Asuna.`Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, Asuna.`Message： Please change .debug(context) to .find2.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[T1, M1, T2, M2, T3, M3], EatXyyType3[I1, I2, I3]] =
    NodeTag3.appendNodeTagEatXyy3(dapp1, dapp2, dapp3)
}
object NodeTag3 {
  implicit def appendNodeTagEatXyy3[K <: org.scalax.asuna.mapper.KindContext, H1 <: org.scalax.asuna.mapper.item.ItemTag, H2 <: org.scalax.asuna.mapper.item.ItemTag, H3 <: org.scalax.asuna.mapper.item.ItemTag, T1 <: org.scalax.asuna.mapper.TypeParam, M1 <: org.scalax.asuna.mapper.item.Message, T2 <: org.scalax.asuna.mapper.TypeParam, M2 <: org.scalax.asuna.mapper.item.Message, T3 <: org.scalax.asuna.mapper.TypeParam, M3 <: org.scalax.asuna.mapper.item.Message](implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1], t2: org.scalax.asuna.mapper.Application[K, H2, T2], t3: org.scalax.asuna.mapper.Application[K, H3, T3]): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag3[H1, M1, H2, M2, H3, M3], EatXyyType3[T1, T2, T3]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType3[T1, T2, T3]] = {
        if (context.isReverse) {
          context.append(NodeTag2.appendNodeTagEatXyy2(t2, t3).application(context), t1.application(context), ArticleXyyPlus3.put3)
        } else {
          context.append(NodeTag2.appendNodeTagEatXyy2(t1, t2).application(context), t3.application(context), ArticleXyyPlus3.plus3)
        }
      }
    }
}
class `Please change .debug(context) to .find3.debug(context).` extends org.scalax.asuna.mapper.item.Message
