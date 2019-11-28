package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_9_5 {
implicit def tupleTagApplicationImplicit_tagNum9_typeParamNum5[
F[_  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5
](implicit t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]  , t3: Application5[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5 ]  , t4: Application5[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5 ]  , t5: Application5[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5 ]  , t6: Application5[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5 ]  , t7: Application5[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5 ]  , t8: Application5[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5 ]  , t9: Application5[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5 ] )
: Application5[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5 ) ] =
{ (context: Context5[F]) =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t9.application(context), t8.application(context))(HListPlus5.plusWithTypeParameter1)
, t7.application(context))(HListPlus5.plusWithTypeParameter2)
, t6.application(context))(HListPlus5.plusWithTypeParameter3)
, t5.application(context))(HListPlus5.plusWithTypeParameter4)
, t4.application(context))(HListPlus5.plusWithTypeParameter5)
, t3.application(context))(HListPlus5.plusWithTypeParameter6)
, t2.application(context))(HListPlus5.plusWithTypeParameter7)
, t1.application(context))(PlusToTuple5.plusWithTypeParameter8)
}
}
