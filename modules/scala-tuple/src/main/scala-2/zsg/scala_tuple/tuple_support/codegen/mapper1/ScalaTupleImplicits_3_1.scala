package zsg.scala_tuple.tuple_support
import zsg.Application1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_3_1 {
         implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3
        ]( implicit 
            t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3],
            context: T
        )  :  Application1[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ] = new Application1[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3]
        ]({
            val implicitApplication = implicitly[Application1[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple1[Plus1_X3]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple1.plus1WithTypeParameter3)
        })
}
object ScalaTupleImplicits_3_1 extends ScalaTupleImplicits_3_1
