package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_5 {
     implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum5[
        F[_ , _ , _ , _ , _],
        Tag1,
        Plus1_X1,
        Plus2_X1,
        Plus3_X1,
        Plus4_X1,
        Plus5_X1
    ]( implicit 
    t1: Application5[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1]): Application5[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1],
        Tuple1[Plus4_X1],
        Tuple1[Plus5_X1]
    ] = new Application5[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1],
        Tuple1[Plus4_X1],
        Tuple1[Plus5_X1]
    ] {
        override def application(context: Context5[F]): F[
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1]
        ] = {
            val asunaTuple2F = Application5.lift(BuildTag.tag(AppendTag[Tag1])).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple5.plus5WithTypeParameter1)
        }
    }
}
object ScalaTupleImplicits_1_5 extends ScalaTupleImplicits_1_5
