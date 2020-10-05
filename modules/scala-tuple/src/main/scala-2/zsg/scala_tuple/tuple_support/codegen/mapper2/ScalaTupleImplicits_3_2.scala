package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_3_2 {
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum2[
    F[_, _],
    T <: Context2[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3
  ](implicit
    t1: F[Plus1_X1, Plus2_X1],
    t2: F[Plus1_X2, Plus2_X2],
    t3: F[Plus1_X3, Plus2_X3]
  ): ApplicationX2[
    F,
    T,
    Tuple3[Plus1_X1, Plus1_X2, Plus1_X3],
    Tuple3[Plus2_X1, Plus2_X2, Plus2_X3]
  ] = new ApplicationX2[
    F,
    T,
    Tuple3[Plus1_X1, Plus1_X2, Plus1_X3],
    Tuple3[Plus2_X1, Plus2_X2, Plus2_X3]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent.app2[F, T, zsg.ZTuple3[Plus1_X1, Plus1_X2, Plus1_X3], zsg.ZTuple3[Plus2_X1, Plus2_X2, Plus2_X3]].application(context),
        context.start
      )(PlusToTuple2.plus2WithTypeParameter3)
    }
  }
}
object ScalaTupleImplicits_3_2 extends ScalaTupleImplicits_3_2
