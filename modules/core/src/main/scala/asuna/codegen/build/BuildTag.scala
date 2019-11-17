package asuna
final object BuildTag {
  final def lift[T](tag: => AppendTag[T]): AppendTag[T] = AppendTag[T]
  final def tag[T1](t1: AppendTag[T1]): AppendTag[TupleTag1[T1]] =
    new AppendTag[TupleTag1[T1]]
  final def nodeTag[T1 <: TupleTag](t1: AppendTag[T1]): AppendTag[NodeTag1[T1]] =
    new AppendTag[NodeTag1[T1]]
  final def tag[T1, T2](t1: AppendTag[T1], t2: AppendTag[T2]): AppendTag[TupleTag2[T1, T2]] =
    new AppendTag[TupleTag2[T1, T2]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag](t1: AppendTag[T1], t2: AppendTag[T2]): AppendTag[NodeTag2[T1, T2]] =
    new AppendTag[NodeTag2[T1, T2]]
  final def tag[T1, T2, T3](t1: AppendTag[T1], t2: AppendTag[T2], t3: AppendTag[T3]): AppendTag[TupleTag3[T1, T2, T3]] =
    new AppendTag[TupleTag3[T1, T2, T3]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag](t1: AppendTag[T1], t2: AppendTag[T2], t3: AppendTag[T3]): AppendTag[NodeTag3[T1, T2, T3]] =
    new AppendTag[NodeTag3[T1, T2, T3]]
  final def tag[T1, T2, T3, T4](t1: AppendTag[T1], t2: AppendTag[T2], t3: AppendTag[T3], t4: AppendTag[T4]): AppendTag[TupleTag4[T1, T2, T3, T4]] =
    new AppendTag[TupleTag4[T1, T2, T3, T4]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4]
  ): AppendTag[NodeTag4[T1, T2, T3, T4]] =
    new AppendTag[NodeTag4[T1, T2, T3, T4]]
  final def tag[T1, T2, T3, T4, T5](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5]
  ): AppendTag[TupleTag5[T1, T2, T3, T4, T5]] =
    new AppendTag[TupleTag5[T1, T2, T3, T4, T5]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5]
  ): AppendTag[NodeTag5[T1, T2, T3, T4, T5]] =
    new AppendTag[NodeTag5[T1, T2, T3, T4, T5]]
  final def tag[T1, T2, T3, T4, T5, T6](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6]
  ): AppendTag[TupleTag6[T1, T2, T3, T4, T5, T6]] =
    new AppendTag[TupleTag6[T1, T2, T3, T4, T5, T6]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6]
  ): AppendTag[NodeTag6[T1, T2, T3, T4, T5, T6]] =
    new AppendTag[NodeTag6[T1, T2, T3, T4, T5, T6]]
  final def tag[T1, T2, T3, T4, T5, T6, T7](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7]
  ): AppendTag[TupleTag7[T1, T2, T3, T4, T5, T6, T7]] =
    new AppendTag[TupleTag7[T1, T2, T3, T4, T5, T6, T7]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7]
  ): AppendTag[NodeTag7[T1, T2, T3, T4, T5, T6, T7]] =
    new AppendTag[NodeTag7[T1, T2, T3, T4, T5, T6, T7]]
  final def tag[T1, T2, T3, T4, T5, T6, T7, T8](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7],
    t8: AppendTag[T8]
  ): AppendTag[TupleTag8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new AppendTag[TupleTag8[T1, T2, T3, T4, T5, T6, T7, T8]]
  final def nodeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag, T8 <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7],
    t8: AppendTag[T8]
  ): AppendTag[NodeTag8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new AppendTag[NodeTag8[T1, T2, T3, T4, T5, T6, T7, T8]]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, Target <: TupleTag](t1: AppendTag[T1], t2: AppendTag[T2])(implicit i: Merge2[T1, T2, Target]): AppendTag[Target] =
    new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, Target <: TupleTag](t1: AppendTag[T1], t2: AppendTag[T2], t3: AppendTag[T3])(
    implicit i: Merge3[T1, T2, T3, Target]
  ): AppendTag[Target] = new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, Target <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4]
  )(implicit i: Merge4[T1, T2, T3, T4, Target]): AppendTag[Target] = new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, Target <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5]
  )(implicit i: Merge5[T1, T2, T3, T4, T5, Target]): AppendTag[Target] = new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, Target <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6]
  )(implicit i: Merge6[T1, T2, T3, T4, T5, T6, Target]): AppendTag[Target] = new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag, Target <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7]
  )(implicit i: Merge7[T1, T2, T3, T4, T5, T6, T7, Target]): AppendTag[Target] = new AppendTag[Target]
  final def mergeTag[T1 <: TupleTag, T2 <: TupleTag, T3 <: TupleTag, T4 <: TupleTag, T5 <: TupleTag, T6 <: TupleTag, T7 <: TupleTag, T8 <: TupleTag, Target <: TupleTag](
    t1: AppendTag[T1],
    t2: AppendTag[T2],
    t3: AppendTag[T3],
    t4: AppendTag[T4],
    t5: AppendTag[T5],
    t6: AppendTag[T6],
    t7: AppendTag[T7],
    t8: AppendTag[T8]
  )(implicit i: Merge8[T1, T2, T3, T4, T5, T6, T7, T8, Target]): AppendTag[Target] = new AppendTag[Target]
}
