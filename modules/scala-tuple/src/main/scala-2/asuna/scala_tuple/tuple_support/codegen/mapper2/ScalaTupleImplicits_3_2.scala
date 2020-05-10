package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_3_2 {
         implicit def  tupleTagApplicationImplicit_tagNum3_typeParamNum2[
            F[_ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3
        ]( implicit 
        t1: Application2[F, Plus1_X1 , Plus2_X1] , t2: Application2[F, Plus1_X2 , Plus2_X2] , t3: Application2[F, Plus1_X3 , Plus2_X3])  :  Application2[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ] = new Application2[
            F,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
        ] {
            override def application(context: Context2[F]): F[
                Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
                Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3]
            ] = {
                //val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3]))))
                //context.append(asunaTuple2F, context.start)(PlusToTuple2.plus2WithTypeParameter3)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_3_2 extends ScalaTupleImplicits_3_2
