package asuna
object BuildContent {
final def tuple1[T1 ](t1: T1 ):
AsunaTuple1[T1 ] =
new AsunaTuple1(t1    )
final def tuple2[T1  , T2 ](t1: T1  , t2 : T2 ):
AsunaTuple2[T1  , T2 ] =
new AsunaTuple2(t1  ,   new AsunaTuple1(t2    )  )
final def tuple3[T1  , T2  , T3 ](t1: T1  , t2 : T2  , t3 : T3 ):
AsunaTuple3[T1  , T2  , T3 ] =
new AsunaTuple3(t1  ,   new AsunaTuple2(t2  ,   new AsunaTuple1(t3    )  )  )
final def tuple4[T1  , T2  , T3  , T4 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4 ):
AsunaTuple4[T1  , T2  , T3  , T4 ] =
new AsunaTuple4(t1  ,   new AsunaTuple3(t2  ,   new AsunaTuple2(t3  ,   new AsunaTuple1(t4    )  )  )  )
final def tuple5[T1  , T2  , T3  , T4  , T5 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5 ):
AsunaTuple5[T1  , T2  , T3  , T4  , T5 ] =
new AsunaTuple5(t1  ,   new AsunaTuple4(t2  ,   new AsunaTuple3(t3  ,   new AsunaTuple2(t4  ,   new AsunaTuple1(t5    )  )  )  )  )
final def tuple6[T1  , T2  , T3  , T4  , T5  , T6 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6 ):
AsunaTuple6[T1  , T2  , T3  , T4  , T5  , T6 ] =
new AsunaTuple6(t1  ,   new AsunaTuple5(t2  ,   new AsunaTuple4(t3  ,   new AsunaTuple3(t4  ,   new AsunaTuple2(t5  ,   new AsunaTuple1(t6    )  )  )  )  )  )
final def tuple7[T1  , T2  , T3  , T4  , T5  , T6  , T7 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6  , t7 : T7 ):
AsunaTuple7[T1  , T2  , T3  , T4  , T5  , T6  , T7 ] =
new AsunaTuple7(t1  ,   new AsunaTuple6(t2  ,   new AsunaTuple5(t3  ,   new AsunaTuple4(t4  ,   new AsunaTuple3(t5  ,   new AsunaTuple2(t6  ,   new AsunaTuple1(t7    )  )  )  )  )  )  )
final def tuple8[T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6  , t7 : T7  , t8 : T8 ):
AsunaTuple8[T1  , T2  , T3  , T4  , T5  , T6  , T7  , T8 ] =
new AsunaTuple8(t1  ,   new AsunaTuple7(t2  ,   new AsunaTuple6(t3  ,   new AsunaTuple5(t4  ,   new AsunaTuple4(t5  ,   new AsunaTuple3(t6  ,   new AsunaTuple2(t7  ,   new AsunaTuple1(t8    )  )  )  )  )  )  )  )
}
