package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_1_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1
        ]( using 
               inline  t1: F[  Plus1_X1 ] 
        )  as  ApplicationX1[
            F,
            T,
            Tuple1[Plus1_X1]
        ] = new ApplicationX1[
            F,
            T,
            Tuple1[Plus1_X1]
        ] {
            override def application(context: T) =
                context.append(context.start, t1)(PlusToTuple1.plus1WithTypeParameter1)
        }
}
object ScalaTupleImplicits_1_1 extends ScalaTupleImplicits_1_1
