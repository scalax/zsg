package zsg
import scala.language.higherKinds
class ZTuple20[  I1   ,  I2   ,  I3   ,  I4   ,  I5   ,  I6   ,  I7   ,  I8   ,  I9   ,  I10   ,  I11   ,  I12   ,  I13   ,  I14   ,  I15   ,  I16   ,  I17   ,  I18   ,  I19   ,  I20 ](  val i1: I1   ,  val i2: I2   ,  val i3: I3   ,  val i4: I4   ,  val i5: I5   ,  val i6: I6   ,  val i7: I7   ,  val i8: I8   ,  val i9: I9   ,  val i10: I10   ,  val i11: I11   ,  val i12: I12   ,  val i13: I13   ,  val i14: I14   ,  val i15: I15   ,  val i16: I16   ,  val i17: I17   ,  val i18: I18   ,  val i19: I19   ,  val i20: I20 ) extends zsg.TupleTag
object ZTuple20 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
        ]
            )  as   ApplicationX1[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
]  = new  ApplicationX1[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum1), t19)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), t20)(PlusInstanceTuple20.contextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
        ]
            )  as   ApplicationX2[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
]  = new  ApplicationX2[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum2), t19)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), t20)(PlusInstanceTuple20.contextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
        ]
            )  as   ApplicationX3[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
]  = new  ApplicationX3[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum3), t19)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), t20)(PlusInstanceTuple20.contextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4  , Tuple18_Context4  , Tuple19_Context4  , Tuple20_Context4 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
                 ,  Tuple18_Context4
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
                 ,  Tuple19_Context4
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
                 ,  Tuple20_Context4
        ]
            )  as   ApplicationX4[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
]  = new  ApplicationX4[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
         ,  ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum4), t19)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), t20)(PlusInstanceTuple20.contextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4  , Tuple18_Context4  , Tuple19_Context4  , Tuple20_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5  , Tuple18_Context5  , Tuple19_Context5  , Tuple20_Context5 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
                 ,  Tuple18_Context4
                 ,  Tuple18_Context5
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
                 ,  Tuple19_Context4
                 ,  Tuple19_Context5
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
                 ,  Tuple20_Context4
                 ,  Tuple20_Context5
        ]
            )  as   ApplicationX5[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
]  = new  ApplicationX5[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
         ,  ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
         ,  ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum5), t19)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), t20)(PlusInstanceTuple20.contextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4  , Tuple18_Context4  , Tuple19_Context4  , Tuple20_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5  , Tuple18_Context5  , Tuple19_Context5  , Tuple20_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6  , Tuple18_Context6  , Tuple19_Context6  , Tuple20_Context6 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
                 ,  Tuple18_Context4
                 ,  Tuple18_Context5
                 ,  Tuple18_Context6
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
                 ,  Tuple19_Context4
                 ,  Tuple19_Context5
                 ,  Tuple19_Context6
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
                 ,  Tuple20_Context4
                 ,  Tuple20_Context5
                 ,  Tuple20_Context6
        ]
            )  as   ApplicationX6[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
]  = new  ApplicationX6[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
         ,  ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
         ,  ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
         ,  ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum6), t19)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), t20)(PlusInstanceTuple20.contextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4  , Tuple18_Context4  , Tuple19_Context4  , Tuple20_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5  , Tuple18_Context5  , Tuple19_Context5  , Tuple20_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6  , Tuple18_Context6  , Tuple19_Context6  , Tuple20_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7  , Tuple13_Context7  , Tuple14_Context7  , Tuple15_Context7  , Tuple16_Context7  , Tuple17_Context7  , Tuple18_Context7  , Tuple19_Context7  , Tuple20_Context7 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
                 ,  Tuple13_Context7
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
                 ,  Tuple14_Context7
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
                 ,  Tuple15_Context7
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
                 ,  Tuple16_Context7
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
                 ,  Tuple17_Context7
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
                 ,  Tuple18_Context4
                 ,  Tuple18_Context5
                 ,  Tuple18_Context6
                 ,  Tuple18_Context7
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
                 ,  Tuple19_Context4
                 ,  Tuple19_Context5
                 ,  Tuple19_Context6
                 ,  Tuple19_Context7
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
                 ,  Tuple20_Context4
                 ,  Tuple20_Context5
                 ,  Tuple20_Context6
                 ,  Tuple20_Context7
        ]
            )  as   ApplicationX7[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
        , ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
]  = new  ApplicationX7[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
        , ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
         ,  ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
         ,  ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
         ,  ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
         ,  ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum7), t19)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), t20)(PlusInstanceTuple20.contextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1  , Tuple18_Context1  , Tuple19_Context1  , Tuple20_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2  , Tuple18_Context2  , Tuple19_Context2  , Tuple20_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3  , Tuple18_Context3  , Tuple19_Context3  , Tuple20_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4  , Tuple18_Context4  , Tuple19_Context4  , Tuple20_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5  , Tuple18_Context5  , Tuple19_Context5  , Tuple20_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6  , Tuple18_Context6  , Tuple19_Context6  , Tuple20_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7  , Tuple13_Context7  , Tuple14_Context7  , Tuple15_Context7  , Tuple16_Context7  , Tuple17_Context7  , Tuple18_Context7  , Tuple19_Context7  , Tuple20_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8  , Tuple13_Context8  , Tuple14_Context8  , Tuple15_Context8  , Tuple16_Context8  , Tuple17_Context8  , Tuple18_Context8  , Tuple19_Context8  , Tuple20_Context8 
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
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
        ]
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
                 ,  Tuple13_Context7
                 ,  Tuple13_Context8
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
                 ,  Tuple14_Context7
                 ,  Tuple14_Context8
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
                 ,  Tuple15_Context7
                 ,  Tuple15_Context8
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
                 ,  Tuple16_Context7
                 ,  Tuple16_Context8
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
                 ,  Tuple17_Context7
                 ,  Tuple17_Context8
        ]
         ,   inline  t18: F[
                 Tuple18_Context1
                 ,  Tuple18_Context2
                 ,  Tuple18_Context3
                 ,  Tuple18_Context4
                 ,  Tuple18_Context5
                 ,  Tuple18_Context6
                 ,  Tuple18_Context7
                 ,  Tuple18_Context8
        ]
         ,   inline  t19: F[
                 Tuple19_Context1
                 ,  Tuple19_Context2
                 ,  Tuple19_Context3
                 ,  Tuple19_Context4
                 ,  Tuple19_Context5
                 ,  Tuple19_Context6
                 ,  Tuple19_Context7
                 ,  Tuple19_Context8
        ]
         ,   inline  t20: F[
                 Tuple20_Context1
                 ,  Tuple20_Context2
                 ,  Tuple20_Context3
                 ,  Tuple20_Context4
                 ,  Tuple20_Context5
                 ,  Tuple20_Context6
                 ,  Tuple20_Context7
                 ,  Tuple20_Context8
        ]
            )  as   ApplicationX8[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
        , ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
        , ZTuple20[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8   ,  Tuple18_Context8   ,  Tuple19_Context8   ,  Tuple20_Context8 ]
]  = new  ApplicationX8[F, T
        , ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
        , ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
        , ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
        , ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
        , ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
        , ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
        , ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
        , ZTuple20[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8   ,  Tuple18_Context8   ,  Tuple19_Context8   ,  Tuple20_Context8 ]
]   {
                override def application(context: T):  F[
         ZTuple20[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1   ,  Tuple18_Context1   ,  Tuple19_Context1   ,  Tuple20_Context1 ]
         ,  ZTuple20[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2   ,  Tuple18_Context2   ,  Tuple19_Context2   ,  Tuple20_Context2 ]
         ,  ZTuple20[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3   ,  Tuple18_Context3   ,  Tuple19_Context3   ,  Tuple20_Context3 ]
         ,  ZTuple20[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4   ,  Tuple18_Context4   ,  Tuple19_Context4   ,  Tuple20_Context4 ]
         ,  ZTuple20[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5   ,  Tuple18_Context5   ,  Tuple19_Context5   ,  Tuple20_Context5 ]
         ,  ZTuple20[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6   ,  Tuple18_Context6   ,  Tuple19_Context6   ,  Tuple20_Context6 ]
         ,  ZTuple20[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7   ,  Tuple18_Context7   ,  Tuple19_Context7   ,  Tuple20_Context7 ]
         ,  ZTuple20[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8   ,  Tuple18_Context8   ,  Tuple19_Context8   ,  Tuple20_Context8 ]
]  = {
                    context.append(context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t17, t18)(zsg.PlusInstanceZsgTuple2.contextNum8), t19)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), t20)(PlusInstanceTuple20.contextNum8)
                }
            }
}
