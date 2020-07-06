package zsg.scala_tuple.tuple_support
import zsg.Application8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_1_8 {
         inline given  [
            F[_ , _ , _ , _ , _ , _ , _ , _],
            T <: Context8[F],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1,
            Plus7_X1,
            Plus8_X1
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1   ,  Plus8_X1 ], 
             inline  context: T
        )  as  Application8[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1],
            Tuple1[Plus8_X1]
        ] = new Application8[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1],
            Tuple1[Plus8_X1]
        ](context.append(context.start, t1)(PlusToTuple8.plus8WithTypeParameter1))
}
object ScalaTupleImplicits_1_8 extends ScalaTupleImplicits_1_8
