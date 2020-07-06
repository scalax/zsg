package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_20_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20
        ]( using 
              inline  t1: F[  Plus1_X1 ],   inline  t2: F[  Plus1_X2 ],   inline  t3: F[  Plus1_X3 ],   inline  t4: F[  Plus1_X4 ],   inline  t5: F[  Plus1_X5 ],   inline  t6: F[  Plus1_X6 ],   inline  t7: F[  Plus1_X7 ],   inline  t8: F[  Plus1_X8 ],   inline  t9: F[  Plus1_X9 ],   inline  t10: F[  Plus1_X10 ],   inline  t11: F[  Plus1_X11 ],   inline  t12: F[  Plus1_X12 ],   inline  t13: F[  Plus1_X13 ],   inline  t14: F[  Plus1_X14 ],   inline  t15: F[  Plus1_X15 ],   inline  t16: F[  Plus1_X16 ],   inline  t17: F[  Plus1_X17 ],   inline  t18: F[  Plus1_X18 ],   inline  t19: F[  Plus1_X19 ],   inline  t20: F[  Plus1_X20 ], 
             inline  context: T
        )  as  Application1[
            F,
            T,
            Tuple20[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20]
        ] = new Application1[
            F,
            T,
            Tuple20[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20]
        ]({
            context.append(implicitly[Application1[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple2[Plus1_X11 , Plus1_X12]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X13 , Plus1_X14] , zsg.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X17 , Plus1_X18] , zsg.ZsgTuple2[Plus1_X19 , Plus1_X20]]]]]]].application, context.start)(PlusToTuple1.plus1WithTypeParameter20)
        })
}
object ScalaTupleImplicits_20_1 extends ScalaTupleImplicits_20_1
