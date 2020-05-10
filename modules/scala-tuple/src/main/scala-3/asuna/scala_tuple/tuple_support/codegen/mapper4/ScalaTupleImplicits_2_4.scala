package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_2_4 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2
        ]( using 
        t1: Application4[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2])  as  Application4[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2]
        ] = new Application4[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2]
        ] {
            override def application(context: Context4[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2],
                Tuple2[Plus2_X1 , Plus2_X2],
                Tuple2[Plus3_X1 , Plus3_X2],
                Tuple2[Plus4_X1 , Plus4_X2]
            ] = {
                //context.append(t2.application(context), t1.application(context))(PlusToTuple4.plus4WithTypeParameter2)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_2_4 extends ScalaTupleImplicits_2_4
