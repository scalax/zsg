package zsg.scala_tuple.tuple_support
import zsg.Application7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_3_7 {
         inline given  [
            F[_ , _ , _ , _ , _ , _ , _],
            T <: Context7[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3,
            Plus7_X1 , Plus7_X2 , Plus7_X3
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2   ,  Plus7_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3   ,  Plus7_X3 ], 
             inline  context: T
        )  as  Application7[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]
        ] = new Application7[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]
        ](
            context.append(ApplicationFetchContent.app7[F, T, zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple1[Plus1_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus2_X1 , Plus2_X2] , zsg.ZTuple1[Plus2_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus3_X1 , Plus3_X2] , zsg.ZTuple1[Plus3_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus4_X1 , Plus4_X2] , zsg.ZTuple1[Plus4_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus5_X1 , Plus5_X2] , zsg.ZTuple1[Plus5_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus6_X1 , Plus6_X2] , zsg.ZTuple1[Plus6_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus7_X1 , Plus7_X2] , zsg.ZTuple1[Plus7_X3]]], context.start)(PlusToTuple7.plus7WithTypeParameter3)
        )
}
object ScalaTupleImplicits_3_7 extends ScalaTupleImplicits_3_7
