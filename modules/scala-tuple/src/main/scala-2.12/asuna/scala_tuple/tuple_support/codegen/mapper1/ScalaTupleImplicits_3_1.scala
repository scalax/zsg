package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_3_1 {
implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum1[
F[_ ]
, H1  , H2  , H3
, X1_C1
, X2_C1
, X3_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ] )
: Application1[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 ) ] =
new Application1[
F,
(H1  , H2  , H3 )  , (X1_C1  , X2_C1  , X3_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_2_1.tupleTagApplicationImplicit_tagNum2_typeParamNum1[
F
, H2  , H3
, X2_C1
, X3_C1
].application(context),
t1.application(context)
)(PlusToTuple1.plusWithTypeParameter2)
}
}
}
object ScalaTupleImplicits_3_1 extends ScalaTupleImplicits_3_1
