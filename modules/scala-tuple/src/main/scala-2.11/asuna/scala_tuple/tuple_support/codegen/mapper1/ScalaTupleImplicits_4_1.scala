package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_4_1 {
         implicit def  tupleTagApplicationImplicit_tagNum4_typeParamNum1[
            F[_],
            Tag1 , Tag2 , Tag3 , Tag4,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4
        ]( implicit 
        t1: Application1[F, Tag1, Plus1_X1] , t2: Application1[F, Tag2, Plus1_X2] , t3: Application1[F, Tag3, Plus1_X3] , t4: Application1[F, Tag4, Plus1_X4]): Application1[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] = new Application1[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
        ] {
            override def application(context: Context1[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4]))))
                context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_1 extends ScalaTupleImplicits_4_1
