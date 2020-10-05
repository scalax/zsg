package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_1_2 {
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum2[
    F[_, _],
    T <: Context2[F],
    Plus1_X1,
    Plus2_X1
  ](implicit
    t1: F[Plus1_X1, Plus2_X1]
  ): ApplicationX2[
    F,
    T,
    Tuple1[Plus1_X1],
    Tuple1[Plus2_X1]
  ] =
    new ApplicationX2[
      F,
      T,
      Tuple1[Plus1_X1],
      Tuple1[Plus2_X1]
    ] {
      override def application(context: T) =
        context.append(context.start, t1)(PlusToTuple2.plus2WithTypeParameter1)
    }
}
object ScalaTupleImplicits_1_2 extends ScalaTupleImplicits_1_2
