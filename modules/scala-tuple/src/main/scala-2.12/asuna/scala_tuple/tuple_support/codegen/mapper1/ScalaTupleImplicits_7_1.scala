package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_7_1 {
def hlistTagApplicationImplicit_tagNum7_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
](t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ]  , t7: Application1[F, H7  , X7_C1 ] )
: Application1[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  HNil ] =
new Application1[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  HNil ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_6_1.hlistTagApplicationImplicit_tagNum6_typeParamNum1(t2  , t3  , t4  , t5  , t6  , t7 ).application(context),
t1.application(context)
)(HListPlus1.plusWithTypeParameter6)
}
}
implicit def tupleTagApplicationImplicit_tagNum7_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ]  , t7: Application1[F, H7  , X7_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ) ] =
new Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_6_1.hlistTagApplicationImplicit_tagNum6_typeParamNum1(t2  , t3  , t4  , t5  , t6  , t7 ).application(context),
t1.application(context)
)(PlusToTuple1.plusWithTypeParameter6)
}
}
}
object ScalaTupleImplicits_7_1 extends ScalaTupleImplicits_7_1
