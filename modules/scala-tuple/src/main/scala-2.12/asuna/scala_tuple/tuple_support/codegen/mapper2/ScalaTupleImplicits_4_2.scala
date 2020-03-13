package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_4_2 {
         implicit def  tupleTagApplicationImplicit_tagNum4_typeParamNum2[
            F[_ , _],
            Tag1 , Tag2 , Tag3 , Tag4,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4
        ]( implicit 
        t1: Application2[F, Tag1, Plus1_X1 , Plus2_X1] , t2: Application2[F, Tag2, Plus1_X2 , Plus2_X2] , t3: Application2[F, Tag3, Plus1_X3 , Plus2_X3] , t4: Application2[F, Tag4, Plus1_X4 , Plus2_X4]): Application2[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] = new Application2[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
        ] {
            override def application(context: Context2[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
                Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])))
                context.append(asunaTuple2F, context.start)(PlusToTuple2.plus2WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_2 extends ScalaTupleImplicits_4_2
