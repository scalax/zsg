package asuna.support
import scala.language.higherKinds
import asuna.TupleTag1
import asuna.TupleTag2
import asuna.AsunaTuple0
import asuna.AsunaTuple1
import asuna.AsunaTuple2
import asuna.Application1
import asuna.Plus1
import asuna.Context1
import asuna.Application2
import asuna.Plus2
import asuna.Context2
import asuna.Application3
import asuna.Plus3
import asuna.Context3
import asuna.Application4
import asuna.Plus4
import asuna.Context4
import asuna.Application5
import asuna.Plus5
import asuna.Context5
import asuna.Application6
import asuna.Plus6
import asuna.Context6
import asuna.Application7
import asuna.Plus7
import asuna.Context7
import asuna.Application8
import asuna.Plus8
import asuna.Context8
class TupleTag1ApplicationCompanion {
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum1[F[_ ], H1  , X1_C1 ]( implicit  t1: Application1[F, H1  , X1_C1 ]
        )  :  Application1[F,TupleTag1[H1]  , AsunaTuple1[X1_C1] ] = {
            new Application1[F, TupleTag1[H1]  , AsunaTuple1[X1_C1] ] {
                override def application(context: Context1[F]): F[AsunaTuple1[X1_C1]
                ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus1WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum2[F[_  , _ ], H1  , X1_C1  , X1_C2 ]( implicit  t1: Application2[F, H1  , X1_C1  , X1_C2 ]
        )  :  Application2[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] = {
            new Application2[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] {
                override def application(context: Context2[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus2WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum3[F[_  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3 ]( implicit  t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
        )  :  Application3[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
            new Application3[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] {
                override def application(context: Context3[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus3WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum4[F[_  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]( implicit  t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
        )  :  Application4[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
            new Application4[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] {
                override def application(context: Context4[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus4WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum5[F[_  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]( implicit  t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
        )  :  Application5[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
            new Application5[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] {
                override def application(context: Context5[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus5WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum6[F[_  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]( implicit  t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
        )  :  Application6[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
            new Application6[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] {
                override def application(context: Context6[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus6WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]( implicit  t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
        )  :  Application7[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
            new Application7[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] {
                override def application(context: Context7[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus7WithTypeParameter0)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum1_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]( implicit  t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
        )  :  Application8[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
            new Application8[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] {
                override def application(context: Context8[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus8WithTypeParameter0)
                }
            }
        }
}
class TupleTag2ApplicationCompanion {
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum1[F[_ ], H1, H2  , X1_C1   , X2_C1 ]( implicit  t1: Application1[F, H1  , X1_C1 ], t2: Application1[F, H2  , X2_C1 ]
        )  :  Application1[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ] = {
            new Application1[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ] {
                override def application(context: Context1[F]): F[AsunaTuple2[X1_C1, X2_C1]
                ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus1WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum2[F[_  , _ ], H1, H2  , X1_C1  , X1_C2   , X2_C1  , X2_C2 ]( implicit  t1: Application2[F, H1  , X1_C1  , X1_C2 ], t2: Application2[F, H2  , X2_C1  , X2_C2 ]
        )  :  Application2[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ] = {
            new Application2[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ] {
                override def application(context: Context2[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus2WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum3[F[_  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3   , X2_C1  , X2_C2  , X2_C3 ]( implicit  t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ], t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]
        )  :  Application3[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] = {
            new Application3[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] {
                override def application(context: Context3[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus3WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum4[F[_  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4   , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]( implicit  t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ], t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]
        )  :  Application4[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] = {
            new Application4[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] {
                override def application(context: Context4[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus4WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum5[F[_  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]( implicit  t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ], t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]
        )  :  Application5[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] = {
            new Application5[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] {
                override def application(context: Context5[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus5WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum6[F[_  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]( implicit  t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ], t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]
        )  :  Application6[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] = {
            new Application6[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] {
                override def application(context: Context6[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus6WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]( implicit  t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ], t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]
        )  :  Application7[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] = {
            new Application7[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] {
                override def application(context: Context7[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus7WithTypeParameter1)
                }
            }
        }
        final  implicit def  tupleTagApplicationImplicit_tagNum2_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]( implicit  t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ], t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]
        )  :  Application8[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] = {
            new Application8[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] {
                override def application(context: Context8[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus8WithTypeParameter1)
                }
            }
        }
}
