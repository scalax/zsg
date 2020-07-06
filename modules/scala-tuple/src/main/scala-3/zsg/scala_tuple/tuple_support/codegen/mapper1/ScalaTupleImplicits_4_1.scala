package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_4_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4
        ]( using 
              inline  t1: F[  Plus1_X1 ],   inline  t2: F[  Plus1_X2 ],   inline  t3: F[  Plus1_X3 ],   inline  t4: F[  Plus1_X4 ], 
             inline  context: T
        )  as  Application1[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] = new Application1[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ](
            context.append(implicitly[Application1[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]]]].application, context.start)(PlusToTuple1.plus1WithTypeParameter4)
        )
}
object ScalaTupleImplicits_4_1 extends ScalaTupleImplicits_4_1
