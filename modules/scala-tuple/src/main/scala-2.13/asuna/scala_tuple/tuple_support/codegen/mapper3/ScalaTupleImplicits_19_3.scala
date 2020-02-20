package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_19_3 {
implicit def tupleTagApplicationImplicit_tagNum19_typeParamNum3[
F[_  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19
, X1_C1  , X1_C2  , X1_C3
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
, X5_C1  , X5_C2  , X5_C3
, X6_C1  , X6_C2  , X6_C3
, X7_C1  , X7_C2  , X7_C3
, X8_C1  , X8_C2  , X8_C3
, X9_C1  , X9_C2  , X9_C3
, X10_C1  , X10_C2  , X10_C3
, X11_C1  , X11_C2  , X11_C3
, X12_C1  , X12_C2  , X12_C3
, X13_C1  , X13_C2  , X13_C3
, X14_C1  , X14_C2  , X14_C3
, X15_C1  , X15_C2  , X15_C3
, X16_C1  , X16_C2  , X16_C3
, X17_C1  , X17_C2  , X17_C3
, X18_C1  , X18_C2  , X18_C3
, X19_C1  , X19_C2  , X19_C3
](implicit t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ]  , t5: Application3[F, H5  , X5_C1  , X5_C2  , X5_C3 ]  , t6: Application3[F, H6  , X6_C1  , X6_C2  , X6_C3 ]  , t7: Application3[F, H7  , X7_C1  , X7_C2  , X7_C3 ]  , t8: Application3[F, H8  , X8_C1  , X8_C2  , X8_C3 ]  , t9: Application3[F, H9  , X9_C1  , X9_C2  , X9_C3 ]  , t10: Application3[F, H10  , X10_C1  , X10_C2  , X10_C3 ]  , t11: Application3[F, H11  , X11_C1  , X11_C2  , X11_C3 ]  , t12: Application3[F, H12  , X12_C1  , X12_C2  , X12_C3 ]  , t13: Application3[F, H13  , X13_C1  , X13_C2  , X13_C3 ]  , t14: Application3[F, H14  , X14_C1  , X14_C2  , X14_C3 ]  , t15: Application3[F, H15  , X15_C1  , X15_C2  , X15_C3 ]  , t16: Application3[F, H16  , X16_C1  , X16_C2  , X16_C3 ]  , t17: Application3[F, H17  , X17_C1  , X17_C2  , X17_C3 ]  , t18: Application3[F, H18  , X18_C1  , X18_C2  , X18_C3 ]  , t19: Application3[F, H19  , X19_C1  , X19_C2  , X19_C3 ] )
: Application3[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1  , X19_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2  , X15_C2  , X16_C2  , X17_C2  , X18_C2  , X19_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3  , X15_C3  , X16_C3  , X17_C3  , X18_C3  , X19_C3 ) ] =
new Application3[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1  , X19_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2  , X15_C2  , X16_C2  , X17_C2  , X18_C2  , X19_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3  , X15_C3  , X16_C3  , X17_C3  , X18_C3  , X19_C3 ) ] {
override def application(context: Context3[F]) = {
context.append(
ScalaTupleImplicits_18_3.tupleTagApplicationImplicit_tagNum18_typeParamNum3[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18  , H19
, X2_C1  , X2_C2  , X2_C3
, X3_C1  , X3_C2  , X3_C3
, X4_C1  , X4_C2  , X4_C3
, X5_C1  , X5_C2  , X5_C3
, X6_C1  , X6_C2  , X6_C3
, X7_C1  , X7_C2  , X7_C3
, X8_C1  , X8_C2  , X8_C3
, X9_C1  , X9_C2  , X9_C3
, X10_C1  , X10_C2  , X10_C3
, X11_C1  , X11_C2  , X11_C3
, X12_C1  , X12_C2  , X12_C3
, X13_C1  , X13_C2  , X13_C3
, X14_C1  , X14_C2  , X14_C3
, X15_C1  , X15_C2  , X15_C3
, X16_C1  , X16_C2  , X16_C3
, X17_C1  , X17_C2  , X17_C3
, X18_C1  , X18_C2  , X18_C3
, X19_C1  , X19_C2  , X19_C3
].application(context),
t1.application(context)
)(PlusToTuple3.plusWithTypeParameter18)
}
}
}
object ScalaTupleImplicits_19_3 extends ScalaTupleImplicits_19_3
