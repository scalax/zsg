package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_5_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5 ], 
             inline  context: T
        )  as  Application2[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]
        ] = new Application2[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5]
        ](
            context.append(implicitly[Application2[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X5]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus2_X5]]]]].application, context.start)(PlusToTuple2.plus2WithTypeParameter5)
        )
}
object ScalaTupleImplicits_5_2 extends ScalaTupleImplicits_5_2
