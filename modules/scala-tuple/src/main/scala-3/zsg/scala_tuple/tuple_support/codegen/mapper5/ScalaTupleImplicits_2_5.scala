package zsg.scala_tuple.tuple_support
import zsg.Application5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_2_5 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum5[
            F[_ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2,
            Plus5_X1 , Plus5_X2
        ]( using 
            t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2],
            context: Context5[F]
        )  as  Application5[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2]
        ] = new Application5[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2]
        ](context.append(t2, t1)(PlusToTuple5.plus5WithTypeParameter2))
}
object ScalaTupleImplicits_2_5 extends ScalaTupleImplicits_2_5
