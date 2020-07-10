package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_6_2 {
         implicit def tupleTagApplicationImplicit_tagNum6_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6
        ]( implicit 
               t1: F[  Plus1_X1   ,  Plus2_X1 ]   ,   t2: F[  Plus1_X2   ,  Plus2_X2 ]   ,   t3: F[  Plus1_X3   ,  Plus2_X3 ]   ,   t4: F[  Plus1_X4   ,  Plus2_X4 ]   ,   t5: F[  Plus1_X5   ,  Plus2_X5 ]   ,   t6: F[  Plus1_X6   ,  Plus2_X6 ] 
        )  :  ApplicationX2[
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
