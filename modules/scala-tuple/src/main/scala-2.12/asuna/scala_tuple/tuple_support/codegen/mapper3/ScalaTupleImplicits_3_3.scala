package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_3_3 {
         implicit def  tupleTagApplicationImplicit_tagNum3_typeParamNum3[
            F[_ , _ , _],
            Tag1 , Tag2 , Tag3,
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3
        ]( implicit 
        t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3]): Application3[
            F,
            Tuple3[Tag1 , Tag2 , Tag3],
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] = new Application3[
            F,
            Tuple3[Tag1 , Tag2 , Tag3],
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
        ] {
            override def application(context: Context3[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
                Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3]
            ] = {
                val asunaTuple2F = BuildTag.liftTag3(context)(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3])))
                context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_3 extends ScalaTupleImplicits_3_3
