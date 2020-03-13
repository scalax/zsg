package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_9_2 {
         given  tupleTagApplicationImplicit_tagNum9_typeParamNum2[
            F[_ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9
        ]( given 
        t1: Application2[F, Tag1, Plus1_X1 , Plus2_X1] , t2: Application2[F, Tag2, Plus1_X2 , Plus2_X2] , t3: Application2[F, Tag3, Plus1_X3 , Plus2_X3] , t4: Application2[F, Tag4, Plus1_X4 , Plus2_X4] , t5: Application2[F, Tag5, Plus1_X5 , Plus2_X5] , t6: Application2[F, Tag6, Plus1_X6 , Plus2_X6] , t7: Application2[F, Tag7, Plus1_X7 , Plus2_X7] , t8: Application2[F, Tag8, Plus1_X8 , Plus2_X8] , t9: Application2[F, Tag9, Plus1_X9 , Plus2_X9]): Application2[
            F,
            Tuple9[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9],
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9],
            Tuple9[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9]
        ] = new Application2[
            F,
            Tuple9[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9],
            Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9],
            Tuple9[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9]
        ] {
            override def application(context: Context2[F]): F[
                Tuple9[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9],
                Tuple9[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , AppendTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag9]))))))
                context.append(asunaTuple2F, context.start)(PlusToTuple2.plus2WithTypeParameter9)
            }
        }
}
object ScalaTupleImplicits_9_2 extends ScalaTupleImplicits_9_2
