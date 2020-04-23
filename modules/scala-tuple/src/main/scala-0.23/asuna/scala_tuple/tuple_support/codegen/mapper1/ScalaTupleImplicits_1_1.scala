package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_1_1 {
         given  tupleTagApplicationImplicit_tagNum1_typeParamNum1[
            F[_],
            Tag1,
            Plus1_X1
        ]( using 
        t1: Application1[F, Tag1, Plus1_X1])  as  Application1[
            F,
            Tuple1[Tag1],
            Tuple1[Plus1_X1]
        ] = new Application1[
            F,
            Tuple1[Tag1],
            Tuple1[Plus1_X1]
        ] {
            override def application(context: Context1[F]): F[
                Tuple1[Plus1_X1]
            ] = {
                context.append(context.start, t1.application(context))(PlusToTuple1.plus1WithTypeParameter1)
            }
        }
}
object ScalaTupleImplicits_1_1 extends ScalaTupleImplicits_1_1
