package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_6_1 {
given tupleTagApplicationImplicit_tagNum6_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
](given t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ) ] =
{ (context: Context1[F]) =>
context.append(
context.append(
context.append(
context.append(
context.append(t6.application(context), t5.application(context))(HListPlus1.plusWithTypeParameter1)
, t4.application(context))(HListPlus1.plusWithTypeParameter2)
, t3.application(context))(HListPlus1.plusWithTypeParameter3)
, t2.application(context))(HListPlus1.plusWithTypeParameter4)
, t1.application(context))(PlusToTuple1.plusWithTypeParameter5)
}
}