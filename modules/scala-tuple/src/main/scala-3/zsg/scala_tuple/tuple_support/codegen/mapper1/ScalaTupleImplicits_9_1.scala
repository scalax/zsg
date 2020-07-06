package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_9_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9
        ]( using 
              inline  t1: F[  Plus1_X1 ],   inline  t2: F[  Plus1_X2 ],   inline  t3: F[  Plus1_X3 ],   inline  t4: F[  Plus1_X4 ],   inline  t5: F[  Plus1_X5 ],   inline  t6: F[  Plus1_X6 ],   inline  t7: F[  Plus1_X7 ],   inline  t8: F[  Plus1_X8 ],   inline  t9: F[  Plus1_X9 ], 
             inline  context: T
        )  as  Application1[
            F,
            T,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ] = new Application1[
            F,
            T,
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9]
        ](
            context.append(implicitly[Application1[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X9]]]]]].application, context.start)(PlusToTuple1.plus1WithTypeParameter9)
        )
}
object ScalaTupleImplicits_9_1 extends ScalaTupleImplicits_9_1
