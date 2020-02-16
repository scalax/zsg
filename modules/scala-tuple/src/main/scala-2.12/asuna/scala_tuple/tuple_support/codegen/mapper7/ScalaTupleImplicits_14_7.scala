package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_14_7 {
implicit def tupleTagApplicationImplicit_tagNum14_typeParamNum7[
F[_  , _  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6  , X9_C7
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6  , X10_C7
, X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5  , X11_C6  , X11_C7
, X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5  , X12_C6  , X12_C7
, X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5  , X13_C6  , X13_C7
, X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5  , X14_C6  , X14_C7
](implicit t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
, t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]  , t3: Application7[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7 ]  , t4: Application7[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7 ]  , t5: Application7[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7 ]  , t6: Application7[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7 ]  , t7: Application7[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7 ]  , t8: Application7[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7 ]  , t9: Application7[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6  , X9_C7 ]  , t10: Application7[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6  , X10_C7 ]  , t11: Application7[F, H11  , X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5  , X11_C6  , X11_C7 ]  , t12: Application7[F, H12  , X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5  , X12_C6  , X12_C7 ]  , t13: Application7[F, H13  , X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5  , X13_C6  , X13_C7 ]  , t14: Application7[F, H14  , X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5  , X14_C6  , X14_C7 ] )
: Application7[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5  , X11_C5  , X12_C5  , X13_C5  , X14_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6  , X9_C6  , X10_C6  , X11_C6  , X12_C6  , X13_C6  , X14_C6 )  , (X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7  , X9_C7  , X10_C7  , X11_C7  , X12_C7  , X13_C7  , X14_C7 ) ] =
new Application7[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5  , X9_C5  , X10_C5  , X11_C5  , X12_C5  , X13_C5  , X14_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6  , X9_C6  , X10_C6  , X11_C6  , X12_C6  , X13_C6  , X14_C6 )  , (X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7  , X9_C7  , X10_C7  , X11_C7  , X12_C7  , X13_C7  , X14_C7 ) ] {
override def application(context: Context7[F]) = {
context.append(
ScalaTupleImplicits_13_7.tupleTagApplicationImplicit_tagNum13_typeParamNum7[
F
, H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7
, X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7
, X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7
, X9_C1  , X9_C2  , X9_C3  , X9_C4  , X9_C5  , X9_C6  , X9_C7
, X10_C1  , X10_C2  , X10_C3  , X10_C4  , X10_C5  , X10_C6  , X10_C7
, X11_C1  , X11_C2  , X11_C3  , X11_C4  , X11_C5  , X11_C6  , X11_C7
, X12_C1  , X12_C2  , X12_C3  , X12_C4  , X12_C5  , X12_C6  , X12_C7
, X13_C1  , X13_C2  , X13_C3  , X13_C4  , X13_C5  , X13_C6  , X13_C7
, X14_C1  , X14_C2  , X14_C3  , X14_C4  , X14_C5  , X14_C6  , X14_C7
].application(context),
t1.application(context)
)(PlusToTuple7.plusWithTypeParameter13)
}
}
}
object ScalaTupleImplicits_14_7 extends ScalaTupleImplicits_14_7
