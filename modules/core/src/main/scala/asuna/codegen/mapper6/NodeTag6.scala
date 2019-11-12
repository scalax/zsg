package asuna
import scala.language.higherKinds
import impl._
final class NodeTag6[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag] extends TupleTag
final object NodeTag6 {
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum1[
    F[_],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application1[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1]] = { context: Context1[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum2[
    F[_, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application2[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2]] = {
    context: Context2[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum3[
    F[_, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application3[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ]] = { context: Context3[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum4[
    F[_, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application4[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4]] = { context: Context4[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum5[
    F[_, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application5[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5]] = { context: Context5[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum6[
    F[_, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application6[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5], AsunaTuple6[
    X1_C6,
    X2_C6,
    X3_C6,
    X4_C6,
    X5_C6,
    X6_C6
  ]] = { context: Context6[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application7[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5], AsunaTuple6[
    X1_C6,
    X2_C6,
    X3_C6,
    X4_C6,
    X5_C6,
    X6_C6
  ], AsunaTuple6[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7]] = { context: Context7[F] =>
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
  final implicit def noteTagApplicationImplicit_tagNum6_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1 <: TupleTag,
    H2 <: TupleTag,
    H3 <: TupleTag,
    H4 <: TupleTag,
    H5 <: TupleTag,
    H6 <: TupleTag,
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
  ): Application8[F, NodeTag6[H1, H2, H3, H4, H5, H6], AsunaTuple6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1], AsunaTuple6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2], AsunaTuple6[
    X1_C3,
    X2_C3,
    X3_C3,
    X4_C3,
    X5_C3,
    X6_C3
  ], AsunaTuple6[X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4], AsunaTuple6[X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5], AsunaTuple6[
    X1_C6,
    X2_C6,
    X3_C6,
    X4_C6,
    X5_C6,
    X6_C6
  ], AsunaTuple6[X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7], AsunaTuple6[X1_C8, X2_C8, X3_C8, X4_C8, X5_C8, X6_C8]] = { context: Context8[F] =>
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
