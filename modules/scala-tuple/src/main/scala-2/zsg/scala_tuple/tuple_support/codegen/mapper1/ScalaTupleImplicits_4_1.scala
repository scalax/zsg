package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_4_1 {
  implicit def tupleTagApplicationImplicit_tagNum4_typeParamNum1[
    F[_],
    T <: Context1[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4
  ](implicit
    t1: F[Plus1_X1],
    t2: F[Plus1_X2],
    t3: F[Plus1_X3],
    t4: F[Plus1_X4]
  ): ApplicationX1[
    F,
    T,
    Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4]
  ] = new ApplicationX1[
    F,
    T,
    Tuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4]
  ] {
    override def application(context: T) = {
      context.append(ApplicationFetchContent.app1[F, T, zsg.ZTuple4[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4]].application(context), context.start)(
        PlusToTuple1.plus1WithTypeParameter4
      )
    }
  }
}
object ScalaTupleImplicits_4_1 extends ScalaTupleImplicits_4_1
