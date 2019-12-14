package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_6_2 {
inline def hlistTagApplicationImplicit_tagNum6_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
, X6_C1  , X6_C2
](t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ]  , t6: Application2[F, H6  , X6_C1  , X6_C2 ] )
: Application2[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  HNil ] =
new Application2[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  HNil ] {
override def application(context: Context2[F]) = {
context.append(
ScalaTupleImplicits_5_2.hlistTagApplicationImplicit_tagNum5_typeParamNum2(t2  , t3  , t4  , t5  , t6 ).application(context),
t1.application(context)
)(HListPlus2.plusWithTypeParameter5)
}
}
given tupleTagApplicationImplicit_tagNum6_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
, X6_C1  , X6_C2
](given t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ]  , t6: Application2[F, H6  , X6_C1  , X6_C2 ] )
: Application2[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ) ] =
new Application2[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ) ] {
override def application(context: Context2[F]) = {
context.append(
ScalaTupleImplicits_5_2.hlistTagApplicationImplicit_tagNum5_typeParamNum2(t2  , t3  , t4  , t5  , t6 ).application(context),
t1.application(context)
)(PlusToTuple2.plusWithTypeParameter5)
}
}
}
object ScalaTupleImplicits_6_2 extends ScalaTupleImplicits_6_2
