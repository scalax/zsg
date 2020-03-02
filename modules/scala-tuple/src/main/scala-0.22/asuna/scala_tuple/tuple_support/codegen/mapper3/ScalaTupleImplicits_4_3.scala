package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_4_3 {
     given  tupleTagApplicationImplicit_tagNum4_typeParamNum3[
        F[_ , _ , _],
        Tag1 , Tag2 , Tag3 , Tag4,
        Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
        Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
        Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4
    ]( given 
    t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: Application3[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4]): Application3[
        F,
        Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
        Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
        Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
        Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]
    ] = new Application3[
        F,
        Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
        Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
        Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
        Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]
    ] {
        override def application(context: Context3[F]): F[
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4]
        ] = {
            val asunaTuple2F = Application3.lift(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4]))).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter4)
        }
    }
}
object ScalaTupleImplicits_4_3 extends ScalaTupleImplicits_4_3
