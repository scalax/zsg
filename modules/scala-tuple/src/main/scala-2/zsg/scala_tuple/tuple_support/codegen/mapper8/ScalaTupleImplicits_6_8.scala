package zsg.scala_tuple.tuple_support
import zsg.Application8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_6_8 {
         implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum8  [
            F[_ , _ , _ , _ , _ , _ , _ , _],
            T <: Context8[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6,
            Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5 , Plus8_X6
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1   ,  Plus8_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2   ,  Plus7_X2   ,  Plus8_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3   ,  Plus7_X3   ,  Plus8_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4   ,  Plus6_X4   ,  Plus7_X4   ,  Plus8_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5   ,  Plus4_X5   ,  Plus5_X5   ,  Plus6_X5   ,  Plus7_X5   ,  Plus8_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6   ,  Plus4_X6   ,  Plus5_X6   ,  Plus6_X6   ,  Plus7_X6   ,  Plus8_X6 ], 
             context: T
        )  :  Application8[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
            Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6],
            Tuple6[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6],
            Tuple6[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6],
            Tuple6[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6],
            Tuple6[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5 , Plus8_X6]
        ] = new Application8[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
            Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6],
            Tuple6[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6],
            Tuple6[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6],
            Tuple6[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6],
            Tuple6[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5 , Plus8_X6]
        ](
            context.append(implicitly[Application8[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus4_X5 , Plus4_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X1 , Plus5_X2] , zsg.ZsgTuple2[Plus5_X3 , Plus5_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus5_X5 , Plus5_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus6_X1 , Plus6_X2] , zsg.ZsgTuple2[Plus6_X3 , Plus6_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus6_X5 , Plus6_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus7_X1 , Plus7_X2] , zsg.ZsgTuple2[Plus7_X3 , Plus7_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus7_X5 , Plus7_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus8_X1 , Plus8_X2] , zsg.ZsgTuple2[Plus8_X3 , Plus8_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus8_X5 , Plus8_X6]]]]].application, context.start)(PlusToTuple8.plus8WithTypeParameter6)
        )
}
object ScalaTupleImplicits_6_8 extends ScalaTupleImplicits_6_8
