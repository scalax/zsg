package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_2_3 {
         given  tupleTagApplicationImplicit_tagNum2_typeParamNum3[
            F[_ , _ , _],
            Tag1 , Tag2,
            Plus1_X1 , Plus1_X2,
            Plus2_X1 , Plus2_X2,
            Plus3_X1 , Plus3_X2
        ]( given 
        t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2]): Application3[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2]
        ] = new Application3[
            F,
            Tuple2[Tag1 , Tag2],
            Tuple2[Plus1_X1 , Plus1_X2],
            Tuple2[Plus2_X1 , Plus2_X2],
            Tuple2[Plus3_X1 , Plus3_X2]
        ] {
            override def application(context: Context3[F]): F[
                Tuple2[Plus1_X1 , Plus1_X2],
                Tuple2[Plus2_X1 , Plus2_X2],
                Tuple2[Plus3_X1 , Plus3_X2]
            ] = {
                context.append(t2.application(context), t1.application(context))(PlusToTuple3.plus3WithTypeParameter2)
            }
        }
}
object ScalaTupleImplicits_2_3 extends ScalaTupleImplicits_2_3
