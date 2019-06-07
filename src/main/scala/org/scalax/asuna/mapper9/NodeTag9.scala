package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class NodeTag9[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  M1 <: org.scalax.asuna.mapper.item.Message,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  M2 <: org.scalax.asuna.mapper.item.Message,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  M3 <: org.scalax.asuna.mapper.item.Message,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  M4 <: org.scalax.asuna.mapper.item.Message,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  M5 <: org.scalax.asuna.mapper.item.Message,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  M6 <: org.scalax.asuna.mapper.item.Message,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  M7 <: org.scalax.asuna.mapper.item.Message,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  M8 <: org.scalax.asuna.mapper.item.Message,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  M9 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType =
    XyyItem9[T1#XyyItemType, T2#XyyItemType, T3#XyyItemType, T4#XyyItemType, T5#XyyItemType, T6#XyyItemType, T7#XyyItemType, T8#XyyItemType, T9#XyyItemType]
  override type M[M <: org.scalax.asuna.mapper.item.Message] =
    NodeTag9[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7, T8, M :-<>-: M8, T9, M :-<>-: M9]
  def find0: T1#M[Asuna.`Number: 0`] = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number: 1`] = throw new Exception("debugging...")
  def find2: T3#M[Asuna.`Number: 2`] = throw new Exception("debugging...")
  def find3: T4#M[Asuna.`Number: 3`] = throw new Exception("debugging...")
  def find4: T5#M[Asuna.`Number: 4`] = throw new Exception("debugging...")
  def find5: T6#M[Asuna.`Number: 5`] = throw new Exception("debugging...")
  def find6: T7#M[Asuna.`Number: 6`] = throw new Exception("debugging...")
  def find7: T8#M[Asuna.`Number: 7`] = throw new Exception("debugging...")
  def find8: T9#M[Asuna.`Number: 8`] = throw new Exception("debugging...")
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam,
    I7 <: org.scalax.asuna.mapper.TypeParam,
    I8 <: org.scalax.asuna.mapper.TypeParam,
    I9 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, Asuna.`Message: Please change .debug(context) to .find0.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, Asuna.`Message: Please change .debug(context) to .find1.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, Asuna.`Message: Please change .debug(context) to .find2.debug(context).`],
    dapp4: org.scalax.asuna.mapper.DebugApplication[K, T4, I4, Asuna.`Message: Please change .debug(context) to .find3.debug(context).`],
    dapp5: org.scalax.asuna.mapper.DebugApplication[K, T5, I5, Asuna.`Message: Please change .debug(context) to .find4.debug(context).`],
    dapp6: org.scalax.asuna.mapper.DebugApplication[K, T6, I6, Asuna.`Message: Please change .debug(context) to .find5.debug(context).`],
    dapp7: org.scalax.asuna.mapper.DebugApplication[K, T7, I7, Asuna.`Message: Please change .debug(context) to .find6.debug(context).`],
    dapp8: org.scalax.asuna.mapper.DebugApplication[K, T8, I8, Asuna.`Message: Please change .debug(context) to .find7.debug(context).`],
    dapp9: org.scalax.asuna.mapper.DebugApplication[K, T9, I9, Asuna.`Message: Please change .debug(context) to .find8.debug(context).`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag9[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9], EatXyyType9[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9
  ]] =
    NodeTag9.appendNodeTagEatXyy9(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9)
}
object NodeTag9 {
  implicit def appendNodeTagEatXyy9[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    H2 <: org.scalax.asuna.mapper.item.ItemTag,
    H3 <: org.scalax.asuna.mapper.item.ItemTag,
    H4 <: org.scalax.asuna.mapper.item.ItemTag,
    H5 <: org.scalax.asuna.mapper.item.ItemTag,
    H6 <: org.scalax.asuna.mapper.item.ItemTag,
    H7 <: org.scalax.asuna.mapper.item.ItemTag,
    H8 <: org.scalax.asuna.mapper.item.ItemTag,
    H9 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    M1 <: org.scalax.asuna.mapper.item.Message,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    M2 <: org.scalax.asuna.mapper.item.Message,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    M3 <: org.scalax.asuna.mapper.item.Message,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    M4 <: org.scalax.asuna.mapper.item.Message,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    M5 <: org.scalax.asuna.mapper.item.Message,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    M6 <: org.scalax.asuna.mapper.item.Message,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    M7 <: org.scalax.asuna.mapper.item.Message,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    M8 <: org.scalax.asuna.mapper.item.Message,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    M9 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag9[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9], EatXyyType9[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9
  ]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag9[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9], EatXyyType9[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9
    ]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = {
        if (context.isReverse) {
          context.append(NodeTag8.appendNodeTagEatXyy8(t2, t3, t4, t5, t6, t7, t8, t9).application(context), t1.application(context), ArticleXyyPlus9.put9)
        } else {
          context.append(NodeTag8.appendNodeTagEatXyy8(t1, t2, t3, t4, t5, t6, t7, t8).application(context), t9.application(context), ArticleXyyPlus9.plus9)
        }
      }
    }
}
class `Please change .debug(context) to .find9.debug(context).` extends org.scalax.asuna.mapper.item.Message
