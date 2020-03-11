package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_6_1 {
         given  tupleTagApplicationImplicit_tagNum6_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6
        ]( given 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3] , t4: Application1[F, Tag4, Plus1_X4] , t5: Application1[F, Tag5, Plus1_X5] , t6: Application1[F, Tag6, Plus1_X6]): Application1[
            F,
            Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] = new Application1[
            F,
            Tuple6[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6],
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] {
            override def application(context: Context1[F]): F[
                Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
            ] = {
                val asunaTuple2F = BuildTag.liftTag1(context)(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]))))
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter6)
            }
        }
}
object ScalaTupleImplicits_6_1 extends ScalaTupleImplicits_6_1
