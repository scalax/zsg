package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class NodeTag2[
    T1 <: org.scalax.asuna.mapper.item.ItemTag
  , M1 <: org.scalax.asuna.mapper.item.Message
  , T2 <: org.scalax.asuna.mapper.item.ItemTag
  , M2 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType                                  = XyyItem2[T1#XyyItemType, T2#XyyItemType]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = NodeTag2[T1, M :-<>-: M1, T2, M :-<>-: M2]
  def find0: T1#M[Asuna.`Number: 0`] = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number: 1`] = throw new Exception("debugging...")
  def debug[K <: org.scalax.asuna.mapper.KindContext, I1 <: org.scalax.asuna.mapper.TypeParam, I2 <: org.scalax.asuna.mapper.TypeParam](
      c: org.scalax.asuna.mapper.Context[K]
  )(
      implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, Asuna.`Message: Please change .debug(context) to .find0.debug(context).`]
    , dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, Asuna.`Message: Please change .debug(context) to .find1.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag2[T1, M1, T2, M2], EatXyyType2[I1, I2]] =
    NodeTag2.appendNodeTagEatXyy2(dapp1, dapp2)
}
object NodeTag2 {
  implicit def appendNodeTagEatXyy2[
      K <: org.scalax.asuna.mapper.KindContext
    , H1 <: org.scalax.asuna.mapper.item.ItemTag
    , H2 <: org.scalax.asuna.mapper.item.ItemTag
    , T1 <: org.scalax.asuna.mapper.TypeParam
    , M1 <: org.scalax.asuna.mapper.item.Message
    , T2 <: org.scalax.asuna.mapper.TypeParam
    , M2 <: org.scalax.asuna.mapper.item.Message
  ](
      implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.Application[K, H2, T2]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag2[H1, M1, H2, M2], EatXyyType2[T1, T2]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag2[H1, M1, H2, M2], EatXyyType2[T1, T2]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType2[T1, T2]] = {
        if (context.isReverse) {
          context.append(NodeTag1.appendNodeTagEatXyy1(t2).application(context), t1.application(context), ArticleXyyPlus2.put2)
        } else {
          context.append(NodeTag1.appendNodeTagEatXyy1(t1).application(context), t2.application(context), ArticleXyyPlus2.plus2)
        }
      }
    }
}
class `Please change .debug(context) to .find2.debug(context).` extends org.scalax.asuna.mapper.item.Message
