package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_13_3 {
def hlistTagApplicationImplicit_tagNum13_typeParamNum3[
F[_  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13
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
](t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ]  , t5: Application3[F, H5  , X5_C1  , X5_C2  , X5_C3 ]  , t6: Application3[F, H6  , X6_C1  , X6_C2  , X6_C3 ]  , t7: Application3[F, H7  , X7_C1  , X7_C2  , X7_C3 ]  , t8: Application3[F, H8  , X8_C1  , X8_C2  , X8_C3 ]  , t9: Application3[F, H9  , X9_C1  , X9_C2  , X9_C3 ]  , t10: Application3[F, H10  , X10_C1  , X10_C2  , X10_C3 ]  , t11: Application3[F, H11  , X11_C1  , X11_C2  , X11_C3 ]  , t12: Application3[F, H12  , X12_C1  , X12_C2  , X12_C3 ]  , t13: Application3[F, H13  , X13_C1  , X13_C2  , X13_C3 ] )
: Application3[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  H8 ::  H9 ::  H10 ::  H11 ::  H12 ::  H13 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  X8_C1 ::  X9_C1 ::  X10_C1 ::  X11_C1 ::  X12_C1 ::  X13_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  X7_C2 ::  X8_C2 ::  X9_C2 ::  X10_C2 ::  X11_C2 ::  X12_C2 ::  X13_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  X5_C3 ::  X6_C3 ::  X7_C3 ::  X8_C3 ::  X9_C3 ::  X10_C3 ::  X11_C3 ::  X12_C3 ::  X13_C3 ::  HNil ] =
new Application3[
F,
H1 ::  H2 ::  H3 ::  H4 ::  H5 ::  H6 ::  H7 ::  H8 ::  H9 ::  H10 ::  H11 ::  H12 ::  H13 ::  HNil  ,  X1_C1 ::  X2_C1 ::  X3_C1 ::  X4_C1 ::  X5_C1 ::  X6_C1 ::  X7_C1 ::  X8_C1 ::  X9_C1 ::  X10_C1 ::  X11_C1 ::  X12_C1 ::  X13_C1 ::  HNil  ,  X1_C2 ::  X2_C2 ::  X3_C2 ::  X4_C2 ::  X5_C2 ::  X6_C2 ::  X7_C2 ::  X8_C2 ::  X9_C2 ::  X10_C2 ::  X11_C2 ::  X12_C2 ::  X13_C2 ::  HNil  ,  X1_C3 ::  X2_C3 ::  X3_C3 ::  X4_C3 ::  X5_C3 ::  X6_C3 ::  X7_C3 ::  X8_C3 ::  X9_C3 ::  X10_C3 ::  X11_C3 ::  X12_C3 ::  X13_C3 ::  HNil ] {
override def application(context: Context3[F]) = {
context.append(
ScalaTupleImplicits_12_3.hlistTagApplicationImplicit_tagNum12_typeParamNum3(t2  , t3  , t4  , t5  , t6  , t7  , t8  , t9  , t10  , t11  , t12  , t13 ).application(context),
t1.application(context)
)(HListPlus3.plusWithTypeParameter12)
}
}
implicit def tupleTagApplicationImplicit_tagNum13_typeParamNum3[
F[_  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13
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
](implicit t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
, t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]  , t3: Application3[F, H3  , X3_C1  , X3_C2  , X3_C3 ]  , t4: Application3[F, H4  , X4_C1  , X4_C2  , X4_C3 ]  , t5: Application3[F, H5  , X5_C1  , X5_C2  , X5_C3 ]  , t6: Application3[F, H6  , X6_C1  , X6_C2  , X6_C3 ]  , t7: Application3[F, H7  , X7_C1  , X7_C2  , X7_C3 ]  , t8: Application3[F, H8  , X8_C1  , X8_C2  , X8_C3 ]  , t9: Application3[F, H9  , X9_C1  , X9_C2  , X9_C3 ]  , t10: Application3[F, H10  , X10_C1  , X10_C2  , X10_C3 ]  , t11: Application3[F, H11  , X11_C1  , X11_C2  , X11_C3 ]  , t12: Application3[F, H12  , X12_C1  , X12_C2  , X12_C3 ]  , t13: Application3[F, H13  , X13_C1  , X13_C2  , X13_C3 ] )
: Application3[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3 ) ] =
new Application3[
F,
(H1  , H2  , H3  , H4  , H5  , H6  , H7  , H8  , H9  , H10  , H11  , H12  , H13 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1  , X9_C1  , X10_C1  , X11_C1  , X12_C1  , X13_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2  , X9_C2  , X10_C2  , X11_C2  , X12_C2  , X13_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3  , X9_C3  , X10_C3  , X11_C3  , X12_C3  , X13_C3 ) ] {
override def application(context: Context3[F]) = {
context.append(
ScalaTupleImplicits_12_3.hlistTagApplicationImplicit_tagNum12_typeParamNum3(t2  , t3  , t4  , t5  , t6  , t7  , t8  , t9  , t10  , t11  , t12  , t13 ).application(context),
t1.application(context)
)(PlusToTuple3.plusWithTypeParameter12)
}
}
}
object ScalaTupleImplicits_13_3 extends ScalaTupleImplicits_13_3
