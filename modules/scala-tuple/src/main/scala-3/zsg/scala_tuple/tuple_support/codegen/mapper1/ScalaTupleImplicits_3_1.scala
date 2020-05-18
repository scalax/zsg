package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_3_1 {
         given  tupleTagApplicationImplicit_tagNum3_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3
        ]( using 
        t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3])  as  Application1[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] = new Application1[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] {
            override def application(context: Context1[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
            ] = {
                val implicitApplication = implicitly[Application1[F, asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple1[Plus1_X3]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_1 extends ScalaTupleImplicits_3_1
