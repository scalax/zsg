package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_3_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ], 
             inline  context: T
        )  as  Application2[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ] = new Application2[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ](
            context.append(ApplicationFetchContent.app2[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple1[Plus1_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple1[Plus2_X3]]], context.start)(PlusToTuple2.plus2WithTypeParameter3)
        )
}
object ScalaTupleImplicits_3_2 extends ScalaTupleImplicits_3_2
