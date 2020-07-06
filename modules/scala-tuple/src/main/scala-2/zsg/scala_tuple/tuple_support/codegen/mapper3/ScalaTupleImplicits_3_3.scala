package zsg.scala_tuple.tuple_support
import zsg.Application3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_3_3 {
         implicit def tupleTagApplicationImplicit_tagNum3_typeParamNum3  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3
        ]( implicit 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3],
            context: T
        )  :  Application3[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] = new Application3[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ]({
            val implicitApplication = implicitly[Application3[F, T, zsg.NodeTuple2[zsg.ZsgTuple2[Plus1_X1 , Plus1_X2] , zsg.ZsgTuple1[Plus1_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus2_X1 , Plus2_X2] , zsg.ZsgTuple1[Plus2_X3]] , zsg.NodeTuple2[zsg.ZsgTuple2[Plus3_X1 , Plus3_X2] , zsg.ZsgTuple1[Plus3_X3]]
            ]]
            context.append(implicitApplication.application, context.start)(PlusToTuple3.plus3WithTypeParameter3)
        })
}
object ScalaTupleImplicits_3_3 extends ScalaTupleImplicits_3_3
