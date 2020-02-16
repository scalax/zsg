package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_5_8 {
  implicit def tupleTagApplicationImplicit_tagNum5_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
    H5,
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
    X5_C8
  ](
    implicit t1: Application8[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7, X1_C8],
    t2: Application8[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7, X2_C8],
    t3: Application8[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5, X3_C6, X3_C7, X3_C8],
    t4: Application8[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5, X4_C6, X4_C7, X4_C8],
    t5: Application8[F, H5, X5_C1, X5_C2, X5_C3, X5_C4, X5_C5, X5_C6, X5_C7, X5_C8]
  ): Application8[
    F,
    (H1, H2, H3, H4, H5),
    (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5),
    (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6),
    (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7),
    (X1_C8, X2_C8, X3_C8, X4_C8, X5_C8)
  ] =
    new Application8[
      F,
      (H1, H2, H3, H4, H5),
      (X1_C1, X2_C1, X3_C1, X4_C1, X5_C1),
      (X1_C2, X2_C2, X3_C2, X4_C2, X5_C2),
      (X1_C3, X2_C3, X3_C3, X4_C3, X5_C3),
      (X1_C4, X2_C4, X3_C4, X4_C4, X5_C4),
      (X1_C5, X2_C5, X3_C5, X4_C5, X5_C5),
      (X1_C6, X2_C6, X3_C6, X4_C6, X5_C6),
      (X1_C7, X2_C7, X3_C7, X4_C7, X5_C7),
      (X1_C8, X2_C8, X3_C8, X4_C8, X5_C8)
    ] {
      override def application(context: Context8[F]) = {
        context.append(
          ScalaTupleImplicits_4_8
            .tupleTagApplicationImplicit_tagNum4_typeParamNum8[
              F,
              H2,
              H3,
              H4,
              H5,
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
              X5_C8
            ]
            .application(context),
          t1.application(context)
        )(PlusToTuple8.plusWithTypeParameter4)
      }
    }
}
object ScalaTupleImplicits_5_8 extends ScalaTupleImplicits_5_8
