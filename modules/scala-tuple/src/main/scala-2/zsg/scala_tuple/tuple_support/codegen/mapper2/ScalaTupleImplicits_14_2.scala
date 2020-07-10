package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_14_2 {
         implicit def tupleTagApplicationImplicit_tagNum14_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14
        ]( implicit 
               t1: F[  Plus1_X1   ,  Plus2_X1 ]   ,   t2: F[  Plus1_X2   ,  Plus2_X2 ]   ,   t3: F[  Plus1_X3   ,  Plus2_X3 ]   ,   t4: F[  Plus1_X4   ,  Plus2_X4 ]   ,   t5: F[  Plus1_X5   ,  Plus2_X5 ]   ,   t6: F[  Plus1_X6   ,  Plus2_X6 ]   ,   t7: F[  Plus1_X7   ,  Plus2_X7 ]   ,   t8: F[  Plus1_X8   ,  Plus2_X8 ]   ,   t9: F[  Plus1_X9   ,  Plus2_X9 ]   ,   t10: F[  Plus1_X10   ,  Plus2_X10 ]   ,   t11: F[  Plus1_X11   ,  Plus2_X11 ]   ,   t12: F[  Plus1_X12   ,  Plus2_X12 ]   ,   t13: F[  Plus1_X13   ,  Plus2_X13 ]   ,   t14: F[  Plus1_X14   ,  Plus2_X14 ] 
        )  :  ApplicationX2[
            F,
            T,
            Tuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14],
            Tuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]
        ] = new ApplicationX2[
            F,
            T,
            Tuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14],
            Tuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app2[F, T, zsg.ZTuple14[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14] , zsg.ZTuple14[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14]].application(context), context.start)(PlusToTuple2.plus2WithTypeParameter14)
            }
        }
}
object ScalaTupleImplicits_14_2 extends ScalaTupleImplicits_14_2
