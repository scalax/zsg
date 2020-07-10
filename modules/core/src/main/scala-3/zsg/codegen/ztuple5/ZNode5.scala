package zsg
import scala.language.higherKinds
class ZNode5[  I1 <: zsg.TupleTag   ,  I2 <: zsg.TupleTag   ,  I3 <: zsg.TupleTag   ,  I4 <: zsg.TupleTag   ,  I5 <: zsg.TupleTag ](  val i1: I1   ,  val i2: I2   ,  val i3: I3   ,  val i4: I4   ,  val i5: I5 ) extends zsg.TupleTag
object ZNode5 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX1[F, T
                , Tuple1_Context1
        ]
         ,   inline  t2: ApplicationX1[F, T
                , Tuple2_Context1
        ]
         ,   inline  t3: ApplicationX1[F, T
                , Tuple3_Context1
        ]
         ,   inline  t4: ApplicationX1[F, T
                , Tuple4_Context1
        ]
         ,   inline  t5: ApplicationX1[F, T
                , Tuple5_Context1
        ]
            )  as   ApplicationX1[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
]  = new  ApplicationX1[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum1), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum1))(PlusInstanceZsgTuple2.contextNum1), t5.application(context))(PlusInstanceTuple5.nodeContextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX2[F, T
                , Tuple1_Context1
                , Tuple1_Context2
        ]
         ,   inline  t2: ApplicationX2[F, T
                , Tuple2_Context1
                , Tuple2_Context2
        ]
         ,   inline  t3: ApplicationX2[F, T
                , Tuple3_Context1
                , Tuple3_Context2
        ]
         ,   inline  t4: ApplicationX2[F, T
                , Tuple4_Context1
                , Tuple4_Context2
        ]
         ,   inline  t5: ApplicationX2[F, T
                , Tuple5_Context1
                , Tuple5_Context2
        ]
            )  as   ApplicationX2[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
]  = new  ApplicationX2[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum2), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum2))(PlusInstanceZsgTuple2.contextNum2), t5.application(context))(PlusInstanceTuple5.nodeContextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX3[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
        ]
         ,   inline  t2: ApplicationX3[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
        ]
         ,   inline  t3: ApplicationX3[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
        ]
         ,   inline  t4: ApplicationX3[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
        ]
         ,   inline  t5: ApplicationX3[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
        ]
            )  as   ApplicationX3[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
]  = new  ApplicationX3[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum3), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum3))(PlusInstanceZsgTuple2.contextNum3), t5.application(context))(PlusInstanceTuple5.nodeContextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX4[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
        ]
         ,   inline  t2: ApplicationX4[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
        ]
         ,   inline  t3: ApplicationX4[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
        ]
         ,   inline  t4: ApplicationX4[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
        ]
         ,   inline  t5: ApplicationX4[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
        ]
            )  as   ApplicationX4[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
]  = new  ApplicationX4[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
         ,  ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum4), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum4))(PlusInstanceZsgTuple2.contextNum4), t5.application(context))(PlusInstanceTuple5.nodeContextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX5[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
        ]
         ,   inline  t2: ApplicationX5[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
        ]
         ,   inline  t3: ApplicationX5[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
        ]
         ,   inline  t4: ApplicationX5[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
        ]
         ,   inline  t5: ApplicationX5[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
        ]
            )  as   ApplicationX5[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
]  = new  ApplicationX5[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
         ,  ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
         ,  ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum5), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum5))(PlusInstanceZsgTuple2.contextNum5), t5.application(context))(PlusInstanceTuple5.nodeContextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX6[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
        ]
         ,   inline  t2: ApplicationX6[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
        ]
         ,   inline  t3: ApplicationX6[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
        ]
         ,   inline  t4: ApplicationX6[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
        ]
         ,   inline  t5: ApplicationX6[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
        ]
            )  as   ApplicationX6[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
]  = new  ApplicationX6[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
         ,  ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
         ,  ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
         ,  ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum6), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum6))(PlusInstanceZsgTuple2.contextNum6), t5.application(context))(PlusInstanceTuple5.nodeContextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag  , Tuple4_Context7 <: TupleTag  , Tuple5_Context7 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX7[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
        ]
         ,   inline  t2: ApplicationX7[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
        ]
         ,   inline  t3: ApplicationX7[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
        ]
         ,   inline  t4: ApplicationX7[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
                , Tuple4_Context7
        ]
         ,   inline  t5: ApplicationX7[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
                , Tuple5_Context7
        ]
            )  as   ApplicationX7[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
        , ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
]  = new  ApplicationX7[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
        , ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
         ,  ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
         ,  ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
         ,  ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
         ,  ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum7), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum7))(PlusInstanceZsgTuple2.contextNum7), t5.application(context))(PlusInstanceTuple5.nodeContextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag  , Tuple4_Context1 <: TupleTag  , Tuple5_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag  , Tuple4_Context2 <: TupleTag  , Tuple5_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag  , Tuple4_Context3 <: TupleTag  , Tuple5_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag  , Tuple4_Context4 <: TupleTag  , Tuple5_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag  , Tuple4_Context5 <: TupleTag  , Tuple5_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag  , Tuple4_Context6 <: TupleTag  , Tuple5_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag  , Tuple4_Context7 <: TupleTag  , Tuple5_Context7 <: TupleTag 
         , Tuple1_Context8 <: TupleTag  , Tuple2_Context8 <: TupleTag  , Tuple3_Context8 <: TupleTag  , Tuple4_Context8 <: TupleTag  , Tuple5_Context8 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX8[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
                , Tuple1_Context8
        ]
         ,   inline  t2: ApplicationX8[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
                , Tuple2_Context8
        ]
         ,   inline  t3: ApplicationX8[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
                , Tuple3_Context8
        ]
         ,   inline  t4: ApplicationX8[F, T
                , Tuple4_Context1
                , Tuple4_Context2
                , Tuple4_Context3
                , Tuple4_Context4
                , Tuple4_Context5
                , Tuple4_Context6
                , Tuple4_Context7
                , Tuple4_Context8
        ]
         ,   inline  t5: ApplicationX8[F, T
                , Tuple5_Context1
                , Tuple5_Context2
                , Tuple5_Context3
                , Tuple5_Context4
                , Tuple5_Context5
                , Tuple5_Context6
                , Tuple5_Context7
                , Tuple5_Context8
        ]
            )  as   ApplicationX8[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
        , ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
        , ZNode5[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8 ]
]  = new  ApplicationX8[F, T
        , ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
        , ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
        , ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
        , ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
        , ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
        , ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
        , ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
        , ZNode5[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8 ]
]   {
                override def application(context: T):  F[
         ZNode5[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1 ]
         ,  ZNode5[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2 ]
         ,  ZNode5[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3 ]
         ,  ZNode5[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4 ]
         ,  ZNode5[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5 ]
         ,  ZNode5[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6 ]
         ,  ZNode5[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7 ]
         ,  ZNode5[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8 ]
]  = {
                    context.append(context.append(context.append(t1.application(context), t2.application(context))(PlusInstanceZsgTuple2.contextNum8), context.append(t3.application(context), t4.application(context))(PlusInstanceZsgTuple2.contextNum8))(PlusInstanceZsgTuple2.contextNum8), t5.application(context))(PlusInstanceTuple5.nodeContextNum8)
                }
            }
}
