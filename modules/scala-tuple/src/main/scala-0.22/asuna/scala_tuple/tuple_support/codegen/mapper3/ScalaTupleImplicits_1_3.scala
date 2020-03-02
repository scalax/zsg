package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_3 {
     given  tupleTagApplicationImplicit_tagNum1_typeParamNum3[
        F[_ , _ , _],
        Tag1,
        Plus1_X1,
        Plus2_X1,
        Plus3_X1
    ]( given 
    t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1]): Application3[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1]
    ] = new Application3[
        F,
        Tuple1[Tag1],
        Tuple1[Plus1_X1],
        Tuple1[Plus2_X1],
        Tuple1[Plus3_X1]
    ] {
        override def application(context: Context3[F]): F[
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1]
        ] = {
            val asunaTuple2F = Application3.lift(BuildTag.tag(AppendTag[Tag1])).application(context)
            context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter1)
        }
    }
}
object ScalaTupleImplicits_1_3 extends ScalaTupleImplicits_1_3
