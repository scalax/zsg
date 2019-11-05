package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import asuna.support.TypeHListPlus4
import asuna.support.TypeHListPlus5
import asuna.support.TypeHListPlus6
import asuna.support.TypeHListPlus7
import asuna.support.TypeHListPlus8
import scala.language.higherKinds
import impl._
final class NodeTag8[
  T1 <: TupleTag,
  M1 <: Message,
  T2 <: TupleTag,
  M2 <: Message,
  T3 <: TupleTag,
  M3 <: Message,
  T4 <: TupleTag,
  M4 <: Message,
  T5 <: TupleTag,
  M5 <: Message,
  T6 <: TupleTag,
  M6 <: Message,
  T7 <: TupleTag,
  M7 <: Message,
  T8 <: TupleTag,
  M8 <: Message
] extends TupleTag {
  override final type M[M <: Message] =
    NodeTag8[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6, T7, M :-<>-: M7, T8, M :-<>-: M8]
  def find0: T1#M[`Number： 0`] = throw new Exception("debugging...")
  def find1: T2#M[`Number： 1`] = throw new Exception("debugging...")
  def find2: T3#M[`Number： 2`] = throw new Exception("debugging...")
  def find3: T4#M[`Number： 3`] = throw new Exception("debugging...")
  def find4: T5#M[`Number： 4`] = throw new Exception("debugging...")
  def find5: T6#M[`Number： 5`] = throw new Exception("debugging...")
  def find6: T7#M[`Number： 6`] = throw new Exception("debugging...")
  def find7: T8#M[`Number： 7`] = throw new Exception("debugging...")
  def debug[K <: KindContext, I1 <: TypeHList, I2 <: TypeHList, I3 <: TypeHList, I4 <: TypeHList, I5 <: TypeHList, I6 <: TypeHList, I7 <: TypeHList, I8 <: TypeHList](
    c: Context[K]
  )(
    implicit
    dapp1: DebugApplication[K, T1, I1, `Message： Please change .debug(context) to .find0.debug(context).`],
    dapp2: DebugApplication[K, T2, I2, `Message： Please change .debug(context) to .find1.debug(context).`],
    dapp3: DebugApplication[K, T3, I3, `Message： Please change .debug(context) to .find2.debug(context).`],
    dapp4: DebugApplication[K, T4, I4, `Message： Please change .debug(context) to .find3.debug(context).`],
    dapp5: DebugApplication[K, T5, I5, `Message： Please change .debug(context) to .find4.debug(context).`],
    dapp6: DebugApplication[K, T6, I6, `Message： Please change .debug(context) to .find5.debug(context).`],
    dapp7: DebugApplication[K, T7, I7, `Message： Please change .debug(context) to .find6.debug(context).`],
    dapp8: DebugApplication[K, T8, I8, `Message： Please change .debug(context) to .find7.debug(context).`]
  ): Application[K, NodeTag8[T1, M1, T2, M2, T3, M3, T4, M4, T5, M5, T6, M6, T7, M7, T8, M8], TupleTypeHList8[I1, I2, I3, I4, I5, I6, I7, I8]] =
    NodeTag8.noteTagApplicationImplicit8(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8)
}
final object NodeTag8 {
  final implicit def noteTagApplicationImplicit8[
    K <: KindContext,
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    T1 <: TypeHList,
    M1 <: Message,
    T2 <: TypeHList,
    M2 <: Message,
    T3 <: TypeHList,
    M3 <: Message,
    T4 <: TypeHList,
    M4 <: Message,
    T5 <: TypeHList,
    M5 <: Message,
    T6 <: TypeHList,
    M6 <: Message,
    T7 <: TypeHList,
    M7 <: Message,
    T8 <: TypeHList,
    M8 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6],
    t7: Application[K, H7, T7],
    t8: Application[K, H8, T8]
  ): Application[K, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]] = { context =>
    context.append[TupleTypeHList7[T2, T3, T4, T5, T6, T7, T8], T1, TupleTypeHList8[T1, T2, T3, T4, T5, T6, T7, T8]](
      context.append[TupleTypeHList6[T3, T4, T5, T6, T7, T8], T2, TupleTypeHList7[T2, T3, T4, T5, T6, T7, T8]](
        context.append[TupleTypeHList5[T4, T5, T6, T7, T8], T3, TupleTypeHList6[T3, T4, T5, T6, T7, T8]](
          context.append[TupleTypeHList4[T5, T6, T7, T8], T4, TupleTypeHList5[T4, T5, T6, T7, T8]](
            context.append[TupleTypeHList3[T6, T7, T8], T5, TupleTypeHList4[T5, T6, T7, T8]](
              context.append[TupleTypeHList2[T7, T8], T6, TupleTypeHList3[T6, T7, T8]](
                context.append[TupleTypeHList1[T8], T7, TupleTypeHList2[T7, T8]](
                  context.append[TupleTypeHList0, T8, TupleTypeHList1[T8]](context.start, t8.application(context), TypeHListPlus1.plus1),
                  t7.application(context),
                  TypeHListPlus2.plus2
                ),
                t6.application(context),
                TypeHListPlus3.plus3
              ),
              t5.application(context),
              TypeHListPlus4.plus4
            ),
            t4.application(context),
            TypeHListPlus5.plus5
          ),
          t3.application(context),
          TypeHListPlus6.plus6
        ),
        t2.application(context),
        TypeHListPlus7.plus7
      ),
      t1.application(context),
      TypeHListPlus8.plus8
    )
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum1[
    F[_],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X2_C1,
    X3_C1,
    X4_C1,
    X5_C1,
    X6_C1,
    X7_C1,
    X8_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1],
    t2: Application1[F, H2, X2_C1],
    t3: Application1[F, H3, X3_C1],
    t4: Application1[F, H4, X4_C1],
    t5: Application1[F, H5, X5_C1],
    t6: Application1[F, H6, X6_C1],
    t7: Application1[F, H7, X7_C1],
    t8: Application1[F, H8, X8_C1]
  ): Application1[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1]] = {
    context: Context1[F] =>
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(
                  context
                    .append(context.append(context.start, t8.application(context))(Plus1.plusWithTypeParameter0), t7.application(context))(Plus1.plusWithTypeParameter1),
                  t6.application(context)
                )(Plus1.plusWithTypeParameter2),
                t5.application(context)
              )(Plus1.plusWithTypeParameter3),
              t4.application(context)
            )(Plus1.plusWithTypeParameter4),
            t3.application(context)
          )(Plus1.plusWithTypeParameter5),
          t2.application(context)
        )(Plus1.plusWithTypeParameter6),
        t1.application(context)
      )(Plus1.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum2[
    F[_, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X2_C1,
    X2_C2,
    X3_C1,
    X3_C2,
    X4_C1,
    X4_C2,
    X5_C1,
    X5_C2,
    X6_C1,
    X6_C2,
    X7_C1,
    X7_C2,
    X8_C1,
    X8_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2],
    t2: Application2[F, H2, X2_C1, X2_C2],
    t3: Application2[F, H3, X3_C1, X3_C2],
    t4: Application2[F, H4, X4_C1, X4_C2],
    t5: Application2[F, H5, X5_C1, X5_C2],
    t6: Application2[F, H6, X6_C1, X6_C2],
    t7: Application2[F, H7, X7_C1, X7_C2],
    t8: Application2[F, H8, X8_C1, X8_C2]
  ): Application2[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ]] = { context: Context2[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus2.plusWithTypeParameter0), t7.application(context))(Plus2.plusWithTypeParameter1),
                t6.application(context)
              )(Plus2.plusWithTypeParameter2),
              t5.application(context)
            )(Plus2.plusWithTypeParameter3),
            t4.application(context)
          )(Plus2.plusWithTypeParameter4),
          t3.application(context)
        )(Plus2.plusWithTypeParameter5),
        t2.application(context)
      )(Plus2.plusWithTypeParameter6),
      t1.application(context)
    )(Plus2.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum3[
    F[_, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X2_C1,
    X2_C2,
    X2_C3,
    X3_C1,
    X3_C2,
    X3_C3,
    X4_C1,
    X4_C2,
    X4_C3,
    X5_C1,
    X5_C2,
    X5_C3,
    X6_C1,
    X6_C2,
    X6_C3,
    X7_C1,
    X7_C2,
    X7_C3,
    X8_C1,
    X8_C2,
    X8_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3],
    t3: Application3[F, H3, X3_C1, X3_C2, X3_C3],
    t4: Application3[F, H4, X4_C1, X4_C2, X4_C3],
    t5: Application3[F, H5, X5_C1, X5_C2, X5_C3],
    t6: Application3[F, H6, X6_C1, X6_C2, X6_C3],
    t7: Application3[F, H7, X7_C1, X7_C2, X7_C3],
    t8: Application3[F, H8, X8_C1, X8_C2, X8_C3]
  ): Application3[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3]] = { context: Context3[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus3.plusWithTypeParameter0), t7.application(context))(Plus3.plusWithTypeParameter1),
                t6.application(context)
              )(Plus3.plusWithTypeParameter2),
              t5.application(context)
            )(Plus3.plusWithTypeParameter3),
            t4.application(context)
          )(Plus3.plusWithTypeParameter4),
          t3.application(context)
        )(Plus3.plusWithTypeParameter5),
        t2.application(context)
      )(Plus3.plusWithTypeParameter6),
      t1.application(context)
    )(Plus3.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum4[
    F[_, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4],
    t5: Application4[F, H5, X5_C1, X5_C2, X5_C3, X5_C4],
    t6: Application4[F, H6, X6_C1, X6_C2, X6_C3, X6_C4],
    t7: Application4[F, H7, X7_C1, X7_C2, X7_C3, X7_C4],
    t8: Application4[F, H8, X8_C1, X8_C2, X8_C3, X8_C4]
  ): Application4[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3], AsunaTuple8[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4]] = { context: Context4[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus4.plusWithTypeParameter0), t7.application(context))(Plus4.plusWithTypeParameter1),
                t6.application(context)
              )(Plus4.plusWithTypeParameter2),
              t5.application(context)
            )(Plus4.plusWithTypeParameter3),
            t4.application(context)
          )(Plus4.plusWithTypeParameter4),
          t3.application(context)
        )(Plus4.plusWithTypeParameter5),
        t2.application(context)
      )(Plus4.plusWithTypeParameter6),
      t1.application(context)
    )(Plus4.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum5[
    F[_, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4,
    X8_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5],
    t4: Application5[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5],
    t5: Application5[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5],
    t6: Application5[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5],
    t7: Application5[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5],
    t8: Application5[F, H8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5]
  ): Application5[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3], AsunaTuple8[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4], AsunaTuple8[
    X1_C5,
    X2_C5,
    X3_C5,
    X4_C5,
    X5_C5,
    X6_C5,
    X7_C5,
    X8_C5
  ]] = { context: Context5[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus5.plusWithTypeParameter0), t7.application(context))(Plus5.plusWithTypeParameter1),
                t6.application(context)
              )(Plus5.plusWithTypeParameter2),
              t5.application(context)
            )(Plus5.plusWithTypeParameter3),
            t4.application(context)
          )(Plus5.plusWithTypeParameter4),
          t3.application(context)
        )(Plus5.plusWithTypeParameter5),
        t2.application(context)
      )(Plus5.plusWithTypeParameter6),
      t1.application(context)
    )(Plus5.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum6[
    F[_, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4,
    X8_C5,
    X8_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    t2: Application6[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6],
    t3: Application6[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6],
    t4: Application6[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6],
    t5: Application6[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6],
    t6: Application6[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6],
    t7: Application6[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6],
    t8: Application6[F, H8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6]
  ): Application6[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3], AsunaTuple8[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4], AsunaTuple8[
    X1_C5,
    X2_C5,
    X3_C5,
    X4_C5,
    X5_C5,
    X6_C5,
    X7_C5,
    X8_C5
  ], AsunaTuple8[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6, X8_C6]] = { context: Context6[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus6.plusWithTypeParameter0), t7.application(context))(Plus6.plusWithTypeParameter1),
                t6.application(context)
              )(Plus6.plusWithTypeParameter2),
              t5.application(context)
            )(Plus6.plusWithTypeParameter3),
            t4.application(context)
          )(Plus6.plusWithTypeParameter4),
          t3.application(context)
        )(Plus6.plusWithTypeParameter5),
        t2.application(context)
      )(Plus6.plusWithTypeParameter6),
      t1.application(context)
    )(Plus6.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X7_C7,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4,
    X8_C5,
    X8_C6,
    X8_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7],
    t7: Application7[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7],
    t8: Application7[F, H8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7]
  ): Application7[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3], AsunaTuple8[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4], AsunaTuple8[
    X1_C5,
    X2_C5,
    X3_C5,
    X4_C5,
    X5_C5,
    X6_C5,
    X7_C5,
    X8_C5
  ], AsunaTuple8[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6, X8_C6], AsunaTuple8[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7, X7_C7, X8_C7]] = { context: Context7[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus7.plusWithTypeParameter0), t7.application(context))(Plus7.plusWithTypeParameter1),
                t6.application(context)
              )(Plus7.plusWithTypeParameter2),
              t5.application(context)
            )(Plus7.plusWithTypeParameter3),
            t4.application(context)
          )(Plus7.plusWithTypeParameter4),
          t3.application(context)
        )(Plus7.plusWithTypeParameter5),
        t2.application(context)
      )(Plus7.plusWithTypeParameter6),
      t1.application(context)
    )(Plus7.plusWithTypeParameter7)
  }
  implicit def noteTagApplicationImplicit_tagNum8_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
    H7 <: TupleTag,
    H8 <: TupleTag,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    M7 <: Message,
    M8 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8,
    X2_C1,
    X2_C2,
    X2_C3,
    X2_C4,
    X2_C5,
    X2_C6,
    X2_C7,
    X2_C8,
    X3_C1,
    X3_C2,
    X3_C3,
    X3_C4,
    X3_C5,
    X3_C6,
    X3_C7,
    X3_C8,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5,
    X4_C6,
    X4_C7,
    X4_C8,
    X5_C1,
    X5_C2,
    X5_C3,
    X5_C4,
    X5_C5,
    X5_C6,
    X5_C7,
    X5_C8,
    X6_C1,
    X6_C2,
    X6_C3,
    X6_C4,
    X6_C5,
    X6_C6,
    X6_C7,
    X6_C8,
    X7_C1,
    X7_C2,
    X7_C3,
    X7_C4,
    X7_C5,
    X7_C6,
    X7_C7,
    X7_C8,
    X8_C1,
    X8_C2,
    X8_C3,
    X8_C4,
    X8_C5,
    X8_C6,
    X8_C7,
    X8_C8
  ](
    implicit
    t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8],
    t3: Application8[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8],
    t4: Application8[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8],
    t5: Application8[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8],
    t6: Application8[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8],
    t7: Application8[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7, X7_C8],
    t8: Application8[F, H8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7, X8_C8]
  ): Application8[F, NodeTag8[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6, H7, M7, H8, M8], AsunaTuple8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1], AsunaTuple8[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2,
    X7_C2,
    X8_C2
  ], AsunaTuple8[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3], AsunaTuple8[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4], AsunaTuple8[
    X1_C5,
    X2_C5,
    X3_C5,
    X4_C5,
    X5_C5,
    X6_C5,
    X7_C5,
    X8_C5
  ], AsunaTuple8[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6, X8_C6], AsunaTuple8[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7, X7_C7, X8_C7], AsunaTuple8[
    X1_C8,
    X2_C8,
    X3_C8,
    X4_C8,
    X5_C8,
    X6_C8,
    X7_C8,
    X8_C8
  ]] = { context: Context8[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context
                  .append(context.append(context.start, t8.application(context))(Plus8.plusWithTypeParameter0), t7.application(context))(Plus8.plusWithTypeParameter1),
                t6.application(context)
              )(Plus8.plusWithTypeParameter2),
              t5.application(context)
            )(Plus8.plusWithTypeParameter3),
            t4.application(context)
          )(Plus8.plusWithTypeParameter4),
          t3.application(context)
        )(Plus8.plusWithTypeParameter5),
        t2.application(context)
      )(Plus8.plusWithTypeParameter6),
      t1.application(context)
    )(Plus8.plusWithTypeParameter7)
  }
}
