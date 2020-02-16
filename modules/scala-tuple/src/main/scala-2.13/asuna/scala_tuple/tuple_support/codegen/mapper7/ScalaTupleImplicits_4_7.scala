package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_7 {
  implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
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
    X4_C7
  ](
    implicit t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7],
    t3: Application7[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7],
    t4: Application7[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7]
  ): Application7[
    F,
    (H1, H2, H3, H4),
    (X1_C1, X2_C1, X3_C1, X4_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5),
    (X1_C6, X2_C6, X3_C6, X4_C6),
    (X1_C7, X2_C7, X3_C7, X4_C7)
  ] =
    new Application7[
      F,
      (H1, H2, H3, H4),
      (X1_C1, X2_C1, X3_C1, X4_C1),
      (X1_C2, X2_C2, X3_C2, X4_C2),
      (X1_C3, X2_C3, X3_C3, X4_C3),
      (X1_C4, X2_C4, X3_C4, X4_C4),
      (X1_C5, X2_C5, X3_C5, X4_C5),
      (X1_C6, X2_C6, X3_C6, X4_C6),
      (X1_C7, X2_C7, X3_C7, X4_C7)
    ] {
      override def application(context: Context7[F]) = {
        context.append(
          ScalaTupleImplicits_3_7
            .tupleTagApplicationImplicit_tagNum3_typeParamNum7[
              F,
              H2,
              H3,
              H4,
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
              X4_C7
            ]
            .application(context),
          t1.application(context)
        )(PlusToTuple7.plusWithTypeParameter3)
      }
    }
}
object ScalaTupleImplicits_4_7 extends ScalaTupleImplicits_4_7
