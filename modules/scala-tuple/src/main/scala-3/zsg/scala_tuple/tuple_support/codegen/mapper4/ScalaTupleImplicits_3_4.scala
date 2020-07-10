package zsg.scala_tuple.tuple_support
import zsg.ApplicationX4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_3_4 {
         inline given  [
            F[_ , _ , _ , _],
            T <: Context4[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3 ] 
        )  as  ApplicationX4[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] = new ApplicationX4[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app4[F, T, zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] , zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] , zsg.ZTuple3[Plus3_X1 , Plus3_X2 , Plus3_X3] , zsg.ZTuple3[Plus4_X1 , Plus4_X2 , Plus4_X3]].application(context), context.start)(PlusToTuple4.plus4WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_4 extends ScalaTupleImplicits_3_4
