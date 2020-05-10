package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_1_8 {
         implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum8[
            F[_ , _ , _ , _ , _ , _ , _ , _],
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1,
            Plus7_X1,
            Plus8_X1
        ]( implicit 
        t1: Application8[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1 , Plus8_X1])  :  Application8[
            F,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1],
            Tuple1[Plus8_X1]
        ] = new Application8[
            F,
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1],
            Tuple1[Plus8_X1]
        ] {
            override def application(context: Context8[F]): F[
                Tuple1[Plus1_X1],
                Tuple1[Plus2_X1],
                Tuple1[Plus3_X1],
                Tuple1[Plus4_X1],
                Tuple1[Plus5_X1],
                Tuple1[Plus6_X1],
                Tuple1[Plus7_X1],
                Tuple1[Plus8_X1]
            ] = {
                //context.append(context.start, t1.application(context))(PlusToTuple8.plus8WithTypeParameter1)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_1_8 extends ScalaTupleImplicits_1_8
