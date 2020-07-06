package zsg.scala_tuple.tuple_support
import zsg.Application5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_1_5 {
         given  [
            F[_ , _ , _ , _ , _],
            T <: Context5[F],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1],
            context: T
        )  as  Application5[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1]
        ] = new Application5[
            F,
            T,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1]
        ](context.append(context.start, t1)(PlusToTuple5.plus5WithTypeParameter1))
}
object ScalaTupleImplicits_1_5 extends ScalaTupleImplicits_1_5
