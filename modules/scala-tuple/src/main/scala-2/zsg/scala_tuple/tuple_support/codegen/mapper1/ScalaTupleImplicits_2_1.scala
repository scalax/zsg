package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_2_1 {
  implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum1[
    F[_],
    T <: Context1[F],
    Plus1_X1,
    Plus1_X2
  ](implicit
    t1: F[Plus1_X1],
    t2: F[Plus1_X2]
  ): ApplicationX1[
    F,
    T,
    Tuple2[Plus1_X1, Plus1_X2]
  ] =
    new ApplicationX1[
      F,
      T,
      Tuple2[Plus1_X1, Plus1_X2]
    ] {
      override def application(context: T) =
        context.append(t1, t2)(PlusToTuple1.plus1WithTypeParameter2)
    }
}
object ScalaTupleImplicits_2_1 extends ScalaTupleImplicits_2_1
