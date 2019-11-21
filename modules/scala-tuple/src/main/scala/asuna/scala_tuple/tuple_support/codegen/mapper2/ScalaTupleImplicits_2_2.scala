package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_2_2 {
final implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum2[
F[_  , _ ]
, H1  , H2
, X1_C1  , X1_C2
, X2_C1  , X2_C2
]
(implicit
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ] )
: Application2[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 ) ] =
{ context: Context2[F] =>
context.append(t2.application(context), t1.application(context))(PlusToTuple2.plusWithTypeParameter1)
}
}
