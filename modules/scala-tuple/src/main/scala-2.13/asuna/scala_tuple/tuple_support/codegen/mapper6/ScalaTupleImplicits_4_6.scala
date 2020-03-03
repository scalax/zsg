package asuna.scala_tuple.tuple_support
import asuna.Application6
import asuna.Context6
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_4_6 {
         implicit def  tupleTagApplicationImplicit_tagNum4_typeParamNum6[
            F[_ , _ , _ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
        Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
        Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
        Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
        Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4,
        Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4
        ]( implicit 
        t1: Application6[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1] , t2: Application6[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2 , Plus6_X2] , t3: Application6[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3 , Plus6_X3] , t4: Application6[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4 , Plus6_X4]): Application6[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
        Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
        Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
        Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
        Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
        Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4]
        ] = new Application6[
            F,
            Tuple4[Tag1 , Tag2 , Tag3 , Tag4],
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
        Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
        Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
        Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
        Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
        Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4]
        ] {
            override def application(context: Context6[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4],
            Tuple4[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4]
            ] = {
                val asunaTuple2F = Application6.lift(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4]))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple6.plus6WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_6 extends ScalaTupleImplicits_4_6
