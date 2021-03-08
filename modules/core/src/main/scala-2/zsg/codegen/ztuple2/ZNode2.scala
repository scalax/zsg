package zsg
import scala.language.higherKinds
class ZNode2[I1 <: zsg.TupleTag, I2 <: zsg.TupleTag](val i1: I1, val i2: I2) extends zsg.TupleTag
object ZNode2 {
  implicit def contextNum1[F[_], T <: Context1[F], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag](implicit
    t1: ApplicationX1[F, T, Tuple1_Context1],
    t2: ApplicationX1[F, T, Tuple2_Context1]
  ): ApplicationX1[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1]] = new ApplicationX1[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1]] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum1)
    }
  }
  implicit def contextNum2[F[_, _], T <: Context2[F], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag](
    implicit
    t1: ApplicationX2[F, T, Tuple1_Context1, Tuple1_Context2],
    t2: ApplicationX2[F, T, Tuple2_Context1, Tuple2_Context2]
  ): ApplicationX2[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2]] =
    new ApplicationX2[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2]] {
      override def application(context: T): F[
        ZNode2[Tuple1_Context1, Tuple2_Context1],
        ZNode2[Tuple1_Context2, Tuple2_Context2]
      ] = {
        context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum2)
      }
    }
  implicit def contextNum3[F[_, _, _], T <: Context3[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag](
    implicit
    t1: ApplicationX3[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3],
    t2: ApplicationX3[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3]
  ): ApplicationX3[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3]] =
    new ApplicationX3[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3]] {
      override def application(context: T): F[
        ZNode2[Tuple1_Context1, Tuple2_Context1],
        ZNode2[Tuple1_Context2, Tuple2_Context2],
        ZNode2[Tuple1_Context3, Tuple2_Context3]
      ] = {
        context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum3)
      }
    }
  implicit def contextNum4[F[_, _, _, _], T <: Context4[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag, Tuple1_Context4 <: TupleTag, Tuple2_Context4 <: TupleTag](
    implicit
    t1: ApplicationX4[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3, Tuple1_Context4],
    t2: ApplicationX4[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3, Tuple2_Context4]
  ): ApplicationX4[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3], ZNode2[
    Tuple1_Context4,
    Tuple2_Context4
  ]] = new ApplicationX4[
    F,
    T,
    ZNode2[Tuple1_Context1, Tuple2_Context1],
    ZNode2[Tuple1_Context2, Tuple2_Context2],
    ZNode2[Tuple1_Context3, Tuple2_Context3],
    ZNode2[Tuple1_Context4, Tuple2_Context4]
  ] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1],
      ZNode2[Tuple1_Context2, Tuple2_Context2],
      ZNode2[Tuple1_Context3, Tuple2_Context3],
      ZNode2[Tuple1_Context4, Tuple2_Context4]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum4)
    }
  }
  implicit def contextNum5[F[_, _, _, _, _], T <: Context5[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag, Tuple1_Context4 <: TupleTag, Tuple2_Context4 <: TupleTag, Tuple1_Context5 <: TupleTag, Tuple2_Context5 <: TupleTag](
    implicit
    t1: ApplicationX5[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3, Tuple1_Context4, Tuple1_Context5],
    t2: ApplicationX5[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3, Tuple2_Context4, Tuple2_Context5]
  ): ApplicationX5[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3], ZNode2[
    Tuple1_Context4,
    Tuple2_Context4
  ], ZNode2[Tuple1_Context5, Tuple2_Context5]] = new ApplicationX5[
    F,
    T,
    ZNode2[Tuple1_Context1, Tuple2_Context1],
    ZNode2[Tuple1_Context2, Tuple2_Context2],
    ZNode2[Tuple1_Context3, Tuple2_Context3],
    ZNode2[Tuple1_Context4, Tuple2_Context4],
    ZNode2[Tuple1_Context5, Tuple2_Context5]
  ] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1],
      ZNode2[Tuple1_Context2, Tuple2_Context2],
      ZNode2[Tuple1_Context3, Tuple2_Context3],
      ZNode2[Tuple1_Context4, Tuple2_Context4],
      ZNode2[Tuple1_Context5, Tuple2_Context5]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum5)
    }
  }
  implicit def contextNum6[F[_, _, _, _, _, _], T <: Context6[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag, Tuple1_Context4 <: TupleTag, Tuple2_Context4 <: TupleTag, Tuple1_Context5 <: TupleTag, Tuple2_Context5 <: TupleTag, Tuple1_Context6 <: TupleTag, Tuple2_Context6 <: TupleTag](
    implicit
    t1: ApplicationX6[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3, Tuple1_Context4, Tuple1_Context5, Tuple1_Context6],
    t2: ApplicationX6[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3, Tuple2_Context4, Tuple2_Context5, Tuple2_Context6]
  ): ApplicationX6[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3], ZNode2[
    Tuple1_Context4,
    Tuple2_Context4
  ], ZNode2[Tuple1_Context5, Tuple2_Context5], ZNode2[Tuple1_Context6, Tuple2_Context6]] = new ApplicationX6[
    F,
    T,
    ZNode2[Tuple1_Context1, Tuple2_Context1],
    ZNode2[Tuple1_Context2, Tuple2_Context2],
    ZNode2[Tuple1_Context3, Tuple2_Context3],
    ZNode2[Tuple1_Context4, Tuple2_Context4],
    ZNode2[Tuple1_Context5, Tuple2_Context5],
    ZNode2[Tuple1_Context6, Tuple2_Context6]
  ] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1],
      ZNode2[Tuple1_Context2, Tuple2_Context2],
      ZNode2[Tuple1_Context3, Tuple2_Context3],
      ZNode2[Tuple1_Context4, Tuple2_Context4],
      ZNode2[Tuple1_Context5, Tuple2_Context5],
      ZNode2[Tuple1_Context6, Tuple2_Context6]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum6)
    }
  }
  implicit def contextNum7[F[_, _, _, _, _, _, _], T <: Context7[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag, Tuple1_Context4 <: TupleTag, Tuple2_Context4 <: TupleTag, Tuple1_Context5 <: TupleTag, Tuple2_Context5 <: TupleTag, Tuple1_Context6 <: TupleTag, Tuple2_Context6 <: TupleTag, Tuple1_Context7 <: TupleTag, Tuple2_Context7 <: TupleTag](
    implicit
    t1: ApplicationX7[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3, Tuple1_Context4, Tuple1_Context5, Tuple1_Context6, Tuple1_Context7],
    t2: ApplicationX7[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3, Tuple2_Context4, Tuple2_Context5, Tuple2_Context6, Tuple2_Context7]
  ): ApplicationX7[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3], ZNode2[
    Tuple1_Context4,
    Tuple2_Context4
  ], ZNode2[Tuple1_Context5, Tuple2_Context5], ZNode2[Tuple1_Context6, Tuple2_Context6], ZNode2[Tuple1_Context7, Tuple2_Context7]] = new ApplicationX7[
    F,
    T,
    ZNode2[Tuple1_Context1, Tuple2_Context1],
    ZNode2[Tuple1_Context2, Tuple2_Context2],
    ZNode2[Tuple1_Context3, Tuple2_Context3],
    ZNode2[Tuple1_Context4, Tuple2_Context4],
    ZNode2[Tuple1_Context5, Tuple2_Context5],
    ZNode2[Tuple1_Context6, Tuple2_Context6],
    ZNode2[Tuple1_Context7, Tuple2_Context7]
  ] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1],
      ZNode2[Tuple1_Context2, Tuple2_Context2],
      ZNode2[Tuple1_Context3, Tuple2_Context3],
      ZNode2[Tuple1_Context4, Tuple2_Context4],
      ZNode2[Tuple1_Context5, Tuple2_Context5],
      ZNode2[Tuple1_Context6, Tuple2_Context6],
      ZNode2[Tuple1_Context7, Tuple2_Context7]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum7)
    }
  }
  implicit def contextNum8[F[_, _, _, _, _, _, _, _], T <: Context8[
    F
  ], Tuple1_Context1 <: TupleTag, Tuple2_Context1 <: TupleTag, Tuple1_Context2 <: TupleTag, Tuple2_Context2 <: TupleTag, Tuple1_Context3 <: TupleTag, Tuple2_Context3 <: TupleTag, Tuple1_Context4 <: TupleTag, Tuple2_Context4 <: TupleTag, Tuple1_Context5 <: TupleTag, Tuple2_Context5 <: TupleTag, Tuple1_Context6 <: TupleTag, Tuple2_Context6 <: TupleTag, Tuple1_Context7 <: TupleTag, Tuple2_Context7 <: TupleTag, Tuple1_Context8 <: TupleTag, Tuple2_Context8 <: TupleTag](
    implicit
    t1: ApplicationX8[F, T, Tuple1_Context1, Tuple1_Context2, Tuple1_Context3, Tuple1_Context4, Tuple1_Context5, Tuple1_Context6, Tuple1_Context7, Tuple1_Context8],
    t2: ApplicationX8[F, T, Tuple2_Context1, Tuple2_Context2, Tuple2_Context3, Tuple2_Context4, Tuple2_Context5, Tuple2_Context6, Tuple2_Context7, Tuple2_Context8]
  ): ApplicationX8[F, T, ZNode2[Tuple1_Context1, Tuple2_Context1], ZNode2[Tuple1_Context2, Tuple2_Context2], ZNode2[Tuple1_Context3, Tuple2_Context3], ZNode2[
    Tuple1_Context4,
    Tuple2_Context4
  ], ZNode2[Tuple1_Context5, Tuple2_Context5], ZNode2[Tuple1_Context6, Tuple2_Context6], ZNode2[Tuple1_Context7, Tuple2_Context7], ZNode2[
    Tuple1_Context8,
    Tuple2_Context8
  ]] = new ApplicationX8[
    F,
    T,
    ZNode2[Tuple1_Context1, Tuple2_Context1],
    ZNode2[Tuple1_Context2, Tuple2_Context2],
    ZNode2[Tuple1_Context3, Tuple2_Context3],
    ZNode2[Tuple1_Context4, Tuple2_Context4],
    ZNode2[Tuple1_Context5, Tuple2_Context5],
    ZNode2[Tuple1_Context6, Tuple2_Context6],
    ZNode2[Tuple1_Context7, Tuple2_Context7],
    ZNode2[Tuple1_Context8, Tuple2_Context8]
  ] {
    override def application(context: T): F[
      ZNode2[Tuple1_Context1, Tuple2_Context1],
      ZNode2[Tuple1_Context2, Tuple2_Context2],
      ZNode2[Tuple1_Context3, Tuple2_Context3],
      ZNode2[Tuple1_Context4, Tuple2_Context4],
      ZNode2[Tuple1_Context5, Tuple2_Context5],
      ZNode2[Tuple1_Context6, Tuple2_Context6],
      ZNode2[Tuple1_Context7, Tuple2_Context7],
      ZNode2[Tuple1_Context8, Tuple2_Context8]
    ] = {
      context.append(t1.application(context), t2.application(context))(PlusInstanceTuple2.nodeContextNum8)
    }
  }
}
