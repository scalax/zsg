package zsg.scala_tuple.tuple_support
import zsg.ApplicationX5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_6_5 {
  implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum5[
    F[_, _, _, _, _],
    T <: Context5[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus4_X6,
    Plus5_X1,
    Plus5_X2,
    Plus5_X3,
    Plus5_X4,
    Plus5_X5,
    Plus5_X6
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1, Plus5_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2, Plus5_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3, Plus4_X3, Plus5_X3],
    t4: F[Plus1_X4, Plus2_X4, Plus3_X4, Plus4_X4, Plus5_X4],
    t5: F[Plus1_X5, Plus2_X5, Plus3_X5, Plus4_X5, Plus5_X5],
    t6: F[Plus1_X6, Plus2_X6, Plus3_X6, Plus4_X6, Plus5_X6]
  ): ApplicationX5[
    F,
    T,
    Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
    Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
    Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
    Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
    Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6]
  ] = new ApplicationX5[
    F,
    T,
    Tuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
    Tuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
    Tuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
    Tuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
    Tuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app5[
            F,
            T,
            zsg.ZTuple6[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6],
            zsg.ZTuple6[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6],
            zsg.ZTuple6[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6],
            zsg.ZTuple6[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6],
            zsg.ZTuple6[Plus5_X1, Plus5_X2, Plus5_X3, Plus5_X4, Plus5_X5, Plus5_X6]
          ]
          .application(context),
        context.start
      )(PlusToTuple5.plus5WithTypeParameter6)
    }
  }
}
object ScalaTupleImplicits_6_5 extends ScalaTupleImplicits_6_5
