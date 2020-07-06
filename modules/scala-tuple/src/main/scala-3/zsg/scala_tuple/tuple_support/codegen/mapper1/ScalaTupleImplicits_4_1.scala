package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_4_1 {
         given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4
        ]( using 
            t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3] , t4: F[Plus1_X4],
            context: T
        )  as  Application1[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] = new Application1[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ]({
            val implicitApplication = implicitly[Application1[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple1.plus1WithTypeParameter4)
        })
}
object ScalaTupleImplicits_4_1 extends ScalaTupleImplicits_4_1
