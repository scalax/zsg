package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_8_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5 ],   inline  t6: F[  Plus1_X6   ,  Plus2_X6 ],   inline  t7: F[  Plus1_X7   ,  Plus2_X7 ],   inline  t8: F[  Plus1_X8   ,  Plus2_X8 ], 
             inline  context: T
        )  as  Application2[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8]
        ] = new Application2[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8]
        ](
            context.append(ApplicationFetchContent.app2[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]]], context.start)(PlusToTuple2.plus2WithTypeParameter8)
        )
}
object ScalaTupleImplicits_8_2 extends ScalaTupleImplicits_8_2
