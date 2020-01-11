package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_8 {
inline def hlistTagApplicationImplicit_tagNum2_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
](t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ] )
: Application8[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  HNil  ,  X1_C8 ::  X2_C8 ::  HNil ] =
new Application8[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  HNil  ,  X1_C8 ::  X2_C8 ::  HNil ] {
override def application(context: Context8[F]) = {
context.append(
context.append(context.start, t2.application(context))(HListPlus8.plusWithTypeParameter0),
t1.application(context)
)(HListPlus8.plusWithTypeParameter1)
}
}
given tupleTagApplicationImplicit_tagNum2_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
](given t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ] )
: Application8[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 )  , (X1_C6  , X2_C6 )  , (X1_C7  , X2_C7 )  , (X1_C8  , X2_C8 ) ] =
new Application8[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 )  , (X1_C6  , X2_C6 )  , (X1_C7  , X2_C7 )  , (X1_C8  , X2_C8 ) ] {
override def application(context: Context8[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple8.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_8 extends ScalaTupleImplicits_2_8
