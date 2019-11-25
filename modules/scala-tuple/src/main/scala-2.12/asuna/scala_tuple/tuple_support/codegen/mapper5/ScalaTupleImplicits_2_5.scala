package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_2_5 {
implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
](implicit t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ] )
: Application5[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 ) ] =
{ (context: Context5[F]) =>
context.append(t2.application(context), t1.application(context))(PlusToTuple5.plusWithTypeParameter1)
}
}
