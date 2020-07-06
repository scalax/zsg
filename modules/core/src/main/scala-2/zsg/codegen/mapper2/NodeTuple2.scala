package zsg
final class NodeTuple2[X1 <: TupleTag , X2 <: TupleTag](final val i1: X1 , final val i2: X2) extends TupleTag
object NodeTuple2 {
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum1[F[_ ], T <: Context1[F]
             , X1_C1 <: TupleTag   , X2_C1 <: TupleTag ]( implicit 
                t1: Application1[F, T  , X1_C1 ],
                t2: Application1[F, T  , X2_C1 ],
                context: T
            )  :  Application1[F, T  , NodeTuple2[X1_C1, X2_C1] ] =
                new Application1(context.append(t2.application, t1.application)(NodeTuple2.cachePlus1WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum2[F[_  , _ ], T <: Context2[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag ]( implicit 
                t1: Application2[F, T  , X1_C1  , X1_C2 ],
                t2: Application2[F, T  , X2_C1  , X2_C2 ],
                context: T
            )  :  Application2[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2] ] =
                new Application2(context.append(t2.application, t1.application)(NodeTuple2.cachePlus2WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum3[F[_  , _  , _ ], T <: Context3[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag ]( implicit 
                t1: Application3[F, T  , X1_C1  , X1_C2  , X1_C3 ],
                t2: Application3[F, T  , X2_C1  , X2_C2  , X2_C3 ],
                context: T
            )  :  Application3[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3] ] =
                new Application3(context.append(t2.application, t1.application)(NodeTuple2.cachePlus3WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum4[F[_  , _  , _  , _ ], T <: Context4[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag ]( implicit 
                t1: Application4[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ],
                t2: Application4[F, T  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ],
                context: T
            )  :  Application4[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3]  , NodeTuple2[X1_C4, X2_C4] ] =
                new Application4(context.append(t2.application, t1.application)(NodeTuple2.cachePlus4WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum5[F[_  , _  , _  , _  , _ ], T <: Context5[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag ]( implicit 
                t1: Application5[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ],
                t2: Application5[F, T  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ],
                context: T
            )  :  Application5[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3]  , NodeTuple2[X1_C4, X2_C4]  , NodeTuple2[X1_C5, X2_C5] ] =
                new Application5(context.append(t2.application, t1.application)(NodeTuple2.cachePlus5WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum6[F[_  , _  , _  , _  , _  , _ ], T <: Context6[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag ]( implicit 
                t1: Application6[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ],
                t2: Application6[F, T  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ],
                context: T
            )  :  Application6[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3]  , NodeTuple2[X1_C4, X2_C4]  , NodeTuple2[X1_C5, X2_C5]  , NodeTuple2[X1_C6, X2_C6] ] =
                new Application6(context.append(t2.application, t1.application)(NodeTuple2.cachePlus6WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ], T <: Context7[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag ]( implicit 
                t1: Application7[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ],
                t2: Application7[F, T  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ],
                context: T
            )  :  Application7[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3]  , NodeTuple2[X1_C4, X2_C4]  , NodeTuple2[X1_C5, X2_C5]  , NodeTuple2[X1_C6, X2_C6]  , NodeTuple2[X1_C7, X2_C7] ] =
                new Application7(context.append(t2.application, t1.application)(NodeTuple2.cachePlus7WithTypeParameter1))
             implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ], T <: Context8[F]
             , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag   , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag  , X2_C8 <: TupleTag ]( implicit 
                t1: Application8[F, T  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ],
                t2: Application8[F, T  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ],
                context: T
            )  :  Application8[F, T  , NodeTuple2[X1_C1, X2_C1]  , NodeTuple2[X1_C2, X2_C2]  , NodeTuple2[X1_C3, X2_C3]  , NodeTuple2[X1_C4, X2_C4]  , NodeTuple2[X1_C5, X2_C5]  , NodeTuple2[X1_C6, X2_C6]  , NodeTuple2[X1_C7, X2_C7]  , NodeTuple2[X1_C8, X2_C8] ] =
                new Application8(context.append(t2.application, t1.application)(NodeTuple2.cachePlus8WithTypeParameter1))
             @inline  def cachePlus1WithTypeParameter1Dynamic[
                X1 <: TupleTag,
                Y1 <: TupleTag
            ]: Plus1[
                X1,
                Y1,
                NodeTuple2[Y1, X1]
            ] = new Plus1[
                X1,
                Y1,
                NodeTuple2[Y1, X1]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
            }
            val cachePlus1WithTypeParameter1Strict: Plus1[
                TupleTag,
                TupleTag,
                NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus1WithTypeParameter1Dynamic[
                TupleTag,
                TupleTag
            ]
             @inline  def cachePlus1WithTypeParameter1[
                X1 <: TupleTag,
                Y1 <: TupleTag
            ]: Plus1[
                X1,
                Y1,
                NodeTuple2[Y1, X1]
            ] = cachePlus1WithTypeParameter1Strict.asInstanceOf[Plus1[
                X1,
                Y1,
                NodeTuple2[Y1, X1]
            ]]
             @inline  def cachePlus2WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag
            ]: Plus2[
                X1 , X2,
                Y1 , Y2,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2]
            ] = new Plus2[
                X1 , X2,
                Y1 , Y2,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
            }
            val cachePlus2WithTypeParameter1Strict: Plus2[
                TupleTag , TupleTag,
                TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus2WithTypeParameter1Dynamic[
                TupleTag , TupleTag,
                TupleTag , TupleTag
            ]
             @inline  def cachePlus2WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag
            ]: Plus2[
                X1 , X2,
                Y1 , Y2,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2]
            ] = cachePlus2WithTypeParameter1Strict.asInstanceOf[Plus2[
                X1 , X2,
                Y1 , Y2,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2]
            ]]
             @inline  def cachePlus3WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag
            ]: Plus3[
                X1 , X2 , X3,
                Y1 , Y2 , Y3,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3]
            ] = new Plus3[
                X1 , X2 , X3,
                Y1 , Y2 , Y3,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
            }
            val cachePlus3WithTypeParameter1Strict: Plus3[
                TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus3WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus3WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag
            ]: Plus3[
                X1 , X2 , X3,
                Y1 , Y2 , Y3,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3]
            ] = cachePlus3WithTypeParameter1Strict.asInstanceOf[Plus3[
                X1 , X2 , X3,
                Y1 , Y2 , Y3,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3]
            ]]
             @inline  def cachePlus4WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag
            ]: Plus4[
                X1 , X2 , X3 , X4,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4]
            ] = new Plus4[
                X1 , X2 , X3 , X4,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
                    final override def takeHead4(z: NodeTuple2[Y4, X4]): X4 = z.i2
                    final override def takeTail4(z: NodeTuple2[Y4, X4]): Y4 = z.i1
                    final override def plus4(x: X4, y: Y4): NodeTuple2[Y4, X4] = new NodeTuple2(y, x)
            }
            val cachePlus4WithTypeParameter1Strict: Plus4[
                TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus4WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus4WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag
            ]: Plus4[
                X1 , X2 , X3 , X4,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4]
            ] = cachePlus4WithTypeParameter1Strict.asInstanceOf[Plus4[
                X1 , X2 , X3 , X4,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4]
            ]]
             @inline  def cachePlus5WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag
            ]: Plus5[
                X1 , X2 , X3 , X4 , X5,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5]
            ] = new Plus5[
                X1 , X2 , X3 , X4 , X5,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
                    final override def takeHead4(z: NodeTuple2[Y4, X4]): X4 = z.i2
                    final override def takeTail4(z: NodeTuple2[Y4, X4]): Y4 = z.i1
                    final override def plus4(x: X4, y: Y4): NodeTuple2[Y4, X4] = new NodeTuple2(y, x)
                    final override def takeHead5(z: NodeTuple2[Y5, X5]): X5 = z.i2
                    final override def takeTail5(z: NodeTuple2[Y5, X5]): Y5 = z.i1
                    final override def plus5(x: X5, y: Y5): NodeTuple2[Y5, X5] = new NodeTuple2(y, x)
            }
            val cachePlus5WithTypeParameter1Strict: Plus5[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus5WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus5WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag
            ]: Plus5[
                X1 , X2 , X3 , X4 , X5,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5]
            ] = cachePlus5WithTypeParameter1Strict.asInstanceOf[Plus5[
                X1 , X2 , X3 , X4 , X5,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5]
            ]]
             @inline  def cachePlus6WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag
            ]: Plus6[
                X1 , X2 , X3 , X4 , X5 , X6,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6]
            ] = new Plus6[
                X1 , X2 , X3 , X4 , X5 , X6,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
                    final override def takeHead4(z: NodeTuple2[Y4, X4]): X4 = z.i2
                    final override def takeTail4(z: NodeTuple2[Y4, X4]): Y4 = z.i1
                    final override def plus4(x: X4, y: Y4): NodeTuple2[Y4, X4] = new NodeTuple2(y, x)
                    final override def takeHead5(z: NodeTuple2[Y5, X5]): X5 = z.i2
                    final override def takeTail5(z: NodeTuple2[Y5, X5]): Y5 = z.i1
                    final override def plus5(x: X5, y: Y5): NodeTuple2[Y5, X5] = new NodeTuple2(y, x)
                    final override def takeHead6(z: NodeTuple2[Y6, X6]): X6 = z.i2
                    final override def takeTail6(z: NodeTuple2[Y6, X6]): Y6 = z.i1
                    final override def plus6(x: X6, y: Y6): NodeTuple2[Y6, X6] = new NodeTuple2(y, x)
            }
            val cachePlus6WithTypeParameter1Strict: Plus6[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus6WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus6WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag
            ]: Plus6[
                X1 , X2 , X3 , X4 , X5 , X6,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6]
            ] = cachePlus6WithTypeParameter1Strict.asInstanceOf[Plus6[
                X1 , X2 , X3 , X4 , X5 , X6,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6]
            ]]
             @inline  def cachePlus7WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag
            ]: Plus7[
                X1 , X2 , X3 , X4 , X5 , X6 , X7,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7]
            ] = new Plus7[
                X1 , X2 , X3 , X4 , X5 , X6 , X7,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
                    final override def takeHead4(z: NodeTuple2[Y4, X4]): X4 = z.i2
                    final override def takeTail4(z: NodeTuple2[Y4, X4]): Y4 = z.i1
                    final override def plus4(x: X4, y: Y4): NodeTuple2[Y4, X4] = new NodeTuple2(y, x)
                    final override def takeHead5(z: NodeTuple2[Y5, X5]): X5 = z.i2
                    final override def takeTail5(z: NodeTuple2[Y5, X5]): Y5 = z.i1
                    final override def plus5(x: X5, y: Y5): NodeTuple2[Y5, X5] = new NodeTuple2(y, x)
                    final override def takeHead6(z: NodeTuple2[Y6, X6]): X6 = z.i2
                    final override def takeTail6(z: NodeTuple2[Y6, X6]): Y6 = z.i1
                    final override def plus6(x: X6, y: Y6): NodeTuple2[Y6, X6] = new NodeTuple2(y, x)
                    final override def takeHead7(z: NodeTuple2[Y7, X7]): X7 = z.i2
                    final override def takeTail7(z: NodeTuple2[Y7, X7]): Y7 = z.i1
                    final override def plus7(x: X7, y: Y7): NodeTuple2[Y7, X7] = new NodeTuple2(y, x)
            }
            val cachePlus7WithTypeParameter1Strict: Plus7[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus7WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus7WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag
            ]: Plus7[
                X1 , X2 , X3 , X4 , X5 , X6 , X7,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7]
            ] = cachePlus7WithTypeParameter1Strict.asInstanceOf[Plus7[
                X1 , X2 , X3 , X4 , X5 , X6 , X7,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7]
            ]]
             @inline  def cachePlus8WithTypeParameter1Dynamic[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag , X8 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag
            ]: Plus8[
                X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7] , NodeTuple2[Y8, X8]
            ] = new Plus8[
                X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7] , NodeTuple2[Y8, X8]
            ] {
                    final override def takeHead1(z: NodeTuple2[Y1, X1]): X1 = z.i2
                    final override def takeTail1(z: NodeTuple2[Y1, X1]): Y1 = z.i1
                    final override def plus1(x: X1, y: Y1): NodeTuple2[Y1, X1] = new NodeTuple2(y, x)
                    final override def takeHead2(z: NodeTuple2[Y2, X2]): X2 = z.i2
                    final override def takeTail2(z: NodeTuple2[Y2, X2]): Y2 = z.i1
                    final override def plus2(x: X2, y: Y2): NodeTuple2[Y2, X2] = new NodeTuple2(y, x)
                    final override def takeHead3(z: NodeTuple2[Y3, X3]): X3 = z.i2
                    final override def takeTail3(z: NodeTuple2[Y3, X3]): Y3 = z.i1
                    final override def plus3(x: X3, y: Y3): NodeTuple2[Y3, X3] = new NodeTuple2(y, x)
                    final override def takeHead4(z: NodeTuple2[Y4, X4]): X4 = z.i2
                    final override def takeTail4(z: NodeTuple2[Y4, X4]): Y4 = z.i1
                    final override def plus4(x: X4, y: Y4): NodeTuple2[Y4, X4] = new NodeTuple2(y, x)
                    final override def takeHead5(z: NodeTuple2[Y5, X5]): X5 = z.i2
                    final override def takeTail5(z: NodeTuple2[Y5, X5]): Y5 = z.i1
                    final override def plus5(x: X5, y: Y5): NodeTuple2[Y5, X5] = new NodeTuple2(y, x)
                    final override def takeHead6(z: NodeTuple2[Y6, X6]): X6 = z.i2
                    final override def takeTail6(z: NodeTuple2[Y6, X6]): Y6 = z.i1
                    final override def plus6(x: X6, y: Y6): NodeTuple2[Y6, X6] = new NodeTuple2(y, x)
                    final override def takeHead7(z: NodeTuple2[Y7, X7]): X7 = z.i2
                    final override def takeTail7(z: NodeTuple2[Y7, X7]): Y7 = z.i1
                    final override def plus7(x: X7, y: Y7): NodeTuple2[Y7, X7] = new NodeTuple2(y, x)
                    final override def takeHead8(z: NodeTuple2[Y8, X8]): X8 = z.i2
                    final override def takeTail8(z: NodeTuple2[Y8, X8]): Y8 = z.i1
                    final override def plus8(x: X8, y: Y8): NodeTuple2[Y8, X8] = new NodeTuple2(y, x)
            }
            val cachePlus8WithTypeParameter1Strict: Plus8[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag] , NodeTuple2[TupleTag, TupleTag]
            ] = cachePlus8WithTypeParameter1Dynamic[
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag
            ]
             @inline  def cachePlus8WithTypeParameter1[
                X1 <: TupleTag , X2 <: TupleTag , X3 <: TupleTag , X4 <: TupleTag , X5 <: TupleTag , X6 <: TupleTag , X7 <: TupleTag , X8 <: TupleTag,
                Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag
            ]: Plus8[
                X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7] , NodeTuple2[Y8, X8]
            ] = cachePlus8WithTypeParameter1Strict.asInstanceOf[Plus8[
                X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple2[Y1, X1] , NodeTuple2[Y2, X2] , NodeTuple2[Y3, X3] , NodeTuple2[Y4, X4] , NodeTuple2[Y5, X5] , NodeTuple2[Y6, X6] , NodeTuple2[Y7, X7] , NodeTuple2[Y8, X8]
            ]]
}
