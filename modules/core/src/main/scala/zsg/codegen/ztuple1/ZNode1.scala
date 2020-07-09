package zsg
import scala.language.higherKinds
class ZNode1[  I1 <: zsg.TupleTag ](  val i1: I1 ) extends zsg.TupleTag
object ZNode1 {
            implicit def context1Implicit [F[  _ ], T <: Context1[F]
         , Tuple1_Context1 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX1[F, T
                , Tuple1_Context1
        ]
):  ApplicationX1[F, T
        , ZNode1[  Tuple1_Context1 ]
]  = new  ApplicationX1[F, T
        , ZNode1[  Tuple1_Context1 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum1)
                }
            }
            implicit def context2Implicit [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX2[F, T
                , Tuple1_Context1
                , Tuple1_Context2
        ]
):  ApplicationX2[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
]  = new  ApplicationX2[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum2)
                }
            }
            implicit def context3Implicit [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX3[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
        ]
):  ApplicationX3[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
]  = new  ApplicationX3[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum3)
                }
            }
            implicit def context4Implicit [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX4[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
        ]
):  ApplicationX4[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
]  = new  ApplicationX4[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
         ,  ZNode1[  Tuple1_Context4 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum4)
                }
            }
            implicit def context5Implicit [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX5[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
        ]
):  ApplicationX5[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
]  = new  ApplicationX5[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
         ,  ZNode1[  Tuple1_Context4 ]
         ,  ZNode1[  Tuple1_Context5 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum5)
                }
            }
            implicit def context6Implicit [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX6[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
        ]
):  ApplicationX6[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
]  = new  ApplicationX6[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
         ,  ZNode1[  Tuple1_Context4 ]
         ,  ZNode1[  Tuple1_Context5 ]
         ,  ZNode1[  Tuple1_Context6 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum6)
                }
            }
            implicit def context7Implicit [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX7[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
        ]
):  ApplicationX7[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
        , ZNode1[  Tuple1_Context7 ]
]  = new  ApplicationX7[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
        , ZNode1[  Tuple1_Context7 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
         ,  ZNode1[  Tuple1_Context4 ]
         ,  ZNode1[  Tuple1_Context5 ]
         ,  ZNode1[  Tuple1_Context6 ]
         ,  ZNode1[  Tuple1_Context7 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum7)
                }
            }
            implicit def context8Implicit [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag 
         , Tuple1_Context8 <: TupleTag 
] 
            (implicit 
         t1: ApplicationX8[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
                , Tuple1_Context8
        ]
):  ApplicationX8[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
        , ZNode1[  Tuple1_Context7 ]
        , ZNode1[  Tuple1_Context8 ]
]  = new  ApplicationX8[F, T
        , ZNode1[  Tuple1_Context1 ]
        , ZNode1[  Tuple1_Context2 ]
        , ZNode1[  Tuple1_Context3 ]
        , ZNode1[  Tuple1_Context4 ]
        , ZNode1[  Tuple1_Context5 ]
        , ZNode1[  Tuple1_Context6 ]
        , ZNode1[  Tuple1_Context7 ]
        , ZNode1[  Tuple1_Context8 ]
]   {
                override def application(context: T):  F[
         ZNode1[  Tuple1_Context1 ]
         ,  ZNode1[  Tuple1_Context2 ]
         ,  ZNode1[  Tuple1_Context3 ]
         ,  ZNode1[  Tuple1_Context4 ]
         ,  ZNode1[  Tuple1_Context5 ]
         ,  ZNode1[  Tuple1_Context6 ]
         ,  ZNode1[  Tuple1_Context7 ]
         ,  ZNode1[  Tuple1_Context8 ]
]  = {
                    context.append(context.start, t1.application(context))(PlusInstanceTuple1.nodeContextNum8)
                }
            }
}
