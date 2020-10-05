package zsg.scala_tuple.tuple_support
import zsg.ApplicationX5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_3_5 {
  implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum5[
    F[_, _, _, _, _],
    T <: Context5[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1, Plus5_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2, Plus5_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3, Plus4_X3, Plus5_X3]
  ): ApplicationX5[
    F,
    T,
    Tuple3[Plus1_X1, Plus1_X2, Plus1_X3],
    Tuple3[Plus2_X1, Plus2_X2, Plus2_X3],
    Tuple3[Plus3_X1, Plus3_X2, Plus3_X3],
    Tuple3[Plus4_X1, Plus4_X2, Plus4_X3],
    Tuple3[Plus5_X1, Plus5_X2, Plus5_X3]
  ] = new ApplicationX5[
    F,
    T,
    Tuple3[Plus1_X1, Plus1_X2, Plus1_X3],
    Tuple3[Plus2_X1, Plus2_X2, Plus2_X3],
    Tuple3[Plus3_X1, Plus3_X2, Plus3_X3],
    Tuple3[Plus4_X1, Plus4_X2, Plus4_X3],
    Tuple3[Plus5_X1, Plus5_X2, Plus5_X3]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app5[F, T, zsg.ZTuple3[Plus1_X1, Plus1_X2, Plus1_X3], zsg.ZTuple3[Plus2_X1, Plus2_X2, Plus2_X3], zsg.ZTuple3[Plus3_X1, Plus3_X2, Plus3_X3], zsg.ZTuple3[
            Plus4_X1,
            Plus4_X2,
            Plus4_X3
          ], zsg.ZTuple3[Plus5_X1, Plus5_X2, Plus5_X3]]
          .application(context),
        context.start
      )(PlusToTuple5.plus5WithTypeParameter3)
    }
  }
}
object ScalaTupleImplicits_3_5 extends ScalaTupleImplicits_3_5
