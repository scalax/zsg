package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_2_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2
        ]( using 
              inline  t1: F[  Plus1_X1 ],   inline  t2: F[  Plus1_X2 ], 
             inline  context: T
        )  as  Application1[
            F,
            T,
            Tuple2[Plus1_X1 , Plus1_X2]
        ] = new Application1[
            F,
            T,
            Tuple2[Plus1_X1 , Plus1_X2]
        ](context.append(t2, t1)(PlusToTuple1.plus1WithTypeParameter2))
}
object ScalaTupleImplicits_2_1 extends ScalaTupleImplicits_2_1
