package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_10_1 {
         implicit def  tupleTagApplicationImplicit_tagNum10_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10
        ]( implicit 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3] , t4: Application1[F, Tag4, Plus1_X4] , t5: Application1[F, Tag5, Plus1_X5] , t6: Application1[F, Tag6, Plus1_X6] , t7: Application1[F, Tag7, Plus1_X7] , t8: Application1[F, Tag8, Plus1_X8] , t9: Application1[F, Tag9, Plus1_X9] , t10: Application1[F, Tag10, Plus1_X10]): Application1[
            F,
            Tuple10[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10],
            Tuple10[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10]
        ] = new Application1[
            F,
            Tuple10[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10],
            Tuple10[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10]
        ] {
            override def application(context: Context1[F]): F[
                Tuple10[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , AppendTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag9] , AppendTag[Tag10]))))))
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter10)
            }
        }
}
object ScalaTupleImplicits_10_1 extends ScalaTupleImplicits_10_1
