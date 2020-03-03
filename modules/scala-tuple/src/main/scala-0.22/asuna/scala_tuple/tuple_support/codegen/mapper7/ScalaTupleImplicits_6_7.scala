package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_6_7 {
         given  tupleTagApplicationImplicit_tagNum6_typeParamNum7[
            F[_ , _ , _ , _ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
        Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6,
        Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6,
        Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6,
        Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6,
        Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6,
        Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6
        ]( given 
        t1: Application7[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1] , t2: Application7[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2 , Plus7_X2] , t3: Application7[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3 , Plus7_X3] , t4: Application7[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4 , Plus6_X4 , Plus7_X4] , t5: Application7[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5 , Plus5_X5 , Plus6_X5 , Plus7_X5] , t6: Application7[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6 , Plus5_X6 , Plus6_X6 , Plus7_X6]): Application7[
            F,
            Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
        Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
        Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
        Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6],
        Tuple6[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6],
        Tuple6[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6],
        Tuple6[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6]
        ] = new Application7[
            F,
            Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
        Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
        Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
        Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6],
        Tuple6[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6],
        Tuple6[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6],
        Tuple6[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6]
        ] {
            override def application(context: Context7[F]): F[
                Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6],
            Tuple6[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6],
            Tuple6[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6],
            Tuple6[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5 , Plus5_X6],
            Tuple6[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5 , Plus6_X6],
            Tuple6[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5 , Plus7_X6]
            ] = {
                val asunaTuple2F = Application7.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6])))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple7.plus7WithTypeParameter6)
            }
        }
}
object ScalaTupleImplicits_6_7 extends ScalaTupleImplicits_6_7
