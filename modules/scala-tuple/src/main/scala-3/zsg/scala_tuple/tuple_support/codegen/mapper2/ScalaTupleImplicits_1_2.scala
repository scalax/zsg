package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_1_2 {
         given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1,
            Plus2_X1
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1],
            context: T
        )  as  Application2[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1]
        ] = new Application2[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1]
        ](context.append(context.start, t1)(PlusToTuple2.plus2WithTypeParameter1))
}
object ScalaTupleImplicits_1_2 extends ScalaTupleImplicits_1_2
