package asuna
import scala.language.higherKinds
trait ScalaTupleImplicits_20_2 {
final implicit def tupleTagApplicationImplicit_tagNum20_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20
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
, X11_C1  , X11_C2
, X12_C1  , X12_C2
, X13_C1  , X13_C2
, X14_C1  , X14_C2
, X15_C1  , X15_C2
, X16_C1  , X16_C2
, X17_C1  , X17_C2
, X18_C1  , X18_C2
, X19_C1  , X19_C2
, X20_C1  , X20_C2
]
(implicit
t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ]  , t6: Application2[F, H6  , X6_C1  , X6_C2 ]  , t7: Application2[F, H7  , X7_C1  , X7_C2 ]  , t8: Application2[F, H8  , X8_C1  , X8_C2 ]  , t9: Application2[F, H9  , X9_C1  , X9_C2 ]  , t10: Application2[F, H10  , X10_C1  , X10_C2 ]  , t11: Application2[F, H11  , X11_C1  , X11_C2 ]  , t12: Application2[F, H12  , X12_C1  , X12_C2 ]  , t13: Application2[F, H13  , X13_C1  , X13_C2 ]  , t14: Application2[F, H14  , X14_C1  , X14_C2 ]  , t15: Application2[F, H15  , X15_C1  , X15_C2 ]  , t16: Application2[F, H16  , X16_C1  , X16_C2 ]  , t17: Application2[F, H17  , X17_C1  , X17_C2 ]  , t18: Application2[F, H18  , X18_C1  , X18_C2 ]  , t19: Application2[F, H19  , X19_C1  , X19_C2 ]  , t20: Application2[F, H20  , X20_C1  , X20_C2 ] )
: Application2[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19  , H20 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1  , X19_C1  , X20_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2  , X15_C2  , X16_C2  , X17_C2  , X18_C2  , X19_C2  , X20_C2 ) ] =
{ context: Context2[F] =>
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(
context.append(t20.application(context), t19.application(context))(HListPlus2.plusWithTypeParameter1)
, t18.application(context))(HListPlus2.plusWithTypeParameter2)
, t17.application(context))(HListPlus2.plusWithTypeParameter3)
, t16.application(context))(HListPlus2.plusWithTypeParameter4)
, t15.application(context))(HListPlus2.plusWithTypeParameter5)
, t14.application(context))(HListPlus2.plusWithTypeParameter6)
, t13.application(context))(HListPlus2.plusWithTypeParameter7)
, t12.application(context))(HListPlus2.plusWithTypeParameter8)
, t11.application(context))(HListPlus2.plusWithTypeParameter9)
, t10.application(context))(HListPlus2.plusWithTypeParameter10)
, t9.application(context))(HListPlus2.plusWithTypeParameter11)
, t8.application(context))(HListPlus2.plusWithTypeParameter12)
, t7.application(context))(HListPlus2.plusWithTypeParameter13)
, t6.application(context))(HListPlus2.plusWithTypeParameter14)
, t5.application(context))(HListPlus2.plusWithTypeParameter15)
, t4.application(context))(HListPlus2.plusWithTypeParameter16)
, t3.application(context))(HListPlus2.plusWithTypeParameter17)
, t2.application(context))(HListPlus2.plusWithTypeParameter18)
, t1.application(context))(PlusToTuple2.plusWithTypeParameter19)
}
}
