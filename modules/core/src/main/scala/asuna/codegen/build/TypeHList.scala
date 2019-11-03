package asuna
final class TypeHList1[T1] extends TypeHList {
  override final type H = T1
  override final type T = TypeHNil
}
final class TypeHList2[T1, T2] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList1[T2]
}
final class TypeHList3[T1, T2, T3] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList2[T2, T3]
}
final class TypeHList4[T1, T2, T3, T4] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList3[T2, T3, T4]
}
final class TypeHList5[T1, T2, T3, T4, T5] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList4[T2, T3, T4, T5]
}
final class TypeHList6[T1, T2, T3, T4, T5, T6] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList5[T2, T3, T4, T5, T6]
}
final class TypeHList7[T1, T2, T3, T4, T5, T6, T7] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList6[T2, T3, T4, T5, T6, T7]
}
final class TypeHList8[T1, T2, T3, T4, T5, T6, T7, T8] extends TypeHList {
  override final type H = T1
  override final type T = TypeHList7[T2, T3, T4, T5, T6, T7, T8]
}
