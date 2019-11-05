package asuna
import scala.language.higherKinds
import impl._
final class NodeTag1[T1 <: TupleTag, M1 <: Message] extends TupleTag {
  override final type M[M <: Message] = NodeTag1[T1, M :-<>-: M1]
}
final object NodeTag1 {
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum1[
    F[_],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1]
  ): Application1[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1]] = { context: Context1[F] =>
    context.append(context.start, t1.application(context))(Plus1.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum2[
    F[_, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2]
  ): Application2[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2]] = { context: Context2[F] =>
    context.append(context.start, t1.application(context))(Plus2.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum3[
    F[_, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3]
  ): Application3[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3]] = { context: Context3[F] =>
    context.append(context.start, t1.application(context))(Plus3.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum4[
    F[_, _, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4]
  ): Application4[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4]] = { context: Context4[F] =>
    context.append(context.start, t1.application(context))(Plus4.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum5[
    F[_, _, _, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]
  ): Application5[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5]] = { context: Context5[F] =>
    context.append(context.start, t1.application(context))(Plus5.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum6[
    F[_, _, _, _, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]
  ): Application6[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6]] = {
    context: Context6[F] =>
      context.append(context.start, t1.application(context))(Plus6.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7]
  ): Application7[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ]] = { context: Context7[F] =>
    context.append(context.start, t1.application(context))(Plus7.plusWithTypeParameter0)
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1 <: TupleTag,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6,
    X1_C7,
    X1_C8
  ](
    implicit
    t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8]
  ): Application8[F, NodeTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ], AsunaTuple1[X1_C8]] = { context: Context8[F] =>
    context.append(context.start, t1.application(context))(Plus8.plusWithTypeParameter0)
  }
}
