package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_2_4 {
     given  tupleTagApplicationImplicit_tagNum2_typeParamNum4[
        F[_ , _ , _ , _],
        Tag1 , Tag2,
        Plus1_X1 , Plus1_X2,
        Plus2_X1 , Plus2_X2,
        Plus3_X1 , Plus3_X2,
        Plus4_X1 , Plus4_X2
    ]( given 
    t1: Application4[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2]): Application4[
        F,
        Tuple2[Tag1 , Tag2],
        Tuple2[Plus1_X1 , Plus1_X2],
        Tuple2[Plus2_X1 , Plus2_X2],
        Tuple2[Plus3_X1 , Plus3_X2],
        Tuple2[Plus4_X1 , Plus4_X2]
    ] = new Application4[
        F,
        Tuple2[Tag1 , Tag2],
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
            val asunaTuple2F = Application4.lift(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2])).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple4.plus4WithTypeParameter2)
        }
    }
}
object ScalaTupleImplicits_2_4 extends ScalaTupleImplicits_2_4
