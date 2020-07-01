package zsg.scala_tuple.tuple_support
import zsg.Application3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_6_3 {
         given  tupleTagApplicationImplicit_tagNum6_typeParamNum3[
            F[_ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: F[Plus1_X4 , Plus2_X4 , Plus3_X4] , t5: F[Plus1_X5 , Plus2_X5 , Plus3_X5] , t6: F[Plus1_X6 , Plus2_X6 , Plus3_X6],
            context: Context3[F]
        )  as  Application3[
            F,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6]
        ] = new Application3[
            F,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6]
        ]({
            val implicitApplication = implicitly[Application3[F, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple2[Plus2_X3 , Plus2_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus2_X5 , Plus2_X6]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple2[Plus3_X3 , Plus3_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus3_X5 , Plus3_X6]]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple3.plus3WithTypeParameter6)
        })
}
object ScalaTupleImplicits_6_3 extends ScalaTupleImplicits_6_3
