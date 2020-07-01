package zsg.scala_tuple.tuple_support
import zsg.Application6
import zsg.Context6
import scala.language.higherKinds
trait ScalaTupleImplicits_1_6 {
         implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum6[
            F[_ , _ , _ , _ , _ , _],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1
        ]( implicit 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1],
            context: Context6[F]
        )  :  Application6[
            F,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
        ] = new Application6[
            F,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
        ](context.append(context.start, t1)(PlusToTuple6.plus6WithTypeParameter1))
}
object ScalaTupleImplicits_1_6 extends ScalaTupleImplicits_1_6
