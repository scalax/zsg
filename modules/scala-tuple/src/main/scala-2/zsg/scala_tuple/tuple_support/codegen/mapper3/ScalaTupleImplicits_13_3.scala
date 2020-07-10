package zsg.scala_tuple.tuple_support
import zsg.Application3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_13_3 {
         implicit def tupleTagApplicationImplicit_tagNum13_typeParamNum3  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6 ],   t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7 ],   t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8 ],   t9: F[  Plus1_X9   ,  Plus2_X9   ,  Plus3_X9 ],   t10: F[  Plus1_X10   ,  Plus2_X10   ,  Plus3_X10 ],   t11: F[  Plus1_X11   ,  Plus2_X11   ,  Plus3_X11 ],   t12: F[  Plus1_X12   ,  Plus2_X12   ,  Plus3_X12 ],   t13: F[  Plus1_X13   ,  Plus2_X13   ,  Plus3_X13 ], 
             context: T
        )  :  Application3[
            F,
            T,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13],
            Tuple13[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13],
            Tuple13[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13]
        ] = new Application3[
            F,
            T,
            Tuple13[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13],
            Tuple13[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13],
            Tuple13[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13]
        ](
            context.append(ApplicationFetchContent.app3[F, T, zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple2[Plus1_X3 , Plus1_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X5 , Plus1_X6] , zsg.ZTuple2[Plus1_X7 , Plus1_X8]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X9 , Plus1_X10] , zsg.ZTuple2[Plus1_X11 , Plus1_X12]] , zsg.ZNode1[zsg.ZTuple1[Plus1_X13]]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus2_X1 , Plus2_X2] , zsg.ZTuple2[Plus2_X3 , Plus2_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus2_X5 , Plus2_X6] , zsg.ZTuple2[Plus2_X7 , Plus2_X8]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus2_X9 , Plus2_X10] , zsg.ZTuple2[Plus2_X11 , Plus2_X12]] , zsg.ZNode1[zsg.ZTuple1[Plus2_X13]]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus3_X1 , Plus3_X2] , zsg.ZTuple2[Plus3_X3 , Plus3_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus3_X5 , Plus3_X6] , zsg.ZTuple2[Plus3_X7 , Plus3_X8]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus3_X9 , Plus3_X10] , zsg.ZTuple2[Plus3_X11 , Plus3_X12]] , zsg.ZNode1[zsg.ZTuple1[Plus3_X13]]]]], context.start)(PlusToTuple3.plus3WithTypeParameter13)
        )
}
object ScalaTupleImplicits_13_3 extends ScalaTupleImplicits_13_3
