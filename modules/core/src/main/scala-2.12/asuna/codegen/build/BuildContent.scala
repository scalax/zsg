package asuna
object BuildContent {
final def tuple1[T1 ](t1: T1 ):
AsunaTuple1[T1 ] =
new AsunaTuple1(i1 = t1 )
final def tuple2[T1  , T2 ](t1: T1  , t2 : T2 ):
AsunaTuple2[T1  , T2 ] =
new AsunaTuple2(i1 = t1  , i2 = t2 )
final def tuple3[T1  , T2  , T3 ](t1: T1  , t2 : T2  , t3 : T3 ):
AsunaTuple3[T1  , T2  , T3 ] =
new AsunaTuple3(i1 = t1  , i2 = t2  , i3 = t3 )
}
