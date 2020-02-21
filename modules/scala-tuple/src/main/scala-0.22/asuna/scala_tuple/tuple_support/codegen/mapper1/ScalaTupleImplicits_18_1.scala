package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_18_1 {
given tupleTagApplicationImplicit_tagNum18_typeParamNum1[
F[_ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18
, X1_C1
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
, X8_C1
, X9_C1
, X10_C1
, X11_C1
, X12_C1
, X13_C1
, X14_C1
, X15_C1
, X16_C1
, X17_C1
, X18_C1
](given t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ]  , t3: Application1[F, H3  , X3_C1 ]  , t4: Application1[F, H4  , X4_C1 ]  , t5: Application1[F, H5  , X5_C1 ]  , t6: Application1[F, H6  , X6_C1 ]  , t7: Application1[F, H7  , X7_C1 ]  , t8: Application1[F, H8  , X8_C1 ]  , t9: Application1[F, H9  , X9_C1 ]  , t10: Application1[F, H10  , X10_C1 ]  , t11: Application1[F, H11  , X11_C1 ]  , t12: Application1[F, H12  , X12_C1 ]  , t13: Application1[F, H13  , X13_C1 ]  , t14: Application1[F, H14  , X14_C1 ]  , t15: Application1[F, H15  , X15_C1 ]  , t16: Application1[F, H16  , X16_C1 ]  , t17: Application1[F, H17  , X17_C1 ]  , t18: Application1[F, H18  , X18_C1 ] )
: Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1 ) ] =
new Application1[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1  , X15_C1  , X16_C1  , X17_C1  , X18_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(
ScalaTupleImplicits_17_1.tupleTagApplicationImplicit_tagNum17_typeParamNum1[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14  , H15  , H16  , H17  , H18
, X2_C1
, X3_C1
, X4_C1
, X5_C1
, X6_C1
, X7_C1
, X8_C1
, X9_C1
, X10_C1
, X11_C1
, X12_C1
, X13_C1
, X14_C1
, X15_C1
, X16_C1
, X17_C1
, X18_C1
].application(context),
t1.application(context)
)(PlusToTuple1.plusWithTypeParameter17)
}
}
}
object ScalaTupleImplicits_18_1 extends ScalaTupleImplicits_18_1
