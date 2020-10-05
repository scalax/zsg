package zsg.scala_tuple.tuple_support
import zsg.ApplicationX1
import zsg.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_20_1 {
  implicit def tupleTagApplicationImplicit_tagNum20_typeParamNum1[
    F[_],
    T <: Context1[F],
    Plus1_X1,
    Plus1_X2,
    Plus1_X3,
    Plus1_X4,
    Plus1_X5,
    Plus1_X6,
    Plus1_X7,
    Plus1_X8,
    Plus1_X9,
    Plus1_X10,
    Plus1_X11,
    Plus1_X12,
    Plus1_X13,
    Plus1_X14,
    Plus1_X15,
    Plus1_X16,
    Plus1_X17,
    Plus1_X18,
    Plus1_X19,
    Plus1_X20
  ](implicit
    t1: F[Plus1_X1],
    t2: F[Plus1_X2],
    t3: F[Plus1_X3],
    t4: F[Plus1_X4],
    t5: F[Plus1_X5],
    t6: F[Plus1_X6],
    t7: F[Plus1_X7],
    t8: F[Plus1_X8],
    t9: F[Plus1_X9],
    t10: F[Plus1_X10],
    t11: F[Plus1_X11],
    t12: F[Plus1_X12],
    t13: F[Plus1_X13],
    t14: F[Plus1_X14],
    t15: F[Plus1_X15],
    t16: F[Plus1_X16],
    t17: F[Plus1_X17],
    t18: F[Plus1_X18],
    t19: F[Plus1_X19],
    t20: F[Plus1_X20]
  ): ApplicationX1[
    F,
    T,
    Tuple20[
      Plus1_X1,
      Plus1_X2,
      Plus1_X3,
      Plus1_X4,
      Plus1_X5,
      Plus1_X6,
      Plus1_X7,
      Plus1_X8,
      Plus1_X9,
      Plus1_X10,
      Plus1_X11,
      Plus1_X12,
      Plus1_X13,
      Plus1_X14,
      Plus1_X15,
      Plus1_X16,
      Plus1_X17,
      Plus1_X18,
      Plus1_X19,
      Plus1_X20
    ]
  ] =
    new ApplicationX1[
      F,
      T,
      Tuple20[
        Plus1_X1,
        Plus1_X2,
        Plus1_X3,
        Plus1_X4,
        Plus1_X5,
        Plus1_X6,
        Plus1_X7,
        Plus1_X8,
        Plus1_X9,
        Plus1_X10,
        Plus1_X11,
        Plus1_X12,
        Plus1_X13,
        Plus1_X14,
        Plus1_X15,
        Plus1_X16,
        Plus1_X17,
        Plus1_X18,
        Plus1_X19,
        Plus1_X20
      ]
    ] {
      override def application(context: T) = {
        context.append(
          ApplicationFetchContent
            .app1[F, T, zsg.ZTuple20[
              Plus1_X1,
              Plus1_X2,
              Plus1_X3,
              Plus1_X4,
              Plus1_X5,
              Plus1_X6,
              Plus1_X7,
              Plus1_X8,
              Plus1_X9,
              Plus1_X10,
              Plus1_X11,
              Plus1_X12,
              Plus1_X13,
              Plus1_X14,
              Plus1_X15,
              Plus1_X16,
              Plus1_X17,
              Plus1_X18,
              Plus1_X19,
              Plus1_X20
            ]]
            .application(context),
          context.start
        )(PlusToTuple1.plus1WithTypeParameter20)
      }
    }
}
object ScalaTupleImplicits_20_1 extends ScalaTupleImplicits_20_1
