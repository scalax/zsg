package zsg.scala_tuple.tuple_support
import zsg.Application7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_3_7 {
         given  tupleTagApplicationImplicit_tagNum3_typeParamNum7[
            F[_ , _ , _ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3,
            Plus7_X1 , Plus7_X2 , Plus7_X3
        ]( using 
        t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3 , Plus7_X3])  as  Application7[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]
        ] = new Application7[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]
        ] {
            override def application(context: Context7[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
                Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
                Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
                Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
                Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3]
            ] = {
                val implicitApplication = implicitly[Application7[F, asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple1[Plus1_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X1 , Plus2_X2] , asuna.ZsgTuple1[Plus2_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X1 , Plus3_X2] , asuna.ZsgTuple1[Plus3_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X1 , Plus4_X2] , asuna.ZsgTuple1[Plus4_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X1 , Plus5_X2] , asuna.ZsgTuple1[Plus5_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus6_X1 , Plus6_X2] , asuna.ZsgTuple1[Plus6_X3]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus7_X1 , Plus7_X2] , asuna.ZsgTuple1[Plus7_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple7.plus7WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_7 extends ScalaTupleImplicits_3_7
