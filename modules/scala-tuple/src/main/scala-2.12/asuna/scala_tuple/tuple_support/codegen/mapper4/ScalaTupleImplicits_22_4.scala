package asuna.scala_tuple.tuple_support
import asuna.Application4
import asuna.Context4
import asuna.AppendTag
import scala.language.higherKinds
trait ScalaTupleImplicits_22_4 {
         implicit def  tupleTagApplicationImplicit_tagNum22_typeParamNum4[
            F[_ , _ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19 , Plus4_X20 , Plus4_X21 , Plus4_X22
        ]( implicit 
        t1: Application4[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: Application4[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: Application4[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: Application4[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4] , t5: Application4[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5] , t6: Application4[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6 , Plus4_X6] , t7: Application4[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7 , Plus4_X7] , t8: Application4[F, Tag8, Plus1_X8 , Plus2_X8 , Plus3_X8 , Plus4_X8] , t9: Application4[F, Tag9, Plus1_X9 , Plus2_X9 , Plus3_X9 , Plus4_X9] , t10: Application4[F, Tag10, Plus1_X10 , Plus2_X10 , Plus3_X10 , Plus4_X10] , t11: Application4[F, Tag11, Plus1_X11 , Plus2_X11 , Plus3_X11 , Plus4_X11] , t12: Application4[F, Tag12, Plus1_X12 , Plus2_X12 , Plus3_X12 , Plus4_X12] , t13: Application4[F, Tag13, Plus1_X13 , Plus2_X13 , Plus3_X13 , Plus4_X13] , t14: Application4[F, Tag14, Plus1_X14 , Plus2_X14 , Plus3_X14 , Plus4_X14] , t15: Application4[F, Tag15, Plus1_X15 , Plus2_X15 , Plus3_X15 , Plus4_X15] , t16: Application4[F, Tag16, Plus1_X16 , Plus2_X16 , Plus3_X16 , Plus4_X16] , t17: Application4[F, Tag17, Plus1_X17 , Plus2_X17 , Plus3_X17 , Plus4_X17] , t18: Application4[F, Tag18, Plus1_X18 , Plus2_X18 , Plus3_X18 , Plus4_X18] , t19: Application4[F, Tag19, Plus1_X19 , Plus2_X19 , Plus3_X19 , Plus4_X19] , t20: Application4[F, Tag20, Plus1_X20 , Plus2_X20 , Plus3_X20 , Plus4_X20] , t21: Application4[F, Tag21, Plus1_X21 , Plus2_X21 , Plus3_X21 , Plus4_X21] , t22: Application4[F, Tag22, Plus1_X22 , Plus2_X22 , Plus3_X22 , Plus4_X22]): Application4[
            F,
            Tuple22[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22],
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
            Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
            Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22],
            Tuple22[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19 , Plus4_X20 , Plus4_X21 , Plus4_X22]
        ] = new Application4[
            F,
            Tuple22[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22],
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
            Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
            Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22],
            Tuple22[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19 , Plus4_X20 , Plus4_X21 , Plus4_X22]
        ] {
            override def application(context: Context4[F]): F[
                Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
                Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
                Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22],
                Tuple22[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5 , Plus4_X6 , Plus4_X7 , Plus4_X8 , Plus4_X9 , Plus4_X10 , Plus4_X11 , Plus4_X12 , Plus4_X13 , Plus4_X14 , Plus4_X15 , Plus4_X16 , Plus4_X17 , Plus4_X18 , Plus4_X19 , Plus4_X20 , Plus4_X21 , Plus4_X22]
            ] = {
                val asunaTuple2F = AppendTag.liftTag(context)(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , AppendTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , AppendTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , AppendTag.tag(AppendTag[Tag11] , AppendTag[Tag12])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag13] , AppendTag[Tag14]) , AppendTag.tag(AppendTag[Tag15] , AppendTag[Tag16])))) , AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag17] , AppendTag[Tag18]) , AppendTag.tag(AppendTag[Tag19] , AppendTag[Tag20])) , AppendTag.nodeTag(AppendTag.tag(AppendTag[Tag21] , AppendTag[Tag22]))))))
                context.append(asunaTuple2F, context.start)(PlusToTuple4.plus4WithTypeParameter22)
            }
        }
}
object ScalaTupleImplicits_22_4 extends ScalaTupleImplicits_22_4
