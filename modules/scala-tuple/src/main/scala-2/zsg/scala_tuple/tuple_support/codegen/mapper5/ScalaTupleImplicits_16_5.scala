package zsg.scala_tuple.tuple_support
import zsg.Application5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_16_5 {
         implicit def  tupleTagApplicationImplicit_tagNum16_typeParamNum5[
            F[_ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16
        ]( implicit 
        t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3] , t4: F[Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4] , t5: F[Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5 , Plus5_X5] , t6: F[Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6 , Plus5_X6] , t7: F[Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7 , Plus5_X7] , t8: F[Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8 , Plus5_X8] , t9: F[Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9 , Plus5_X9] , t10: F[Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10 , Plus5_X10] , t11: F[Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11 , Plus5_X11] , t12: F[Plus1_X12 , Plus2_X12 , Plus3_X12 , Plus4_X12 , Plus5_X12] , t13: F[Plus1_X13 , Plus2_X13 , Plus3_X13 , Plus4_X13 , Plus5_X13] , t14: F[Plus1_X14 , Plus2_X14 , Plus3_X14 , Plus4_X14 , Plus5_X14] , t15: F[Plus1_X15 , Plus2_X15 , Plus3_X15 , Plus4_X15 , Plus5_X15] , t16: F[Plus1_X16 , Plus2_X16 , Plus3_X16 , Plus4_X16 , Plus5_X16])  :  Application5[
            F,
            Tuple16[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16],
            Tuple16[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16],
            Tuple16[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16],
            Tuple16[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16],
            Tuple16[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16]
        ] = new Application5[
            F,
            Tuple16[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16],
            Tuple16[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16],
            Tuple16[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16],
            Tuple16[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16],
            Tuple16[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16]
        ] {
            override def application(context: Context5[F]): F[
                Tuple16[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16],
                Tuple16[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16],
                Tuple16[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16],
                Tuple16[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16],
                Tuple16[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6 , Plus5_X7 , Plus5_X8 , Plus5_X9 , Plus5_X10 , Plus5_X11 , Plus5_X12 , Plus5_X13 , Plus5_X14 , Plus5_X15 , Plus5_X16]
            ] = {
                val implicitApplication = implicitly[Application5[F, asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple2[Plus1_X3 , Plus1_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X5 , Plus1_X6] , asuna.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X9 , Plus1_X10] , asuna.ZsgTuple2[Plus1_X11 , Plus1_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X13 , Plus1_X14] , asuna.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X1 , Plus2_X2] , asuna.ZsgTuple2[Plus2_X3 , Plus2_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X5 , Plus2_X6] , asuna.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X9 , Plus2_X10] , asuna.ZsgTuple2[Plus2_X11 , Plus2_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X13 , Plus2_X14] , asuna.ZsgTuple2[Plus2_X15 , Plus2_X16]]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X1 , Plus3_X2] , asuna.ZsgTuple2[Plus3_X3 , Plus3_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X5 , Plus3_X6] , asuna.ZsgTuple2[Plus3_X7 , Plus3_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X9 , Plus3_X10] , asuna.ZsgTuple2[Plus3_X11 , Plus3_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X13 , Plus3_X14] , asuna.ZsgTuple2[Plus3_X15 , Plus3_X16]]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X1 , Plus4_X2] , asuna.ZsgTuple2[Plus4_X3 , Plus4_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X5 , Plus4_X6] , asuna.ZsgTuple2[Plus4_X7 , Plus4_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X9 , Plus4_X10] , asuna.ZsgTuple2[Plus4_X11 , Plus4_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X13 , Plus4_X14] , asuna.ZsgTuple2[Plus4_X15 , Plus4_X16]]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X1 , Plus5_X2] , asuna.ZsgTuple2[Plus5_X3 , Plus5_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X5 , Plus5_X6] , asuna.ZsgTuple2[Plus5_X7 , Plus5_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X9 , Plus5_X10] , asuna.ZsgTuple2[Plus5_X11 , Plus5_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X13 , Plus5_X14] , asuna.ZsgTuple2[Plus5_X15 , Plus5_X16]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple5.plus5WithTypeParameter16)
            }
        }
}
object ScalaTupleImplicits_16_5 extends ScalaTupleImplicits_16_5
