package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_15_1 {
         inline given  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15
        ]( using 
               inline  t1: F[  Plus1_X1 ]   ,   inline  t2: F[  Plus1_X2 ]   ,   inline  t3: F[  Plus1_X3 ]   ,   inline  t4: F[  Plus1_X4 ]   ,   inline  t5: F[  Plus1_X5 ]   ,   inline  t6: F[  Plus1_X6 ]   ,   inline  t7: F[  Plus1_X7 ]   ,   inline  t8: F[  Plus1_X8 ]   ,   inline  t9: F[  Plus1_X9 ]   ,   inline  t10: F[  Plus1_X10 ]   ,   inline  t11: F[  Plus1_X11 ]   ,   inline  t12: F[  Plus1_X12 ]   ,   inline  t13: F[  Plus1_X13 ]   ,   inline  t14: F[  Plus1_X14 ]   ,   inline  t15: F[  Plus1_X15 ] 
        )  as  ApplicationX1[
            F,
            T,
            Tuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]
        ] = new ApplicationX1[
            F,
            T,
            Tuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app1[F, T, zsg.ZTuple15[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15]].application(context), context.start)(PlusToTuple1.plus1WithTypeParameter15)
            }
        }
}
object ScalaTupleImplicits_15_1 extends ScalaTupleImplicits_15_1
