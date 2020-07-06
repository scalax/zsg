package zsg.scala_tuple.tuple_support
import zsg.Application4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_1_4 {
         inline given  [
            F[_ , _ , _ , _],
            T <: Context4[F],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1 ], 
             inline  context: T
        )  as  Application4[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1]
        ] = new Application4[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1]
        ](context.append(context.start, t1)(PlusToTuple4.plus4WithTypeParameter1))
}
object ScalaTupleImplicits_1_4 extends ScalaTupleImplicits_1_4
