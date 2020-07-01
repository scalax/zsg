package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_11_2 {
         implicit def  tupleTagApplicationImplicit_tagNum11_typeParamNum2[
            F[_ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11
        ]( implicit 
            t1: F[Plus1_X1 , Plus2_X1] , t2: F[Plus1_X2 , Plus2_X2] , t3: F[Plus1_X3 , Plus2_X3] , t4: F[Plus1_X4 , Plus2_X4] , t5: F[Plus1_X5 , Plus2_X5] , t6: F[Plus1_X6 , Plus2_X6] , t7: F[Plus1_X7 , Plus2_X7] , t8: F[Plus1_X8 , Plus2_X8] , t9: F[Plus1_X9 , Plus2_X9] , t10: F[Plus1_X10 , Plus2_X10] , t11: F[Plus1_X11 , Plus2_X11],
            context: Context2[F]
        )  :  Application2[
            F,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11]
        ] = new Application2[
            F,
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11]
        ]({
            val implicitApplication = implicitly[Application2[F, zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6] , zsg.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X9 , Plus1_X10] , zsg.ZsgTuple1[Plus1_X11]]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6] , zsg.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , zsg.NodeTuple1[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X9 , Plus2_X10] , zsg.ZsgTuple1[Plus2_X11]]]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple2.plus2WithTypeParameter11)
        })
}
object ScalaTupleImplicits_11_2 extends ScalaTupleImplicits_11_2
