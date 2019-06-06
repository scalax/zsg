package org.scalax.asuna.mapper.item
class NodeTag4[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub = NodeTag4[T1#Sub, T2#Sub, T3#Sub, T4#Sub]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag4[Type1#Result, Type2#Result, Type3#Result, Type4#Result], Type4#Left]
  })#II
  override type XyyItemType = XyyItem4[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType]
  def find1: T1 = throw new Exception("debugging...")
  def find2: T2 = throw new Exception("debugging...")
  def find3: T3 = throw new Exception("debugging...")
  def find4: T4 = throw new Exception("debugging...")
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, `Please change .debug(context) to .find2.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, `Please change .debug(context) to .find3.debug(context).`],
    dapp4: org.scalax.asuna.mapper.DebugApplication[K, T4, I4, `Please change .debug(context) to .find4.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag4[T1, T2, T3, T4], EatXyyType4[I1, I2, I3, I4]] =
    NodeTag4.appendNodeTagEatXyy4(dapp1, dapp2, dapp3, dapp4)
}
object NodeTag4 {
  implicit def appendNodeTagEatXyy4[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    H2 <: org.scalax.asuna.mapper.item.ItemTag,
    H3 <: org.scalax.asuna.mapper.item.ItemTag,
    H4 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag4[H1, H2, H3, H4], EatXyyType4[T1, T2, T3, T4]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType4[T1, T2, T3, T4]] = {
        if (context.isReverse) {
          context.append(NodeTag3.appendNodeTagEatXyy3(t2, t3, t4).application(context), t1.application(context), ArticleXyyPlus4.put4)
        } else {
          context.append(NodeTag3.appendNodeTagEatXyy3(t1, t2, t3).application(context), t4.application(context), ArticleXyyPlus4.plus4)
        }
      }
    }
}
class `Please change .debug(context) to .find4.debug(context).` extends org.scalax.asuna.mapper.item.Message
