package asuna
import asuna.support.TypeHListPlus1
import scala.language.higherKinds
import impl._
final class TupleTag1[T1, M1 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag1[T1, M :-<>-: M1]
}
final object TupleTag1 {
  final implicit def tupleTagApplicationImplicit1[K <: KindContext, H1, T1 <: TypeHList, M1 <: Message](
    implicit t1: Application[K, H1, T1]
  ): Application[K, TupleTag1[H1, M1], TupleTypeHList1[T1]] = { context =>
    context.append[TupleTypeHList0, T1, TupleTypeHList1[T1]](context.start, t1.application(context), TypeHListPlus1.plus1)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum1[
    F[_],
    H1,
    M1 <: Message,
    X1_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1]
  ): Application1[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1]] = { context: Context1[F] =>
    context.append(context.start, t1.application(context))(Plus1.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum2[
    F[_, _],
    H1,
    M1 <: Message,
    X1_C1,
    X1_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2]
  ): Application2[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2]] = { context: Context2[F] =>
    context.append(context.start, t1.application(context))(Plus2.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum3[
    F[_, _, _],
    H1,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3]
  ): Application3[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3]] = { context: Context3[F] =>
    context.append(context.start, t1.application(context))(Plus3.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum4[
    F[_, _, _, _],
    H1,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4]
  ): Application4[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4]] = { context: Context4[F] =>
    context.append(context.start, t1.application(context))(Plus4.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    M1 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]
  ): Application5[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5]] = { context: Context5[F] =>
    context.append(context.start, t1.application(context))(Plus5.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum6[
    F[_, _, _, _, _, _],
    H1,
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
  ): Application6[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6]] = {
    context: Context6[F] =>
      context.append(context.start, t1.application(context))(Plus6.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
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
  ): Application7[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ]] = { context: Context7[F] =>
    context.append(context.start, t1.application(context))(Plus7.plusWithTypeParameter0)
  }
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1,
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
  ): Application8[F, TupleTag1[H1, M1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ], AsunaTuple1[X1_C8]] = { context: Context8[F] =>
    context.append(context.start, t1.application(context))(Plus8.plusWithTypeParameter0)
  }
}
