package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_18_1 {
         given  tupleTagApplicationImplicit_tagNum18_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18
        ]( using 
        t1: Application1[F, Plus1_X1] , t2: Application1[F, Plus1_X2] , t3: Application1[F, Plus1_X3] , t4: Application1[F, Plus1_X4] , t5: Application1[F, Plus1_X5] , t6: Application1[F, Plus1_X6] , t7: Application1[F, Plus1_X7] , t8: Application1[F, Plus1_X8] , t9: Application1[F, Plus1_X9] , t10: Application1[F, Plus1_X10] , t11: Application1[F, Plus1_X11] , t12: Application1[F, Plus1_X12] , t13: Application1[F, Plus1_X13] , t14: Application1[F, Plus1_X14] , t15: Application1[F, Plus1_X15] , t16: Application1[F, Plus1_X16] , t17: Application1[F, Plus1_X17] , t18: Application1[F, Plus1_X18])  as  Application1[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18]
        ] = new Application1[
            F,
            Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18]
        ] {
            override def application(context: Context1[F]): F[
                Tuple18[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18]
            ] = {
                //val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.lift(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , AppendTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , AppendTag.tag(AppendTag[Tag11] , AppendTag[Tag12])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag13] , AppendTag[Tag14]) , AppendTag.tag(AppendTag[Tag15] , AppendTag[Tag16])))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag17] , AppendTag[Tag18])))))))
                //context.append(asunaTuple2F, context.start)(PlusToTuple1.plus1WithTypeParameter18)
                throw new Exception
            }
        }
}
object ScalaTupleImplicits_18_1 extends ScalaTupleImplicits_18_1
