package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_3_4 {
  def hlistTagApplicationImplicit_tagNum3_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
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
    t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4]
  ): Application4[
    F,
    H1 :: H2 :: H3 :: HNil,
    X1_C1 :: X2_C1 :: X3_C1 :: HNil,
    X1_C2 :: X2_C2 :: X3_C2 :: HNil,
    X1_C3 :: X2_C3 :: X3_C3 :: HNil,
    X1_C4 :: X2_C4 :: X3_C4 :: HNil
  ] =
    new Application4[
      F,
      H1 :: H2 :: H3 :: HNil,
      X1_C1 :: X2_C1 :: X3_C1 :: HNil,
      X1_C2 :: X2_C2 :: X3_C2 :: HNil,
      X1_C3 :: X2_C3 :: X3_C3 :: HNil,
      X1_C4 :: X2_C4 :: X3_C4 :: HNil
    ] {
      override def application(context: Context4[F]) = {
        context.append(
          ScalaTupleImplicits_2_4.hlistTagApplicationImplicit_tagNum2_typeParamNum4(t2, t3).application(context),
          t1.application(context)
        )(HListPlus4.plusWithTypeParameter2)
      }
    }
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum4[
    F[_, _, _, _],
    H1,
    H2,
    H3,
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
    implicit t1: Application4[F, H1, X1_C1, X1_C2, X1_C3, X1_C4],
    t2: Application4[F, H2, X2_C1, X2_C2, X2_C3, X2_C4],
    t3: Application4[F, H3, X3_C1, X3_C2, X3_C3, X3_C4]
  ): Application4[F, (H1, H2, H3), (X1_C1, X2_C1, X3_C1), (X1_C2, X2_C2, X3_C2), (X1_C3, X2_C3, X3_C3), (X1_C4, X2_C4, X3_C4)] =
    new Application4[F, (H1, H2, H3), (X1_C1, X2_C1, X3_C1), (X1_C2, X2_C2, X3_C2), (X1_C3, X2_C3, X3_C3), (X1_C4, X2_C4, X3_C4)] {
      override def application(context: Context4[F]) = {
        context.append(
          ScalaTupleImplicits_2_4.hlistTagApplicationImplicit_tagNum2_typeParamNum4(t2, t3).application(context),
          t1.application(context)
        )(PlusToTuple4.plusWithTypeParameter2)
      }
    }
}
object ScalaTupleImplicits_3_4 extends ScalaTupleImplicits_3_4
