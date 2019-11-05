package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import asuna.support.TypeHListPlus4
import asuna.support.TypeHListPlus5
import asuna.support.TypeHListPlus6
import scala.language.higherKinds
import impl._
final class TupleTag6[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message, T4, M4 <: Message, T5, M5 <: Message, T6, M6 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag6[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3, T4, M :-<>-: M4, T5, M :-<>-: M5, T6, M :-<>-: M6]
}
final object TupleTag6 {
  final implicit def tupleTagApplicationImplicit6[
    K <: KindContext,
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    T4 <: TypeHList,
    T5 <: TypeHList,
    T6 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3],
    t4: Application[K, H4, T4],
    t5: Application[K, H5, T5],
    t6: Application[K, H6, T6]
  ): Application[K, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], TupleTypeHList6[T1, T2, T3, T4, T5, T6]] = { context =>
    context.append[TupleTypeHList5[T2, T3, T4, T5, T6], T1, TupleTypeHList6[T1, T2, T3, T4, T5, T6]](
      context.append[TupleTypeHList4[T3, T4, T5, T6], T2, TupleTypeHList5[T2, T3, T4, T5, T6]](
        context.append[TupleTypeHList3[T4, T5, T6], T3, TupleTypeHList4[T3, T4, T5, T6]](
          context.append[TupleTypeHList2[T5, T6], T4, TupleTypeHList3[T4, T5, T6]](
            context.append[TupleTypeHList1[T6], T5, TupleTypeHList2[T5, T6]](
              context.append[TupleTypeHList0, T6, TupleTypeHList1[T6]](context.start, t6.application(context), TypeHListPlus1.plus1),
              t5.application(context),
              TypeHListPlus2.plus2
            ),
            t4.application(context),
            TypeHListPlus3.plus3
          ),
          t3.application(context),
          TypeHListPlus4.plus4
        ),
        t2.application(context),
        TypeHListPlus5.plus5
      ),
      t1.application(context),
      TypeHListPlus6.plus6
    )
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum1[
    F[_],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
    X1_C1,
    X2_C1,
    X3_C1,
    X4_C1,
    X5_C1,
    X6_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1],
    t2: Application1[F, H2, X2_C1],
    t3: Application1[F, H3, X3_C1],
    t4: Application1[F, H4, X4_C1],
    t5: Application1[F, H5, X5_C1],
    t6: Application1[F, H6, X6_C1]
  ): Application1[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1]] = { context: Context1[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus1.plusWithTypeParameter0), t5.application(context))(Plus1.plusWithTypeParameter1),
            t4.application(context)
          )(Plus1.plusWithTypeParameter2),
          t3.application(context)
        )(Plus1.plusWithTypeParameter3),
        t2.application(context)
      )(Plus1.plusWithTypeParameter4),
      t1.application(context)
    )(Plus1.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum2[
    F[_, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2],
    t2: Application2[F, H2, X2_C1, X2_C2],
    t3: Application2[F, H3, X3_C1, X3_C2],
    t4: Application2[F, H4, X4_C1, X4_C2],
    t5: Application2[F, H5, X5_C1, X5_C2],
    t6: Application2[F, H6, X6_C1, X6_C2]
  ): Application2[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2
  ]] = { context: Context2[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus2.plusWithTypeParameter0), t5.application(context))(Plus2.plusWithTypeParameter1),
            t4.application(context)
          )(Plus2.plusWithTypeParameter2),
          t3.application(context)
        )(Plus2.plusWithTypeParameter3),
        t2.application(context)
      )(Plus2.plusWithTypeParameter4),
      t1.application(context)
    )(Plus2.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum3[
    F[_, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3],
    t3: Application3[F, H3, X3_C1, X3_C2, X3_C3],
    t4: Application3[F, H4, X4_C1, X4_C2, X4_C3],
    t5: Application3[F, H5, X5_C1, X5_C2, X5_C3],
    t6: Application3[F, H6, X6_C1, X6_C2, X6_C3]
  ): Application3[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2
  ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3]] = { context: Context3[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus3.plusWithTypeParameter0), t5.application(context))(Plus3.plusWithTypeParameter1),
            t4.application(context)
          )(Plus3.plusWithTypeParameter2),
          t3.application(context)
        )(Plus3.plusWithTypeParameter3),
        t2.application(context)
      )(Plus3.plusWithTypeParameter4),
      t1.application(context)
    )(Plus3.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4],
    t5: Application4[F, H5, X5_C1, X5_C2, X5_C3, X5_C4],
    t6: Application4[F, H6, X6_C1, X6_C2, X6_C3, X6_C4]
  ): Application4[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2
  ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4]] = { context: Context4[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus4.plusWithTypeParameter0), t5.application(context))(Plus4.plusWithTypeParameter1),
            t4.application(context)
          )(Plus4.plusWithTypeParameter2),
          t3.application(context)
        )(Plus4.plusWithTypeParameter3),
        t2.application(context)
      )(Plus4.plusWithTypeParameter4),
      t1.application(context)
    )(Plus4.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5],
    t4: Application5[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5],
    t5: Application5[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5],
    t6: Application5[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5]
  ): Application5[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
    X1_C2,
    X2_C2,
    X3_C2,
    X4_C2,
    X5_C2,
    X6_C2
  ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[
    X1_C5,
    X2_C5,
    X3_C5,
    X4_C5,
    X5_C5,
    X6_C5
  ]] = { context: Context5[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus5.plusWithTypeParameter0), t5.application(context))(Plus5.plusWithTypeParameter1),
            t4.application(context)
          )(Plus5.plusWithTypeParameter2),
          t3.application(context)
        )(Plus5.plusWithTypeParameter3),
        t2.application(context)
      )(Plus5.plusWithTypeParameter4),
      t1.application(context)
    )(Plus5.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum6[
    F[_, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    t2: Application6[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6],
    t3: Application6[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6],
    t4: Application6[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6],
    t5: Application6[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6],
    t6: Application6[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6]
  )
    : Application6[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
      X1_C2,
      X2_C2,
      X3_C2,
      X4_C2,
      X5_C2,
      X6_C2
    ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[
      X1_C5,
      X2_C5,
      X3_C5,
      X4_C5,
      X5_C5,
      X6_C5
    ], AsunaTuple6[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6]] = { context: Context6[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus6.plusWithTypeParameter0), t5.application(context))(Plus6.plusWithTypeParameter1),
            t4.application(context)
          )(Plus6.plusWithTypeParameter2),
          t3.application(context)
        )(Plus6.plusWithTypeParameter3),
        t2.application(context)
      )(Plus6.plusWithTypeParameter4),
      t1.application(context)
    )(Plus6.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7]
  )
    : Application7[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
      X1_C2,
      X2_C2,
      X3_C2,
      X4_C2,
      X5_C2,
      X6_C2
    ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[
      X1_C5,
      X2_C5,
      X3_C5,
      X4_C5,
      X5_C5,
      X6_C5
    ], AsunaTuple6[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6], AsunaTuple6[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7]] = { context: Context7[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus7.plusWithTypeParameter0), t5.application(context))(Plus7.plusWithTypeParameter1),
            t4.application(context)
          )(Plus7.plusWithTypeParameter2),
          t3.application(context)
        )(Plus7.plusWithTypeParameter3),
        t2.application(context)
      )(Plus7.plusWithTypeParameter4),
      t1.application(context)
    )(Plus7.plusWithTypeParameter5)
  }
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    M4 <: Message,
    M5 <: Message,
    M6 <: Message,
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
    X6_C8
  ](
    implicit
    t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8],
    t3: Application8[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8],
    t4: Application8[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8],
    t5: Application8[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8],
    t6: Application8[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7, X6_C8]
  )
    : Application8[F, TupleTag6[H1, M1, H2, M2, H3, M3, H4, M4, H5, M5, H6, M6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[
      X1_C2,
      X2_C2,
      X3_C2,
      X4_C2,
      X5_C2,
      X6_C2
    ], AsunaTuple6[X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[
      X1_C5,
      X2_C5,
      X3_C5,
      X4_C5,
      X5_C5,
      X6_C5
    ], AsunaTuple6[X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6], AsunaTuple6[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7], AsunaTuple6[
      X1_C8,
      X2_C8,
      X3_C8,
      X4_C8,
      X5_C8,
      X6_C8
    ]] = { context: Context8[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(context.append(context.start, t6.application(context))(Plus8.plusWithTypeParameter0), t5.application(context))(Plus8.plusWithTypeParameter1),
            t4.application(context)
          )(Plus8.plusWithTypeParameter2),
          t3.application(context)
        )(Plus8.plusWithTypeParameter3),
        t2.application(context)
      )(Plus8.plusWithTypeParameter4),
      t1.application(context)
    )(Plus8.plusWithTypeParameter5)
  }
}
