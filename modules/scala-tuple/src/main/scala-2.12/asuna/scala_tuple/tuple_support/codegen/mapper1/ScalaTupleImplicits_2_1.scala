package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.support.heterogeneous._
import scala.language.higherKinds
trait ScalaTupleImplicits_2_1 {
implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum1[
F[_ ]
, H1  , H2
, X1_C1
, X2_C1
](implicit t1: Application1[F, H1  , X1_C1 ]
, t2: Application1[F, H2  , X2_C1 ] )
: Application1[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 ) ] =
new Application1[
F,
(H1  , H2 )  , (X1_C1  , X2_C1 ) ] {
override def application(context: Context1[F]) = {
context.append(t2.application(context), t1.application(context))(PlusToTuple1.plusWithTypeParameter1),
}
}
}
object ScalaTupleImplicits_2_1 extends ScalaTupleImplicits_2_1
