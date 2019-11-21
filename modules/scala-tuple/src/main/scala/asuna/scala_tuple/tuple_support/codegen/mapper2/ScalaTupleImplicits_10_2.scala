package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_10_2 {
final implicit def tupleTagApplicationImplicit_tagNum10_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
, X6_C1  , X6_C2
, X7_C1  , X7_C2
, X8_C1  , X8_C2
, X9_C1  , X9_C2
, X10_C1  , X10_C2
]
(implicit
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ]  , t6: Application2[F, H6  , X6_C1  , X6_C2 ]  , t7: Application2[F, H7  , X7_C1  , X7_C2 ]  , t8: Application2[F, H8  , X8_C1  , X8_C2 ]  , t9: Application2[F, H9  , X9_C1  , X9_C2 ]  , t10: Application2[F, H10  , X10_C1  , X10_C2 ] )
: Application2[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2 ) ] =
{ context: Context2[F] =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t10.application(context), t9.application(context))(HListPlus2.plusWithTypeParameter1)
, t8.application(context))(HListPlus2.plusWithTypeParameter2)
, t7.application(context))(HListPlus2.plusWithTypeParameter3)
, t6.application(context))(HListPlus2.plusWithTypeParameter4)
, t5.application(context))(HListPlus2.plusWithTypeParameter5)
, t4.application(context))(HListPlus2.plusWithTypeParameter6)
, t3.application(context))(HListPlus2.plusWithTypeParameter7)
, t2.application(context))(HListPlus2.plusWithTypeParameter8)
, t1.application(context))(PlusToTuple2.plusWithTypeParameter9)
}
}
