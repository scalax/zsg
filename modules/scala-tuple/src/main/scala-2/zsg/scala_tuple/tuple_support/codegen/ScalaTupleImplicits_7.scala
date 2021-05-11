package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_7 {
         implicit def contextNum_1_7   [F[  _ ], T <: zsg.Context1[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
        ]
         ,   t2: F[
                 Tuple2_Context1
        ]
         ,   t3: F[
                 Tuple3_Context1
        ]
         ,   t4: F[
                 Tuple4_Context1
        ]
         ,   t5: F[
                 Tuple5_Context1
        ]
         ,   t6: F[
                 Tuple6_Context1
        ]
         ,   t7: F[
                 Tuple7_Context1
        ]
        ) :  zsg.ApplicationX1[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
]  = new  zsg.ApplicationX1[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum1)
            }
        }
         implicit def contextNum_2_7   [F[  _   ,  _ ], T <: zsg.Context2[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
        ]
        ) :  zsg.ApplicationX2[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
]  = new  zsg.ApplicationX2[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum2)
            }
        }
         implicit def contextNum_3_7   [F[  _   ,  _   ,  _ ], T <: zsg.Context3[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
        ]
        ) :  zsg.ApplicationX3[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
]  = new  zsg.ApplicationX3[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum3)
            }
        }
         implicit def contextNum_4_7   [F[  _   ,  _   ,  _   ,  _ ], T <: zsg.Context4[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
        ]
        ) :  zsg.ApplicationX4[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
]  = new  zsg.ApplicationX4[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum4)
            }
        }
         implicit def contextNum_5_7   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context5[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
        ]
        ) :  zsg.ApplicationX5[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
]  = new  zsg.ApplicationX5[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum5)
            }
        }
         implicit def contextNum_6_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context6[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
        ]
        ) :  zsg.ApplicationX6[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
]  = new  zsg.ApplicationX6[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum6)
            }
        }
         implicit def contextNum_7_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context7[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
        ]
        ) :  zsg.ApplicationX7[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
]  = new  zsg.ApplicationX7[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum7)
            }
        }
         implicit def contextNum_8_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context8[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
        ]
        ) :  zsg.ApplicationX8[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
]  = new  zsg.ApplicationX8[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum8)
            }
        }
         implicit def contextNum_9_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context9[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
        ]
        ) :  zsg.ApplicationX9[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
]  = new  zsg.ApplicationX9[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum9))(zsg.PlusInstanceZsgTuple2.contextNum9), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum9)
            }
        }
         implicit def contextNum_10_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context10[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
        ]
        ) :  zsg.ApplicationX10[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
]  = new  zsg.ApplicationX10[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum10))(zsg.PlusInstanceZsgTuple2.contextNum10), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum10)
            }
        }
         implicit def contextNum_11_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context11[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
        ]
        ) :  zsg.ApplicationX11[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
]  = new  zsg.ApplicationX11[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum11))(zsg.PlusInstanceZsgTuple2.contextNum11), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum11)
            }
        }
         implicit def contextNum_12_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context12[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
        ]
        ) :  zsg.ApplicationX12[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
]  = new  zsg.ApplicationX12[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum12))(zsg.PlusInstanceZsgTuple2.contextNum12), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum12)
            }
        }
         implicit def contextNum_13_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context13[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
        ]
        ) :  zsg.ApplicationX13[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
]  = new  zsg.ApplicationX13[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum13))(zsg.PlusInstanceZsgTuple2.contextNum13), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum13)
            }
        }
         implicit def contextNum_14_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context14[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
        ]
        ) :  zsg.ApplicationX14[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
]  = new  zsg.ApplicationX14[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum14))(zsg.PlusInstanceZsgTuple2.contextNum14), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum14)
            }
        }
         implicit def contextNum_15_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context15[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
        ]
        ) :  zsg.ApplicationX15[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
]  = new  zsg.ApplicationX15[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum15))(zsg.PlusInstanceZsgTuple2.contextNum15), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum15)
            }
        }
         implicit def contextNum_16_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context16[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
        ]
        ) :  zsg.ApplicationX16[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
]  = new  zsg.ApplicationX16[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum16))(zsg.PlusInstanceZsgTuple2.contextNum16), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum16)
            }
        }
         implicit def contextNum_17_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context17[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
        ]
        ) :  zsg.ApplicationX17[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
]  = new  zsg.ApplicationX17[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum17))(zsg.PlusInstanceZsgTuple2.contextNum17), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum17)
            }
        }
         implicit def contextNum_18_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context18[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
        ]
        ) :  zsg.ApplicationX18[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
]  = new  zsg.ApplicationX18[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
         ,  Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum18))(zsg.PlusInstanceZsgTuple2.contextNum18), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum18)
            }
        }
         implicit def contextNum_19_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context19[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
        ]
        ) :  zsg.ApplicationX19[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
]  = new  zsg.ApplicationX19[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
         ,  Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
         ,  Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum19))(zsg.PlusInstanceZsgTuple2.contextNum19), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum19)
            }
        }
         implicit def contextNum_20_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context20[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
        ]
        ) :  zsg.ApplicationX20[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
]  = new  zsg.ApplicationX20[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
         ,  Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
         ,  Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
         ,  Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum20))(zsg.PlusInstanceZsgTuple2.contextNum20), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum20)
            }
        }
         implicit def contextNum_21_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context21[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20 
         , Tuple1_Context21  , Tuple2_Context21  , Tuple3_Context21  , Tuple4_Context21  , Tuple5_Context21  , Tuple6_Context21  , Tuple7_Context21 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
                 ,  Tuple1_Context21
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
                 ,  Tuple2_Context21
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
                 ,  Tuple3_Context21
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
                 ,  Tuple4_Context21
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
                 ,  Tuple5_Context21
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
                 ,  Tuple6_Context21
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
                 ,  Tuple7_Context21
        ]
        ) :  zsg.ApplicationX21[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
        , Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
]  = new  zsg.ApplicationX21[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
        , Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
         ,  Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
         ,  Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
         ,  Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
         ,  Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum21))(zsg.PlusInstanceZsgTuple2.contextNum21), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum21)
            }
        }
         implicit def contextNum_22_7   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context22[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8 
         , Tuple1_Context9  , Tuple2_Context9  , Tuple3_Context9  , Tuple4_Context9  , Tuple5_Context9  , Tuple6_Context9  , Tuple7_Context9 
         , Tuple1_Context10  , Tuple2_Context10  , Tuple3_Context10  , Tuple4_Context10  , Tuple5_Context10  , Tuple6_Context10  , Tuple7_Context10 
         , Tuple1_Context11  , Tuple2_Context11  , Tuple3_Context11  , Tuple4_Context11  , Tuple5_Context11  , Tuple6_Context11  , Tuple7_Context11 
         , Tuple1_Context12  , Tuple2_Context12  , Tuple3_Context12  , Tuple4_Context12  , Tuple5_Context12  , Tuple6_Context12  , Tuple7_Context12 
         , Tuple1_Context13  , Tuple2_Context13  , Tuple3_Context13  , Tuple4_Context13  , Tuple5_Context13  , Tuple6_Context13  , Tuple7_Context13 
         , Tuple1_Context14  , Tuple2_Context14  , Tuple3_Context14  , Tuple4_Context14  , Tuple5_Context14  , Tuple6_Context14  , Tuple7_Context14 
         , Tuple1_Context15  , Tuple2_Context15  , Tuple3_Context15  , Tuple4_Context15  , Tuple5_Context15  , Tuple6_Context15  , Tuple7_Context15 
         , Tuple1_Context16  , Tuple2_Context16  , Tuple3_Context16  , Tuple4_Context16  , Tuple5_Context16  , Tuple6_Context16  , Tuple7_Context16 
         , Tuple1_Context17  , Tuple2_Context17  , Tuple3_Context17  , Tuple4_Context17  , Tuple5_Context17  , Tuple6_Context17  , Tuple7_Context17 
         , Tuple1_Context18  , Tuple2_Context18  , Tuple3_Context18  , Tuple4_Context18  , Tuple5_Context18  , Tuple6_Context18  , Tuple7_Context18 
         , Tuple1_Context19  , Tuple2_Context19  , Tuple3_Context19  , Tuple4_Context19  , Tuple5_Context19  , Tuple6_Context19  , Tuple7_Context19 
         , Tuple1_Context20  , Tuple2_Context20  , Tuple3_Context20  , Tuple4_Context20  , Tuple5_Context20  , Tuple6_Context20  , Tuple7_Context20 
         , Tuple1_Context21  , Tuple2_Context21  , Tuple3_Context21  , Tuple4_Context21  , Tuple5_Context21  , Tuple6_Context21  , Tuple7_Context21 
         , Tuple1_Context22  , Tuple2_Context22  , Tuple3_Context22  , Tuple4_Context22  , Tuple5_Context22  , Tuple6_Context22  , Tuple7_Context22 
]   (
             implicit  
          t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
                 ,  Tuple1_Context9
                 ,  Tuple1_Context10
                 ,  Tuple1_Context11
                 ,  Tuple1_Context12
                 ,  Tuple1_Context13
                 ,  Tuple1_Context14
                 ,  Tuple1_Context15
                 ,  Tuple1_Context16
                 ,  Tuple1_Context17
                 ,  Tuple1_Context18
                 ,  Tuple1_Context19
                 ,  Tuple1_Context20
                 ,  Tuple1_Context21
                 ,  Tuple1_Context22
        ]
         ,   t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
                 ,  Tuple2_Context9
                 ,  Tuple2_Context10
                 ,  Tuple2_Context11
                 ,  Tuple2_Context12
                 ,  Tuple2_Context13
                 ,  Tuple2_Context14
                 ,  Tuple2_Context15
                 ,  Tuple2_Context16
                 ,  Tuple2_Context17
                 ,  Tuple2_Context18
                 ,  Tuple2_Context19
                 ,  Tuple2_Context20
                 ,  Tuple2_Context21
                 ,  Tuple2_Context22
        ]
         ,   t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
                 ,  Tuple3_Context9
                 ,  Tuple3_Context10
                 ,  Tuple3_Context11
                 ,  Tuple3_Context12
                 ,  Tuple3_Context13
                 ,  Tuple3_Context14
                 ,  Tuple3_Context15
                 ,  Tuple3_Context16
                 ,  Tuple3_Context17
                 ,  Tuple3_Context18
                 ,  Tuple3_Context19
                 ,  Tuple3_Context20
                 ,  Tuple3_Context21
                 ,  Tuple3_Context22
        ]
         ,   t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
                 ,  Tuple4_Context9
                 ,  Tuple4_Context10
                 ,  Tuple4_Context11
                 ,  Tuple4_Context12
                 ,  Tuple4_Context13
                 ,  Tuple4_Context14
                 ,  Tuple4_Context15
                 ,  Tuple4_Context16
                 ,  Tuple4_Context17
                 ,  Tuple4_Context18
                 ,  Tuple4_Context19
                 ,  Tuple4_Context20
                 ,  Tuple4_Context21
                 ,  Tuple4_Context22
        ]
         ,   t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
                 ,  Tuple5_Context9
                 ,  Tuple5_Context10
                 ,  Tuple5_Context11
                 ,  Tuple5_Context12
                 ,  Tuple5_Context13
                 ,  Tuple5_Context14
                 ,  Tuple5_Context15
                 ,  Tuple5_Context16
                 ,  Tuple5_Context17
                 ,  Tuple5_Context18
                 ,  Tuple5_Context19
                 ,  Tuple5_Context20
                 ,  Tuple5_Context21
                 ,  Tuple5_Context22
        ]
         ,   t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
                 ,  Tuple6_Context9
                 ,  Tuple6_Context10
                 ,  Tuple6_Context11
                 ,  Tuple6_Context12
                 ,  Tuple6_Context13
                 ,  Tuple6_Context14
                 ,  Tuple6_Context15
                 ,  Tuple6_Context16
                 ,  Tuple6_Context17
                 ,  Tuple6_Context18
                 ,  Tuple6_Context19
                 ,  Tuple6_Context20
                 ,  Tuple6_Context21
                 ,  Tuple6_Context22
        ]
         ,   t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
                 ,  Tuple7_Context9
                 ,  Tuple7_Context10
                 ,  Tuple7_Context11
                 ,  Tuple7_Context12
                 ,  Tuple7_Context13
                 ,  Tuple7_Context14
                 ,  Tuple7_Context15
                 ,  Tuple7_Context16
                 ,  Tuple7_Context17
                 ,  Tuple7_Context18
                 ,  Tuple7_Context19
                 ,  Tuple7_Context20
                 ,  Tuple7_Context21
                 ,  Tuple7_Context22
        ]
        ) :  zsg.ApplicationX22[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
        , Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
        , Tuple7[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22 ]
]  = new  zsg.ApplicationX22[F, T
        , Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
        , Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
        , Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
        , Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
        , Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
        , Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
        , Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
        , Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
        , Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
        , Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
        , Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
        , Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
        , Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
        , Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
        , Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
        , Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
        , Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
        , Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
        , Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
        , Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
        , Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
        , Tuple7[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22 ]
]   {
            override def application(context: T):  F[
         Tuple7[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1 ]
         ,  Tuple7[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2 ]
         ,  Tuple7[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3 ]
         ,  Tuple7[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4 ]
         ,  Tuple7[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5 ]
         ,  Tuple7[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6 ]
         ,  Tuple7[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7 ]
         ,  Tuple7[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8 ]
         ,  Tuple7[  Tuple1_Context9   ,  Tuple2_Context9   ,  Tuple3_Context9   ,  Tuple4_Context9   ,  Tuple5_Context9   ,  Tuple6_Context9   ,  Tuple7_Context9 ]
         ,  Tuple7[  Tuple1_Context10   ,  Tuple2_Context10   ,  Tuple3_Context10   ,  Tuple4_Context10   ,  Tuple5_Context10   ,  Tuple6_Context10   ,  Tuple7_Context10 ]
         ,  Tuple7[  Tuple1_Context11   ,  Tuple2_Context11   ,  Tuple3_Context11   ,  Tuple4_Context11   ,  Tuple5_Context11   ,  Tuple6_Context11   ,  Tuple7_Context11 ]
         ,  Tuple7[  Tuple1_Context12   ,  Tuple2_Context12   ,  Tuple3_Context12   ,  Tuple4_Context12   ,  Tuple5_Context12   ,  Tuple6_Context12   ,  Tuple7_Context12 ]
         ,  Tuple7[  Tuple1_Context13   ,  Tuple2_Context13   ,  Tuple3_Context13   ,  Tuple4_Context13   ,  Tuple5_Context13   ,  Tuple6_Context13   ,  Tuple7_Context13 ]
         ,  Tuple7[  Tuple1_Context14   ,  Tuple2_Context14   ,  Tuple3_Context14   ,  Tuple4_Context14   ,  Tuple5_Context14   ,  Tuple6_Context14   ,  Tuple7_Context14 ]
         ,  Tuple7[  Tuple1_Context15   ,  Tuple2_Context15   ,  Tuple3_Context15   ,  Tuple4_Context15   ,  Tuple5_Context15   ,  Tuple6_Context15   ,  Tuple7_Context15 ]
         ,  Tuple7[  Tuple1_Context16   ,  Tuple2_Context16   ,  Tuple3_Context16   ,  Tuple4_Context16   ,  Tuple5_Context16   ,  Tuple6_Context16   ,  Tuple7_Context16 ]
         ,  Tuple7[  Tuple1_Context17   ,  Tuple2_Context17   ,  Tuple3_Context17   ,  Tuple4_Context17   ,  Tuple5_Context17   ,  Tuple6_Context17   ,  Tuple7_Context17 ]
         ,  Tuple7[  Tuple1_Context18   ,  Tuple2_Context18   ,  Tuple3_Context18   ,  Tuple4_Context18   ,  Tuple5_Context18   ,  Tuple6_Context18   ,  Tuple7_Context18 ]
         ,  Tuple7[  Tuple1_Context19   ,  Tuple2_Context19   ,  Tuple3_Context19   ,  Tuple4_Context19   ,  Tuple5_Context19   ,  Tuple6_Context19   ,  Tuple7_Context19 ]
         ,  Tuple7[  Tuple1_Context20   ,  Tuple2_Context20   ,  Tuple3_Context20   ,  Tuple4_Context20   ,  Tuple5_Context20   ,  Tuple6_Context20   ,  Tuple7_Context20 ]
         ,  Tuple7[  Tuple1_Context21   ,  Tuple2_Context21   ,  Tuple3_Context21   ,  Tuple4_Context21   ,  Tuple5_Context21   ,  Tuple6_Context21   ,  Tuple7_Context21 ]
         ,  Tuple7[  Tuple1_Context22   ,  Tuple2_Context22   ,  Tuple3_Context22   ,  Tuple4_Context22   ,  Tuple5_Context22   ,  Tuple6_Context22   ,  Tuple7_Context22 ]
]  = {
                context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22), context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum22))(zsg.PlusInstanceZsgTuple2.contextNum22), t7)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_7.contextNum22)
            }
        }
}
