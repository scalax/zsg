package asuna
final class TupleTag2[T1  , T2 ] extends TupleTag
object TupleTag2 {
import scala.language.higherKinds
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum1[F[_ ], H1, H2  , X1_C1   , X2_C1 ]( using  t1: Application1[F, H1  , X1_C1 ], t2: Application1[F, H2  , X2_C1 ]
        )  as  Application1[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ] = {
            new Application1[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1] ] {
                override def application(context: Context1[F]): F[AsunaTuple2[X1_C1, X2_C1]
                ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus1WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum2[F[_  , _ ], H1, H2  , X1_C1  , X1_C2   , X2_C1  , X2_C2 ]( using  t1: Application2[F, H1  , X1_C1  , X1_C2 ], t2: Application2[F, H2  , X2_C1  , X2_C2 ]
        )  as  Application2[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ] = {
            new Application2[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2] ] {
                override def application(context: Context2[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus2WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum3[F[_  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3   , X2_C1  , X2_C2  , X2_C3 ]( using  t1: Application3[F, H1  , X1_C1  , X1_C2  , X1_C3 ], t2: Application3[F, H2  , X2_C1  , X2_C2  , X2_C3 ]
        )  as  Application3[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] = {
            new Application3[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] {
                override def application(context: Context3[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus3WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum4[F[_  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4   , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]( using  t1: Application4[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ], t2: Application4[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ]
        )  as  Application4[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] = {
            new Application4[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] {
                override def application(context: Context4[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus4WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum5[F[_  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]( using  t1: Application5[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ], t2: Application5[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ]
        )  as  Application5[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] = {
            new Application5[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] {
                override def application(context: Context5[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus5WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum6[F[_  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]( using  t1: Application6[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ], t2: Application6[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ]
        )  as  Application6[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] = {
            new Application6[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] {
                override def application(context: Context6[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus6WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum7[F[_  , _  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]( using  t1: Application7[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ], t2: Application7[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ]
        )  as  Application7[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] = {
            new Application7[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] {
                override def application(context: Context7[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus7WithTypeParameter1)
                }
            }
        }
        final  given  tupleTagApplicationImplicit_tagNum2_typeParamNum8[F[_  , _  , _  , _  , _  , _  , _  , _ ], H1, H2  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8   , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]( using  t1: Application8[F, H1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ], t2: Application8[F, H2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ]
        )  as  Application8[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] = {
            new Application8[F, TupleTag2[H1, H2]  , AsunaTuple2[X1_C1, X2_C1]  , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] {
                override def application(context: Context8[F]): F[AsunaTuple2[X1_C1, X2_C1]
                 , AsunaTuple2[X1_C2, X2_C2]  , AsunaTuple2[X1_C3, X2_C3]  , AsunaTuple2[X1_C4, X2_C4]  , AsunaTuple2[X1_C5, X2_C5]  , AsunaTuple2[X1_C6, X2_C6]  , AsunaTuple2[X1_C7, X2_C7]  , AsunaTuple2[X1_C8, X2_C8] ] = {
                    context.append(t2.application(context), t1.application(context))(AsunaTuple2.cachePlus8WithTypeParameter1)
                }
            }
        }
}
