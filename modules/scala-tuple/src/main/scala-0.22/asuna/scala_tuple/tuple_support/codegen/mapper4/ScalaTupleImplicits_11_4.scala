package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_11_4 {
         given  tupleTagApplicationImplicit_tagNum11_typeParamNum4[
            F[_ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11
        ]( given 
        t1: Application4[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: Application4[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: Application4[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4] , t5: Application4[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5] , t6: Application4[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6] , t7: Application4[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7] , t8: Application4[F, Tag8, Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8] , t9: Application4[F, Tag9, Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9] , t10: Application4[F, Tag10, Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10] , t11: Application4[F, Tag11, Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11]): Application4[
            F,
            Tuple11[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11],
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11],
            Tuple11[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11],
            Tuple11[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11]
        ] = new Application4[
            F,
            Tuple11[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11],
            Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
            Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11],
            Tuple11[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11],
            Tuple11[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11]
        ] {
            override def application(context: Context4[F]): F[
                Tuple11[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11],
                Tuple11[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11],
                Tuple11[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11],
                Tuple11[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11]
            ] = {
                val asunaTuple2F = Application4.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , BuildTag.tag(AppendTag[Tag11]))))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple4.plus4WithTypeParameter11)
            }
        }
}
object ScalaTupleImplicits_11_4 extends ScalaTupleImplicits_11_4
