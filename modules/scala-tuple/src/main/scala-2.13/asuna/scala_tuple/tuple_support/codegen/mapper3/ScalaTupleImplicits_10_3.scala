package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_10_3 {
  implicit def tupleTagApplicationImplicit_tagNum10_typeParamNum3[
    F[_, _, _],
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
    X6_C3,
    X7_C1,
    X7_C2,
    X7_C3,
    X8_C1,
    X8_C2,
    X8_C3,
    X9_C1,
    X9_C2,
    X9_C3,
    X10_C1,
    X10_C2,
    X10_C3
  ](
    implicit t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3],
    t3: Application3[F, H3, X3_C1, X3_C2, X3_C3],
    t4: Application3[F, H4, X4_C1, X4_C2, X4_C3],
    t5: Application3[F, H5, X5_C1, X5_C2, X5_C3],
    t6: Application3[F, H6, X6_C1, X6_C2, X6_C3],
    t7: Application3[F, H7, X7_C1, X7_C2, X7_C3],
    t8: Application3[F, H8, X8_C1, X8_C2, X8_C3],
    t9: Application3[F, H9, X9_C1, X9_C2, X9_C3],
    t10: Application3[F, H10, X10_C1, X10_C2, X10_C3]
  ): Application3[
    F,
    (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1, X9_C1, X10_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2, X9_C2, X10_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3, X9_C3, X10_C3)
  ] =
    new Application3[
      F,
      (H1, H2, H3, H4, H5, H6, H7, H8, H9, H10),
      (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1, X9_C1, X10_C1),
      (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2, X9_C2, X10_C2),
      (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3, X6_C3, X7_C3, X8_C3, X9_C3, X10_C3)
    ] {
      override def application(context: Context3[F]) = {
        context.append(
          ScalaTupleImplicits_9_3
            .tupleTagApplicationImplicit_tagNum9_typeParamNum3[
              F,
              H2,
              H3,
              H4,
              H5,
              H6,
              H7,
              H8,
              H9,
              H10,
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
              X6_C3,
              X7_C1,
              X7_C2,
              X7_C3,
              X8_C1,
              X8_C2,
              X8_C3,
              X9_C1,
              X9_C2,
              X9_C3,
              X10_C1,
              X10_C2,
              X10_C3
            ]
            .application(context),
          t1.application(context)
        )(PlusToTuple3.plusWithTypeParameter9)
      }
    }
}
object ScalaTupleImplicits_10_3 extends ScalaTupleImplicits_10_3
