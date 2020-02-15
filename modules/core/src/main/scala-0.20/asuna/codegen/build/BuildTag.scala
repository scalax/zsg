package asuna
object BuildTag {
final def lift[T](erased tag: AppendTag[T]): AppendTag[T] = AppendTag[T]
final inline def tag[T1 ](t1 : AppendTag[T1] ):
AppendTag[TupleTag1[T1 ]] =
AppendTag[TupleTag1[T1 ]]
final inline def nodeTag[T1 <: TupleTag ](t1: AppendTag[T1] ):
AppendTag[NodeTag1[T1 ]] =
AppendTag[NodeTag1[T1 ]]
final inline def tag[T1  , T2 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2] ):
AppendTag[TupleTag2[T1  , T2 ]] =
AppendTag[TupleTag2[T1  , T2 ]]
final inline def nodeTag[T1 <: TupleTag  , T2 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2] ):
AppendTag[NodeTag2[T1  , T2 ]] =
AppendTag[NodeTag2[T1  , T2 ]]
final inline def tag[T1  , T2  , T3 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3] ):
AppendTag[TupleTag3[T1  , T2  , T3 ]] =
AppendTag[TupleTag3[T1  , T2  , T3 ]]
final inline def nodeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3] ):
AppendTag[NodeTag3[T1  , T2  , T3 ]] =
AppendTag[NodeTag3[T1  , T2  , T3 ]]
final inline def tag[T1  , T2  , T3  , T4 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4] ):
AppendTag[TupleTag4[T1  , T2  , T3  , T4 ]] =
AppendTag[TupleTag4[T1  , T2  , T3  , T4 ]]
final inline def nodeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4] ):
AppendTag[NodeTag4[T1  , T2  , T3  , T4 ]] =
AppendTag[NodeTag4[T1  , T2  , T3  , T4 ]]
final inline def tag[T1  , T2  , T3  , T4  , T5 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5] ):
AppendTag[TupleTag5[T1  , T2  , T3  , T4  , T5 ]] =
AppendTag[TupleTag5[T1  , T2  , T3  , T4  , T5 ]]
final inline def nodeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag  , T5 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5] ):
AppendTag[NodeTag5[T1  , T2  , T3  , T4  , T5 ]] =
AppendTag[NodeTag5[T1  , T2  , T3  , T4  , T5 ]]
final inline def tag[T1  , T2  , T3  , T4  , T5  , T6 ](t1 : AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6] ):
AppendTag[TupleTag6[T1  , T2  , T3  , T4  , T5  , T6 ]] =
AppendTag[TupleTag6[T1  , T2  , T3  , T4  , T5  , T6 ]]
final inline def nodeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag  , T5 <: TupleTag  , T6 <: TupleTag ](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6] ):
AppendTag[NodeTag6[T1  , T2  , T3  , T4  , T5  , T6 ]] =
AppendTag[NodeTag6[T1  , T2  , T3  , T4  , T5  , T6 ]]
final inline def mergeTag[T1 <: TupleTag  , T2 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2] )
(given i: Merge2[T1  , T2 , Target]): AppendTag[Target] = AppendTag[Target]
final inline def mergeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3] )
(given i: Merge3[T1  , T2  , T3 , Target]): AppendTag[Target] = AppendTag[Target]
final inline def mergeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4] )
(given i: Merge4[T1  , T2  , T3  , T4 , Target]): AppendTag[Target] = AppendTag[Target]
final inline def mergeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag  , T5 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5] )
(given i: Merge5[T1  , T2  , T3  , T4  , T5 , Target]): AppendTag[Target] = AppendTag[Target]
final inline def mergeTag[T1 <: TupleTag  , T2 <: TupleTag  , T3 <: TupleTag  , T4 <: TupleTag  , T5 <: TupleTag  , T6 <: TupleTag , Target <: TupleTag](t1: AppendTag[T1]  , t2 : AppendTag[T2]  , t3 : AppendTag[T3]  , t4 : AppendTag[T4]  , t5 : AppendTag[T5]  , t6 : AppendTag[T6] )
(given i: Merge6[T1  , T2  , T3  , T4  , T5  , T6 , Target]): AppendTag[Target] = AppendTag[Target]
}
