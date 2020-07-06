package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_5_1 {
         implicit def tupleTagApplicationImplicit_tagNum5_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5
        ]( implicit 
              t1: F[  Plus1_X1 ],   t2: F[  Plus1_X2 ],   t3: F[  Plus1_X3 ],   t4: F[  Plus1_X4 ],   t5: F[  Plus1_X5 ], 
             context: T
        )  :  Application1[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ] = new Application1[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ](
            context.append(implicitly[Application1[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple1[Plus1_X5]]]]].application, context.start)(PlusToTuple1.plus1WithTypeParameter5)
        )
}
object ScalaTupleImplicits_5_1 extends ScalaTupleImplicits_5_1
