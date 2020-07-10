package zsg.scala_tuple.tuple_support
import zsg.ApplicationX8
import zsg.Context8
import scala.language.higherKinds
trait ScalaTupleImplicits_5_8 {
         inline given  [
            F[_ , _ , _ , _ , _ , _ , _ , _],
            T <: Context8[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5,
            Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5,
            Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5,
            Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5
        ]( using 
               inline  t1: F[  Plus1_X1   ,  Plus2_X1   ,  Plus3_X1   ,  Plus4_X1   ,  Plus5_X1   ,  Plus6_X1   ,  Plus7_X1   ,  Plus8_X1 ]   ,   inline  t2: F[  Plus1_X2   ,  Plus2_X2   ,  Plus3_X2   ,  Plus4_X2   ,  Plus5_X2   ,  Plus6_X2   ,  Plus7_X2   ,  Plus8_X2 ]   ,   inline  t3: F[  Plus1_X3   ,  Plus2_X3   ,  Plus3_X3   ,  Plus4_X3   ,  Plus5_X3   ,  Plus6_X3   ,  Plus7_X3   ,  Plus8_X3 ]   ,   inline  t4: F[  Plus1_X4   ,  Plus2_X4   ,  Plus3_X4   ,  Plus4_X4   ,  Plus5_X4   ,  Plus6_X4   ,  Plus7_X4   ,  Plus8_X4 ]   ,   inline  t5: F[  Plus1_X5   ,  Plus2_X5   ,  Plus3_X5   ,  Plus4_X5   ,  Plus5_X5   ,  Plus6_X5   ,  Plus7_X5   ,  Plus8_X5 ] 
        )  as  ApplicationX8[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5],
            Tuple5[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5],
            Tuple5[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5],
            Tuple5[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5]
        ] = new ApplicationX8[
            F,
            T,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5],
            Tuple5[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5],
            Tuple5[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5],
            Tuple5[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app8[F, T, zsg.ZTuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5] , zsg.ZTuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5] , zsg.ZTuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5] , zsg.ZTuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5] , zsg.ZTuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5] , zsg.ZTuple5[Plus6_X1 , Plus6_X2 , Plus6_X3 , Plus6_X4 , Plus6_X5] , zsg.ZTuple5[Plus7_X1 , Plus7_X2 , Plus7_X3 , Plus7_X4 , Plus7_X5] , zsg.ZTuple5[Plus8_X1 , Plus8_X2 , Plus8_X3 , Plus8_X4 , Plus8_X5]].application(context), context.start)(PlusToTuple8.plus8WithTypeParameter5)
            }
        }
}
object ScalaTupleImplicits_5_8 extends ScalaTupleImplicits_5_8
