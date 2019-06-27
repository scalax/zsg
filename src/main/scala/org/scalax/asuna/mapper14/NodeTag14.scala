package org.scalax.asuna.mapper.item
import org.scalax.asuna.mapper.item.impl._
class NodeTag14[
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
  M9 <: org.scalax.asuna.mapper.item.Message,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  M10 <: org.scalax.asuna.mapper.item.Message,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  M11 <: org.scalax.asuna.mapper.item.Message,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  M12 <: org.scalax.asuna.mapper.item.Message,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  M13 <: org.scalax.asuna.mapper.item.Message,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  M14 <: org.scalax.asuna.mapper.item.Message
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type XyyItemType = Item14[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType,
    T12#XyyItemType,
    T13#XyyItemType,
    T14#XyyItemType
  ]
  override type M[M <: org.scalax.asuna.mapper.item.Message] = NodeTag14[
    T1,
    M :-<>-: M1,
    T2,
    M :-<>-: M2,
    T3,
    M :-<>-: M3,
    T4,
    M :-<>-: M4,
    T5,
    M :-<>-: M5,
    T6,
    M :-<>-: M6,
    T7,
    M :-<>-: M7,
    T8,
    M :-<>-: M8,
    T9,
    M :-<>-: M9,
    T10,
    M :-<>-: M10,
    T11,
    M :-<>-: M11,
    T12,
    M :-<>-: M12,
    T13,
    M :-<>-: M13,
    T14,
    M :-<>-: M14
  ]
  def find0: T1#M[Asuna.`Number: 0`]    = throw new Exception("debugging...")
  def find1: T2#M[Asuna.`Number: 1`]    = throw new Exception("debugging...")
  def find2: T3#M[Asuna.`Number: 2`]    = throw new Exception("debugging...")
  def find3: T4#M[Asuna.`Number: 3`]    = throw new Exception("debugging...")
  def find4: T5#M[Asuna.`Number: 4`]    = throw new Exception("debugging...")
  def find5: T6#M[Asuna.`Number: 5`]    = throw new Exception("debugging...")
  def find6: T7#M[Asuna.`Number: 6`]    = throw new Exception("debugging...")
  def find7: T8#M[Asuna.`Number: 7`]    = throw new Exception("debugging...")
  def find8: T9#M[Asuna.`Number: 8`]    = throw new Exception("debugging...")
  def find9: T10#M[Asuna.`Number: 9`]   = throw new Exception("debugging...")
  def find10: T11#M[Asuna.`Number: 10`] = throw new Exception("debugging...")
  def find11: T12#M[Asuna.`Number: 11`] = throw new Exception("debugging...")
  def find12: T13#M[Asuna.`Number: 12`] = throw new Exception("debugging...")
  def find13: T14#M[Asuna.`Number: 13`] = throw new Exception("debugging...")
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
    I9 <: org.scalax.asuna.mapper.TypeParam,
    I10 <: org.scalax.asuna.mapper.TypeParam,
    I11 <: org.scalax.asuna.mapper.TypeParam,
    I12 <: org.scalax.asuna.mapper.TypeParam,
    I13 <: org.scalax.asuna.mapper.TypeParam,
    I14 <: org.scalax.asuna.mapper.TypeParam
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
    dapp9: org.scalax.asuna.mapper.DebugApplication[K, T9, I9, Asuna.`Message: Please change .debug(context) to .find8.debug(context).`],
    dapp10: org.scalax.asuna.mapper.DebugApplication[K, T10, I10, Asuna.`Message: Please change .debug(context) to .find9.debug(context).`],
    dapp11: org.scalax.asuna.mapper.DebugApplication[K, T11, I11, Asuna.`Message: Please change .debug(context) to .find10.debug(context).`],
    dapp12: org.scalax.asuna.mapper.DebugApplication[K, T12, I12, Asuna.`Message: Please change .debug(context) to .find11.debug(context).`],
    dapp13: org.scalax.asuna.mapper.DebugApplication[K, T13, I13, Asuna.`Message: Please change .debug(context) to .find12.debug(context).`],
    dapp14: org.scalax.asuna.mapper.DebugApplication[K, T14, I14, Asuna.`Message: Please change .debug(context) to .find13.debug(context).`]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.NodeTag14[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8, T9, M9, T10, M10, T11, M11, T12, M12, T13, M13, T14, M14],
    EatXyyType14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
  ] =
    NodeTag14.appendNodeTagEatXyy14(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14)
}
object NodeTag14 {
  implicit def appendNodeTagEatXyy14[
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
    H10 <: org.scalax.asuna.mapper.item.ItemTag,
    H11 <: org.scalax.asuna.mapper.item.ItemTag,
    H12 <: org.scalax.asuna.mapper.item.ItemTag,
    H13 <: org.scalax.asuna.mapper.item.ItemTag,
    H14 <: org.scalax.asuna.mapper.item.ItemTag,
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
    M9 <: org.scalax.asuna.mapper.item.Message,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    M10 <: org.scalax.asuna.mapper.item.Message,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    M11 <: org.scalax.asuna.mapper.item.Message,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    M12 <: org.scalax.asuna.mapper.item.Message,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    M13 <: org.scalax.asuna.mapper.item.Message,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    M14 <: org.scalax.asuna.mapper.item.Message
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11],
    t12: org.scalax.asuna.mapper.Application[K, H12, T12],
    t13: org.scalax.asuna.mapper.Application[K, H13, T13],
    t14: org.scalax.asuna.mapper.Application[K, H14, T14]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.NodeTag14[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9, H10, M10, H11, M11, H12, M12, H13, M13, H14, M14],
    EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
  ] =
    new org.scalax.asuna.mapper.Application[
      K,
      org.scalax.asuna.mapper.item.NodeTag14[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8, H9, M9, H10, M10, H11, M11, H12, M12, H13, M13, H14, M14],
      EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]
    ] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] = {
        if (context.isReverse) {
          context.append(
            NodeTag13.appendNodeTagEatXyy13(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14).application(context),
            t1.application(context),
            ArticleXyyPlus14.put14
          )
        } else {
          context.append(
            NodeTag13.appendNodeTagEatXyy13(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13).application(context),
            t14.application(context),
            ArticleXyyPlus14.plus14
          )
        }
      }
    }
}
class `Please change .debug(context) to .find14.debug(context).` extends org.scalax.asuna.mapper.item.Message
