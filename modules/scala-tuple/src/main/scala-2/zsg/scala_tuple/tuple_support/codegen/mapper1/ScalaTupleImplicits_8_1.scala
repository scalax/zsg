package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_8_1 {
         implicit def tupleTagApplicationImplicit_tagNum8_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8
        ]( implicit 
              t1: F[  Plus1_X1 ],   t2: F[  Plus1_X2 ],   t3: F[  Plus1_X3 ],   t4: F[  Plus1_X4 ],   t5: F[  Plus1_X5 ],   t6: F[  Plus1_X6 ],   t7: F[  Plus1_X7 ],   t8: F[  Plus1_X8 ], 
             context: T
        )  :  Application1[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8]
        ] = new Application1[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8]
        ](
            context.append(implicitly[Application1[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]]]].application, context.start)(PlusToTuple1.plus1WithTypeParameter8)
        )
}
object ScalaTupleImplicits_8_1 extends ScalaTupleImplicits_8_1
