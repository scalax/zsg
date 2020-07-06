package zsg.scala_tuple.tuple_support
import zsg.Application2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_2_2 {
         implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum2[
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2
        ]( implicit 
            t1: F[Plus1_X1 , Plus2_X1] , t2: F[Plus1_X2 , Plus2_X2],
            context: T
        )  :  Application2[
            F,
            T,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ] = new Application2[
            F,
            T,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ](context.append(t2, t1)(PlusToTuple2.plus2WithTypeParameter2))
}
object ScalaTupleImplicits_2_2 extends ScalaTupleImplicits_2_2
