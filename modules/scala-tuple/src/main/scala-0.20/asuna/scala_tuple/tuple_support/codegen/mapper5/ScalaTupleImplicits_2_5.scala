package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_5 {
given tupleTagApplicationImplicit_tagNum2_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
](given t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ] )
: Application5[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 ) ] =
new Application5[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 )  , (X1_C2  , X2_C2 )  , (X1_C3  , X2_C3 )  , (X1_C4  , X2_C4 )  , (X1_C5  , X2_C5 ) ] {
override def application(context: Context5[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple5.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_5 extends ScalaTupleImplicits_2_5
