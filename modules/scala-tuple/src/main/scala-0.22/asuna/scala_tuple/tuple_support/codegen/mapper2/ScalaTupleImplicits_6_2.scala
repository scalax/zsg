package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_6_2 {
     given  tupleTagApplicationImplicit_tagNum6_typeParamNum2[
        F[_ , _],
        Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6,
        Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
        Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6
    ]( given 
    t1: Application2[F, Tag1, Plus1_X1 , Plus2_X1] , t2: Application2[F, Tag2, Plus1_X2 , Plus2_X2] , t3: Application2[F, Tag3, Plus1_X3 , Plus2_X3] , t4: Application2[F, Tag4, Plus1_X4 , Plus2_X4] , t5: Application2[F, Tag5, Plus1_X5 , Plus2_X5] , t6: Application2[F, Tag6, Plus1_X6 , Plus2_X6]): Application2[
        F,
        Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
        Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
        Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
    ] = new Application2[
        F,
        Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
        Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
        Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
    ] {
        override def application(context: Context2[F]): F[
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] = {
            val asunaTuple2F = Application2.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6])))).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple2.plus2WithTypeParameter6)
        }
    }
}
object ScalaTupleImplicits_6_2 extends ScalaTupleImplicits_6_2
