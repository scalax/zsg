package asuna
object BuildContent {
final def tuple1[T1 ](t1: T1 ): ZsgTuple1[T1 ] =
new ZsgTuple1(i1 = t1 )
final def nodeTuple1[T1 <: TupleTag ](t1: T1 ): NodeTuple1[T1 ] =
new NodeTuple1(i1 = t1 )
final def tuple2[T1  , T2 ](t1: T1  , t2 : T2 ): ZsgTuple2[T1  , T2 ] =
new ZsgTuple2(i1 = t1  , i2 = t2 )
final def nodeTuple2[T1 <: TupleTag  , T2 <: TupleTag ](t1: T1  , t2 : T2 ): NodeTuple2[T1  , T2 ] =
new NodeTuple2(i1 = t1  , i2 = t2 )
}
