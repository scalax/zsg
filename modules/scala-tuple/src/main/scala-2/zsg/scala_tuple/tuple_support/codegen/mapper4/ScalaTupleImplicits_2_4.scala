package zsg.scala_tuple.tuple_support
import zsg.ApplicationX4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_2_4 {
  implicit def tupleTagApplicationImplicit_tagNum2_typeParamNum4[
    F[_, _, _, _],
    T <: Context4[F],
    Plus1_X1,
    Plus1_X2,
    Plus2_X1,
    Plus2_X2,
    Plus3_X1,
    Plus3_X2,
    Plus4_X1,
    Plus4_X2
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2]
  ): ApplicationX4[
    F,
    T,
    Tuple2[Plus1_X1, Plus1_X2],
    Tuple2[Plus2_X1, Plus2_X2],
    Tuple2[Plus3_X1, Plus3_X2],
    Tuple2[Plus4_X1, Plus4_X2]
  ] = new ApplicationX4[
    F,
    T,
    Tuple2[Plus1_X1, Plus1_X2],
    Tuple2[Plus2_X1, Plus2_X2],
    Tuple2[Plus3_X1, Plus3_X2],
    Tuple2[Plus4_X1, Plus4_X2]
  ] {
    override def application(context: T) =
      context.append(t1, t2)(PlusToTuple4.plus4WithTypeParameter2)
  }
}
object ScalaTupleImplicits_2_4 extends ScalaTupleImplicits_2_4
