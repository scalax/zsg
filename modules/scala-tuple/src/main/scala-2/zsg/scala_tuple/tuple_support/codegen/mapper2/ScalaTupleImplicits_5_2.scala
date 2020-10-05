package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_5_2 {
  implicit def tupleTagApplicationImplicit_tagNum5_typeParamNum2[
    F[_, _],
    T <: Context2[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5
  ](implicit
    t1: F[Plus1_X1, Plus2_X1],
    t2: F[Plus1_X2, Plus2_X2],
    t3: F[Plus1_X3, Plus2_X3],
    t4: F[Plus1_X4, Plus2_X4],
    t5: F[Plus1_X5, Plus2_X5]
  ): ApplicationX2[
    F,
    T,
    Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
    Tuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5]
  ] =
    new ApplicationX2[
      F,
      T,
      Tuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5],
      Tuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5]
    ] {
      override def application(context: T) = {
        context.append(
          ApplicationFetchContent
            .app2[F, T, zsg.ZTuple5[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5], zsg.ZTuple5[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5]]
            .application(context),
          context.start
        )(PlusToTuple2.plus2WithTypeParameter5)
      }
    }
}
object ScalaTupleImplicits_5_2 extends ScalaTupleImplicits_5_2
