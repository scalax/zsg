package asuna
final class NodeTuple1[X1 <: TupleTag](final val i1: X1) extends TupleTag
object NodeTuple1 {
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum1[F[_ ]  , X1_C1 <: TupleTag ]( using  t1: Application1[F  , X1_C1 ]
            )  as  Application1[F  , NodeTuple1[X1_C1] ] = {
                new Application1[F  , NodeTuple1[X1_C1] ] {
                    override def application(context: Context1[F]): F[NodeTuple1[X1_C1]
                    ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus1WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum2[F[_  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag ]( using  t1: Application2[F  , X1_C1  , X1_C2 ]
            )  as  Application2[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2] ] = {
                new Application2[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2] ] {
                    override def application(context: Context2[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus2WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum3[F[_  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag ]( using  t1: Application3[F  , X1_C1  , X1_C2  , X1_C3 ]
            )  as  Application3[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3] ] = {
                new Application3[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3] ] {
                    override def application(context: Context3[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus3WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum4[F[_  , _  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag ]( using  t1: Application4[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
            )  as  Application4[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4] ] = {
                new Application4[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4] ] {
                    override def application(context: Context4[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus4WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum5[F[_  , _  , _  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag ]( using  t1: Application5[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
            )  as  Application5[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5] ] = {
                new Application5[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5] ] {
                    override def application(context: Context5[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus5WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum6[F[_  , _  , _  , _  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag ]( using  t1: Application6[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
            )  as  Application6[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6] ] = {
                new Application6[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6] ] {
                    override def application(context: Context6[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus6WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag ]( using  t1: Application7[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
            )  as  Application7[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7] ] = {
                new Application7[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7] ] {
                    override def application(context: Context7[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus7WithTypeParameter0)
                    }
                }
            }
             given  tupleTagApplicationImplicit_tagNum1_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ]  , X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag  , X1_C8 <: TupleTag ]( using  t1: Application8[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
            )  as  Application8[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7]  , NodeTuple1[X1_C8] ] = {
                new Application8[F  , NodeTuple1[X1_C1]  , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7]  , NodeTuple1[X1_C8] ] {
                    override def application(context: Context8[F]): F[NodeTuple1[X1_C1]
                     , NodeTuple1[X1_C2]  , NodeTuple1[X1_C3]  , NodeTuple1[X1_C4]  , NodeTuple1[X1_C5]  , NodeTuple1[X1_C6]  , NodeTuple1[X1_C7]  , NodeTuple1[X1_C8] ] = {
                        context.append(context.start, t1.application(context))(NodeTuple1.cachePlus8WithTypeParameter0)
                    }
                }
            }
            @inline final def cachePlus1WithTypeParameter0Dynamic[Y1 <: TupleTag]: Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] = new Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
            }
            final val cachePlus1WithTypeParameter0Strict: Plus1[
                ZsgTuple0,
                TupleTag,
                NodeTuple1[TupleTag]
            ] = cachePlus1WithTypeParameter0Dynamic[TupleTag]
            @inline final def cachePlus1WithTypeParameter0[Y1 <: TupleTag]: Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ] = cachePlus1WithTypeParameter0Strict.asInstanceOf[Plus1[
                ZsgTuple0,
                Y1,
                NodeTuple1[Y1]
            ]]
            @inline final def cachePlus2WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] = new Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
            }
            final val cachePlus2WithTypeParameter0Strict: Plus2[
                ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus2WithTypeParameter0Dynamic[TupleTag , TupleTag]
            @inline final def cachePlus2WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag]: Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ] = cachePlus2WithTypeParameter0Strict.asInstanceOf[Plus2[
                ZsgTuple0 , ZsgTuple0,
                Y1 , Y2,
                NodeTuple1[Y1] , NodeTuple1[Y2]
            ]]
            @inline final def cachePlus3WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] = new Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
            }
            final val cachePlus3WithTypeParameter0Strict: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus3WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus3WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag]: Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ] = cachePlus3WithTypeParameter0Strict.asInstanceOf[Plus3[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3]
            ]]
            @inline final def cachePlus4WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] = new Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
            }
            final val cachePlus4WithTypeParameter0Strict: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus4WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus4WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag]: Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ] = cachePlus4WithTypeParameter0Strict.asInstanceOf[Plus4[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4]
            ]]
            @inline final def cachePlus5WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] = new Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
            }
            final val cachePlus5WithTypeParameter0Strict: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus5WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus5WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag]: Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ] = cachePlus5WithTypeParameter0Strict.asInstanceOf[Plus5[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5]
            ]]
            @inline final def cachePlus6WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] = new Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
            }
            final val cachePlus6WithTypeParameter0Strict: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus6WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus6WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag]: Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ] = cachePlus6WithTypeParameter0Strict.asInstanceOf[Plus6[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6]
            ]]
            @inline final def cachePlus7WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] = new Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
                    final override def takeHead7(z: NodeTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: NodeTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): NodeTuple1[Y7] = new NodeTuple1(y)
            }
            final val cachePlus7WithTypeParameter0Strict: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus7WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus7WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag]: Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ] = cachePlus7WithTypeParameter0Strict.asInstanceOf[Plus7[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7]
            ]]
            @inline final def cachePlus8WithTypeParameter0Dynamic[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] = new Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] {
                    final override def takeHead1(z: NodeTuple1[Y1]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail1(z: NodeTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: ZsgTuple0, y: Y1): NodeTuple1[Y1] = new NodeTuple1(y)
                    final override def takeHead2(z: NodeTuple1[Y2]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail2(z: NodeTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: ZsgTuple0, y: Y2): NodeTuple1[Y2] = new NodeTuple1(y)
                    final override def takeHead3(z: NodeTuple1[Y3]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail3(z: NodeTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: ZsgTuple0, y: Y3): NodeTuple1[Y3] = new NodeTuple1(y)
                    final override def takeHead4(z: NodeTuple1[Y4]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail4(z: NodeTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: ZsgTuple0, y: Y4): NodeTuple1[Y4] = new NodeTuple1(y)
                    final override def takeHead5(z: NodeTuple1[Y5]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail5(z: NodeTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: ZsgTuple0, y: Y5): NodeTuple1[Y5] = new NodeTuple1(y)
                    final override def takeHead6(z: NodeTuple1[Y6]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail6(z: NodeTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: ZsgTuple0, y: Y6): NodeTuple1[Y6] = new NodeTuple1(y)
                    final override def takeHead7(z: NodeTuple1[Y7]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail7(z: NodeTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: ZsgTuple0, y: Y7): NodeTuple1[Y7] = new NodeTuple1(y)
                    final override def takeHead8(z: NodeTuple1[Y8]): ZsgTuple0 = ZsgTuple0.value
                    final override def takeTail8(z: NodeTuple1[Y8]): Y8 = z.i1
                    final override def plus8(x: ZsgTuple0, y: Y8): NodeTuple1[Y8] = new NodeTuple1(y)
            }
            final val cachePlus8WithTypeParameter0Strict: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag,
                NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag] , NodeTuple1[TupleTag]
            ] = cachePlus8WithTypeParameter0Dynamic[TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag , TupleTag]
            @inline final def cachePlus8WithTypeParameter0[Y1 <: TupleTag , Y2 <: TupleTag , Y3 <: TupleTag , Y4 <: TupleTag , Y5 <: TupleTag , Y6 <: TupleTag , Y7 <: TupleTag , Y8 <: TupleTag]: Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ] = cachePlus8WithTypeParameter0Strict.asInstanceOf[Plus8[
                ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0 , ZsgTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                NodeTuple1[Y1] , NodeTuple1[Y2] , NodeTuple1[Y3] , NodeTuple1[Y4] , NodeTuple1[Y5] , NodeTuple1[Y6] , NodeTuple1[Y7] , NodeTuple1[Y8]
            ]]
}
