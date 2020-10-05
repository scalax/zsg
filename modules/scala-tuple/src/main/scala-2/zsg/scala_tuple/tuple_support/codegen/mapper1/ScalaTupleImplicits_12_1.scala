package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_12_1 {
  implicit def tupleTagApplicationImplicit_tagNum12_typeParamNum1[
    F[_],
    T <: Context1[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus1_X9,
    Plus1_X10,
    Plus1_X11,
    Plus1_X12
  ](implicit
    t1: F[Plus1_X1],
    t2: F[Plus1_X2],
    t3: F[Plus1_X3],
    t4: F[Plus1_X4],
    t5: F[Plus1_X5],
    t6: F[Plus1_X6],
    t7: F[Plus1_X7],
    t8: F[Plus1_X8],
    t9: F[Plus1_X9],
    t10: F[Plus1_X10],
    t11: F[Plus1_X11],
    t12: F[Plus1_X12]
  ): ApplicationX1[
    F,
    T,
    Tuple12[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12]
  ] = new ApplicationX1[
    F,
    T,
    Tuple12[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12]
  ] {
    override def application(context: T) = {
      context.append(
        ApplicationFetchContent
          .app1[F, T, zsg.ZTuple12[Plus1_X1, Plus1_X2, Plus1_X3, Plus1_X4, Plus1_X5, Plus1_X6, Plus1_X7, Plus1_X8, Plus1_X9, Plus1_X10, Plus1_X11, Plus1_X12]]
          .application(context),
        context.start
      )(PlusToTuple1.plus1WithTypeParameter12)
    }
  }
}
object ScalaTupleImplicits_12_1 extends ScalaTupleImplicits_12_1
