package org.scalax.asuna.mapper
class TypeParameter1[T1] extends TypeParameter {
  override type H = T1
  override type T = EndParameter
}
class TypeParameter2[T1, T2] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter1[T2]
}
class TypeParameter3[T1, T2, T3] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter2[T2, T3]
}
class TypeParameter4[T1, T2, T3, T4] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter3[T2, T3, T4]
}
class TypeParameter5[T1, T2, T3, T4, T5] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter4[T2, T3, T4, T5]
}
class TypeParameter6[T1, T2, T3, T4, T5, T6] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter5[T2, T3, T4, T5, T6]
}
class TypeParameter7[T1, T2, T3, T4, T5, T6, T7] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter6[T2, T3, T4, T5, T6, T7]
}
class TypeParameter8[T1, T2, T3, T4, T5, T6, T7, T8] extends TypeParameter {
  override type H = T1
  override type T = TypeParameter7[T2, T3, T4, T5, T6, T7, T8]
}
