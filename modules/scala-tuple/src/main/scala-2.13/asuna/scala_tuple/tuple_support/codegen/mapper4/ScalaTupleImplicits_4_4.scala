package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_4 {
  def hlistTagApplicationImplicit_tagNum4_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
    H4,
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
    X4_C4
  ](
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4]
  ): Application4[
    F,
    H1 :: H2 :: H3 :: H4 :: HNil,
    X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: HNil,
    X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: HNil,
    X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: HNil,
    X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: HNil
  ] =
    new Application4[
      F,
      H1 :: H2 :: H3 :: H4 :: HNil,
      X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: HNil,
      X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: HNil,
      X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: HNil,
      X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: HNil
    ] {
      override def application(context: Context4[F]) = {
        context.append(
          ScalaTupleImplicits_3_4.hlistTagApplicationImplicit_tagNum3_typeParamNum4(t2, t3, t4).application(context),
          t1.application(context)
        )(HListPlus4.plusWithTypeParameter3)
      }
    }
  implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
    H4,
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
    X4_C4
  ](
    implicit t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4],
    t4: Application4[F, H4, X4_C1, X4_C2, X4_C3, X4_C4]
  ): Application4[F, (H1, H2, H3, H4), (X1_C1, X2_C1, X3_C1, X4_C1), (X1_C2, X2_C2, X3_C2, X4_C2), (X1_C3, X2_C3, X3_C3, X4_C3), (X1_C4, X2_C4, X3_C4, X4_C4)] =
    new Application4[F, (H1, H2, H3, H4), (X1_C1, X2_C1, X3_C1, X4_C1), (X1_C2, X2_C2, X3_C2, X4_C2), (X1_C3, X2_C3, X3_C3, X4_C3), (X1_C4, X2_C4, X3_C4, X4_C4)] {
      override def application(context: Context4[F]) = {
        context.append(
          ScalaTupleImplicits_3_4.hlistTagApplicationImplicit_tagNum3_typeParamNum4(t2, t3, t4).application(context),
          t1.application(context)
        )(PlusToTuple4.plusWithTypeParameter3)
      }
    }
}
object ScalaTupleImplicits_4_4 extends ScalaTupleImplicits_4_4
