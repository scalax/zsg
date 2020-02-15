package asuna
object BuildContent {
final inline def tuple1[T1 ](t1: T1 ):
AsunaTuple1[T1 ] =
new AsunaTuple1(t1    )
final inline def tuple2[T1  , T2 ](t1: T1  , t2 : T2 ):
AsunaTuple2[T1  , T2 ] =
new AsunaTuple2(t1  ,   new AsunaTuple1(t2    )  )
final inline def tuple3[T1  , T2  , T3 ](t1: T1  , t2 : T2  , t3 : T3 ):
AsunaTuple3[T1  , T2  , T3 ] =
new AsunaTuple3(t1  ,   new AsunaTuple2(t2  ,   new AsunaTuple1(t3    )  )  )
final inline def tuple4[T1  , T2  , T3  , T4 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4 ):
AsunaTuple4[T1  , T2  , T3  , T4 ] =
new AsunaTuple4(t1  ,   new AsunaTuple3(t2  ,   new AsunaTuple2(t3  ,   new AsunaTuple1(t4    )  )  )  )
final inline def tuple5[T1  , T2  , T3  , T4  , T5 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5 ):
AsunaTuple5[T1  , T2  , T3  , T4  , T5 ] =
new AsunaTuple5(t1  ,   new AsunaTuple4(t2  ,   new AsunaTuple3(t3  ,   new AsunaTuple2(t4  ,   new AsunaTuple1(t5    )  )  )  )  )
final inline def tuple6[T1  , T2  , T3  , T4  , T5  , T6 ](t1: T1  , t2 : T2  , t3 : T3  , t4 : T4  , t5 : T5  , t6 : T6 ):
AsunaTuple6[T1  , T2  , T3  , T4  , T5  , T6 ] =
new AsunaTuple6(t1  ,   new AsunaTuple5(t2  ,   new AsunaTuple4(t3  ,   new AsunaTuple3(t4  ,   new AsunaTuple2(t5  ,   new AsunaTuple1(t6    )  )  )  )  )  )
}
