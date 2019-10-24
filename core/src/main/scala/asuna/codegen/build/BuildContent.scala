package asuna
trait BuildContent {
def lift[T](tag : => AppendTag[T]): AppendTag[T] = new AppendTag[T]
def tag[ T1  ]( t1 : AppendTag[T1]  ):
AppendTag[TupleTag1[ T1, `Number： 1`  ]] =
new AppendTag[TupleTag1[ T1, `Number： 1`  ]]
def nodeTag[ T1 <: TupleTag  ]( t1 : AppendTag[T1]  ):
AppendTag[NodeTag1[ T1, `Number： 1`  ]] =
new AppendTag[NodeTag1[ T1, `Number： 1`  ]]
def tuple1[ T1  ]( t1 : T1  ):
AsunaTuple1[ T1  ] =
new AsunaValueTuple1( t1  )
def tag[ T1  ,   T2  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ):
AppendTag[TupleTag2[ T1, `Number： 1`  ,   T2, `Number： 2`  ]] =
new AppendTag[TupleTag2[ T1, `Number： 1`  ,   T2, `Number： 2`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ):
AppendTag[NodeTag2[ T1, `Number： 1`  ,   T2, `Number： 2`  ]] =
new AppendTag[NodeTag2[ T1, `Number： 1`  ,   T2, `Number： 2`  ]]
def tuple2[ T1  ,   T2  ]( t1 : T1  ,   t2 : T2  ):
AsunaTuple2[ T1  ,   T2  ] =
new AsunaValueTuple2( t1  ,   t2  )
def tag[ T1  ,   T2  ,   T3  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ):
AppendTag[TupleTag3[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ]] =
new AppendTag[TupleTag3[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ):
AppendTag[NodeTag3[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ]] =
new AppendTag[NodeTag3[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ]]
def tuple3[ T1  ,   T2  ,   T3  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ):
AsunaTuple3[ T1  ,   T2  ,   T3  ] =
new AsunaValueTuple3( t1  ,   t2  ,   t3  )
def tag[ T1  ,   T2  ,   T3  ,   T4  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ):
AppendTag[TupleTag4[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ]] =
new AppendTag[TupleTag4[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ,   T4 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ):
AppendTag[NodeTag4[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ]] =
new AppendTag[NodeTag4[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ]]
def tuple4[ T1  ,   T2  ,   T3  ,   T4  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ,   t4 : T4  ):
AsunaTuple4[ T1  ,   T2  ,   T3  ,   T4  ] =
new AsunaValueTuple4( t1  ,   t2  ,   t3  ,   t4  )
def tag[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ):
AppendTag[TupleTag5[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ]] =
new AppendTag[TupleTag5[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ,   T4 <: TupleTag  ,   T5 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ):
AppendTag[NodeTag5[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ]] =
new AppendTag[NodeTag5[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ]]
def tuple5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ,   t4 : T4  ,   t5 : T5  ):
AsunaTuple5[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ] =
new AsunaValueTuple5( t1  ,   t2  ,   t3  ,   t4  ,   t5  )
def tag[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ):
AppendTag[TupleTag6[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ]] =
new AppendTag[TupleTag6[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ,   T4 <: TupleTag  ,   T5 <: TupleTag  ,   T6 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ):
AppendTag[NodeTag6[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ]] =
new AppendTag[NodeTag6[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ]]
def tuple6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ,   t4 : T4  ,   t5 : T5  ,   t6 : T6  ):
AsunaTuple6[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ] =
new AsunaValueTuple6( t1  ,   t2  ,   t3  ,   t4  ,   t5  ,   t6  )
def tag[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ,   t7 : AppendTag[T7]  ):
AppendTag[TupleTag7[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ]] =
new AppendTag[TupleTag7[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ,   T4 <: TupleTag  ,   T5 <: TupleTag  ,   T6 <: TupleTag  ,   T7 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ,   t7 : AppendTag[T7]  ):
AppendTag[NodeTag7[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ]] =
new AppendTag[NodeTag7[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ]]
def tuple7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ,   t4 : T4  ,   t5 : T5  ,   t6 : T6  ,   t7 : T7  ):
AsunaTuple7[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ] =
new AsunaValueTuple7( t1  ,   t2  ,   t3  ,   t4  ,   t5  ,   t6  ,   t7  )
def tag[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ,   t7 : AppendTag[T7]  ,   t8 : AppendTag[T8]  ):
AppendTag[TupleTag8[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ,   T8, `Number： 8`  ]] =
new AppendTag[TupleTag8[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ,   T8, `Number： 8`  ]]
def nodeTag[ T1 <: TupleTag  ,   T2 <: TupleTag  ,   T3 <: TupleTag  ,   T4 <: TupleTag  ,   T5 <: TupleTag  ,   T6 <: TupleTag  ,   T7 <: TupleTag  ,   T8 <: TupleTag  ]( t1 : AppendTag[T1]  ,   t2 : AppendTag[T2]  ,   t3 : AppendTag[T3]  ,   t4 : AppendTag[T4]  ,   t5 : AppendTag[T5]  ,   t6 : AppendTag[T6]  ,   t7 : AppendTag[T7]  ,   t8 : AppendTag[T8]  ):
AppendTag[NodeTag8[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ,   T8, `Number： 8`  ]] =
new AppendTag[NodeTag8[ T1, `Number： 1`  ,   T2, `Number： 2`  ,   T3, `Number： 3`  ,   T4, `Number： 4`  ,   T5, `Number： 5`  ,   T6, `Number： 6`  ,   T7, `Number： 7`  ,   T8, `Number： 8`  ]]
def tuple8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ]( t1 : T1  ,   t2 : T2  ,   t3 : T3  ,   t4 : T4  ,   t5 : T5  ,   t6 : T6  ,   t7 : T7  ,   t8 : T8  ):
AsunaTuple8[ T1  ,   T2  ,   T3  ,   T4  ,   T5  ,   T6  ,   T7  ,   T8  ] =
new AsunaValueTuple8( t1  ,   t2  ,   t3  ,   t4  ,   t5  ,   t6  ,   t7  ,   t8  )
}
object BuildContent extends BuildContent
