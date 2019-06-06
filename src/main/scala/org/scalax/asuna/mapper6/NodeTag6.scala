package org.scalax.asuna.mapper.item
class NodeTag6[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub = NodeTag6[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1 = T1#InputMessage[I];
    type Type2 = T2#InputMessage[Type1#Left];
    type Type3 = T3#InputMessage[Type2#Left];
    type Type4 = T4#InputMessage[Type3#Left];
    type Type5 = T5#InputMessage[Type4#Left];
    type Type6 = T6#InputMessage[Type5#Left];
    type II    = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag6[Type1#Result, Type2#Result, Type3#Result, Type4#Result, Type5#Result, Type6#Result], Type6#Left]
  })#II
  override type XyyItemType = XyyItem6[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType]
  def find1: T1 = throw new Exception("debugging...")
  def find2: T2 = throw new Exception("debugging...")
  def find3: T3 = throw new Exception("debugging...")
  def find4: T4 = throw new Exception("debugging...")
  def find5: T5 = throw new Exception("debugging...")
  def find6: T6 = throw new Exception("debugging...")
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, `Please change .debug(context) to .find2.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, `Please change .debug(context) to .find3.debug(context).`],
    dapp4: org.scalax.asuna.mapper.DebugApplication[K, T4, I4, `Please change .debug(context) to .find4.debug(context).`],
    dapp5: org.scalax.asuna.mapper.DebugApplication[K, T5, I5, `Please change .debug(context) to .find5.debug(context).`],
    dapp6: org.scalax.asuna.mapper.DebugApplication[K, T6, I6, `Please change .debug(context) to .find6.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag6[T1, T2, T3, T4, T5, T6], EatXyyType6[I1, I2, I3, I4, I5, I6]] =
    NodeTag6.appendNodeTagEatXyy6(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6)
}
object NodeTag6 {
  implicit def appendNodeTagEatXyy6[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    H2 <: org.scalax.asuna.mapper.item.ItemTag,
    H3 <: org.scalax.asuna.mapper.item.ItemTag,
    H4 <: org.scalax.asuna.mapper.item.ItemTag,
    H5 <: org.scalax.asuna.mapper.item.ItemTag,
    H6 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag6[H1, H2, H3, H4, H5, H6], EatXyyType6[T1, T2, T3, T4, T5, T6]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType6[T1, T2, T3, T4, T5, T6]] = {
        if (context.isReverse) {
          context.append(NodeTag5.appendNodeTagEatXyy5(t2, t3, t4, t5, t6).application(context), t1.application(context), ArticleXyyPlus6.put6)
        } else {
          context.append(NodeTag5.appendNodeTagEatXyy5(t1, t2, t3, t4, t5).application(context), t6.application(context), ArticleXyyPlus6.plus6)
        }
      }
    }
}
class `Please change .debug(context) to .find6.debug(context).` extends org.scalax.asuna.mapper.item.Message
