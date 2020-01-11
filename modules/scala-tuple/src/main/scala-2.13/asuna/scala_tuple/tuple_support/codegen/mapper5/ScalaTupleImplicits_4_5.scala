package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_5 {
  def hlistTagApplicationImplicit_tagNum4_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
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
    X3_C5,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5
  ](
    t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5],
    t4: Application5[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5]
  ): Application5[
    F,
    H1 :: H2 :: H3 :: H4 :: HNil,
    X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: HNil,
    X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: HNil,
    X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: HNil,
    X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: HNil,
    X1_C5 :: X2_C5 :: X3_C5 :: X4_C5 :: HNil
  ] =
    new Application5[
      F,
      H1 :: H2 :: H3 :: H4 :: HNil,
      X1_C1 :: X2_C1 :: X3_C1 :: X4_C1 :: HNil,
      X1_C2 :: X2_C2 :: X3_C2 :: X4_C2 :: HNil,
      X1_C3 :: X2_C3 :: X3_C3 :: X4_C3 :: HNil,
      X1_C4 :: X2_C4 :: X3_C4 :: X4_C4 :: HNil,
      X1_C5 :: X2_C5 :: X3_C5 :: X4_C5 :: HNil
    ] {
      override def application(context: Context5[F]) = {
        context.append(
          ScalaTupleImplicits_3_5.hlistTagApplicationImplicit_tagNum3_typeParamNum5(t2, t3, t4).application(context),
          t1.application(context)
        )(HListPlus5.plusWithTypeParameter3)
      }
    }
  implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum5[
    F[_, _, _, _, _],
    H1,
    H2,
    H3,
    H4,
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
    X3_C5,
    X4_C1,
    X4_C2,
    X4_C3,
    X4_C4,
    X4_C5
  ](
    implicit t1: Application5[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5],
    t2: Application5[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5],
    t3: Application5[F, H3, X3_C1, X3_C2, X3_C3, X3_C4, X3_C5],
    t4: Application5[F, H4, X4_C1, X4_C2, X4_C3, X4_C4, X4_C5]
  ): Application5[
    F,
    (H1, H2, H3, H4),
    (X1_C1, X2_C1, X3_C1, X4_C1),
    (X1_C2, X2_C2, X3_C2, X4_C2),
    (X1_C3, X2_C3, X3_C3, X4_C3),
    (X1_C4, X2_C4, X3_C4, X4_C4),
    (X1_C5, X2_C5, X3_C5, X4_C5)
  ] =
    new Application5[
      F,
      (H1, H2, H3, H4),
      (X1_C1, X2_C1, X3_C1, X4_C1),
      (X1_C2, X2_C2, X3_C2, X4_C2),
      (X1_C3, X2_C3, X3_C3, X4_C3),
      (X1_C4, X2_C4, X3_C4, X4_C4),
      (X1_C5, X2_C5, X3_C5, X4_C5)
    ] {
      override def application(context: Context5[F]) = {
        context.append(
          ScalaTupleImplicits_3_5.hlistTagApplicationImplicit_tagNum3_typeParamNum5(t2, t3, t4).application(context),
          t1.application(context)
        )(PlusToTuple5.plusWithTypeParameter3)
      }
    }
}
object ScalaTupleImplicits_4_5 extends ScalaTupleImplicits_4_5
