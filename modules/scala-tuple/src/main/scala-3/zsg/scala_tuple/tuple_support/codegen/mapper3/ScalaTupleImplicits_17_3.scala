package zsg.scala_tuple.tuple_support
import zsg.Application3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_17_3 {
         inline given  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4 ],   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5 ],   inline  t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6 ],   inline  t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7 ],   inline  t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8 ],   inline  t9: F[  Plus1_X9   ,  Plus2_X9   ,  Plus3_X9 ],   inline  t10: F[  Plus1_X10   ,  Plus2_X10   ,  Plus3_X10 ],   inline  t11: F[  Plus1_X11   ,  Plus2_X11   ,  Plus3_X11 ],   inline  t12: F[  Plus1_X12   ,  Plus2_X12   ,  Plus3_X12 ],   inline  t13: F[  Plus1_X13   ,  Plus2_X13   ,  Plus3_X13 ],   inline  t14: F[  Plus1_X14   ,  Plus2_X14   ,  Plus3_X14 ],   inline  t15: F[  Plus1_X15   ,  Plus2_X15   ,  Plus3_X15 ],   inline  t16: F[  Plus1_X16   ,  Plus2_X16   ,  Plus3_X16 ],   inline  t17: F[  Plus1_X17   ,  Plus2_X17   ,  Plus3_X17 ], 
             inline  context: T
        )  as  Application3[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17],
            Tuple17[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17]
        ] = new Application3[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17],
            Tuple17[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17],
            Tuple17[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17]
        ](
            context.append(implicitly[Application3[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X13 , Plus1_X14] , zsg.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X17]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple2[Plus2_X11 , Plus2_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X13 , Plus2_X14] , zsg.ZsgTuple2[Plus2_X15 , Plus2_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus2_X17]]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6] , zsg.ZsgTuple2[Plus3_X7 , Plus3_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X9 , Plus3_X10] , zsg.ZsgTuple2[Plus3_X11 , Plus3_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X13 , Plus3_X14] , zsg.ZsgTuple2[Plus3_X15 , Plus3_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[Plus3_X17]]]]]]].application, context.start)(PlusToTuple3.plus3WithTypeParameter17)
        )
}
object ScalaTupleImplicits_17_3 extends ScalaTupleImplicits_17_3
