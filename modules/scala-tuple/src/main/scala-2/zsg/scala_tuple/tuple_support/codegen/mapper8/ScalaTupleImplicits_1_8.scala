package zsg.scala_tuple.tuple_support
import zsg.ApplicationX8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_1_8 {
  implicit def tupleTagApplicationImplicit_tagNum1_typeParamNum8[
    F[_, _, _, _, _, _, _, _],
    T <: Context8[F],
    Plus1_X1,
    Plus2_X1,
    Plus3_X1,
    Plus4_X1,
    Plus5_X1,
    Plus6_X1,
    Plus7_X1,
    Plus8_X1
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1, Plus5_X1, Plus6_X1, Plus7_X1, Plus8_X1]
  ): ApplicationX8[
    F,
    T,
    Tuple1[Plus1_X1],
    Tuple1[Plus2_X1],
    Tuple1[Plus3_X1],
    Tuple1[Plus4_X1],
    Tuple1[Plus5_X1],
    Tuple1[Plus6_X1],
    Tuple1[Plus7_X1],
    Tuple1[Plus8_X1]
  ] =
    new ApplicationX8[
      F,
      T,
      Tuple1[Plus1_X1],
      Tuple1[Plus2_X1],
      Tuple1[Plus3_X1],
      Tuple1[Plus4_X1],
      Tuple1[Plus5_X1],
      Tuple1[Plus6_X1],
      Tuple1[Plus7_X1],
      Tuple1[Plus8_X1]
    ] {
      override def application(context: T) =
        context.append(context.start, t1)(PlusToTuple8.plus8WithTypeParameter1)
    }
}
object ScalaTupleImplicits_1_8 extends ScalaTupleImplicits_1_8
