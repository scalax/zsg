package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_11_8 {
final implicit def tupleTagApplicationImplicit_tagNum11_typeParamNum8[
F[_  , _  , _  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6  , X9_C7  , X9_C8
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6  , X10_C7  , X10_C8
, X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5  , X11_C6  , X11_C7  , X11_C8
]
(implicit
t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]  , t3: Application8[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , X3_C8 ]  , t4: Application8[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , X4_C8 ]  , t5: Application8[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , X5_C8 ]  , t6: Application8[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , X6_C8 ]  , t7: Application8[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , X7_C8 ]  , t8: Application8[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , X8_C8 ]  , t9: Application8[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6  , X9_C7  , X9_C8 ]  , t10: Application8[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6  , X10_C7  , X10_C8 ]  , t11: Application8[F, H11  , X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5  , X11_C6  , X11_C7  , X11_C8 ] )
: Application8[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5  , X11_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6  , X9_C6  , X10_C6  , X11_C6 )  , (X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7  , X9_C7  , X10_C7  , X11_C7 )  , (X1_C8  , X2_C8  , X3_C8  , X4_C8  , X5_C8  , X6_C8  , X7_C8  , X8_C8  , X9_C8  , X10_C8  , X11_C8 ) ] =
{ context: Context8[F] =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t11.application(context), t10.application(context))(HListPlus8.plusWithTypeParameter1)
, t9.application(context))(HListPlus8.plusWithTypeParameter2)
, t8.application(context))(HListPlus8.plusWithTypeParameter3)
, t7.application(context))(HListPlus8.plusWithTypeParameter4)
, t6.application(context))(HListPlus8.plusWithTypeParameter5)
, t5.application(context))(HListPlus8.plusWithTypeParameter6)
, t4.application(context))(HListPlus8.plusWithTypeParameter7)
, t3.application(context))(HListPlus8.plusWithTypeParameter8)
, t2.application(context))(HListPlus8.plusWithTypeParameter9)
, t1.application(context))(PlusToTuple8.plusWithTypeParameter10)
}
}
