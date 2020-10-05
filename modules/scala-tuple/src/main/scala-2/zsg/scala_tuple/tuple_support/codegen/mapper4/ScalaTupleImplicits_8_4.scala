package zsg.scala_tuple.tuple_support
import zsg.ApplicationX4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_8_4 {
  implicit def tupleTagApplicationImplicit_tagNum8_typeParamNum4[
    F[_, _, _, _],
    T <: Context4[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus2_X1,
    Plus2_X2,
    Plus2_X3,
    Plus2_X4,
    Plus2_X5,
    Plus2_X6,
    Plus2_X7,
    Plus2_X8,
    Plus3_X1,
    Plus3_X2,
    Plus3_X3,
    Plus3_X4,
    Plus3_X5,
    Plus3_X6,
    Plus3_X7,
    Plus3_X8,
    Plus4_X1,
    Plus4_X2,
    Plus4_X3,
    Plus4_X4,
    Plus4_X5,
    Plus4_X6,
    Plus4_X7,
    Plus4_X8
  ](implicit
    t1: F[Plus1_X1, Plus2_X1, Plus3_X1, Plus4_X1],
    t2: F[Plus1_X2, Plus2_X2, Plus3_X2, Plus4_X2],
    t3: F[Plus1_X3, Plus2_X3, Plus3_X3, Plus4_X3],
    t4: F[Plus1_X4, Plus2_X4, Plus3_X4, Plus4_X4],
    t5: F[Plus1_X5, Plus2_X5, Plus3_X5, Plus4_X5],
    t6: F[Plus1_X6, Plus2_X6, Plus3_X6, Plus4_X6],
    t7: F[Plus1_X7, Plus2_X7, Plus3_X7, Plus4_X7],
    t8: F[Plus1_X8, Plus2_X8, Plus3_X8, Plus4_X8]
  ): ApplicationX4[
    F,
    T,
    Tuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
    Tuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8],
    Tuple8[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8],
    Tuple8[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8]
  ] = new ApplicationX4[
    F,
    T,
    Tuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
    Tuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8],
    Tuple8[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8],
    Tuple8[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app4[
            F,
            T,
            zsg.ZTuple8[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8],
            zsg.ZTuple8[Plus2_X1, Plus2_X2, Plus2_X3, Plus2_X4, Plus2_X5, Plus2_X6, Plus2_X7, Plus2_X8],
            zsg.ZTuple8[Plus3_X1, Plus3_X2, Plus3_X3, Plus3_X4, Plus3_X5, Plus3_X6, Plus3_X7, Plus3_X8],
            zsg.ZTuple8[Plus4_X1, Plus4_X2, Plus4_X3, Plus4_X4, Plus4_X5, Plus4_X6, Plus4_X7, Plus4_X8]
          ]
          .application(context),
        context.start
      )(PlusToTuple4.plus4WithTypeParameter8)
    }
  }
}
object ScalaTupleImplicits_8_4 extends ScalaTupleImplicits_8_4
