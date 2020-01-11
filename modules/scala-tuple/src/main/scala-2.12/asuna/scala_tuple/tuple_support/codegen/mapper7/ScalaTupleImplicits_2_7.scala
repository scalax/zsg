package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_7 {
def hlistTagApplicationImplicit_tagNum2_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
](t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
, t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ] )
: Application7[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  HNil ] =
new Application7[
F,
H1 ::  H2 ::  HNil  ,  X1_C1 ::  X2_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  HNil  ,  X1_C5 ::  X2_C5 ::  HNil  ,  X1_C6 ::  X2_C6 ::  HNil  ,  X1_C7 ::  X2_C7 ::  HNil ] {
override def application(context: Context7[F]) = {
context.append(
context.append(context.start, t2.application(context))(HListPlus7.plusWithTypeParameter0),
t1.application(context)
)(HListPlus7.plusWithTypeParameter1)
}
}
implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
](implicit t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
, t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ] )
: Application7[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 )  , (X1_C6  , X2_C6 )  , (X1_C7  , X2_C7 ) ] =
new Application7[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 )  , (X1_C6  , X2_C6 )  , (X1_C7  , X2_C7 ) ] {
override def application(context: Context7[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple7.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_7 extends ScalaTupleImplicits_2_7
