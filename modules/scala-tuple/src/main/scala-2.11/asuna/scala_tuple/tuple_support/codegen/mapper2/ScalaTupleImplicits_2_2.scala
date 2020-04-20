package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_2_2 {
         implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum2[
            F[_ , _],
            Tag1 , Tag2,
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2
        ]( implicit 
        t1: Application2[F, Tag1, Plus1_X1 , Plus2_X1] , t2: Application2[F, Tag2, Plus1_X2 , Plus2_X2]): Application2[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ] = new Application2[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2]
        ] {
            override def application(context: Context2[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2],
                Tuple2[Plus2_X1 , Plus2_X2]
            ] = {
                context.append(t2.application(context), t1.application(context))(PlusToTuple2.plus2WithTypeParameter2)
            }
        }
}
object ScalaTupleImplicits_2_2 extends ScalaTupleImplicits_2_2
