package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_6_1 {
         given  tupleTagApplicationImplicit_tagNum6_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6
        ]( using 
        t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3] , t4: F[Plus1_X4] , t5: F[Plus1_X5] , t6: F[Plus1_X6])  as  Application1[
            F,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] = new Application1[
            F,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] {
            override def application(context: Context1[F]): F[
                Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
            ] = {
                val implicitApplication = implicitly[Application1[F, zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple2[Plus1_X3 , Plus1_X4]] , zsg.NodeTuple1[zsg.ZsgTuple2[Plus1_X5 , Plus1_X6]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter6)
            }
        }
}
object ScalaTupleImplicits_6_1 extends ScalaTupleImplicits_6_1
