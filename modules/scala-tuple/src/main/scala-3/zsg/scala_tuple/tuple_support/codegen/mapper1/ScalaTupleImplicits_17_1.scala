package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_17_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17
        ]( using 
              inline  t1: F[  Plus1_X1 ],   inline  t2: F[  Plus1_X2 ],   inline  t3: F[  Plus1_X3 ],   inline  t4: F[  Plus1_X4 ],   inline  t5: F[  Plus1_X5 ],   inline  t6: F[  Plus1_X6 ],   inline  t7: F[  Plus1_X7 ],   inline  t8: F[  Plus1_X8 ],   inline  t9: F[  Plus1_X9 ],   inline  t10: F[  Plus1_X10 ],   inline  t11: F[  Plus1_X11 ],   inline  t12: F[  Plus1_X12 ],   inline  t13: F[  Plus1_X13 ],   inline  t14: F[  Plus1_X14 ],   inline  t15: F[  Plus1_X15 ],   inline  t16: F[  Plus1_X16 ],   inline  t17: F[  Plus1_X17 ], 
             inline  context: T
        )  as  Application1[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17]
        ] = new Application1[
            F,
            T,
            Tuple17[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17]
        ](
            context.append(ApplicationFetchContent.app1[F, T, zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X1 , Plus1_X2] , zsg.ZTuple2[Plus1_X3 , Plus1_X4]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X5 , Plus1_X6] , zsg.ZTuple2[Plus1_X7 , Plus1_X8]]] , zsg.ZNode2[zsg.ZNode2[zsg.ZTuple2[Plus1_X9 , Plus1_X10] , zsg.ZTuple2[Plus1_X11 , Plus1_X12]] , zsg.ZNode2[zsg.ZTuple2[Plus1_X13 , Plus1_X14] , zsg.ZTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.ZNode1[zsg.ZNode1[zsg.ZNode1[zsg.ZTuple1[Plus1_X17]]]]]], context.start)(PlusToTuple1.plus1WithTypeParameter17)
        )
}
object ScalaTupleImplicits_17_1 extends ScalaTupleImplicits_17_1
