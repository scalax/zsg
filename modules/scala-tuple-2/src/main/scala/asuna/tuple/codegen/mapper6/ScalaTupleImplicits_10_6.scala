package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_10_6 {
final implicit def tupleTagApplicationImplicit_tagNum10_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6
]
(implicit
t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]  , t3: Application6[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6 ]  , t4: Application6[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6 ]  , t5: Application6[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6 ]  , t6: Application6[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6 ]  , t7: Application6[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6 ]  , t8: Application6[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6 ]  , t9: Application6[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6 ]  , t10: Application6[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6 ] )
: Application6[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6  , X9_C6  , X10_C6 ) ] =
{ context: Context6[F] =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t10.application(context), t9.application(context))(HListPlus6.plusWithTypeParameter1)
, t8.application(context))(HListPlus6.plusWithTypeParameter2)
, t7.application(context))(HListPlus6.plusWithTypeParameter3)
, t6.application(context))(HListPlus6.plusWithTypeParameter4)
, t5.application(context))(HListPlus6.plusWithTypeParameter5)
, t4.application(context))(HListPlus6.plusWithTypeParameter6)
, t3.application(context))(HListPlus6.plusWithTypeParameter7)
, t2.application(context))(HListPlus6.plusWithTypeParameter8)
, t1.application(context))(PlusToTuple6.plusWithTypeParameter9)
}
}
