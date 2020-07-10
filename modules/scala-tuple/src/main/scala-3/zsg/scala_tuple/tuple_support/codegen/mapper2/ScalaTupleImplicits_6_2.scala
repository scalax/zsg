package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_6_2 {
         inline given  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5 ]   ,   inline  t6: F[  Plus1_X6   ,  Plus2_X6 ] 
        )  as  ApplicationX2[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] = new ApplicationX2[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6],
            Tuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app2[F, T, zsg.ZTuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6] , zsg.ZTuple6[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6]].application(context), context.start)(PlusToTuple2.plus2WithTypeParameter6)
            }
        }
}
object ScalaTupleImplicits_6_2 extends ScalaTupleImplicits_6_2
