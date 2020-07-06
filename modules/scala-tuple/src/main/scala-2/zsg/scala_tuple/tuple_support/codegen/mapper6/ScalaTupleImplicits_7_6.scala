package zsg.scala_tuple.tuple_support
import zsg.Application6
import zsg.Context6
import scala.language.higherKinds
trait ScalaTupleImplicits_7_6 {
         implicit def tupleTagApplicationImplicit_tagNum7_typeParamNum6  [
            F[_ , _ , _ , _ , _ , _],
            T <: Context6[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4   ,  Plus6_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5   ,  Plus4_X5   ,  Plus5_X5   ,  Plus6_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6   ,  Plus4_X6   ,  Plus5_X6   ,  Plus6_X6 ],   t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7   ,  Plus4_X7   ,  Plus5_X7   ,  Plus6_X7 ], 
             context: T
        )  :  Application6[
            F,
            T,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7],
            Tuple7[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7],
            Tuple7[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7]
        ] = new Application6[
            F,
            T,
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7],
            Tuple7[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7],
            Tuple7[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7],
            Tuple7[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6 , Plus6_X7]
        ](
            context.append(ApplicationFetchContent.app6[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple1[Plus1_X7]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple1[Plus2_X7]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6] , zsg.ZsgTuple1[Plus3_X7]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X5 , Plus4_X6] , zsg.ZsgTuple1[Plus4_X7]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X1 , Plus5_X2] , zsg.ZsgTuple2[Plus5_X3 , Plus5_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X5 , Plus5_X6] , zsg.ZsgTuple1[Plus5_X7]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus6_X1 , Plus6_X2] , zsg.ZsgTuple2[Plus6_X3 , Plus6_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus6_X5 , Plus6_X6] , zsg.ZsgTuple1[Plus6_X7]]]], context.start)(PlusToTuple6.plus6WithTypeParameter7)
        )
}
object ScalaTupleImplicits_7_6 extends ScalaTupleImplicits_7_6
