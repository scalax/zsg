package zsg.scala_tuple.tuple_support
import zsg.Application8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_4_8 {
         inline given  [
            F[_ , _ , _ , _ , _ , _ , _ , _],
            T <: Context8[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4,
            Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4
        ]( using 
              inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1   ,  Plus8_X1 ],   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2   ,  Plus7_X2   ,  Plus8_X2 ],   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3   ,  Plus7_X3   ,  Plus8_X3 ],   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4   ,  Plus6_X4   ,  Plus7_X4   ,  Plus8_X4 ], 
             inline  context: T
        )  as  Application8[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ] = new Application8[
            F,
            T,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ](
            context.append(implicitly[Application8[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple2[Plus4_X3 , Plus4_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus5_X1 , Plus5_X2] , zsg.ZsgTuple2[Plus5_X3 , Plus5_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus6_X1 , Plus6_X2] , zsg.ZsgTuple2[Plus6_X3 , Plus6_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus7_X1 , Plus7_X2] , zsg.ZsgTuple2[Plus7_X3 , Plus7_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus8_X1 , Plus8_X2] , zsg.ZsgTuple2[Plus8_X3 , Plus8_X4]]]].application, context.start)(PlusToTuple8.plus8WithTypeParameter4)
        )
}
object ScalaTupleImplicits_4_8 extends ScalaTupleImplicits_4_8
