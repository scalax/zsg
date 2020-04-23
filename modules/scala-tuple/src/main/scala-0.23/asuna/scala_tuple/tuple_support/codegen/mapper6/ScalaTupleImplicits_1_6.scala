package asuna.scala_tuple.tuple_support
import asuna.Application6
import asuna.Context6
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_6 {
         given  tupleTagApplicationImplicit_tagNum1_typeParamNum6[
            F[_ , _ , _ , _ , _ , _],
            Tag1,
            Plus1_X1,
            Plus2_X1,
            Plus3_X1,
            Plus4_X1,
            Plus5_X1,
            Plus6_X1
        ]( using 
        t1: Application6[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1 , Plus6_X1])  as  Application6[
            F,
            Tuple1[Tag1],
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
        ] = new Application6[
            F,
            Tuple1[Tag1],
            Tuple1[Plus1_X1],
            Tuple1[Plus2_X1],
            Tuple1[Plus3_X1],
            Tuple1[Plus4_X1],
            Tuple1[Plus5_X1],
            Tuple1[Plus6_X1]
        ] {
            override def application(context: Context6[F]): F[
                Tuple1[Plus1_X1],
                Tuple1[Plus2_X1],
                Tuple1[Plus3_X1],
                Tuple1[Plus4_X1],
                Tuple1[Plus5_X1],
                Tuple1[Plus6_X1]
            ] = {
                context.append(context.start, t1.application(context))(PlusToTuple6.plus6WithTypeParameter1)
            }
        }
}
object ScalaTupleImplicits_1_6 extends ScalaTupleImplicits_1_6
