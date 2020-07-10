package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_6_1 {
         implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum1  [
            F[_],
            T <: Context1[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6
        ]( implicit 
               t1: F[  Plus1_X1 ]   ,   t2: F[  Plus1_X2 ]   ,   t3: F[  Plus1_X3 ]   ,   t4: F[  Plus1_X4 ]   ,   t5: F[  Plus1_X5 ]   ,   t6: F[  Plus1_X6 ] 
        )  :  ApplicationX1[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] = new ApplicationX1[
            F,
            T,
            Tuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app1[F, T, zsg.ZTuple6[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6]].application(context), context.start)(PlusToTuple1.plus1WithTypeParameter6)
            }
        }
}
object ScalaTupleImplicits_6_1 extends ScalaTupleImplicits_6_1
