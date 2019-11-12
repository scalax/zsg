package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.Application2
import asuna.Context2
import asuna.Application3
import asuna.Context3
import asuna.Application4
import asuna.Context4
import asuna.Application5
import asuna.Context5
import asuna.Application6
import asuna.Context6
import asuna.Application7
import asuna.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_11_7 {
  final implicit def tupleTagApplicationImplicit_tagNum11_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
    H6,
    H7,
    H8,
    H9,
    H10,
    H11,
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
    X8_C7,
    X9_C1,
    X9_C2,
    X9_C3,
    X9_C4,
    X9_C5,
    X9_C6,
    X9_C7,
    X10_C1,
    X10_C2,
    X10_C3,
    X10_C4,
    X10_C5,
    X10_C6,
    X10_C7,
    X11_C1,
    X11_C2,
    X11_C3,
    X11_C4,
    X11_C5,
    X11_C6,
    X11_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7],
    t5: Application7[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7],
    t6: Application7[F, H6, X6_C1, X6_C2, X6_C3, X6_C4, X6_C5, X6_C6, X6_C7],
    t7: Application7[F, H7, X7_C1, X7_C2, X7_C3, X7_C4, X7_C5, X7_C6, X7_C7],
    t8: Application7[F, H8, X8_C1, X8_C2, X8_C3, X8_C4, X8_C5, X8_C6, X8_C7],
    t9: Application7[F, H9, X9_C1, X9_C2, X9_C3, X9_C4, X9_C5, X9_C6, X9_C7],
    t10: Application7[F, H10, X10_C1, X10_C2, X10_C3, X10_C4, X10_C5, X10_C6, X10_C7],
    t11: Application7[F, H11, X11_C1, X11_C2, X11_C3, X11_C4, X11_C5, X11_C6, X11_C7]
  ): Application7[
    F,
    (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1, X9_C1, X10_C1, X11_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2, X9_C2, X10_C2, X11_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3, X9_C3, X10_C3, X11_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4, X9_C4, X10_C4, X11_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5, X6_C5, X7_C5, X8_C5, X9_C5, X10_C5, X11_C5),
    (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6, X6_C6, X7_C6, X8_C6, X9_C6, X10_C6, X11_C6),
    (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7, X6_C7, X7_C7, X8_C7, X9_C7, X10_C7, X11_C7)
  ] = { context: Context7[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(
                  context.append(
                    context.append(context.append(t11.application(context), t10.application(context))(HListPlus7.plusWithTypeParameter1), t9.application(context))(
                      HListPlus7.plusWithTypeParameter2
                    ),
                    t8.application(context)
                  )(HListPlus7.plusWithTypeParameter3),
                  t7.application(context)
                )(HListPlus7.plusWithTypeParameter4),
                t6.application(context)
              )(HListPlus7.plusWithTypeParameter5),
              t5.application(context)
            )(HListPlus7.plusWithTypeParameter6),
            t4.application(context)
          )(HListPlus7.plusWithTypeParameter7),
          t3.application(context)
        )(HListPlus7.plusWithTypeParameter8),
        t2.application(context)
      )(HListPlus7.plusWithTypeParameter9),
      t1.application(context)
    )(PlusToTuple7.plusWithTypeParameter10)
  }
}
