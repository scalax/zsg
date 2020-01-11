package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_1 {
def hlistTagApplicationImplicit_tagNum4_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4
, X1_C1
, X2_C1
, X3_C1
, X4_C1
](t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ] )
: Application1[
F,
H1 ::  H2 ::  H3 ::  H4 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  HNil ] =
new Application1[
F,
H1 ::  H2 ::  H3 ::  H4 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  HNil ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_3_1.hlistTagApplicationImplicit_tagNum3_typeParamNum1(t2  , t3  , t4 ).application(context),
t1.application(context)
)(HListPlus1.plusWithTypeParameter3)
}
}
implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4
, X1_C1
, X2_C1
, X3_C1
, X4_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 ) ] =
new Application1[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_3_1.hlistTagApplicationImplicit_tagNum3_typeParamNum1(t2  , t3  , t4 ).application(context),
t1.application(context)
)(PlusToTuple1.plusWithTypeParameter3)
}
}
}
object ScalaTupleImplicits_4_1 extends ScalaTupleImplicits_4_1
