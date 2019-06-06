package org.scalax.asuna.mapper.item
class NodeTag22[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag,
  T12 <: org.scalax.asuna.mapper.item.ItemTag,
  T13 <: org.scalax.asuna.mapper.item.ItemTag,
  T14 <: org.scalax.asuna.mapper.item.ItemTag,
  T15 <: org.scalax.asuna.mapper.item.ItemTag,
  T16 <: org.scalax.asuna.mapper.item.ItemTag,
  T17 <: org.scalax.asuna.mapper.item.ItemTag,
  T18 <: org.scalax.asuna.mapper.item.ItemTag,
  T19 <: org.scalax.asuna.mapper.item.ItemTag,
  T20 <: org.scalax.asuna.mapper.item.ItemTag,
  T21 <: org.scalax.asuna.mapper.item.ItemTag,
  T22 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub = NodeTag22[
    T1#Sub,
    T2#Sub,
    T3#Sub,
    T4#Sub,
    T5#Sub,
    T6#Sub,
    T7#Sub,
    T8#Sub,
    T9#Sub,
    T10#Sub,
    T11#Sub,
    T12#Sub,
    T13#Sub,
    T14#Sub,
    T15#Sub,
    T16#Sub,
    T17#Sub,
    T18#Sub,
    T19#Sub,
    T20#Sub,
    T21#Sub,
    T22#Sub
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type Type12 = T12#InputMessage[Type11#Left];
    type Type13 = T13#InputMessage[Type12#Left];
    type Type14 = T14#InputMessage[Type13#Left];
    type Type15 = T15#InputMessage[Type14#Left];
    type Type16 = T16#InputMessage[Type15#Left];
    type Type17 = T17#InputMessage[Type16#Left];
    type Type18 = T18#InputMessage[Type17#Left];
    type Type19 = T19#InputMessage[Type18#Left];
    type Type20 = T20#InputMessage[Type19#Left];
    type Type21 = T21#InputMessage[Type20#Left];
    type Type22 = T22#InputMessage[Type21#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag22[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result,
      Type12#Result,
      Type13#Result,
      Type14#Result,
      Type15#Result,
      Type16#Result,
      Type17#Result,
      Type18#Result,
      Type19#Result,
      Type20#Result,
      Type21#Result,
      Type22#Result
    ], Type22#Left]
  })#II
  override type XyyItemType = XyyItem22[
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
    T14#XyyItemType,
    T15#XyyItemType,
    T16#XyyItemType,
    T17#XyyItemType,
    T18#XyyItemType,
    T19#XyyItemType,
    T20#XyyItemType,
    T21#XyyItemType,
    T22#XyyItemType
  ]
  def find1: T1   = throw new Exception("debugging...")
  def find2: T2   = throw new Exception("debugging...")
  def find3: T3   = throw new Exception("debugging...")
  def find4: T4   = throw new Exception("debugging...")
  def find5: T5   = throw new Exception("debugging...")
  def find6: T6   = throw new Exception("debugging...")
  def find7: T7   = throw new Exception("debugging...")
  def find8: T8   = throw new Exception("debugging...")
  def find9: T9   = throw new Exception("debugging...")
  def find10: T10 = throw new Exception("debugging...")
  def find11: T11 = throw new Exception("debugging...")
  def find12: T12 = throw new Exception("debugging...")
  def find13: T13 = throw new Exception("debugging...")
  def find14: T14 = throw new Exception("debugging...")
  def find15: T15 = throw new Exception("debugging...")
  def find16: T16 = throw new Exception("debugging...")
  def find17: T17 = throw new Exception("debugging...")
  def find18: T18 = throw new Exception("debugging...")
  def find19: T19 = throw new Exception("debugging...")
  def find20: T20 = throw new Exception("debugging...")
  def find21: T21 = throw new Exception("debugging...")
  def find22: T22 = throw new Exception("debugging...")
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
    I14 <: org.scalax.asuna.mapper.TypeParam,
    I15 <: org.scalax.asuna.mapper.TypeParam,
    I16 <: org.scalax.asuna.mapper.TypeParam,
    I17 <: org.scalax.asuna.mapper.TypeParam,
    I18 <: org.scalax.asuna.mapper.TypeParam,
    I19 <: org.scalax.asuna.mapper.TypeParam,
    I20 <: org.scalax.asuna.mapper.TypeParam,
    I21 <: org.scalax.asuna.mapper.TypeParam,
    I22 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Please change .debug(context) to .find1.debug(context).`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, `Please change .debug(context) to .find2.debug(context).`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, `Please change .debug(context) to .find3.debug(context).`],
    dapp4: org.scalax.asuna.mapper.DebugApplication[K, T4, I4, `Please change .debug(context) to .find4.debug(context).`],
    dapp5: org.scalax.asuna.mapper.DebugApplication[K, T5, I5, `Please change .debug(context) to .find5.debug(context).`],
    dapp6: org.scalax.asuna.mapper.DebugApplication[K, T6, I6, `Please change .debug(context) to .find6.debug(context).`],
    dapp7: org.scalax.asuna.mapper.DebugApplication[K, T7, I7, `Please change .debug(context) to .find7.debug(context).`],
    dapp8: org.scalax.asuna.mapper.DebugApplication[K, T8, I8, `Please change .debug(context) to .find8.debug(context).`],
    dapp9: org.scalax.asuna.mapper.DebugApplication[K, T9, I9, `Please change .debug(context) to .find9.debug(context).`],
    dapp10: org.scalax.asuna.mapper.DebugApplication[K, T10, I10, `Please change .debug(context) to .find10.debug(context).`],
    dapp11: org.scalax.asuna.mapper.DebugApplication[K, T11, I11, `Please change .debug(context) to .find11.debug(context).`],
    dapp12: org.scalax.asuna.mapper.DebugApplication[K, T12, I12, `Please change .debug(context) to .find12.debug(context).`],
    dapp13: org.scalax.asuna.mapper.DebugApplication[K, T13, I13, `Please change .debug(context) to .find13.debug(context).`],
    dapp14: org.scalax.asuna.mapper.DebugApplication[K, T14, I14, `Please change .debug(context) to .find14.debug(context).`],
    dapp15: org.scalax.asuna.mapper.DebugApplication[K, T15, I15, `Please change .debug(context) to .find15.debug(context).`],
    dapp16: org.scalax.asuna.mapper.DebugApplication[K, T16, I16, `Please change .debug(context) to .find16.debug(context).`],
    dapp17: org.scalax.asuna.mapper.DebugApplication[K, T17, I17, `Please change .debug(context) to .find17.debug(context).`],
    dapp18: org.scalax.asuna.mapper.DebugApplication[K, T18, I18, `Please change .debug(context) to .find18.debug(context).`],
    dapp19: org.scalax.asuna.mapper.DebugApplication[K, T19, I19, `Please change .debug(context) to .find19.debug(context).`],
    dapp20: org.scalax.asuna.mapper.DebugApplication[K, T20, I20, `Please change .debug(context) to .find20.debug(context).`],
    dapp21: org.scalax.asuna.mapper.DebugApplication[K, T21, I21, `Please change .debug(context) to .find21.debug(context).`],
    dapp22: org.scalax.asuna.mapper.DebugApplication[K, T22, I22, `Please change .debug(context) to .find22.debug(context).`]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.NodeTag22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
    EatXyyType22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22]
  ] =
    NodeTag22.appendNodeTagEatXyy22(
      dapp1,
      dapp2,
      dapp3,
      dapp4,
      dapp5,
      dapp6,
      dapp7,
      dapp8,
      dapp9,
      dapp10,
      dapp11,
      dapp12,
      dapp13,
      dapp14,
      dapp15,
      dapp16,
      dapp17,
      dapp18,
      dapp19,
      dapp20,
      dapp21,
      dapp22
    )
}
object NodeTag22 {
  implicit def appendNodeTagEatXyy22[
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
    H15 <: org.scalax.asuna.mapper.item.ItemTag,
    H16 <: org.scalax.asuna.mapper.item.ItemTag,
    H17 <: org.scalax.asuna.mapper.item.ItemTag,
    H18 <: org.scalax.asuna.mapper.item.ItemTag,
    H19 <: org.scalax.asuna.mapper.item.ItemTag,
    H20 <: org.scalax.asuna.mapper.item.ItemTag,
    H21 <: org.scalax.asuna.mapper.item.ItemTag,
    H22 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam,
    T12 <: org.scalax.asuna.mapper.TypeParam,
    T13 <: org.scalax.asuna.mapper.TypeParam,
    T14 <: org.scalax.asuna.mapper.TypeParam,
    T15 <: org.scalax.asuna.mapper.TypeParam,
    T16 <: org.scalax.asuna.mapper.TypeParam,
    T17 <: org.scalax.asuna.mapper.TypeParam,
    T18 <: org.scalax.asuna.mapper.TypeParam,
    T19 <: org.scalax.asuna.mapper.TypeParam,
    T20 <: org.scalax.asuna.mapper.TypeParam,
    T21 <: org.scalax.asuna.mapper.TypeParam,
    T22 <: org.scalax.asuna.mapper.TypeParam
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
    t14: org.scalax.asuna.mapper.Application[K, H14, T14],
    t15: org.scalax.asuna.mapper.Application[K, H15, T15],
    t16: org.scalax.asuna.mapper.Application[K, H16, T16],
    t17: org.scalax.asuna.mapper.Application[K, H17, T17],
    t18: org.scalax.asuna.mapper.Application[K, H18, T18],
    t19: org.scalax.asuna.mapper.Application[K, H19, T19],
    t20: org.scalax.asuna.mapper.Application[K, H20, T20],
    t21: org.scalax.asuna.mapper.Application[K, H21, T21],
    t22: org.scalax.asuna.mapper.Application[K, H22, T22]
  ): org.scalax.asuna.mapper.Application[
    K,
    org.scalax.asuna.mapper.item.NodeTag22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22],
    EatXyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
  ] =
    new org.scalax.asuna.mapper.Application[
      K,
      org.scalax.asuna.mapper.item.NodeTag22[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17, H18, H19, H20, H21, H22],
      EatXyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]
    ] {
      override def application(
        context: org.scalax.asuna.mapper.Context[K]
      ): K#M[EatXyyType22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22]] = {
        if (context.isReverse) {
          context.append(
              NodeTag21.appendNodeTagEatXyy21(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22).application(context)
            , t1.application(context)
            , ArticleXyyPlus22.put22
          )
        } else {
          context.append(
              NodeTag21.appendNodeTagEatXyy21(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21).application(context)
            , t22.application(context)
            , ArticleXyyPlus22.plus22
          )
        }
      }
    }
}
class `Please change .debug(context) to .find22.debug(context).` extends org.scalax.asuna.mapper.item.Message
