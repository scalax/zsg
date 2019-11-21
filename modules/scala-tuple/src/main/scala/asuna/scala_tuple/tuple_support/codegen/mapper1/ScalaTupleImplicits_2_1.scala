package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_2_1 {
final implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum1[
F[_ ]
, H1  , H2
, X1_C1
, X2_C1
]
(implicit
t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ] )
: Application1[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 ) ] =
{ context: Context1[F] =>
context.append(t2.application(context), t1.application(context))(PlusToTuple1.plusWithTypeParameter1)
}
}
