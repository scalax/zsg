package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_6_5 {
implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
](implicit t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , t5: Application5[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ]  , t6: Application5[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5 ] )
: Application5[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ) ] =
new Application5[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ) ] {
override def application(context: Context5[F]) = {
context.append(
ScalaTupleImplicits_5_5.tupleTagApplicationImplicit_tagNum5_typeParamNum5[
F
, H2  , H3  , H4  , H5  , H6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
].application(context),
t1.application(context)
)(PlusToTuple5.plusWithTypeParameter5)
}
}
}
object ScalaTupleImplicits_6_5 extends ScalaTupleImplicits_6_5
