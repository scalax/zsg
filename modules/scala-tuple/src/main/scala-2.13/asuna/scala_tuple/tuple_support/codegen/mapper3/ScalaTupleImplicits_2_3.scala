package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_2_3 {
  implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum3[
    F[_, _, _],
    H1,
    H2,
    X1_C1,
    X1_C2,
    X1_C3,
    X2_C1,
    X2_C2,
    X2_C3
  ](
    implicit t1: Application3[F, H1, X1_C1, X1_C2, X1_C3],
    t2: Application3[F, H2, X2_C1, X2_C2, X2_C3]
  ): Application3[F, (H1, H2), (X1_C1, X2_C1), (X1_C2, X2_C2), (X1_C3, X2_C3)] = { (context: Context3[F]) =>
    context.append(t2.application(context), t1.application(context))(PlusToTuple3.plusWithTypeParameter1)
  }
}
