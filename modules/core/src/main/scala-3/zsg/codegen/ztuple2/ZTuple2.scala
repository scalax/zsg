package zsg
import scala.language.higherKinds
class ZTuple2[  I1   ,  I2 ](  val i1: I1   ,  val i2: I2 ) extends zsg.TupleTag
object ZTuple2 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1  , Tuple2_Context1 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
        ]
            ) :  ApplicationX1[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]  = new  ApplicationX1[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
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
            ) :  ApplicationX2[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]  = new  ApplicationX2[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
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
            ) :  ApplicationX3[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]  = new  ApplicationX3[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
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
            ) :  ApplicationX4[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]  = new  ApplicationX4[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
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
            ) :  ApplicationX5[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]  = new  ApplicationX5[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
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
            ) :  ApplicationX6[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]  = new  ApplicationX6[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
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
            ) :  ApplicationX7[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]  = new  ApplicationX7[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
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
            ) :  ApplicationX8[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , ZTuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]  = new  ApplicationX8[F, T
        , ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
        , ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
        , ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
        , ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
        , ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
        , ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
        , ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
        , ZTuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]   {
                override def application(context: T):  F[
         ZTuple2[  Tuple1_Context1   ,  Tuple2_Context1 ]
         ,  ZTuple2[  Tuple1_Context2   ,  Tuple2_Context2 ]
         ,  ZTuple2[  Tuple1_Context3   ,  Tuple2_Context3 ]
         ,  ZTuple2[  Tuple1_Context4   ,  Tuple2_Context4 ]
         ,  ZTuple2[  Tuple1_Context5   ,  Tuple2_Context5 ]
         ,  ZTuple2[  Tuple1_Context6   ,  Tuple2_Context6 ]
         ,  ZTuple2[  Tuple1_Context7   ,  Tuple2_Context7 ]
         ,  ZTuple2[  Tuple1_Context8   ,  Tuple2_Context8 ]
]  = {
                    context.append(t1, t2)(PlusInstanceTuple2.contextNum8)
                }
            }
}
