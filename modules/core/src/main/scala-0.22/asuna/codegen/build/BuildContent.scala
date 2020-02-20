package asuna
object BuildContent {
final inline def tuple1[T1 ](t1: T1 ):
AsunaTuple1[T1 ] =
new AsunaTuple1(t1 )
final inline def tuple2[T1  , T2 ](t1: T1  , t2 : T2 ):
AsunaTuple2[T1  , T2 ] =
new AsunaTuple2(t1  , t2 )
}
