package zsg.scala_tuple.tuple_support
import zsg.ApplicationX3
import zsg.Context3
import scala.language.higherKinds
trait ScalaTupleImplicits_8_3 {
         inline given  [
            F[_ , _ , _],
            T <: Context3[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5 ]   ,   inline  t6: F[  Plus1_X6   ,  Plus2_X6   ,  Plus3_X6 ]   ,   inline  t7: F[  Plus1_X7   ,  Plus2_X7   ,  Plus3_X7 ]   ,   inline  t8: F[  Plus1_X8   ,  Plus2_X8   ,  Plus3_X8 ] 
        )  as  ApplicationX3[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8],
            Tuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8]
        ] = new ApplicationX3[
            F,
            T,
            Tuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8],
            Tuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8],
            Tuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app3[F, T, zsg.ZTuple8[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8] , zsg.ZTuple8[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8] , zsg.ZTuple8[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8]].application(context), context.start)(PlusToTuple3.plus3WithTypeParameter8)
            }
        }
}
object ScalaTupleImplicits_8_3 extends ScalaTupleImplicits_8_3
