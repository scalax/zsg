package asuna
final class TupleTag1[T1 ] extends TupleTag
object TupleTag1 {
import scala.language.higherKinds
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum1[F[_ ], H1  , X1_C1 ]( using  t1: Application1[F, H1  , X1_C1 ]
        )  as  Application1[F,TupleTag1[H1]  , AsunaTuple1[X1_C1] ] = {
            new Application1[F, TupleTag1[H1]  , AsunaTuple1[X1_C1] ] {
                override def application(context: Context1[F]): F[AsunaTuple1[X1_C1]
                ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus1WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum2[F[_  , _ ], H1  , X1_C1  , X1_C2 ]( using  t1: Application2[F, H1  , X1_C1  , X1_C2 ]
        )  as  Application2[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] = {
            new Application2[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2] ] {
                override def application(context: Context2[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus2WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum3[F[_  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3 ]( using  t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ]
        )  as  Application3[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
            new Application3[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] {
                override def application(context: Context3[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus3WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum4[F[_  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]( using  t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
        )  as  Application4[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
            new Application4[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] {
                override def application(context: Context4[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus4WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum5[F[_  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]( using  t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
        )  as  Application5[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
            new Application5[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] {
                override def application(context: Context5[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus5WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum6[F[_  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]( using  t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
        )  as  Application6[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
            new Application6[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] {
                override def application(context: Context6[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus6WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]( using  t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
        )  as  Application7[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
            new Application7[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] {
                override def application(context: Context7[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus7WithTypeParameter0)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum1_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ], H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]( using  t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
        )  as  Application8[F,TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
            new Application8[F, TupleTag1[H1]  , AsunaTuple1[X1_C1]  , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] {
                override def application(context: Context8[F]): F[AsunaTuple1[X1_C1]
                 , AsunaTuple1[X1_C2]  , AsunaTuple1[X1_C3]  , AsunaTuple1[X1_C4]  , AsunaTuple1[X1_C5]  , AsunaTuple1[X1_C6]  , AsunaTuple1[X1_C7]  , AsunaTuple1[X1_C8] ] = {
                    context.append(context.start, t1.application(context))(AsunaTuple1.cachePlus8WithTypeParameter0)
                }
            }
        }
}
