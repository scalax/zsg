package asuna.scala_tuple.tuple_support
import asuna.Application5
import asuna.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_4_5 {
         implicit def  tupleTagApplicationImplicit_tagNum4_typeParamNum5[
            F[_ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4
        ]( implicit 
        t1: Application5[F, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1] , t2: Application5[F, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2] , t3: Application5[F, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3] , t4: Application5[F, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4])  :  Application5[
            F,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]
        ] = new Application5[
            F,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
            Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]
        ] {
            override def application(context: Context5[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
                Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
                Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
                Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4],
                Tuple4[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4]
            ] = {
                //val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4]))))
                //context.append(asunaTuple2F, context.start)(PlusToTuple5.plus5WithTypeParameter4)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_4_5 extends ScalaTupleImplicits_4_5
