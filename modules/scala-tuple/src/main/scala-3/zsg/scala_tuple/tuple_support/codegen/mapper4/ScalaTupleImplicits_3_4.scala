package zsg.scala_tuple.tuple_support
import zsg.Application4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_3_4 {
         given  tupleTagApplicationImplicit_tagNum3_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3
        ]( using 
        t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3])  as  Application4[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] = new Application4[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] {
            override def application(context: Context4[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
                Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
            ] = {
                val implicitApplication = implicitly[Application4[F, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple1[Plus1_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple1[Plus2_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple1[Plus3_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus4_X1 , Plus4_X2] , zsg.ZsgTuple1[Plus4_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple4.plus4WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_4 extends ScalaTupleImplicits_3_4
