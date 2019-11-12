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
trait ScalaTupleImplicits_2_7 {
  final implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum7[
    F[_, _, _, _, _, _, _],
    H1,
    H2,
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
    X2_C7
  ](
    implicit
    t1: Application7[F, H1, X1_C1, X1_C2, X1_C3, X1_C4, X1_C5, X1_C6, X1_C7],
    t2: Application7[F, H2, X2_C1, X2_C2, X2_C3, X2_C4, X2_C5, X2_C6, X2_C7]
  ): Application7[F, (H1, H2), (X1_C1, X2_C1), (X1_C2, X2_C2), (X1_C3, X2_C3), (X1_C4, X2_C4), (X1_C5, X2_C5), (X1_C6, X2_C6), (X1_C7, X2_C7)] = { context: Context7[F] =>
    context.append(t2.application(context), t1.application(context))(PlusToTuple7.plusWithTypeParameter1)
  }
}
