package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_5_1 {
         implicit def  tupleTagApplicationImplicit_tagNum5_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5
        ]( implicit 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3] , t4: Application1[F, Tag4, Plus1_X4] , t5: Application1[F, Tag5, Plus1_X5])  :  Application1[
            F,
            Tuple5[Tag1 , Tag2 , Tag3 , Tag4 , Tag5],
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ] = new Application1[
            F,
            Tuple5[Tag1 , Tag2 , Tag3 , Tag4 , Tag5],
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
        ] {
            override def application(context: Context1[F]): F[
                Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5])))))
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter5)
            }
        }
}
object ScalaTupleImplicits_5_1 extends ScalaTupleImplicits_5_1
