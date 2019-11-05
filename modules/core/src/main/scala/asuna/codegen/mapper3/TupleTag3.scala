package asuna
import asuna.support.TypeHListPlus1
import asuna.support.TypeHListPlus2
import asuna.support.TypeHListPlus3
import scala.language.higherKinds
import impl._
final class TupleTag3[T1, M1 <: Message, T2, M2 <: Message, T3, M3 <: Message] extends TupleTag {
  override final type M[M <: Message] = TupleTag3[T1, M :-<>-: M1, T2, M :-<>-: M2, T3, M :-<>-: M3]
}
final object TupleTag3 {
  final implicit def tupleTagApplicationImplicit3[
    K <: KindContext,
    H1,
    H2,
    H3,
    T1 <: TypeHList,
    T2 <: TypeHList,
    T3 <: TypeHList,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message
  ](
    implicit t1: Application[K, H1, T1],
    t2: Application[K, H2, T2],
    t3: Application[K, H3, T3]
  ): Application[K, TupleTag3[H1, M1, H2, M2, H3, M3], TupleTypeHList3[T1, T2, T3]] = { context =>
    context.append[TupleTypeHList2[T2, T3], T1, TupleTypeHList3[T1, T2, T3]](
      context.append[TupleTypeHList1[T3], T2, TupleTypeHList2[T2, T3]](
        context.append[TupleTypeHList0, T3, TupleTypeHList1[T3]](context.start, t3.application(context), TypeHListPlus1.plus1),
        t2.application(context),
        TypeHListPlus2.plus2
      ),
      t1.application(context),
      TypeHListPlus3.plus3
    )
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum1[
    F[_],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    X1_C1,
    X2_C1,
    X3_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1],
    t2: Application1[F, H2, X2_C1],
    t3: Application1[F, H3, X3_C1]
  ): Application1[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1]] = { context: Context1[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus1.plusWithTypeParameter0), t2.application(context))(Plus1.plusWithTypeParameter1),
      t1.application(context)
    )(Plus1.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum2[
    F[_, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    X1_C1,
    X1_C2,
    X2_C1,
    X2_C2,
    X3_C1,
    X3_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2],
    t2: Application2[F, H2, X2_C1, X2_C2],
    t3: Application2[F, H3, X3_C1, X3_C2]
  ): Application2[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2]] = { context: Context2[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus2.plusWithTypeParameter0), t2.application(context))(Plus2.plusWithTypeParameter1),
      t1.application(context)
    )(Plus2.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum3[
    F[_, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
    X1_C1,
    X1_C2,
    X1_C3,
    X2_C1,
    X2_C2,
    X2_C3,
    X3_C1,
    X3_C2,
    X3_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3],
    t3: Application3[F, H3, X3_C1, X3_C2, X3_C3]
  ): Application3[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3]] = {
    context: Context3[F] =>
      context.append(
        context.append(context.append(context.start, t3.application(context))(Plus3.plusWithTypeParameter0), t2.application(context))(Plus3.plusWithTypeParameter1),
        t1.application(context)
      )(Plus3.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
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
    X3_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4]
  ): Application4[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3], AsunaTuple3[
    X1_C4,
    X2_C4,
    X3_C4
  ]] = { context: Context4[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus4.plusWithTypeParameter0), t2.application(context))(Plus4.plusWithTypeParameter1),
      t1.application(context)
    )(Plus4.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
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
    X3_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5]
  ): Application5[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3], AsunaTuple3[
    X1_C4,
    X2_C4,
    X3_C4
  ], AsunaTuple3[X1_C5, X2_C5, X3_C5]] = { context: Context5[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus5.plusWithTypeParameter0), t2.application(context))(Plus5.plusWithTypeParameter1),
      t1.application(context)
    )(Plus5.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum6[
    F[_, _, _, _, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
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
    X3_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    t2: Application6[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6],
    t3: Application6[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6]
  ): Application6[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3], AsunaTuple3[
    X1_C4,
    X2_C4,
    X3_C4
  ], AsunaTuple3[X1_C5, X2_C5, X3_C5], AsunaTuple3[X1_C6, X2_C6, X3_C6]] = { context: Context6[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus6.plusWithTypeParameter0), t2.application(context))(Plus6.plusWithTypeParameter1),
      t1.application(context)
    )(Plus6.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
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
    X3_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7]
  ): Application7[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3], AsunaTuple3[
    X1_C4,
    X2_C4,
    X3_C4
  ], AsunaTuple3[X1_C5, X2_C5, X3_C5], AsunaTuple3[X1_C6, X2_C6, X3_C6], AsunaTuple3[X1_C7, X2_C7, X3_C7]] = { context: Context7[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus7.plusWithTypeParameter0), t2.application(context))(Plus7.plusWithTypeParameter1),
      t1.application(context)
    )(Plus7.plusWithTypeParameter2)
  }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    M1 <: Message,
    M2 <: Message,
    M3 <: Message,
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
    X3_C8
  ](
    implicit
    t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8],
    t3: Application8[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8]
  ): Application8[F, TupleTag3[H1, M1, H2, M2, H3, M3], AsunaTuple3[X1_C1, X2_C1, X3_C1], AsunaTuple3[X1_C2, X2_C2, X3_C2], AsunaTuple3[X1_C3, X2_C3, X3_C3], AsunaTuple3[
    X1_C4,
    X2_C4,
    X3_C4
  ], AsunaTuple3[X1_C5, X2_C5, X3_C5], AsunaTuple3[X1_C6, X2_C6, X3_C6], AsunaTuple3[X1_C7, X2_C7, X3_C7], AsunaTuple3[X1_C8, X2_C8, X3_C8]] = { context: Context8[F] =>
    context.append(
      context.append(context.append(context.start, t3.application(context))(Plus8.plusWithTypeParameter0), t2.application(context))(Plus8.plusWithTypeParameter1),
      t1.application(context)
    )(Plus8.plusWithTypeParameter2)
  }
}
