package asuna
object BuildContent {
  final def tuple1[T1](t1: T1): AsunaTuple1[T1] =
    new AsunaTuple1(i1 = t1)
  final def tuple2[T1, T2](t1: T1, t2: T2): AsunaTuple2[T1, T2] =
    new AsunaTuple2(i1 = t1, i2 = t2)
  final def tuple3[T1, T2, T3](t1: T1, t2: T2, t3: T3): AsunaTuple3[T1, T2, T3] =
    new AsunaTuple3(i1 = t1, i2 = t2, i3 = t3)
  final def tuple4[T1, T2, T3, T4](t1: T1, t2: T2, t3: T3, t4: T4): AsunaTuple4[T1, T2, T3, T4] =
    new AsunaTuple4(i1 = t1, i2 = t2, i3 = t3, i4 = t4)
  final def tuple5[T1, T2, T3, T4, T5](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): AsunaTuple5[T1, T2, T3, T4, T5] =
    new AsunaTuple5(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5)
  final def tuple6[T1, T2, T3, T4, T5, T6](t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): AsunaTuple6[T1, T2, T3, T4, T5, T6] =
    new AsunaTuple6(i1 = t1, i2 = t2, i3 = t3, i4 = t4, i5 = t5, i6 = t6)
}
