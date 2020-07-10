package zsg.scala_tuple.tuple_support
import zsg.ApplicationX8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_3_8 {
         inline given  [
            F[_ , _ , _ , _ , _ , _ , _ , _],
            T <: Context8[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3,
            Plus2_X1 , Plus2_X2 , Plus2_X3,
            Plus3_X1 , Plus3_X2 , Plus3_X3,
            Plus4_X1 , Plus4_X2 , Plus4_X3,
            Plus5_X1 , Plus5_X2 , Plus5_X3,
            Plus6_X1 , Plus6_X2 , Plus6_X3,
            Plus7_X1 , Plus7_X2 , Plus7_X3,
            Plus8_X1 , Plus8_X2 , Plus8_X3
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1   ,  Plus8_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2   ,  Plus7_X2   ,  Plus8_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3   ,  Plus7_X3   ,  Plus8_X3 ] 
        )  as  ApplicationX8[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] = new ApplicationX8[
            F,
            T,
            Tuple3[Plus1_X1 , Plus1_X2 , Plus1_X3],
            Tuple3[Plus2_X1 , Plus2_X2 , Plus2_X3],
            Tuple3[Plus3_X1 , Plus3_X2 , Plus3_X3],
            Tuple3[Plus4_X1 , Plus4_X2 , Plus4_X3],
            Tuple3[Plus5_X1 , Plus5_X2 , Plus5_X3],
            Tuple3[Plus6_X1 , Plus6_X2 , Plus6_X3],
            Tuple3[Plus7_X1 , Plus7_X2 , Plus7_X3],
            Tuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app8[F, T, zsg.ZTuple3[Plus1_X1 , Plus1_X2 , Plus1_X3] , zsg.ZTuple3[Plus2_X1 , Plus2_X2 , Plus2_X3] , zsg.ZTuple3[Plus3_X1 , Plus3_X2 , Plus3_X3] , zsg.ZTuple3[Plus4_X1 , Plus4_X2 , Plus4_X3] , zsg.ZTuple3[Plus5_X1 , Plus5_X2 , Plus5_X3] , zsg.ZTuple3[Plus6_X1 , Plus6_X2 , Plus6_X3] , zsg.ZTuple3[Plus7_X1 , Plus7_X2 , Plus7_X3] , zsg.ZTuple3[Plus8_X1 , Plus8_X2 , Plus8_X3]].application(context), context.start)(PlusToTuple8.plus8WithTypeParameter3)
            }
        }
}
object ScalaTupleImplicits_3_8 extends ScalaTupleImplicits_3_8
