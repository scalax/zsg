package asuna
final class AsunaTuple1[X1](final val i1: X1)
object AsunaTuple1 {
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum1[F[_ ]  , X1_C1 ]( implicit  t1: Application1[F  , X1_C1 ]
            )  :  Application1[F  , AsunaTuple1[X1_C1] ] = {
                new Application1[F  , AsunaTuple1[X1_C1] ] {
                    override def application(context: Context1[F]): F[AsunaTuple1[X1_C1]
                    ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus1WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum2[F[_  , _ ]  , X1_C1  , X1_C2 ]( implicit  t1: Application2[F  , X1_C1  , X1_C2 ]
            )  :  Application2[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] = {
                new Application2[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] {
                    override def application(context: Context2[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus2WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum3[F[_  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3 ]( implicit  t1: Application3[F  , X1_C1  , X1_C2  , X1_C3 ]
            )  :  Application3[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
                new Application3[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] {
                    override def application(context: Context3[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus3WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum4[F[_  , _  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]( implicit  t1: Application4[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
            )  :  Application4[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
                new Application4[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] {
                    override def application(context: Context4[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus4WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum5[F[_  , _  , _  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]( implicit  t1: Application5[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
            )  :  Application5[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
                new Application5[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] {
                    override def application(context: Context5[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus5WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum6[F[_  , _  , _  , _  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]( implicit  t1: Application6[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
            )  :  Application6[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
                new Application6[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] {
                    override def application(context: Context6[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus6WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]( implicit  t1: Application7[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
            )  :  Application7[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
                new Application7[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] {
                    override def application(context: Context7[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus7WithTypeParameter0)
                    }
                }
            }
             implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ]  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]( implicit  t1: Application8[F  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
            )  :  Application8[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
                new Application8[F  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] {
                    override def application(context: Context8[F]): F[AsunaTuple1[X1_C1]
                     , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
                        context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus8WithTypeParameter0)
                    }
                }
            }
            final def cachePlus1WithTypeParameter0Dynamic[Y1]: Plus1[
                AsunaTuple0,
                Y1,
                AsunaTuple1[Y1]
            ] = new Plus1[
                AsunaTuple0,
                Y1,
                AsunaTuple1[Y1]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
            }
            final val cachePlus1WithTypeParameter0Strict: Plus1[
                AsunaTuple0,
                Any,
                AsunaTuple1[Any]
            ] = cachePlus1WithTypeParameter0Dynamic[Any]
            final def cachePlus1WithTypeParameter0[Y1]: Plus1[
                AsunaTuple0,
                Y1,
                AsunaTuple1[Y1]
            ] = cachePlus1WithTypeParameter0Strict.asInstanceOf[Plus1[
                AsunaTuple0,
                Y1,
                AsunaTuple1[Y1]
            ]]
            final def cachePlus2WithTypeParameter0Dynamic[Y1 , Y2]: Plus2[
                AsunaTuple0 , AsunaTuple0,
                Y1 , Y2,
                AsunaTuple1[Y1] , AsunaTuple1[Y2]
            ] = new Plus2[
                AsunaTuple0 , AsunaTuple0,
                Y1 , Y2,
                AsunaTuple1[Y1] , AsunaTuple1[Y2]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
            }
            final val cachePlus2WithTypeParameter0Strict: Plus2[
                AsunaTuple0 , AsunaTuple0,
                Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus2WithTypeParameter0Dynamic[Any , Any]
            final def cachePlus2WithTypeParameter0[Y1 , Y2]: Plus2[
                AsunaTuple0 , AsunaTuple0,
                Y1 , Y2,
                AsunaTuple1[Y1] , AsunaTuple1[Y2]
            ] = cachePlus2WithTypeParameter0Strict.asInstanceOf[Plus2[
                AsunaTuple0 , AsunaTuple0,
                Y1 , Y2,
                AsunaTuple1[Y1] , AsunaTuple1[Y2]
            ]]
            final def cachePlus3WithTypeParameter0Dynamic[Y1 , Y2 , Y3]: Plus3[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3]
            ] = new Plus3[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
            }
            final val cachePlus3WithTypeParameter0Strict: Plus3[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus3WithTypeParameter0Dynamic[Any , Any , Any]
            final def cachePlus3WithTypeParameter0[Y1 , Y2 , Y3]: Plus3[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3]
            ] = cachePlus3WithTypeParameter0Strict.asInstanceOf[Plus3[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3]
            ]]
            final def cachePlus4WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4]: Plus4[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4]
            ] = new Plus4[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
                    final override def takeHead4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail4(z: AsunaTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: AsunaTuple0, y: Y4): AsunaTuple1[Y4] = new AsunaTuple1(y)
            }
            final val cachePlus4WithTypeParameter0Strict: Plus4[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus4WithTypeParameter0Dynamic[Any , Any , Any , Any]
            final def cachePlus4WithTypeParameter0[Y1 , Y2 , Y3 , Y4]: Plus4[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4]
            ] = cachePlus4WithTypeParameter0Strict.asInstanceOf[Plus4[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4]
            ]]
            final def cachePlus5WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
            ] = new Plus5[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
                    final override def takeHead4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail4(z: AsunaTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: AsunaTuple0, y: Y4): AsunaTuple1[Y4] = new AsunaTuple1(y)
                    final override def takeHead5(z: AsunaTuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail5(z: AsunaTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: AsunaTuple0, y: Y5): AsunaTuple1[Y5] = new AsunaTuple1(y)
            }
            final val cachePlus5WithTypeParameter0Strict: Plus5[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus5WithTypeParameter0Dynamic[Any , Any , Any , Any , Any]
            final def cachePlus5WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5]: Plus5[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
            ] = cachePlus5WithTypeParameter0Strict.asInstanceOf[Plus5[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5]
            ]]
            final def cachePlus6WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6]: Plus6[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6]
            ] = new Plus6[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
                    final override def takeHead4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail4(z: AsunaTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: AsunaTuple0, y: Y4): AsunaTuple1[Y4] = new AsunaTuple1(y)
                    final override def takeHead5(z: AsunaTuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail5(z: AsunaTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: AsunaTuple0, y: Y5): AsunaTuple1[Y5] = new AsunaTuple1(y)
                    final override def takeHead6(z: AsunaTuple1[Y6]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail6(z: AsunaTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: AsunaTuple0, y: Y6): AsunaTuple1[Y6] = new AsunaTuple1(y)
            }
            final val cachePlus6WithTypeParameter0Strict: Plus6[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any , Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus6WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any]
            final def cachePlus6WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6]: Plus6[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6]
            ] = cachePlus6WithTypeParameter0Strict.asInstanceOf[Plus6[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6]
            ]]
            final def cachePlus7WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7]: Plus7[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7]
            ] = new Plus7[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
                    final override def takeHead4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail4(z: AsunaTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: AsunaTuple0, y: Y4): AsunaTuple1[Y4] = new AsunaTuple1(y)
                    final override def takeHead5(z: AsunaTuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail5(z: AsunaTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: AsunaTuple0, y: Y5): AsunaTuple1[Y5] = new AsunaTuple1(y)
                    final override def takeHead6(z: AsunaTuple1[Y6]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail6(z: AsunaTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: AsunaTuple0, y: Y6): AsunaTuple1[Y6] = new AsunaTuple1(y)
                    final override def takeHead7(z: AsunaTuple1[Y7]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail7(z: AsunaTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: AsunaTuple0, y: Y7): AsunaTuple1[Y7] = new AsunaTuple1(y)
            }
            final val cachePlus7WithTypeParameter0Strict: Plus7[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any , Any , Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus7WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any , Any]
            final def cachePlus7WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7]: Plus7[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7]
            ] = cachePlus7WithTypeParameter0Strict.asInstanceOf[Plus7[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7]
            ]]
            final def cachePlus8WithTypeParameter0Dynamic[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7] , AsunaTuple1[Y8]
            ] = new Plus8[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7] , AsunaTuple1[Y8]
            ] {
                    final override def takeHead1(z: AsunaTuple1[Y1]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail1(z: AsunaTuple1[Y1]): Y1 = z.i1
                    final override def plus1(x: AsunaTuple0, y: Y1): AsunaTuple1[Y1] = new AsunaTuple1(y)
                    final override def takeHead2(z: AsunaTuple1[Y2]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail2(z: AsunaTuple1[Y2]): Y2 = z.i1
                    final override def plus2(x: AsunaTuple0, y: Y2): AsunaTuple1[Y2] = new AsunaTuple1(y)
                    final override def takeHead3(z: AsunaTuple1[Y3]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail3(z: AsunaTuple1[Y3]): Y3 = z.i1
                    final override def plus3(x: AsunaTuple0, y: Y3): AsunaTuple1[Y3] = new AsunaTuple1(y)
                    final override def takeHead4(z: AsunaTuple1[Y4]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail4(z: AsunaTuple1[Y4]): Y4 = z.i1
                    final override def plus4(x: AsunaTuple0, y: Y4): AsunaTuple1[Y4] = new AsunaTuple1(y)
                    final override def takeHead5(z: AsunaTuple1[Y5]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail5(z: AsunaTuple1[Y5]): Y5 = z.i1
                    final override def plus5(x: AsunaTuple0, y: Y5): AsunaTuple1[Y5] = new AsunaTuple1(y)
                    final override def takeHead6(z: AsunaTuple1[Y6]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail6(z: AsunaTuple1[Y6]): Y6 = z.i1
                    final override def plus6(x: AsunaTuple0, y: Y6): AsunaTuple1[Y6] = new AsunaTuple1(y)
                    final override def takeHead7(z: AsunaTuple1[Y7]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail7(z: AsunaTuple1[Y7]): Y7 = z.i1
                    final override def plus7(x: AsunaTuple0, y: Y7): AsunaTuple1[Y7] = new AsunaTuple1(y)
                    final override def takeHead8(z: AsunaTuple1[Y8]): AsunaTuple0 = AsunaTuple0.value
                    final override def takeTail8(z: AsunaTuple1[Y8]): Y8 = z.i1
                    final override def plus8(x: AsunaTuple0, y: Y8): AsunaTuple1[Y8] = new AsunaTuple1(y)
            }
            final val cachePlus8WithTypeParameter0Strict: Plus8[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Any , Any , Any , Any , Any , Any , Any , Any,
                AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any] , AsunaTuple1[Any]
            ] = cachePlus8WithTypeParameter0Dynamic[Any , Any , Any , Any , Any , Any , Any , Any]
            final def cachePlus8WithTypeParameter0[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8]: Plus8[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7] , AsunaTuple1[Y8]
            ] = cachePlus8WithTypeParameter0Strict.asInstanceOf[Plus8[
                AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0 , AsunaTuple0,
                Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8,
                AsunaTuple1[Y1] , AsunaTuple1[Y2] , AsunaTuple1[Y3] , AsunaTuple1[Y4] , AsunaTuple1[Y5] , AsunaTuple1[Y6] , AsunaTuple1[Y7] , AsunaTuple1[Y8]
            ]]
}
