package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_3_2 {
given tupleTagApplicationImplicit_tagNum3_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
](given t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ] )
: Application2[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 )  , (X1_C2  , X2_C2  , X3_C2 ) ] =
new Application2[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 )  , (X1_C2  , X2_C2  , X3_C2 ) ] {
override def application(context: Context2[F]) = {
context.append(
ScalaTupleImplicits_2_2.tupleTagApplicationImplicit_tagNum2_typeParamNum2[
F
, H2  , H3
, X2_C1  , X2_C2
, X3_C1  , X3_C2
].application(context),
t1.application(context)
)(PlusToTuple2.plusWithTypeParameter2)
}
}
}
object ScalaTupleImplicits_3_2 extends ScalaTupleImplicits_3_2
