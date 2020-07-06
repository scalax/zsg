package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_11_1 {
         implicit def tupleTagApplicationImplicit_tagNum11_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11
        ]( implicit 
            t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3] , t4: F[Plus1_X4] , t5: F[Plus1_X5] , t6: F[Plus1_X6] , t7: F[Plus1_X7] , t8: F[Plus1_X8] , t9: F[Plus1_X9] , t10: F[Plus1_X10] , t11: F[Plus1_X11],
            context: T
        )  :  Application1[
            F,
            T,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]
        ] = new Application1[
            F,
            T,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11]
        ]({
            val implicitApplication = implicitly[Application1[F, T, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple1[Plus1_X11]]]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple1.plus1WithTypeParameter11)
        })
}
object ScalaTupleImplicits_11_1 extends ScalaTupleImplicits_11_1
