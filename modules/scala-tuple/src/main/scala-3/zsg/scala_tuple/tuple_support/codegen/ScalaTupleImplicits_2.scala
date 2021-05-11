package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_2 {
         inline given   [F[  _ ], T <: zsg.Context1[F]
         , Tuple1_Context1  , Tuple2_Context1 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
        ]
        ) :  zsg.ApplicationX1[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]  = new  zsg.ApplicationX1[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum1)
            }
        }
         inline given   [F[  _   ,  _ ], T <: zsg.Context2[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
        ]
        ) :  zsg.ApplicationX2[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]  = new  zsg.ApplicationX2[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum2)
            }
        }
         inline given   [F[  _   ,  _   ,  _ ], T <: zsg.Context3[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
        ]
        ) :  zsg.ApplicationX3[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]  = new  zsg.ApplicationX3[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum3)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: zsg.Context4[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
        ]
        ) :  zsg.ApplicationX4[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]  = new  zsg.ApplicationX4[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum4)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context5[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
        ]
        ) :  zsg.ApplicationX5[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]  = new  zsg.ApplicationX5[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum5)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context6[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
        ]
        ) :  zsg.ApplicationX6[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]  = new  zsg.ApplicationX6[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum6)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context7[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
        ]
        ) :  zsg.ApplicationX7[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]  = new  zsg.ApplicationX7[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum7)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context8[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
]   (
             using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
        ]
        ) :  zsg.ApplicationX8[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]  = new  zsg.ApplicationX8[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum8)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context9[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX9[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
]  = new  zsg.ApplicationX9[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum9)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context10[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX10[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
]  = new  zsg.ApplicationX10[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum10)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context11[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX11[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
]  = new  zsg.ApplicationX11[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum11)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context12[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX12[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
]  = new  zsg.ApplicationX12[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum12)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context13[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX13[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
]  = new  zsg.ApplicationX13[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum13)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context14[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX14[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
]  = new  zsg.ApplicationX14[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum14)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context15[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX15[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
]  = new  zsg.ApplicationX15[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum15)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context16[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX16[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
]  = new  zsg.ApplicationX16[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum16)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context17[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX17[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
]  = new  zsg.ApplicationX17[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum17)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context18[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
         , Tuple1_Context18  , Tuple2_Context18 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX18[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
]  = new  zsg.ApplicationX18[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
         ,  Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum18)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context19[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
         , Tuple1_Context18  , Tuple2_Context18 
         , Tuple1_Context19  , Tuple2_Context19 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX19[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
]  = new  zsg.ApplicationX19[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
         ,  Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
         ,  Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum19)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context20[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
         , Tuple1_Context18  , Tuple2_Context18 
         , Tuple1_Context19  , Tuple2_Context19 
         , Tuple1_Context20  , Tuple2_Context20 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX20[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
]  = new  zsg.ApplicationX20[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
         ,  Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
         ,  Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
         ,  Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum20)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context21[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
         , Tuple1_Context18  , Tuple2_Context18 
         , Tuple1_Context19  , Tuple2_Context19 
         , Tuple1_Context20  , Tuple2_Context20 
         , Tuple1_Context21  , Tuple2_Context21 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX21[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
        , Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
]  = new  zsg.ApplicationX21[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
        , Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
         ,  Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
         ,  Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
         ,  Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
         ,  Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum21)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context22[F]
         , Tuple1_Context1  , Tuple2_Context1 
         , Tuple1_Context2  , Tuple2_Context2 
         , Tuple1_Context3  , Tuple2_Context3 
         , Tuple1_Context4  , Tuple2_Context4 
         , Tuple1_Context5  , Tuple2_Context5 
         , Tuple1_Context6  , Tuple2_Context6 
         , Tuple1_Context7  , Tuple2_Context7 
         , Tuple1_Context8  , Tuple2_Context8 
         , Tuple1_Context9  , Tuple2_Context9 
         , Tuple1_Context10  , Tuple2_Context10 
         , Tuple1_Context11  , Tuple2_Context11 
         , Tuple1_Context12  , Tuple2_Context12 
         , Tuple1_Context13  , Tuple2_Context13 
         , Tuple1_Context14  , Tuple2_Context14 
         , Tuple1_Context15  , Tuple2_Context15 
         , Tuple1_Context16  , Tuple2_Context16 
         , Tuple1_Context17  , Tuple2_Context17 
         , Tuple1_Context18  , Tuple2_Context18 
         , Tuple1_Context19  , Tuple2_Context19 
         , Tuple1_Context20  , Tuple2_Context20 
         , Tuple1_Context21  , Tuple2_Context21 
         , Tuple1_Context22  , Tuple2_Context22 
]   (
             using  
          inline  t1: F[
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
         ,   inline  t2: F[
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
        ) :  zsg.ApplicationX22[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
        , Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
        , Tuple2[  Tuple1_Context22   ,  Tuple2_Context22 ]
]  = new  zsg.ApplicationX22[F, T
        , Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
        , Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
        , Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
        , Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
        , Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
        , Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
        , Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
        , Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
        , Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
        , Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
        , Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
        , Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
        , Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
        , Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
        , Tuple2[  Tuple1_Context22   ,  Tuple2_Context22 ]
]   {
            override def application(context: T):  F[
         Tuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  Tuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  Tuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  Tuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  Tuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  Tuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  Tuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  Tuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
         ,  Tuple2[  Tuple1_Context9   ,  Tuple2_Context9 ]
         ,  Tuple2[  Tuple1_Context10   ,  Tuple2_Context10 ]
         ,  Tuple2[  Tuple1_Context11   ,  Tuple2_Context11 ]
         ,  Tuple2[  Tuple1_Context12   ,  Tuple2_Context12 ]
         ,  Tuple2[  Tuple1_Context13   ,  Tuple2_Context13 ]
         ,  Tuple2[  Tuple1_Context14   ,  Tuple2_Context14 ]
         ,  Tuple2[  Tuple1_Context15   ,  Tuple2_Context15 ]
         ,  Tuple2[  Tuple1_Context16   ,  Tuple2_Context16 ]
         ,  Tuple2[  Tuple1_Context17   ,  Tuple2_Context17 ]
         ,  Tuple2[  Tuple1_Context18   ,  Tuple2_Context18 ]
         ,  Tuple2[  Tuple1_Context19   ,  Tuple2_Context19 ]
         ,  Tuple2[  Tuple1_Context20   ,  Tuple2_Context20 ]
         ,  Tuple2[  Tuple1_Context21   ,  Tuple2_Context21 ]
         ,  Tuple2[  Tuple1_Context22   ,  Tuple2_Context22 ]
]  = {
                context.append(t1, t2)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_2.contextNum22)
            }
        }
}
