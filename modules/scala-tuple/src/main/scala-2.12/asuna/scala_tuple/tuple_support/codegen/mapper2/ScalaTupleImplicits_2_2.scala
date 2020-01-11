package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_2 {
def hlistTagApplicationImplicit_tagNum2_typeParamNum2[
F[_  , _ ]
, H1  , H2
, X1_C1  , X1_C2
, X2_C1  , X2_C2
](t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ] )
: Application2[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil ] =
new Application2[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil ] {
override def application(context: Context2[F]) = {
context.append(
context.append(context.start, t2.application(context))(HListPlus2.plusWithTypeParameter0),
t1.application(context)
)(HListPlus2.plusWithTypeParameter1)
}
}
implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum2[
F[_  , _ ]
, H1  , H2
, X1_C1  , X1_C2
, X2_C1  , X2_C2
](implicit t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ] )
: Application2[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 ) ] =
new Application2[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 ) ] {
override def application(context: Context2[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple2.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_2 extends ScalaTupleImplicits_2_2
