package zsg.scala_tuple.tuple_support
import zsg.Application7
import zsg.Context7
import scala.language.higherKinds
trait ScalaTupleImplicits_2_7 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum7[
            F[_ , _ , _ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2,
            Plus5_X1 , Plus5_X2,
            Plus6_X1 , Plus6_X2,
            Plus7_X1 , Plus7_X2
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2],
            context: Context7[F]
        )  as  Application7[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2]
        ] = new Application7[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2]
        ](context.append(t2, t1)(PlusToTuple7.plus7WithTypeParameter2))
}
object ScalaTupleImplicits_2_7 extends ScalaTupleImplicits_2_7
