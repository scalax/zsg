package zsg.scala_tuple.tuple_support
import zsg.Application6
import zsg.Context6
import scala.language.higherKinds
trait ScalaTupleImplicits_3_6 {
         implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum6  [
            F[_ , _ , _ , _ , _ , _],
            T <: Context6[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3 ], 
             context: T
        )  :  Application6[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]
        ] = new Application6[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3]
        ](
            context.append(ApplicationFetchContent.app6[F, T, zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple1[Plus1_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus2_X1 , Plus2_X2] , zsg.ZTuple1[Plus2_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus3_X1 , Plus3_X2] , zsg.ZTuple1[Plus3_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus4_X1 , Plus4_X2] , zsg.ZTuple1[Plus4_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus5_X1 , Plus5_X2] , zsg.ZTuple1[Plus5_X3]] , zsg.ZNode2[zsg.ZTuple2[Plus6_X1 , Plus6_X2] , zsg.ZTuple1[Plus6_X3]]], context.start)(PlusToTuple6.plus6WithTypeParameter3)
        )
}
object ScalaTupleImplicits_3_6 extends ScalaTupleImplicits_3_6
