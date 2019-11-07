package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_13_4 {
  final implicit def tupleTagApplicationImplicit_tagNum13_typeParamNum4[
    F[_, _, _, _],
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
    H12,
    H13,
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
    X8_C4,
    X9_C1,
    X9_C2,
    X9_C3,
    X9_C4,
    X10_C1,
    X10_C2,
    X10_C3,
    X10_C4,
    X11_C1,
    X11_C2,
    X11_C3,
    X11_C4,
    X12_C1,
    X12_C2,
    X12_C3,
    X12_C4,
    X13_C1,
    X13_C2,
    X13_C3,
    X13_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4],
    t5: Application4[F, H5, X5_C1, X5_C2, X5_C3, X5_C4],
    t6: Application4[F, H6, X6_C1, X6_C2, X6_C3, X6_C4],
    t7: Application4[F, H7, X7_C1, X7_C2, X7_C3, X7_C4],
    t8: Application4[F, H8, X8_C1, X8_C2, X8_C3, X8_C4],
    t9: Application4[F, H9, X9_C1, X9_C2, X9_C3, X9_C4],
    t10: Application4[F, H10, X10_C1, X10_C2, X10_C3, X10_C4],
    t11: Application4[F, H11, X11_C1, X11_C2, X11_C3, X11_C4],
    t12: Application4[F, H12, X12_C1, X12_C2, X12_C3, X12_C4],
    t13: Application4[F, H13, X13_C1, X13_C2, X13_C3, X13_C4]
  ): Application4[
    F,
    (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1, X9_C1, X10_C1, X11_C1, X12_C1, X13_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2, X9_C2, X10_C2, X11_C2, X12_C2, X13_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3, X9_C3, X10_C3, X11_C3, X12_C3, X13_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4, X6_C4, X7_C4, X8_C4, X9_C4, X10_C4, X11_C4, X12_C4, X13_C4)
  ] = { context: Context4[F] =>
    context.append(
      context.append(
        context.append(
          context.append(
            context.append(
              context.append(
                context.append(
                  context.append(
                    context.append(
                      context.append(
                        context.append(context.append(t13.application(context), t12.application(context))(HListPlus4.plusWithTypeParameter1), t11.application(context))(
                          HListPlus4.plusWithTypeParameter2
                        ),
                        t10.application(context)
                      )(HListPlus4.plusWithTypeParameter3),
                      t9.application(context)
                    )(HListPlus4.plusWithTypeParameter4),
                    t8.application(context)
                  )(HListPlus4.plusWithTypeParameter5),
                  t7.application(context)
                )(HListPlus4.plusWithTypeParameter6),
                t6.application(context)
              )(HListPlus4.plusWithTypeParameter7),
              t5.application(context)
            )(HListPlus4.plusWithTypeParameter8),
            t4.application(context)
          )(HListPlus4.plusWithTypeParameter9),
          t3.application(context)
        )(HListPlus4.plusWithTypeParameter10),
        t2.application(context)
      )(HListPlus4.plusWithTypeParameter11),
      t1.application(context)
    )(PlusToTuple4.plusWithTypeParameter12)
  }
}
