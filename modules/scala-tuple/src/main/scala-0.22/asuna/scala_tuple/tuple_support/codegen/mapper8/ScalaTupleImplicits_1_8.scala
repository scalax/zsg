package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_8 {
         given  tupleTagApplicationImplicit_tagNum1_typeParamNum8[
            F[_ , _ , _ , _ , _ , _ , _ , _],
            Tag1,
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1,
            Plus7_X1,
            Plus8_X1
        ]( given 
        t1: Application8[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1 , Plus8_X1]): Application8[
            F,
            Tuple1[Tag1],
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
            Tuple1[Tag1],
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
                context.append(context.start, t1.application(context))(PlusToTuple8.plus8WithTypeParameter1)
            }
        }
}
object ScalaTupleImplicits_1_8 extends ScalaTupleImplicits_1_8
