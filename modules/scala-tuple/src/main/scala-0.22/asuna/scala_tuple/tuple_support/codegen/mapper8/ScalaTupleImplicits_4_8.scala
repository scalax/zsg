package asuna.scala_tuple.tuple_support
import asuna.Application8
import asuna.Context8
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_4_8 {
         given  tupleTagApplicationImplicit_tagNum4_typeParamNum8[
            F[_ , _ , _ , _ , _ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4,
            Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4
        ]( given 
        t1: Application8[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1 , Plus8_X1] , t2: Application8[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2 , Plus8_X2] , t3: Application8[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3 , Plus7_X3 , Plus8_X3] , t4: Application8[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4 , Plus6_X4 , Plus7_X4 , Plus8_X4]): Application8[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ] = new Application8[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
            Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
            Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
        ] {
            override def application(context: Context8[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
                Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
                Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
                Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
                Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
                Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4],
                Tuple4[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4],
                Tuple4[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4]
            ] = {
                val asunaTuple2F = Application8.lift(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4]))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple8.plus8WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_8 extends ScalaTupleImplicits_4_8
