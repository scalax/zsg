package zsg
final class ZsgTuple1[X1](final val i1: X1) extends TupleTag
object ZsgTuple1 {
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum1[F[  _ ], T <: Context1[F]
             , X1_C1 ]( implicit 
                t1: F[  X1_C1 ],
                context: T
            )  :  Application1[F, T  , ZsgTuple1[X1_C1] ] =
                new Application1(context.append(context.start, t1)(ZsgTuple1.cachePlus1WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum2[F[  _   ,  _ ], T <: Context2[F]
             , X1_C1  , X1_C2 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2 ],
                context: T
            )  :  Application2[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2] ] =
                new Application2(context.append(context.start, t1)(ZsgTuple1.cachePlus2WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum3[F[  _   ,  _   ,  _ ], T <: Context3[F]
             , X1_C1  , X1_C2  , X1_C3 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3 ],
                context: T
            )  :  Application3[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3] ] =
                new Application3(context.append(context.start, t1)(ZsgTuple1.cachePlus3WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum4[F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
             , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3   ,  X1_C4 ],
                context: T
            )  :  Application4[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3]  , ZsgTuple1[X1_C4] ] =
                new Application4(context.append(context.start, t1)(ZsgTuple1.cachePlus4WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum5[F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
             , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3   ,  X1_C4   ,  X1_C5 ],
                context: T
            )  :  Application5[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3]  , ZsgTuple1[X1_C4]  , ZsgTuple1[X1_C5] ] =
                new Application5(context.append(context.start, t1)(ZsgTuple1.cachePlus5WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum6[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
             , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3   ,  X1_C4   ,  X1_C5   ,  X1_C6 ],
                context: T
            )  :  Application6[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3]  , ZsgTuple1[X1_C4]  , ZsgTuple1[X1_C5]  , ZsgTuple1[X1_C6] ] =
                new Application6(context.append(context.start, t1)(ZsgTuple1.cachePlus6WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum7[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
             , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3   ,  X1_C4   ,  X1_C5   ,  X1_C6   ,  X1_C7 ],
                context: T
            )  :  Application7[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3]  , ZsgTuple1[X1_C4]  , ZsgTuple1[X1_C5]  , ZsgTuple1[X1_C6]  , ZsgTuple1[X1_C7] ] =
                new Application7(context.append(context.start, t1)(ZsgTuple1.cachePlus7WithTypeParameter0))
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum8[F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
             , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]( implicit 
                t1: F[  X1_C1   ,  X1_C2   ,  X1_C3   ,  X1_C4   ,  X1_C5   ,  X1_C6   ,  X1_C7   ,  X1_C8 ],
                context: T
            )  :  Application8[F, T  , ZsgTuple1[X1_C1]  , ZsgTuple1[X1_C2]  , ZsgTuple1[X1_C3]  , ZsgTuple1[X1_C4]  , ZsgTuple1[X1_C5]  , ZsgTuple1[X1_C6]  , ZsgTuple1[X1_C7]  , ZsgTuple1[X1_C8] ] =
                new Application8(context.append(context.start, t1)(ZsgTuple1.cachePlus8WithTypeParameter0))
             @inline  def cachePlus1WithTypeParameter0Dynamic[Y1]: Plus1[
                ZsgTuple0,
                Y1,
                ZsgTuple1[Y1]
            ] = new Plus1[
                ZsgTuple0,
                Y1,
                ZsgTuple1[Y1]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
            }
            val cachePlus1WithTypeParameter0Strict: Plus1[
                ZsgTuple0,
                Any,
                ZsgTuple1[Any]
            ] = cachePlus1WithTypeParameter0Dynamic[Any]
             @inline  def cachePlus1WithTypeParameter0[Y1]: Plus1[
                ZsgTuple0,
                Y1,
                ZsgTuple1[Y1]
            ] = cachePlus1WithTypeParameter0Strict.asInstanceOf[Plus1[
                ZsgTuple0,
                Y1,
                ZsgTuple1[Y1]
            ]]
             @inline  def cachePlus2WithTypeParameter0Dynamic[Y1 , Y2]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                ZsgTuple1[Y1] , ZsgTuple1[Y2]
            ] = new Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                ZsgTuple1[Y1] , ZsgTuple1[Y2]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
            }
            val cachePlus2WithTypeParameter0Strict: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus2WithTypeParameter0Dynamic[Any , Any]
             @inline  def cachePlus2WithTypeParameter0[Y1 , Y2]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                ZsgTuple1[Y1] , ZsgTuple1[Y2]
            ] = cachePlus2WithTypeParameter0Strict.asInstanceOf[Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                ZsgTuple1[Y1] , ZsgTuple1[Y2]
            ]]
             @inline  def cachePlus3WithTypeParameter0Dynamic[Y1 , Y2 , Y3]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3]
            ] = new Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
            }
            val cachePlus3WithTypeParameter0Strict: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus3WithTypeParameter0Dynamic[Any , Any , Any]
             @inline  def cachePlus3WithTypeParameter0[Y1 , Y2 , Y3]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3]
            ] = cachePlus3WithTypeParameter0Strict.asInstanceOf[Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3]
            ]]
             @inline  def cachePlus4WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4]
            ] = new Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
                    final override def takeHead4(z: ZsgTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: ZsgTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): ZsgTuple1[Y4] = new ZsgTuple1(y)
            }
            val cachePlus4WithTypeParameter0Strict: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus4WithTypeParameter0Dynamic[Any , Any , Any , Any]
             @inline  def cachePlus4WithTypeParameter0[Y1 , Y2 , Y3 , Y4]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4]
            ] = cachePlus4WithTypeParameter0Strict.asInstanceOf[Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4]
            ]]
             @inline  def cachePlus5WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5]
            ] = new Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
                    final override def takeHead4(z: ZsgTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: ZsgTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): ZsgTuple1[Y4] = new ZsgTuple1(y)
                    final override def takeHead5(z: ZsgTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: ZsgTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): ZsgTuple1[Y5] = new ZsgTuple1(y)
            }
            val cachePlus5WithTypeParameter0Strict: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus5WithTypeParameter0Dynamic[Any , Any , Any , Any , Any]
             @inline  def cachePlus5WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5]
            ] = cachePlus5WithTypeParameter0Strict.asInstanceOf[Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5]
            ]]
             @inline  def cachePlus6WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6]
            ] = new Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
                    final override def takeHead4(z: ZsgTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: ZsgTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): ZsgTuple1[Y4] = new ZsgTuple1(y)
                    final override def takeHead5(z: ZsgTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: ZsgTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): ZsgTuple1[Y5] = new ZsgTuple1(y)
                    final override def takeHead6(z: ZsgTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: ZsgTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): ZsgTuple1[Y6] = new ZsgTuple1(y)
            }
            val cachePlus6WithTypeParameter0Strict: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any , Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus6WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any]
             @inline  def cachePlus6WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6]
            ] = cachePlus6WithTypeParameter0Strict.asInstanceOf[Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6]
            ]]
             @inline  def cachePlus7WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7]
            ] = new Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
                    final override def takeHead4(z: ZsgTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: ZsgTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): ZsgTuple1[Y4] = new ZsgTuple1(y)
                    final override def takeHead5(z: ZsgTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: ZsgTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): ZsgTuple1[Y5] = new ZsgTuple1(y)
                    final override def takeHead6(z: ZsgTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: ZsgTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): ZsgTuple1[Y6] = new ZsgTuple1(y)
                    final override def takeHead7(z: ZsgTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: ZsgTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): ZsgTuple1[Y7] = new ZsgTuple1(y)
            }
            val cachePlus7WithTypeParameter0Strict: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any , Any , Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus7WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any , Any]
             @inline  def cachePlus7WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7]
            ] = cachePlus7WithTypeParameter0Strict.asInstanceOf[Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7]
            ]]
             @inline  def cachePlus8WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7] , ZsgTuple1[Y8]
            ] = new Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7] , ZsgTuple1[Y8]
            ] {
                    final override def takeHead1(z: ZsgTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: ZsgTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): ZsgTuple1[Y1] = new ZsgTuple1(y)
                    final override def takeHead2(z: ZsgTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: ZsgTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): ZsgTuple1[Y2] = new ZsgTuple1(y)
                    final override def takeHead3(z: ZsgTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: ZsgTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): ZsgTuple1[Y3] = new ZsgTuple1(y)
                    final override def takeHead4(z: ZsgTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: ZsgTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): ZsgTuple1[Y4] = new ZsgTuple1(y)
                    final override def takeHead5(z: ZsgTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: ZsgTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): ZsgTuple1[Y5] = new ZsgTuple1(y)
                    final override def takeHead6(z: ZsgTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: ZsgTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): ZsgTuple1[Y6] = new ZsgTuple1(y)
                    final override def takeHead7(z: ZsgTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: ZsgTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): ZsgTuple1[Y7] = new ZsgTuple1(y)
                    final override def takeHead8(z: ZsgTuple1[Y8]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail8(z: ZsgTuple1[Y8]): Y8 = z.i1
                    final override def plus8(x: ZsgTuple0, y: Y8): ZsgTuple1[Y8] = new ZsgTuple1(y)
            }
            val cachePlus8WithTypeParameter0Strict: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Any , Any , Any , Any , Any , Any , Any , Any,
                ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any] , ZsgTuple1[Any]
            ] = cachePlus8WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any , Any , Any]
             @inline  def cachePlus8WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7] , ZsgTuple1[Y8]
            ] = cachePlus8WithTypeParameter0Strict.asInstanceOf[Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                ZsgTuple1[Y1] , ZsgTuple1[Y2] , ZsgTuple1[Y3] , ZsgTuple1[Y4] , ZsgTuple1[Y5] , ZsgTuple1[Y6] , ZsgTuple1[Y7] , ZsgTuple1[Y8]
            ]]
}
