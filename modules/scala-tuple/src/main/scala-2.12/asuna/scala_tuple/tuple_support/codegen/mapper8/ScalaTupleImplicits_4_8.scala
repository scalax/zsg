package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_4_8 {
def hlistTagApplicationImplicit_tagNum4_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8
](t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , t3: Application8[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , t4: Application8[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ] )
: Application8[
F,
H1 ::  H2 ::  H3 ::  H4 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  X3_C4 ::  X4_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  X3_C5 ::  X4_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  X3_C6 ::  X4_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  X3_C7 ::  X4_C7 ::  HNil  ,  X1_C8 ::  X2_C8 ::  X3_C8 ::  X4_C8 ::  HNil ] =
new Application8[
F,
H1 ::  H2 ::  H3 ::  H4 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  X3_C4 ::  X4_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  X3_C5 ::  X4_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  X3_C6 ::  X4_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  X3_C7 ::  X4_C7 ::  HNil  ,  X1_C8 ::  X2_C8 ::  X3_C8 ::  X4_C8 ::  HNil ] {
override def application(context: Context8[F]) = {
context.append(
ScalaTupleImplicits_3_8.hlistTagApplicationImplicit_tagNum3_typeParamNum8(t2  , t3  , t4 ).application(context),
t1.application(context)
)(HListPlus8.plusWithTypeParameter3)
}
}
implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8
](implicit t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , t3: Application8[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , t4: Application8[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ] )
: Application8[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6 )  , (X1_C7  , X2_C7  , X3_C7  , X4_C7 )  , (X1_C8  , X2_C8  , X3_C8  , X4_C8 ) ] =
new Application8[
F,
(H1  , H2  , H3  , H4 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6 )  , (X1_C7  , X2_C7  , X3_C7  , X4_C7 )  , (X1_C8  , X2_C8  , X3_C8  , X4_C8 ) ] {
override def application(context: Context8[F]) = {
context.append(
ScalaTupleImplicits_3_8.hlistTagApplicationImplicit_tagNum3_typeParamNum8(t2  , t3  , t4 ).application(context),
t1.application(context)
)(PlusToTuple8.plusWithTypeParameter3)
}
}
}
object ScalaTupleImplicits_4_8 extends ScalaTupleImplicits_4_8
