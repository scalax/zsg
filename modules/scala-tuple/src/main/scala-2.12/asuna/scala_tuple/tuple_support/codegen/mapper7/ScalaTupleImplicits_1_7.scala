package asuna.scala_tuple.tuple_support
import asuna.Application7
import asuna.Context7
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_7 {
     implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum7[
        F[_ , _ , _ , _ , _ , _ , _],
        Tag1,
        Plus1_X1,
        Plus2_X1,
        Plus3_X1,
        Plus4_X1,
        Plus5_X1,
        Plus6_X1,
        Plus7_X1
    ]( implicit 
    t1: Application7[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1 , Plus7_X1]): Application7[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1],
        Tuple1[Plus4_X1],
        Tuple1[Plus5_X1],
        Tuple1[Plus6_X1],
        Tuple1[Plus7_X1]
    ] = new Application7[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1],
        Tuple1[Plus4_X1],
        Tuple1[Plus5_X1],
        Tuple1[Plus6_X1],
        Tuple1[Plus7_X1]
    ] {
        override def application(context: Context7[F]): F[
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1],
            Tuple1[Plus7_X1]
        ] = {
            val asunaTuple2F = Application7.lift(BuildTag.tag(AppendTag[Tag1])).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple7.plus7WithTypeParameter1)
        }
    }
}
object ScalaTupleImplicits_1_7 extends ScalaTupleImplicits_1_7
