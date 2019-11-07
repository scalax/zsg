package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_5_4 {
  final implicit def tupleTagApplicationImplicit_tagNum5_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
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
    X5_C4
  ](
    implicit
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4],
    t5: Application4[F, H5, X5_C1, X5_C2, X5_C3, X5_C4]
  ): Application4[
    F,
    (H1, H2, H3, H4, H5),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4)
  ] = { context: Context4[F] =>
    context.append(
      context.append(
        context.append(context.append(t5.application(context), t4.application(context))(HListPlus4.plusWithTypeParameter1), t3.application(context))(
          HListPlus4.plusWithTypeParameter2
        ),
        t2.application(context)
      )(HListPlus4.plusWithTypeParameter3),
      t1.application(context)
    )(PlusToTuple4.plusWithTypeParameter4)
  }
}