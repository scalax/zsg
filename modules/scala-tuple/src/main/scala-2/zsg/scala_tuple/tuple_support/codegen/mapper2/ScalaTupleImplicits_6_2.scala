package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_6_2 {
         implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6
        ]( implicit 
              t1: F[  Plus1_X1   ,  Plus2_X1 ],   t2: F[  Plus1_X2   ,  Plus2_X2 ],   t3: F[  Plus1_X3   ,  Plus2_X3 ],   t4: F[  Plus1_X4   ,  Plus2_X4 ],   t5: F[  Plus1_X5   ,  Plus2_X5 ],   t6: F[  Plus1_X6   ,  Plus2_X6 ], 
             context: T
        )  :  Application2[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] = new Application2[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ](
            context.append(implicitly[Application2[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6]]]]].application, context.start)(PlusToTuple2.plus2WithTypeParameter6)
        )
}
object ScalaTupleImplicits_6_2 extends ScalaTupleImplicits_6_2
