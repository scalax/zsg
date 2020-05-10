package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_2_8 {
         implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum8[
            F[_ , _ , _ , _ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2,
            Plus4_X1 , Plus4_X2,
            Plus5_X1 , Plus5_X2,
            Plus6_X1 , Plus6_X2,
            Plus7_X1 , Plus7_X2,
            Plus8_X1 , Plus8_X2
        ]( implicit 
        t1: Application8[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1 , Plus8_X1] , t2: Application8[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2 , Plus8_X2])  :  Application8[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2],
            Tuple2[Plus8_X1 , Plus8_X2]
        ] = new Application8[
            F,
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2],
            Tuple2[Plus4_X1 , Plus4_X2],
            Tuple2[Plus5_X1 , Plus5_X2],
            Tuple2[Plus6_X1 , Plus6_X2],
            Tuple2[Plus7_X1 , Plus7_X2],
            Tuple2[Plus8_X1 , Plus8_X2]
        ] {
            override def application(context: Context8[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2],
                Tuple2[Plus2_X1 , Plus2_X2],
                Tuple2[Plus3_X1 , Plus3_X2],
                Tuple2[Plus4_X1 , Plus4_X2],
                Tuple2[Plus5_X1 , Plus5_X2],
                Tuple2[Plus6_X1 , Plus6_X2],
                Tuple2[Plus7_X1 , Plus7_X2],
                Tuple2[Plus8_X1 , Plus8_X2]
            ] = {
                context.append(t2.application(context), t1.application(context))(PlusToTuple8.plus8WithTypeParameter2)
            }
        }
}
object ScalaTupleImplicits_2_8 extends ScalaTupleImplicits_2_8
