package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_4 {
inline def hlistTagApplicationImplicit_tagNum2_typeParamNum4[
F[_  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
](t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ] )
: Application4[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil ] =
new Application4[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil ] {
override def application(context: Context4[F]) = {
context.append(
context.append(context.start, t2.application(context))(HListPlus4.plusWithTypeParameter0),
t1.application(context)
)(HListPlus4.plusWithTypeParameter1)
}
}
given tupleTagApplicationImplicit_tagNum2_typeParamNum4[
F[_  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
](given t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ] )
: Application4[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 ) ] =
new Application4[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 ) ] {
override def application(context: Context4[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple4.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_4 extends ScalaTupleImplicits_2_4
