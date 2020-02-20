package asuna.support
import scala.language.higherKinds
import asuna.TupleTag
import asuna.NodeTag1
import asuna.NodeTag2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.Application1
import asuna.Plus1
import asuna.Context1
import asuna.Application2
import asuna.Plus2
import asuna.Context2
import asuna.Application3
import asuna.Plus3
import asuna.Context3
import asuna.Application4
import asuna.Plus4
import asuna.Context4
import asuna.Application5
import asuna.Plus5
import asuna.Context5
import asuna.Application6
import asuna.Plus6
import asuna.Context6
import asuna.Application7
import asuna.Plus7
import asuna.Context7
import asuna.Application8
import asuna.Plus8
import asuna.Context8
class NodeTag1ApplicationCompanion {
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum1[
    F[_],
    H1 <: TupleTag,
    X1_C1
  ](
    implicit
    t1: Application1[F, H1, X1_C1]
  ): Application1[F, NodeTag1[H1], AsunaTuple1[X1_C1]] = {
    val plus1_parameter0: Plus1[
      AsunaTuple0,
      X1_C1,
      AsunaTuple1[X1_C1]
    ] = Plus1.cachePlusWithTypeParameter0
    new Application1[F, NodeTag1[H1], AsunaTuple1[X1_C1]] {
      override final def application(context: Context1[F]): F[AsunaTuple1[X1_C1]] = {
        context.append(context.start, t1.application(context))(plus1_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum2[
    F[_, _],
    H1 <: TupleTag,
    X1_C1,
    X1_C2
  ](
    implicit
    t1: Application2[F, H1, X1_C1, X1_C2]
  ): Application2[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2]] = {
    val plus2_parameter0: Plus2[
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2]
    ] = Plus2.cachePlusWithTypeParameter0
    new Application2[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2]] {
      override final def application(context: Context2[F]): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2]] = {
        context.append(context.start, t1.application(context))(plus2_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum3[
    F[_, _, _],
    H1 <: TupleTag,
    X1_C1,
    X1_C2,
    X1_C3
  ](
    implicit
    t1: Application3[F, H1, X1_C1, X1_C2, X1_C3]
  ): Application3[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3]] = {
    val plus3_parameter0: Plus3[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3]
    ] = Plus3.cachePlusWithTypeParameter0
    new Application3[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3]] {
      override final def application(context: Context3[F]): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3]] = {
        context.append(context.start, t1.application(context))(plus3_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum4[
    F[_, _, _, _],
    H1 <: TupleTag,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4]
  ): Application4[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4]] = {
    val plus4_parameter0: Plus4[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3],
      AsunaTuple1[X1_C4]
    ] = Plus4.cachePlusWithTypeParameter0
    new Application4[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4]] {
      override final def application(context: Context4[F]): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4]] = {
        context.append(context.start, t1.application(context))(plus4_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum5[
    F[_, _, _, _, _],
    H1 <: TupleTag,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5
  ](
    implicit
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5]
  ): Application5[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5]] = {
    val plus5_parameter0: Plus5[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3],
      AsunaTuple1[X1_C4],
      AsunaTuple1[X1_C5]
    ] = Plus5.cachePlusWithTypeParameter0
    new Application5[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5]] {
      override final def application(context: Context5[F]): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5]] = {
        context.append(context.start, t1.application(context))(plus5_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum6[
    F[_, _, _, _, _, _],
    H1 <: TupleTag,
    X1_C1,
    X1_C2,
    X1_C3,
    X1_C4,
    X1_C5,
    X1_C6
  ](
    implicit
    t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6]
  ): Application6[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6]] = {
    val plus6_parameter0: Plus6[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3],
      AsunaTuple1[X1_C4],
      AsunaTuple1[X1_C5],
      AsunaTuple1[X1_C6]
    ] = Plus6.cachePlusWithTypeParameter0
    new Application6[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6]] {
      override final def application(
        context: Context6[F]
      ): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6]] = {
        context.append(context.start, t1.application(context))(plus6_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1 <: TupleTag,
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
  ): Application7[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ]] = {
    val plus7_parameter0: Plus7[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3],
      AsunaTuple1[X1_C4],
      AsunaTuple1[X1_C5],
      AsunaTuple1[X1_C6],
      AsunaTuple1[X1_C7]
    ] = Plus7.cachePlusWithTypeParameter0
    new Application7[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
      X1_C7
    ]] {
      override final def application(
        context: Context7[F]
      ): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[X1_C7]] = {
        context.append(context.start, t1.application(context))(plus7_parameter0)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum1_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1 <: TupleTag,
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
  ): Application8[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
    X1_C7
  ], AsunaTuple1[X1_C8]] = {
    val plus8_parameter0: Plus8[
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      AsunaTuple0,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7,
      X1_C8,
      AsunaTuple1[X1_C1],
      AsunaTuple1[X1_C2],
      AsunaTuple1[X1_C3],
      AsunaTuple1[X1_C4],
      AsunaTuple1[X1_C5],
      AsunaTuple1[X1_C6],
      AsunaTuple1[X1_C7],
      AsunaTuple1[X1_C8]
    ] = Plus8.cachePlusWithTypeParameter0
    new Application8[F, NodeTag1[H1], AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[
      X1_C7
    ], AsunaTuple1[X1_C8]] {
      override final def application(
        context: Context8[F]
      ): F[AsunaTuple1[X1_C1], AsunaTuple1[X1_C2], AsunaTuple1[X1_C3], AsunaTuple1[X1_C4], AsunaTuple1[X1_C5], AsunaTuple1[X1_C6], AsunaTuple1[X1_C7], AsunaTuple1[
        X1_C8
      ]] = {
        context.append(context.start, t1.application(context))(plus8_parameter0)
      }
    }
  }
}
class NodeTag2ApplicationCompanion {
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum1[F[_], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X2_C1](
    implicit t1: Application1[F, H1, X1_C1],
    t2: Application1[F, H2, X2_C1]
  ): Application1[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1]] = {
    val plus1_parameter1: Plus1[
      X2_C1,
      X1_C1,
      AsunaTuple2[X1_C1, X2_C1]
    ] = Plus1.cachePlusWithTypeParameter1
    new Application1[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1]] {
      override def application(context: Context1[F]): F[AsunaTuple2[X1_C1, X2_C1]] = {
        context.append(t2.application(context), t1.application(context))(plus1_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum2[F[_, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X2_C1, X2_C2](
    implicit t1: Application2[F, H1, X1_C1, X1_C2],
    t2: Application2[F, H2, X2_C1, X2_C2]
  ): Application2[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2]] = {
    val plus2_parameter1: Plus2[
      X2_C1,
      X2_C2,
      X1_C1,
      X1_C2,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2]
    ] = Plus2.cachePlusWithTypeParameter1
    new Application2[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2]] {
      override def application(context: Context2[F]): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2]] = {
        context.append(t2.application(context), t1.application(context))(plus2_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum3[F[_, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X2_C1, X2_C2, X2_C3](
    implicit t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3]
  ): Application3[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3]] = {
    val plus3_parameter1: Plus3[
      X2_C1,
      X2_C2,
      X2_C3,
      X1_C1,
      X1_C2,
      X1_C3,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3]
    ] = Plus3.cachePlusWithTypeParameter1
    new Application3[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3]] {
      override def application(context: Context3[F]): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3]] = {
        context.append(t2.application(context), t1.application(context))(plus3_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum4[F[_, _, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X1_C4, X2_C1, X2_C2, X2_C3, X2_C4](
    implicit t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4]
  ): Application4[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4]] = {
    val plus4_parameter1: Plus4[
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4]
    ] = Plus4.cachePlusWithTypeParameter1
    new Application4[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4]] {
      override def application(context: Context4[F]): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4]] = {
        context.append(t2.application(context), t1.application(context))(plus4_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum5[F[_, _, _, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5](
    implicit t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5]
  ): Application5[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ]] = {
    val plus5_parameter1: Plus5[
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5]
    ] = Plus5.cachePlusWithTypeParameter1
    new Application5[
      F,
      NodeTag2[H1, H2],
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5]
    ] {
      override def application(
        context: Context5[F]
      ): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[X1_C5, X2_C5]] = {
        context.append(t2.application(context), t1.application(context))(plus5_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum6[F[_, _, _, _, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6](
    implicit t1: Application6[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6],
    t2: Application6[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6]
  ): Application6[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6]] = {
    val plus6_parameter1: Plus6[
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6]
    ] = Plus6.cachePlusWithTypeParameter1
    new Application6[
      F,
      NodeTag2[H1, H2],
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6]
    ] {
      override def application(
        context: Context6[F]
      ): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[X1_C5, X2_C5], AsunaTuple2[
        X1_C6,
        X2_C6
      ]] = {
        context.append(t2.application(context), t1.application(context))(plus6_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum7[F[_, _, _, _, _, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7](
    implicit t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7]
  ): Application7[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6], AsunaTuple2[X1_C7, X2_C7]] = {
    val plus7_parameter1: Plus7[
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6,
      X2_C7,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6],
      AsunaTuple2[X1_C7, X2_C7]
    ] = Plus7.cachePlusWithTypeParameter1
    new Application7[
      F,
      NodeTag2[H1, H2],
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6],
      AsunaTuple2[X1_C7, X2_C7]
    ] {
      override def application(
        context: Context7[F]
      ): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[X1_C5, X2_C5], AsunaTuple2[
        X1_C6,
        X2_C6
      ], AsunaTuple2[X1_C7, X2_C7]] = {
        context.append(t2.application(context), t1.application(context))(plus7_parameter1)
      }
    }
  }
  final implicit def noteTagApplicationImplicit_tagNum2_typeParamNum8[F[_, _, _, _, _, _, _, _], H1 <: TupleTag, H2 <: TupleTag, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8](
    implicit t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8]
  ): Application8[F, NodeTag2[H1, H2], AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[
    X1_C5,
    X2_C5
  ], AsunaTuple2[X1_C6, X2_C6], AsunaTuple2[X1_C7, X2_C7], AsunaTuple2[X1_C8, X2_C8]] = {
    val plus8_parameter1: Plus8[
      X2_C1,
      X2_C2,
      X2_C3,
      X2_C4,
      X2_C5,
      X2_C6,
      X2_C7,
      X2_C8,
      X1_C1,
      X1_C2,
      X1_C3,
      X1_C4,
      X1_C5,
      X1_C6,
      X1_C7,
      X1_C8,
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6],
      AsunaTuple2[X1_C7, X2_C7],
      AsunaTuple2[X1_C8, X2_C8]
    ] = Plus8.cachePlusWithTypeParameter1
    new Application8[
      F,
      NodeTag2[H1, H2],
      AsunaTuple2[X1_C1, X2_C1],
      AsunaTuple2[X1_C2, X2_C2],
      AsunaTuple2[X1_C3, X2_C3],
      AsunaTuple2[X1_C4, X2_C4],
      AsunaTuple2[X1_C5, X2_C5],
      AsunaTuple2[X1_C6, X2_C6],
      AsunaTuple2[X1_C7, X2_C7],
      AsunaTuple2[X1_C8, X2_C8]
    ] {
      override def application(
        context: Context8[F]
      ): F[AsunaTuple2[X1_C1, X2_C1], AsunaTuple2[X1_C2, X2_C2], AsunaTuple2[X1_C3, X2_C3], AsunaTuple2[X1_C4, X2_C4], AsunaTuple2[X1_C5, X2_C5], AsunaTuple2[
        X1_C6,
        X2_C6
      ], AsunaTuple2[X1_C7, X2_C7], AsunaTuple2[X1_C8, X2_C8]] = {
        context.append(t2.application(context), t1.application(context))(plus8_parameter1)
      }
    }
  }
}
