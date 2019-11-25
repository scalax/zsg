package asuna.scala_tuple.tuple_support
import asuna.Application6
import asuna.Context6
import scala.language.higherKinds
trait ScalaTupleImplicits_6_6 {
implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum6[
F[_  , _  , _  , _  , _  , _ ]
, H1  , H2  , H3  , H4  , H5  , H6
, X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6
, X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6
, X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6
, X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6
, X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6
, X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6
](implicit t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]  , t3: Application6[F, H3  , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6 ]  , t4: Application6[F, H4  , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6 ]  , t5: Application6[F, H5  , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6 ]  , t6: Application6[F, H6  , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6 ] )
: Application6[
F,
(H1  , H2  , H3  , H4  , H5  , H6 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 )  , (X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 )  , (X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 )  , (X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 )  , (X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ) ] =
{ (context: Context6[F]) =>
context.append(
context.append(
context.append(
context.append(
context.append(t6.application(context), t5.application(context))(HListPlus6.plusWithTypeParameter1)
, t4.application(context))(HListPlus6.plusWithTypeParameter2)
, t3.application(context))(HListPlus6.plusWithTypeParameter3)
, t2.application(context))(HListPlus6.plusWithTypeParameter4)
, t1.application(context))(PlusToTuple6.plusWithTypeParameter5)
}
}
