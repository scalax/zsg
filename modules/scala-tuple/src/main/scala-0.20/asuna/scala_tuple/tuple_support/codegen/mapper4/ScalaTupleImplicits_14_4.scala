package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_14_4 {
inline def hlistTagApplicationImplicit_tagNum14_typeParamNum4[
F[_  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, X6_C1  , X6_C2  , X6_C3  , X6_C4
, X7_C1  , X7_C2  , X7_C3  , X7_C4
, X8_C1  , X8_C2  , X8_C3  , X8_C4
, X9_C1  , X9_C2  , X9_C3  , X9_C4
, X10_C1  , X10_C2  , X10_C3  , X10_C4
, X11_C1  , X11_C2  , X11_C3  , X11_C4
, X12_C1  , X12_C2  , X12_C3  , X12_C4
, X13_C1  , X13_C2  , X13_C3  , X13_C4
, X14_C1  , X14_C2  , X14_C3  , X14_C4
](t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , t3: Application4[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , t4: Application4[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , t5: Application4[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ]  , t6: Application4[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4 ]  , t7: Application4[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4 ]  , t8: Application4[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4 ]  , t9: Application4[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4 ]  , t10: Application4[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4 ]  , t11: Application4[F, H11  , X11_C1  , X11_C2  , X11_C3  , X11_C4 ]  , t12: Application4[F, H12  , X12_C1  , X12_C2  , X12_C3  , X12_C4 ]  , t13: Application4[F, H13  , X13_C1  , X13_C2  , X13_C3  , X13_C4 ]  , t14: Application4[F, H14  , X14_C1  , X14_C2  , X14_C3  , X14_C4 ] )
: Application4[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  H8 ::  H9 ::  H10 ::  H11 ::  H12 ::  H13 ::  H14 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  X8_C1 ::  X9_C1 ::  X10_C1 ::  X11_C1 ::  X12_C1 ::  X13_C1 ::  X14_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  X7_C2 ::  X8_C2 ::  X9_C2 ::  X10_C2 ::  X11_C2 ::  X12_C2 ::  X13_C2 ::  X14_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  X5_C3 ::  X6_C3 ::  X7_C3 ::  X8_C3 ::  X9_C3 ::  X10_C3 ::  X11_C3 ::  X12_C3 ::  X13_C3 ::  X14_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  X3_C4 ::  X4_C4 ::  X5_C4 ::  X6_C4 ::  X7_C4 ::  X8_C4 ::  X9_C4 ::  X10_C4 ::  X11_C4 ::  X12_C4 ::  X13_C4 ::  X14_C4 ::  HNil ] =
new Application4[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  H8 ::  H9 ::  H10 ::  H11 ::  H12 ::  H13 ::  H14 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  X8_C1 ::  X9_C1 ::  X10_C1 ::  X11_C1 ::  X12_C1 ::  X13_C1 ::  X14_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  X7_C2 ::  X8_C2 ::  X9_C2 ::  X10_C2 ::  X11_C2 ::  X12_C2 ::  X13_C2 ::  X14_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  X5_C3 ::  X6_C3 ::  X7_C3 ::  X8_C3 ::  X9_C3 ::  X10_C3 ::  X11_C3 ::  X12_C3 ::  X13_C3 ::  X14_C3 ::  HNil  ,  X1_C4 ::  X2_C4 ::  X3_C4 ::  X4_C4 ::  X5_C4 ::  X6_C4 ::  X7_C4 ::  X8_C4 ::  X9_C4 ::  X10_C4 ::  X11_C4 ::  X12_C4 ::  X13_C4 ::  X14_C4 ::  HNil ] {
override def application(context: Context4[F]) = {
context.append(
ScalaTupleImplicits_13_4.hlistTagApplicationImplicit_tagNum13_typeParamNum4(t2  , t3  , t4  , t5  , t6  , t7  , t8  , t9  , t10  , t11  , t12  , t13  , t14 ).application(context),
t1.application(context)
)(HListPlus4.plusWithTypeParameter13)
}
}
given tupleTagApplicationImplicit_tagNum14_typeParamNum4[
F[_  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14
, X1_C1  , X1_C2  , X1_C3  , X1_C4
, X2_C1  , X2_C2  , X2_C3  , X2_C4
, X3_C1  , X3_C2  , X3_C3  , X3_C4
, X4_C1  , X4_C2  , X4_C3  , X4_C4
, X5_C1  , X5_C2  , X5_C3  , X5_C4
, X6_C1  , X6_C2  , X6_C3  , X6_C4
, X7_C1  , X7_C2  , X7_C3  , X7_C4
, X8_C1  , X8_C2  , X8_C3  , X8_C4
, X9_C1  , X9_C2  , X9_C3  , X9_C4
, X10_C1  , X10_C2  , X10_C3  , X10_C4
, X11_C1  , X11_C2  , X11_C3  , X11_C4
, X12_C1  , X12_C2  , X12_C3  , X12_C4
, X13_C1  , X13_C2  , X13_C3  , X13_C4
, X14_C1  , X14_C2  , X14_C3  , X14_C4
](given t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]  , t3: Application4[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4 ]  , t4: Application4[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4 ]  , t5: Application4[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4 ]  , t6: Application4[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4 ]  , t7: Application4[F, H7  , X7_C1  , X7_C2  , X7_C3  , X7_C4 ]  , t8: Application4[F, H8  , X8_C1  , X8_C2  , X8_C3  , X8_C4 ]  , t9: Application4[F, H9  , X9_C1  , X9_C2  , X9_C3  , X9_C4 ]  , t10: Application4[F, H10  , X10_C1  , X10_C2  , X10_C3  , X10_C4 ]  , t11: Application4[F, H11  , X11_C1  , X11_C2  , X11_C3  , X11_C4 ]  , t12: Application4[F, H12  , X12_C1  , X12_C2  , X12_C3  , X12_C4 ]  , t13: Application4[F, H13  , X13_C1  , X13_C2  , X13_C3  , X13_C4 ]  , t14: Application4[F, H14  , X14_C1  , X14_C2  , X14_C3  , X14_C4 ] )
: Application4[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4 ) ] =
new Application4[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13  , H14 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1  , X14_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2  , X14_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3  , X14_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4  , X9_C4  , X10_C4  , X11_C4  , X12_C4  , X13_C4  , X14_C4 ) ] {
override def application(context: Context4[F]) = {
context.append(
ScalaTupleImplicits_13_4.hlistTagApplicationImplicit_tagNum13_typeParamNum4(t2  , t3  , t4  , t5  , t6  , t7  , t8  , t9  , t10  , t11  , t12  , t13  , t14 ).application(context),
t1.application(context)
)(PlusToTuple4.plusWithTypeParameter13)
}
}
}
object ScalaTupleImplicits_14_4 extends ScalaTupleImplicits_14_4
