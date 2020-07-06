package zsg.scala_tuple.tuple_support
import zsg.Application4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_12_4 {
         inline given  [
            F[_ , _ , _ , _],
            T <: Context4[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5   ,  Plus4_X5 ],   inline  t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6   ,  Plus4_X6 ],   inline  t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7   ,  Plus4_X7 ],   inline  t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8   ,  Plus4_X8 ],   inline  t9: F[  Plus1_X9   ,  Plus2_X9   ,  Plus3_X9   ,  Plus4_X9 ],   inline  t10: F[  Plus1_X10   ,  Plus2_X10   ,  Plus3_X10   ,  Plus4_X10 ],   inline  t11: F[  Plus1_X11   ,  Plus2_X11   ,  Plus3_X11   ,  Plus4_X11 ],   inline  t12: F[  Plus1_X12   ,  Plus2_X12   ,  Plus3_X12   ,  Plus4_X12 ], 
             inline  context: T
        )  as  Application4[
            F,
            T,
            Tuple12[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12],
            Tuple12[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12],
            Tuple12[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12],
            Tuple12[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12]
        ] = new Application4[
            F,
            T,
            Tuple12[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12],
            Tuple12[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12],
            Tuple12[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12],
            Tuple12[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12]
        ](
            context.append(implicitly[Application4[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple2[Plus2_X11 , Plus2_X12]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6] , zsg.ZsgTuple2[Plus3_X7 , Plus3_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X9 , Plus3_X10] , zsg.ZsgTuple2[Plus3_X11 , Plus3_X12]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X5 , Plus4_X6] , zsg.ZsgTuple2[Plus4_X7 , Plus4_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X9 , Plus4_X10] , zsg.ZsgTuple2[Plus4_X11 , Plus4_X12]]]]]].application, context.start)(PlusToTuple4.plus4WithTypeParameter12)
        )
}
object ScalaTupleImplicits_12_4 extends ScalaTupleImplicits_12_4
