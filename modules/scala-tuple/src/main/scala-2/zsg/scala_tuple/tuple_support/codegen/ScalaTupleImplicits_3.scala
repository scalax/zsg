package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_3 {
  implicit def contextNum_1_3[F[_], T <: zsg.Context1[F], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1](implicit
    t1: F[
      Tuple1_Context1
    ],
    t2: F[
      Tuple2_Context1
    ],
    t3: F[
      Tuple3_Context1
    ]
  ): zsg.ApplicationX1[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1]] =
    new zsg.ApplicationX1[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1]] {
      override def application(context: T): F[
        Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1]
      ] = {
        context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum1)
      }
    }
  implicit def contextNum_2_3[F[_, _], T <: zsg.Context2[F], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2
    ]
  ): zsg.ApplicationX2[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2]] =
    new zsg.ApplicationX2[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2]] {
      override def application(context: T): F[
        Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
        Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2]
      ] = {
        context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum2)
      }
    }
  implicit def contextNum_3_3[F[_, _, _], T <: zsg.Context3[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3](implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3
    ]
  ): zsg.ApplicationX3[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ]] = new zsg.ApplicationX3[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ]] {
    override def application(context: T): F[
      Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
      Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
      Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3]
    ] = {
      context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum3)
    }
  }
  implicit def contextNum_4_3[F[_, _, _, _], T <: zsg.Context4[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4
    ]
  ): zsg.ApplicationX4[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4]] = new zsg.ApplicationX4[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2
  ], Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4]] {
    override def application(context: T): F[
      Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
      Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
      Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3],
      Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4]
    ] = {
      context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum4)
    }
  }
  implicit def contextNum_5_3[F[_, _, _, _, _], T <: zsg.Context5[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5
    ]
  ): zsg.ApplicationX5[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5]] =
    new zsg.ApplicationX5[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3
    ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5]] {
      override def application(context: T): F[
        Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
        Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
        Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3],
        Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4],
        Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5]
      ] = {
        context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum5)
      }
    }
  implicit def contextNum_6_3[F[_, _, _, _, _, _], T <: zsg.Context6[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6
    ]
  ): zsg.ApplicationX6[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5], Tuple3[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6
  ]] = new zsg.ApplicationX6[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5], Tuple3[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6
  ]] {
    override def application(context: T): F[
      Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
      Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
      Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3],
      Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4],
      Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5],
      Tuple3[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6]
    ] = {
      context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum6)
    }
  }
  implicit def contextNum_7_3[F[_, _, _, _, _, _, _], T <: zsg.Context7[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6,
      Tuple2_Context7
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6,
      Tuple3_Context7
    ]
  ): zsg.ApplicationX7[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5], Tuple3[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6
  ], Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7]] = new zsg.ApplicationX7[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2
  ], Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5
  ], Tuple3[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6], Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7]] {
    override def application(context: T): F[
      Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
      Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
      Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3],
      Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4],
      Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5],
      Tuple3[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6],
      Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7]
    ] = {
      context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum7)
    }
  }
  implicit def contextNum_8_3[F[_, _, _, _, _, _, _, _], T <: zsg.Context8[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple1_Context8, Tuple2_Context8, Tuple3_Context8](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7,
      Tuple1_Context8
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6,
      Tuple2_Context7,
      Tuple2_Context8
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6,
      Tuple3_Context7,
      Tuple3_Context8
    ]
  ): zsg.ApplicationX8[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3
  ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5], Tuple3[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6
  ], Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7], Tuple3[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8]] =
    new zsg.ApplicationX8[F, T, Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1], Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2], Tuple3[
      Tuple1_Context3,
      Tuple2_Context3,
      Tuple3_Context3
    ], Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4], Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5], Tuple3[
      Tuple1_Context6,
      Tuple2_Context6,
      Tuple3_Context6
    ], Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7], Tuple3[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8]] {
      override def application(context: T): F[
        Tuple3[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1],
        Tuple3[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2],
        Tuple3[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3],
        Tuple3[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4],
        Tuple3[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5],
        Tuple3[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6],
        Tuple3[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7],
        Tuple3[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8]
      ] = {
        context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), t3)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_3.contextNum8)
      }
    }
}
